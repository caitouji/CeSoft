<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>费 用 科 目 列 表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<link rel="stylesheet" href="public/js/layui-v2.5.5/css/layui.css"  media="all">
	<script src="public/js/layui-v2.5.5/layui.js"  charset="utf-8"></script>
	<style>
		*{margin:0px;padding:0px;}
		.buttonDiv{width:100%;margin:10px 20px;text-align:center;}
	</style>
	
	<script type="text/javascript">
 	$(document).ready(function () {
	 	jQuery("#clearButton").bind("click",function(){
	 		$("#code", window.top.document).val('');
	 		$("#s1", window.top.document).val('');
	 		$("#s2", window.top.document).val('');
	 		$("#s3", window.top.document).val('');
	 		$("#s4", window.top.document).val('');
	 		
	 		window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
	 	});
	 	jQuery("#closeButton").bind("click",function(){
	 		window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
	 	});
	 	var jstr = $("#accJson", window.top.document).val();;
	 	//var accJson = {6602: "管理费用", 6601: 6601};
	 	var accJson = eval('(' + jstr + ')')//JSON.parse(jstr);
	 	//alert(JSON.stringify(accJson));
 		var datas = [];
		$.ajax({
			url:'/QinZeExpands/web/service/GetAccountMenuServ',
			data:{
				accJson:JSON.stringify(accJson),
			},
			type:'POST',
			dataType:"json",
			success:function(json){
				if(json.code>0){
					layer.alert('获取JSON数据失败!', {icon: 5});
				}else{
					if(json.count>0){
						datas = json.data;
						layui.use(['tree', 'util'], function(){
						  var tree = layui.tree
						  ,layer = layui.layer
						  ,util = layui.util
						 ,data2 = datas
						 
						  tree.render({
						    elem: '#accountTree'
						    ,data: data2
						    ,click: function(obj){
						      var data = obj.data;
						      layer.msg(JSON.stringify(data.id));
						      //alert(JSON.stringify(data.id))
						      //$("#code", window.top.document).val(data.id);
						      parent.setCode(data.id,data.field);
						      window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
						    }
						  });// tree.render
						});//layui.use
					}else{
						layer.alert('没有相关数据!', {icon: 5});
					}//if(json.count>0)
				}//if(json.code>0)
			}//success:function
 			,error : function(e){
                //alert(JSON.stringify(e));
            }
			
		});//ajax
 	
 	//alert()
  	});//document ready
	</script>
  </head>
  
  <body>
  <!--
	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
	  <legend>费 用 科 目 列 表</legend>
	</fieldset>
	-->
	<div class="buttonDiv">
		<button type="button" id="clearButton" class="layui-btn layui-btn-primary">清除</button>
		<button type="button" id="closeButton" class="layui-btn layui-btn-primary">关闭</button>
	</div>
	<hr class="layui-bg-gray">
	<div id="accountTree" class="demo-tree demo-tree-box"></div>
  </body>
</html>
