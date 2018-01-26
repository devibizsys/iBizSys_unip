/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.wf.ctrlmodel;


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
 * 实体[工作流工作列表]数据列表[db_myworklist_list]部件模型
 */
public class  WFWorkListMyWorkListListModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public WFWorkListMyWorkListListModel()  {
        super();
        this.setPageSize(1000);
    }
    private com.sa.unip.srv.subsys.demodel.WFWorkListDEModel wFWorkListDEModel;
    protected  com.sa.unip.srv.subsys.demodel.WFWorkListDEModel getWFWorkListDEModel() {
        if(this.wFWorkListDEModel==null) {
            try {
                this.wFWorkListDEModel = (com.sa.unip.srv.subsys.demodel.WFWorkListDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.WFWorkListDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFWorkListDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFWorkListDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // userdatainfo
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("userdatainfo");
        listDataItem0.setDataType(25);
        listDataItem0.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("userdatainfo");
            dataItemParam0.setDataItem(listDataItem0);
            listDataItem0.addDataItemParam(dataItemParam0);
        }

        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // userdata4
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("userdata4");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("userdata4");
            dataItemParam0.setDataItem(listDataItem1);
            listDataItem1.addDataItemParam(dataItemParam0);
        }

        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // wfinstancename
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("wfinstancename");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("wfinstancename");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // createdate
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("createdate");
        listDataItem3.setDataType(5);
        listDataItem3.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("createdate");
            dataItemParam0.setDataItem(listDataItem3);
            listDataItem3.addDataItemParam(dataItemParam0);
        }

        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
        // wfstepname
        ListDataItemModel listDataItem4 = new ListDataItemModel();
        listDataItem4.setName("wfstepname");
        listDataItem4.setDataType(25);
        listDataItem4.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("wfstepname");
            dataItemParam0.setDataItem(listDataItem4);
            listDataItem4.addDataItemParam(dataItemParam0);
        }

        listDataItem4.init(this);
        this.registerListDataItem(listDataItem4);
        // userdata
        ListDataItemModel listDataItem5 = new ListDataItemModel();
        listDataItem5.setName("userdata");
        listDataItem5.setDataType(25);
        listDataItem5.setFormat("%1$s");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("userdata");
            dataItemParam0.setDataItem(listDataItem5);
            listDataItem5.addDataItemParam(dataItemParam0);
        }

        listDataItem5.init(this);
        this.registerListDataItem(listDataItem5);
    }

}