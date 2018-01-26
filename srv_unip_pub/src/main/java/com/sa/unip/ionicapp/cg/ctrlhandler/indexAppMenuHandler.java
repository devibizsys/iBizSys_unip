/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.cg.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppMobMenuAppMenuModel;
import com.sa.unip.srv.UniPSampleSysModel;


import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IDashboardModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IAppMenuModel;

public class indexAppMenuHandler extends net.ibizsys.paas.ctrlhandler.AppMenuHandlerBase {

    protected IonicAppMobMenuAppMenuModel appMenuModel = null;
    public indexAppMenuHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();

        appMenuModel = (IonicAppMobMenuAppMenuModel)this.getViewController().getCtrlModel("appmenu");
    }

    @Override
    protected IAppMenuModel getAppMenuModel() {
        return this.getRealAppMenuModel();
    }

    protected IonicAppMobMenuAppMenuModel getRealAppMenuModel() {
        return this.appMenuModel ;
    }



}