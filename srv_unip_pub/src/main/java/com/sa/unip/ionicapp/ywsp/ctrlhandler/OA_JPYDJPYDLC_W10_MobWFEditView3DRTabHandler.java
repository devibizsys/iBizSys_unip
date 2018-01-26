/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_JPYDJPYDLCMobDRDRTabModel;
import com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel;
import com.sa.unip.srv.ywsp.service.OA_JPYDService;
import com.sa.unip.srv.ywsp.dao.OA_JPYDDAO;
import com.sa.unip.srv.ywsp.entity.OA_JPYD;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.IDRTabModel;

public class OA_JPYDJPYDLC_W10_MobWFEditView3DRTabHandler extends net.ibizsys.paas.ctrlhandler.DRTabHandlerBase {

    protected OA_JPYDJPYDLCMobDRDRTabModel drTabModel = null;
    public OA_JPYDJPYDLC_W10_MobWFEditView3DRTabHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        drTabModel = (OA_JPYDJPYDLCMobDRDRTabModel)this.getViewController().getCtrlModel("drtab");
        super.onInit();
    }

    @Override
    protected IDRTabModel getDRTabModel() {
        return this.getRealDRTabModel();
    }

    protected OA_JPYDJPYDLCMobDRDRTabModel getRealDRTabModel() {
        return this.drTabModel;
    }



}