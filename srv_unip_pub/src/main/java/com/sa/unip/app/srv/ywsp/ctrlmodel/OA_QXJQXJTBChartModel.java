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
 * 实体[请休假]图表[db_qxjtb_chart]部件模型
 */
public class  OA_QXJQXJTBChartModel extends net.ibizsys.paas.ctrlmodel.ChartModelBase {

    public OA_QXJQXJTBChartModel()  {
        super();

    }


    private com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel oA_QXJDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel getOA_QXJDEModel() {
        if(this.oA_QXJDEModel==null) {
            try {
                this.oA_QXJDEModel = (com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_QXJDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_QXJDEModel();
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
        // qxjcs
        ChartDataItemModel chartDataItem1 = new ChartDataItemModel();
        chartDataItem1.setName("qxjcs");
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
        // X坐标轴
        ChartAxisModel chartAxis0 = new ChartAxisModel();
        chartAxis0.setName("X坐标轴");
        chartAxis0.setCaption("姓名");
        chartAxis0.setAxisType("category");
        chartAxis0.setAxisPos("bottom");
        chartAxis0.init(this);
        this.registerChartAxisModel(chartAxis0);
        // Y坐标轴
        ChartAxisModel chartAxis1 = new ChartAxisModel();
        chartAxis1.setName("Y坐标轴");
        chartAxis1.setCaption("请假次数");
        chartAxis1.setAxisType("numeric");
        chartAxis1.setAxisPos("left");
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
        // QXJTB
        ChartSeriesModel chartSeries0 = new ChartSeriesModel();
        chartSeries0.setName("QXJTB");
        chartSeries0.setCaption("");
        chartSeries0.setSeriesType("bar");
        chartSeries0.setCatalogField("name");
        chartSeries0.setValueField("qxjcs");
        chartSeries0.init(this);
        this.registerChartSeriesModel(chartSeries0);
    }

}