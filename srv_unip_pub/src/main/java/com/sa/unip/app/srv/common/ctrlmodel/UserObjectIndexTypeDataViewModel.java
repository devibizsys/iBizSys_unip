/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlmodel;


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


import net.ibizsys.paas.control.dataview.IDataViewDataItem;
import net.ibizsys.paas.ctrlmodel.DataViewDataItemModel;

/**
 * 实体[用户对象]数据视图[dataview]部件模型
 */
public class  UserObjectIndexTypeDataViewModel extends net.ibizsys.paas.ctrlmodel.DataViewModelBase {

    public UserObjectIndexTypeDataViewModel()  {
        super();
        this.setName("dataview");
        this.setPageSize(1000);
    }

    private net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel userObjectDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel getUserObjectDEModel() {
        if(this.userObjectDEModel==null) {
            try {
                this.userObjectDEModel = (net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userObjectDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserObjectDEModel();
    }

    /**
     * 准备数据视图项模型
     * @throws Exception
     */
    protected void prepareDataViewDataItems()throws Exception {
        super.prepareDataViewDataItems();
        IDataViewDataItem iDataViewDataItem = null;
        // srfkey
        iDataViewDataItem = this.createDataViewDataItem("srfkey");
        if(iDataViewDataItem==null) {
            DataViewDataItemModel dataViewDataItem = new DataViewDataItemModel();
            dataViewDataItem.setDataView(this);
            dataViewDataItem.setName("srfkey");
            dataViewDataItem.setDataType(25);
            dataViewDataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USEROBJECTID");
            dataViewDataItem.addDataItemParam(dataItemParam0);
            dataViewDataItem.init();
            iDataViewDataItem = dataViewDataItem;
        }
        this.registerDataViewDataItem(iDataViewDataItem);
        // srfmajortext
        iDataViewDataItem = this.createDataViewDataItem("srfmajortext");
        if(iDataViewDataItem==null) {
            DataViewDataItemModel dataViewDataItem = new DataViewDataItemModel();
            dataViewDataItem.setDataView(this);
            dataViewDataItem.setName("srfmajortext");
            dataViewDataItem.setDataType(25);
            dataViewDataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USEROBJECTNAME");
            dataViewDataItem.addDataItemParam(dataItemParam0);
            dataViewDataItem.init();
            iDataViewDataItem = dataViewDataItem;
        }
        this.registerDataViewDataItem(iDataViewDataItem);
    }

}