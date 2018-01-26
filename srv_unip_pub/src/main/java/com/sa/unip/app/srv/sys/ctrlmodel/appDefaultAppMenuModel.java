/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.sys.ctrlmodel;


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
public class  appDefaultAppMenuModel extends net.ibizsys.paas.ctrlmodel.AppMenuModelBase {
    private Log log = LogFactory.getLog(appDefaultAppMenuModel.class);

    public appDefaultAppMenuModel()  {
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
        AppMenuModelGlobal.registerAppMenuModel("com.sa.unip.app.srv.sys.ctrlmodel.appDefaultAppMenuModel",this);
        AppMenuModelGlobal.registerAppMenuModel("9DAAE570-31EF-45A1-A8E4-5DEBE45CC479",this);
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

        //添加 日程工作
        AppMenuItem appMenuItem0 = appMenuRootItem.addItem("CCCCED11-01F1-41B0-B41A-6E4E2729A6DA","");
        appMenuItem0.setAppFuncId("");
        appMenuItem0.setItemType("MENUITEM");
        appMenuItem0.setText("日程工作");
        appMenuItem0.setTextLanResTag("");
        appMenuItem0.setTooltip("日程工作");
        appMenuItem0.setTooltipLanResTag("");
        //添加 工作日志
        AppMenuItem appMenuItem1 = appMenuRootItem.addItem("07784CF9-EBDE-4635-A8FE-855BFDCF2ED8","CCCCED11-01F1-41B0-B41A-6E4E2729A6DA");
        appMenuItem1.setAppFuncId("70E096E8-E903-4C68-8BD6-0D48EED964E8");
        appMenuItem1.setItemType("MENUITEM");
        appMenuItem1.setText("工作日志");
        appMenuItem1.setTextLanResTag("");
        appMenuItem1.setTooltip("工作日志");
        appMenuItem1.setTooltipLanResTag("");
        appMenuItem1.setAccUserMode(2);
        //添加 消息管理
        AppMenuItem appMenuItem2 = appMenuRootItem.addItem("FCD4F525-C31D-44E8-B37C-8820B7714724","");
        appMenuItem2.setAppFuncId("");
        appMenuItem2.setItemType("MENUITEM");
        appMenuItem2.setText("消息管理");
        appMenuItem2.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM1");
        appMenuItem2.setTooltip("消息管理");
        appMenuItem2.setTooltipLanResTag("");
        //添加 通知公告
        AppMenuItem appMenuItem3 = appMenuRootItem.addItem("6D23D51A-2ED2-412C-936C-8608B2FCD708","FCD4F525-C31D-44E8-B37C-8820B7714724");
        appMenuItem3.setAppFuncId("A978F740-5B26-46E1-9518-52BD12925038");
        appMenuItem3.setItemType("MENUITEM");
        appMenuItem3.setText("通知公告");
        appMenuItem3.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM32");
        appMenuItem3.setTooltip("通知公告");
        appMenuItem3.setTooltipLanResTag("");
        appMenuItem3.setAccUserMode(2);
        //添加 群发消息
        AppMenuItem appMenuItem4 = appMenuRootItem.addItem("1EC1A95A-C480-42D4-B745-CED44B0A1FE0","FCD4F525-C31D-44E8-B37C-8820B7714724");
        appMenuItem4.setAppFuncId("FCD1C5FD-39AF-4C36-AE77-2CD2AA1C4285");
        appMenuItem4.setItemType("MENUITEM");
        appMenuItem4.setText("群发消息");
        appMenuItem4.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM33");
        appMenuItem4.setTooltip("群发消息");
        appMenuItem4.setTooltipLanResTag("");
        appMenuItem4.setAccUserMode(2);
        //添加 信息共享
        AppMenuItem appMenuItem5 = appMenuRootItem.addItem("143E66B6-F65F-46AE-A773-5EA6CDF0C6D2","");
        appMenuItem5.setAppFuncId("");
        appMenuItem5.setItemType("MENUITEM");
        appMenuItem5.setText("信息共享");
        appMenuItem5.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM40");
        appMenuItem5.setTooltip("信息共享");
        appMenuItem5.setTooltipLanResTag("");
        //添加 知识库
        AppMenuItem appMenuItem6 = appMenuRootItem.addItem("AEC19BC1-1C43-4D21-A5F9-B60D034431B9","143E66B6-F65F-46AE-A773-5EA6CDF0C6D2");
        appMenuItem6.setAppFuncId("47C0D856-4B59-445E-A24F-B0E214DB7E3B");
        appMenuItem6.setItemType("MENUITEM");
        appMenuItem6.setText("知识库");
        appMenuItem6.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM42");
        appMenuItem6.setTooltip("知识库");
        appMenuItem6.setTooltipLanResTag("");
        appMenuItem6.setAccUserMode(2);
        //添加 法律法规
        AppMenuItem appMenuItem7 = appMenuRootItem.addItem("329222D4-5426-48F9-BFF9-9FF88C4F1034","143E66B6-F65F-46AE-A773-5EA6CDF0C6D2");
        appMenuItem7.setAppFuncId("F05EE30A-A0EE-40C5-B016-BDAD4FD08FCA");
        appMenuItem7.setItemType("MENUITEM");
        appMenuItem7.setText("法律法规");
        appMenuItem7.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM41");
        appMenuItem7.setTooltip("法律法规");
        appMenuItem7.setTooltipLanResTag("");
        appMenuItem7.setAccUserMode(2);
        //添加 院办公室
        AppMenuItem appMenuItem8 = appMenuRootItem.addItem("B8BB9D89-0F7A-4953-BCD1-CC05A0A17864","");
        appMenuItem8.setAppFuncId("");
        appMenuItem8.setItemType("MENUITEM");
        appMenuItem8.setText("院办公室");
        appMenuItem8.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM25");
        appMenuItem8.setTooltip("院办公室");
        appMenuItem8.setTooltipLanResTag("");
        //添加 会议
        AppMenuItem appMenuItem9 = appMenuRootItem.addItem("074DE779-7457-488A-9879-8719E7E1F4FC","B8BB9D89-0F7A-4953-BCD1-CC05A0A17864");
        appMenuItem9.setAppFuncId("7314F60D-A75D-4884-8A3B-F9E353A5439C");
        appMenuItem9.setItemType("MENUITEM");
        appMenuItem9.setText("会议");
        appMenuItem9.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM2");
        appMenuItem9.setTooltip("会议");
        appMenuItem9.setTooltipLanResTag("");
        appMenuItem9.setAccUserMode(2);
        //添加 内设机构会议
        AppMenuItem appMenuItem10 = appMenuRootItem.addItem("442DDC7F-B67D-41D2-A9B0-573D68C5E509","B8BB9D89-0F7A-4953-BCD1-CC05A0A17864");
        appMenuItem10.setAppFuncId("2F033F27-5262-4170-9E91-C8081347ACCD");
        appMenuItem10.setItemType("MENUITEM");
        appMenuItem10.setText("内设机构会议");
        appMenuItem10.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM5");
        appMenuItem10.setTooltip("内设机构会议");
        appMenuItem10.setTooltipLanResTag("");
        appMenuItem10.setAccUserMode(2);
        //添加 参会记录
        AppMenuItem appMenuItem11 = appMenuRootItem.addItem("2A34BF6E-78E8-4C72-AA01-1D9D2186A6CC","B8BB9D89-0F7A-4953-BCD1-CC05A0A17864");
        appMenuItem11.setAppFuncId("");
        appMenuItem11.setItemType("MENUITEM");
        appMenuItem11.setText("参会记录");
        appMenuItem11.setTextLanResTag("");
        appMenuItem11.setTooltip("参会记录");
        appMenuItem11.setTooltipLanResTag("");
        //添加 未参会
        AppMenuItem appMenuItem12 = appMenuRootItem.addItem("6769A59E-2F74-4302-8150-79BF645FEA78","2A34BF6E-78E8-4C72-AA01-1D9D2186A6CC");
        appMenuItem12.setAppFuncId("662D1F67-0AD1-4ACF-906C-45365B318968");
        appMenuItem12.setItemType("MENUITEM");
        appMenuItem12.setText("未参会");
        appMenuItem12.setTextLanResTag("");
        appMenuItem12.setTooltip("未参会");
        appMenuItem12.setTooltipLanResTag("");
        appMenuItem12.setAccUserMode(2);
        //添加 已参会
        AppMenuItem appMenuItem13 = appMenuRootItem.addItem("15CD53F3-EF64-425C-A2E8-9CD523C19DE2","2A34BF6E-78E8-4C72-AA01-1D9D2186A6CC");
        appMenuItem13.setAppFuncId("662D1F67-0AD1-4ACF-906C-45365B318968");
        appMenuItem13.setItemType("MENUITEM");
        appMenuItem13.setText("已参会");
        appMenuItem13.setTextLanResTag("");
        appMenuItem13.setTooltip("已参会");
        appMenuItem13.setTooltipLanResTag("");
        appMenuItem13.setAccUserMode(2);
        //添加 已请假
        AppMenuItem appMenuItem14 = appMenuRootItem.addItem("097C70CC-6B52-4F1B-BA1C-EEFBE5502ABC","2A34BF6E-78E8-4C72-AA01-1D9D2186A6CC");
        appMenuItem14.setAppFuncId("4A647515-97EB-45F8-BEDD-BC07DC51B1E7");
        appMenuItem14.setItemType("MENUITEM");
        appMenuItem14.setText("已请假");
        appMenuItem14.setTextLanResTag("");
        appMenuItem14.setTooltip("已请假");
        appMenuItem14.setTooltipLanResTag("");
        appMenuItem14.setAccUserMode(2);
        //添加 人事管理
        AppMenuItem appMenuItem15 = appMenuRootItem.addItem("D169B84B-1B0A-4934-A494-804ECC7F083F","");
        appMenuItem15.setAppFuncId("");
        appMenuItem15.setItemType("MENUITEM");
        appMenuItem15.setText("人事管理");
        appMenuItem15.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM6");
        appMenuItem15.setTooltip("人事管理");
        appMenuItem15.setTooltipLanResTag("");
        //添加 请假
        AppMenuItem appMenuItem16 = appMenuRootItem.addItem("B9F376A8-F561-468D-8112-5B44531B2845","D169B84B-1B0A-4934-A494-804ECC7F083F");
        appMenuItem16.setAppFuncId("39EE2E81-6476-46D0-A0F7-F850C1D174D1");
        appMenuItem16.setItemType("MENUITEM");
        appMenuItem16.setText("请假");
        appMenuItem16.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM9");
        appMenuItem16.setTooltip("请假");
        appMenuItem16.setTooltipLanResTag("");
        appMenuItem16.setAccUserMode(2);
        //添加 出差
        AppMenuItem appMenuItem17 = appMenuRootItem.addItem("87D33C4F-F924-43CF-B301-9EB9A07676CE","D169B84B-1B0A-4934-A494-804ECC7F083F");
        appMenuItem17.setAppFuncId("604D0616-6EF6-47A4-9F0B-1E06C1C43A42");
        appMenuItem17.setItemType("MENUITEM");
        appMenuItem17.setText("出差");
        appMenuItem17.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM11");
        appMenuItem17.setTooltip("出差");
        appMenuItem17.setTooltipLanResTag("");
        appMenuItem17.setAccUserMode(2);
        //添加 计划财务装备局
        AppMenuItem appMenuItem18 = appMenuRootItem.addItem("63E8D0D7-6101-454E-B0FD-951D5B5D15E6","");
        appMenuItem18.setAppFuncId("");
        appMenuItem18.setItemType("MENUITEM");
        appMenuItem18.setText("计划财务装备局");
        appMenuItem18.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM12");
        appMenuItem18.setTooltip("计划财务装备局");
        appMenuItem18.setTooltipLanResTag("");
        //添加 采购
        AppMenuItem appMenuItem19 = appMenuRootItem.addItem("9E76261A-D735-41E9-B514-4B8EFC62A059","63E8D0D7-6101-454E-B0FD-951D5B5D15E6");
        appMenuItem19.setAppFuncId("E21F67E6-5929-49A7-B9ED-4BFF8C755137");
        appMenuItem19.setItemType("MENUITEM");
        appMenuItem19.setText("采购");
        appMenuItem19.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM19");
        appMenuItem19.setTooltip("采购");
        appMenuItem19.setTooltipLanResTag("");
        appMenuItem19.setAccUserMode(2);
        //添加 项目查询
        AppMenuItem appMenuItem20 = appMenuRootItem.addItem("577A1782-CB3F-4780-AEB4-8183B5985B26","63E8D0D7-6101-454E-B0FD-951D5B5D15E6");
        appMenuItem20.setAppFuncId("0C5B1CCE-EBF2-4356-9273-160953B289EF");
        appMenuItem20.setItemType("MENUITEM");
        appMenuItem20.setText("项目查询");
        appMenuItem20.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM20");
        appMenuItem20.setTooltip("项目查询");
        appMenuItem20.setTooltipLanResTag("");
        appMenuItem20.setAccUserMode(2);
        //添加 检务保障部
        AppMenuItem appMenuItem21 = appMenuRootItem.addItem("495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B","");
        appMenuItem21.setAppFuncId("");
        appMenuItem21.setItemType("MENUITEM");
        appMenuItem21.setText("检务保障部");
        appMenuItem21.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM21");
        appMenuItem21.setTooltip("检务保障部");
        appMenuItem21.setTooltipLanResTag("");
        //添加 用餐
        AppMenuItem appMenuItem22 = appMenuRootItem.addItem("446DC106-238C-4CC5-9539-44C6E475271C","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem22.setAppFuncId("592ACECF-AB68-4136-BCAB-EA336ED5E09A");
        appMenuItem22.setItemType("MENUITEM");
        appMenuItem22.setText("用餐");
        appMenuItem22.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM22");
        appMenuItem22.setTooltip("用餐");
        appMenuItem22.setTooltipLanResTag("");
        appMenuItem22.setAccUserMode(2);
        //添加 设备维修
        AppMenuItem appMenuItem23 = appMenuRootItem.addItem("D328D794-C851-495D-BC87-C1D90AA03434","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem23.setAppFuncId("5C5FD07F-5E2F-408E-8763-04C4F89549CA");
        appMenuItem23.setItemType("MENUITEM");
        appMenuItem23.setText("设备维修");
        appMenuItem23.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM23");
        appMenuItem23.setTooltip("设备维修");
        appMenuItem23.setTooltipLanResTag("");
        appMenuItem23.setAccUserMode(2);
        //添加 电脑报修
        AppMenuItem appMenuItem24 = appMenuRootItem.addItem("50877AB9-1A1C-4823-8B81-C5B8DE2916BF","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem24.setAppFuncId("");
        appMenuItem24.setItemType("MENUITEM");
        appMenuItem24.setText("电脑报修");
        appMenuItem24.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM24");
        appMenuItem24.setTooltip("电脑报修");
        appMenuItem24.setTooltipLanResTag("");
        //添加 机票预订
        AppMenuItem appMenuItem25 = appMenuRootItem.addItem("DD47DC45-8DDF-49F0-BF43-AFC65C13AECE","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem25.setAppFuncId("9DCA9DD0-3CDF-41FF-8984-C20D5A3F15AF");
        appMenuItem25.setItemType("MENUITEM");
        appMenuItem25.setText("机票预订");
        appMenuItem25.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM27");
        appMenuItem25.setTooltip("机票预订");
        appMenuItem25.setTooltipLanResTag("");
        appMenuItem25.setAccUserMode(2);
        //添加 饮用水配送
        AppMenuItem appMenuItem26 = appMenuRootItem.addItem("878F158F-DBB1-4CD1-8455-1F23232BBCB1","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem26.setAppFuncId("18C1BDBE-2FE8-4B1D-AC38-EA156FA0BE4C");
        appMenuItem26.setItemType("MENUITEM");
        appMenuItem26.setText("饮用水配送");
        appMenuItem26.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM28");
        appMenuItem26.setTooltip("饮用水配送");
        appMenuItem26.setTooltipLanResTag("");
        appMenuItem26.setAccUserMode(2);
        //添加 办公耗材
        AppMenuItem appMenuItem27 = appMenuRootItem.addItem("B1E7F9CF-FB9E-44BC-919D-0D235F963CD1","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem27.setAppFuncId("4F51A7C1-DCB9-4781-87D7-91497DEADF12");
        appMenuItem27.setItemType("MENUITEM");
        appMenuItem27.setText("办公耗材");
        appMenuItem27.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM29");
        appMenuItem27.setTooltip("办公耗材");
        appMenuItem27.setTooltipLanResTag("");
        appMenuItem27.setAccUserMode(2);
        //添加 车辆维修
        AppMenuItem appMenuItem28 = appMenuRootItem.addItem("127111BB-0836-4B43-BB07-38951EC80082","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem28.setAppFuncId("7758F366-904B-409F-B5C2-8C07A5B22D51");
        appMenuItem28.setItemType("MENUITEM");
        appMenuItem28.setText("车辆维修");
        appMenuItem28.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM30");
        appMenuItem28.setTooltip("车辆维修");
        appMenuItem28.setTooltipLanResTag("");
        appMenuItem28.setAccUserMode(2);
        //添加 食堂外卖
        AppMenuItem appMenuItem29 = appMenuRootItem.addItem("DD3446F2-14A5-49ED-824B-6B88036ED167","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem29.setAppFuncId("9788E100-880E-4A59-BC6E-D15691D659BC");
        appMenuItem29.setItemType("MENUITEM");
        appMenuItem29.setText("食堂外卖");
        appMenuItem29.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM31");
        appMenuItem29.setTooltip("食堂外卖");
        appMenuItem29.setTooltipLanResTag("");
        appMenuItem29.setAccUserMode(2);
        //添加 门禁申请
        AppMenuItem appMenuItem30 = appMenuRootItem.addItem("801CD5E3-C567-447D-A939-84E41526C1C3","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem30.setAppFuncId("0DEE343D-99DA-4AA2-A035-E073DF7371FF");
        appMenuItem30.setItemType("MENUITEM");
        appMenuItem30.setText("门禁申请");
        appMenuItem30.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM34");
        appMenuItem30.setTooltip("门禁申请");
        appMenuItem30.setTooltipLanResTag("");
        appMenuItem30.setAccUserMode(2);
        //添加 派车申请
        AppMenuItem appMenuItem31 = appMenuRootItem.addItem("64517176-B3AC-4444-9E81-57F0A10A2C61","495C5C67-C29E-4F7D-8DAC-CB14FDFEB33B");
        appMenuItem31.setAppFuncId("F15E6E87-25FB-4CF2-8160-F17B03AAE92E");
        appMenuItem31.setItemType("MENUITEM");
        appMenuItem31.setText("派车申请");
        appMenuItem31.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM35");
        appMenuItem31.setTooltip("派车申请");
        appMenuItem31.setTooltipLanResTag("");
        appMenuItem31.setAccUserMode(2);
        //添加 组织人事
        AppMenuItem appMenuItem32 = appMenuRootItem.addItem("75081D90-3FF6-4D44-9465-A7C4D044F946","");
        appMenuItem32.setAppFuncId("");
        appMenuItem32.setItemType("MENUITEM");
        appMenuItem32.setText("组织人事");
        appMenuItem32.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM7");
        appMenuItem32.setTooltip("组织人事");
        appMenuItem32.setTooltipLanResTag("");
        //添加 单位
        AppMenuItem appMenuItem33 = appMenuRootItem.addItem("355BBD72-DB29-4443-B670-13A4F957EFB7","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem33.setAppFuncId("2D0712A4-D592-402F-89AD-118D3A9FA390");
        appMenuItem33.setItemType("MENUITEM");
        appMenuItem33.setText("单位");
        appMenuItem33.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM8");
        appMenuItem33.setTooltip("单位");
        appMenuItem33.setTooltipLanResTag("");
        appMenuItem33.setAccUserMode(2);
        //添加 部门
        AppMenuItem appMenuItem34 = appMenuRootItem.addItem("848A35A6-735D-4437-ACDB-8E4A4F58F493","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem34.setAppFuncId("147AB456-A939-446C-8BD1-54BDB7C34AC8");
        appMenuItem34.setItemType("MENUITEM");
        appMenuItem34.setText("部门");
        appMenuItem34.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM3");
        appMenuItem34.setTooltip("部门");
        appMenuItem34.setTooltipLanResTag("");
        appMenuItem34.setAccUserMode(2);
        //添加 职务
        AppMenuItem appMenuItem35 = appMenuRootItem.addItem("6320E8E7-873C-4C4A-BBD7-5C44C342DE66","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem35.setAppFuncId("349D89C5-01BA-42DE-A134-7CB21447C21C");
        appMenuItem35.setItemType("MENUITEM");
        appMenuItem35.setText("职务");
        appMenuItem35.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM4");
        appMenuItem35.setTooltip("职务");
        appMenuItem35.setTooltipLanResTag("");
        appMenuItem35.setAccUserMode(2);
        //添加 人员
        AppMenuItem appMenuItem36 = appMenuRootItem.addItem("2004EA98-3018-4B08-AB8F-544A8A856E9B","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem36.setAppFuncId("E54A3B9A-AD49-4CFC-ACCD-A77EB4AB9BEF");
        appMenuItem36.setItemType("MENUITEM");
        appMenuItem36.setText("人员");
        appMenuItem36.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM10");
        appMenuItem36.setTooltip("人员");
        appMenuItem36.setTooltipLanResTag("");
        appMenuItem36.setAccUserMode(2);
        //添加 微信
        AppMenuItem appMenuItem37 = appMenuRootItem.addItem("DC5A47CB-5EEC-4C31-B54F-722A232AFA35","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem37.setAppFuncId("");
        appMenuItem37.setItemType("MENUITEM");
        appMenuItem37.setText("微信");
        appMenuItem37.setTextLanResTag("");
        appMenuItem37.setTooltip("微信");
        appMenuItem37.setTooltipLanResTag("");
        //添加 微信账号
        AppMenuItem appMenuItem38 = appMenuRootItem.addItem("FED3FE26-E8FF-436C-A17C-3D1445B3E156","DC5A47CB-5EEC-4C31-B54F-722A232AFA35");
        appMenuItem38.setAppFuncId("90422F4D-8D61-474C-A0E4-8BD2FE5321E9");
        appMenuItem38.setItemType("MENUITEM");
        appMenuItem38.setText("微信账号");
        appMenuItem38.setTextLanResTag("");
        appMenuItem38.setTooltip("微信账号");
        appMenuItem38.setTooltipLanResTag("");
        appMenuItem38.setAccUserMode(2);
        //添加 微信部门
        AppMenuItem appMenuItem39 = appMenuRootItem.addItem("326D3E20-4B08-4CFC-BD9F-607084906CDF","DC5A47CB-5EEC-4C31-B54F-722A232AFA35");
        appMenuItem39.setAppFuncId("866447C8-EBF2-40A7-B520-8BCF3A3DE4FE");
        appMenuItem39.setItemType("MENUITEM");
        appMenuItem39.setText("微信部门");
        appMenuItem39.setTextLanResTag("");
        appMenuItem39.setTooltip("微信部门");
        appMenuItem39.setTooltipLanResTag("");
        appMenuItem39.setAccUserMode(2);
        //添加 微信应用
        AppMenuItem appMenuItem40 = appMenuRootItem.addItem("C332A3CB-A281-428E-8648-537CFDF076D0","DC5A47CB-5EEC-4C31-B54F-722A232AFA35");
        appMenuItem40.setAppFuncId("18E33826-1655-482D-A105-A00EC4703AC3");
        appMenuItem40.setItemType("MENUITEM");
        appMenuItem40.setText("微信应用");
        appMenuItem40.setTextLanResTag("");
        appMenuItem40.setTooltip("微信应用");
        appMenuItem40.setTooltipLanResTag("");
        appMenuItem40.setAccUserMode(2);
        //添加 权限配置
        AppMenuItem appMenuItem41 = appMenuRootItem.addItem("220E3AA9-CD29-4916-9E47-11FEF35E6273","75081D90-3FF6-4D44-9465-A7C4D044F946");
        appMenuItem41.setAppFuncId("");
        appMenuItem41.setItemType("MENUITEM");
        appMenuItem41.setText("权限配置");
        appMenuItem41.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM13");
        appMenuItem41.setTooltip("权限配置");
        appMenuItem41.setTooltipLanResTag("");
        //添加 用户对象
        AppMenuItem appMenuItem42 = appMenuRootItem.addItem("A621E2F8-D05D-4932-B4D9-63E00D99523D","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem42.setAppFuncId("FAF0281A-2C7F-4E24-B6E6-1A16FD0F8126");
        appMenuItem42.setItemType("MENUITEM");
        appMenuItem42.setText("用户对象");
        appMenuItem42.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM14");
        appMenuItem42.setTooltip("用户对象");
        appMenuItem42.setTooltipLanResTag("");
        appMenuItem42.setAccUserMode(2);
        //添加 用户角色
        AppMenuItem appMenuItem43 = appMenuRootItem.addItem("FD9A3119-E81A-460D-9E4E-9F84DCC4E484","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem43.setAppFuncId("C7AA6271-2FD6-4B16-99D2-9B5C528A0FFE");
        appMenuItem43.setItemType("MENUITEM");
        appMenuItem43.setText("用户角色");
        appMenuItem43.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM18");
        appMenuItem43.setTooltip("用户角色");
        appMenuItem43.setTooltipLanResTag("");
        appMenuItem43.setAccUserMode(2);
        //添加 工作流用户组
        AppMenuItem appMenuItem44 = appMenuRootItem.addItem("B9CC5625-5737-4E26-B36B-E046FC5C6DD2","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem44.setAppFuncId("9A20F4BE-197E-4D89-8C24-19248D0E6A1E");
        appMenuItem44.setItemType("MENUITEM");
        appMenuItem44.setText("工作流用户组");
        appMenuItem44.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM44");
        appMenuItem44.setTooltip("工作流用户组");
        appMenuItem44.setTooltipLanResTag("");
        appMenuItem44.setAccUserMode(2);
        //添加 统一资源
        AppMenuItem appMenuItem45 = appMenuRootItem.addItem("B1E87B39-2453-45BE-8456-F6C4699FD30D","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem45.setAppFuncId("55ACDD3E-8F30-4B41-98E0-E957533E7D75");
        appMenuItem45.setItemType("MENUITEM");
        appMenuItem45.setText("统一资源");
        appMenuItem45.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM17");
        appMenuItem45.setTooltip("统一资源");
        appMenuItem45.setTooltipLanResTag("");
        appMenuItem45.setAccUserMode(2);
        //添加 数据对象能力
        AppMenuItem appMenuItem46 = appMenuRootItem.addItem("B02FD8DF-2861-4E6E-8D56-3F2BB8DC9959","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem46.setAppFuncId("71A000A2-C7CB-4146-BF41-BD81E9EB49A1");
        appMenuItem46.setItemType("MENUITEM");
        appMenuItem46.setText("数据对象能力");
        appMenuItem46.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM16");
        appMenuItem46.setTooltip("数据对象能力");
        appMenuItem46.setTooltipLanResTag("");
        appMenuItem46.setAccUserMode(2);
        //添加 实体资源
        AppMenuItem appMenuItem47 = appMenuRootItem.addItem("CCB961E7-EA34-4E8A-B2EA-ACD50568DA0B","220E3AA9-CD29-4916-9E47-11FEF35E6273");
        appMenuItem47.setAppFuncId("42A37D26-F262-46F2-98D7-790606D7516B");
        appMenuItem47.setItemType("MENUITEM");
        appMenuItem47.setText("实体资源");
        appMenuItem47.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM15");
        appMenuItem47.setTooltip("实体资源");
        appMenuItem47.setTooltipLanResTag("");
        appMenuItem47.setAccUserMode(2);
        //添加 资源管理
        AppMenuItem appMenuItem48 = appMenuRootItem.addItem("9A4468CD-EC56-4F8A-84FA-411B4AB84BE4","");
        appMenuItem48.setAppFuncId("");
        appMenuItem48.setItemType("MENUITEM");
        appMenuItem48.setText("资源管理");
        appMenuItem48.setTextLanResTag("");
        appMenuItem48.setTooltip("资源管理");
        appMenuItem48.setTooltipLanResTag("");
        //添加 车辆
        AppMenuItem appMenuItem49 = appMenuRootItem.addItem("D9712007-87D1-4E90-972C-89D6056B12CC","9A4468CD-EC56-4F8A-84FA-411B4AB84BE4");
        appMenuItem49.setAppFuncId("06F33437-40DA-410B-BE1D-5DA92B5F72C9");
        appMenuItem49.setItemType("MENUITEM");
        appMenuItem49.setText("车辆");
        appMenuItem49.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM43");
        appMenuItem49.setTooltip("车辆");
        appMenuItem49.setTooltipLanResTag("");
        appMenuItem49.setAccUserMode(2);
        //添加 会议室
        AppMenuItem appMenuItem50 = appMenuRootItem.addItem("964BC263-04BF-4E19-92F5-1BB2D434B37F","9A4468CD-EC56-4F8A-84FA-411B4AB84BE4");
        appMenuItem50.setAppFuncId("6875B831-663E-4768-8CD3-EE2057960786");
        appMenuItem50.setItemType("MENUITEM");
        appMenuItem50.setText("会议室");
        appMenuItem50.setTextLanResTag("");
        appMenuItem50.setTooltip("会议室");
        appMenuItem50.setTooltipLanResTag("");
        appMenuItem50.setAccUserMode(2);
        //添加 系统管理
        AppMenuItem appMenuItem51 = appMenuRootItem.addItem("B7EE481F-FB9C-477A-BC80-58304AE96489","");
        appMenuItem51.setAppFuncId("");
        appMenuItem51.setItemType("MENUITEM");
        appMenuItem51.setText("系统管理");
        appMenuItem51.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM36");
        appMenuItem51.setTooltip("系统管理");
        appMenuItem51.setTooltipLanResTag("");
        //添加 消息模板管理
        AppMenuItem appMenuItem52 = appMenuRootItem.addItem("9D628077-6C21-404F-A76E-67116C146911","B7EE481F-FB9C-477A-BC80-58304AE96489");
        appMenuItem52.setAppFuncId("E99E188D-1A9C-4ADD-A2D3-F978B0918CED");
        appMenuItem52.setItemType("MENUITEM");
        appMenuItem52.setText("消息模板管理");
        appMenuItem52.setTextLanResTag("");
        appMenuItem52.setTooltip("消息模板管理");
        appMenuItem52.setTooltipLanResTag("");
        appMenuItem52.setAccUserMode(2);
        //添加 操作日志
        AppMenuItem appMenuItem53 = appMenuRootItem.addItem("468F6F03-40BD-4411-9C30-B0B0775BCA09","B7EE481F-FB9C-477A-BC80-58304AE96489");
        appMenuItem53.setAppFuncId("4BEFF96D-319C-4FCC-AAE5-0D1D794795BB");
        appMenuItem53.setItemType("MENUITEM");
        appMenuItem53.setText("操作日志");
        appMenuItem53.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM38");
        appMenuItem53.setTooltip("操作日志");
        appMenuItem53.setTooltipLanResTag("");
        appMenuItem53.setAccUserMode(2);
        //添加 登录日志
        AppMenuItem appMenuItem54 = appMenuRootItem.addItem("8AA1B0AD-F5F3-45D9-9976-8AAF852C4301","B7EE481F-FB9C-477A-BC80-58304AE96489");
        appMenuItem54.setAppFuncId("");
        appMenuItem54.setItemType("MENUITEM");
        appMenuItem54.setText("登录日志");
        appMenuItem54.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM39");
        appMenuItem54.setTooltip("登录日志");
        appMenuItem54.setTooltipLanResTag("");
        //添加 服务管理
        AppMenuItem appMenuItem55 = appMenuRootItem.addItem("C59FAC8B-4E94-4753-B4C3-773F1E969053","B7EE481F-FB9C-477A-BC80-58304AE96489");
        appMenuItem55.setAppFuncId("36A4159E-A1E7-464F-8EC8-CBA4D84D4082");
        appMenuItem55.setItemType("MENUITEM");
        appMenuItem55.setText("服务管理");
        appMenuItem55.setTextLanResTag("CONTROL.APPMENUITEM.CAPTION.APP.DEFAULT.MENUITEM26");
        appMenuItem55.setTooltip("服务管理");
        appMenuItem55.setTooltipLanResTag("");
        appMenuItem55.setAccUserMode(2);

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