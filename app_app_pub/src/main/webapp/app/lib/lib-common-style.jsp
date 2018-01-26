<%@page contentType="text/html;charset=UTF-8"%>


<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/jstree/3.0.4/themes/default/style.min.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/jqueryui/1.12.0/jquery-ui.css" rel="stylesheet">

<link href="https://cdn.bootcss.com/Uniform.js/2.2.2/themes/default/css/uniform.default.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/layer/2.1/skin/layer.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/simple-line-icons/2.4.1/css/simple-line-icons.css" rel="stylesheet">




<link href="https://cdn.bootcss.com/summernote/0.5.1/summernote.min.css" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/assets/jquery-autocomplete/1.2.22/css/styles.css" />

<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.css" rel="stylesheet" type='text/css'>

<link href="https://cdn.bootcss.com/datatables/1.10.7/css/jquery.dataTables.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/select2/3.5.1/select2.css" rel="stylesheet">

<link href="https://cdn.bootcss.com/ionicons/2.0.0/css/ionicons.css" rel="stylesheet">

<link href='http://cdn.ibiz5.com/admin-lte/2.4.0-rc/css/AdminLTE.css' rel='stylesheet' type='text/css' />
<link href='http://cdn.ibiz5.com/admin-lte/2.4.0-rc/css/skins/skin-black-light.css' rel='stylesheet' type='text/css' />

<link href='${ctx}/assets/adminLTE/common.css' rel='stylesheet' type='text/css' />
<link href='${ctx}/ibizsys/css/ibizsys.css?v=20170608' rel='stylesheet' type='text/css' />
<c:choose>
<c:when test="${locale!= null && locale!= ''}">
<link href='${ctx}/ibizsys/css/ibizsys-'${locale}.css?v=20170608' rel='stylesheet' type='text/css' />
</c:when>
</c:choose>

<link href='${ctx}/resource/css/user.css' rel='stylesheet' type='text/css' />