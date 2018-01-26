/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.xxtz.ctrlmodel;


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
import net.ibizsys.paas.datamodel.DataItemParamModel;


/**
 * 实体[通知公告]数据列表[db_tzgg_list]部件模型
 */
public class  OA_TZGGTZGG_MHListModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public OA_TZGGTZGG_MHListModel()  {
        super();
        this.setPageSize(1000);
    }
    private com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel oA_TZGGDEModel;
    protected  com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel getOA_TZGGDEModel() {
        if(this.oA_TZGGDEModel==null) {
            try {
                this.oA_TZGGDEModel = (com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_TZGGDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_TZGGDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // createdate
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("createdate");
        listDataItem0.setDataType(5);
        listDataItem0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("createdate");
            dataItemParam0.setDataItem(listDataItem0);
            listDataItem0.addDataItemParam(dataItemParam0);
        }

        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // tzggname
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("tzggname");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("oa_tzggname");
            dataItemParam0.setDataItem(listDataItem1);
            listDataItem1.addDataItemParam(dataItemParam0);
        }

        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // content
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("content");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("content");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // tzggid
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("tzggid");
        listDataItem3.setDataType(25);
        listDataItem3.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("oa_tzggid");
            dataItemParam0.setDataItem(listDataItem3);
            listDataItem3.addDataItemParam(dataItemParam0);
        }

        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
    }

}