<%@page contentType="text/html;charset=UTF-8"%>
<!--[if lt IE 9]>
<script src='${ctx}/assets/html5shiv/3.7.3/html5shiv.js' type='text/javascript'></script>
<script src='${ctx}/assets/respond/1.4.2/respond.src.js' type='text/javascript'></script>
<script>
if (!Array.prototype.indexOf)
{
  Array.prototype.indexOf = function(elt /*, from*/)
  {
    var len = this.length >>> 0;
    var from = Number(arguments[1]) || 0;
    from = (from < 0)
         ? Math.ceil(from)
         : Math.floor(from);
    if (from < 0)
      from += len;
    for (; from < len; from++)
    {
      if (from in this &&
          this[from] === elt)
        return from;
    }
    return -1;
  };
}
if (!String.prototype.trim)
{
	String.prototype.trim = function ()  
	{  
	    return this.replace(/(^\s*)|(\s*$)/g, "");  
	} 
}

</script>
<![endif]-->
<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.blockUI/2.66.0-2013.10.09/jquery.blockUI.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.js"></script>
<script src="https://cdn.bootcss.com/jstree/3.0.4/jstree.min.js"></script>
<script src="https://cdn.bootcss.com/jqueryui/1.12.0/jquery-ui.js"></script>
<script src='http://cdn.ibiz5.com/jquery/1.11.3/jquery.insertAtCaret.js' type='text/javascript'></script>
<script src="https://cdn.bootcss.com/Uniform.js/2.2.2/jquery.uniform.js"></script>
<script src="https://cdn.bootcss.com/layer/2.1/layer.js"></script>


<script src="https://cdn.bootcss.com/jquery-validate/1.14.0/jquery.validate.js"></script>
<script src="https://cdn.bootcss.com/jquery-validate/1.14.0/additional-methods.js"></script>
<script src="https://cdn.bootcss.com/jquery-validate/1.14.0/localization/messages_zh.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-growl/1.0.0/jquery.bootstrap-growl.js"></script>
<script src="https://cdn.bootcss.com/jQuery-slimScroll/1.3.8/jquery.slimscroll.js"></script>
<script src='https://cdn.bootcss.com/bootbox.js/4.4.0/bootbox.js' type='text/javascript'></script>
<script src="https://cdn.bootcss.com/summernote/0.5.1/summernote.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.devbridge-autocomplete/1.2.22/jquery.autocomplete.js"></script>
<script src="https://cdn.bootcss.com/moment.js/2.10.6/moment.js"></script>
<script src="https://cdn.bootcss.com/moment.js/2.10.6/moment-with-locales.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
<script src='http://cdn.ibiz5.com/jquery-ajaxfileupload/jquery.ajaxfileupload.js' type='text/javascript'></script>
<script src="https://cdn.bootcss.com/datatables/1.10.7/js/jquery.dataTables.js"></script>
<script src="https://cdn.bootcss.com/select2/3.5.1/select2.js"></script>
<script src="https://cdn.bootcss.com/select2/3.5.1/select2_locale_zh-CN.js"></script>
<script src='http://cdn.ibiz5.com/autotextarea/autotextarea.js' type='text/javascript'></script>

<script src="https://cdn.bootcss.com/fastclick/1.0.6/fastclick.js"></script>
<script src="http://cdn.ibiz5.com/admin-lte/2.4.0-rc/js/app.js"></script>

<!--[if (gte IE 8)&(lt IE 10)]>
<script src="${ctx}/assets/jquery-file-upload/js/cors/jquery.xdr-transport.js"></script>
<![endif]-->

<script src='${ctx}/ibizsys/ibizsys_all.js?v=20160909' type='text/javascript'></script>

<c:choose>
<c:when test="${locale!= null && locale!= ''}">
<script src='${ctx}/ibizsys/i18n/${locale}.js?v=20170608' type='text/javascript'></script>
<script src='${ctx}/js/i18n/${locale}.js?v=20170608' type='text/javascript'></script>
</c:when>
<c:otherwise> 
<script src='${ctx}/ibizsys/i18n/zh_cn.js?v=20170608' type='text/javascript'></script>
</c:otherwise>
</c:choose>
<script>
var locale = 'zh_cn';
<c:choose>
<c:when test="${locale!= null && locale!= ''}">
	moment.locale('${locale}');
	locale = '${locale}';
</c:when>
<c:otherwise> 
    moment.locale('zh_cn');
</c:otherwise>
</c:choose>
	var BASEURL = '${ctx}';
	var WEBROOTURL = '${web}';
	var IBizApp_Data = null;
</script>