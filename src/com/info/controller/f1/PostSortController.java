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
import org.springframework.stereotype.Component;
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

@Component("f1")
//@RequestMapping(value = "/f1")
public class PostSortController
{
    @Resource(name = "PostSortService")
    private PostSortService postSortService;
    
    public String test()
    {
    	//System.out.println("test!!");
    	return "test";
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
    //@RequestMapping("/listPostSort")
//    public void listSalesOrder(@RequestParam(value = "page", required = false) String page,
//            @RequestParam(value = "rows", required = false) String rows, PostSort postSort,
//            HttpServletResponse response) throws Exception
//    {
//        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("postname", StringUtil.formatLike(postSort.getPostsortname()));
//        map.put("start", pageBean.getStart());
//        map.put("size", pageBean.getPageSize());
//        List<PostSort> postSortList = postSortService.listPostSort(map);
//
//        // 时间格式转换
//        JsonConfig jsonConfig = new JsonConfig();
//        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
//        JSONArray jsonArray = JSONArray.fromObject(postSortList, jsonConfig);
//        int total = postSortService.iTotalPostSort(map);
//        JSONObject result = new JSONObject();
//        result.put("rows", jsonArray);
//        result.put("total", total);
//        ResponseUtil.write(response, result);
//    }
    
    //删除岗位分类信息
	//@RequestMapping("/deletePostSort")
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

}
