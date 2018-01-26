/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CHRYDefaultSearchFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel;
import com.sa.unip.srv.ywsp.service.OA_CHRYService;
import com.sa.unip.srv.ywsp.dao.OA_CHRYDAO;
import com.sa.unip.srv.ywsp.entity.OA_CHRY;

import net.ibizsys.paas.ctrlmodel.ISearchFormModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_CHRYPickupGridViewSearchFormHandler extends net.ibizsys.paas.ctrlhandler.SearchFormHandlerBase {

    protected OA_CHRYDefaultSearchFormModel searchformModel = null;
    public OA_CHRYPickupGridViewSearchFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        searchformModel  = (OA_CHRYDefaultSearchFormModel)this.getViewController().getCtrlModel("searchform");
        super.onInit();
    }

    @Override
    protected ISearchFormModel getSearchFormModel() {
        return this.getRealSearchFormModel();
    }

    protected OA_CHRYDefaultSearchFormModel getRealSearchFormModel() {
        return this.searchformModel ;
    }

    protected OA_CHRYService getRealService() {
        return (OA_CHRYService)this.getViewController().getService();
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