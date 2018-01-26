/**
 * 表格控件
 */
var IBizDataGrid2 = IBizControl.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		me.grid = $('#'+config.id);
		me.grid.addClass('ibiz-jq-datatable');
		me.tableselection = null;
		me.tableselections = {};
		me.multiSelect = true;
		if(config.multiSelect != undefined && config.multiSelect == false){
			me.multiSelect = false;
		}
		me.forceFit=false;
		if(config.forceFit != undefined && config.forceFit == true){
			me.forceFit = true;
		}
		me.enablePaging = true;
		if(config.enablePaging != undefined){
			me.enablePaging = config.enablePaging;
		}
		me.pageSize = 10;
		if(config.pageSize && config.pageSize >0){
			me.pageSize = config.pageSize;
		}
			
		var columns = [];
		if(me.multiSelect){
			columns.push({ 
				"sTitle":'<input class="ibiz-id-checkall" type="checkbox"></input>',
				"width":28,
				"orderable": false,
				"sortable":false,
				"render":function(data,type,row){
					return '<input class="ibiz-id-check" type="checkbox" style="margin-left:2px;width:24px;"></input>';
				}
			});
		};
		columns = columns.concat(me.config.columns);
		if(me.grid){
			me.table = me.grid.dataTable({
				"processing": true,
				"serverSide": true,
				"searching": false,
				"bPaginate":me.enablePaging,
				"bLengthChange":false,
				"bProcessing":false,
				"iDisplayLength":me.pageSize,
				"order": [],
				"ajax": {
					"url":me.config.url,
					"type": "POST",
					"data": function (params,oSettings) {
							if(oSettings && oSettings.jqXHR){
								try
								{
									//取消上次请求
									oSettings.jqXHR.abort();
									delete oSettings.jqXHR;
									
								}
								catch(e)
								{
									
								}
								oSettings.jqXHR = null;
							}
			               	me.fireEvent(IBizDataGrid2.BEFORELOAD,me,params);
			               	params.offset = params.start;
			               	params.limit = params.length;
			               	me.datastart = params.start;
			               	me.datalimit = params.limit;
			               	if(params.limit < 0){
			               		params.limit = 1000;
			               		params.length = 1000;
			               	}
							params.srfrender='JQUERYDATATABLES';
							me.loadingTag = IBiz.beginload();
					},
					"dataSrc":function(data){
						IBiz.endload(me.loadingTag);
						if(data.ret == 0){
							me.tableselections = {};
							//呼出事件
							setTimeout(function(){
								me.fireEvent(IBizDataGrid2.LOADED,me,data);
					        }, 1);
							if(data.items){
								me.alldata = data.items;
								return data.items;
							}
						}
						else
							{
							IBiz.alert($IGM('IBIZDATAGRID.GETDATA.TITLE','加载错误信息'),$IGM('IBIZDATAGRID.GETDATA.INFO','加载数据发生错误,'+data.info,[data.info]),2);
							}
						me.alldata = [];
						return [];
					}	
				},
				"scrollY":me.getHeight(),
				"scrollX": !me.forceFit,
				//"bAutoWidth":!me.forceFit,
				"columns":columns,
				"rowCallback": function(row,data){
					row.ibizdata = data;
					if(me.tableselections[data.srfkey]){
						$(row).find('.ibiz-id-check').prop('checked',true);
						$(row).addClass('selected');
					}	
					$(row).find('.ibiz-id-check').change(function(e){
						$(row).toggleClass('selected');
						if($(this).prop('checked') == true){
							me.tableselection = row.ibizdata;
							me.tableselections[data.srfkey] = data;
						}else{
							delete me.tableselections[data.srfkey];
							delete me.tableselection;
						}
						me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
					});
		        },
		        "fnDrawCallback": function ( oSettings ) {
		            if(me.config.hideHeader && me.config.hideHeader == true){
		            	$(oSettings.nTHead).hide();
		            }
		            if(me.enablePaging == false){
		            	$('.dataTables_info').hide();
		            }
		           // $('.dataTables_info').hide();
		        }
			});
		}
		$('#'+me.config.id+'_wrapper .ibiz-id-checkall').change(function(e){
			var checked = false;
			if($(this).prop('checked') == true){
				me.table.find('.ibiz-id-check').prop("checked",true);  
				
				me.tableselection = null;
				
				me.table.find('tr').each(function(idx,tr){
					$(this).addClass('selected');
					if(this.ibizdata){
						me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
						me.tableselection = this.ibizdata;
					}
				});
			}else{
				me.table.find('tr').removeClass('selected');
				me.table.find('.ibiz-id-check').prop("checked",false);  
				
				me.tableselection = null;
				me.tableselections = {};
			}
			me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
		});
		me.grid.find('tbody').on('click', 'tr', function (e) {
			if(e.target.localName == 'input'||e.target.className=='ibiz-id-check'){
				return;
			}
			if(!this.ibizdata){
				return;
			}
			me.table.$('tr.selected').removeClass('selected');
    		me.table.find('.ibiz-id-check').prop("checked",false);  
    		$(this).addClass('selected');
    		$(this).find('.ibiz-id-check').prop("checked",true);
    		$('#'+me.config.id+'_wrapper .ibiz-id-checkall').prop("checked",false);
    		
			if(me.tableselection && me.tableselection.srfkey == this.ibizdata.srfkey){
				return;
			}
			me.tableselection = this.ibizdata;
			me.tableselections = {};
			me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
			
			me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
		 });
		me.grid.find('tbody').on('dblclick', 'tr', function (e) {
			if(e.target.localName == 'input'||e.target.className=='ibiz-id-check'){
				return;
			}
			me.fireEvent(IBizDataGrid.ROWDBLCLICK,me,this.ibizdata);
		 });
		
		me.lastVisible = me.grid.is(':visible');
		me.gridScroll = $('#'+me.config.id+'_wrapper .dataTables_scroll');
		if(!me.lastVisible){
			me.gridScroll.css({"visibility":"hidden"});
		}
		setInterval(function(){
			//判断当前是否可见
			if(me.grid.is(':visible')){
				if(me.lastVisible)
					return;
				me.grid.dataTable().fnAdjustColumnSizing(false);
				me.gridScroll.css({"visibility":"visible"});
				me.lastVisible = true;
			}
			else{
				if(me.lastVisible)
					me.gridScroll.css({"visibility":"hidden"});
				me.lastVisible = false;
			}
		},100);
	},
	setSize:function(width,height){
		var me = this;
		me.layoutHeight = height;
		me.layoutWidth = width;
		var height2 = height;
		if(!(me.config.hideHeader==true))
			 height2 -=45;
		if(me.enablePaging==true)
			 height2 -=35;
 	 
		var scrollBody=$('#'+me.config.id+'_wrapper .dataTables_scrollBody');
		scrollBody.height(height2);
		me.grid.dataTable().fnAdjustColumnSizing(false);
	},
	getAllData:function(){
		var me = this;
		return me.alldata;
	},
	getHeight:function(){
		var me = this;
		if(me.layoutHeight && me.layoutHeight >0){
			return me.layoutHeight;
		}
		if(me.config.height && me.config.height >0){
			return me.config.height;
		}
		return 0;
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
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.tableselection = null;
					me.tableselections = {};
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
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.grid.dataTable().fnPageChange('first',true);
	},
	refresh:function(){
		var me = this;
		me.grid.dataTable().fnDraw(false);
		me.grid.dataTable().fnAdjustColumnSizing(false);
	}
	,
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
		var me = this;
		me.tableselections = {};
		me.tableselection = null;
		if(selections)
		{
			table = me.grid.dataTable();
			table.find('tr').each(function(idx,tr){
				if(this.ibizdata)
				{
					if(this.ibizdata.srfkey==selections.srfkey){
						me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
						me.tableselection = this.ibizdata;
						$(this).addClass('selected');
						$(this).find('.ibiz-id-check').prop('checked',true);
					}
					else
						{
							$(this).removeClass('selected');
							$(this).find('.ibiz-id-check').prop('checked',false);
						}
				}
			});
		}
		me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
	},
	/**
	 * 获取选中数据
	 */
	getSelection:function(){
		var me = this;
		if(me.tableselections){
			var data = [];
			$.each(me.tableselections,function(key,value){
				data.push(value);
			});
			
			return data;
		}
		return [];
	},
	doUIAction: function(params) {
		var me = this;
		var callback;
		if(params || params.callback){
			callback = params.callback;
			delete params.callback;
		}
		if (!params) params = {};
		$.extend(params,{srfaction: 'uiaction'});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				IBiz.endload(me.loadingTag );
				if(data.ret == 0){
					if(data.reloadData){
						me.refresh();
					}
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.INFO','操作成功'));
					}
					IBiz.processResult(data);
					
					if(callback && typeof(callback) == 'function'){
						callback({success:true,data:data});
					}
				}else{
					IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.TITLE','操作失败'),$IGM('IBIZDATAGRID.DOUIACTION.INFO2','操作失败,执行操作发生错误,'+ data.info,[data.info]),2);
					if(callback && typeof(callback) == 'function'){
						callback({success:false,data:data});
					}
				}
			},
			failure:function(e){
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
				if(callback && typeof(callback) == 'function'){
					callback({success:false,e:e});
				}
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
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.WFSUBMIT.TITLE','执行失败'),$IGM('IBIZDATAGRID.WFSUBMIT.INFO','执行工作流操作失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
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
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.ADDBATCH.TITLE','添加失败'),$IGM('IBIZDATAGRID.ADDBATCH.INFO','执行批量添加失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 导出数据
	 */
	exportData: function(arg) {
		var me = this;
		
		var params={};
		
		me.fireEvent(IBizDataGrid2.BEFORELOAD,me,params);
		params['query'] = params['search'];
		params['srfaction']='exportdata';
		
		var setting = me.grid.dataTable().fnSettings();
		if(setting && setting.aLastSort.length>0)
		{
			var sortColomn = setting.aoColumns[setting.aLastSort[0].col];
			if(sortColomn){
				params['sort'] = sortColomn.data;
				params['sortdir'] = setting.aLastSort[0].dir;
			}
		}
		if(arg.itemtag == 'all'){
			params['start'] = 0;
			params['limit'] = 1000;
		}else if(arg.itemtag == 'custom'){
			var nStart = arg.obj.find('.ibiz-id-start').val();
			var nEnd = arg.obj.find('.ibiz-id-end').val();
			if(nStart<1 || nEnd <1 || nStart >nEnd){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDATAGRID.EXPORTDATA.INFO','请输入有效的起始页'),0);
				return;
			}
			params['start'] = (nStart-1)*me.pageSize;
			params['limit'] = nEnd*me.pageSize;
		}else{
			params['start'] = me.datastart;
			params['limit'] = me.datalimit;
		}
		
		
		
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					if(data.downloadurl){
						var downloadurl = BASEURL+ data.downloadurl;
						IBiz.download(downloadurl);
					}
					
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.EXPORTDATA.TITLE','导出失败'),$IGM('IBIZDATAGRID.EXPORTDATA.INFO2','导出数据失败,' + data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	}
	,findItem:function(fieldName,fieldValue){
		var me = this;
		var table = me.grid.dataTable();
		var item = null;
		table.find('tr').each(function(idx,tr){
			if(this.ibizdata)
			{
				if(this.ibizdata[fieldName]==fieldValue){
					item = this.ibizdata;
				}
			}
		});
		return item;
	}
		
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataGrid2.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataGrid2.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid2.BEFORELOAD = 'BEFORELOAD';

/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid2.LOADED = 'LOADED';

(function(){
    var oLanguage={
        "oAria": {
            "sSortAscending": ": 升序排列",
            "sSortDescending": ": 降序排列"
        },
        "oPaginate": {
            "sFirst": "首页",
            "sLast": "末页",
            "sNext": "下页",
            "sPrevious": "上页"
        },
        "sEmptyTable": "没有相关记录",
        "sInfo": "第 _START_ 到 _END_ 条记录，共 _TOTAL_ 条",
        "sInfoEmpty": "第 0 到 0 条记录，共 0 条",
        "sInfoFiltered": "",
        "sInfoPostFix": "",
        "sDecimal": "",
        "sThousands": ",",
        "sLengthMenu": "每页显示条数: _MENU_",
        "sLoadingRecords": "正在载入...",
        "sProcessing": "正在载入...",
        "sSearch": "搜索:",
        "sSearchPlaceholder": "",
        "sUrl": "",
        "sZeroRecords": "没有相关记录"
    }
    $.fn.dataTable.defaults.oLanguage=oLanguage;
})();

















