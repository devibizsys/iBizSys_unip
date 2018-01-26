/**
 * 门户部件
 */
var IBizPortlet = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		if(config.timer >1000){
			setInterval(function(){me.reload();},config.timer);
		}
	},
	reload:function(){
		
	}
});

var IBizChartPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.chart = new IBizChart({ctrler:this.getController(),id:this.getId()+'_chart',url:this.getController().getBackendUrl()+'srfctrlid='+this.getName()+'_chart&'});
	}
	
});


var IBizListPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		config.listcfg.ctrler = me.config.ctrler;
		me.listctrl = new IBizList(config.listcfg);
	},
	reload:function(){
		var me=this;
		me.listctrl.reload();
	}
});

var IBizCustomPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});
var IBizHtmlPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});

var IBizViewPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});

