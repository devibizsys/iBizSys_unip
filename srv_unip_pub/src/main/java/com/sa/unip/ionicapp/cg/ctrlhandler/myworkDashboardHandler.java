/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.cg.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import com.sa.unip.ionicapp.cg.ctrlmodel.myworkDashboardModel;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IDashboardModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 应用视图[移动办公辅助系统]数据看板dashboard部件后台处理对象
 */
public class myworkDashboardHandler extends net.ibizsys.paas.ctrlhandler.DashboardHandlerBase {

    protected myworkDashboardModel dashboardModel = null;
    public myworkDashboardHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();

        dashboardModel  = (myworkDashboardModel)this.getViewController().getCtrlModel("dashboard");
    }

    @Override
    protected IDashboardModel getDashboardModel() {
        return this.getRealDashboardModel();
    }

    protected myworkDashboardModel getRealDashboardModel() {
        return this.dashboardModel;
    }



}