/**
 * 表格控件
 */
var IBizDataGrid = IBizControl.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		me.grid = $('#'+config.id);
		if(me.grid){
			me.grid.bootstrapTable({
				striped:false,
				showRefresh:false,
				showToggle:false,
				showColumns:false,
				showExport:false,
				detailView:false,
				height:me.getHeight(),
				showPaginationSwitch:false,
				url:me.config.url,
				formatSearch:function(){
					return $IGM('IBIZDATAGRID.FORMATSEARCH.INFO','请输入关键字');
				},
				queryParams: function (params) {
					me.fireEvent(IBizDataGrid.BEFORELOAD,me,params);
					params.srfrender='BOOTSTRAPTABLE';
					return params;
		        },
		        onLoadSuccess: function (data) {
		            return true;
		        },onAjaxSuccess:function(res){
		        	
		        	me.fireEvent(IBizDataGrid.LOADED,me,res);
		        	
		        	var arr = {};
		        	arr.total = res.totalrow;
		        	arr.rows = res.items;
		        	arr.limit = res.limit;
		        	arr.start =res.startrow;
		        	
		        	return arr;
		        },
		        onDblClickRow: function (item, $element) {
		        	me.fireEvent(IBizDataGrid.ROWDBLCLICK,me,item);
		        	return true;
		        },
		        onLoadError: function (status) {
		            return false;
		        },
				columns :me.config.columns
			});
			
			//添加表格选择事件
			this.grid.on('check.bs.table uncheck.bs.table check-all.bs.table uncheck-all.bs.table', function () {
				me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.grid.bootstrapTable('getSelections'));
	        });
		}
	},
	getHeight:function(){
		return 600;
	},
	/**
	 * 删除
	 */
	remove: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {
			srfaction: 'remove'
		});
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.REMOVE.INFO','删除成功'));
					}
					IBiz.processResult(data);
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.REMOVE.TITLE','删除失败'),$IGM('IBIZDATAGRID.REMOVE.INFO2','删除数据失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.refresh();
	},
	refresh:function(){
		var me = this;
		me.grid.bootstrapTable('refresh');
	},
	/**
	 * 获取数据仓库<该方法仅在Ext版本中有效>
	 * @Deprecated
	 */
	getStore:function(){
		return null;
	},
	/**
	 * 设置选中数据
	 * @param selections 
	 */
	setSelection:function(selections){
		
	},
	/**
	 * 获取选中数据
	 */
	getSelection:function(){
		if(this.grid){
			return this.grid.bootstrapTable('getSelections');
		}
		return null;
	},
	doUIAction: function(params) {
		var me = this;
		
		if (!params) params = {};
		$.extend(params,{srfaction: 'uiaction'});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret == 0){
					if(data.reloadData){
						me.refresh();
					}
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.INFO','操作成功'));
					}
					IBiz.processResult(data);
				}else{
					IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.TITLE','操作失败'),$IGM('IBIZDATAGRID.DOUIACTION.INFO2','操作失败,执行操作发生错误,'+ data.info,[data.info]),2);
				}
			},
			failure:function(e){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}	
		});
	},
	/**
	 * 提交工作流操作
	 */
	wfsubmit: function(params) {
		var me = this;
		if (!params) params = {};
		$.extend(params, {
			srfaction: 'wfsubmit'
		});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.WFSUBMIT.TITLE','执行失败'),$IGM('IBIZDATAGRID.WFSUBMIT.INFO','执行工作流操作失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 批量添加
	 */
	addBatch: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {srfaction: 'addbatch'});
		
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.ADDBATCH.TITLE','添加失败'),$IGM('IBIZDATAGRID.ADDBATCH.INFO','执行批量添加失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	}
		
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataGrid.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataGrid.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid.BEFORELOAD = 'BEFORELOAD';

/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid.LOADED = 'LOADED';
IBizDataGrid.CHANGEEDITSTATE = 'CHANGEEDITSTATE';

$IRM('IBIZDATAGRID.AJAX.INFO','执行请求发生异常');
















