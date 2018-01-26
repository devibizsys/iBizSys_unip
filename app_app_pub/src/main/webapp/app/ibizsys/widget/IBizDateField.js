/**
 * 时间选择表单属性
 * 
 * <div id="datetimepicker1" class="input-append date">
 *   <input data-format="dd/MM/yyyy hh:mm:ss" type="text"></input>
 *   <span class="add-on">
 *     <i data-time-icon="icon-time" data-date-icon="icon-calendar">
 *     </i>
 *   </span>
 * 	</div>
 * 
 */
var IBizDateField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.fmt = config.fmt;
		if(!me.fmt){
			me.fmt = 'YYYY-MM-DD HH:mm';
		}
		me.field = $('#'+me.getUniqueId());
		me.initSize(me.field);
		
		me.field.datetimepicker({
			locale: locale,
			format:me.fmt
	    });
		me.field.on('dp.change',me,function(event){
			var me = event.data;
			if(event.date === false){
				me.setValue('');
			}else{
				me.setValue(moment(event.date).format(me.fmt));
			}
		});
		
		me.field.on('dp.show',me,function(event){
			var me = event.data;
			me.onShowHideChanged(true);
		});
		
		me.field.on('dp.hide',me,function(event){
			var me = event.data;
			me.onShowHideChanged(false);
		});
	},
	onValueChanged:function(oldVal,newVal){
		var me = this;
		
		if(!newVal || newVal == ''){
			me.field.val('');
		}else{
			me.field.val(newVal);
		}
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
	},
	onShowHideChanged:function(bShow){
		var me=this;
		if(!me.getForm())
			return;
		var formtype = me.getForm().getFormType();
		if (formtype == 'SEARCHFORM')
		{
			if(bShow)
			{
				$('#'+me.getUniqueId()+"_c").css("height","400px");
			}
			else
			{
				$('#'+me.getUniqueId()+"_c").css("height","");
			}
		}
	}
});	