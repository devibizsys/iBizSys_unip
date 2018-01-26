/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.jcsj.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.jcsj.ctrlmodel.OA_CLDefaultSearchFormModel;
import com.sa.unip.srv.jcsj.demodel.OA_CLDEModel;
import com.sa.unip.srv.jcsj.service.OA_CLService;
import com.sa.unip.srv.jcsj.dao.OA_CLDAO;
import com.sa.unip.srv.jcsj.entity.OA_CL;

import net.ibizsys.paas.ctrlmodel.ISearchFormModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_CLPickupGridViewSearchFormHandler extends net.ibizsys.paas.ctrlhandler.SearchFormHandlerBase {

    protected OA_CLDefaultSearchFormModel searchformModel = null;
    public OA_CLPickupGridViewSearchFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        searchformModel  = (OA_CLDefaultSearchFormModel)this.getViewController().getCtrlModel("searchform");
        super.onInit();
    }

    @Override
    protected ISearchFormModel getSearchFormModel() {
        return this.getRealSearchFormModel();
    }

    protected OA_CLDefaultSearchFormModel getRealSearchFormModel() {
        return this.searchformModel ;
    }

    protected OA_CLService getRealService() {
        return (OA_CLService)this.getViewController().getService();
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