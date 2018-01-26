/**
 * 树视图控制器对象
 */
var TreeViewControllerBase = MDViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		if(!me.searchform){
			me.tree.load();
		}
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		var dataurl = me.config.backendurl+'srfctrlid=tree&SRFSUBAPP='+me.subapp+'&';
		//初始化主表格
		me.tree = new IBizTree({id:this.getCId2()+'tree',url:dataurl,ctrler:me});
//		me.tree.on(IBizTree.ROWDBLCLICK, function(sender,args,e){
//			var me = e.data;
//    		me.onDataActivated(me.tree,args);
//        }, me);	
//		me.tree.on(IBizTree.SELECTIONCHANGE, function(sender,args,e){
//			var me = e.data;
//    		me.onSelectionChange(me.tree,args);
//        }, me);	
		me.registerItem('tree',this.tree);
	},
	createTree:function(config)
	{
		return IBiz.createTree(config);
	},
	getMDCtrl: function() {
		return this.getTree();
	},
	getTree:function(){
		return this.tree;
	},
	/**
     * 值选中变化
     * @param sender 事件源
     * @param args 参数
     * @param e 事件
     */
    onSelectionChange: function (item,args) {
        var me = this;
        if (args.length > 0) {
            var record = args[0].original.tag;
            var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            me.selectedData = selectedData;
            
            me.selectedDatas = [];
            $.each(args,function(index,item){
            	 var record = item.original.tag;
            	var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            	if(index == 0){
            		me.selectedData = selectedData;
            	}
            	 me.selectedDatas.push(selectedData);
            });
        }else {
            me.selectedData = null;
            me.selectedDatas = null;
        }
        arguments.callee.$.onSelectionChange.call(this,item,me.selectedDatas);
    }
});