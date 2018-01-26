/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.jcsj.ctrlmodel;


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
 * 实体[车辆]移动端数据列表[mdctrl]部件模型
 */
public class  OA_CLMobMOBMDCTRLModel extends net.ibizsys.paas.ctrlmodel.ListModelBase {

    public OA_CLMobMOBMDCTRLModel()  {
        super();
        this.setPageSize(1000);
    }
    private com.sa.unip.srv.jcsj.demodel.OA_CLDEModel oA_CLDEModel;
    protected  com.sa.unip.srv.jcsj.demodel.OA_CLDEModel getOA_CLDEModel() {
        if(this.oA_CLDEModel==null) {
            try {
                this.oA_CLDEModel = (com.sa.unip.srv.jcsj.demodel.OA_CLDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_CLDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CLDEModel();
    }

    /**
    * 准备列表数据项模型
    * @throws Exception
    */
    protected void prepareListDataItemModels()throws Exception {
        super.prepareListDataItemModels();
        // srftime
        ListDataItemModel listDataItem0 = new ListDataItemModel();
        listDataItem0.setName("srftime");
        listDataItem0.setDataType(25);
        listDataItem0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("sysj");
            dataItemParam0.setDataItem(listDataItem0);
            listDataItem0.addDataItemParam(dataItemParam0);
        }

        listDataItem0.init(this);
        this.registerListDataItem(listDataItem0);
        // srfmajortext
        ListDataItemModel listDataItem1 = new ListDataItemModel();
        listDataItem1.setName("srfmajortext");
        listDataItem1.setDataType(25);
        listDataItem1.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("oa_clname");
            dataItemParam0.setDataItem(listDataItem1);
            listDataItem1.addDataItemParam(dataItemParam0);
        }

        listDataItem1.init(this);
        this.registerListDataItem(listDataItem1);
        // srfsubtitle
        ListDataItemModel listDataItem2 = new ListDataItemModel();
        listDataItem2.setName("srfsubtitle");
        listDataItem2.setDataType(25);
        listDataItem2.setFormat("%1$s");

        //设置代码表 车辆使用情况
        listDataItem2.setCodeListId("B9AA5498-8877-4506-B53C-1E467FDCA21D");
        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("syqk");
            dataItemParam0.setDataItem(listDataItem2);
            listDataItem2.addDataItemParam(dataItemParam0);
        }

        listDataItem2.init(this);
        this.registerListDataItem(listDataItem2);
        // srfkey
        ListDataItemModel listDataItem3 = new ListDataItemModel();
        listDataItem3.setName("srfkey");
        listDataItem3.setDataType(25);
        listDataItem3.setFormat("%1$s");

        if(true) {
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("OA_CLID");
            dataItemParam0.setDataItem(listDataItem3);
            listDataItem3.addDataItemParam(dataItemParam0);
        }

        listDataItem3.init(this);
        this.registerListDataItem(listDataItem3);
    }

}