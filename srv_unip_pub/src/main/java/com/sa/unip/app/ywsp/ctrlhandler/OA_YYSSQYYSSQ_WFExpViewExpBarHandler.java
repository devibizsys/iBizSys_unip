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

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_YYSSQexpbarWFExpBarModel;
import com.sa.unip.srv.ywsp.demodel.OA_YYSSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_YYSSQService;
import com.sa.unip.srv.ywsp.dao.OA_YYSSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_YYSSQ;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.pswf.ctrlmodel.IWFExpBarModel;

public class OA_YYSSQYYSSQ_WFExpViewExpBarHandler extends net.ibizsys.pswf.ctrlhandler.WFExpBarHandlerBase {

    protected OA_YYSSQexpbarWFExpBarModel wfExpBarModel = null;
    public OA_YYSSQYYSSQ_WFExpViewExpBarHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        wfExpBarModel = (OA_YYSSQexpbarWFExpBarModel)this.getViewController().getCtrlModel("expbar");
        super.onInit();
    }

    @Override
    protected IWFExpBarModel getWFExpBarModel() {
        return this.getRealWFExpBarModel();
    }

    protected OA_YYSSQexpbarWFExpBarModel getRealWFExpBarModel() {
        return this.wfExpBarModel;
    }



}