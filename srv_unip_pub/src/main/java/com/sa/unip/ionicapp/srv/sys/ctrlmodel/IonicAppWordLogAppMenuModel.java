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
 * 应用菜单[WordLog]模型基类
 */
@Component
public class  IonicAppWordLogAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(IonicAppWordLogAppMenuModel.class);

    public IonicAppWordLogAppMenuModel()  {
        super();
        this.setName("WordLog");
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppWordLogAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("4CAFCB1A-BF2E-42F5-AFD4-252ED709D2C1",this);
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

        //添加 写日报
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("F78AA795-8442-42C1-A951-FF52A73BBAD7","");
        appMenuItem0.setAppFuncId("A04EB425-A4A3-4527-BD11-9D461A1E3593");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("写日报");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("写日报");
        appMenuItem0.setTooltipLanResTag("");
        appMenuItem0.setAccUserMode(2);
        //添加 写周报
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("7E595479-1F3A-4CE4-AB80-7E21FA7E5689","");
        appMenuItem1.setAppFuncId("2E649846-2AD3-4770-A564-2014699764C9");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("写周报");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("写周报");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setAccUserMode(2);
        //添加 写月报
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("AB5189C9-532C-4F72-BF4D-09154AAB1B3A","");
        appMenuItem2.setAppFuncId("28B7C95F-45AD-4EC7-B48F-D74CB0CA4091");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("写月报");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("写月报");
        appMenuItem2.setTooltipLanResTag("");
        appMenuItem2.setAccUserMode(2);
        //添加 我的日志
        AppMenuItem appMenuItem3 = appMenuRootItem.addItem("A5251599-6BDE-49C7-A027-427A3D0463D5","");
        appMenuItem3.setAppFuncId("6EFD2D37-FCB9-42AB-9DDB-47666730DBE8");
        appMenuItem3.setItemType("MENUITEM");
        appMenuItem3.setText("我的日志");
        appMenuItem3.setTextLanResTag("");
        appMenuItem3.setTooltip("我的日志");
        appMenuItem3.setTooltipLanResTag("");
        appMenuItem3.setAccUserMode(2);

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