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
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.common.ctrlmodel.DataSyncOut2DefaultSearchFormModel;
import net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel;
import net.ibizsys.psrt.srv.common.service.DataSyncOut2Service;
import net.ibizsys.psrt.srv.common.dao.DataSyncOut2DAO;
import net.ibizsys.psrt.srv.common.entity.DataSyncOut2;

import net.ibizsys.paas.ctrlmodel.ISearchFormModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class DataSyncOut2GridViewSearchFormHandler extends net.ibizsys.paas.ctrlhandler.SearchFormHandlerBase {

    protected DataSyncOut2DefaultSearchFormModel searchformModel = null;
    public DataSyncOut2GridViewSearchFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        searchformModel  = (DataSyncOut2DefaultSearchFormModel)this.getViewController().getCtrlModel("searchform");
        super.onInit();
    }

    @Override
    protected ISearchFormModel getSearchFormModel() {
        return this.getRealSearchFormModel();
    }

    protected DataSyncOut2DefaultSearchFormModel getRealSearchFormModel() {
        return this.searchformModel ;
    }

    protected DataSyncOut2Service getRealService() {
        return (DataSyncOut2Service)this.getViewController().getService();
    }

    /**
    * 准备部件成员处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlItemHandlers()throws Exception {
        super.prepareCtrlItemHandlers();

        ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemModel();


    }

}