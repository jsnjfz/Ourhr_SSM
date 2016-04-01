<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">

	//查询
	function search(){
	    $("#dg").datagrid('load',{
	        "name":$("#s_name").val()
	    });
	}
	
	var editIndex = undefined;
	function endEditing(){
		if (editIndex == undefined){return true}
		if ($('#dg').datagrid('validateRow', editIndex)){
			var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});
			var productname = $(ed.target).combobox('getText');
			$('#dg').datagrid('getRows')[editIndex]['productname'] = productname;
			$('#dg').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}

	//删除岗位分类信息
    function deletePostSort(){
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length==0){
            $.messager.alert("系统提示","请选择要删除的数据！");
            return;
        }
        var strIds=[];
        for(var i=0;i<selectedRows.length;i++){
            strIds.push(selectedRows[i].postsortid);
        }
        alert(strIds);
        var ids=strIds.join(",");
        $.messager.confirm("系统提示","确认要删除这<font color=red>"+selectedRows.length+"</font>条数据吗？",function(r){
            if(r){
                $.post("${pageContext.request.contextPath}/f1/deletePostSort.do",{ids:ids},function(result){
                    if(result.success){
                        $.messager.alert("系统提示","数据已成功删除！");
                        $("#dg").datagrid("reload");
                    }else{
                        $.messager.alert("系统提示","数据删除失败！");
                    }
                },"json");
            }
        });      
    }
    
    //新增合同
    function addOrder(){
        url = "${pageContext.request.contextPath}/Sales/goSalesOrderEdit.do?id=0";  
        window.open(url,"_blank","height=600px","width=600px","location=no")
    }      
    
    //grid内新增
	function append(){
		if (endEditing()){
			$('#dg').datagrid('appendRow',{status:'P'});
			editIndex = $('#dg').datagrid('getRows').length-1;
			$('#dg').datagrid('selectRow', editIndex)
					.datagrid('beginEdit', editIndex);
		}
	}
    
    //grid内保存
	function accept(){
		var rows = $('#dg').datagrid('getChanges');
		//if (endEditing()){
		//	$('#dg').datagrid('acceptChanges');
		//}
	}
    
    function openCustomerLinkMan(){
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length!=1){
            $.messager.alert("系统提示","请选择一条要管理的数据！");
            return;
        }
        window.parent.openTab('客户联系人管理','linkManManage.jsp?cusId='+selectedRows[0].id,'icon-lxr');
    }
    
    
    function openCustomerContact(){
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length!=1){
            $.messager.alert("系统提示","请选择一条要管理的数据！");
            return;
        }
        window.parent.openTab('客户交往记录管理','contactManage.jsp?cusId='+selectedRows[0].id,'icon-lsdd');
    }   
    
    //操作链接格式
    function formatOper(val,row,index){  
        return '<a href="#" onclick="editOrder('+index+')">编辑</a>  |  <a href="#" onclick="renewOrder('+index+')">续签</a>';  
    }  
    
    //合同明细信息
    function detailOrder(index){  
        $('#dg').datagrid('selectRow',index);  
        var row = $('#dg').datagrid('getSelected');  
        if (row){            
            url = "${pageContext.request.contextPath}/Sales/goSalesOrderInfo.do?id="+row.id;  
            alert(url);
            window.open(url,"_blank","height=600px","width=600px","location=no")
        }  
    } 
    
    
    //合同编号链接格式
    function formatTitle(val,row,index){
    	return '<a href="#" onclick="detailOrder('+index+')">'+row.title+'</a>';  
    } 
    

</script>
</head>
<body style="margin:1px;">
    <table id="dg" title="岗位分类管理" class="easyui-datagrid"
      pagination="true" rownumbers="true"  fit="true"
      url="${pageContext.request.contextPath}/f1/listPostSort.do"  toolbar="#tb">
         <thead data-options="frozen:true "  >
                <tr>
                    <th field="cb" checkbox="true" align="center"></th>
                    <th field="postsortid" width="50" align="center" hidden="true">编号</th>
                    <th field="postsortcode" width="150" align="center"  formatter="formatTitle" >岗位分类代码</th>
                    <th field="postsortname" width="100" align="center">岗位分类名称</th>
                    <th field="level" width="100" align="center">层次</th>
                    <th field="aliveflag" width="100" align="center" >有效标志</th>
                    <!-- <th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}"  checkbox="true"></th> -->
                    <th field="reccretm" width="100" align="center">创建时间</th>
                    <!-- <th field="_operate" width="100" align="center" formatter="formatOper">操作</th>  -->                   
                </tr>
            </thead>
    </table>
    <div id="tb">
        <!--  <div>
            <a href="javascript:addOrder()" class="easyui-linkbutton" iconCls="icon-add" plain="true">新增岗位分类</a>
            <a href="javascript:openCustomerModifyDialog()" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a>
            <a href="javascript:deleteCustomer()" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
        </div>  -->
        
       <div id="tb" style="height:auto">
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">新增</a>
			<a href="javascript:deletePostSort()" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
			<!--<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">Reject</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">GetChanges</a>-->
	   </div>
	
        <div>
            &nbsp;岗位分类名称：&nbsp;<input type="text" id="s_name" size="20" onkeydown="if(event.keyCode==13) searchCustomer()"/>&nbsp;
            <a href="javascript:search()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
        </div>
    </div>
    
    <div id="dlg-buttons">
        <a href="javascript:saveCustomer()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
        <a href="javascript:closeCustomerDialog()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
    </div>
    


</body>
</html>