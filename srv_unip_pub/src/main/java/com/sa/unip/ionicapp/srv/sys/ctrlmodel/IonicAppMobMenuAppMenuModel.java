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
 * 应用菜单[MobMenu]模型基类
 */
@Component
public class  IonicAppMobMenuAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(IonicAppMobMenuAppMenuModel.class);

    public IonicAppMobMenuAppMenuModel()  {
        super();
        this.setName("MobMenu");
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppMobMenuAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("2707EB2D-D6AB-4CD4-93B0-83018A235C12",this);
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

        //添加 我的工作
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("0AE18267-AA44-4106-AD0D-40E0DBEDD163","");
        appMenuItem0.setAppFuncId("375E8864-8754-4016-A1E6-865FF597D8A5");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("我的工作");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("我的工作");
        appMenuItem0.setTooltipLanResTag("");
        //添加 审批
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("28A8FFDA-7FC0-447C-B121-5199D86558B2","");
        appMenuItem1.setAppFuncId("070D7305-22E2-47AF-9C51-C0EFEDF943C2");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("审批");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("审批");
        appMenuItem1.setTooltipLanResTag("");
        //添加 我的日志
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("582D9A28-12E9-4907-A5DC-A626B1C6E3EF","");
        appMenuItem2.setAppFuncId("FDBF349A-B96F-47E7-9372-A946A2F74D1F");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("我的日志");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("我的日志");
        appMenuItem2.setTooltipLanResTag("");

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