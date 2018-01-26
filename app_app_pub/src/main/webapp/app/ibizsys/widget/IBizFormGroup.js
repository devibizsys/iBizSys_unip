/**
 * 
 */
var IBizFormGroup =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		
		me.dropDownLink = $('.'+me.getUniqueId()+'_ddl');
		me.dropDownTip = $('#'+me.getUniqueId()+'_ddt');
		me.dropDownImg = $('#'+me.getUniqueId()+'_ddi');
		
		me.groupDiv = $('#'+me.getUniqueId()+'_gd');
		
		//me.groupFa = $('a.'+me.getUniqueId()+"_"+config.name+" i");
		//me.downCloseMode = $('.'+me.getUniqueId()+"_"+config.name);
		//me.groupCloseMode = $('div.'+me.getUniqueId()+"_"+config.name);
		//me.closeContent = $("."+config.name+"_content");
		
		//导航start
		me.panel_head = me.field.find("."+config.name+"_text");
		if(config.captionItem){
			me.config.form.groupMap[config.name] = config.captionItem;
		}
		
		if(document.getElementById("form_nav")){
			var text = me.panel_head.text().trim();
			var colname = me.panel_head.attr("name");
			if(text || colname){
				var name = me.field.attr("id");
				var parent = me.field.parents(".ibiz-form-formgroup");
				var li = "<li><div name='#"+name+"' class='"+config.name+"_text' style='padding-left:"+(parent.length+1)*15+"px'>"+text+"</div><ul name='#"+name+"'></ul></li>";
				if(parent.length>0){
					var name2 = parent.eq(0).attr("id");
					$("#form_nav>.ibiz-edit-menu").find("ul[name='#"+name2+"']").append(li);
				}else{
					$("#form_nav>.ibiz-edit-menu").append(li);
				}
			}
		}
		//导航end
		
		if(config.titleBarCloseMode == null || config.titleBarCloseMode == "0"){
			return;
		}
		var titleBarCloseMode = config.titleBarCloseMode;
		if(titleBarCloseMode && titleBarCloseMode != '0'){
			if(titleBarCloseMode == '1'){
				me.downState = true;
				me.dropDownTip.hide();
				me.dropDownImg.removeClass("fa-angle-double-down");
				me.dropDownImg.addClass("fa-angle-double-up");
			}else if(titleBarCloseMode == '2'){
				me.downState = false;
				me.groupDiv.hide();
				me.dropDownTip.show();
			}
			me.dropDownLink.click(function(event){
				if(me.downState){
					me.groupDiv.hide();
					me.dropDownTip.show();
					me.dropDownImg.removeClass("fa-angle-double-up");
					me.dropDownImg.addClass("fa-angle-double-down");
					me.downState = false;
				}else{
					me.groupDiv.show();
					me.dropDownTip.hide();
					me.dropDownImg.removeClass("fa-angle-double-down");
					me.dropDownImg.addClass("fa-angle-double-up");
					me.downState = true;
				}
			});
		}

	},
	setGroupText: function(text){
		var me = this;
		me.panel_head.find("h5").html(text);
		if(document.getElementById("form_nav")){
			$("#form_nav ."+me.config.name+"_text").html(text);
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		var me = this;
		me.disabled = disabled;
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		var me = this;
		me.hidden = hidden;
		if(me.field){
			if(hidden){
				me.field.addClass('hidden');
			}else
			{
				me.field.removeClass('hidden');
			}
		}
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.field)
		{
			if(visible){
				this.field.removeClass('hidden');
			}else{
				this.field.addClass('hidden');
			}
		}
	}
});