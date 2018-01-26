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

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CCSQCCSQTBChartModel;
import com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_CCSQService;
import com.sa.unip.srv.ywsp.dao.OA_CCSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_CCSQ;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IChartModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 图表控件后台处理基类
 */
public class potalDb_ccsqtb_chartHandler extends net.ibizsys.paas.ctrlhandler.ChartHandlerBase {

    protected OA_CCSQCCSQTBChartModel chartModel = null;
    public potalDb_ccsqtb_chartHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        chartModel = (OA_CCSQCCSQTBChartModel)this.getViewController().getCtrlModel("db_ccsqtb_chart");
        super.onInit();
    }

    @Override
    protected IChartModel getChartModel() {
        return this.getRealChartModel();
    }

    protected OA_CCSQCCSQTBChartModel getRealChartModel() {
        return this.chartModel;
    }

    protected OA_CCSQService getRealService() {
        return (OA_CCSQService)this.getService();
    }


    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchCCSQTB(deDataSetFetchContext);
    }



}