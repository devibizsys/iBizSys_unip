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
 * 实体[用户角色]数据分页[drtab]部件模型
 */
public class  UserRoleDR2DRTabModel extends net.ibizsys.paas.ctrlmodel.DRTabModelBase {

    public UserRoleDR2DRTabModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }


    private net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel userRoleDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel getUserRoleDEModel() {
        if(this.userRoleDEModel==null) {
            try {
                this.userRoleDEModel = (net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userRoleDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserRoleDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 用户角色
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("用户角色");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 角色成员
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("dritem1","");
        drCtrlItem1.setText("角色成员");
        drCtrlItem1.setDRViewId("DRITEM1");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        drCtrlItem1.setViewParam("srfparentdeid","1e40618663977c439800bf56d8ac4390");
        drCtrlItem1.setViewParam("srfparenttype","DER1N");
        drCtrlItem1.setViewParam("srfder1nid","DER1N_USERROLEDETAIL_USERROLE_USERROLEID");
        //添加 实体数据访问
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem2","");
        drCtrlItem2.setText("实体数据访问");
        drCtrlItem2.setDRViewId("DRITEM2");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","1e40618663977c439800bf56d8ac4390");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_USERROLEDATAS_USERROLE_USERROLEID");
        //添加 统一资源访问
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem3","");
        drCtrlItem3.setText("统一资源访问");
        drCtrlItem3.setDRViewId("DRITEM3");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","1e40618663977c439800bf56d8ac4390");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_USERROLERES_USERROLE_USERROLEID");
        //添加 实体属性访问
        DRCtrlItem drCtrlItem4 = drCtrlRootItem.addItem("dritem4","");
        drCtrlItem4.setText("实体属性访问");
        drCtrlItem4.setDRViewId("DRITEM4");
        drCtrlItem4.setIconPath("");
        drCtrlItem4.setIconCls("");
        drCtrlItem4.setEnableMode("ALL");
        drCtrlItem4.setViewParam("srfparentdeid","1e40618663977c439800bf56d8ac4390");
        drCtrlItem4.setViewParam("srfparenttype","DER1N");
        drCtrlItem4.setViewParam("srfder1nid","DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID");
    }
}