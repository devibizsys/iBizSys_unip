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
 * 实体[用户角色数据能力]数据关系栏[drbar]部件模型
 */
public class  UserRoleDatasDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public UserRoleDatasDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel userRoleDatasDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel getUserRoleDatasDEModel() {
        if(this.userRoleDatasDEModel==null) {
            try {
                this.userRoleDatasDEModel = (net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userRoleDatasDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getUserRoleDatasDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 用户角色数据能力
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("用户角色数据能力");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
    }
}