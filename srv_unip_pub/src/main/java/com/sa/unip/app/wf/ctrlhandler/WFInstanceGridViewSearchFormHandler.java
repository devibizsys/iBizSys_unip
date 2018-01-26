/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.wf.ctrlmodel.WFInstanceDefaultSearchFormModel;
import net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel;
import net.ibizsys.psrt.srv.wf.service.WFInstanceService;
import net.ibizsys.psrt.srv.wf.dao.WFInstanceDAO;
import net.ibizsys.psrt.srv.wf.entity.WFInstance;

import net.ibizsys.paas.ctrlmodel.ISearchFormModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WFInstanceGridViewSearchFormHandler extends net.ibizsys.paas.ctrlhandler.SearchFormHandlerBase {

    protected WFInstanceDefaultSearchFormModel searchformModel = null;
    public WFInstanceGridViewSearchFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        searchformModel  = (WFInstanceDefaultSearchFormModel)this.getViewController().getCtrlModel("searchform");
        super.onInit();
    }

    @Override
    protected ISearchFormModel getSearchFormModel() {
        return this.getRealSearchFormModel();
    }

    protected WFInstanceDefaultSearchFormModel getRealSearchFormModel() {
        return this.searchformModel ;
    }

    protected WFInstanceService getRealService() {
        return (WFInstanceService)this.getViewController().getService();
    }

    /**
    * 准备部件成员处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlItemHandlers()throws Exception {
        super.prepareCtrlItemHandlers();

        ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemModel();

        //注册 'n_wfworkflowname_eq'
        IFormItemHandler n_wfworkflowname_eqHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFInstanceDefaultSearchFormN_wfworkflowname_eqHandler");
        n_wfworkflowname_eqHandler.init(this.getSearchFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"n_wfworkflowname_eq",n_wfworkflowname_eqHandler);


    }

}