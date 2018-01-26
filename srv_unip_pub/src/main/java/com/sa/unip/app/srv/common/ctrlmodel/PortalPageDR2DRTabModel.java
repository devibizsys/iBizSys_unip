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
 * 实体[门户页面]数据分页[drtab]部件模型
 */
public class  PortalPageDR2DRTabModel extends net.ibizsys.paas.ctrlmodel.DRTabModelBase {

    public PortalPageDR2DRTabModel()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }


    private net.ibizsys.psrt.srv.common.demodel.PortalPageDEModel portalPageDEModel;
    protected  net.ibizsys.psrt.srv.common.demodel.PortalPageDEModel getPortalPageDEModel() {
        if(this.portalPageDEModel==null) {
            try {
                this.portalPageDEModel = (net.ibizsys.psrt.srv.common.demodel.PortalPageDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.PortalPageDEModel");
            } catch(Exception ex) {
            }
        }
        return this.portalPageDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getPortalPageDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 门户页面
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("门户页面");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 门户部件
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("dritem1","");
        drCtrlItem1.setText("门户部件");
        drCtrlItem1.setDRViewId("DRITEM1");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        drCtrlItem1.setViewParam("srfparentdeid","f63040021720d1401ec2014d30b02bb6");
        drCtrlItem1.setViewParam("srfparenttype","DER1N");
        drCtrlItem1.setViewParam("srfder1nid","DER1N_PVPART_PORTALPAGE_PORTALPAGEID");
        //添加 门户布局
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem2","");
        drCtrlItem2.setText("门户布局");
        drCtrlItem2.setDRViewId("DRITEM2");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","f63040021720d1401ec2014d30b02bb6");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID");
    }
}