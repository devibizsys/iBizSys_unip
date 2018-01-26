<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.VCPage" />
<%@include file="utilheader.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<%@include file="../lib/lib-common-style.jsp"%>
<%@include file="../lib/lib-user-style.jsp"%>
<link href="https://cdn.bootcss.com/jquery-treegrid/0.2.0/css/jquery.treegrid.min.css" rel="stylesheet">
<style type="text/css">
.ibiz-pickupview-action {
 	position: fixed;
	bottom: 10px;
	right: 10px;
}

span {
    float: left;
}
.defield-cond{
	width:150px; 
	height: 34px; 
	margin-top: 3px; 
	margin-left: 5px;
	float: left;
}
.group-cond{
	 width:150px; 
	 height: 34px; 
	 margin-top: 3px; 
	 margin-left: 5px; 
	 float: left;
}
.cond-op{
	 width:100px; 
	 height: 34px; 
	 margin-top: 3px; 
	 margin-left: 5px;
}
.cond-value{
	width:205px; 
	height: 34px; 
	margin-top: 3px; 
	margin-left: 5px;
}
.input-button{
	width:100px; 
	height: 30px; 
	margin-left: 5px;
	margin-top: 3px; 
}

</style>
<script src="https://cdn.bootcss.com/jquery-treegrid/0.2.0/js/jquery.treegrid.min.js"></script>
<script src="https://cdn.bootcss.com/jquery-json/2.3.0/jquery.json.min.js"></script>
<%@include file="../lib/lib-common-style.jsp"%>
<%@include file="../lib/lib-user-style.jsp"%>

