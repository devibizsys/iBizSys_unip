/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.cg.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.common.ctrlmodel.OrgAllOrgSectorUserTreeModel;
import com.sa.unip.srv.subsys.demodel.OrgDEModel;
import com.sa.unip.srv.subsys.service.OrgService;
import net.ibizsys.psrt.srv.common.dao.OrgDAO;
import net.ibizsys.psrt.srv.common.entity.Org;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.ITreeModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 树视图控件后台处理基类
 */
public class OrgUserMobPickupTreeViewTreeHandler extends net.ibizsys.paas.ctrlhandler.TreeHandlerBase {

    protected OrgAllOrgSectorUserTreeModel treeModel = null;
    public OrgUserMobPickupTreeViewTreeHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        treeModel  = (OrgAllOrgSectorUserTreeModel)this.getViewController().getCtrlModel("tree");
        super.onInit();
    }

    @Override
    protected ITreeModel getTreeModel() {
        return this.getRealTreeModel();
    }

    protected OrgAllOrgSectorUserTreeModel getRealTreeModel() {
        return this.treeModel;
    }

    protected OrgService getRealService() {
        return (OrgService)this.getService();
    }

}