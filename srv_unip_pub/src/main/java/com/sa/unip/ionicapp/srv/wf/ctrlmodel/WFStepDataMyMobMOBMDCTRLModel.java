/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.wf.ctrlmodel;


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

import net.ibizsys.paas.ctrlmodel.ListDataItemModel;

/**
 * 实体[工作流步骤数据]移动端数据列表[mdctrl]部件模型
 */
public class  WFStepDataMyMobMOBMDCTRLModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public WFStepDataMyMobMOBMDCTRLModel()  {
        super();
        this.setPageSize(1000);
    }
    private net.ibizsys.psrt.srv.wf.demodel.WFStepDataDEModel wFStepDataDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFStepDataDEModel getWFStepDataDEModel() {
        if(this.wFStepDataDEModel==null) {
            try {
                this.wFStepDataDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFStepDataDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFStepDataDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFStepDataDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFStepDataDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // memo
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("memo");
        listDataItem0.setDataType(21);
        listDataItem0.setFormat("%1$s");


        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // actorname
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("actorname");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");


        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // actiontimed
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("actiontimed");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$td");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("actiontime");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // actiontime
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("actiontime");
        listDataItem3.setDataType(5);
        listDataItem3.setFormat("%1$tH:%1$tM");


        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
        // actiontimem
        ListDataItemModel listDataItem4 = new ListDataItemModel();
        listDataItem4.setName("actiontimem");
        listDataItem4.setDataType(25);
        listDataItem4.setFormat("%1$tm");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("actiontime");
            dataItemParam0.setDataItem(listDataItem4);
            listDataItem4.addDataItemParam(dataItemParam0);
        }

        listDataItem4.init(this);
        this.registerListDataItem(listDataItem4);
        // srfkey
        ListDataItemModel listDataItem5 = new ListDataItemModel();
        listDataItem5.setName("srfkey");
        listDataItem5.setDataType(25);
        listDataItem5.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPDATAID");
            dataItemParam0.setDataItem(listDataItem5);
            listDataItem5.addDataItemParam(dataItemParam0);
        }

        listDataItem5.init(this);
        this.registerListDataItem(listDataItem5);
        // srfmajortext
        ListDataItemModel listDataItem6 = new ListDataItemModel();
        listDataItem6.setName("srfmajortext");
        listDataItem6.setDataType(25);
        listDataItem6.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPDATANAME");
            dataItemParam0.setDataItem(listDataItem6);
            listDataItem6.addDataItemParam(dataItemParam0);
        }

        listDataItem6.init(this);
        this.registerListDataItem(listDataItem6);
        // wfinstanceid
        ListDataItemModel listDataItem7 = new ListDataItemModel();
        listDataItem7.setName("wfinstanceid");
        listDataItem7.setDataType(25);
        listDataItem7.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFINSTANCEID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem7);
            listDataItem7.addDataItemParam(dataItemParam0);
        }

        listDataItem7.init(this);
        this.registerListDataItem(listDataItem7);
        // originalwfuserid
        ListDataItemModel listDataItem8 = new ListDataItemModel();
        listDataItem8.setName("originalwfuserid");
        listDataItem8.setDataType(25);
        listDataItem8.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORIGINALWFUSERID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem8);
            listDataItem8.addDataItemParam(dataItemParam0);
        }

        listDataItem8.init(this);
        this.registerListDataItem(listDataItem8);
        // wfstepid
        ListDataItemModel listDataItem9 = new ListDataItemModel();
        listDataItem9.setName("wfstepid");
        listDataItem9.setDataType(25);
        listDataItem9.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(listDataItem9);
            listDataItem9.addDataItemParam(dataItemParam0);
        }

        listDataItem9.init(this);
        this.registerListDataItem(listDataItem9);
    }

}