</head>
<body style="background-color: white;">
	<div id='treegrid' class="container-fluid">
		<table class="tree">

		</table>

	</div>
 	<div class="ibiz-pickupview-action">
 		<input type="button" style="width: 100px; height:34px;" value="重置" onclick="reset('treegrid-1')">
		<input type="button" style="width: 100px; height:34px;" value="确定" onclick="commit()">
		<input type="button" style="width: 100px; height:34px;" value="取消" onclick="cancel()">

	</div>

	<script type="text/javascript">

		var ctx2 = '${ctx2}';
		var id = 1, tempEntityAttr;
		var flag = true;
		var defieldArr;
		var codeListArr={};
		var pagectx = new IBizPageContext();
		var winId = pagectx.getParamValue('windowid');
		var win = $.getIBizApp().findWindow(winId);
		var openerid = pagectx.getParamValue('openerid');
		var viewCtrl = $.getIBizApp().getSRFController(openerid);
		
		var searchForm = null;
		if(viewCtrl)
			searchForm = viewCtrl.getSearchForm();

		var yesnoCodeList = {"1":"是","0":"否"};
		var groupCondOpText = {"AND":"并且","OR":"或者"};
		var groupCondOp = {"AND":"子条件同时成立","OR":"子条件任意成立"};
		var allCondOp = {"EQ":"等于(=)","NOTEQ":"不等于(<>)","GT":"大于(>)","GTANDEQ":"大于等于(>=)","LT":"小于(<)","LTANDEQ":"小于等于(<=)","ISNULL":"值为空(Nil)","ISNOTNULL":"值不为空(NotNil)","TESTNULL":"空值判断(TestNil)","LIKE":"文本包含(%)","LEFTLIKE":"文本左包含(%#)","RIGHTLIKE":"文本右包含(#%)","USERLIKE":"自定义文本包含(%)","IN":"值在范围中(in)","NOTIN":"值不在范围中(NotIn)"};
		var textCondOp = {"EQ":"等于(=)","NOTEQ":"不等于(<>)","ISNULL":"值为空(Nil)","ISNOTNULL":"值不为空(NotNil)","TESTNULL":"空值判断(TestNil)","LIKE":"文本包含(%)","LEFTLIKE":"文本左包含(%#)","RIGHTLIKE":"文本右包含(#%)","USERLIKE":"自定义文本包含(%)","IN":"值在范围中(in)","NOTIN":"值不在范围中(NotIn)"};
		var timeCondOp = {"EQ":"等于(=)","NOTEQ":"不等于(<>)","GT":"大于(>)","GTANDEQ":"大于等于(>=)","LT":"小于(<)","LTANDEQ":"小于等于(<=)","ISNULL":"值为空(Nil)","ISNOTNULL":"值不为空(NotNil)","TESTNULL":"空值判断(TestNil)"};
		var numberCondOp = {"EQ":"等于(=)","NOTEQ":"不等于(<>)","GT":"大于(>)","GTANDEQ":"大于等于(>=)","LT":"小于(<)","LTANDEQ":"小于等于(<=)","ISNULL":"值为空(Nil)","ISNOTNULL":"值不为空(NotNil)","TESTNULL":"空值判断(TestNil)"};

		var dename = pagectx.getParamValue('dename');
		var ctrId = pagectx.getParamValue('ctrid');
		var ctr = $.getIBizApp().getSRFController(ctrId);

		
		
		function reCodeList(codeListArr){
			
			var yesnoCodeListArr = [];
			var index = 0;
			for(var key in yesnoCodeList){
				var condOp = { text:yesnoCodeList[key], value:key, realtext:yesnoCodeList[key]};
				yesnoCodeListArr[index] = condOp;
				index++;
			}	
			
			var groupCondOpArr = [];
			index = 0;
			for(var key in groupCondOp){
				var condOp = { text:groupCondOp[key], value:key, realtext:groupCondOp[key]};
				groupCondOpArr[index] = condOp;
				index++;
			}				
				
				
			var allCondOpArr = [];
			index = 0;
			for(var key in allCondOp){
				var condOp = { text:allCondOp[key], value:key, realtext:allCondOp[key]};
				allCondOpArr[index] = condOp;
				index++;
			}
			
			var textCondOpArr = [];
			index = 0;
			for(var key in textCondOp){
				var condOp = { text:textCondOp[key], value:key, realtext:textCondOp[key]};
				textCondOpArr[index] = condOp;
				index++;
			}
			
			var timeCondOpArr = [];
			index = 0;
			for(var key in timeCondOp){
				var condOp = { text:timeCondOp[key], value:key, realtext:timeCondOp[key]};
				timeCondOpArr[index] = condOp;
				index++;
			}
			
			var numberCondOpArr = [];
			index = 0;
			for(var key in numberCondOp){
				var condOp = { text:numberCondOp[key], value:key, realtext:numberCondOp[key]};
				numberCondOpArr[index] = condOp;
				index++;
			}
			
			codeListArr.yesnoCodeList = yesnoCodeListArr;
			codeListArr.groupCondOp = groupCondOpArr;
			codeListArr.allCondOp = allCondOpArr;
			codeListArr.textCondOp = textCondOpArr;
			codeListArr.timeCondOp = timeCondOpArr;
			codeListArr.numberCondOp = numberCondOpArr;

			for(var key in codeListArr){
				if(codeListArr[key]){
					new IBizCodeList({id: key, datas:codeListArr[key]});
				}
			}
			
		}
		 

		/* 
			功能：获取当前实体属性和代码表,并注册代码表
		 */
		function getDEField() {
			var params = {
				srfaction : 'getdata',
				dename : dename
			};
			params.dename = dename;
			IBiz.ajax({
				url : '${ctx}/ibizutil/customsearchdata.jsp?',
				params : params,
				method : 'POST',
				dataType : 'json',
				async: false,
				success : function(result) {
					if (result) {
						defieldArr = result.defieldArr;
						codeListArr = result.codeListArr;
						reCodeList(codeListArr);
						
						if (searchForm && searchForm.customSearchVal) {
							var jsonTree = searchForm.customSearchVal;
							initSearchCond(jsonTree);
						}else{
							var treeGrid = $('.tree').treegrid();
							addGroupCond("treegrid-1", "");
							treeGrid.show();
						}
					}
				},
				error : function(errorMsg) {
					alert("数据加载失败,失败原因：" + errorMsg);
				}

			});
		}


		function sortObjectKeys(obj){
			  var tmp={};
			  Object.keys(obj).sort().forEach(function(k){tmp[k]=obj[k]});
			  return tmp;
			}
		
		getDEField();

			
		function initSearchCond(jsonTree){
			var condtype = jsonTree.condtype;
			var items = jsonTree.items;
		
			if (condtype == "group") {
				addGroupCond(null, jsonTree);
				for (var i = 0; i < items.length; i++) {
					var item2 = items[i];
					if (!item2)
						continue;

					var items2 = item2.items;
					var condtype2 = item2.condtype;
					
					if(condtype2 == "group"){
						addGroupCond(null, item2);
						if (items2.length > 0) {
							for (var j = 0; j < items2.length; j++) {
								initSearchCond(items2[j]);
							}
						}
					}else{
						addDefieldCond(null, item2);
						func(null, item2);
					}
					
					 
				}
			}else{
				
				addDefieldCond(null, jsonTree);
				func(null, jsonTree);
			}
		}


		/*
		功能：添加属性条件 
	 */
	function addDefieldCond(className, param) {
		var nextClassName = "";
		var pClassName = "";
		var curClassName = "";
		var value = "";
		if(param.pclassname){
			nextClassName = param.classname;
			pClassName = param.pclassname;	
			curClassName = getClassName(param.classname);	
			value = param.defid;
		}else{
			nextClassName = getNextClassName(className);
			pClassName = getClassName(className);
			curClassName = getClassName(nextClassName);
		}

		var selectDeFieldId = curClassName + "-selectDeFieldMa";
		var defildCond = "<tr id='"+curClassName+"-defield' class='"+nextClassName+"'>"
				+ "<td><div id='"+selectDeFieldId+"_c' class='defield-cond' ><SELECT id='"+selectDeFieldId+"' name='"+selectDeFieldId+"' class='form-control ibiz-field-dropdownlist' onchange='func("+ '"'+ curClassName + '",'+ '""'+")'></SELECT></div></td>"
				+ "<td><input id='"+ curClassName+ "-delete' class='input-button' type='button' value='删除'"+ " onclick='removeCond("+ '"'+ curClassName+ '"'+ ")'></td> </tr>";
			
		var length = $("." + pClassName).treegrid('getChildNodes').length;
		if(length>0){
			var sgjd = $("." + pClassName).treegrid('getChildNodes')[length-1].id;
			sgjd = getGrouopCondLastNodeId(sgjd);
			$("#" + sgjd).after(defildCond);
		}else{
			$("." + pClassName).after(defildCond);
		}
		$("#" + pClassName + "-group-warning").parent().remove();
		$('.tree').treegrid().show();
			var ibiz = new IBizDropDownListField({id:selectDeFieldId,name:selectDeFieldId,codelistid:dename,width:150});
		ibiz.setAsyncConfig({items:codeListArr[dename]});
		if(value)
			ibiz.setValue(value);
	}
	
	/*
	功能：添加组条件
 */
