<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>人 员 列 表</title>
    
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
		.mainDiv{width:90%;margin:0 auto;}
		.buttonDiv{width:100%;margin:10px 20px;text-align:center;}
		.leftDiv{float: left;width:30%;}
		.rightDiv{float: left;width:70%;}
		
	</style>

	<script type="text/javascript">
 	$(document).ready(function () {
	 	jQuery("#clearButton").bind("click",function(){
	 		$("#hrmUser", window.top.document).val('');
	 		window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
	 	});
	 	jQuery("#closeButton").bind("click",function(){
	 		window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
	 	});
	 	
 		var datas = [];
		$.ajax({
			url:'<%=path%>/getDepartmentsToTreeNode',
			data:null,
			type:'GET',
			dataType:"json",
			success:function(json){
				//alert(JSON.stringify(json));
				if(json.code>0){
					layer.alert('获取JSON数据失败!', {icon: 5});
				}else{
					if(json.count>0){
						datas = json.data;
						//alert(json);
						layui.use(['tree', 'util'], function(){
						  var tree = layui.tree
						  ,layer = layui.layer
						  ,util = layui.util
						 ,data2 = datas
						 
						  tree.render({
						    elem: '#departmentTree'
						    ,data: data2
						    ,click: function(obj){
						      var data = obj.data;
						      //layer.msg(JSON.stringify(data.id));
						      showTableList(data.id)
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
  	
	function showTableList(deptId){
 		var datas = [];
		$.ajax({
			url:'<%=path%>/getUserByDeptIdToList/'+deptId,
			data:null,
			type:'GET',
			dataType:"json",
			success:function(json){
				//alert(JSON.stringify(json));
				if(json.code>0){
					layer.alert('获取JSON数据失败!', {icon: 5});
				}else{
					if(json.count>0){				
						datas = json.data;		
						layui.use('table', function(){
						  var table = layui.table;
						  table.render({
						    elem: '#listTable'
						    ,title: '人员信息表'
						    ,totalRow: false
						    ,cellMinWidth:300
						    ,cols: [[
								{field:'userName', title: '姓名'}//,style:'background-color: #5FB878; color: #fff;'
						    ]]
						    ,data: datas
						    ,page: true
						    ,limit: 5
						    ,limits: [5, 10,15]
						  });//table.rende
						  
						  table.on('row(listTable)', function(obj){
						    var data = obj.data;
						    //layer.alert(JSON.stringify(data), {
						    //  title: '当前行数据：'
						    //});
						    obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
						    $("#hrmUser", window.top.document).val(data.userName);
						    window.parent.layer.closeAll(parent.layer.getFrameIndex(parent.window.name));
						  });
						});//layui.use
					}else{
						layer.alert('没有相关数据!', {icon: 5});
					}//if(json.count>0)
				}//if(json.code>0)
			}//success:function
		});//ajax
	}//function
	</script>
  </head>
  
  <body>
	<!--
	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
	  <legend>部 门 列 表</legend>
	</fieldset>
	-->
	
	<div class="buttonDiv">
		<button type="button" id="clearButton" class="layui-btn layui-btn-primary">清除</button>
		<button type="button" id="closeButton" class="layui-btn layui-btn-primary">关闭</button>
	</div>
	<hr class="layui-bg-gray">
	<div class="leftDiv">
		<div id="departmentTree" class="demo-tree demo-tree-box"></div>
	</div>
	<div class="rightDiv">
		<table class="layui-hide" id="listTable" lay-filter="listTable"></table>
		<script src="public/js/layui-v2.5.5/layui.js" charset="utf-8"></script>
	</div>
	

  </body>
</html>
