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
 * 实体[消息发送队列（历史）]数据表格[grid]部件模型
 */
public class  MsgSendQueueHisMain2GridModel extends net.ibizsys.paas.ctrlmodel.GridModelBase {

    public MsgSendQueueHisMain2GridModel()  {
        super();
        this.setName("grid");
    }

    private net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel msgSendQueueHisDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel getMsgSendQueueHisDEModel() {
        if(this.msgSendQueueHisDEModel==null) {
            try {
                this.msgSendQueueHisDEModel = (net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel");
            } catch(Exception ex) {
            }
        }
        return this.msgSendQueueHisDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getMsgSendQueueHisDEModel();
    }


    /**
     * 准备表格列模型
     * @throws Exception
     */
    @Override
    protected void prepareGridColumnModels()throws Exception {
        super.prepareGridColumnModels();
        IGridColumn iGridColumn = null;
        //建立表格列 消息标题
        iGridColumn = createGridColumn("subject");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("subject");
            gridColumnModel.setDataItemName("subject");
            gridColumnModel.setCaption("消息标题");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 消息类型
        iGridColumn = createGridColumn("msgtype");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("msgtype");
            gridColumnModel.setDataItemName("msgtype");
            gridColumnModel.setCaption("消息类型");
            gridColumnModel.setCodeListId("net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 全部地址
        iGridColumn = createGridColumn("totaldstaddresses");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("totaldstaddresses");
            gridColumnModel.setDataItemName("totaldstaddresses");
            gridColumnModel.setCaption("全部地址");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 建立时间
        iGridColumn = createGridColumn("createdate");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("createdate");
            gridColumnModel.setDataItemName("createdate");
            gridColumnModel.setCaption("建立时间");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 处理时间
        iGridColumn = createGridColumn("processtime");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("processtime");
            gridColumnModel.setDataItemName("processtime");
            gridColumnModel.setCaption("处理时间");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 处理错误
        iGridColumn = createGridColumn("iserror");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("iserror");
            gridColumnModel.setDataItemName("iserror");
            gridColumnModel.setCaption("处理错误");
            gridColumnModel.setCodeListId("com.sa.unip.srv.codelist.CodeList50CodeListModel");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 是否发送
        iGridColumn = createGridColumn("issend");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("issend");
            gridColumnModel.setDataItemName("issend");
            gridColumnModel.setCaption("是否发送");
            gridColumnModel.setCodeListId("com.sa.unip.srv.codelist.CodeList50CodeListModel");

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
        //建立数据项 issend
        iGridDataItem = createGridDataItem("issend");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("issend");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ISSEND");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 totaldstaddresses
        iGridDataItem = createGridDataItem("totaldstaddresses");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("totaldstaddresses");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("TOTALDSTADDRESSES");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 msgsendqueuehisid
        iGridDataItem = createGridDataItem("msgsendqueuehisid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("msgsendqueuehisid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MSGSENDQUEUEHISID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 processtime
        iGridDataItem = createGridDataItem("processtime");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("processtime");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("PROCESSTIME");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 msgtype
        iGridDataItem = createGridDataItem("msgtype");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("msgtype");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MSGTYPE");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 subject
        iGridDataItem = createGridDataItem("subject");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("subject");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("SUBJECT");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 createdate
        iGridDataItem = createGridDataItem("createdate");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("createdate");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("CREATEDATE");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 iserror
        iGridDataItem = createGridDataItem("iserror");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("iserror");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ISERROR");
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
            dataItemParam0.setName("MSGSENDQUEUEHISID");
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
            dataItemParam0.setName("MSGSENDQUEUEHISNAME");
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
            dataItemParam0.setName("MSGSENDQUEUEHISID");
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
            gridEditItem.setDEFName("MSGSENDQUEUEHISID");
            gridEditItem.setEnableCond(0);
            gridEditItem.setCaption("消息发送队列（历史）标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("MSGSENDQUEUEHISID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            gridEditItem.setDataItem(dataItem);
            gridEditItem.init();
            iGridEditItem = gridEditItem;
        }
        this.registerGridEditItem(iGridEditItem);

    }


}