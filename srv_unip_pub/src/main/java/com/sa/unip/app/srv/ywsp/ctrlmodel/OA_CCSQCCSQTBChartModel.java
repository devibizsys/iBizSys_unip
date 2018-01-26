/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.ywsp.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.ctrlmodel.ChartDataItemModel;
import net.ibizsys.paas.ctrlmodel.ChartAxisModel;
import net.ibizsys.paas.ctrlmodel.ChartSeriesModel;

/**
 * 实体[出差申请]图表[db_ccsqtb_chart]部件模型
 */
public class  OA_CCSQCCSQTBChartModel extends net.ibizsys.paas.ctrlmodel.ChartModelBase {

    public OA_CCSQCCSQTBChartModel()  {
        super();

    }


    private com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel oA_CCSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel getOA_CCSQDEModel() {
        if(this.oA_CCSQDEModel==null) {
            try {
                this.oA_CCSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CCSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CCSQDEModel();
    }



    /**
    * 准备图表数据项模型
    * @throws Exception
    */
    @Override
    protected void prepareChartDataItemModels()throws Exception {
        super.prepareChartDataItemModels();
        // name
        ChartDataItemModel chartDataItem0 = new ChartDataItemModel();
        chartDataItem0.setName("name");
        chartDataItem0.setDataType(25);
        chartDataItem0.setFormat("%1$s");
        chartDataItem0.init(this);
        this.registerChartDataItem(chartDataItem0);
        // daycount
        ChartDataItemModel chartDataItem1 = new ChartDataItemModel();
        chartDataItem1.setName("daycount");
        chartDataItem1.setDataType(25);
        chartDataItem1.setFormat("%1$s");
        chartDataItem1.init(this);
        this.registerChartDataItem(chartDataItem1);
    }


    /**
    * 准备图表坐标轴模型
    * @throws Exception
    */
    @Override
    protected void prepareChartAxisModels()throws Exception {
        super.prepareChartAxisModels();
        // Y坐标轴
        ChartAxisModel chartAxis0 = new ChartAxisModel();
        chartAxis0.setName("Y坐标轴");
        chartAxis0.setCaption("请假天数");
        chartAxis0.setAxisType("numeric");
        chartAxis0.setAxisPos("left");
        chartAxis0.init(this);
        this.registerChartAxisModel(chartAxis0);
        // X坐标轴
        ChartAxisModel chartAxis1 = new ChartAxisModel();
        chartAxis1.setName("X坐标轴");
        chartAxis1.setCaption("姓名");
        chartAxis1.setAxisType("category");
        chartAxis1.setAxisPos("bottom");
        chartAxis1.init(this);
        this.registerChartAxisModel(chartAxis1);
    }

    /**
    * 准备图表序列模型
    * @throws Exception
    */
    @Override
    protected void prepareChartSeriesModels()throws Exception {
        super.prepareChartSeriesModels();
        // CCSQTB
        ChartSeriesModel chartSeries0 = new ChartSeriesModel();
        chartSeries0.setName("CCSQTB");
        chartSeries0.setCaption("出差申请图表");
        chartSeries0.setSeriesType("bar");
        chartSeries0.setCatalogField("name");
        chartSeries0.setValueField("daycount");
        chartSeries0.init(this);
        this.registerChartSeriesModel(chartSeries0);
    }

}