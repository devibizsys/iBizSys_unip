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

import com.sa.unip.app.srv.common.ctrlmodel.CodeListDR2DRTabModel;
import net.ibizsys.psrt.srv.common.demodel.CodeListDEModel;
import net.ibizsys.psrt.srv.common.service.CodeListService;
import net.ibizsys.psrt.srv.common.dao.CodeListDAO;
import net.ibizsys.psrt.srv.common.entity.CodeList;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IDRTabModel;

public class CodeListEditView3DRTabHandler extends net.ibizsys.paas.ctrlhandler.DRTabHandlerBase {

    protected CodeListDR2DRTabModel drTabModel = null;
    public CodeListEditView3DRTabHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        drTabModel = (CodeListDR2DRTabModel)this.getViewController().getCtrlModel("drtab");
        super.onInit();
    }

    @Override
    protected IDRTabModel getDRTabModel() {
        return this.getRealDRTabModel();
    }

    protected CodeListDR2DRTabModel getRealDRTabModel() {
        return this.drTabModel;
    }



}