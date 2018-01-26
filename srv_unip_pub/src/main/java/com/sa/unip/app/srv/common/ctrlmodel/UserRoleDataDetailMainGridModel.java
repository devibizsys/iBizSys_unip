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

import net.ibizsys.paas.control.grid.IGridColumn;
import net.ibizsys.paas.control.grid.IGridDataItem;
import net.ibizsys.paas.control.grid.IGridEditItem;
import net.ibizsys.paas.ctrlmodel.GridColumnModel;
import net.ibizsys.paas.ctrlmodel.GridDataItemModel;
import net.ibizsys.paas.ctrlmodel.GridEditItemModel;

/**
 * 实体[数据对象能力明细]数据表格[grid]部件模型
 */
public class  UserRoleDataDetailMainGridModel extends net.ibizsys.paas.ctrlmodel.GridModelBase {

    public UserRoleDataDetailMainGridModel()  {
        super();
        this.setName("grid");
    }

    private net.ibizsys.psrt.srv.common.demodel.UserRoleDataDetailDEModel userRoleDataDetailDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserRoleDataDetailDEModel getUserRoleDataDetailDEModel() {
        if(this.userRoleDataDetailDEModel==null) {
            try {
                this.userRoleDataDetailDEModel = (net.ibizsys.psrt.srv.common.demodel.UserRoleDataDetailDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserRoleDataDetailDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userRoleDataDetailDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserRoleDataDetailDEModel();
    }


    /**
     * 准备表格列模型
     * @throws Exception
     */
    @Override
    protected void prepareGridColumnModels()throws Exception {
        super.prepareGridColumnModels();
        IGridColumn iGridColumn = null;
        //建立表格列 数据对象能力
        iGridColumn = createGridColumn("userroledataname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("userroledataname");
            gridColumnModel.setDataItemName("userroledataname");
            gridColumnModel.setCaption("数据对象能力");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 查询模型
        iGridColumn = createGridColumn("querymodelname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("querymodelname");
            gridColumnModel.setDataItemName("querymodelname");
            gridColumnModel.setCaption("查询模型");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 排除数据范围
        iGridColumn = createGridColumn("isexclude");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("isexclude");
            gridColumnModel.setDataItemName("isexclude");
            gridColumnModel.setCaption("排除数据范围");
            gridColumnModel.setCodeListId("com.sa.unip.srv.codelist.YesNoCodeListModel");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 备注
        iGridColumn = createGridColumn("memo");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("memo");
            gridColumnModel.setDataItemName("memo");
            gridColumnModel.setCaption("备注");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 更新人
        iGridColumn = createGridColumn("updateman");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("updateman");
            gridColumnModel.setDataItemName("updateman");
            gridColumnModel.setCaption("更新人");
            gridColumnModel.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 更新时间
        iGridColumn = createGridColumn("updatedate");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("updatedate");
            gridColumnModel.setDataItemName("updatedate");
            gridColumnModel.setCaption("更新时间");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
    }

    /**
     * 准备表格数据项模型
     * @throws Exception
     */
    @Override
    protected void prepareGridDataItemModels()throws Exception {
        super.prepareGridDataItemModels();
        IGridDataItem iGridDataItem = null;
        //建立数据项 userroledatadetailid
        iGridDataItem = createGridDataItem("userroledatadetailid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("userroledatadetailid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATADETAILID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 memo
        iGridDataItem = createGridDataItem("memo");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("memo");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MEMO");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 userroledataid
        iGridDataItem = createGridDataItem("userroledataid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("userroledataid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATAID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 updateman
        iGridDataItem = createGridDataItem("updateman");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("updateman");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("UPDATEMAN");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            //设置代码表 云系统操作者
            dataItemParam0.setCodeListId("14030ff9a11f791829108b42be032ab2");
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 userroledataname
        iGridDataItem = createGridDataItem("userroledataname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("userroledataname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATANAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 isexclude
        iGridDataItem = createGridDataItem("isexclude");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("isexclude");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ISEXCLUDE");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 updatedate
        iGridDataItem = createGridDataItem("updatedate");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("updatedate");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("UPDATEDATE");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 querymodelid
        iGridDataItem = createGridDataItem("querymodelid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("querymodelid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("QUERYMODELID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 querymodelname
        iGridDataItem = createGridDataItem("querymodelname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("querymodelname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("QUERYMODELNAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 srfdataaccaction
        iGridDataItem = createGridDataItem("srfdataaccaction");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("srfdataaccaction");
            gridDataItemModel.setDataAccessAction(true);
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATADETAILID");
            dataItemParam0.setFormat("");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            DataItemParamModel  dataItemParam1 = new DataItemParamModel();
            dataItemParam1.setName("NONE");
            dataItemParam1.setFormat("");
            dataItemParam1.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam1);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 srfmajortext
        iGridDataItem = createGridDataItem("srfmajortext");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("srfmajortext");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATADETAILNAME");
            dataItemParam0.setFormat("");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 srfkey
        iGridDataItem = createGridDataItem("srfkey");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("srfkey");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATADETAILID");
            dataItemParam0.setFormat("");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
    }

    /**
     * 准备表格编辑项模型
     * @throws Exception
     */
    protected void prepareGridEditItemModels()throws Exception {
        IGridEditItem iGridEditItem = null;
        // srfkey
        iGridEditItem = this.createGridEditItem("srfkey");
        if(iGridEditItem==null) {
            GridEditItemModel gridEditItem = new GridEditItemModel();
            gridEditItem.setGrid(this);
            gridEditItem.setName("srfkey");
            gridEditItem.setDEFName("USERROLEDATADETAILID");
            gridEditItem.setCaption("数据对象能力明细标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERROLEDATADETAILID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            gridEditItem.setDataItem(dataItem);
            gridEditItem.init();
            iGridEditItem = gridEditItem;
        }
        this.registerGridEditItem(iGridEditItem);

    }


}