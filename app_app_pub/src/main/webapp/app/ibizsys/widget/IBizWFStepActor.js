/**
 * 工作流催办控件
 */
var IBizWFStepActor =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		me.container.addClass('tiles');
		me.itemMap = {};
		me.selections = [];
		me.load();
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
		var params = {};
		me.fireEvent(IBizWFStepActor.BEFORELOAD,me,params);
       	params.offset = params.start;
       	params.limit = params.length;
		params.srfrender='JQUERYDATATABLES';
		
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				me.onDataLoaded(data);
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZWFSTEPACTOR.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	onDataLoaded:function(data){
		var me = this;
		
		if(data.ret != 0){
			IBiz.alert($IGM('IBIZWFSTEPACTOR.ONDATALOADED.TITLE','加载失败'),$IGM('IBIZWFSTEPACTOR.ONDATALOADED.INFO','加载数据失败,'+data.info,[data.info]),2);
			return;
		}
		
		var caphtml = [];
		var capcontainer = $('#'+me.config.id+'_cap');
		if(data.activestep){
			caphtml.push('<small>&nbsp;'+$IGM('IBIZWFSTEPACTOR.ONDATALOADED.SMALL','当前环节')+'&nbsp;</small>');
			caphtml.push(data.activestep.wfplogicname);
			caphtml.push('<small>&nbsp;'+$IGM('IBIZWFSTEPACTOR.ONDATALOADED.SMALL2','处理人员')+':</small>');
		}
		capcontainer.html(caphtml.join(''));
		
		var html = [];
		
		$.each(data.items,function(idx,item){
			me.itemMap[item.srfkey] = item;
			var wfstepactorname = item.wfstepactorname;
			var remindercount  = item.remindercount 
			html.push('<div class="ibiz-id-tile" data-ibiz-id="'+item.srfkey+'">')
			html.push('<div class="tile bg-purple-studio" style="');
			if(item.isfinish == 1)
			{
				html.push('border-color: #888 !important;background-color: #888 !important;');
			}
			html.push('">');
			html.push('	<div>');
			html.push('		<div style="text-align:right;">');
			if(remindercount>0){
				html.push('			<span class="badge badge-default ibiz-id-counter">');
				html.push(remindercount);
				html.push('			</span>');	
			}
			html.push('</div>');
			html.push('	<div class="tile-body">');
			html.push('			<i class="fa fa-user"></i>');
			html.push('	</div>');
			html.push('	<div class="tile-object">');
			html.push('		<div style="text-align:center;">');
			html.push(wfstepactorname);
			html.push('</div>');
			html.push('	</div>');
			html.push('</div>');
			html.push('</div>');
			html.push('</div>');
		});
		
		me.container.html(html.join(''));
		
		me.container.find('.ibiz-id-tile').dblclick(function(e){
			 me.container.find('.tile').removeClass('selected');
			 var id = $(this).attr('data-ibiz-id');
			 $(this).addClass('selected');
			 
			 me.selections =[me.itemMap[id]];
			 
			 me.fireEvent(IBizWFStepActor.ROWDBLCLICK, me,me.selections);
		});
	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizWFStepActor.BEFORELOAD = 'BEFORELOAD';
/**
 * 双击行
 */
IBizWFStepActor.ROWDBLCLICK = 'ROWDBLCLICK';

$IRM('IBIZWFSTEPACTOR.AJAX.INFO','执行请求发生异常');