function addGroupCond(className, param) {
	var curClassName = "";
	var nextClassName = "";
	var pClassName = "";
	var value = "AND";
	if(param){
		pClassName = param.pclassname;
		nextClassName = param.classname;
		curClassName = getClassName(param.classname);
		value = param.condop;
	}else{
		nextClassName = getNextClassName(className);
		pClassName = getClassName(className);
		curClassName = getClassName(nextClassName);
	}

	var groupCond = "<tr id='"+curClassName+"-group' class='"+nextClassName+"'>"
			+ "<td><div id='"+curClassName+"-selectGroupMa_c' class='group-cond'>"
			+ "	<select id='"+curClassName+"-selectGroupMa' name='"+curClassName+"' class='form-control ibiz-field-dropdownlist'></select>"
			+ "</div></td>"
			+ "<td><input type='button' class='input-button' value='添加属性条件 ' onclick='addDefieldCond("+ '"' + nextClassName + '",'+ '""'+")'></td>"
			+ "<td><input type='button' class='input-button' value='添加组合条件' onclick='addGroupCond("+ '"' + nextClassName + '",'+ '""'+ ")'>";
	
	if(pClassName!=curClassName && pClassName!="tree"){
		groupCond += "<input type='button' class='input-button' value='删除' onclick='removeCond("+ '"' + curClassName + '"' + ")'></td>" + "</tr>";
		
		var length = $("." + pClassName).treegrid('getChildNodes').length;
		if(length>0){
			var sgjd = $("." + pClassName).treegrid('getChildNodes')[length-1].id;
			sgjd = getGrouopCondLastNodeId(sgjd);
			$("#" + sgjd).after(groupCond);
			
		}else{
			$("." + pClassName).after(groupCond);
		}
	}else{
		groupCond += "</td></tr>";
		$(".tree").append(groupCond);
	}
	
	$('.tree').treegrid().show();
	
	var ibiz = new IBizDropDownListField({id:curClassName+"-selectGroupMa",name:curClassName+"-selectGroup",codelistid:'groupCondOp',width:150});
	ibiz.setAsyncConfig({items:codeListArr['groupCondOp']});
	ibiz.setValue(value);

}
	
		function getGrouopCondLastNodeId(id){
			var lastNodeId = "";
		if(id.indexOf("group")){
			var length = $("#" + id).treegrid('getChildNodes').length;
			if(length>0){
				lastNodeId = $("#" + id).treegrid('getChildNodes')[length-1].id;
				var lastNodeLength = $("#" + lastNodeId).treegrid('getChildNodes').length;
				if(lastNodeLength>0){
					lastNodeId = getGrouopCondLastNodeId(lastNodeId);
				}
			}else{
				lastNodeId = id;
			}
		}
		return lastNodeId;
	} 

		function marning(className){
			var CondOp = $("#" + className + "-selectCondOpMa").val();
			if(CondOp){
				
				if($("#" + className + "-defield-warning")){
					$("#" + className + "-defield-warning").parent().remove();
				}
				
				if(CondOp == 'ISNULL' || CondOp == 'ISNOTNULL' || CondOp == 'NotNil' || CondOp == 'TESTNULL'){
					$("#" + className + "-condValueMa").parent().parent().hide();
				}else{
					$("#" + className + "-condValueMa").parent().parent().show();
				}
			}else{

				alert("属性条件必须要选择运算符！");
				if($("#" + className + "-defield-warning").length == 0){
					$("." + className).append("<td><img id='"+className+"-defield-warning' src='..//..//my//img//warning.png' style='margin-top: 4px; margin-left: 4px;'/></td>");
				}
					
			}
		}

	function func(curClassName, param) {
		var selectDeFieldId = "";
		var condValue = "";
		var condOp = "EQ";
		var index = "";
		if(param){
			index = param.defid;
			condValue = param.condvalue;
			condOp = param.condop;
			curClassName = getClassName(param.classname);
			selectDeFieldId = curClassName + "-selectDeFieldMa";
		}else{
			curClassName = getClassName(curClassName);
			selectDeFieldId = curClassName + "-selectDeFieldMa";
			index = $("#" + selectDeFieldId).find("option:selected").val();
		}
		
		
		var condId = curClassName+"-condValueMa";	
		var deFId = defieldArr[index].defid;
		var deFName = defieldArr[index].defname;
		var condType = defieldArr[index].condtype;
		var stddatatype = defieldArr[index].stddatatype;
		
		
		var condOpType = "";
		if(stddatatype == "DATE" || stddatatype == "DATETIME"){
			condOpType = "timeCondOp";
		}else if(stddatatype == "NMCODELIST" || stddatatype == "NSCODELIST"){
			condOpType = "numberCondOp";
		}else{
			condOpType = "textCondOp";
		}
		var selectCondOp = curClassName+"-selectCondOpMa";
		var condText = "<td><div id='"+selectCondOp+"_c' class='cond-op'><SELECT id='"+selectCondOp+"' name='"+selectCondOp+"' class='form-control ibiz-field-dropdownlist' onchange='marning("+ '"' + curClassName + '"' + ")'></SELECT></div></td>";
		
		if (stddatatype == "DATE") {//日期

			condText += "<td><div class='input-group ibiz-field-datepicker' style=' height: 34px; margin-top: 3px; margin-left: 5px;'>";
			condText += "	<input id='"+condId+"' name='"+condId+"'  class='form-control form-control-inline date-picker'  type='text' />";
			condText += "</div></td>";

		} 
		else if (stddatatype == "DATETIME") {//日期时间

			condText += "<td><div class='input-group ibiz-field-datetimepicker' style=' height: 34px; margin-top: 3px; margin-left: 5px;'>"
			condText += "<input id='"+condId+"' name='"+condId+"'  class='form-control form-control-inline datetime-picker'  type='text' />";
			condText += "</div></td>";
			
		} 
		else if (stddatatype == "NMCODELIST" || stddatatype == "SMCODELIST") {//数值或文本多选

			condText += "<td><div id='"+condId+"_c' style='width:300px;' ><div class='checkbox-list ibiz-field-checkboxlist' id='"+condId+"' name='"+condId+"' ></div></div></td>";
		} else if (stddatatype == "NSCODELIST" || stddatatype == "SSCODELIST" || stddatatype == "YESNO") {//数值或文本单选
			condText += "<td><div id='"+condId+"_c' class='cond-value' ><SELECT id='"+condId+"' name='"+condId+"' class='form-control ibiz-field-dropdownlist'></SELECT></div></td>";

		}else {
			
			condText += "<td><div id='"+condId+"_c' class='cond-value' ><input id='"+condId+"' name='"+condId+"' type='text' style='width: 150px;' class='form-control text ibiz-field-textbox' ></div></td>";
		}
		condText += "<td><input id='"+ curClassName+ "-delete' type='button' class='input-button' value='删除' onclick='removeCond("+ '"' + curClassName + '"' + ")'></td>";

		$("#" + curClassName + "-selectCondOpMa").parent().parent().remove();
		$("#" + curClassName + "-condValueMa").parent().parent().remove();
		$("#" + curClassName + "-delete").parent().remove();
		$("#" + curClassName + "-defield").append(condText);
		$("#" + curClassName + "-defield-warning").parent().remove();
		
		var ibiz;
		if (stddatatype == "DATE") {
			
			ibiz = new IBizDateField({id: condId,name: condId,fmt:'YYYY-MM-DD',allowBlank:false,width:179});
		}
		else if (stddatatype == "DATETIME") {
			
			ibiz = new IBizDateField({id:condId,name:condId,fmt:'YYYY-MM-DD HH:mm:ss',allowBlank:false,width:179});
		}else if(stddatatype == "NSCODELIST" || stddatatype == "SSCODELIST") {//数值或文本单选
			
			ibiz = new IBizDropDownListField({id:condId,name:condId,codelistid:deFId,width:205});
			ibiz.setAsyncConfig({items:codeListArr[deFId]});
		}else if(stddatatype == "NMCODELIST"){

			ibiz = new IBizCheckListField({id:condId,name:condId,codelistid:deFId,orMode:"num",valueSeparator:'',width:300,itemWidth:90});
			ibiz.setAsyncConfig({items:codeListArr[deFId]});
		}else if( stddatatype == "SMCODELIST"){
			
			ibiz = new IBizCheckListField({id:condId,name:condId,codelistid:deFId,orMode:"str",valueSeparator:'',width:300,itemWidth:90});
			ibiz.setAsyncConfig({items:codeListArr[deFId]});
		}
		else if (stddatatype == "YESNO") {//是否单选
			ibiz = new IBizDropDownListField({id:condId,name:condId,codelistid:'yesnoCodeList',width:205});
			ibiz.setAsyncConfig({items:codeListArr['yesnoCodeList']});
		}
		else if( stddatatype == "LONGTEXT"){//长文本（不支持搜索）
			alert("当前选中字段（"+deFName+"）不支持搜索!");
			return;
		}else{
			ibiz = new IBizTextField({id:condId,name:condId,width:179});
		}
		ibiz.setValue(condValue);
		
		var ibiz2 = new IBizDropDownListField({id:selectCondOp,name:condId,codelistid:condOpType,width:205});
		ibiz2.setAsyncConfig({items:codeListArr[condOpType]});
		ibiz2.setValue(condOp);
		
		if(param){
			marning(curClassName);
		}
	}
	
	/*
	功能：获取条件值
	*/
	function getCondValue(curClassName){
		var condValueClass = curClassName + "-condValueMa";
		var selectDeFieldId = curClassName + "-selectDeFieldMa";
		var selectCondOpClass = curClassName + "-selectCondOpMa";
		var selectCondOp = $("#" + selectCondOpClass).val();
		var index = $("#" + selectDeFieldId).find("option:selected").val();
		var deFId = defieldArr[index].defid;
		var stddatatype = defieldArr[index].stddatatype;
		var condValue = "";
		
		if(selectCondOp == 'ISNULL' || selectCondOp == 'ISNOTNULL' || selectCondOp == 'NotNil' || selectCondOp == 'TESTNULL'){
			condValue = null;
		}else{
			if (stddatatype == "DATE") {//日期
				condValue = $("#" + condValueClass).val();
			} 
			else if (stddatatype == "DATETIME") {//日期时间
				condValue = $("#" + condValueClass).val();
			} 
			else if (stddatatype == "NMCODELIST") {//数值或文本多选
				var value = 0;
	            $("#"+condValueClass).find("span.checked").find("input:checkbox").each(function(){
					 value += parseInt($(this).val());
	               })
	            condValue = value;
			} 
			else if(stddatatype == "SMCODELIST"){
				var value = "";
	            $("#"+condValueClass).find("span.checked").find("input:checkbox").each(function(){
		        	 value += $(this).val()+";";
		          })
	           condValue = value;
			}
			else if (stddatatype == "NSCODELIST" || stddatatype == "SSCODELIST") {//数值或文本单选
				condValue = $("#" + condValueClass).val();
			}  
			else if (stddatatype == "YESNO") {//是否单选
				condValue = $("#" + condValueClass).val();
			} 
			else {
				condValue = $("#" + condValueClass).val();
			}
		}

		
		return condValue;
	}

	/*
	功能：获取下一个节点的className
	 */
	function getNextClassName(className) {

		var classArr = className.split(" ");
		var curClassName = getClassName(className);

		var allNodes = $(".tree").treegrid('getAllNodes');
		var allNodeNum = allNodes.size();
		if($("." + curClassName).length>0){
			var childNodeNum = $("." + curClassName).treegrid('getChildNodes').size();
			var parentClassName = curClassName.replace("treegrid","treegrid-parent");
			var nextClassName = curClassName + (allNodeNum + 1) + " "+ parentClassName;

			while ($.inArray(nextClassName, allNodes) > 0) {
				allNodeNum++;
				nextClassName = curClassName + (allNodeNum + 1) + " "+ parentClassName;
			}
		}else{
			nextClassName = className;
		}
		
		return nextClassName;
	}


	/*
		功能：删除条件
	 */
	function removeCond(className) {
		var curClassName = className;
		if ($("." + curClassName)) {
			
			var childNodes = $("." + curClassName).treegrid('getChildNodes');
			var childNodeNum = childNodes.size();
			if (childNodeNum == 0) {
				$("." + curClassName).remove();
			} else {
				for (var i = 0; i < childNodeNum; i++) {
					var curClassName2 = getClassName(childNodes[i].className);

					if ($("." + curClassName2)) {
						
						var childNodes2 = $("." + curClassName2).treegrid('getChildNodes');
						var childNodeNum2 = childNodes2.size();
						if (childNodeNum2 >= 0) {
							removeCond(curClassName2);
						}
						$("." + curClassName2).remove();
					}
				}
				$("." + curClassName).remove();
			}
		}
	}

	function getClassName(className) {
		if(className && className.indexOf(" ")>0){
			var classArr = className.split(" ");
			var curClassName = "";
			if (classArr.length > 0)
				curClassName = classArr[0];
		}else{
			curClassName = className;
		}
		
		return curClassName;
	}
	
	function getParentClassName(className){
		var parentClassName = "";
		
		if(className){
			className =  className.replace(" treegrid-expanded","");
			if(className =="treegrid-1"){
				parentClassName = "tree";
			}else{
				var classArr = className.split(" ");
				if(classArr.length >= 2){
					var parentClassName = classArr[1];
					var parentClassName = parentClassName.replace("treegrid-parent","treegrid");
				}
			}
		}
		return parentClassName;
	}

	function getTreeJson(className) {
		var treeJson = {};
		var curClassName = getClassName(className);
		if ($("." + curClassName)) {
			var childNodes = $("." + curClassName).treegrid('getChildNodes');
			var childNodeNum = childNodes.size();
			var nodeId = $("." + curClassName)[0].id;
			var condop = "";
			var condtype = "";
			if (nodeId.indexOf("group") > 0) {
				condtype = "group";
			} else {
				condtype = "defield";
			}


			if (condtype == "group") {
				condop = $("#" + className + "-selectGroupMa").val();
				treeJson = {
					"classname": $("." + curClassName).attr("class"),
					"pclassname": getParentClassName($("." + curClassName).attr("class")),
					"condtype" : condtype,
					"condop" : condop,
					"notmode" : false,
					items : {}
				};
			}
			if (childNodeNum > 0) {
				var jsonArr = new Array();
				for (var j = 0; j < childNodeNum; j++) {
					var item = {};
					var childCondOp = "";
					var childCondType = "";
					var childDeFId = "";
					var childDeFName = "";
					var childCondValue = "";
					var childStdDataType = "";
					var childNodeId = childNodes[j].id;
					var childClassName = getClassName(childNodes[j].className);
					var cChildNodes = $("." + childClassName).treegrid('getChildNodes');
					
					if (childNodeId.indexOf("group") > 0) {
						childCondType = "group";
					} else {
						childCondType = "defield";
					}
					if (cChildNodes.size() == 0 || cChildNodes.length == 0) {
						if (childCondType == "group") {
							if($("#" + childClassName+"-group-warning").length == 0)
								$("." + childClassName).append("<td><img id='"+childClassName+"-group-warning' src='..//..//assets//jquery-treegrid-0.3.0//img//warning.png' style='margin-top: 4px; margin-left: 4px;'/></td>");
							if(flag)
								alert("组条件下必须要存在子条件！");
							flag = false;
							continue;
						} else {
							var index = $("#" + childClassName + "-selectDeFieldMa").find("option:selected").val();
							if(index){
								childDeFId = defieldArr[index].defid;
								childDeFName = defieldArr[index].defname;
								childCondType = defieldArr[index].condtype;
								childStdDataType = defieldArr[index].stddatatype;
								childCondOp = $("#" + childClassName + "-selectCondOpMa").val();
								childCondValue = getCondValue(childClassName);
								
								if(!childCondOp){
									if($("#" + childClassName+"-defield-warning").length == 0)
										$("." + childClassName).append("<td><img id='"+childClassName+"-defield-warning' src='..//..//assets//jquery-treegrid-0.3.0//img//warning.png' style='margin-top: 4px; margin-left: 4px;'/></td>");
									if(flag)
										alert("属性条件必须要选择运算符！");
									flag = false;
									continue;
								}
								if(!childCondValue){
									if($("#" + childClassName+"-defield-warning").length == 0)
										$("." + childClassName).append("<td><img id='"+childClassName+"-defield-warning' src='..//..//assets//jquery-treegrid-0.3.0//img//warning.png' style='margin-top: 4px; margin-left: 4px;'/></td>");
									if(flag)
										alert("属性条件值不能为空！");
									flag = false;
									continue;
								}
								
								item = {
									"classname": childNodes[j].className,
									"pclassname": getParentClassName(childNodes[j].className),
									"condtype" : childCondType,
									"defid" : childDeFId,
									"defname" : childDeFName,
									"stddatatype" : childStdDataType,
									"condop" : childCondOp,
									"condvalue" : childCondValue,
									"notmode" : false,
									items : {}
								};
								jsonArr[j] = item;
							}else{
								if($("#" + childClassName+"-defield-warning").length == 0)
									$("." + childClassName).append("<td><img id='"+childClassName+"-defield-warning' src='..//..//assets//jquery-treegrid-0.3.0//img//warning.png' style='margin-top: 4px; margin-left: 4px;'/></td>");
								
								if(flag)
									alert("属性条件必须要选择属性！");
								flag = false;
								continue;
							}
						}
					} else {
						item = getTreeJson(childClassName);
						jsonArr[j] = item;
					}

				}
				treeJson.items = jsonArr;
			}else{
				if(flag)
					alert("组条件下必须要存在子条件！");
				flag = false;
				return treeJson;
			}

		}
		return treeJson;
	}


	//处理搜索条件--cc
	function getCustomSearchText(param, sfwgjd) {
		var con = "";
		var condop = param.condop;
		var condtype = param.condtype;
		var items = param.items;

		if (condtype == "group") {
			con += " (";
			for (var i = 0; i < items.length; i++) {
				var condtext = "";
				var item2 = items[i];
				if (!item2)
					continue;

				var condop2 = item2.condop;
				var condtype2 = item2.condtype;

				var items2 = item2.items;

				if (items2.length > 0) {
					con += " (";
					for (var j = 0; j < items2.length; j++) {
						con += getCustomSearchText(items2[j], null);
						if (j != items2.length - 1) {
							con += "      " + groupCondOpText[condop2] +"      ";
						}
					}
					con += " ) ";
				} else {
					var defid2 = item2.defid;
					var defname2 = item2.defname;
					var condvalue2 = item2.condvalue;
					con += "  " + defname2 + "  " + allCondOp[condop2] + "  " + getCodeListValue(defid2, condvalue2);
				}

				if (i != items.length - 1) {
					con += "      " + groupCondOpText[condop] +"      ";
					if(sfwgjd == "root"){
						con += " \n";
					}
				}
			}
			con += " ) ";
		} else {
			var defid = param.defid;
			var defname = param.defname;
			var condvalue = param.condvalue;
			con += defname + "  " + allCondOp[condop] + "  " + getCodeListValue(defid, condvalue);
		}

		return con;
	}
	
	function getCodeListValue(defid , condvalue){
		var value = "";
		if(defid && condvalue){
			var stddatatype = defieldArr[defid].stddatatype;
			if (stddatatype == "DATE") {//日期
				value = condvalue;
			} 
			else if (stddatatype == "DATETIME") {//日期时间
				value = condvalue;
			} 
			
			else if (stddatatype == "NMCODELIST") {//数值多选
				for (var i = 0; i < codeListArr[defid].length; i++) {
					var codeListObject = codeListArr[defid][i];
					if(codeListObject.value){
						var num = parseInt(codeListObject.value);
						var num1 = parseInt(condvalue);
						if((num1 & num) > 0){
							value += codeListObject.text+";";
						}
					}	
				}
			} 
			else if(stddatatype == "SMCODELIST"){//文本多选
				if(condvalue.indexOf(";")>0){
					var keyArr = condvalue.split(";");
					
					for (var i = 0; i < codeListArr[defid].length; i++) {
						var codeListObject = codeListArr[defid][i];
						if(codeListObject.value){
							for(var j = 0; j < keyArr.length; j++){
								if(codeListObject.value == keyArr[j]){
									value += codeListObject.text+";";
								}
							}
						}
					}
				}else{
					value = condvalue;
				}
			}
			else if (stddatatype == "NSCODELIST" || stddatatype == "SSCODELIST" || stddatatype == "YESNO") {//文本单选
				for (var i = 0; i < codeListArr[defid].length; i++) {
					var codeListObject = codeListArr[defid][i];
					if(codeListObject.value){
						if(codeListObject.value == condvalue){
							value = codeListObject.text;
						}
					}
				}
			} 
			else {
				value = condvalue;
			}
			
		}
		return value;
	}
	
	/*
	功能：重置
	*/
	
	function reset(className){
		var childNodes = $("."+className).treegrid('getChildNodes');
		var childNodeNum = childNodes.size();
		
		for (var i = 0; i < childNodeNum; i++) {
			var className2 = getClassName(childNodes[i].className);

			if ($("." + className2)) {
				var childNodes2 = $("." + className2).treegrid('getChildNodes');
				var childNodeNum2 = childNodes2.size();
				if (childNodeNum2 > 0) {
					reset(className2);
				}
				$("." + className2).remove();
			}
		}
	}

	//确定操作
	function commit() {
		flag = true;
		var treeJson = getTreeJson("treegrid-1");
		var tmp = getCustomSearchText(treeJson, "root");
		var param = treeJson;
		if(!flag)
			return;
		
		if (win) {
			win.dialogResult = 'ok';

			//if (viewCtrl) {
			//	viewCtrl.customTree = treeJson;
			//}
			win.tmp = tmp;
			win.param = param;
			win.close();
		}
	}

	//取消操作
	function cancel() {
		if (win) {
			win.close();
		}
	}
</script>

</body>
</html>