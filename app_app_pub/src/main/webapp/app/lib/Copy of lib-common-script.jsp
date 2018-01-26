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
<script src='${ctx}/assets/jquery/1.11.3/jquery-1.11.3.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery/1.11.3/jquery.insertAtCaret.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap/3.3.5/js/bootstrap.js' type='text/javascript'></script>
<script src="${ctx}/assets/uniform/2.1.0/jquery.uniform.js" type="text/javascript"></script>
<script src='${ctx}/assets/layer/1.9.3/layer.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-validation/1.14.0/js/jquery.validate.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-validation/1.14.0/js/localization/messages_zh.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-validation/1.14.0/js/additional-methods.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-table/1.8.1/src/bootstrap-table.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-table/1.8.1/locale/bootstrap-table-zh-CN.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-growl/jquery.bootstrap-growl.js' type='text/javascript'></script>
<script src='${ctx}/assets/jstree/dist/jstree.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-slimscroll/jquery.slimscroll.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootbox/4.4.0/bootbox.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-summernote/summernote.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-summernote/lang/summernote-zh-CN.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-autocomplete/1.2.22/js/jquery.autocomplete.js' type='text/javascript'></script>
<script src='${ctx}/assets/moment/2.10.6/moment.js' type='text/javascript'></script>
<script src='${ctx}/assets/moment/2.10.6/moment-with-locales.js' type='text/javascript'></script>
<script src='${ctx}/assets/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.js' type='text/javascript'></script>


<script src='${ctx}/assets/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js' type='text/javascript'></script>
<script src="${ctx}/assets/jquery-ajaxfileupload/jquery.ajaxfileupload.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/vendor/jquery.ui.widget.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/vendor/tmpl.min.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/vendor/load-image.min.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/vendor/canvas-to-blob.min.js"></script>
<script src="${ctx}/assets/jquery-file-upload/blueimp-gallery/jquery.blueimp-gallery.min.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.iframe-transport.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-process.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-image.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-audio.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-video.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-validate.js"></script>
<script src="${ctx}/assets/jquery-file-upload/js/jquery.fileupload-ui.js"></script>
<!--[if (gte IE 8)&(lt IE 10)]>
<script src="${ctx}/assets/jquery-file-upload/js/cors/jquery.xdr-transport.js"></script>
<![endif]-->



<script src="${ctx}/assets/jquery-datatables/js/jquery.dataTables.js"></script>
<script src="${ctx}/assets/jquery-datatables/js/jquery.dataTables_zhCN.js"></script>


<script src="${ctx}/assets/select2/select2.js"></script>
<script src="${ctx}/assets/select2/select2_locale_zh-CN.js"></script>

<script src="${ctx}/assets/autotextarea/autotextarea.js"></script>

<script src='${ctx}/assets/metronic/4.1.0/global/scripts/metronic.js' type='text/javascript'></script>
<script src='${ctx}/assets/metronic/4.1.0/layout/scripts/layout.js' type='text/javascript'></script>
<script src='${ctx}/assets/metronic/4.1.0/layout/scripts/quick-sidebar.js' type='text/javascript'></script>

<script src='${ctx}/assets/echarts/echarts.js' type='text/javascript'></script>
<script type="text/javascript">
      require.config({  paths: { echarts: '${ctx}/assets/echarts'  }        });
</script>

<script src='${ctx}/ibizsys/util/IBizLayout.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/app/ibizsys_core.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/app/IBizApp.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizControl.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/util/IBizCodeList.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizCounter.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizWindow.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPageContext.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizToolbar.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDataGrid.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDataGrid2.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizOfficeField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizOfficeField2.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFormGroup.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFormTabPanel.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizHiddenField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizRawField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizHtmlField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizListField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPickerField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizRadioField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizSpanField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizTextAreaField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDateField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizTextField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFileField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDropDownListField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizCheckField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizCheckListField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizCheckListField2.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizListPickerField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizAddressPickerField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizForm.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizSearchForm.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizEditForm.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFormDRPanel.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFormRawItem.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizFormButton.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPictureField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPictureUploaderField.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDRBar.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizTab.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizExpTab.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizExpBar.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizExpBar2.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizViewPanel.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDashboard.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizChart.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizList.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDataView.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPortlet.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizPickupViewPanel.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizTree.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizTreeExpBar.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDRTab.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizWFStepActor.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizWFTimeline.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizMPickupResult.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/widget/IBizDataInfoBar.js' type='text/javascript'></script>


<script src='${ctx}/ibizsys/app/ViewControllerBase.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/app/MainViewControllerBase.js' type='text/javascript'></script>
<script src='${ctx}/ibizsys/app/MDViewControllerBase.js' type='text/javascript'></script>
<script>
	moment.locale('zh-cn');
	var BASEURL = '${ctx}';
	var WEBROOTURL = '${web}';
	var IBizApp_Data = null;
</script>
