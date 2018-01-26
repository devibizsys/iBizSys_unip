var IBizFieldLabel =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.$label = config.label;//$(this.label);
		this.form = config.form;
		this.allowblank = config.allowblank;
		if(this.$label){
			this.text = this.$label.html();
		}
	},
	getName:function(){
		return this.label.name;
	},
	setAllowBlank:function(allowblank){
		if(allowblank)
		{
			this.$label.html(this.text);
		}else
		{
			this.$label.html("<span style='color:red'>*</span>"+this.text);
		}
	}
});