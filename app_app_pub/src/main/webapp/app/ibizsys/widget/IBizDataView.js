/**
 * 数据视图
 */
var IBizDataView = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var me = this;
		me.container = $('#'+config.id);
		me.container.addClass('tiles');
		me.selections = [];
		me.itemMap = {};
		
		IBiz.ajax({url:me.config.url,
			params:{srfaction:'FETCH'},
			method:'POST',
			success:function(data){
				if(data && data.ret == 0){
					me.onDataLoaded(data.items);
				}else{
					IBiz.alert($IGM('IBIZDATAVIEW.CONSTRUCT.TITLE','加载失败'),$IGM('IBIZDATAVIEW.CONSTRUCT.INFO','加载数据失败,'+data.info,[data.info]),2);
				}
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDATAVIEW.AJAX.INFO','执行请求发生异常'),2);
			}	
		});
	},
	onDataLoaded:function(items){
		var me = this;
		me.renderData(items);
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
		var me = this;
		
		return me.selections;
	},
	renderData:function(items){
		var me = this;
		
		if(!items){
			return;
		}
		var html = [];
		$.each(items,function(idx,item){
			me.itemMap[item.srfkey] = item;
			
			var tmp = me.renderRow(item,idx);
			
			html = html.concat(tmp); 
		});
		me.container.html(html.join(''));
		
		var _time = null;
		
		me.container.find('.ibiz-id-tile').click(function(e){
			clearTimeout(_time);
			var item = $(this);
            _time = setTimeout(function(){
            	me.container.find('.tile').removeClass('selected');
            	var id =item.attr('data-ibiz-id');
            	item.find('.tile').addClass('selected');
            	
            	me.selections =[me.itemMap[id]];
            	me.fireEvent(IBizDataView.SELECTIONCHANGE, me,me.selections);
            }, 200);
		});
		me.container.find('.ibiz-id-tile').dblclick(function(e){
			 clearTimeout(_time);
			 me.container.find('.tile').removeClass('selected');
			 var id = $(this).attr('data-ibiz-id');
			 $(this).addClass('selected');
			 
			 me.selections =[me.itemMap[id]];
			 
			 me.fireEvent(IBizDataView.ROWDBLCLICK, me,me.itemMap[id]);
		});
	},
	renderRow:function(row,idx){
		var me = this;
		
		var html = [];
		html.push('<div class="ibiz-id-tile" data-ibiz-id="'+row.srfkey+'">')
		
		if(me.config.render){
			html.push(me.config.render(row,idx));
		}else{
			html.push('<div class="tile bg-purple-studio">');
			html.push('	<div class="tile-body">');
			html.push('		<i class="fa fa-bars"></i>');
			html.push('	</div>');
			html.push('	<div class="tile-object">');
			html.push('		<div style="text-align:center;">'+row.srfmajortext+'</div>');
			html.push('	</div>');
			html.push('</div>');
		}
		
		html.push('</div>');
		
		return html;
	}
	,
	/**
	 * 加载
	 */
	load:function(){
		var me=this;
		
	}
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataView.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataView.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataView.BEFORELOAD = 'BEFORELOAD';

/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataView.LOADED = 'LOADED';


















