/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import com.sa.unip.app.srv.sys.ctrlmodel.appMyWFWorkListPortletModel;
import com.sa.unip.srv.UniPSampleSysModel;


import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IDashboardModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IPortletModel;

public class potalDb_myworklistHandler extends net.ibizsys.paas.ctrlhandler.ListPortletHandlerBase {
    protected appMyWFWorkListPortletModel portletModel = null;
    public potalDb_myworklistHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        portletModel  = (appMyWFWorkListPortletModel)this.getViewController().getCtrlModel("db_myworklist");
        super.onInit();
    }

    @Override
    protected IPortletModel getPortletModel() {
        return this.getRealPortletModel();
    }

    protected appMyWFWorkListPortletModel getRealPortletModel() {
        return this.portletModel;
    }



}