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

import net.ibizsys.paas.control.drctrl.DRCtrlItem;
import net.ibizsys.paas.control.drctrl.DRCtrlRootItem;

/**
 * 实体[车牌门禁申请]数据分页[drtab]部件模型
 */
public class  OA_CPMJSQCPMJSQLCDRDRTabModel extends net.ibizsys.paas.ctrlmodel.DRTabModelBase {

    public OA_CPMJSQCPMJSQLCDRDRTabModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }


    private com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel oA_CPMJSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel getOA_CPMJSQDEModel() {
        if(this.oA_CPMJSQDEModel==null) {
            try {
                this.oA_CPMJSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CPMJSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_CPMJSQDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 车牌门禁申请
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("车牌门禁申请");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 流程处理
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("dritem1","");
        drCtrlItem1.setText("流程处理");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        drCtrlItem1.setViewParam("srfparentdeid","04e19d4de092a71460a31ae1e90ba06f");
        //添加 流程催办
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem2","");
        drCtrlItem2.setText("流程催办");
        drCtrlItem2.setDRViewId("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","04e19d4de092a71460a31ae1e90ba06f");
        //添加 流程跟踪
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem3","");
        drCtrlItem3.setText("流程跟踪");
        drCtrlItem3.setDRViewId("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","04e19d4de092a71460a31ae1e90ba06f");
    }
}