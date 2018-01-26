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
 * 实体[工作流步骤数据]数据表格[grid]部件模型
 */
public class  WFStepDataMain2GridModel extends net.ibizsys.paas.ctrlmodel.GridModelBase {

    public WFStepDataMain2GridModel()  {
        super();
        this.setName("grid");
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
     * 准备表格列模型
     * @throws Exception
     */
    @Override
    protected void prepareGridColumnModels()throws Exception {
        super.prepareGridColumnModels();
        IGridColumn iGridColumn = null;
        //建立表格列 操作人名称
        iGridColumn = createGridColumn("actorname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("actorname");
            gridColumnModel.setDataItemName("actorname");
            gridColumnModel.setCaption("操作人名称");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 操作人
        iGridColumn = createGridColumn("actorid");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("actorid");
            gridColumnModel.setDataItemName("actorid");
            gridColumnModel.setCaption("操作人");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 操作时间
        iGridColumn = createGridColumn("actiontime");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("actiontime");
            gridColumnModel.setDataItemName("actiontime");
            gridColumnModel.setCaption("操作时间");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 内容
        iGridColumn = createGridColumn("memo");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("memo");
            gridColumnModel.setDataItemName("memo");
            gridColumnModel.setCaption("内容");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 代办人
        iGridColumn = createGridColumn("sdparam2");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("sdparam2");
            gridColumnModel.setDataItemName("sdparam2");
            gridColumnModel.setCaption("代办人");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 SDPARAM
        iGridColumn = createGridColumn("sdparam");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("sdparam");
            gridColumnModel.setDataItemName("sdparam");
            gridColumnModel.setCaption("SDPARAM");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 下一步
        iGridColumn = createGridColumn("nextto");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("nextto");
            gridColumnModel.setDataItemName("nextto");
            gridColumnModel.setCaption("下一步");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 用户数据标识
        iGridColumn = createGridColumn("userdata");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("userdata");
            gridColumnModel.setDataItemName("userdata");
            gridColumnModel.setCaption("用户数据标识");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 用户数据
        iGridColumn = createGridColumn("userdatadesc");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("userdatadesc");
            gridColumnModel.setDataItemName("userdatadesc");
            gridColumnModel.setCaption("用户数据");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 WFInstanceId
        iGridColumn = createGridColumn("wfinstanceid");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfinstanceid");
            gridColumnModel.setDataItemName("wfinstanceid");
            gridColumnModel.setCaption("WFInstanceId");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 流程实例
        iGridColumn = createGridColumn("wfinstancename");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfinstancename");
            gridColumnModel.setDataItemName("wfinstancename");
            gridColumnModel.setCaption("流程实例");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 执行步骤
        iGridColumn = createGridColumn("wfplogicname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfplogicname");
            gridColumnModel.setDataItemName("wfplogicname");
            gridColumnModel.setCaption("执行步骤");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 流程操作
        iGridColumn = createGridColumn("wfstepdataname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfstepdataname");
            gridColumnModel.setDataItemName("wfstepdataname");
            gridColumnModel.setCaption("流程操作");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 步骤数据_相关步骤
        iGridColumn = createGridColumn("wfstepid");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfstepid");
            gridColumnModel.setDataItemName("wfstepid");
            gridColumnModel.setCaption("步骤数据_相关步骤");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 步骤名称
        iGridColumn = createGridColumn("wfstepname");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("wfstepname");
            gridColumnModel.setDataItemName("wfstepname");
            gridColumnModel.setCaption("步骤名称");

            gridColumnModel.init(this);
            iGridColumn = gridColumnModel;
        }
        this.registerGridColumn(iGridColumn);
        //建立表格列 代办人名称
        iGridColumn = createGridColumn("actorname2");
        if(iGridColumn==null) {
            GridColumnModel gridColumnModel = new GridColumnModel();
            gridColumnModel.setName("actorname2");
            gridColumnModel.setDataItemName("actorname2");
            gridColumnModel.setCaption("代办人名称");

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
        //建立数据项 wfstepdataid
        iGridDataItem = createGridDataItem("wfstepdataid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfstepdataid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPDATAID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 actorname2
        iGridDataItem = createGridDataItem("actorname2");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("actorname2");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ACTORNAME2");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfinstancename
        iGridDataItem = createGridDataItem("wfinstancename");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfinstancename");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFINSTANCENAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 nextto
        iGridDataItem = createGridDataItem("nextto");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("nextto");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("NEXTTO");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfstepdataname
        iGridDataItem = createGridDataItem("wfstepdataname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfstepdataname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPDATANAME");
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
        //建立数据项 wfinstanceid
        iGridDataItem = createGridDataItem("wfinstanceid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfinstanceid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFINSTANCEID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfplogicname
        iGridDataItem = createGridDataItem("wfplogicname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfplogicname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFPLOGICNAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 userdatadesc
        iGridDataItem = createGridDataItem("userdatadesc");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("userdatadesc");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERDATADESC");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 sdparam2
        iGridDataItem = createGridDataItem("sdparam2");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("sdparam2");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("SDPARAM2");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfstepid
        iGridDataItem = createGridDataItem("wfstepid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfstepid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPID");
            dataItemParam0.setFormat("%1$s");
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
            dataItemParam0.setName("WFSTEPDATAID");
            dataItemParam0.setFormat("");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
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
            dataItemParam0.setName("WFSTEPDATANAME");
            dataItemParam0.setFormat("");
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
            dataItemParam0.setName("WFSTEPDATAID");
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
        //建立数据项 originalwfuserid
        iGridDataItem = createGridDataItem("originalwfuserid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("originalwfuserid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ORIGINALWFUSERID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 userdata
        iGridDataItem = createGridDataItem("userdata");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("userdata");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("USERDATA");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 actiontime
        iGridDataItem = createGridDataItem("actiontime");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("actiontime");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ACTIONTIME");
            dataItemParam0.setFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 sdparam
        iGridDataItem = createGridDataItem("sdparam");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("sdparam");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("SDPARAM");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 wfstepname
        iGridDataItem = createGridDataItem("wfstepname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("wfstepname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPNAME");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 actorid
        iGridDataItem = createGridDataItem("actorid");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("actorid");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ACTORID");
            dataItemParam0.setFormat("%1$s");
            dataItemParam0.setDataItem(gridDataItemModel);
            gridDataItemModel.addDataItemParam(dataItemParam0);
            gridDataItemModel.init(this);
            iGridDataItem = gridDataItemModel;
        }
        this.registerGridDataItem(iGridDataItem);
        //建立数据项 actorname
        iGridDataItem = createGridDataItem("actorname");
        if(iGridDataItem == null) {
            GridDataItemModel gridDataItemModel = new GridDataItemModel();
            gridDataItemModel.setName("actorname");
            DataItemParamModel  dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("ACTORNAME");
            dataItemParam0.setFormat("%1$s");
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
            gridEditItem.setDEFName("WFSTEPDATAID");
            gridEditItem.setCaption("工作流步骤数据标识");

            //设置数据项参数
            DataItemModel dataItem = new DataItemModel();
            dataItem.setName("srfkey");
            dataItem.setDataType(25);
            dataItem.setFormat("%1$s");
            //注册参数
            DataItemParamModel dataItemParam0 = new DataItemParamModel();
            dataItemParam0.setName("WFSTEPDATAID");
            dataItemParam0.setFormat("%1$s");
            dataItem.addDataItemParam(dataItemParam0);
            gridEditItem.setDataItem(dataItem);
            gridEditItem.init();
            iGridEditItem = gridEditItem;
        }
        this.registerGridEditItem(iGridEditItem);

    }


}