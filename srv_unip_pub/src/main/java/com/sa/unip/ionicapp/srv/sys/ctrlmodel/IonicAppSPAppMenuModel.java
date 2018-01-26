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
 * 应用菜单[SP]模型基类
 */
@Component
public class  IonicAppSPAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(IonicAppSPAppMenuModel.class);

    public IonicAppSPAppMenuModel()  {
        super();
        this.setName("SP");
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("370AC11D-B5A8-43F6-9A19-107DC54473CE",this);
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

        //添加 会议管理
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("F07BF76E-C062-42AF-8DB3-9DBA69A218B1","");
        appMenuItem0.setAppFuncId("");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("会议管理");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("会议管理");
        appMenuItem0.setTooltipLanResTag("");
        //添加 会议申请
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("C4E5FCC9-3827-4E28-B078-7B5808B607F8","F07BF76E-C062-42AF-8DB3-9DBA69A218B1");
        appMenuItem1.setAppFuncId("E667A3F6-7981-4A5A-BD6C-A4BBFB210F85");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("会议申请");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("会议申请");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setIconCls("");
        appMenuItem1.setIconPath("yuanbanhuiyi.png");
        appMenuItem1.setAccUserMode(2);
        //添加 会议室使用
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("7C4EE94F-6988-4DA3-9CA5-1E23A9E6C5DA","F07BF76E-C062-42AF-8DB3-9DBA69A218B1");
        appMenuItem2.setAppFuncId("A5007D6A-EBDB-4DBC-A40E-571419BE612F");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("会议室使用");
        appMenuItem2.setTextLanResTag("");
        appMenuItem2.setTooltip("会议室使用");
        appMenuItem2.setTooltipLanResTag("");
        appMenuItem2.setAccUserMode(2);
        //添加 项目查阅
        AppMenuItem appMenuItem3 = appMenuRootItem.addItem("A737D05C-4998-48DF-BC1C-F209B8890A5A","F07BF76E-C062-42AF-8DB3-9DBA69A218B1");
        appMenuItem3.setAppFuncId("04FA39A2-9BAC-4D41-8661-525D018E97EA");
        appMenuItem3.setItemType("MENUITEM");
        appMenuItem3.setText("项目查阅");
        appMenuItem3.setTextLanResTag("");
        appMenuItem3.setTooltip("项目查阅");
        appMenuItem3.setTooltipLanResTag("");
        appMenuItem3.setIconCls("");
        appMenuItem3.setIconPath("xiangmuchaxun.png");
        appMenuItem3.setAccUserMode(2);
        //添加 人事管理
        AppMenuItem appMenuItem4 = appMenuRootItem.addItem("CB110CC4-14D3-4267-A870-02EA8F18F235","");
        appMenuItem4.setAppFuncId("");
        appMenuItem4.setItemType("MENUITEM");
        appMenuItem4.setText("人事管理");
        appMenuItem4.setTextLanResTag("");
        appMenuItem4.setTooltip("人事管理");
        appMenuItem4.setTooltipLanResTag("");
        //添加 请假
        AppMenuItem appMenuItem5 = appMenuRootItem.addItem("251B0B64-F3EF-4F18-99B9-DAEACC4CE564","CB110CC4-14D3-4267-A870-02EA8F18F235");
        appMenuItem5.setAppFuncId("71DB2044-B5DE-45E3-AC94-49C536BDB057");
        appMenuItem5.setItemType("MENUITEM");
        appMenuItem5.setText("请假");
        appMenuItem5.setTextLanResTag("");
        appMenuItem5.setTooltip("请假");
        appMenuItem5.setTooltipLanResTag("");
        appMenuItem5.setIconCls("");
        appMenuItem5.setIconPath("qingjia.png");
        appMenuItem5.setAccUserMode(2);
        //添加 出差
        AppMenuItem appMenuItem6 = appMenuRootItem.addItem("DDDB9B8F-18B1-49D7-967C-0229C7AB818B","CB110CC4-14D3-4267-A870-02EA8F18F235");
        appMenuItem6.setAppFuncId("60B7E099-8AD3-41E3-9A06-46AFC7EA79D8");
        appMenuItem6.setItemType("MENUITEM");
        appMenuItem6.setText("出差");
        appMenuItem6.setTextLanResTag("");
        appMenuItem6.setTooltip("出差");
        appMenuItem6.setTooltipLanResTag("");
        appMenuItem6.setIconCls("");
        appMenuItem6.setIconPath("chucha.png");
        appMenuItem6.setAccUserMode(2);
        //添加 采购
        AppMenuItem appMenuItem7 = appMenuRootItem.addItem("BA31BA9A-257C-4ED5-9422-885A9F0CD29A","CB110CC4-14D3-4267-A870-02EA8F18F235");
        appMenuItem7.setAppFuncId("2CA4FBA5-DFC5-45F7-9C29-942357225FC7");
        appMenuItem7.setItemType("MENUITEM");
        appMenuItem7.setText("采购");
        appMenuItem7.setTextLanResTag("");
        appMenuItem7.setTooltip("采购");
        appMenuItem7.setTooltipLanResTag("");
        appMenuItem7.setIconCls("");
        appMenuItem7.setIconPath("caigou.png");
        appMenuItem7.setAccUserMode(2);
        //添加 其他申请
        AppMenuItem appMenuItem8 = appMenuRootItem.addItem("089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54","");
        appMenuItem8.setAppFuncId("");
        appMenuItem8.setItemType("MENUITEM");
        appMenuItem8.setText("其他申请");
        appMenuItem8.setTextLanResTag("");
        appMenuItem8.setTooltip("其他申请");
        appMenuItem8.setTooltipLanResTag("");
        //添加 用餐
        AppMenuItem appMenuItem9 = appMenuRootItem.addItem("6B024461-F09E-402C-860D-8A1A2FBBABFB","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem9.setAppFuncId("DBCCDA6A-F560-4D71-B8CF-69F3094673C7");
        appMenuItem9.setItemType("MENUITEM");
        appMenuItem9.setText("用餐");
        appMenuItem9.setTextLanResTag("");
        appMenuItem9.setTooltip("用餐");
        appMenuItem9.setTooltipLanResTag("");
        appMenuItem9.setIconCls("");
        appMenuItem9.setIconPath("yongcan.png");
        appMenuItem9.setAccUserMode(2);
        //添加 设备维修
        AppMenuItem appMenuItem10 = appMenuRootItem.addItem("0AEBB176-4F8C-45A9-BEB7-E097619A90DC","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem10.setAppFuncId("6221BC70-1140-4A78-90B7-88B1FD5B56F8");
        appMenuItem10.setItemType("MENUITEM");
        appMenuItem10.setText("设备维修");
        appMenuItem10.setTextLanResTag("");
        appMenuItem10.setTooltip("设备维修");
        appMenuItem10.setTooltipLanResTag("");
        appMenuItem10.setIconCls("");
        appMenuItem10.setIconPath("shebeiweixiu.png");
        appMenuItem10.setAccUserMode(2);
        //添加 机票预订
        AppMenuItem appMenuItem11 = appMenuRootItem.addItem("257E35A1-F8B6-49B3-975A-C0F8F0E215C7","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem11.setAppFuncId("3552FC7B-8D12-4499-A40C-0D84741A10A2");
        appMenuItem11.setItemType("MENUITEM");
        appMenuItem11.setText("机票预订");
        appMenuItem11.setTextLanResTag("");
        appMenuItem11.setTooltip("机票预订");
        appMenuItem11.setTooltipLanResTag("");
        appMenuItem11.setIconCls("");
        appMenuItem11.setIconPath("jipiaoyuding.png");
        appMenuItem11.setAccUserMode(2);
        //添加 饮用水配送
        AppMenuItem appMenuItem12 = appMenuRootItem.addItem("B2D8BE47-1110-4514-BCEE-2D4A8EEB5284","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem12.setAppFuncId("EC364687-85F2-4EC2-89D4-B1514B8DD054");
        appMenuItem12.setItemType("MENUITEM");
        appMenuItem12.setText("饮用水配送");
        appMenuItem12.setTextLanResTag("");
        appMenuItem12.setTooltip("饮用水配送");
        appMenuItem12.setTooltipLanResTag("");
        appMenuItem12.setIconCls("");
        appMenuItem12.setIconPath("yinyongshui.png");
        appMenuItem12.setAccUserMode(2);
        //添加 办公耗材
        AppMenuItem appMenuItem13 = appMenuRootItem.addItem("BB258EDF-0547-476D-B5B5-004889B454D2","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem13.setAppFuncId("FF86FEDE-1856-40E0-A0E2-7EBBAEB92607");
        appMenuItem13.setItemType("MENUITEM");
        appMenuItem13.setText("办公耗材");
        appMenuItem13.setTextLanResTag("");
        appMenuItem13.setTooltip("办公耗材");
        appMenuItem13.setTooltipLanResTag("");
        appMenuItem13.setIconCls("");
        appMenuItem13.setIconPath("bangonghaocai.png");
        appMenuItem13.setAccUserMode(2);
        //添加 车辆维修
        AppMenuItem appMenuItem14 = appMenuRootItem.addItem("5B44D6B5-11CE-4B5D-A8D7-7F7EC3D88D65","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem14.setAppFuncId("60D6ACC9-51C3-4EE6-80A9-2E66E616EA72");
        appMenuItem14.setItemType("MENUITEM");
        appMenuItem14.setText("车辆维修");
        appMenuItem14.setTextLanResTag("");
        appMenuItem14.setTooltip("车辆维修");
        appMenuItem14.setTooltipLanResTag("");
        appMenuItem14.setIconCls("");
        appMenuItem14.setIconPath("cheliangweixiu.png");
        appMenuItem14.setAccUserMode(2);
        //添加 食堂外卖
        AppMenuItem appMenuItem15 = appMenuRootItem.addItem("984B5179-E5CD-4227-B7E5-1F975E04F811","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem15.setAppFuncId("D20470AC-416F-42DD-BE9C-D3BA778CC316");
        appMenuItem15.setItemType("MENUITEM");
        appMenuItem15.setText("食堂外卖");
        appMenuItem15.setTextLanResTag("");
        appMenuItem15.setTooltip("食堂外卖");
        appMenuItem15.setTooltipLanResTag("");
        appMenuItem15.setAccUserMode(2);
        //添加 派车申请
        AppMenuItem appMenuItem16 = appMenuRootItem.addItem("065506E9-258E-4834-8555-F2564A761086","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem16.setAppFuncId("2438D816-D5AF-47D6-8F5F-7B9738783A61");
        appMenuItem16.setItemType("MENUITEM");
        appMenuItem16.setText("派车申请");
        appMenuItem16.setTextLanResTag("");
        appMenuItem16.setTooltip("派车申请");
        appMenuItem16.setTooltipLanResTag("");
        appMenuItem16.setAccUserMode(2);
        //添加 车牌门禁
        AppMenuItem appMenuItem17 = appMenuRootItem.addItem("3DF73BD2-5A1E-4BA0-8BAC-BFE68A682081","089AC4A1-2FCC-4CFB-B5FA-60A7FB436E54");
        appMenuItem17.setAppFuncId("47946B24-CA52-4A37-907F-BF5B654B0EF5");
        appMenuItem17.setItemType("MENUITEM");
        appMenuItem17.setText("车牌门禁");
        appMenuItem17.setTextLanResTag("");
        appMenuItem17.setTooltip("车牌门禁");
        appMenuItem17.setTooltipLanResTag("");
        appMenuItem17.setAccUserMode(2);

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