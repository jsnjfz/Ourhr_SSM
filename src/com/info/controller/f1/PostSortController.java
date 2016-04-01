package com.info.controller.f1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.entity.PageBean;
import com.info.entity.PostSort;
import com.info.service.f1.PostSortService;
import com.info.util.DateJsonValueProcessor;
import com.info.util.ResponseUtil;
import com.info.util.StringUtil;

@Controller
@RequestMapping(value = "/f1")
public class PostSortController
{
    @Resource(name = "PostSortService")
    private PostSortService postSortService;


    // springMVC处理前台form中的date类型的参数
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    //显示合同订单页面
    @RequestMapping(value = "/SalesOrderList")
    public ModelAndView Sales_Order_List() throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sales/sales_Order_List");
        return mv;
    }

    /**
     * 
     * 查询岗位分类信息
     * @param page
     * @param rows
     * @param s_customer
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/listPostSort")
    public void listSalesOrder(@RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows, PostSort postSort,
            HttpServletResponse response) throws Exception
    {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("postname", StringUtil.formatLike(postSort.getPostsortname()));
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<PostSort> postSortList = postSortService.listPostSort(map);

        // 时间格式转换
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray = JSONArray.fromObject(postSortList, jsonConfig);
        int total = postSortService.iTotalPostSort(map);
        JSONObject result = new JSONObject();
        result.put("rows", jsonArray);
        result.put("total", total);
        ResponseUtil.write(response, result);
    }
    
    //删除岗位分类信息
	@RequestMapping("/deletePostSort")
	public String deletePostSort(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		JSONObject result=new JSONObject();
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			postSortService.deletePostSort(Integer.parseInt(idsStr[i]));
		}
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}

    /*
    // 查询合同还款信息
    @RequestMapping("/listsalesOrderRepayment")
    public void listsalesOrderRepayment(int orderid, HttpServletResponse response) throws Exception
    {
        List<SalesOrderRepayment> salesOrderRepayment = salesOrderRepaymentService
                .listSalesOrderRepaymentByOrderId(orderid);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray = JSONArray.fromObject(salesOrderRepayment, jsonConfig);
        JSONObject result = new JSONObject();
        result.put("rows", jsonArray);
        ResponseUtil.write(response, result);
    }

    // 合同状态下拉框
    @RequestMapping("/orderStatusComboList")
    public void orderStatusComboList(HttpServletResponse response) throws Exception
    {
        List<HashMap<String, String>> orderStatus = salesOrderService.getOrderStatus();
        JSONArray jsonArray = JSONArray.fromObject(orderStatus);
        ResponseUtil.write(response, jsonArray);
    }

    // 产品下拉框
    @RequestMapping("/productComboList")
    public void productComboList(HttpServletResponse response) throws Exception
    {
        List<HashMap<String, String>> productList = salesOrderService.getProductList();
        JSONArray jsonArray = JSONArray.fromObject(productList);
        ResponseUtil.write(response, jsonArray);
    }

    // 支付方式下拉框
    @RequestMapping("/loanTypeComboList")
    public void loanTypeComboList(HttpServletResponse response) throws Exception
    {
        List<HashMap<String, String>> loanType = salesOrderService.getLoanType();
        JSONArray jsonArray = JSONArray.fromObject(loanType);
        ResponseUtil.write(response, jsonArray);
    }

    // 去合同信息画面，根据id查询合同信息及合同还款信息
    @RequestMapping(value = "/goSalesOrderInfo")
    public ModelAndView goSalesOrderInfo(int id) throws Exception
    {
        SalesOrderList salesOrderList = salesOrderService.selectOrderById(id);
        List<SalesOrderRepayment> salesOrderRepayment = salesOrderRepaymentService.listSalesOrderRepaymentByOrderId(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/salesOrderDetail");
        mv.addObject("salesOrderList", salesOrderList);
        mv.addObject("salesOrderRepayment", salesOrderRepayment);
        return mv;
    }

    // 合同维护画面(id=0为新增，其他为修改)
    @RequestMapping(value = "/goSalesOrderEdit")
    public ModelAndView goSalesOrderEdit(int id) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/salesOrderEdit");
        if (id != 0)
        {
            SalesOrderList salesOrderList = salesOrderService.selectOrderById(id);
            mv.addObject("salesOrderList", salesOrderList);
        }
        return mv;
    }

    // 新增合同信息
    @RequestMapping(value = "/saveSalesOrder")
    public ModelAndView saveSalesOrder(SalesOrderList salesOrderList, HttpServletResponse response) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        SalesOrderProduct salesOrderProduct = new SalesOrderProduct();
        int resultOrderTotal = 0;
        int resultProductTotal = 0;

        // 如果传入参数id为空，则为新增，否则则为修改
        if (salesOrderList.getId() == null)
        {
            // 新增合同主表信息
            salesOrderList.setCreatedate(new Date());
            resultOrderTotal = salesOrderService.insertSalesOrder(salesOrderList);

            // 为合同产品表赋值
            salesOrderProduct.setOrderid(salesOrderList.getId());
            salesOrderProduct.setProductid(salesOrderList.getProductid());
            salesOrderProduct.setAmount(1.00);
            salesOrderProduct.setProjectid(0);
            salesOrderProduct.setSalesprice(salesOrderList.getOrderprice());
            salesOrderProduct.setPrice(salesOrderList.getOrderprice());

            // 新增合同产品列表信息
            resultProductTotal = salesOrderProductService.insertSalesOrderProduct(salesOrderProduct);
        }
        else
        {
            // 修改合同主表信息
            resultOrderTotal = salesOrderService.updateSalesOrder(salesOrderList);
        }
        JSONObject result = new JSONObject();
        if (resultOrderTotal > 0 && resultProductTotal > 0)
        {
            result.put("success", true);
        }
        else
        {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        return null;
    }
    */
}
