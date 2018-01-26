/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.srv.sys.ctrlmodel;


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
 * 应用菜单[Default]模型基类
 */
@Component
public class  AngularDefaultAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(AngularDefaultAppMenuModel.class);

    public AngularDefaultAppMenuModel()  {
        super();
        this.setName("Default");
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.angular.srv.sys.ctrlmodel.AngularDefaultAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("F443ECA5-120F-4E79-9DCB-1C8005857669",this);
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

        //添加 门户页
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("137807EB-82E8-4C5E-9B9B-6E109A465B4E","");
        appMenuItem0.setAppFuncId("21A740D5-D756-4EB5-AFE5-B598E419C426");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("门户页");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("门户页");
        appMenuItem0.setTooltipLanResTag("");
        appMenuItem0.setAccUserMode(3);
        //添加 知识库
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("44D490E5-BED2-4C65-9316-724F9C8D3B42","");
        appMenuItem1.setAppFuncId("C8747BB5-6E26-4F1C-9649-DCEE037EBC28");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("知识库");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("知识库");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setIconCls("fa fa-home");
        appMenuItem1.setIconPath("");
        appMenuItem1.setAccUserMode(2);
        //添加 工作日志
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("3EC79865-4206-40E7-8FD9-023234D32A2B","");
        appMenuItem2.setAppFuncId("0167AA27-6C88-49BD-8C82-520BEDF799BC");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("工作日志");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("工作日志");
        appMenuItem2.setTooltipLanResTag("");
        appMenuItem2.setAccUserMode(3);
        //添加 工作流
        AppMenuItem appMenuItem3 = appMenuRootItem.addItem("FBC08885-188D-48F3-96FF-5955A4B129B3","");
        appMenuItem3.setAppFuncId("30A8708E-01EA-4CA0-B2FF-592E511A1CAA");
        appMenuItem3.setItemType("MENUITEM");
        appMenuItem3.setText("工作流");
        appMenuItem3.setTextLanResTag("");
        appMenuItem3.setTooltip("工作流");
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