<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同信息</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">
    
	$(function() {
		$('#loantype').combobox(
						{
							onChange : function(newValue, oldValue) {
								if (newValue == "1") {
									document.getElementById("divParent").style.display = "none";
								} else {
									document.getElementById("divParent").style.display = "";
								}
							}
						});
	      $('#idprofit').combobox(
                  {
                      onChange : function(newValue, oldValue) {
                    	  var str = newValue.split(",");
                    	  $("#profit").val(str[1]);
                      }
                  });
		   });

	function saveSalesOrder() {
		$("#fm").form("submit", {
			url : "${pageContext.request.contextPath}/Sales/saveSalesOrder.do",
			onSubmit : function() {
				/*if($("#area").combobox("getValue")==""){
				    $.messager.alert("系统提示","请选择客户地区");
				    return false;
				}
				if($("#cusManager").combobox("getValue")==""){
				    $.messager.alert("系统提示","请选择客户经理");
				    return false;
				}
				if($("#level").combobox("getValue")==""){
				    $.messager.alert("系统提示","请选择客户的等级");
				    return false;
				}
				if($("#myd").combobox("getValue")==""){
				    $.messager.alert("系统提示","请选择客户满意度");
				    return false;
				}
				if($("#xyd").combobox("getValue")==""){
				    $.messager.alert("系统提示","请选择客户信用度");
				    return false;
				}*/
				return $(this).form("validate");
			},
			success : function(result) {

				var result = eval('(' + result + ')');

				if (result.success) {
					$.messager.alert("系统提示", "保存成功");
					window.close();
					window.opener && window.opener.location.reload();
				} else {
					$.messager.alert("系统提示", "保存失败");
					return;
				}
			}
		});
	}

	function closeDialog() {
		window.close();
		//window.opener && window.opener.location.reload();
	}
</script>
</head>
<body style="margin: 15px;">
	<div id="p" class="easyui-panel" title="合同信息"
		style="width: 700px; height: 460px; padding: 10px;">
		<form id="fm" method="post">
			<table cellspacing="8px">
				<tr>
					<td><font face="wingdings" color="red">v</font>客户名称：</td>
					<td><input type="hidden" id="id" name="id" /><input
						type="text" id="title" name="title"   value="${salesOrderList.title}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>性别：</td>
					<td colspan="5"><input type="text" id="customerid" 
						name="customerid" style="width: 503px" value="${salesOrderList.customerid}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>客户手机：</td>
					<td colspan="5"><input type="text" id="bank" name="bank"
						style="width: 503px" value="${salesOrderList.bank}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>客户邮箱：</td>
					<td colspan="5"><input type="text" id="bankcode"
						name="bankcode" style="width: 503px" value="${salesOrderList.bankcode}" /></td>
				</tr>
				<tr>
                    <td><font face="wingdings" color="red">v</font>证件类型：</td>
                    <td colspan="5"><input type="text" id="bankcode"
                        name="bankcode" style="width: 503px" value="${salesOrderList.bankcode}" /></td>
                </tr>

			</table>

			<!--<table cellspacing="8px">
			<tr>
				<td>合同详情：</td>
				<td><input type="hidden" id="id" name="id" /><input
					type="text" id="title" name="title" /></td>
			</tr>
			<tr>
				<td>上传文件：</td>
				<td colspan="5"><input type="text" id="customername"
					name="customername" style="width: 503px" /></td>
			</tr>
			<tr>
				<td>共享给：</td>
				<td colspan="5"><input type="text" id="customername"
					name="customername" style="width: 503px" /></td>
			</tr> -->
			</table>
			<!--  </div>-->
		</form>
	</div>

	<div id="dlg-buttons">
		<a href="javascript:saveSalesOrder()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>

</body>
</html>