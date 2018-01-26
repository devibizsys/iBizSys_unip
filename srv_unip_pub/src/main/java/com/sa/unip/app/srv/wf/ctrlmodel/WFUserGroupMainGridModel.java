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

import net.ibizsys.paas.control.grid.IGridColumn;
import net.ibizsys.paas.control.grid.IGridDataItem;
import net.ibizsys.paas.control.grid.IGridEditItem;
import net.ibizsys.paas.ctrlmodel.GridColumnModel;
import net.ibizsys.paas.ctrlmodel.GridDataItemModel;
import net.ibizsys.paas.ctrlmodel.GridEditItemModel;

/**
 * 实体[工作流用户组]数据表格[grid]部件模型
 */
public class  WFUserGroupMainGridModel extends net.ibizsys.paas.ctrlmodel.GridModelBase {

    public WFUserGroupMainGridModel()  {
        super();
        this.setName("grid");
    }

    private net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel wFUserGroupDEModel;
    protected  net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel getWFUserGroupDEModel() {
        if(this.wFUserGroupDEModel==null) {
            try {
                this.wFUserGroupDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFUserGroupDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWFUserGroupDEModel();
    }


    /**
     * 准备表格列模型
     * @throws Exception
     */
    @Override
    protected void prepareGridColumnModels()throws Exception {
        super.prepareGridColumnModels();
        IGridColumn iGridColumn = null;
        //建立表格列 用户组名称
        iGridColumn = createGridColumn("wfusergroupname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfusergroupname");
            gridColumnModel.setDataItemName("wfusergroupname");
            gridColumnModel.setCaption("用户组名称");

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
        //建立数据项 wfusergroupname
        iGridDataItem = createGridDataItem("wfusergroupname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfusergroupname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFUSERGROUPNAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfusergroupid
        iGridDataItem = createGridDataItem("wfusergroupid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfusergroupid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFUSERGROUPID");
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
        //建立数据项 srfdataaccaction
        iGridDataItem = createGridDataItem("srfdataaccaction");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("srfdataaccaction");
            gridDataItemModel.setDataAccessAction(true);
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFUSERGROUPID");
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
            dataItemParam0.setName("WFUSERGROUPNAME");
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
            dataItemParam0.setName("WFUSERGROUPID");
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
            gridEditItem.setDEFName("WFUSERGROUPID");
            gridEditItem.setCaption("工作流用户组标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFUSERGROUPID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            gridEditItem.setDataItem(dataItem);
            gridEditItem.init();
            iGridEditItem = gridEditItem;
        }
        this.registerGridEditItem(iGridEditItem);

    }


}