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
 * 实体[会议申请]数据关系栏[drbar]部件模型
 */
public class  OA_YBHYSQDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public OA_YBHYSQDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel oA_YBHYSQDEModel;
    protected  com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel getOA_YBHYSQDEModel() {
        if(this.oA_YBHYSQDEModel==null) {
            try {
                this.oA_YBHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_YBHYSQDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOA_YBHYSQDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 会议申请
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("会议申请");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("DE.LNAME.OA_YBHYSQ");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("c0433bdd5aa541e585e2b3b0e59951da","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 参会人员
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem4","c0433bdd5aa541e585e2b3b0e59951da");
        drCtrlItem2.setText("参会人员");
        drCtrlItem2.setDRViewId("DRITEM4");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setCounterId("TZZRS");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","c0433bdd5aa541e585e2b3b0e59951da");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID");
        //添加 请休假
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem5","c0433bdd5aa541e585e2b3b0e59951da");
        drCtrlItem3.setText("请休假");
        drCtrlItem3.setDRViewId("DRITEM5");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","c0433bdd5aa541e585e2b3b0e59951da");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID");
    }
}