/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.sys.ctrlmodel;


import java.util.ArrayList;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.data.IDataObject;

import net.ibizsys.paas.web.WebConfig;
import net.ibizsys.paas.control.menu.AppMenuItem;
import net.ibizsys.paas.control.menu.AppMenuRootItem;
import net.ibizsys.paas.control.menu.AppMenuUtils;
import net.ibizsys.paas.ctrlmodel.AppMenuModelGlobal;
import java.io.File;
import javax.annotation.PostConstruct;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
/**
 * 应用菜单[AppMenu]模型基类
 */
@Component
public class  IonicAppAppMenuAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(IonicAppAppMenuAppMenuModel.class);

    public IonicAppAppMenuAppMenuModel()  {
        super();
        this.setName("AppMenu");
    }

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    /**
     * 注解Spring构造后执行
     * @throws Exception
     */
    @PostConstruct
    public void postConstruct() throws Exception {
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppAppMenuAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("3440BC59-C4CC-44A2-929A-C08BF5FD7091",this);
    }

    /**
     * 准备应用菜单根节点
     * @param appMenuRootItem
     * @throws Exception
     */
    @Override
    protected void onPrepareRootItem(AppMenuRootItem appMenuRootItem) throws Exception {
        //从Xml文件加载菜单项
        boolean bSuccessLoaded = this.loadAppMenuRootItem(appMenuRootItem);
        if(bSuccessLoaded)
            appMenuRootItem = new AppMenuRootItem();

        //添加 日常统计
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("3FDD21B2-516D-4F1D-B0F6-92D730B2DADF","");
        appMenuItem0.setAppFuncId("");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("日常统计");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("日常统计");
        appMenuItem0.setTooltipLanResTag("");
        appMenuItem0.setTextCls("menu-group-img");
        //添加 待我审批
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("A3A1BB69-22B9-4CED-BE02-5C5FD7DEDCDA","3FDD21B2-516D-4F1D-B0F6-92D730B2DADF");
        appMenuItem1.setAppFuncId("C62787B2-7F7D-4D43-BF61-7683327492D8");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("待我审批");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("待我审批");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setIconCls("");
        appMenuItem1.setIconPath("shenpi.png");
        appMenuItem1.setTextCls("menu-group-right");
        appMenuItem1.setAccUserMode(2);
        appMenuItem1.setCounterId("DWSPCOUNT");
        //添加 未读日志
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("4364D680-EF6F-413A-A4EA-EBDB02138EDB","3FDD21B2-516D-4F1D-B0F6-92D730B2DADF");
        appMenuItem2.setAppFuncId("309495F7-3CCA-4F0B-99C8-0CB6D355F127");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("未读日志");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("未读日志");
        appMenuItem2.setTooltipLanResTag("");
        appMenuItem2.setIconCls("");
        appMenuItem2.setIconPath("rizhi.png");
        appMenuItem2.setTextCls("menu-group-right");
        appMenuItem2.setAccUserMode(2);
        appMenuItem2.setCounterId("WDRZCOUNT");
        //添加 日常应用
        AppMenuItem appMenuItem3 = appMenuRootItem.addItem("C0E434B8-5B89-49E0-87D4-63990EC09AE3","");
        appMenuItem3.setAppFuncId("");
        appMenuItem3.setItemType("MENUITEM");
        appMenuItem3.setText("日常应用");
        appMenuItem3.setTextLanResTag("");
        appMenuItem3.setTooltip("日常应用");
        appMenuItem3.setTooltipLanResTag("");
        //添加 日志
        AppMenuItem appMenuItem4 = appMenuRootItem.addItem("62415CFF-D886-4D07-B1D9-FB26BF48BDA1","C0E434B8-5B89-49E0-87D4-63990EC09AE3");
        appMenuItem4.setAppFuncId("FDBF349A-B96F-47E7-9372-A946A2F74D1F");
        appMenuItem4.setItemType("MENUITEM");
        appMenuItem4.setText("日志");
        appMenuItem4.setTextLanResTag("");
        appMenuItem4.setTooltip("日志");
        appMenuItem4.setTooltipLanResTag("");
        appMenuItem4.setIconCls("");
        appMenuItem4.setIconPath("rizhi.png");
        //添加 公告
        AppMenuItem appMenuItem5 = appMenuRootItem.addItem("3AA492D5-4A85-40C2-A7B4-882CF736422A","C0E434B8-5B89-49E0-87D4-63990EC09AE3");
        appMenuItem5.setAppFuncId("B45F609D-07EA-49AB-B1E9-66FBADCCFE50");
        appMenuItem5.setItemType("MENUITEM");
        appMenuItem5.setText("公告");
        appMenuItem5.setTextLanResTag("");
        appMenuItem5.setTooltip("公告");
        appMenuItem5.setTooltipLanResTag("");
        appMenuItem5.setIconCls("");
        appMenuItem5.setIconPath("gonggao.png");
        appMenuItem5.setAccUserMode(2);
        //添加 信息共享
        AppMenuItem appMenuItem6 = appMenuRootItem.addItem("E6ECC087-C2AF-4082-B182-74E1DABB08D2","");
        appMenuItem6.setAppFuncId("");
        appMenuItem6.setItemType("MENUITEM");
        appMenuItem6.setText("信息共享");
        appMenuItem6.setTextLanResTag("");
        appMenuItem6.setTooltip("信息共享");
        appMenuItem6.setTooltipLanResTag("");
        //添加 知识库
        AppMenuItem appMenuItem7 = appMenuRootItem.addItem("317D3505-377F-4392-A59C-22B4B857145C","E6ECC087-C2AF-4082-B182-74E1DABB08D2");
        appMenuItem7.setAppFuncId("1141D577-8CB3-45D9-A8EF-59D0D4627399");
        appMenuItem7.setItemType("MENUITEM");
        appMenuItem7.setText("知识库");
        appMenuItem7.setTextLanResTag("");
        appMenuItem7.setTooltip("知识库");
        appMenuItem7.setTooltipLanResTag("");
        appMenuItem7.setIconCls("");
        appMenuItem7.setIconPath("zhishiku.png");
        appMenuItem7.setAccUserMode(2);

        if(WebConfig.getCurrent().getAttribute("EXPORTMENUCONF", false)) {
            //菜单项写入Xml文件
            this.writeAppMenuRootItem(appMenuRootItem);
        }
    }

    /**
     * 从菜单配置文件加载菜单项
     * @return
     */
    protected boolean loadAppMenuRootItem(AppMenuRootItem appMenuRootItem) {
        try {
            String strMenuConfigFileName = this.getMenuConfigFileName(false);
            File file = new File(strMenuConfigFileName);
            if(!file.exists())
                return false;

            AppMenuRootItem appMenuRootItem2 = AppMenuUtils.loadXmlFile(appMenuRootItem, strMenuConfigFileName);
            if(appMenuRootItem2 == null)
                return false;

            return true;
        } catch (Exception ex) {
            log.error(StringHelper.format("加载菜单配置数据发生错误！错误信息：%1$s", ex.getMessage()));
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * 写菜单数据配置文件
     * @param appMenuRootItem
     */
    protected void writeAppMenuRootItem(AppMenuRootItem appMenuRootItem) {
        try {
            String strOriginMenuConfigFileName = this.getMenuConfigFileName(true);
            File file = new File(strOriginMenuConfigFileName);
            if(!file.exists()) {
                File parentFile = new File(file.getParent());
                if(!parentFile.exists())
                    parentFile.mkdirs();
            }

            //写菜单配置数据原始文件
            AppMenuUtils.writeXmlFile(appMenuRootItem, strOriginMenuConfigFileName);
        } catch (Exception ex) {
            log.error(StringHelper.format("写菜单配置数据发生错误！错误信息：%1$s", ex.getMessage()));
            ex.printStackTrace();
        }
    }

    /**
     * 获取菜单配置数据Xml文件路径
     * @return
     */
    protected String getMenuConfigFileName(Boolean bOriginName) {
        File file = new File(this.getClass().getResource("/").getPath());
        String strFileName = (this.getClass().getName()).replaceAll("\\.", "_");
        return StringHelper.format("%1$s%2$smenuconf%2$s%3$s%4$s.xml",file.getPath(), File.separator, bOriginName?"Origin_":"", strFileName);
    }

}