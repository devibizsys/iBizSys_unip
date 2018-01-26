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
 * 应用菜单[SPhead]模型基类
 */
@Component
public class  IonicAppSPheadAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(IonicAppSPheadAppMenuModel.class);

    public IonicAppSPheadAppMenuModel()  {
        super();
        this.setName("SPhead");
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPheadAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("11523562-E81C-416C-8F5B-F3FBCF4EB4A9",this);
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

        //添加 待我审批
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("1617BBCA-A48A-4FAD-A1BF-64F358302630","");
        appMenuItem0.setAppFuncId("C62787B2-7F7D-4D43-BF61-7683327492D8");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("待我审批");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("待我审批");
        appMenuItem0.setTooltipLanResTag("");
        appMenuItem0.setIconCls("");
        appMenuItem0.setIconPath("shenpi.png");
        appMenuItem0.setTextCls("menu-group-right");
        appMenuItem0.setAccUserMode(2);
        appMenuItem0.setCounterId("DWSPCOUNT");
        //添加 我发起的
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("3F907BFB-8252-4744-AD48-FFA6F1CE4A44","");
        appMenuItem1.setAppFuncId("2245B46F-9BC4-42E2-97B5-0B870D85AE4E");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("我发起的");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("我发起的");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setIconCls("");
        appMenuItem1.setIconPath("wofaqide.png");
        appMenuItem1.setAccUserMode(2);
        //添加 抄送我的
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("74EA99A9-001B-45C8-A7A3-FEB20F5A6472","");
        appMenuItem2.setAppFuncId("9E984A04-E6A2-416D-91D4-4B9A9CE1FF59");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("抄送我的");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("抄送我的");
        appMenuItem2.setTooltipLanResTag("");
        appMenuItem2.setIconCls("");
        appMenuItem2.setIconPath("chaosongwode.png");
        appMenuItem2.setAccUserMode(2);

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