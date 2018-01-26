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

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_QXJQXJTBChartModel;
import com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel;
import com.sa.unip.srv.ywsp.service.OA_QXJService;
import com.sa.unip.srv.ywsp.dao.OA_QXJDAO;
import com.sa.unip.srv.ywsp.entity.OA_QXJ;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IChartModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 图表控件后台处理基类
 */
public class potalDb_qxjtb_chartHandler extends net.ibizsys.paas.ctrlhandler.ChartHandlerBase {

    protected OA_QXJQXJTBChartModel chartModel = null;
    public potalDb_qxjtb_chartHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        chartModel = (OA_QXJQXJTBChartModel)this.getViewController().getCtrlModel("db_qxjtb_chart");
        super.onInit();
    }

    @Override
    protected IChartModel getChartModel() {
        return this.getRealChartModel();
    }

    protected OA_QXJQXJTBChartModel getRealChartModel() {
        return this.chartModel;
    }

    protected OA_QXJService getRealService() {
        return (OA_QXJService)this.getService();
    }


    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchQXJTB(deDataSetFetchContext);
    }



}