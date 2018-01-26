/**
 * 编辑视图控制器对象
 */
var EditView2ControllerBase = EditViewControllerBase.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
	},

	onInit : function() {
		arguments.callee.$.onInit.call(this);

		this.drtab = new IBizExpTab({
			ctrler : this,
			id : this.getCId2() + 'drtab'
		});
		this.drbar = new IBizDRBar({
			ctrler : this,
			id : this.getCId2() + 'drbar',
			url : this.getBackendUrl() + 'srfctrlid=drbar&',
			tabctrl : this.drtab
		});
	},
	updateViewInfo : function() {
		var me = this;
		arguments.callee.$.updateViewInfo.call(this);
		var field = me.getForm().findField('srfkey');
		var keyvalue = field.getValue();
		field = me.getForm().findField('srforikey');
		if (field) {
			var keyvalue2 = field.getValue();
			if (keyvalue2 && keyvalue2 !== '') {
				keyvalue = keyvalue2;
			}
		}
		var deid='';
		var deidfield = me.getForm().findField('srfdeid');
		if(deidfield)
			deid = deidfield.getValue();
		var parentData = {srfparentkey : keyvalue};
		if(deid!='')
			parentData.srfparentdeid=deid;
		me.getDRBar().setParentData(parentData);
	},
	getDRBar : function() {
		return this.drbar;
	},
	getDRTab : function() {
		return this.drtab;
	}
});
