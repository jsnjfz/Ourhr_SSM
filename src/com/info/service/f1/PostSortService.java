package com.info.service.f1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.info.dao.DaoSupport;
import com.info.entity.PostSort;

@Service("PostSortService")
public class PostSortService
{
    @Resource(name = "daoSupport")
    private DaoSupport dao;

    // 查询岗位分类列表
    public List<PostSort> listPostSort(Map<String, Object> map)
    {
        return (List<PostSort>) dao.findForList("PostSortMapper.listPostSort", map);
    }
    
    // 新增岗位分类信息
    public int insertPostSort(PostSort postSort) throws Exception
    {
        return (int) dao.save("PostSortMapper.insertSalesOrder", postSort);
    }

    // 修改岗位分类信息
    public int updatePostSort(PostSort postSort) throws Exception
    {
        return (int) dao.save("SalesOrderListMapper.updateSalesOrder", postSort);
    }
    
    //删除岗位分类信息
    public int deletePostSort(int postsortid) throws Exception
    {
        return (int) dao.delete("PostSortMapper.deletePostSort", postsortid);
    }

    // 保存岗位分类
    public void savePostSort(HashMap map) throws Exception
    {
        dao.save("PostSortMapper.savePostSort", map);
    }

    // 查询合同状态下拉框
    public List<HashMap<String, String>> getProductList()
    {
        return (List<HashMap<String, String>>) dao.findForList("SalesOrderListMapper.getProductList", null);
    }
//    // 通过id获取数据
//    public SalesOrderList selectOrderById(int id) throws Exception
//    {
//        return (SalesOrderList) dao.findForObject("SalesOrderListMapper.selectOrderById", id);
//    }

    // 查询岗位分类总记录信息
    public int iTotalPostSort(Map<String, Object> map)
    {
        return (int) dao.findForObject("PostSortMapper.iTotalPostSort", map);
    }

}
