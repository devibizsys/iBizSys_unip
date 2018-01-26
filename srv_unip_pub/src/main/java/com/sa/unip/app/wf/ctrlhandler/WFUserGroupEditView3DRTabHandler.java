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

import com.sa.unip.app.srv.wf.ctrlmodel.WFUserGroupDR2DRTabModel;
import net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel;
import net.ibizsys.psrt.srv.wf.service.WFUserGroupService;
import net.ibizsys.psrt.srv.wf.dao.WFUserGroupDAO;
import net.ibizsys.psrt.srv.wf.entity.WFUserGroup;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IDRTabModel;

public class WFUserGroupEditView3DRTabHandler extends net.ibizsys.paas.ctrlhandler.DRTabHandlerBase {

    protected WFUserGroupDR2DRTabModel drTabModel = null;
    public WFUserGroupEditView3DRTabHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        drTabModel = (WFUserGroupDR2DRTabModel)this.getViewController().getCtrlModel("drtab");
        super.onInit();
    }

    @Override
    protected IDRTabModel getDRTabModel() {
        return this.getRealDRTabModel();
    }

    protected WFUserGroupDR2DRTabModel getRealDRTabModel() {
        return this.drTabModel;
    }



}