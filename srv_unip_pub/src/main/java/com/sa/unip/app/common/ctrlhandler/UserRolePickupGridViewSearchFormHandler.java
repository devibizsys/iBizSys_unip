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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleDefaultSearchFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleService;
import net.ibizsys.psrt.srv.common.dao.UserRoleDAO;
import net.ibizsys.psrt.srv.common.entity.UserRole;

import net.ibizsys.paas.ctrlmodel.ISearchFormModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserRolePickupGridViewSearchFormHandler extends net.ibizsys.paas.ctrlhandler.SearchFormHandlerBase {

    protected UserRoleDefaultSearchFormModel searchformModel = null;
    public UserRolePickupGridViewSearchFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        searchformModel  = (UserRoleDefaultSearchFormModel)this.getViewController().getCtrlModel("searchform");
        super.onInit();
    }

    @Override
    protected ISearchFormModel getSearchFormModel() {
        return this.getRealSearchFormModel();
    }

    protected UserRoleDefaultSearchFormModel getRealSearchFormModel() {
        return this.searchformModel ;
    }

    protected UserRoleService getRealService() {
        return (UserRoleService)this.getViewController().getService();
    }

    /**
    * 准备部件成员处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlItemHandlers()throws Exception {
        super.prepareCtrlItemHandlers();

        ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemModel();

        //注册 'n_userroletype_eq'
        IFormItemHandler n_userroletype_eqHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleDefaultSearchFormN_userroletype_eqHandler");
        n_userroletype_eqHandler.init(this.getSearchFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"n_userroletype_eq",n_userroletype_eqHandler);


    }

}