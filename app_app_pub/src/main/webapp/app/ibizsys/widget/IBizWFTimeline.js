/**
 * 工作流表单历史处理步骤时间线控件
 */
var IBizWFTimeline =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		me.load();
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.refresh();
	},
	selectItem:function(data){
		var me = this;
		if(data && data.wfstepvalue){
			var items = [];
			if(me.items)
			{
				$.each(me.items,function(idx,item){
					//判断步骤是否相同
					if(data.wfstepvalue == item.wfstepname){
						items.push(item);
					}
				});
			}
			me.renderItems(items);
		}else
		{
			me.renderItems(me.items);
		}
	},
	refresh:function(){
		var me = this;
		var params = {};
		me.fireEvent(IBizWFTimeline.BEFORELOAD,me,params);
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
	renderItems:function(items)
	{
		var me = this;
		var html = [];
		$.each(items,function(idx,item){
			var wfprocessid = item.wfstepid;
			var stepname = item.wfstepdataname;
			var actiontime = item.actiontime;
			var actorname = item.actorname;
			var actorname2 = item.actorname2;
			var memo = item.memo;
			var wfplogicname = item.wfplogicname;
			var name='';
			if(actorname2){
				name = '('+actorname2+' 代办)';
			}
			if(!actorname || actorname == null){
				actorname = '';
			}
			if(!stepname || stepname == null){
				stepname = '';
			}
			if(!actiontime || actiontime == null){
				actiontime = '';
			}else
			{
				actiontime = moment(actiontime).format('YYYY-MM-DD HH:mm')
			}
			if(!memo || memo == null){
				memo = '';
			}
			if(!wfplogicname || wfplogicname == null){
				wfplogicname = '';
			}
			html.push('<div data-ibiz-processid="'+wfprocessid+'" class="timeline-item ibiz-wftimeline">');
			html.push('	<div class="timeline-badge">');
			html.push('		<div class="timeline-icon ">');
			html.push('			<i class="icon-user-following font-green-haze"></i>');
			html.push('		<div style="margin-left:-5px;">'+actorname+'</div>');
			html.push('		</div>');
			html.push('	</div>');
			html.push('	<div class="timeline-body">');
			html.push('		<div class="timeline-body-arrow">');
			html.push('		</div>');
			html.push('		<div class="timeline-body-head">');
			html.push('			<div class="timeline-body-head-caption">');
			html.push('				<a href="javascript:;" class="timeline-body-title font-blue-madison">');
			html.push(stepname);
			html.push('				</a>');
			html.push('				<span class="timeline-body-time font-grey-cascade">');
			html.push(actiontime+name);
			html.push('				</span>');
			html.push('			</div>');
			html.push('			<div style="float:right">'+wfplogicname+'</div>');
			html.push('		</div>');
			html.push('		<div class="timeline-body-content">');
			html.push('			<span class="font-grey-cascade">');
			html.push(memo);
			html.push('			</span>');
			html.push('		</div>');
			html.push('	</div>');
			html.push('</div>');
		});
		
		me.container.html(html.join(''));
	},
	onDataLoaded:function(data){
		var me = this;
		
		if(data.ret != 0){
			IBiz.alert($IGM('IBIZWFSTEPACTOR.ONDATALOADED.TITLE','加载失败'),$IGM('IBIZWFSTEPACTOR.ONDATALOADED.INFO','加载数据失败,'+data.info,[data.info]),2);
			return;
		}
		me.items = data.items;
		me.renderItems(data.items);
	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizWFTimeline.BEFORELOAD = 'BEFORELOAD';