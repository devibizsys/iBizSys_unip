function renderNews(rows,ret)
{
	var allitems = rows;
	var gwitems = rows;
	var rsitems = rows;
	var allcount = 50;
	var gwcount = 5;
	var rscount = 12;
	
	
	var content = "";
	content +=("							<div class=\"tabBox\">");
	content +=("								<h3 class=\"bar-aa\">公告<a href=\"#\">更多</a></h3>");
 	content +=("								<ul class=\"tabHead tabHead-ab mg-t-ab\">");
	content +=("									<li class=\"active\">");
	content +=("										<a href=\"#gg_tab_1_1\" data-toggle=\"tab\">");
	content +=("										所有</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_2\" data-toggle=\"tab\">");
	content +=("										集团</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_3\" data-toggle=\"tab\">");
	content +=("										全市</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_4\" data-toggle=\"tab\">");
	content +=("										部门</a>");
	content +=("									</li>");
	content +=("								</ul>");
	content +=("								<div class=\"tab-content tabCont\">");
	content +=("									<div class=\"tab-pane active\" id=\"gg_tab_1_1\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_2\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>222-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_3\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>333-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_4\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>444-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("								</div>");
	content +=("							</div>");
	content +=("");
	return content;
}


function renderDB(rows,ret,list)
{
	var srfrefreshitem=list.getRefName();
	
	var allitems = rows;
	var gwitems = rows;
	var rsitems = rows;
	var allcount = 50;
	var gwcount = 5;
	var rscount = 12;
	
	
	var content = "";
	content +=("							<div class=\"tabBox\">");
	content +=("								<div class=\"bar\">");
	content +=("									<strong class=\"fc-ac fs-ac\">我的待办</strong>");
 	content +=("									<ul class=\"tabHead tabHead-aa\">");
	content +=("										<li class=\"active\">");
	content +=("											<a href=\"#db_tab_1_1\" data-toggle=\"tab\">");
	content +=("											全部("+allcount.toString()+")</a>");
	content +=("										</li>");
	content +=("										<li>");
	content +=("											<a href=\"#db_tab_1_2\" data-toggle=\"tab\">");
	content +=("											公文("+gwcount.toString()+")</a>");
	content +=("										</li>");
	content +=("										<li>");
	content +=("											<a href=\"#db_tab_1_3\" data-toggle=\"tab\">");
	content +=("											人事("+rscount.toString()+")</a>");
	content +=("										</li>");
	content +=("									</ul>");
	content +=("									<span>");
	content +=("									<a href=\"javascript:void(0);\"><i class=\"icon icon-refresh2 ibiz-listrefresh\"></i></a>");
	content +=("									<a href=\"#\">更多</a>");
	content +=("									</span>");
	content +=("								</div>");
	content +=("								<div class=\"tab-content tabCont\">");
	content +=("									<div class=\"tab-pane active\" id=\"db_tab_1_1\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane\" id=\"db_tab_1_2\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>222--"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane\" id=\"db_tab_1_3\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>333--"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("								</div>");
	content +=("							</div>");
	content +=("");
	return content;
}


function renderDY(rows,ret)
{
	var allitems = rows;
	var gwitems = rows;
	var rsitems = rows;
	var allcount = 50;
	var gwcount = 5;
	var rscount = 12;
	
	
	var content = "";
	content +=("							<div class=\"tabBox\">");
	content +=("								<div class=\"bar\">");
	content +=("									<strong class=\"fc-ac fs-ac\">我的待阅</strong>");
 	content +=("									<ul class=\"tabHead tabHead-aa\">");
	content +=("										<li class=\"active\">");
	content +=("											<a href=\"#dy_tab_1_1\" data-toggle=\"tab\">");
	content +=("											全部("+allcount.toString()+")</a>");
	content +=("										</li>");
	content +=("										<li>");
	content +=("											<a href=\"#dy_tab_1_2\" data-toggle=\"tab\">");
	content +=("											公文("+gwcount.toString()+")</a>");
	content +=("										</li>");
	content +=("										<li>");
	content +=("											<a href=\"#dy_tab_1_3\" data-toggle=\"tab\">");
	content +=("											人事("+rscount.toString()+")</a>");
	content +=("										</li>");
	content +=("									</ul>");
	content +=("									<span>");
	content +=("									<a href=\"javascript:void(0);\"><i class=\"icon icon-refresh2 ibiz-listrefresh\"></i></a>");
	content +=("									<a href=\"#\">更多</a>");
	content +=("									</span>");
	content +=("								</div>");
	content +=("								<div class=\"tab-content tabCont\">");
	content +=("									<div class=\"tab-pane active\" id=\"dy_tab_1_1\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane\" id=\"dy_tab_1_2\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>222--"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane\" id=\"dy_tab_1_3\">");
	content +=("										<div class=\"scroller\" style=\"height: 250px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty wait_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>333--"+row.demobxdname+"</span><font>肖行</font><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("								</div>");
	content +=("							</div>");
	content +=("");
	return content;
}

//function renderGG(rows,ret)
function renderGG(rows,ret)
{
	var allitems = rows;
	var gwitems = rows;
	var rsitems = rows;
	var allcount = 50;
	var gwcount = 5;
	var rscount = 12;
	
	
	var content = "";
	content +=("							<div class=\"tabBox\">");
	content +=("								<h3 class=\"bar-aa\">公告<a href=\"#\">更多</a></h3>");
 	content +=("								<ul class=\"tabHead tabHead-ab mg-t-ab\">");
	content +=("									<li class=\"active\">");
	content +=("										<a href=\"#gg_tab_1_1\" data-toggle=\"tab\">");
	content +=("										所有</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_2\" data-toggle=\"tab\">");
	content +=("										集团</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_3\" data-toggle=\"tab\">");
	content +=("										全市</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_4\" data-toggle=\"tab\">");
	content +=("										部门</a>");
	content +=("									</li>");
	content +=("								</ul>");
	content +=("								<div class=\"tab-content tabCont\">");
	content +=("									<div class=\"tab-pane active\" id=\"gg_tab_1_1\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_2\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>222-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_3\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>333-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_4\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>444-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("								</div>");
	content +=("							</div>");
	content +=("");
	return content;
}


function renderXW(rows,ret)
{
	var allitems = rows;
	var gwitems = rows;
	var rsitems = rows;
	var allcount = 50;
	var gwcount = 5;
	var rscount = 12;
	
	
	var content = "";
	content +=("							<div class=\"tabBox\">");
	content +=("								<h3 class=\"bar-aa\">公告<a href=\"#\">更多</a></h3>");
 	content +=("								<ul class=\"tabHead tabHead-ab mg-t-ab\">");
	content +=("									<li class=\"active\">");
	content +=("										<a href=\"#gg_tab_1_1\" data-toggle=\"tab\">");
	content +=("										所有</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_2\" data-toggle=\"tab\">");
	content +=("										集团</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_3\" data-toggle=\"tab\">");
	content +=("										全市</a>");
	content +=("									</li>");
	content +=("									<li>");
	content +=("										<a href=\"#gg_tab_1_4\" data-toggle=\"tab\">");
	content +=("										部门</a>");
	content +=("									</li>");
	content +=("								</ul>");
	content +=("								<div class=\"tab-content tabCont\">");
	content +=("									<div class=\"tab-pane active\" id=\"gg_tab_1_1\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_2\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>222-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_3\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>333-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("									<div class=\"tab-pane \" id=\"gg_tab_1_4\">");
	content +=("										<div class=\"scroller\" style=\"height: 240px;\" data-always-visible=\"1\" data-rail-visible=\"0\">");
	content +=("											<DIV class=\"tabSameSty notice_list_a\"><ul>");
	for(var i=0;i<allitems.length;i++)
	{
		var row = allitems[i];
		content +=("												<li>");
		content +=("													<a href=\"#\"><span>444-"+row.demobxdname+"</span><time>2014-10-12</time></a>");
		content +=("												</li>");
	}
	
	content +=("											</ul></div>");
	content +=("										</div>");
	content +=("									</div>");
	content +=("								</div>");
	content +=("							</div>");
	content +=("");
	return content;
}



function renderXX(rows,ret)
{
	var xxitems = rows;
	var xxcount = 0;
	if(ret.xxcount!=undefined)
		xxcount = ret.xxcount;
	var content = "";
	content +=("							<div class=\"msg\">");
	content +=("								<h3 >消息提醒</h3>");
 	content +=("								<ul >");
	content +=("									<li><a href=\"#\">你有<span>"+xxcount.toString()+"</span>封未读邮件<i class=\"icon icon-look\"></i></a></li>");
	content +=("								</ul>");
	content +=("							</div>");
	content +=("");
	return content;
}
