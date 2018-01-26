var potal_db_myworklistBase = IBizListPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});

var potal_db_tzggBase = IBizListPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});

var potal_db_qxjtbBase = IBizChartPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});

var potal_db_ccsqtbBase = IBizChartPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});




var potalControllerBase = PortalViewControllerBase.extend({
        construct: function(config) {
    if(!config)config={};
    if(!config.appctx)config.appctx='';
    if(!config.containerid)config.containerid='';
    arguments.callee.$.construct.call(this,this.getDefaultCfg(config));
    this.regCodeLists(config);
    this.regUICounters(config);
    this.regUIActions(config);
    this.regUpdatePanels(config);
    this.regControllers(config);
}
,regCodeLists:function(config)
{
}
,regUICounters:function(config)
{
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
}
,regUIActions:function(config)
{
}
      ,getDefaultCfg:function(cfg){
         var me=this;   
         var config={backendurl:cfg.appctx+'/common/potal.do?'+'srfcid='+cfg.containerid+'&'
                     ,viewurl:'/common/potal.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{}};
       return  $.extend({},config,cfg);
      }
      ,onInit:function(){
		arguments.callee.$.onInit.call(this);
		
this.db_myworklist= new potal_db_myworklist({ctrler:this,id:this.getCId2()+'db_myworklist',refname:'db_myworklist',url:this.getBackendUrl()+'srfctrlid=db_myworklist&',listcfg:{id:this.getCId2()+'db_myworklist_list',refname:'db_myworklist_list',url:this.getBackendUrl()+'srfctrlid=db_myworklist_list&',render: function(items,config){
    strContent = '<ul>';
	  var maxLength = 10;
	  if(items.length<10){
		  maxLength = items.length;
	  }
	  for(var i=0;i<maxLength;i++){ 
		  var createdate = items[i].createdate;
		  var wfinstancename = "";
		  if(items[i].wfinstancename){
			  wfinstancename = items[i].wfinstancename.substring(0,items[i].wfinstancename.indexOf("["));
		  }
		  var wfstepname = items[i].wfstepname?items[i].wfstepname:"";
		  var userdatainfo = items[i].userdatainfo?items[i].userdatainfo:"";
		  strContent += '<li><a href="../../ibizutil/wfredirectview.jsp?srfkey='+items[i].userdata+'&srfdeid='+items[i].userdata4+'" target="_blank">'+'&nbsp;&nbsp;['+wfinstancename+']&nbsp;'+wfstepname+'&nbsp;'+userdatainfo+'&nbsp;'+createdate+'</a></li>';
	  }
	  strContent += '</ul>';
return strContent;
}}});


this.db_tzgg= new potal_db_tzgg({ctrler:this,id:this.getCId2()+'db_tzgg',refname:'db_tzgg',url:this.getBackendUrl()+'srfctrlid=db_tzgg&',listcfg:{id:this.getCId2()+'db_tzgg_list',refname:'db_tzgg_list',url:this.getBackendUrl()+'srfctrlid=db_tzgg_list&',render: function(items,config){
    strContent = '<ul>';
	  var maxLength = 10;
	  if(items.length<10){
		  maxLength = items.length;
	  }
	  for(var i=0;i<maxLength;i++){ 
		  var createdate = items[i].createdate;
		  var tzggname = items[i].tzggname;
		  var content = items[i].content;
		  var tzggid = items[i].tzggid;
		  strContent += '<li><a href="../../jsp/xxtz/oa_tzggeditview.jsp?srfkey='+tzggid+'" target="_blank">'+'&nbsp;'+tzggname+'&nbsp;'+content+'&nbsp;'+createdate+'</a></li>';
	  }
	  strContent += '</ul>';
return strContent;
}}});


this.db_qxjtb= new potal_db_qxjtb({ctrler:this,id:this.getCId2()+'db_qxjtb',name:'db_qxjtb',url:this.getBackendUrl()+'srfctrlid=db_qxjtb&',chartcfg:{}});
this.db_qxjtb.chart.load();


this.db_ccsqtb= new potal_db_ccsqtb({ctrler:this,id:this.getCId2()+'db_ccsqtb',name:'db_ccsqtb',url:this.getBackendUrl()+'srfctrlid=db_ccsqtb&',chartcfg:{}});
this.db_ccsqtb.chart.load();


      }
});