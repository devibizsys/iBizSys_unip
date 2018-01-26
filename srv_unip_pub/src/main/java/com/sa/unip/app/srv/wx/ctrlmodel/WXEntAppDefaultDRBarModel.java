/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.wx.ctrlmodel;


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
 * 实体[微信企业应用]数据关系栏[drbar]部件模型
 */
public class  WXEntAppDefaultDRBarModel extends net.ibizsys.paas.ctrlmodel.DRBarModelBase {

    public WXEntAppDefaultDRBarModel() {
        super();
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    private net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel wXEntAppDEModel;
    protected  net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel getWXEntAppDEModel() {
        if(this.wXEntAppDEModel==null) {
            try {
                this.wXEntAppDEModel = (net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wXEntAppDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getWXEntAppDEModel();
    }

    /**
     * 准备数据关系根节点
     * @param drCtrlRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(DRCtrlRootItem drCtrlRootItem) throws Exception {

        //添加 微信企业应用
        DRCtrlItem drCtrlItem0 = drCtrlRootItem.addItem("form","");
        drCtrlItem0.setText("微信企业应用");
        drCtrlItem0.setDRViewId("");
        drCtrlItem0.setExpanded(true);
        drCtrlItem0.setTextLanResTag("");
        drCtrlItem0.setIconPath("");
        drCtrlItem0.setIconCls("");
        drCtrlItem0.setEnableMode("ALL");
        //添加 详细信息
        DRCtrlItem drCtrlItem1 = drCtrlRootItem.addItem("aeb4861b6d65eff3ef2098ddd7a0d4f5","form");
        drCtrlItem1.setText("详细信息");
        drCtrlItem1.setDRViewId("");
        drCtrlItem1.setExpanded(true);
        drCtrlItem1.setTextLanResTag("");
        drCtrlItem1.setIconPath("");
        drCtrlItem1.setIconCls("");
        drCtrlItem1.setEnableMode("ALL");
        //添加 微信多媒体内容
        DRCtrlItem drCtrlItem2 = drCtrlRootItem.addItem("dritem1","aeb4861b6d65eff3ef2098ddd7a0d4f5");
        drCtrlItem2.setText("微信多媒体内容");
        drCtrlItem2.setDRViewId("DRITEM1");
        drCtrlItem2.setTextLanResTag("");
        drCtrlItem2.setIconPath("");
        drCtrlItem2.setIconCls("");
        drCtrlItem2.setEnableMode("ALL");
        drCtrlItem2.setViewParam("srfparentdeid","aeb4861b6d65eff3ef2098ddd7a0d4f5");
        drCtrlItem2.setViewParam("srfparenttype","DER1N");
        drCtrlItem2.setViewParam("srfder1nid","DER1N_WXMEDIA_WXENTAPP_WXENTAPPID");
        //添加 微信消息
        DRCtrlItem drCtrlItem3 = drCtrlRootItem.addItem("dritem2","aeb4861b6d65eff3ef2098ddd7a0d4f5");
        drCtrlItem3.setText("微信消息");
        drCtrlItem3.setDRViewId("DRITEM2");
        drCtrlItem3.setTextLanResTag("");
        drCtrlItem3.setIconPath("");
        drCtrlItem3.setIconCls("");
        drCtrlItem3.setEnableMode("ALL");
        drCtrlItem3.setViewParam("srfparentdeid","aeb4861b6d65eff3ef2098ddd7a0d4f5");
        drCtrlItem3.setViewParam("srfparenttype","DER1N");
        drCtrlItem3.setViewParam("srfder1nid","DER1N_WXMESSAGE_WXENTAPP_WXENTAPPID");
    }
}