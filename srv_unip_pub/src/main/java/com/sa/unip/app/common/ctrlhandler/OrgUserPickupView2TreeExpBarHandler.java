/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.common.ctrlmodel.OrgUsertreeexpbarTreeExpBarModel;
import com.sa.unip.srv.subsys.demodel.OrgUserDEModel;
import com.sa.unip.srv.subsys.service.OrgUserService;
import net.ibizsys.psrt.srv.common.dao.OrgUserDAO;
import net.ibizsys.psrt.srv.common.entity.OrgUser;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.ITreeModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.ctrlmodel.ITreeExpBarModel;
import net.ibizsys.paas.ctrlhandler.ITreeHandler;
import net.ibizsys.paas.ctrlmodel.ITreeModel;

/**
 * 树导航视图控件后台处理基类
 */
public class OrgUserPickupView2TreeExpBarHandler extends net.ibizsys.paas.ctrlhandler.TreeExpBarHandlerBase {


    protected OrgUsertreeexpbarTreeExpBarModel treeExpBarModel = null;
    public OrgUserPickupView2TreeExpBarHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        treeExpBarModel  = (OrgUsertreeexpbarTreeExpBarModel)this.getViewController().getCtrlModel("treeexpbar");
        super.onInit();
    }

    @Override
    protected ITreeExpBarModel getTreeExpBarModel() {
        return this.getRealTreeExpBarModel();
    }

    protected OrgUsertreeexpbarTreeExpBarModel getRealTreeExpBarModel() {
        return this.treeExpBarModel;
    }


    @Override
    protected ITreeHandler getTreeHandler() throws Exception {
        return (ITreeHandler )this.getViewController().getCtrlHandler("treeexpbar_tree");
    }

    @Override
    protected ITreeModel getTreeModel() throws Exception {
        return (ITreeModel)this.getViewController().getCtrlModel("treeexpbar_tree");
    }


}