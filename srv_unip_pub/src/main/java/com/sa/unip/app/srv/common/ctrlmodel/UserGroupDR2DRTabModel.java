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

import net.ibizsys.paas.control.drctrl.DRCtrlItem;
import net.ibizsys.paas.control.drctrl.DRCtrlRootItem;

/**
 * 实体[用户组]数据分页[drtab]部件模型
 */
public class  UserGroupDR2DRTabModel extends net.ibizsys.paas.ctrlmodel.DRTabModelBase {

    public UserGroupDR2DRTabModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }


    private net.ibizsys.psrt.srv.common.demodel.UserGroupDEModel userGroupDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserGroupDEModel getUserGroupDEModel() {
        if(this.userGroupDEModel==null) {
            try {
                this.userGroupDEModel = (net.ibizsys.psrt.srv.common.demodel.UserGroupDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserGroupDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userGroupDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserGroupDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 用户组
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("用户组");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 用户组成员
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("dritem1","");
        drCtrlItem1.setText("用户组成员");
        drCtrlItem1.setDRViewId("DRITEM1");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        drCtrlItem1.setViewParam("srfparentdeid","5eba267a2d34c0c5dc686961a48f62d1");
        drCtrlItem1.setViewParam("srfparenttype","DER1N");
        drCtrlItem1.setViewParam("srfder1nid","DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID");
    }
}