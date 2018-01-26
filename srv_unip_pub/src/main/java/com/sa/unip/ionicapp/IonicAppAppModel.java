/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp;

import org.springframework.stereotype.Component;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.appmodel.AppViewModel;
import net.ibizsys.paas.appmodel.AppDEViewModel;
import com.sa.unip.srv.UniPSampleSysModel;

/**
 * 应用程序[移动端应用（Ionic）]模型对象
 */
@Component
public class IonicAppAppModel extends net.ibizsys.paas.appmodel.AppModelBase  {

    public IonicAppAppModel() throws Exception {
        super();
        //设置应用基本信息
        this.setId("5997FA54-938C-4640-8689-551ED7338FEC");
        this.setName("IonicApp");
        this.setPFType("IONIC");
        //注册到全局应用程序模型对象
        AppModelGlobal.registerApplication("com.sa.unip.ionicapp.IonicAppAppModel",this);
        //准备应用用户模式菜单
        this.prepareAppUserModeMenus();
        //准备应用视图
        this.prepareAppViews();
    }

    private UniPSampleSysModel uniPSampleSysModel;

    /**
     * 获取当前系统模型对象
     * @return
     */
    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.core.IApplication#getSystem()
     */
    @Override
    public  ISystem getSystem() {
        return this.getUniPSampleSysModel();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.appmodel.AppModelBase#setPFType(java.lang.String)
     */
    @Override
    protected void setPFType(String strPFType) {
        super.setPFType(strPFType);
    }

    /**
     * 准备应用用户模式菜单
     * @throws Exception
     */
    protected void prepareAppUserModeMenus()throws Exception {
    }

    /**
     * 准备应用视图
     * @throws Exception
     */
    protected void prepareAppViews()throws Exception {
        //注册应用模块[基础数据]视图
        prepareAppViews_jcsj();
        //注册应用模块[消息通知]视图
        prepareAppViews_xxtz();
        //注册应用模块[常规]视图
        prepareAppViews_cg();
        //注册应用模块[业务审批]视图
        prepareAppViews_ywsp();
        //注册应用模块[系统管理]视图
        prepareAppViews_xtgl();
    }

    /**
     * 准备应用视图[基础数据]
     * @throws Exception
     */
    protected void prepareAppViews_jcsj()throws Exception {
        registerAppView("2ad16f25bd42fc51a3ffdf27934abe65","OA_FLFGMobListView","F37B9F4D-871C-4663-BB12-4E626FCF70DC","法律法规","jcsj",null,-1,-1);
        registerAppView("37d62c1844e7c0716b343fcf6da8169c","OA_HYSMobEditView","29ED92C4-0B6D-4853-9AFE-CB7F3F5EE642","会议室","jcsj",null,-1,-1);
        registerAppView("52124fd35e20bf91a82c6d066c9885c5","OA_CLMobPickupView","3ED7D12C-B572-45D1-85DB-8238878ACF5F","车辆选择","jcsj",null,-1,-1);
        registerAppView("67607298c531dfc33dff5662560d69b0","OA_ZSKMobEditView","E4263ABE-21AF-44F6-A4DD-4E49A53CF466","知识库","jcsj",null,-1,-1);
        registerAppView("aaaf54bb6b603d5de57113dac8fb1de4","OA_HYSMobPickupView","0FE25EB7-378E-4EAD-8D53-C253930E8692","会议室","jcsj",null,-1,-1);
        registerAppView("b5f254ed453e3b3eba77c59bd81b3a1b","OA_HYSMobPickupListView","31DBD591-07E3-49AB-854E-3AE9D6BC2F94","会议室","jcsj",null,-1,-1);
        registerAppView("c0d4b4e4a0b18e3bb182df5b6bd268bf","OA_FLFGMobEditView","9B3378C9-31DB-4588-9194-A42F653C6428","法律法规","jcsj",null,-1,-1);
        registerAppView("c8b3b820cf57a8b5d84eabea11090262","OA_ZSKMobListView","12158E95-74FF-46F0-A40C-A1B10F6DD660","知识库","jcsj",null,-1,-1);
        registerAppView("e5a822cafae66c43da288c0f2bac787b","OA_HYSMobListView","760FB561-07B2-4871-A718-FD4A35F8E200","会议室","jcsj",null,-1,-1);
        registerAppView("e85f110b78ed300af3301e41c054ae06","OA_CLMobPickupListView","8CF9D9CF-55A0-4097-AA39-A72DDAA16DAF","车辆选择","jcsj",null,-1,-1);
    }
    /**
     * 准备应用视图[消息通知]
     * @throws Exception
     */
    protected void prepareAppViews_xxtz()throws Exception {
        registerAppView("0c1038914f59228da3c271790091bf5b","OA_TZGGCKMobEditView","608F0597-C512-4BD7-98BD-4F893586C331","通知公告","xxtz",null,-1,-1);
        registerAppView("37be462d2eb81a7730a5817503989041","OA_RZRYMySenderMobMDView9","F36C7394-044D-41C5-9D85-72E7F0ECCEF0","日志人员","xxtz",null,-1,-1);
        registerAppView("4a91b1c0402b90fc9be2215f4e64e07b","OA_TZGGTZGGSQLC_W_MobWFMDView","519d3dccf9119c028a608b8b01853e56","通知公告","xxtz",null,-1,-1);
        registerAppView("5323f2181b5d6fc4dc7888425ffa11f5","OA_TZGGMobEditView","BCD622B4-9D64-47B8-992B-07660FC438B4","通知公告","xxtz",null,-1,-1);
        registerAppView("62815bb90e37726ca41b81dcfa7f2370","OA_TZGGTZGGSQLC_W10_MobWFEditView3","9e5366845c5a65bc92d84e2b992e03af","通知公告","xxtz",null,-1,-1);
        registerAppView("700dfcbcbe8688eb0f0a7ab4b5fa3734","OA_TZGGMobListView","1E9D999A-9CF3-46D2-9D8E-4ACBB3097ACF","通知公告","xxtz",null,-1,-1);
        registerAppView("7b1ebd1f9f4129e840081a8d0a32ec1a","OA_TZGGMobTabExpView","E15073D9-5F01-4108-AAA5-9ACAFAA6103F","公告","xxtz",null,-1,-1);
        registerAppView("9a7c7c438c2fa22be7478f424e4c07a7","OA_TZGGWDMobMDView9","A639DBEC-2F96-4144-8175-2F6F3D9804CC","未读公告","xxtz",null,-1,-1);
        registerAppView("a8d84dbac308a2893ae8b258f823175f","OA_RZRYMobTabExpView","AFCF151F-23C3-428D-A9D9-6543C8473255","日志人员","xxtz",null,-1,-1);
        registerAppView("b0b3157b84762b3bc5b93fa789e0b997","OA_TZGGTZGGSQLC_D_MobWFEditView3","1f91c9612e96411152c765731ad4694f","通知公告","xxtz",null,-1,-1);
        registerAppView("b94cc12907b2474052950c288a30249e","OA_RZRYCKMobListView","0EB9CFE3-635F-44A7-9BD4-8884B4085F8D","抄送我的","xxtz",null,-1,-1);
        registerAppView("bef794e3368860a04a16644ba5d38c71","OA_TZGGCKMobListView","691804F4-0B2A-4DD2-85A5-FCC461BA702F","通知公告","xxtz",null,-1,-1);
        registerAppView("c0afe4cfaccde2d50c40773617b4d45a","OA_TZGGTZGGSQLC_D_MobWFMDView","bcfd89625396f79b05ecb56b4935fae3","通知公告","xxtz",null,-1,-1);
        registerAppView("cff493545b67d2ced7022f6661be0062","OA_TZGGYDMobMDView9","648CD029-2DA1-4467-A898-53C3601E9263","已读","xxtz",null,-1,-1);
        registerAppView("dccdd78709952ff67fa1277f106c49bb","OA_TZGGMobWFActionView","CD4A82F1-1560-4124-A364-BD3AA9D8B3B3","通知公告","xxtz","POPUPMODAL",-1,-1);
        registerAppView("e31e24b9edcb46df8e432ef5054f4f43","OA_RZRYMyReceiveMobMDView9","19E1CFB3-1D49-4612-8490-44B8AA172990","我收到的","xxtz",null,-1,-1);
        registerAppView("e47bffe27a593063e96978f75bfa08fd","OA_TZGGRYMobEditView","2AB78318-0DE3-4702-9DC5-8249969C3C51","通知公告人员","xxtz",null,-1,-1);
    }
    /**
     * 准备应用视图[常规]
     * @throws Exception
     */
    protected void prepareAppViews_cg()throws Exception {
        registerAppView("1cf26ee740a191d23618d299629d1eeb","OrgSectorMobPickupView","85FFF497-E484-4ED5-B988-6B90C6C9AEF7","组织部门选择","cg",null,-1,-1);
        registerAppView("211ac03436c0c80c5c894686ae3276cb","OA_YBHYSQCKMobEditView","64E31DF9-D82F-4CAF-8A46-8E54C282D952","院办会议申请查看","cg",null,-1,-1);
        registerAppView("2a4bf2e2387d742f08c4f80b550a2e55","OA_QXJSHJSMobEditView","38879E66-91EE-4A1F-AEFC-53F47DAAFDB7","请休假","cg",null,-1,-1);
        registerAppView("2ee6a6159c0f370706b902485a533ad5","OrgUserTreeMobMPickupView","750FDA54-1050-41B0-A46D-8305A286CEA5","组织人员","cg",null,-1,-1);
        registerAppView("302c8a812a475149749087bc8899ba81","OA_BGYPSQSHJSMobEditView","22CA6CDF-5930-4C5B-8D7D-FD527AAE73C4","办公用品申请","cg",null,-1,-1);
        registerAppView("30BD6B20-4E74-48D3-8CBB-E6E1D2EF5C96","mywork",null,"移动办公辅助系统","cg",null,-1,-1);
        registerAppView("3572b63b3481e0c66c93b6f3254613a9","OrgUserMobMPickupView","D74F893A-DB21-440A-8AD9-2C271BE08F1C","组织人员","cg",null,-1,-1);
        registerAppView("40362cea5434ec38e74308616c8671b9","OA_YBHYSQCKMobListView","D34DF252-B65B-42C7-985F-57A1EFFE68AE","院办会议申请查看","cg",null,-1,-1);
        registerAppView("4607ca8a958691fdfce22b6c05617464","OA_TZGGSHJSMobEditView","4B8AEF93-EE5A-4C49-A6CB-DFDB2C82B6EA","通知公告","cg",null,-1,-1);
        registerAppView("49cea694374f5d8b87812d1ba71bcb2d","OrgSectorMobPickupListView","9493FB52-BD59-492B-AAD8-FD1E2F977011","组织部门","cg",null,-1,-1);
        registerAppView("4defea26329125959a5681f4474a2cae","OrgUserMobPickupTreeView","D88AD52D-DF85-435D-AB53-3F4E7C0F10F2","组织人员","cg",null,-1,-1);
        registerAppView("5ade680b17a0db3ca626439a9cab8e4a","OA_NSJGHYSQSHJSMobEditView","8A7183EB-C24A-422B-9BA0-F6F28BA14A9D","内设机构会议申请","cg",null,-1,-1);
        registerAppView("5dc14450fc9e0ed40724721a637558d2","OrgUserMobPickupMDView","2D0C6CB5-3DD5-4C9E-BAF2-ED1D21B306F3","组织人员","cg",null,-1,-1);
        registerAppView("6301ecb9da5b0fac9f4a9c7bca265ae6","OA_GZRZSHJSMobEditView","12890AE4-4339-43E6-A25D-0F7867A4444A","工作日志","cg",null,-1,-1);
        registerAppView("67036924-77CD-48E5-B23E-311DBDD0B92C","index",null,"","cg",null,-1,-1);
        registerAppView("6ebb879abc734226a3101a7cb153a25f","OA_CLWXSHJSMobEditView","9CC2C3A5-4482-4A30-A5E9-91C28EF7A8AF","车辆维修","cg",null,-1,-1);
        registerAppView("6fcf329d9a0b37b151f74367fa466e38","OA_CGSQSHJSMobEditView","1771854F-8022-4BAE-BF03-52D71880D3FA","采购申请","cg",null,-1,-1);
        registerAppView("7207f36726026cac3001a58a3070d0e5","OA_YBHYSQSHJSMobEditView","73DC873B-780E-4FD7-9488-2045553D3E1A","会议申请","cg",null,-1,-1);
        registerAppView("7694aa11aa6c1919e5720105d023f255","OA_JPYDSHJSMobEditView","2F24A531-9EFF-4E05-9460-58AA3CC9BC35","机票预订","cg",null,-1,-1);
        registerAppView("7903e950b4bf116cd19ca1fecd20d62b","OA_PCSQSHJSMobEditView","3EF63D49-8454-4DA0-ABF9-1267C7605597","派车申请","cg",null,-1,-1);
        registerAppView("90398f16e1d636c3d2d5092473404267","OA_CPMJSQSHJSMobEditView","E91A9535-19DB-40CC-A915-E2D008DC55A4","车牌门禁申请","cg",null,-1,-1);
        registerAppView("96d60b8bef953dad5616a6cea8307095","OrgUserMobPickupListView","E6F84FE8-1D15-4DE1-AD04-F93521732844","组织人员选择","cg",null,-1,-1);
        registerAppView("9F4F30B6-C2E0-4E1B-A8AD-259D3BDB6B0A","worklog",null,"工作日志","cg",null,-1,-1);
        registerAppView("aec1ca25c156cfdc651ad0215d68abc9","OrgUserMobPickupView","2EF655DA-7FEB-4088-B7B7-8CFE5F99FA01","组织人员选择","cg",null,-1,-1);
        registerAppView("C50A2E7E-9E7D-4894-B356-C21EAE081EB5","sp",null,"审批","cg",null,-1,-1);
        registerAppView("cb567978b9c389a83321b372550d5661","OA_STWMDGSHJSMobEditView","49908396-A524-45F6-941B-53B1828B77A7","食堂外卖订购","cg",null,-1,-1);
        registerAppView("db1b9a4217e35de39dcc6d1c61ee13d3","OA_CHRYRedirectView2","C51B4B6B-869E-45BA-AE3F-375A43954A68","参会人员数据重定向视图","cg",null,-1,-1);
        registerAppView("e73820a57b6e36cf232667db95eff347","OA_YCSQSHJSMobEditView","4A084B25-2244-4509-8C6D-C330E3310BB9","用餐申请","cg",null,-1,-1);
        registerAppView("e8897b1b197871c9e7b430c1bcd16b08","OA_CCSQSHJSMobEditView","6FBC804F-E289-4E16-8F87-9E8A84AC055F","出差申请","cg",null,-1,-1);
        registerAppView("f357e6232c424e2c3b4590e6c78865db","OA_YYSSQSHJSMobEditView","2DE5B022-3AB2-464E-9073-BFE4D9FCFA3E","饮用水申请","cg",null,-1,-1);
        registerAppView("f73e2c5486c0669dc0e0039bda42859c","OA_SBWXSHJSMobEditView","DA44F1BB-FBD1-4C65-9F3B-6382A4C1CB91","设备维修","cg",null,-1,-1);
    }
    /**
     * 准备应用视图[业务审批]
     * @throws Exception
     */
    protected void prepareAppViews_ywsp()throws Exception {
        registerAppView("0032965fad6892ed45965df6a0be7c36","OA_YBHYSQMobWFActionView","8D2FE24E-D357-4064-886A-1060359A9F73","院办会议申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("0076dc490e846f311903a5c8f2435e7d","OA_CCSQCCSQLC_W10_MobWFEditView3","60317f99e72abc41e4a115bd0bbd8981","出差申请","ywsp",null,-1,-1);
        registerAppView("035de24f4949a0acf920f796a7c4d114","OA_JPYDMobWFActionView","A97BA250-F701-4E5B-B92E-0283DD84A01C","机票预订","ywsp","POPUPMODAL",-1,-1);
        registerAppView("04035946737be0a81f7b6abd5f3d8d3d","OA_JPYDCKMobListView","DD248CFD-030D-4A8F-9E28-754208259728","机票预订查看","ywsp",null,-1,-1);
        registerAppView("04a3424865c63f4c5c04a5fd9ed6ea69","OA_STWMDGMobWFActionView","C4068B1D-BB28-4796-A557-8B0952A3EB63","食堂外卖订购","ywsp","POPUPMODAL",-1,-1);
        registerAppView("077d67fc8062bc80740da39b24c2d0ab","OA_GZRZRZTJLC_D_MobWFEditView3","233d54fae77306c478a769ddf6fa3fe6","工作日志","ywsp",null,-1,-1);
        registerAppView("0784bccb1521749b25a22e2d4a318da3","OA_QXJMobWFActionView","6C55125F-ACDB-4A55-9933-EEF38B4FBE80","审核意见","ywsp","POPUPMODAL",-1,-1);
        registerAppView("09713c9efa6847abaaf340d8a9104d0b","OA_PCSQCKMobListView","DD8F14AB-A14F-46BC-98A3-3D82AE7D9EFC","派车申请","ywsp",null,-1,-1);
        registerAppView("0bd274f3ae712183ca3c28c682b66723","OA_YCSQMobListView","FAE04313-D330-44D5-9529-4614E5F11F3E","用餐申请","ywsp",null,-1,-1);
        registerAppView("0bd59de3cf01036600292bad84035b5f","OA_JPYDJPYDLC_D_MobWFMDView","c15902aa701e6946fb845a52ea8434a7","机票预订","ywsp",null,-1,-1);
        registerAppView("0c47972c1d786efaa09817d829cdd75f","OA_CPMJSQCPMJSQLC_W_MobWFMDView","ff3b9acc9e0bea8796ba863255c20702","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("0c9dea9c8493b78128ec54154095ebc8","OA_CCSQCKMobListView","55BDAF87-D4BB-4C6D-8F66-4AF8AF17177A","出差申请查看","ywsp",null,-1,-1);
        registerAppView("0d28cc35e4c4b09497859fc1ca653837","OA_CPMJSQMobEditView","87C55463-2DFB-4B1D-933F-6D2066FD539B","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("0d9be3834c1f50664a8ad250e224dead","OA_CPMJSQCPMJSQLC_D_MobWFEditView3","dfdac2220eae9c33674a82f1d6a90bdb","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("0eb011ccdac1c88499e2053214eca514","OA_CGSQMobEditView","65200D95-D4AE-498A-89ED-B261A313F9C5","采购申请","ywsp",null,-1,-1);
        registerAppView("1310e57402662522580d19dc4118fa59","WFWorkListMobTabExpView","D0D81900-95A3-4953-98EE-5FB0CBC3A505","审批","ywsp",null,-1,-1);
        registerAppView("16aeaf01077f8fedfa3d795c7e218858","OA_SBWXSBWXLC_W10_MobWFEditView3","50ed734e2dbfa2f611bf3baeb44ea03a","设备维修","ywsp",null,-1,-1);
        registerAppView("16b4acc1033158a52c96fdeba33aeb5c","OA_YCSQYCSQLC_W10_MobWFEditView3","f0b3cad27770e3b62cd657215d951332","用餐申请","ywsp",null,-1,-1);
        registerAppView("1789bdd2c0ae6dcf45ddf677f8b20cb3","OA_YYSSQMobEditView","95BF2003-9621-46FD-8DFA-4A2432229A55","饮用水申请","ywsp",null,-1,-1);
        registerAppView("1a0a90627d3c957e30459555ce20fb9f","OA_JPYDJPYDLC_W_MobWFMDView","9abba40af7c5d2ca8a6aa304f28a9d2d","机票预订","ywsp",null,-1,-1);
        registerAppView("1b62fb3e0f294cce714569589eef8af6","OA_CLWXMobWFActionView","96242CB5-90E3-4785-BDD3-BB0B24F6956C","车辆维修","ywsp","POPUPMODAL",-1,-1);
        registerAppView("1f47dbbaa0613649ce9f462d0ba0050e","OA_YCSQMobWFActionView","02572C70-2D18-47DA-A734-9EEB9A355979","用餐申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("1fc09413942bf0495d8bd7d44085b9ea","OA_YYSSQYYSSQ_W10_MobWFEditView3","c6daaca7b99845c9b4d4d8fc7fab2e23","饮用水申请","ywsp",null,-1,-1);
        registerAppView("1fca1efdf3c5115a91bc0f39990ff759","OA_CLWXMobEditView","30BAA91A-4500-421C-B03C-BE696038CF93","车辆维修","ywsp",null,-1,-1);
        registerAppView("221dc36171072bcc8d1c24b697a33639","WFStepDataMyTimeLineMobMDView","B60380D4-A283-427E-98D1-459ADB3EDB1F","工作流步骤数据移动端多数据视图","ywsp",null,-1,-1);
        registerAppView("22e3a0edb7d05c549c70320166e90bdb","OA_PCSQMobEditView","394B8D99-C729-4331-8153-CCCAB3DD62F9","派车申请","ywsp",null,-1,-1);
        registerAppView("2345e347f3d791a02b9db8bb53bdd361","OA_STWMDGCKMobEditView","B23FE1DA-F0CD-4645-B02A-588C1670A4BC","食堂外卖订购查看","ywsp",null,-1,-1);
        registerAppView("25245e6497af4f10c02549ea103c0218","OA_YBHYSQYBHYSQ_D_MobWFMDView","1c8cc5ee4b4e63ed30f61fe221080f19","院办会议申请","ywsp",null,-1,-1);
        registerAppView("25bce140a733be18862eff5087ebbdf0","demoMobEditView","0D5BD40E-7E69-465D-9745-C553E4E083B3","演示","ywsp",null,-1,-1);
        registerAppView("28ac68d3efa48282e93cc7d5ed13d83b","OA_SBWXCKMobEditView","6EA1F85B-FA52-4A2C-9143-3384AD781E4A","设备维修查看","ywsp",null,-1,-1);
        registerAppView("29710d44938a2257d4b41bb459337477","OA_JPYDJPYDLC_D_MobWFEditView3","93c8dacdd1d4460d409e97f11561f57c","机票预定","ywsp",null,-1,-1);
        registerAppView("2a5dd6e7f576c3ed0d86c5ac7ffddd90","OA_YCSQYCSQLC_W20_MobWFEditView3","055f3b9a2eab62d436348c0ba1a3cb05","用餐申请","ywsp",null,-1,-1);
        registerAppView("2b3328ec0c98a207312bbe74f0c14aea","OA_GZRZCKMobListView","CD5AD19C-6E4F-4FE5-9CB1-A7386260905D","工作日志查看","ywsp",null,-1,-1);
        registerAppView("2c7daa90414ee81900a20e558ca984bf","OA_YBHYSQYBHYSQ_W10_MobWFEditView3","762a76add5afcb8f86123daddaae3f47","院办会议申请","ywsp",null,-1,-1);
        registerAppView("2c97053162653d8a50c88fdab1b1fb8c","OA_BGYPSQMobListView","1ADDD244-F7DE-4EA7-9448-9585C772E353","办公用品申请","ywsp",null,-1,-1);
        registerAppView("2d02851ece76b968616e1d02caed8adb","OA_BGYPSQMobWFActionView","629E8E7E-D7AD-49E7-B4C7-74CAD82D10F3","办公用品申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("32d95f492b293e4f81554656b4848c7a","OA_CLWXCLWXLC_D_MobWFEditView3","e5ff356e9c614abf17d19aedb726fe3b","车辆维修","ywsp",null,-1,-1);
        registerAppView("34630c27831fc7f5fa7905659bb1c2b0","OA_GZRZRZTJLC_W_MobWFMDView","8c30878485a31985a452034d1ce9d2f0","工作日志","ywsp",null,-1,-1);
        registerAppView("3601020488fc50d7129d2b7750adfc79","OA_CCSQCCSQLC_D_MobWFEditView3","a430fe685662066e013e466d9a837a75","出差申请","ywsp",null,-1,-1);
        registerAppView("361b1a40bda1e3570864a37df1c7442f","OA_BGYPSQMobEditView","B9FB2882-E64C-4E9B-9751-3F3966F8960A","办公用品申请","ywsp",null,-1,-1);
        registerAppView("366fee11eb751293f2aa9d65d71c570a","OA_QXJQXJLC_D_MobWFMDView","f64555d7f6b2c0972f44e545d12d309f","请休假","ywsp",null,-1,-1);
        registerAppView("36fbcd19082724fae18d939c0f407212","OA_QXJQXJLC_D_MobWFEditView3","a8fd2d823f877e65c6e46db06104aac7","请假","ywsp",null,-1,-1);
        registerAppView("3ed0f1c3721e6813c32542a80bb0c3bc","OA_CGSQCKMobListView","7102C790-A523-4EA8-B90A-84E645434ACB","采购申请查看","ywsp",null,-1,-1);
        registerAppView("3ee25a17c16655a3c8e7139211eec47d","OA_SBWXSBWXLC_D_MobWFMDView","dda0ab8b6a1fbc6069fc610485f492be","设备维修","ywsp",null,-1,-1);
        registerAppView("3f49c0c076704d119bc8419b02d145e6","demoDEMOLC_W_MobWFMDView","d19536c465c50b3f8b23de2b32e45812","演示","ywsp",null,-1,-1);
        registerAppView("42b510978e09cf4ec4e8f41717499406","OA_PCSQMobWFActionView","02C5F250-C3B9-481B-B116-6C7482C6B95F","派车申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("43912584678fed64e09c86fd48b9b80f","OA_YBHYSQYBHYSQ_W50_MobWFEditView3","e8436b48ebec7f5a27b0eed713b5e972","院办会议申请","ywsp",null,-1,-1);
        registerAppView("43ffe0bf6dd2b92360e20adef2d626b6","OA_GZRZMobEditView","BD61D7C7-EC22-4926-9254-571A3291AD82","工作日志","ywsp",null,-1,-1);
        registerAppView("4431b859e2fc1fcd84c051329536425e","OA_YCSQYCSQLC_D_MobWFEditView3","3dfc36390e6567b6eadd8ecdd627663b","用餐申请","ywsp",null,-1,-1);
        registerAppView("452f83cd8017161d7d743430a7d36213","OA_CHRYCKCHRYMobEditView","1B46FE42-5711-4857-9D5E-81B9A5A6BA3E","参会人员","ywsp",null,-1,-1);
        registerAppView("4b5b3d1d5da7bb7701cc603a7a8349ad","OA_GZRZRZTJLC_D_MobWFMDView","afb0810d2c90812ec9c6a27c9db3c59b","工作日志","ywsp",null,-1,-1);
        registerAppView("4dbf0f506a23dadd4c4aaa7b553137b4","OA_GZRZMobTabExpView","B81784CA-12BB-4C22-AEA1-425DC04C5DC7","未读日志","ywsp",null,-1,-1);
        registerAppView("4f46d86107ae782094f4e4b6b9a7a25b","OA_YYSSQYYSSQ_W_MobWFMDView","8c45073390efa9507efc34d7bde30651","饮用水申请","ywsp",null,-1,-1);
        registerAppView("51029bd7ae9ba30f32e186f28b20d7ad","OA_YBHYSQMobPickupView","5E32A4E0-0D50-495C-910B-A75BD3E5E4E7","院办会议申请","ywsp",null,-1,-1);
        registerAppView("518109a8d184b83e31cb9ba72d4685b2","OA_CCSQCKMobEditView","029C465B-BFC8-4A73-BA22-2BD5A5793554","出差申请查看","ywsp",null,-1,-1);
        registerAppView("51e0d7add8af9377c96f9389ff0b1958","OA_CGSQCGSQLC_W20_MobWFEditView3","542dea8fc2bcbdb8bd07b766353901e7","采购申请","ywsp",null,-1,-1);
        registerAppView("520aee0a5af255166013d31d784ea475","OA_CPMJSQCPMJSQLC_W10_MobWFEditView3","1f591f5276cb8efad3645ccbee0a3899","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("5323294706168036042987830906f73e","OA_GZRZZSMobEditView","47DE75C9-88E2-4E2C-965E-F9463648931F","工作日志展示","ywsp",null,-1,-1);
        registerAppView("53d218aa0482f3eeed5a1ebe54e7c44d","OA_STWMDGMobListView","86A230EC-F651-4AAA-A0C1-F1F07CF1678A","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("56640082950f5ff274d22478180f0b65","WFStepDataMobMDView9","B81D638D-CC9C-4CB7-A076-BC67B759F3EF","工作流步骤数据移动端多数据视图","ywsp",null,-1,-1);
        registerAppView("598cc43cdd85c990ba9a683c239e8ca6","OA_NSJGHYSQNSJGHYSQ_W20_MobWFEditView3","612ca7d3afa14efafef738d0cd72d6da","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("5a8a40afde6b64cdf381eb039e4bf04a","OA_CGSQCGSQLC_D_MobWFEditView3","66b4c5fbe7b7a3951b81035bf60e8037","采购申请","ywsp",null,-1,-1);
        registerAppView("5abe65f0a78a5883a00428fbb3d4a985","OA_QXJMobEditView","41B0A380-C416-49EE-ADCF-0EB57F52A267","请假","ywsp",null,-1,-1);
        registerAppView("5bfcb98726b3ea3cdcb3d5facff065cb","OA_CCSQMobEditView","EA6572CA-55DE-470F-9B90-65FE93BC202F","出差申请","ywsp",null,-1,-1);
        registerAppView("600cc6510b4fbda14d7fb64fd28c3cab","OA_RZRYCKMobEditView","7DF22048-B2BC-4B44-BE56-99B73ECE4F57","日志","ywsp",null,-1,-1);
        registerAppView("62f3fda1b72523630aba62c304addbf7","OA_PCSQPCSQLC_W_MobWFMDView","72060048d85f22f3431c6337d966deaf","派车申请","ywsp",null,-1,-1);
        registerAppView("64071cd372f172d33cc49e2a9abe91d5","OA_STWMDGSTWMDGLC_W_MobWFMDView","7a41a645e0030ab06e7897e32bc3ef75","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("643dc8b36392ed7b5730efafcadd7ee6","OA_YYSSQCKMobEditView","68A0F85B-73FB-4467-BA64-3DB6B4485DAD","饮用水申请查看","ywsp",null,-1,-1);
        registerAppView("65c0720c633bc3833d9877b1ff58d846","OA_YBHYSQYBHYSQ_D_MobWFEditView","6c833845ff2f0320b3a3db37ea36bbb4","院办会议申请","ywsp",null,-1,-1);
        registerAppView("65ec7f8223f5ef7d19558f26821adcb7","WFWorkListYSPMobMDView9","6B97D859-6148-42F2-9AB2-C6497060F4BF","已审批","ywsp",null,-1,-1);
        registerAppView("65ed309f916d77ce3a31465c772c9d82","OA_NSJGHYSQMobWFActionView","21D2FFDC-BA77-445A-95D8-4552D23C0472","内设机构会议申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("66e87d1b07c4f2238e820dd1fefd640b","OA_CGSQCGSQLC_W30_MobWFEditView3","fabb954af7e6cee89ef063b9762901cc","采购申请","ywsp",null,-1,-1);
        registerAppView("6721869aeb86beaf39031270cbd8d724","OA_CPMJSQCKMobEditView","ECFA9321-EF9F-4E4A-AA4A-2037B80396F0","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("676d9b882c4beed1fa1401ae80dae02e","OA_JPYDJPYDLC_W20_MobWFEditView3","1827b704bd96c577ae0a13cce6c9b4f0","机票预订","ywsp",null,-1,-1);
        registerAppView("695b217d6bfe5a624ca82a7717babfe7","OA_BGYPSQBGYPSQLC_D_MobWFEditView3","1d37db67d7e0de422ee99fdb7db21848","办公用品申请","ywsp",null,-1,-1);
        registerAppView("6b683bfce8686ca286782f7de59d5248","OA_YYSSQYYSSQ_D_MobWFEditView3","78e63cd59356a55f339ab506fd667d02","饮用水申请","ywsp",null,-1,-1);
        registerAppView("6f5bfddb05f8b2cddf3bfefa7247d8fd","OA_CCSQMobListView","F3FE2485-C670-41F9-96BC-8E7830AA5497","出差申请","ywsp",null,-1,-1);
        registerAppView("6f7efdb57b82e9bfb01ce776321f3c58","OA_STWMDGCKMobListView","871015A4-D297-492A-AFD3-214D2E2DE125","食堂外卖订购查看","ywsp",null,-1,-1);
        registerAppView("703840f62305f7587690e871257d9fdd","OA_NSJGHYSQNSJGHYSQ_D_MobWFMDView","088a03eacad076d29254e44dbfb1d1ad","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("7330120a20b18002b841aa0a02a4665c","OA_YCSQMobEditView","BF458A76-CCEA-44BD-9011-6D3208E2285E","用餐申请","ywsp",null,-1,-1);
        registerAppView("749bf763cff31f5428835315d33015fe","OA_PCSQPCSQLC_W10_MobWFEditView3","5297634cd22764dec56cc69b78586e22","派车申请","ywsp",null,-1,-1);
        registerAppView("773bd4a1077fad8e7ed61160aae1828e","WFWorkListRedirectView","74331a584d3e2cda30335d7e6fa4aa9c","工作流工作列表实体数据重定向视图","ywsp",null,-1,-1);
        registerAppView("77e42611358cd1b573c4586a21483786","OA_YBHYSQYBHYSQ_W20_MobWFEditView3","b0f6ec74f41a6104dda34eb4da723f8c","院办会议申请","ywsp",null,-1,-1);
        registerAppView("7920961ee40c1b267534965df96c6ba0","OA_YBHYSQYBHYSQ_W30_MobWFEditView3","045c31e4e6f15f613c405e1e19ace453","院办会议申请","ywsp",null,-1,-1);
        registerAppView("795a221bef0df1c36279468416859b37","OA_BGYPSQBGYPSQLC_W_MobWFMDView","1419450cad3c6bbf41ebf2c8532c5120","办公用品申请","ywsp",null,-1,-1);
        registerAppView("79c92bf867e8105dac6811f0122d79bb","OA_YYSSQYYSSQ_D_MobWFMDView","66ab1d244a9ac30ae8ab2dd1c143116b","饮用水申请","ywsp",null,-1,-1);
        registerAppView("7b4fa955583c686566bbbd2d5caff4ae","OA_NSJGHYSQMobListView","266ED36B-0B96-4D99-BB34-EBFD2F3E2946","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("7f8cb08eab65285c8b08fdad576472c1","OA_JPYDCKMobEditView","5199123E-C14B-4D3D-8685-9B6D9801CD4C","机票预订查看","ywsp",null,-1,-1);
        registerAppView("806a41af9a551389fedcb4859eaa241f","OA_NSJGHYSQNSJGHYSQ_W30_MobWFEditView3","2f04e7e7dd243732574da6d6ef9acd16","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("82348a4a6703a633318e4cd9c1f960cb","demoMobListView","0F705714-9F14-41C2-80CA-235983157A59","演示","ywsp",null,-1,-1);
        registerAppView("833a263c07dc62f1f0d978e81c2ed599","OA_GZRZMobListView","C5A1BF33-F167-4566-80A1-18A6593D9FB1","我的工作日志","ywsp",null,-1,-1);
        registerAppView("83706746d57447039e13986ea1d9549f","OA_CGSQCGSQLC_D_MobWFMDView","1003c2a63a6a1d6192b7077f5c2d034d","采购申请","ywsp",null,-1,-1);
        registerAppView("83d558e1d006924378afe41dbced269a","WFWorkListMyWFMobListView","FBC81457-3909-4476-977F-20BC2D9A4102","我发起的","ywsp",null,-1,-1);
        registerAppView("8654342bffdf7d3f9ce8cfeb22971c80","OA_CLWXCLWXLC_W20_MobWFEditView3","862b02f8d38b8ee0e40d61a52217e8f3","车辆维修","ywsp",null,-1,-1);
        registerAppView("898ba8095bba6568602ede2a48cdb3aa","OA_YCSQYCSQLC_W_MobWFMDView","8896f0a3892667a2b32a5dff6ed7f464","用餐申请","ywsp",null,-1,-1);
        registerAppView("8b4ce905f87f4e5e465cc7ba77521638","OA_NSJGHYSQNSJGHYSQ_W40_MobWFEditView3","aa8aa27c83983a252cedb0eb000f4a53","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("8b735ba25ad96ec6de899cf06a009a58","OA_YBHYSQSHYJMobWFActionView","63C6E815-D9BF-422B-98F9-1E0BA16C6439","会议申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("8c40cf7ac2fa866c1e28c2ea686c5a59","OA_GZRZZSMobListView","4F4DC8FF-4721-4BA8-B532-60935D38DF09","我的日志展示","ywsp",null,-1,-1);
        registerAppView("8d3c81be8f4a672bb333538497cc50a1","OA_CLWXCLWXLC_D_MobWFMDView","e3905d2d72e5d81734322c60b0a5616c","车辆维修","ywsp",null,-1,-1);
        registerAppView("8da2a533d7f0836154c866deec9f4c05","OA_SBWXSBWXLC_D_MobWFEditView3","8cd784d72fe1488d43b22341441e7fd7","设备维修","ywsp",null,-1,-1);
        registerAppView("8db9f956d0b9997080ee1617765ed9ff","OA_CLWXCKMobEditView","B4A53A99-FDA4-48FB-A54A-C85105506846","车辆维修查看","ywsp",null,-1,-1);
        registerAppView("8e17b4039bf9aba6cba5e58b4bd47a8f","OA_CCSQCCSQLC_W_MobWFMDView","c256977b159f38a2030092dcc38c72d0","出差申请","ywsp",null,-1,-1);
        registerAppView("8eb3da2daff145e89adf2e2434e22856","OA_PCSQMobListView","A9242674-C350-40A4-B882-E82347B9B0DC","派车申请","ywsp",null,-1,-1);
        registerAppView("90054004e5945981423837601a9dde4e","OA_BGYPSQCKMobListView","FF32CF50-2490-423A-8751-2BFAF23D00F8","办公用品申请","ywsp",null,-1,-1);
        registerAppView("9053ce01e24aad944a035eb912917a90","OA_CHRYMobMDView9","EBBE5818-F83A-45D9-88E2-D0984E672457","参会人员移动端多数据视图","ywsp",null,-1,-1);
        registerAppView("90b01f76abc21ad7a9a464c9a2817551","OA_QXJQXJLC_W20_MobWFEditView3","f74b016e1dd6e53975b57904c677bac2","请休假","ywsp",null,-1,-1);
        registerAppView("90c1804e91a47d2f876b3f7d2ce41665","OA_CPMJSQMobListView","DF31ECB3-BF39-4205-A92E-F84292225D81","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("927f00eac6f2bae517da08510111f1ac","demoDEMOLC_W10_MobWFEditView3","1c410bfba6914a6ba8328ccde294eeae","演示","ywsp",null,-1,-1);
        registerAppView("9595dfa30ba5b26f1a32ea95c0c7793b","OA_SBWXMobWFActionView","5A404BE7-4D15-44A8-B254-DB79932D1B4C","设备维修","ywsp","POPUPMODAL",-1,-1);
        registerAppView("964ea43ebbcb48c9338ed6d88ffae001","OA_YYSSQCKMobListView","DCF080F7-0C4C-4335-9947-998B1C910D0C","饮用水申请查看","ywsp",null,-1,-1);
        registerAppView("96701e140cc564ede6068122d1748bdc","OA_PCSQPCSQLC_D_MobWFMDView","ba8b47a9c3c5a63ffc7000074bc15e75","派车申请","ywsp",null,-1,-1);
        registerAppView("96e4ecfe77c87e732bd2b14b8d0a7bbe","OA_NSJGHYSQNSJGHYSQ_W_MobWFMDView","a85beec9dab1b3675dd63379881b1af2","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("981f8e2d5ea100ec54defb492b611650","OA_YCSQCKMobEditView","C1D40602-B9B5-4988-8EFB-04BC2F3774B6","用餐申请查看","ywsp",null,-1,-1);
        registerAppView("9c1aa506917c493c7e373ab502e9f7e5","OA_CPMJSQCPMJSQLC_D_MobWFMDView","8e4702c78824f99f667238fab29a4731","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("9c7b689322890aadee714fe65b7d5ca1","OA_SBWXSBWXLC_W_MobWFMDView","7874871ddd6410d767c547fa9be4608d","设备维修","ywsp",null,-1,-1);
        registerAppView("9ccb01c52bc8f4568438665448a9ef1e","OA_NSJGHYSQCKMobListView","81582D0A-32FB-4B87-B90B-13431F298AF1","内设机构会议申请查看","ywsp",null,-1,-1);
        registerAppView("9cd5d0e3bbcb5de64902de9fb031ecb2","OA_CGSQMobWFActionView","01D592EF-A95C-4AFF-9875-E9E3B5CCD9EC","采购申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("a286388b1bf28a136c69802c15d664b8","OA_CGSQCGSQLC_W40_MobWFEditView3","d77dabf43cc15205d4a7679500719753","采购申请","ywsp",null,-1,-1);
        registerAppView("a2c0df83d7cf6cc3c62a838b1d633578","WFWorkListDSPMobMDView9","8681C625-AE4F-4A6A-9EF0-DF42B3AE568C","待审批","ywsp",null,-1,-1);
        registerAppView("a369b64ab3ceaed953a1de5eb594796a","OA_QXJCKMobListView","6B86ABF4-5DC3-4860-8965-54D514F5D283","请休假","ywsp",null,-1,-1);
        registerAppView("a3ed27efcba93500fd270f868a3a4f43","OA_GZRZRZTJLC_W10_MobWFEditView3","28f8acc44611aeed5912358948b96d58","工作日志","ywsp",null,-1,-1);
        registerAppView("a41aaa5dcab1cff5a045806d69542140","OA_YBHYSQYBHYSQ_W_MobWFMDView","27c6e3b9607121fea372f50956668ae0","院办会议申请","ywsp",null,-1,-1);
        registerAppView("a45eba8c5e0d22451f37f37c8ab2a1b9","OA_BGYPSQCKMobEditView","6F8BD345-6C2D-4596-BDCE-3A460CADFA80","办公用品申请","ywsp",null,-1,-1);
        registerAppView("a68a1355275c603d40ec3080e9f062ff","OA_CCSQCCSQLC_W20_MobWFEditView3","36f337d72b370d025628a4388a451d26","出差申请","ywsp",null,-1,-1);
        registerAppView("a8f55801d1be9bcdaadfdaab31a6c799","OA_SBWXMobListView","5C2A1E40-E188-4934-894E-DEF55DFDE60B","设备维修","ywsp",null,-1,-1);
        registerAppView("a9310da6b5bab15f831be0bd66ea6171","OA_YBHYSQMobWFStartView","A6A7EAA8-1C15-4979-AD7F-05CA8EB91B85","院办会议申请","ywsp",null,-1,-1);
        registerAppView("aa46d0a2df9b6cf006154fe195fd42c3","demoDEMOLC_D_MobWFEditView3","a5edec66d5176bd5ec5cff2f9b981bd9","演示","ywsp",null,-1,-1);
        registerAppView("aa7e448934eae17df5581526cb57e37b","OA_STWMDGSTWMDGLC_W20_MobWFEditView3","c6e870b65b188054cff3d58b4b1b97d9","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("ac125cee10eddb38c79eca3f6c200753","OA_NSJGHYSQCKMobEditView","4E790B38-6D4C-41A4-9F8D-9E12386226F6","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("ad74c5aa6194cb52cd3a37ce76b345eb","OA_STWMDGSTWMDGLC_W10_MobWFEditView3","c9ff25df0f298916a7c5864a1c333c24","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("af0a18d20575333ef9d76cb9c7a1c51c","OA_CCSQMobWFActionView","1E4530A7-A394-48D1-B149-461A30DD03D2","出差申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("b0ccf0c16956c3db183a9dd4b09065af","OA_CPMJSQCPMJSQLC_W20_MobWFEditView3","83c1c840f223aa30a5561c5c990a02d3","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("b0d73f414fc1c9f820989035d4fe56ae","OA_GZRZCKMobEditView","6AD0EC5C-5B9E-43E1-ACC9-E29E97C7AC3B","工作日志查看","ywsp",null,-1,-1);
        registerAppView("b464acf0d9e4c7f22a316840db9afbc5","OA_QXJQXJLC_W10_MobWFEditView3","5aa9fcd407c48e1b55eccfa5fb97d177","请休假","ywsp",null,-1,-1);
        registerAppView("b487b8ca1735b35d759d10a9c8ca6b9c","OA_JPYDJPYDLC_W10_MobWFEditView3","e6023302a9e98f7572b2601d41978705","机票预订","ywsp",null,-1,-1);
        registerAppView("b6adfb28a2567e0f3beaf6c3d39e7df4","OA_YBHYSQYBHYSQ_W40_MobWFEditView3","57a11b06bfad7c1e55d28c2ff00c7c3a","院办会议申请","ywsp",null,-1,-1);
        registerAppView("b70fb4eaa971125f9b90d0a0f518f1bb","OA_STWMDGSTWMDGLC_D_MobWFEditView3","22141ad85af75d574c877af634f8331f","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("b76bfec20964aa6c83bfd3429f0a1e2b","OA_CHRYMobEditView","AF857131-3F96-4765-8A8F-68DCB1A791AB","参会人员","ywsp",null,-1,-1);
        registerAppView("b84a026acc57b84dd1002cb56c8bfdab","OA_NSJGHYSQMobEditView","BA8EC4A0-25D3-41F8-94D7-DF7070347001","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("b873d31efc4f3bdb67d04711a73e698d","OA_NSJGHYSQNSJGHYSQ_W10_MobWFEditView3","44393f605dca60970bbdb592691ec689","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("b97d3ed5d3a0b67489fafa096b44da46","OA_CHRYMobListView","6F03941E-0B67-48C3-94FE-067FC34430C7","参会人员","ywsp",null,-1,-1);
        registerAppView("ba2f7e757867456d290b998f22f2fd3b","OA_PCSQPCSQLC_D_MobWFEditView3","2a6c5828ea20bc2714d5d3ff9e6a0469","派车申请","ywsp",null,-1,-1);
        registerAppView("bc8216cddc5ed92550d9ede4ed3d8eaa","OA_PCSQPCSQLC_W20_MobWFEditView3","8eba7b319a8e467fd2c94fcd6461f027","派车申请","ywsp",null,-1,-1);
        registerAppView("bcf1684a9a651259181198ae469bef87","OA_QXJQXJLC_W30_MobWFEditView3","cb8288d33a2c178dabe035f27aa5555c","请休假","ywsp",null,-1,-1);
        registerAppView("bd00db20abf7d620c2824862ac85e18f","OA_GZRZMobWFActionView","9F3F4EC3-1CA2-428B-B0AC-4D3A0F6DAB58","工作日志","ywsp","POPUPMODAL",-1,-1);
        registerAppView("bf57f311cb8346a97485b2136832dec1","OA_CGSQCKMobEditView","BEC8C5FA-7417-4125-AC2B-1DFAA54FF2C6","采购申请查看","ywsp",null,-1,-1);
        registerAppView("bfb48ff227fdb832db431a98cea94a04","OA_SBWXSBWXLC_W20_MobWFEditView3","266640393a46f8a729fa1354cfec9c96","设备维修","ywsp",null,-1,-1);
        registerAppView("c0b0d2bae2246d21d384b1da2c40242b","OA_GZRZMySenderMobMDView9","9CA29358-8C44-48BD-8ABE-5AEFB66E98C4","我发出的","ywsp",null,-1,-1);
        registerAppView("c3056411960d74f86d3fb455542085b1","OA_YCSQYCSQLC_D_MobWFMDView","35a5e86e733f353f500b42da6107315c","用餐申请","ywsp",null,-1,-1);
        registerAppView("c379e9e9f79db5b662991649484f2abf","OA_YYSSQMobWFActionView","A8B97389-7112-4EEA-9895-AA52BD26A1C0","饮用水申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("c4297bd5c1bf093a8b074c1ce1f98b5d","OA_CCSQCCSQLC_D_MobWFMDView","bcc53022fbae688928778c1cb42728e0","出差申请","ywsp",null,-1,-1);
        registerAppView("c64a5e47a381bc56d816b32f73ae946c","OA_CLWXCLWXLC_W10_MobWFEditView3","188b7b27d03b9e1bbd767011d56cf1e1","车辆维修","ywsp",null,-1,-1);
        registerAppView("c7be1707b207071197a9c2f5b0a42019","OA_STWMDGSTWMDGLC_D_MobWFMDView","3fa66f213bef7af0a28868b87c1db9ba","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("c8ee279426cb3c4bf075c05d6e722bc4","OA_CHRYCKCHRYMobListView","87BF294D-F1A0-48FF-AD92-4E10CB81FF71","参会人员","ywsp",null,-1,-1);
        registerAppView("ce74714158eec69708f5abfc5260a9d6","OA_CLWXCLWXLC_W_MobWFMDView","fcf54c55b80e256f4f4cfcef276a809b","车辆维修","ywsp",null,-1,-1);
        registerAppView("ce7ef12c7c5e6a5f78b76a679001917e","OA_CPMJSQMobWFActionView","39B20435-3229-46C8-84C6-3E1986163A15","车牌门禁申请","ywsp","POPUPMODAL",-1,-1);
        registerAppView("cfd2395a4b73140b768c77a89c96adc4","OA_QXJCKMobEditView","DCE556F2-8A2E-473D-BEC7-D0B9F5B69EDB","请休假","ywsp",null,-1,-1);
        registerAppView("d0d07bf3c39c4106ecc328b6531b755e","OA_CGSQMobListView","78C8AE62-9954-42AB-A2D8-344FAEC70493","采购申请","ywsp",null,-1,-1);
        registerAppView("d1a042a4d653cb143360cacb9477857a","OA_NSJGHYSQNSJGHYSQ_D_MobWFEditView3","afcc4d5f32d7b21b0d9b8784c3b7137c","内设机构会议申请","ywsp",null,-1,-1);
        registerAppView("d1b9c0d0db89f724e298f62cc31dd6d9","OA_CLWXCKMobListView","29DAA7A4-9EB6-4864-B318-AA1BFF084A48","车辆维修查看","ywsp",null,-1,-1);
        registerAppView("d2055af62cfcf99d5e13e71b2e76a991","OA_BGYPSQBGYPSQLC_W10_MobWFEditView3","20c0b8100deba88ff8416de501c0b6f0","办公用品申请","ywsp",null,-1,-1);
        registerAppView("d3b0a514132918d36cc6604f99740d2a","WFStepDataMobMDView","00D65A09-9950-42E8-87FC-772AD144B6F3","工作流步骤数据移动端多数据视图","ywsp",null,-1,-1);
        registerAppView("d6b846eb433c1594aefbe6d4dca503af","OA_CGSQCGSQLC_W10_MobWFEditView3","16dec61f25eda6021bea4b2ff684a942","采购申请","ywsp",null,-1,-1);
        registerAppView("d9000a5b8eaf29d747677a40a7ab9e16","OA_GZRZRZTJLC_D_XZBMobWFEditView3","41A498AE-D7EB-4948-BED9-3EF2005E5363","写周报","ywsp",null,-1,-1);
        registerAppView("da199accdd1aa79e6bfda337da9f6c87","OA_YYSSQYYSSQ_W20_MobWFEditView3","5281d91f80be0ee9353af7df9c1d3439","饮用水申请","ywsp",null,-1,-1);
        registerAppView("dd7399f9fbb0c1750f0303e64aa1a538","OA_CGSQCGSQLC_W50_MobWFEditView3","165a92310d511664e58c2a618b8d9c08","采购申请","ywsp",null,-1,-1);
        registerAppView("de13fcd0c8bb9793e21e7a0b85577598","demoDEMOLC_D_MobWFMDView","d10a7cea3585f3cd60973953f53f845b","演示","ywsp",null,-1,-1);
        registerAppView("df4b6c210fcd821ef7328abb2e5a6d50","OA_XMJDMobEditView","6CC8D90F-1422-4DA0-AF30-445A4258B6B3","项目进度","ywsp",null,-1,-1);
        registerAppView("e352716f8f57a96d715dc70a4f482b6e","OA_QXJMobListView","177BD3B3-BCD4-4995-B07D-F9D443EBBDBF","请假","ywsp",null,-1,-1);
        registerAppView("e785335132a2f3a47df17608dcb5aa7a","OA_BGYPSQBGYPSQLC_W20_MobWFEditView3","86f9944d9cd3cca2d21cb26a7f5e1ce4","办公用品申请","ywsp",null,-1,-1);
        registerAppView("e811eb3669ada9260d1b4cb348d2d71b","OA_GZRZMyReceiveMobMDView9","B4BF7661-C14B-48A6-B168-2A9FB27A214A","我收到的","ywsp",null,-1,-1);
        registerAppView("ea070b7fcf0750964b4443e80d107bfc","OA_SBWXMobEditView","9CFCBD9C-E73E-47E5-B0E6-A8371B65F5BD","设备维修","ywsp",null,-1,-1);
        registerAppView("ec83d855212fadeecc731429e3743c25","OA_STWMDGMobEditView","3FB4716D-54AB-4DB3-BB21-124C1B0DCCE0","食堂外卖订购","ywsp",null,-1,-1);
        registerAppView("ecfa8b6170183a67686ab08817ed5ad9","OA_QXJQXJLC_W_MobWFMDView","7bf1a82a1d0425fca1488058f0809041","请休假","ywsp",null,-1,-1);
        registerAppView("ed3b0310ba15bbe2c1ab8e00db536481","OA_BGYPSQBGYPSQLC_D_MobWFMDView","62e1199990d7008d597978efcd6289b0","办公用品申请","ywsp",null,-1,-1);
        registerAppView("f4090c479bd6cfb296917a6a0fecc2ce","OA_SBWXCKMobListView","5B4B07D3-F53D-4F87-93D9-4DDE94834898","设备维修查看","ywsp",null,-1,-1);
        registerAppView("f4c2dfef9b1e036980dcb3429a82cef9","OA_JPYDMobListView","C6A2F9EF-17C7-41FD-B817-832343BA6A09","机票预订","ywsp",null,-1,-1);
        registerAppView("f4cabf1fd48c6093b47bbdc9dc48d805","OA_JPYDMobEditView","10FE8354-137C-4E9D-B098-1C7E3B81F8CB","机票预订","ywsp",null,-1,-1);
        registerAppView("f55348331217dea779cedd7688d41505","OA_XMJDMobListView","00EE36DE-078A-4DB8-B583-C57681D56FD6","项目进度","ywsp",null,-1,-1);
        registerAppView("f57606734986ddf8c50b3a79574bc8b5","OA_YCSQCKMobListView","39316102-14F2-4E0C-91AB-B23BDE4EB49B","用餐申请查看","ywsp",null,-1,-1);
        registerAppView("f59f516f97e6ffab434383a630831345","OA_PCSQCKMobEditView","60C42278-82F8-4515-B9AF-7EC3D574D8D5","派车申请","ywsp",null,-1,-1);
        registerAppView("f71e800606e4f3280bf4853b11c3a2b8","OA_CLWXMobListView","6C1C7856-FF96-40CD-9DCD-E4548037D782","车辆维修","ywsp",null,-1,-1);
        registerAppView("f946fd6642600c34df602d70f5f6301d","OA_YYSSQMobListView","9C10DFDE-2FD9-4399-B870-12A39F35F569","饮用水申请","ywsp",null,-1,-1);
        registerAppView("fad9969d075bf3d97987cec314533d06","OA_YBHYSQMobPickupListView","5EAA90C5-38E0-49CB-A66C-A4491A4734C8","院办会议申请","ywsp",null,-1,-1);
        registerAppView("fbedad69bb98a36641ccd4064f5d31b1","OA_CPMJSQCKMobListView","FD0E38E3-B3A6-4397-8BD5-CB049C75558F","车牌门禁申请","ywsp",null,-1,-1);
        registerAppView("fc1a01060cfe6b5f03450f4f4289bbc3","OA_YBHYSQYBHYMobEditView","86D53524-3B1C-4A2C-A0A8-057E07838AE5","院办会议申请","ywsp",null,-1,-1);
        registerAppView("fc6ccc14d61de4f3c92c14a8e801d1ff","OA_GZRZRZTJLC_D_XYBMobWFEditView3","1B2F2FAD-791C-4C1F-A445-9017CDFE7CDD","写月报","ywsp",null,-1,-1);
        registerAppView("fd3a4df05d2faf97a2108ac9f95e8efe","OA_YBHYSQYBHYSQ_D_MobWFEditView3","939cfb00babbcc3bfa4d5274711eee87","会议","ywsp",null,-1,-1);
        registerAppView("fe63ab06d6c400dbb3a1ff74bc663156","OA_CGSQCGSQLC_W_MobWFMDView","0be3db52dc35d5fa177a57d2680564fd","采购申请","ywsp",null,-1,-1);
    }
    /**
     * 准备应用视图[系统管理]
     * @throws Exception
     */
    protected void prepareAppViews_xtgl()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.appmodel.AppModelBase#onInstallRTDatas()
     */
    @Override
    protected void onInstallRTDatas() throws Exception {
        super.onInstallRTDatas();

        //登记所有的门户界面
        net.ibizsys.psrt.srv.common.service.PortalPageService portalPageService  = (net.ibizsys.psrt.srv.common.service.PortalPageService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.PortalPageService.class);
        net.ibizsys.psrt.srv.common.service.PVPartService pvPartService  = (net.ibizsys.psrt.srv.common.service.PVPartService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.PVPartService.class);
        //创建门户视图 mywork
        if(true) {
            net.ibizsys.psrt.srv.common.entity.PortalPage portalPage = new net.ibizsys.psrt.srv.common.entity.PortalPage();
            portalPage.setPortalPageId("30BD6B20-4E74-48D3-8CBB-E6E1D2EF5C96");
            portalPage.setPortalPageName("移动办公辅助系统");
            if(portalPageService.checkKey(portalPage)==IService.CHECKKEYSTATE_OK) {
                portalPageService.create(portalPage,false);
            } else {
                pvPartService.removeByPortalPage(portalPage);
            }
            net.ibizsys.psrt.srv.common.entity.PVPart db_appmenu = new net.ibizsys.psrt.srv.common.entity.PVPart();
            db_appmenu.setPortalPageId(portalPage.getPortalPageId());
            db_appmenu.setPortalPageName(portalPage.getPortalPageName());
            db_appmenu.setPVPartName("子菜单");
            db_appmenu.setPVPartType("APPMENU");
            db_appmenu.setCtrlId("db_appmenu");
            pvPartService.create(db_appmenu,false);
        }
        //创建门户视图 worklog
        if(true) {
            net.ibizsys.psrt.srv.common.entity.PortalPage portalPage = new net.ibizsys.psrt.srv.common.entity.PortalPage();
            portalPage.setPortalPageId("9F4F30B6-C2E0-4E1B-A8AD-259D3BDB6B0A");
            portalPage.setPortalPageName("工作日志");
            if(portalPageService.checkKey(portalPage)==IService.CHECKKEYSTATE_OK) {
                portalPageService.create(portalPage,false);
            } else {
                pvPartService.removeByPortalPage(portalPage);
            }
            net.ibizsys.psrt.srv.common.entity.PVPart db_worklog = new net.ibizsys.psrt.srv.common.entity.PVPart();
            db_worklog.setPortalPageId(portalPage.getPortalPageId());
            db_worklog.setPortalPageName(portalPage.getPortalPageName());
            db_worklog.setPVPartName("子菜单");
            db_worklog.setPVPartType("APPMENU");
            db_worklog.setCtrlId("db_worklog");
            pvPartService.create(db_worklog,false);
        }
        //创建门户视图 sp
        if(true) {
            net.ibizsys.psrt.srv.common.entity.PortalPage portalPage = new net.ibizsys.psrt.srv.common.entity.PortalPage();
            portalPage.setPortalPageId("C50A2E7E-9E7D-4894-B356-C21EAE081EB5");
            portalPage.setPortalPageName("审批");
            if(portalPageService.checkKey(portalPage)==IService.CHECKKEYSTATE_OK) {
                portalPageService.create(portalPage,false);
            } else {
                pvPartService.removeByPortalPage(portalPage);
            }
            net.ibizsys.psrt.srv.common.entity.PVPart db_sphead = new net.ibizsys.psrt.srv.common.entity.PVPart();
            db_sphead.setPortalPageId(portalPage.getPortalPageId());
            db_sphead.setPortalPageName(portalPage.getPortalPageName());
            db_sphead.setPVPartName("子菜单");
            db_sphead.setPVPartType("APPMENU");
            db_sphead.setCtrlId("db_sphead");
            pvPartService.create(db_sphead,false);
            net.ibizsys.psrt.srv.common.entity.PVPart db_sp = new net.ibizsys.psrt.srv.common.entity.PVPart();
            db_sp.setPortalPageId(portalPage.getPortalPageId());
            db_sp.setPortalPageName(portalPage.getPortalPageName());
            db_sp.setPVPartName("子菜单");
            db_sp.setPVPartType("APPMENU");
            db_sp.setCtrlId("db_sp");
            pvPartService.create(db_sp,false);
        }
    }
}