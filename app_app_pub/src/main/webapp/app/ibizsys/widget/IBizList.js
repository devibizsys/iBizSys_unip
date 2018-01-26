/**
 * 列表
 */
var IBizList = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.reload();
		if(me.timer >1000){
			setInterval(function(){me.reload();},me.timer);
		}
	},
	renderData:function(data){
		var me = this;
		var html;
		if(me.config.render){
			html = me.config.render(data.items,data,me);
		}	
		if(html){
			$('#'+me.getId()).html(html);
		}
		me.initSlimScroll('.scroller');
		$('#'+me.getId()).find(".ibiz-listrefresh").click(function(e){
			me.reload();
		})
		
	},
	reload:function(){
		var me = this;
		var url = me.config.url;
		IBiz.ajax({url:url,
			params:{srfaction:'FETCH'},
			method:'POST',
			success:function(data){
				if(data.ret == 0){
					if(data.items){
						me.renderData(data);
					}
				}else{
					IBiz.alert($IGM('IBIZLIST.RELOAD.TITLE','加载失败'),$IGM('IBIZLIST.RELOAD.INFO','加载数据失败,'+data.info,[data.info]),2);
					
				}	
			},failure:function(data){
				$('#'+me.getId()).html($IGM('IBIZLIST.RELOAD.TITLE','加载失败'));
				//IBiz.alert('加载数据失败',data,2);
			}
		});
	},
	/**
	 * 初始化滚动条
	 */
	initSlimScroll: function(el) {
        $(el).each(function() {
            var height;
            if ($(this).attr("data-height")){
                height = $(this).attr("data-height");
            }else{
                height = $(this).css('height');
            }
            $(this).slimScroll({
                height: height
            });
        });
	}
});