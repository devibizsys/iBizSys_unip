/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv;

import javax.annotation.PostConstruct;

import net.ibizsys.paas.core.DER;
import net.ibizsys.paas.core.DERs;
import net.ibizsys.paas.ctrlhandler.ICounterHandler;
import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.ActionSessionManager;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.view.ViewMsgGroupModel;
import net.ibizsys.paas.view.StaticViewMsgModel;
import net.ibizsys.paas.view.DEDataSetViewMsgModel;
import net.ibizsys.paas.demodel.DEFInputTipSetModel;
import net.ibizsys.paas.cache.DEUniStateModel;
import net.ibizsys.paas.dts.DTSQueueModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@DERs({
    @DER(id="005C8C79-8C7E-4A68-A7C3-1E8E0D09FCC4",name="DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="3860c42c755f4097c4dfe7d806b185bc" ,majordename="WFUSER",minordename="WFSTEPACTOR"   ,masterrs=0,pickupdefname="ORIGINALWFUSERID")
    ,@DER(id="009216e13b6229bf1af5bb2063006b3f",name="DER1N_USERROLEDATAS_USERROLE_USERROLEID",type="DER1N",majordeid="1e40618663977c439800bf56d8ac4390",minordeid="b2af03b3659b89cfbfc6f8932ff1b61f" ,majordename="USERROLE",minordename="USERROLEDATAS"   ,masterrs=7,pickupdefname="USERROLEID")
    ,@DER(id="033908d98baf605c5f0136b12140a381",name="DER1N_WXMESSAGE_WXENTAPP_WXENTAPPID",type="DER1N",majordeid="aeb4861b6d65eff3ef2098ddd7a0d4f5",minordeid="657d40a805a0f204934829160a198bb7" ,majordename="WXENTAPP",minordename="WXMESSAGE"   ,masterrs=0,pickupdefname="WXENTAPPID")
    ,@DER(id="039739dbaf58acdf0e2282f988acc319",name="DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="a29184750c477cf3910fc2179179dccc" ,majordename="ORGSECTOR",minordename="ORGSECUSER"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="0546BC6D-55EF-4035-A387-9ADDC5BAE305",name="DER1N_PPMODEL_PVPART_L3PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="L3PVPARTID")
    ,@DER(id="062f9bbb6348d5a732fc7152835525d8",name="DER1N_WFWFVERSION_WFWORKFLOW_WFWFID",type="DER1N",majordeid="0166e9c016bf57201ba996cba3a67a45",minordeid="f0abca40127ddf436270635ba0e3c135" ,majordename="WFWORKFLOW",minordename="WFWFVERSION"   ,masterrs=0,pickupdefname="WFWFID")
    ,@DER(id="0780B21E-BFC7-44A1-934D-21FF0F7834A5",name="DER1N_WFWORKFLOW_MSGTEMPLATE_REMINDMSGTEMPLID",type="DER1N",majordeid="e2c5b96d6cb0389900da130bc4545add",minordeid="0166e9c016bf57201ba996cba3a67a45" ,majordename="MSGTEMPLATE",minordename="WFWORKFLOW"   ,masterrs=0,pickupdefname="REMINDMSGTEMPLID")
    ,@DER(id="0c3183f54dde288ca2faaa5a2a72d5e9",name="DER1N_WXENTAPP_WXACCOUNT_WXACCOUNTID",type="DER1N",majordeid="a807f4b43d86fbcad55c58e4621a8c80",minordeid="aeb4861b6d65eff3ef2098ddd7a0d4f5" ,majordename="WXACCOUNT",minordename="WXENTAPP"   ,masterrs=0,pickupdefname="WXACCOUNTID")
    ,@DER(id="0e24814e3d1572e3f06d4f36c7c5de9f",name="DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="0211d06b901d7948d2394149b7d0d96e" ,majordename="WFINSTANCE",minordename="WFINSTANCE"   ,masterrs=0,pickupdefname="PWFINSTANCEID")
    ,@DER(id="0EC324D9-1374-4F1B-9A60-CDA7282521D1",name="DER1N_OA_CGSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="d5b99fe05938f9adcfc252174e25526e" ,majordename="ORGUSER",minordename="OA_CGSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="102d9f722bdf57754c150d249c253fe2",name="DER1N_TSSDTASKPOLICY_TSSDTASK_TSSDTASKID",type="DER1N",majordeid="f8d12641ce30b874fa6c58f749b0bb73",minordeid="7fbddaf527849efd537411955e65800d" ,majordename="TSSDTASK",minordename="TSSDTASKPOLICY"   ,masterrs=5,pickupdefname="TSSDTASKID")
    ,@DER(id="112ac206b9d83aa2e07750365aad59cb",name="DER1N_LOGINLOG_LOGINACCOUNT_LOGINACCOUNTID",type="DER1N",majordeid="5ae7d9610693e638cd1064cf7c9126f8",minordeid="7628b30c66aaeab68c9aec1aed3f7e21" ,majordename="LOGINACCOUNT",minordename="LOGINLOG"   ,masterrs=0,pickupdefname="LOGINACCOUNTID")
    ,@DER(id="11a7fc0706213efb7c5b035a8f044d14",name="DER1N_QUERYMODEL_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="ee650aec5d0df3c9880100dc57441146" ,majordename="DATAENTITY",minordename="QUERYMODEL"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="14815ab047b405f1703f66aa10b011f0",name="DER1N_USERROLEDATAACTION_USERROLEDATA_USERROLEDATAID",type="DER1N",majordeid="c4125399a698dc5f8acca6dc8b38b353",minordeid="0cc63f54de2a15b9a7db47ff805af49a" ,majordename="USERROLEDATA",minordename="USERROLEDATAACTION"   ,masterrs=1,pickupdefname="USERROLEDATAID")
    ,@DER(id="1656e926f11b26fc5332306b52592366",name="DER1N_CODEITEM_CODEITEM_PCODEITEMID",type="DER1N",majordeid="60a039b41c39edc7ff965f1c0958232d",minordeid="60a039b41c39edc7ff965f1c0958232d" ,majordename="CODEITEM",minordename="CODEITEM"   ,masterrs=0,pickupdefname="PCODEITEMID")
    ,@DER(id="168133AE-E7F2-4ECA-AEE7-6024461A186F",name="DER1N_PPMODEL_PVPART_R1PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="R1PVPARTID")
    ,@DER(id="1a468bb598fd7359388e092714af54a1",name="DER1N_USERROLEDEFIELDS_USERROLEDEFIELD_USERROLEDEFIELDID",type="DER1N",majordeid="10d6c2ea8dda8754dcde1bceab9704c5",minordeid="c95a8972b0f72a140d65e057a002144a" ,majordename="USERROLEDEFIELD",minordename="USERROLEDEFIELDS"   ,masterrs=3,pickupdefname="USERROLEDEFIELDID")
    ,@DER(id="1bee3d42cc35ae68e2c216fd3450ace8",name="DER1N_DATASYNCOUT_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="c8381accf6c7621d57757a4955ddb504" ,majordename="DATAENTITY",minordename="DATASYNCOUT"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="1e2d9fdba388047e02ad8b2e4cb8ea39",name="DER1N_DATASYNCIN_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="3621f160a6392fc07fea086d691daa0d" ,majordename="DATAENTITY",minordename="DATASYNCIN"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="1FA00E9F-A266-433E-8C95-9AA615F10D35",name="DER1N_PPMODEL_PVPART_C1PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="C1PVPARTID")
    ,@DER(id="2112baeba2c7f01d9862c28344770bb3",name="DER1N_WFREMINDER_WFSTEPACTOR_WFSTEPACTORID",type="DER1N",majordeid="3860c42c755f4097c4dfe7d806b185bc",minordeid="352ff0280b4d127a400f4262d6ebfded" ,majordename="WFSTEPACTOR",minordename="WFREMINDER"   ,masterrs=0,pickupdefname="WFSTEPACTORID")
    ,@DER(id="21D34BAC-6107-44E3-9E4B-CA1319A93929",name="DER1N_OA_CGSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="d5b99fe05938f9adcfc252174e25526e" ,majordename="ORGSECTOR",minordename="OA_CGSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="231D5397-FBC8-4317-8EA6-94DE8BA50786",name="DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="2f02aaa9f6e6edffb9ba8f29a67a8b43" ,majordename="ORGUSER",minordename="OA_BGYPSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="239b3eb687da5f9fc4c32559bb8b12c9",name="DERINDEX_WFSYSTEMUSER_WFACTOR",type="DERINDEX",majordeid="a532b2dae4eeecca638c9a8e1b7e3fa7",minordeid="3d6fd9746bb1acf4b6af87da05f6a646" ,majordename="WFACTOR",minordename="WFSYSTEMUSER"   ,indexvalue="SYSTEMUSER")
    ,@DER(id="2490b25836227a105fd744484250651d",name="DER1N_TSSDTASK_TSSDENGINE_TSSDENGINEID",type="DER1N",majordeid="e4da63c72c04866163e5a74ca984d13f",minordeid="f8d12641ce30b874fa6c58f749b0bb73" ,majordename="TSSDENGINE",minordename="TSSDTASK"   ,masterrs=0,pickupdefname="TSSDENGINEID")
    ,@DER(id="2768f18f1b00ae87fd75c3a5f275cb02",name="DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MINORMSGACCOUNTID",type="DER1N",majordeid="7ce656616f83e08ed4aeba648bb0a30b",minordeid="b0a62e77dcb2ca3226353cea1c370b79" ,majordename="MSGACCOUNT",minordename="MSGACCOUNTDETAIL"   ,masterrs=0,pickupdefname="MINORMSGACCOUNTID")
    ,@DER(id="2c440711be83754e5250c0394b03dbb9",name="DER1N_DATAAUDITDETAIL_DATAAUDIT_DATAAUDITID",type="DER1N",majordeid="326125ce130f4bec558c9778daef045c",minordeid="7d9fefe4909e0cfffcb467129475b02d" ,majordename="DATAAUDIT",minordename="DATAAUDITDETAIL"   ,masterrs=0,pickupdefname="DATAAUDITID")
    ,@DER(id="2e9be8bfb53a6e12b1fe91a6d96081b1",name="DER1N_WXMEDIA_WXENTAPP_WXENTAPPID",type="DER1N",majordeid="aeb4861b6d65eff3ef2098ddd7a0d4f5",minordeid="6e265a32be682141a452a8832bc78530" ,majordename="WXENTAPP",minordename="WXMEDIA"   ,masterrs=0,pickupdefname="WXENTAPPID")
    ,@DER(id="2F1FAE9C-4ADA-4161-9EAD-F4B4AE61623C",name="DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID",type="DER1N",majordeid="c0433bdd5aa541e585e2b3b0e59951da",minordeid="8ca8432f94aa739a7224de9e5dd0eb34" ,majordename="OA_YBHYSQ",minordename="OA_CHRY"   ,masterrs=0,pickupdefname="YBHYSQID")
    ,@DER(id="3072ea9cfb909379f3b4fb234d646e45",name="DER1N_WFSTEPINST_WFINSTANCE_WFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="707f76a538be385bf4bf65a2b1125003" ,majordename="WFINSTANCE",minordename="WFSTEPINST"   ,masterrs=0,pickupdefname="WFINSTANCEID")
    ,@DER(id="319ae648b35fee410962855bf6d8332b",name="DER1N_TSSDTASKPOLICY_TSSDPOLICY_TSSDPOLICYID",type="DER1N",majordeid="0af0cc46519139106341b4cbfe9b89e7",minordeid="7fbddaf527849efd537411955e65800d" ,majordename="TSSDPOLICY",minordename="TSSDTASKPOLICY"   ,masterrs=0,pickupdefname="TSSDPOLICYID")
    ,@DER(id="320BB681-03BC-4218-87F8-E425B288AE97",name="DER1N_WFINSTANCE_ORG_ORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="0211d06b901d7948d2394149b7d0d96e" ,majordename="ORG",minordename="WFINSTANCE"   ,masterrs=0,pickupdefname="ORGID")
    ,@DER(id="3394c2a890c8f95f5864a8656ec0423a",name="DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID",type="DER1N",majordeid="e64a576e41250c73ac1f51c15d6631e2",minordeid="0b60b3e6ed35cc656ceecb6fac698e6e" ,majordename="WFUSERGROUP",minordename="WFUSERGROUPDETAIL"   ,masterrs=3,pickupdefname="WFUSERGROUPID")
    ,@DER(id="33f0a71e7c35aa4cd878d0c74f49c934",name="DER1N_PVPART_PORTALPAGE_PORTALPAGEID",type="DER1N",majordeid="f63040021720d1401ec2014d30b02bb6",minordeid="d1ce1f760d77192f620b4f6b9d7769f8" ,majordename="PORTALPAGE",minordename="PVPART"   ,masterrs=1,pickupdefname="PORTALPAGEID")
    ,@DER(id="376e40d56e10ff46457f47a8dd066db0",name="DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="0b60b3e6ed35cc656ceecb6fac698e6e" ,majordename="WFUSER",minordename="WFUSERGROUPDETAIL"   ,masterrs=3,pickupdefname="WFUSERID")
    ,@DER(id="3C066410-EDAD-4D63-AE4F-9629F2A66ECE",name="DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="4ab8e29eef72eb9ce66e677cef7051f9" ,majordename="ORGUSER",minordename="OA_NSJGHYSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="3cae02ebc5bd30e35ddae8d16a3cd0c2",name="DER1N_DEDATACHG2_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="2be4c985b8c11e06783904ce4e9d8b90" ,majordename="DATAENTITY",minordename="DEDATACHG2"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="3d51e9b7863df17d47d50c73a21a1413",name="DER1N_WXORGSECTOR_WXACCOUNT_WXACCOUNTID",type="DER1N",majordeid="a807f4b43d86fbcad55c58e4621a8c80",minordeid="2b5ee3ad72f76d2cb7d12f8c5f31b817" ,majordename="WXACCOUNT",minordename="WXORGSECTOR"   ,masterrs=0,pickupdefname="WXACCOUNTID")
    ,@DER(id="3E56EA9E-DD17-4735-B5E4-DCFC52DCD656",name="DER1N_OA_CPMJSQ_OA_CL_OA_CLID",type="DER1N",majordeid="3d6b755c3692debb8fd539de77b21099",minordeid="04e19d4de092a71460a31ae1e90ba06f" ,majordename="OA_CL",minordename="OA_CPMJSQ"   ,masterrs=0,pickupdefname="OA_CLID")
    ,@DER(id="3fabb41f1c288768eb38179ce4375b1c",name="DER1N_USERROLERES_USERROLE_USERROLEID",type="DER1N",majordeid="1e40618663977c439800bf56d8ac4390",minordeid="ee84bfb6e336a62bdcd671895549aebe" ,majordename="USERROLE",minordename="USERROLERES"   ,masterrs=7,pickupdefname="USERROLEID")
    ,@DER(id="3fb9f4803139d36c71baa9b5d1fc673f",name="DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID",type="DER1N",majordeid="576dd33b28a3ee34ba68561c68aa93b3",minordeid="a29184750c477cf3910fc2179179dccc" ,majordename="ORGSECUSERTYPE",minordename="ORGSECUSER"   ,masterrs=0,pickupdefname="ORGSECUSERTYPEID")
    ,@DER(id="403d507e89bbf1c6ec3c33e4bed9df17",name="DERINHERIT_USER_USEROBJECT",type="DERINHERIT",majordeid="318a3649ecafa3b934925a0231207d09",minordeid="f4552a6291c79e3934263b31b83aec33" ,majordename="USEROBJECT",minordename="USER"   ,indexvalue="USER")
    ,@DER(id="418AF732-99EB-4853-87E7-2F1D98022A03",name="DER1N_USERROLEDATA_ORG_DSTORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="c4125399a698dc5f8acca6dc8b38b353" ,majordename="ORG",minordename="USERROLEDATA"   ,masterrs=0,pickupdefname="DSTORGID")
    ,@DER(id="44B29146-69C1-4ADF-841D-287AD281BB1B",name="DER1N_PPMODEL_PVPART_L4PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="L4PVPARTID")
    ,@DER(id="453A27BB-27AA-4CC8-B30E-BA9B6CB76D22",name="DER1N_OA_CLWX_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="a2ff33334ca80258b31ea5623af023c7" ,majordename="ORGUSER",minordename="OA_CLWX"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="4572de06ad701dd628e9960bc055113e",name="DER1N_ORG_ORG_PORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="e3e158d75b7bc6f589686b6e1beb966c" ,majordename="ORG",minordename="ORG"   ,masterrs=0,pickupdefname="PORGID")
    ,@DER(id="45ea033c1c140b803db8112b9b345def",name="DER1N_USERDICTITEM_USERDICT_USERDICTID",type="DER1N",majordeid="de0f12cf67b20fb12eb5454093998c74",minordeid="4d49318ec5a12e0a9e36d79e45c641f2" ,majordename="USERDICT",minordename="USERDICTITEM"   ,masterrs=5,pickupdefname="USERDICTID")
    ,@DER(id="47F6B74B-8FB5-4B3D-8A9B-9687675C119B",name="DER1N_OA_CCSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="01c34100c1e11dc5b27d6ef38493e9f4" ,majordename="ORGUSER",minordename="OA_CCSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="48824f5e6e0527d348c27233c8541df7",name="DER1N_WFUSERCANDIDATE_WFUSER_WFMAJORUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="9f2a5bbda357d70344cb5debd7d05c71" ,majordename="WFUSER",minordename="WFUSERCANDIDATE"   ,masterrs=0,pickupdefname="WFMAJORUSERID")
    ,@DER(id="48BF957B-A1B2-45B0-AB97-50600547D3B3",name="DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="4ab8e29eef72eb9ce66e677cef7051f9" ,majordename="ORGSECTOR",minordename="OA_NSJGHYSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="4985d3434f612c5d23ae9fa4b434e3eb",name="DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="63061bfdafbbd213fc0ce66d3f26419e" ,majordename="ORGSECTOR",minordename="ORGSECTOR"   ,masterrs=0,pickupdefname="PORGSECTORID")
    ,@DER(id="4a1aa49749e2057269bba6a500bd0ab7",name="DER1N_WXACCESSTOKEN_WXACCOUNT_WXACCOUNTID",type="DER1N",majordeid="a807f4b43d86fbcad55c58e4621a8c80",minordeid="7c0817a9156329b7eed4a878988f31cc" ,majordename="WXACCOUNT",minordename="WXACCESSTOKEN"   ,masterrs=0,pickupdefname="WXACCOUNTID")
    ,@DER(id="4aa536c534ffdc4cb313289b449291da",name="DER1N_WXMEDIA_WXACCOUNT_WXACCOUNTID",type="DER1N",majordeid="a807f4b43d86fbcad55c58e4621a8c80",minordeid="6e265a32be682141a452a8832bc78530" ,majordename="WXACCOUNT",minordename="WXMEDIA"   ,masterrs=0,pickupdefname="WXACCOUNTID")
    ,@DER(id="4ac954e7df5461621e1996c284eeae39",name="DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="63061bfdafbbd213fc0ce66d3f26419e" ,majordename="ORGSECTOR",minordename="ORGSECTOR"   ,masterrs=0,pickupdefname="REPORGSECTORID")
    ,@DER(id="4e27fa512548502bb53180923b46257e",name="DER1N_WFASSISTWORK_WFSTEPACTOR_WFSTEPACTORID",type="DER1N",majordeid="3860c42c755f4097c4dfe7d806b185bc",minordeid="80bc47afe28e23ebfb7aea12fdbc1acd" ,majordename="WFSTEPACTOR",minordename="WFASSISTWORK"   ,masterrs=0,pickupdefname="WFSTEPACTORID")
    ,@DER(id="5108D5E7-39E5-4975-9D07-131C33EA8602",name="DER1N_OA_ZSK_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="89d40906b952c934951c7674a199b93c" ,majordename="ORGSECTOR",minordename="OA_ZSK"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="526F6A2A-E501-4A5B-8177-6AB1EF3B3430",name="DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="04e19d4de092a71460a31ae1e90ba06f" ,majordename="ORGSECTOR",minordename="OA_CPMJSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="58C6ECF4-00A4-4107-84A1-6F2CC8CE0775",name="DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="2f02aaa9f6e6edffb9ba8f29a67a8b43" ,majordename="ORGSECTOR",minordename="OA_BGYPSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="5BD8C8E5-DC3D-4335-B7F0-F618B3FF5E12",name="DER1N_OA_GZRZ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="07ddd1ccad9ad74b66da4fac840f8fad" ,majordename="ORGUSER",minordename="OA_GZRZ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="5E8D63E1-A30B-4C4B-8622-B61B4AB31466",name="DER1N_OA_YCSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="4494d39d58cba00b8eb277e80e350dad" ,majordename="ORGUSER",minordename="OA_YCSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="5EB0324F-99D3-4402-8BD3-7C83BBBD1815",name="DER1N_OA_PCSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="644b022eb662b345d3c2578f43eb4c65" ,majordename="ORGSECTOR",minordename="OA_PCSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="5f482026eec8d0778d155d7945fe9e3e",name="DER1N_WFACTION_WFWORKFLOW_WFWORKFLOWID",type="DER1N",majordeid="0166e9c016bf57201ba996cba3a67a45",minordeid="50811730d38a8bd964a31a05331bc214" ,majordename="WFWORKFLOW",minordename="WFACTION"   ,masterrs=0,pickupdefname="WFWORKFLOWID")
    ,@DER(id="5f68ca9cf3fef51ccc62327d94d904d6",name="DER1N_WFASSISTWORK_WFINSTANCE_WFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="80bc47afe28e23ebfb7aea12fdbc1acd" ,majordename="WFINSTANCE",minordename="WFASSISTWORK"   ,masterrs=0,pickupdefname="WFINSTANCEID")
    ,@DER(id="5f80942fa364725bebae0ba7029344f7",name="DER1N_WFSTEPDATA_WFSTEP_WFSTEPID",type="DER1N",majordeid="aa16d05a90245cec51dc8a2fb7f63fdb",minordeid="095ff4eab83529a1b8f093180a7ef3fa" ,majordename="WFSTEP",minordename="WFSTEPDATA"   ,masterrs=0,pickupdefname="WFSTEPID")
    ,@DER(id="616cb82677f494e69eebd92deec244f9",name="DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="095ff4eab83529a1b8f093180a7ef3fa" ,majordename="WFINSTANCE",minordename="WFSTEPDATA"   ,masterrs=0,pickupdefname="WFINSTANCEID")
    ,@DER(id="6245CA0A-5D44-4C18-99EF-2831C221858C",name="DER1N_PPMODEL_PVPART_R4PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="R4PVPARTID")
    ,@DER(id="62982D23-52D6-46B4-86A3-A35358D31E3D",name="DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="095ff4eab83529a1b8f093180a7ef3fa" ,majordename="WFUSER",minordename="WFSTEPDATA"   ,masterrs=0,pickupdefname="ORIGINALWFUSERID")
    ,@DER(id="632e7bf4b3451ef4f33e536cb11e58bc",name="DER1N_USERROLEDATA_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="c4125399a698dc5f8acca6dc8b38b353" ,majordename="DATAENTITY",minordename="USERROLEDATA"   ,masterrs=1,pickupdefname="DEID")
    ,@DER(id="659005CA-5B02-4A76-9127-B2AEB73BFB69",name="DER1N_OA_PCSQ_OA_CL_OA_CLID",type="DER1N",majordeid="3d6b755c3692debb8fd539de77b21099",minordeid="644b022eb662b345d3c2578f43eb4c65" ,majordename="OA_CL",minordename="OA_PCSQ"   ,masterrs=0,pickupdefname="OA_CLID")
    ,@DER(id="698edb9b7d3933dffd677d0af5da9d6c",name="DER1N_ORGSECUSER_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="a29184750c477cf3910fc2179179dccc" ,majordename="ORGUSER",minordename="ORGSECUSER"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="69c0793b95a21868e494577c5fc3cd5c",name="DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="c0a02fe821e07837af3333a49fb08b30" ,majordename="WFUSER",minordename="WFUSERASSIST"   ,masterrs=0,pickupdefname="WFMAJORUSERID")
    ,@DER(id="6baea83229dbeddb3df2b5fc71adcb5b",name="DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MAJORMSGACCOUNTID",type="DER1N",majordeid="7ce656616f83e08ed4aeba648bb0a30b",minordeid="b0a62e77dcb2ca3226353cea1c370b79" ,majordename="MSGACCOUNT",minordename="MSGACCOUNTDETAIL"   ,masterrs=7,pickupdefname="MAJORMSGACCOUNTID")
    ,@DER(id="707B613E-FBFC-4425-8CD9-2398005656F9",name="DER1N_OA_RZRY_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="eb8135d3edcb38f493ed0240e9b59f5f" ,majordename="ORGUSER",minordename="OA_RZRY"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="748c7e4b9050643eca7dafc43e9ed0fd",name="DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="c0a02fe821e07837af3333a49fb08b30" ,majordename="WFUSER",minordename="WFUSERASSIST"   ,masterrs=0,pickupdefname="WFMINORUSERID")
    ,@DER(id="756f259ec2f765f2556894f2575d8284",name="DER1N_WFASSISTWORK_WFWORKFLOW_WFWORKFLOWID",type="DER1N",majordeid="0166e9c016bf57201ba996cba3a67a45",minordeid="80bc47afe28e23ebfb7aea12fdbc1acd" ,majordename="WFWORKFLOW",minordename="WFASSISTWORK"   ,masterrs=0,pickupdefname="WFWORKFLOWID")
    ,@DER(id="75e6cc0f9a99dfa020b0520a0f76f28d",name="DER1N_WFUCPOLICY_WFUSER_MAJORWFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="fa6ff2a161c8371f494e170dde6ddb53" ,majordename="WFUSER",minordename="WFUCPOLICY"   ,masterrs=5,pickupdefname="MAJORWFUSERID")
    ,@DER(id="77D64820-2DC9-4828-87F7-2B3D20F78C2D",name="DER1N_PPMODEL_PVPART_L1PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="L1PVPARTID")
    ,@DER(id="7855e1ce00f0ec5b85f9912bd786a59d",name="DER1N_USERROLERES_UNIRES_UNIRESID",type="DER1N",majordeid="88d390ffbdb76f146f608c669729d81d",minordeid="ee84bfb6e336a62bdcd671895549aebe" ,majordename="UNIRES",minordename="USERROLERES"   ,masterrs=3,pickupdefname="UNIRESID")
    ,@DER(id="79295B9C-254B-4B89-B976-A1436D04136A",name="DER1N_OA_CHRY_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="8ca8432f94aa739a7224de9e5dd0eb34" ,majordename="ORGUSER",minordename="OA_CHRY"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="7E0B9F48-6A56-4878-A106-9ECC0D491F55",name="DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="a2ff33334ca80258b31ea5623af023c7" ,majordename="ORGSECTOR",minordename="OA_CLWX"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="7e6e292c4bc8b87e33c746ce352b90f0",name="DER1N_TSSDTASKLOG_TSSDTASK_TSSDTASKID",type="DER1N",majordeid="f8d12641ce30b874fa6c58f749b0bb73",minordeid="5d9604bc9220d47f935650303d154680" ,majordename="TSSDTASK",minordename="TSSDTASKLOG"   ,masterrs=0,pickupdefname="TSSDTASKID")
    ,@DER(id="7ef88aac275d3d363f5981c8f53b9988",name="DER1N_ORGUSER_ORG_ORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="1f9576cdcc6a949230c7669182c73648" ,majordename="ORG",minordename="ORGUSER"   ,masterrs=0,pickupdefname="ORGID")
    ,@DER(id="802abef14e1abf4be1f76c09383c19de",name="DER1N_WFWORKLIST_WFINSTANCE_WFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="c93ef4408352303441d2f73e0e4990a2" ,majordename="WFINSTANCE",minordename="WFWORKLIST"   ,masterrs=0,pickupdefname="WFINSTANCEID")
    ,@DER(id="8073CCE8-085F-438D-A69F-7B519E115ABF",name="DER1N_USERROLEDATA_ORGSECTOR_DSTORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="c4125399a698dc5f8acca6dc8b38b353" ,majordename="ORGSECTOR",minordename="USERROLEDATA"   ,masterrs=0,pickupdefname="DSTORGSECTORID")
    ,@DER(id="8097c1878cf34b7d5a2618d26684dcb5",name="DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID",type="DER1N",majordeid="0166e9c016bf57201ba996cba3a67a45",minordeid="0211d06b901d7948d2394149b7d0d96e" ,majordename="WFWORKFLOW",minordename="WFINSTANCE"   ,masterrs=0,pickupdefname="WFWORKFLOWID")
    ,@DER(id="8124434e843cf1f08d5fb07d2d54e9e7",name="DER1N_TSSDGROUPDETAIL_TSSDITEM_TSSDITEMID",type="DER1N",majordeid="7923f282cb5da8b2419d53cb6fc6e9a7",minordeid="e8b6c72b7a73a98f68bf91b812d46c31" ,majordename="TSSDITEM",minordename="TSSDGROUPDETAIL"   ,masterrs=0,pickupdefname="TSSDITEMID")
    ,@DER(id="816a3c9fc6c7c768566a343f30a9e5ad",name="DER1N_USERDICTITEM_USERDICTCAT_USERDICTCATID",type="DER1N",majordeid="c41d9a5508a558b5ccc8a091c5e249b1",minordeid="4d49318ec5a12e0a9e36d79e45c641f2" ,majordename="USERDICTCAT",minordename="USERDICTITEM"   ,masterrs=0,pickupdefname="USERDICTCATID")
    ,@DER(id="822F5E16-EABC-429B-98FF-4E63DB71EB6A",name="DER1N_OA_JPYD_ORGUSER_JBRID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="48f5487b61a60a005e2867457c2a8baa" ,majordename="ORGUSER",minordename="OA_JPYD"   ,masterrs=0,pickupdefname="JBRID")
    ,@DER(id="8C452ED1-B30E-4BE3-B14F-B168CE12DCA5",name="DER1N_OA_XXRY_OA_XX_OA_XXID",type="DER1N",majordeid="a1220a3fe588cd56a7eeedd2457b387d",minordeid="569bd3058e5bf80c26c953bc5a0187c0" ,majordename="OA_XX",minordename="OA_XXRY"   ,masterrs=0,pickupdefname="OA_XXID")
    ,@DER(id="8d9808ac3dd5b5d89db44f2a2a3da1c4",name="DER1N_WFUSERCANDIDATE_WFUSER_WFMINORUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="9f2a5bbda357d70344cb5debd7d05c71" ,majordename="WFUSER",minordename="WFUSERCANDIDATE"   ,masterrs=0,pickupdefname="WFMINORUSERID")
    ,@DER(id="8de4cf4868586b92e9e7da5466952329",name="DER1N_WFIAACTION_WFSTEP_WFSTEPID",type="DER1N",majordeid="aa16d05a90245cec51dc8a2fb7f63fdb",minordeid="e1ba3122fd9af91ae76dd18bf015669a" ,majordename="WFSTEP",minordename="WFIAACTION"   ,masterrs=0,pickupdefname="WFSTEPID")
    ,@DER(id="90A67CD5-A745-49F6-B5A0-5761278A8C49",name="DER1N_PPMODEL_PVPART_R2PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="R2PVPARTID")
    ,@DER(id="9147ed7184373dfae772ea5db9afa2ec",name="DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID",type="DER1N",majordeid="f63040021720d1401ec2014d30b02bb6",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PORTALPAGE",minordename="PPMODEL"   ,masterrs=0,pickupdefname="PORTALPAGEID")
    ,@DER(id="91DE6001-A9FC-4E3A-B104-6753BCE37246",name="DER1N_OA_STWMDG_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="9e3412d4cc2071a7028a726531005e82" ,majordename="ORGUSER",minordename="OA_STWMDG"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="94ab233ca60b50ab4e8bed7281b09fc7",name="DER1N_USERROLEDETAIL_USERROLE_USERROLEID",type="DER1N",majordeid="1e40618663977c439800bf56d8ac4390",minordeid="a6ba8b8895f3f2438f9e9ef761ccb29c" ,majordename="USERROLE",minordename="USERROLEDETAIL"   ,masterrs=7,pickupdefname="USERROLEID")
    ,@DER(id="9b73d0648c9cd83f5c4413a7503de665",name="DER1N_ORGSECTOR_ORG_ORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="63061bfdafbbd213fc0ce66d3f26419e" ,majordename="ORG",minordename="ORGSECTOR"   ,masterrs=0,pickupdefname="ORGID")
    ,@DER(id="9D20B715-58AA-49B5-8B0A-7CA40DDB07CB",name="DER1N_OA_SBWX_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="3bec83f956549a6be06d66b95e9efa03" ,majordename="ORGUSER",minordename="OA_SBWX"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="9e1bd95d49cd30bbe25f4afea9267142",name="DER1N_TSSDGROUPDETAIL_TSSDGROUP_TSSDGROUPID",type="DER1N",majordeid="f37da71b9c7217fb86634c135e6fb7e0",minordeid="e8b6c72b7a73a98f68bf91b812d46c31" ,majordename="TSSDGROUP",minordename="TSSDGROUPDETAIL"   ,masterrs=0,pickupdefname="TSSDGROUPID")
    ,@DER(id="a0a110c3f3c7328f10e027bc9cbad882",name="DER1N_WFREMINDER_WFUSER_WFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="352ff0280b4d127a400f4262d6ebfded" ,majordename="WFUSER",minordename="WFREMINDER"   ,masterrs=0,pickupdefname="WFUSERID")
    ,@DER(id="a1149c0cf281cf46f0ae70d7d1921522",name="DER1N_DATASYNCIN2_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="04c87ff6cdac6dd390613dbc44f3c51d" ,majordename="DATAENTITY",minordename="DATASYNCIN2"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="A1616093-B9F9-474B-A78B-2C9EAB13EAB2",name="DER1N_OA_NSJGHYSQ_OA_HYS_HYSID",type="DER1N",majordeid="8919f057dd97c6ac882a2d23420be1a3",minordeid="4ab8e29eef72eb9ce66e677cef7051f9" ,majordename="OA_HYS",minordename="OA_NSJGHYSQ"   ,masterrs=0,pickupdefname="HYSID")
    ,@DER(id="a318a4042da740195b6afdebe4047f25",name="DER1N_WXORGSECTOR_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="2b5ee3ad72f76d2cb7d12f8c5f31b817" ,majordename="ORGSECTOR",minordename="WXORGSECTOR"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="a33d43efdb58f6910c5cbca43cc22930",name="DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID",type="DER1N",majordeid="5eba267a2d34c0c5dc686961a48f62d1",minordeid="404bf990bacdba520e82d9603063c3dd" ,majordename="USERGROUP",minordename="USERGROUPDETAIL"   ,masterrs=3,pickupdefname="USERGROUPID")
    ,@DER(id="a55673f3c26f1de111eeb547dbb40a6e",name="DER1N_DATAENTITY_QUERYMODEL_ACQUERYMODELID",type="DER1N",majordeid="ee650aec5d0df3c9880100dc57441146",minordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2" ,majordename="QUERYMODEL",minordename="DATAENTITY"   ,masterrs=0,pickupdefname="ACQUERYMODELID")
    ,@DER(id="A764D6F8-DCD8-4670-AE22-6984474CDD1C",name="DER1N_WFWORKLIST_WFUSER_ORIGINALWFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="c93ef4408352303441d2f73e0e4990a2" ,majordename="WFUSER",minordename="WFWORKLIST"   ,masterrs=0,pickupdefname="ORIGINALWFUSERID")
    ,@DER(id="a7ca173df623eafe0993ef8c1cb7ce56",name="DER1N_DATASYNCOUT2_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="1cecb3d95febd748a2daf8e9c86a8ec5" ,majordename="DATAENTITY",minordename="DATASYNCOUT2"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="a7f689243bc823d7aea798e6c7f3b7a6",name="DERINDEX_WFDYNAMICUSER_WFACTOR",type="DERINDEX",majordeid="a532b2dae4eeecca638c9a8e1b7e3fa7",minordeid="733170434261be84089d353a6a231373" ,majordename="WFACTOR",minordename="WFDYNAMICUSER"   ,indexvalue="DYNAMICUSER")
    ,@DER(id="ab31530b21b9769706f6a2fbeeb9f9a7",name="DER1N_WFTMPSTEPACTOR_WFACTOR_WFACTORID",type="DER1N",majordeid="a532b2dae4eeecca638c9a8e1b7e3fa7",minordeid="0e976da1c2895bf2e955f90554c10b15" ,majordename="WFACTOR",minordename="WFTMPSTEPACTOR"   ,masterrs=0,pickupdefname="WFACTORID")
    ,@DER(id="ad2f6511189748f7d19fb8e45781e988",name="DER1N_WFSTEPINST_WFSTEP_WFSTEPID",type="DER1N",majordeid="aa16d05a90245cec51dc8a2fb7f63fdb",minordeid="707f76a538be385bf4bf65a2b1125003" ,majordename="WFSTEP",minordename="WFSTEPINST"   ,masterrs=0,pickupdefname="WFSTEPID")
    ,@DER(id="b1568c2ef7918c4690bffc8cc39a8327",name="DER1N_ORGSECUSER_ORG_ORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="a29184750c477cf3910fc2179179dccc" ,majordename="ORG",minordename="ORGSECUSER"   ,masterrs=0,pickupdefname="ORGID")
    ,@DER(id="b66d862165d2dc4ced13946380ee8910",name="DERINDEX_WFUSER_WFACTOR",type="DERINDEX",majordeid="a532b2dae4eeecca638c9a8e1b7e3fa7",minordeid="ef2c7b349c855e594aa4fe0cb7ad8b48" ,majordename="WFACTOR",minordename="WFUSER"   ,indexvalue="USER")
    ,@DER(id="b78b4cc48da463c059424a26efec842c",name="DER1N_CODELIST_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="85317205b415aa6af990684ca7704515" ,majordename="DATAENTITY",minordename="CODELIST"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="BA7FCAFA-2EAB-4C81-A4A2-99959E5316BA",name="DER1N_OA_JPYD_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="48f5487b61a60a005e2867457c2a8baa" ,majordename="ORGUSER",minordename="OA_JPYD"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="BA8ECEB3-7D9A-496D-B667-4FA9377EAE61",name="DER1N_PPMODEL_PVPART_C4PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="C4PVPARTID")
    ,@DER(id="bce5036d19290a1d1f71e80e076e1ad6",name="DER1N_USERROLEDATAS_USERROLEDATA_USERROLEDATAID",type="DER1N",majordeid="c4125399a698dc5f8acca6dc8b38b353",minordeid="b2af03b3659b89cfbfc6f8932ff1b61f" ,majordename="USERROLEDATA",minordename="USERROLEDATAS"   ,masterrs=7,pickupdefname="USERROLEDATAID")
    ,@DER(id="BD97F7D4-1B88-4AA9-81D3-334A1B88BCFB",name="DER1N_OA_PCSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="644b022eb662b345d3c2578f43eb4c65" ,majordename="ORGUSER",minordename="OA_PCSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="c0558f7368a6a1a9ec5fbb5c8de6a8b9",name="DERINHERIT_USERGROUP_USEROBJECT",type="DERINHERIT",majordeid="318a3649ecafa3b934925a0231207d09",minordeid="5eba267a2d34c0c5dc686961a48f62d1" ,majordename="USEROBJECT",minordename="USERGROUP"   ,indexvalue="USERGROUP")
    ,@DER(id="c11fec2d7398bbfae41f4b5d1639079d",name="DER1N_DATAENTITY_DATAENTITY_DER11DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2" ,majordename="DATAENTITY",minordename="DATAENTITY"   ,masterrs=0,pickupdefname="DER11DEID")
    ,@DER(id="c13286609770010aadf50b74b6039785",name="DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID",type="DER1N",majordeid="ee650aec5d0df3c9880100dc57441146",minordeid="a54fc7fa42e8260cab1cb33393e222b1" ,majordename="QUERYMODEL",minordename="USERROLEDATADETAIL"   ,masterrs=3,pickupdefname="QUERYMODELID")
    ,@DER(id="c5889a1d7a44fb5e162dba1377ba8dc1",name="DER1N_USERROLEDETAIL_USEROBJECT_USEROBJECTID",type="DER1N",majordeid="318a3649ecafa3b934925a0231207d09",minordeid="a6ba8b8895f3f2438f9e9ef761ccb29c" ,majordename="USEROBJECT",minordename="USERROLEDETAIL"   ,masterrs=7,pickupdefname="USEROBJECTID")
    ,@DER(id="c63d3e12576fa39727d412500b8987f4",name="DER1N_WFTMPSTEPACTOR_WFSTEP_PREVWFSTEPID",type="DER1N",majordeid="aa16d05a90245cec51dc8a2fb7f63fdb",minordeid="0e976da1c2895bf2e955f90554c10b15" ,majordename="WFSTEP",minordename="WFTMPSTEPACTOR"   ,masterrs=0,pickupdefname="PREVWFSTEPID")
    ,@DER(id="c64c576f22b1072cdecf2c043cf9106b",name="DER1N_ORGUSER_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="1f9576cdcc6a949230c7669182c73648" ,majordename="ORGSECTOR",minordename="ORGUSER"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="c66aa6aa9829065286380810811d4993",name="DER1N_WXACCOUNT_ORG_ORGID",type="DER1N",majordeid="e3e158d75b7bc6f589686b6e1beb966c",minordeid="a807f4b43d86fbcad55c58e4621a8c80" ,majordename="ORG",minordename="WXACCOUNT"   ,masterrs=0,pickupdefname="ORGID")
    ,@DER(id="CAE95D7F-816D-494D-B98A-FCBF0E478636",name="DER1N_OA_TZGGRY_OA_TZGG_OA_TZGGID",type="DER1N",majordeid="7386ce6dfae074294cbbde833b6820ed",minordeid="a1db6680ea6fd852ef1e1744bff0fec5" ,majordename="OA_TZGG",minordename="OA_TZGGRY"   ,masterrs=0,pickupdefname="OA_TZGGID")
    ,@DER(id="CD16E202-1010-4C47-BBED-77DED600D88F",name="DER1N_PPMODEL_PVPART_L2PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="L2PVPARTID")
    ,@DER(id="cdeb6924e468218750aa54ffd43fbe91",name="DER1N_WFUCPOLICY_WFUSER_MINORWFUSERID",type="DER1N",majordeid="ef2c7b349c855e594aa4fe0cb7ad8b48",minordeid="fa6ff2a161c8371f494e170dde6ddb53" ,majordename="WFUSER",minordename="WFUCPOLICY"   ,masterrs=0,pickupdefname="MINORWFUSERID")
    ,@DER(id="CF68E169-CAF0-4B3E-A0BD-5D625C248B91",name="DER1N_WFAPPSETTING_MSGTEMPLATE_REMINDMSGTEMPID",type="DER1N",majordeid="e2c5b96d6cb0389900da130bc4545add",minordeid="598b85c09bc9375e762590d2ab97552c" ,majordename="MSGTEMPLATE",minordename="WFAPPSETTING"   ,masterrs=0,pickupdefname="REMINDMSGTEMPID")
    ,@DER(id="D0547BD0-0384-40D0-B479-D71995634F7C",name="DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="c0433bdd5aa541e585e2b3b0e59951da" ,majordename="ORGUSER",minordename="OA_YBHYSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="d2216828da19ff602cfdbb816d921f48",name="DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID",type="DER1N",majordeid="318a3649ecafa3b934925a0231207d09",minordeid="404bf990bacdba520e82d9603063c3dd" ,majordename="USEROBJECT",minordename="USERGROUPDETAIL"   ,masterrs=3,pickupdefname="USEROBJECTID")
    ,@DER(id="D27A1295-4ACF-47CF-870A-B069B734548B",name="DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID",type="DER1N",majordeid="c0433bdd5aa541e585e2b3b0e59951da",minordeid="43a554dc963230bc837ff475418429b2" ,majordename="OA_YBHYSQ",minordename="OA_QXJ"   ,masterrs=0,pickupdefname="YBHYSQID")
    ,@DER(id="d4fa384409c56f68322a2f0cab46cd75",name="DER1N_ORGUSER_ORGUSERLEVEL_ORGUSERLEVELID",type="DER1N",majordeid="e6c870c62a861cfd5593212fa41d6f88",minordeid="1f9576cdcc6a949230c7669182c73648" ,majordename="ORGUSERLEVEL",minordename="ORGUSER"   ,masterrs=0,pickupdefname="ORGUSERLEVELID")
    ,@DER(id="D5A9A2D9-3E9F-4C90-AB14-2FBE9F15C3E3",name="DER1N_OA_YYSSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="c300dfcfd782397bae090b345b40d5f4" ,majordename="ORGUSER",minordename="OA_YYSSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="D6F81803-B59E-4B89-909C-506E7649D6DF",name="DER1N_OA_XXRY_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="569bd3058e5bf80c26c953bc5a0187c0" ,majordename="ORGUSER",minordename="OA_XXRY"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="D848A57B-A529-482F-AC73-977043C3FDAC",name="DER1N_PPMODEL_PVPART_C2PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="C2PVPARTID")
    ,@DER(id="da7e61a04a493ac3a5de582c1cf7ff21",name="DERINDEX_WFUSERGROUP_WFACTOR",type="DERINDEX",majordeid="a532b2dae4eeecca638c9a8e1b7e3fa7",minordeid="e64a576e41250c73ac1f51c15d6631e2" ,majordename="WFACTOR",minordename="WFUSERGROUP"   ,indexvalue="USERGROUP")
    ,@DER(id="DB1D54AF-F8A7-4E75-81C8-E4BA2C22D498",name="DER1N_OA_RZRY_OA_GZRZ_GZRZID",type="DER1N",majordeid="07ddd1ccad9ad74b66da4fac840f8fad",minordeid="eb8135d3edcb38f493ed0240e9b59f5f" ,majordename="OA_GZRZ",minordename="OA_RZRY"   ,masterrs=0,pickupdefname="GZRZID")
    ,@DER(id="DD062BB4-7123-4D7F-8985-CD3796319954",name="DER1N_OA_QXJ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="43a554dc963230bc837ff475418429b2" ,majordename="ORGUSER",minordename="OA_QXJ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="dd5f14db2aeccd0eed9324a65fac48de",name="DER1N_DEDATACHG_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="b46bdd8836d4e93bad690042e23ff374" ,majordename="DATAENTITY",minordename="DEDATACHG"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="ddc14d8f88d17c3a4c3caddf78a99357",name="DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID",type="DER1N",majordeid="0166e9c016bf57201ba996cba3a67a45",minordeid="c0a02fe821e07837af3333a49fb08b30" ,majordename="WFWORKFLOW",minordename="WFUSERASSIST"   ,masterrs=0,pickupdefname="WFWORKFLOWID")
    ,@DER(id="de59ed9eb9b555bc06e35224c3ae6c2b",name="DER1N_MSGTEMPLATE_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="e2c5b96d6cb0389900da130bc4545add" ,majordename="DATAENTITY",minordename="MSGTEMPLATE"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="df7f1d11355a8a1723875d8d43aa137a",name="DER1N_LOGINACCOUNT_USER_USERID",type="DER1N",majordeid="f4552a6291c79e3934263b31b83aec33",minordeid="5ae7d9610693e638cd1064cf7c9126f8" ,majordename="USER",minordename="LOGINACCOUNT"   ,masterrs=0,pickupdefname="USERID")
    ,@DER(id="df958687a02982a4cd68af51ad5732ef",name="DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID",type="DER1N",majordeid="aa16d05a90245cec51dc8a2fb7f63fdb",minordeid="3860c42c755f4097c4dfe7d806b185bc" ,majordename="WFSTEP",minordename="WFSTEPACTOR"   ,masterrs=0,pickupdefname="WFSTEPID")
    ,@DER(id="E35BAEC6-C520-459F-A556-DBEA7803DFFD",name="DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="04e19d4de092a71460a31ae1e90ba06f" ,majordename="ORGUSER",minordename="OA_CPMJSQ"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="e489a0c18fefe28b35f154f7c63eaa3a",name="DER1N_WXMESSAGE_WXACCOUNT_WXACCOUNTID",type="DER1N",majordeid="a807f4b43d86fbcad55c58e4621a8c80",minordeid="657d40a805a0f204934829160a198bb7" ,majordename="WXACCOUNT",minordename="WXMESSAGE"   ,masterrs=0,pickupdefname="WXACCOUNTID")
    ,@DER(id="e615bf186441877722a351ba6ece7d3f",name="DER1N_SYSADMINFUNC_SYSADMIN_SYSADMINID",type="DER1N",majordeid="089885ec20e095e248e78d49d3153815",minordeid="2e71859d8147cd788d815a3371f9ebd6" ,majordename="SYSADMIN",minordename="SYSADMINFUNC"   ,masterrs=0,pickupdefname="SYSADMINID")
    ,@DER(id="ea0eaa76b1fe9fef40baea2da6ec5716",name="DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID",type="DER1N",majordeid="1e40618663977c439800bf56d8ac4390",minordeid="c95a8972b0f72a140d65e057a002144a" ,majordename="USERROLE",minordename="USERROLEDEFIELDS"   ,masterrs=3,pickupdefname="USERROLEID")
    ,@DER(id="EACF508B-DD92-4E73-8CDF-DAC30CC14BAE",name="DER1N_OA_ZSK_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="89d40906b952c934951c7674a199b93c" ,majordename="ORGUSER",minordename="OA_ZSK"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="EADA7CF3-3469-4254-807F-C76446B4BFB1",name="DER1N_OA_CLWX_OA_CL_OA_CLID",type="DER1N",majordeid="3d6b755c3692debb8fd539de77b21099",minordeid="a2ff33334ca80258b31ea5623af023c7" ,majordename="OA_CL",minordename="OA_CLWX"   ,masterrs=0,pickupdefname="OA_CLID")
    ,@DER(id="EAED495A-0CE6-4FCD-97FA-FCB90B332B9D",name="DER1N_OA_XX_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="a1220a3fe588cd56a7eeedd2457b387d" ,majordename="ORGUSER",minordename="OA_XX"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="eb751ef3ced5b2f39136c706a1cf8ac5",name="DER1N_USERROLEDEFIELD_DATAENTITY_DEID",type="DER1N",majordeid="0cbbb4ccda4e86a9e6f16ed5f3a171c2",minordeid="10d6c2ea8dda8754dcde1bceab9704c5" ,majordename="DATAENTITY",minordename="USERROLEDEFIELD"   ,masterrs=0,pickupdefname="DEID")
    ,@DER(id="EC147D52-4643-4B51-8DFF-FA8BA95325C2",name="DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="3bec83f956549a6be06d66b95e9efa03" ,majordename="ORGSECTOR",minordename="OA_SBWX"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="ed32886f9f70deccef8b87f2f5dafab5",name="DER1N_WFSTEP_WFINSTANCE_WFINSTANCEID",type="DER1N",majordeid="0211d06b901d7948d2394149b7d0d96e",minordeid="aa16d05a90245cec51dc8a2fb7f63fdb" ,majordename="WFINSTANCE",minordename="WFSTEP"   ,masterrs=0,pickupdefname="WFINSTANCEID")
    ,@DER(id="ED37633A-B136-4CAE-A5AC-6E6D5072763E",name="DER1N_OA_YYSSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="c300dfcfd782397bae090b345b40d5f4" ,majordename="ORGSECTOR",minordename="OA_YYSSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="eda174cf10516278ae0cf592e6ed9943",name="DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID",type="DER1N",majordeid="576dd33b28a3ee34ba68561c68aa93b3",minordeid="1f9576cdcc6a949230c7669182c73648" ,majordename="ORGSECUSERTYPE",minordename="ORGUSER"   ,masterrs=0,pickupdefname="ORGSECUSERTYPEID")
    ,@DER(id="EDC473C6-519A-4A03-A6EF-B0B4FA4F48CD",name="DER1N_OA_JPYD_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="48f5487b61a60a005e2867457c2a8baa" ,majordename="ORGSECTOR",minordename="OA_JPYD"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="EE17F81F-8627-40F3-8C72-18670B6C08CA",name="DER1N_OA_TZGG_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="7386ce6dfae074294cbbde833b6820ed" ,majordename="ORGUSER",minordename="OA_TZGG"   ,masterrs=0,pickupdefname="ORGUSERID")
    ,@DER(id="F275DBE0-D055-4EF1-A8F8-2568A3CCDFD0",name="DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID",type="DER1N",majordeid="8919f057dd97c6ac882a2d23420be1a3",minordeid="c0433bdd5aa541e585e2b3b0e59951da" ,majordename="OA_HYS",minordename="OA_YBHYSQ"   ,masterrs=0,pickupdefname="OA_HYSID")
    ,@DER(id="F28672F2-1292-47FA-8AE4-172B90EE2DC3",name="DER1N_PPMODEL_PVPART_R3PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="R3PVPARTID")
    ,@DER(id="F3D0BA4C-E48F-4001-AB1B-C9167384AC63",name="DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID",type="DER1N",majordeid="63061bfdafbbd213fc0ce66d3f26419e",minordeid="c0433bdd5aa541e585e2b3b0e59951da" ,majordename="ORGSECTOR",minordename="OA_YBHYSQ"   ,masterrs=0,pickupdefname="ORGSECTORID")
    ,@DER(id="F3FE8428-161F-4FFE-B2C9-78418B5ED714",name="DER1N_PPMODEL_PVPART_C3PVPARTID",type="DER1N",majordeid="d1ce1f760d77192f620b4f6b9d7769f8",minordeid="14ad5675b58882f0e61ba3caabcf6f5e" ,majordename="PVPART",minordename="PPMODEL"   ,masterrs=0,pickupdefname="C3PVPARTID")
    ,@DER(id="f4161eb5fbed839ac5979824062f5ec0",name="DER1N_USERROLEDATADETAIL_USERROLEDATA_USERROLEDATAID",type="DER1N",majordeid="c4125399a698dc5f8acca6dc8b38b353",minordeid="a54fc7fa42e8260cab1cb33393e222b1" ,majordename="USERROLEDATA",minordename="USERROLEDATADETAIL"   ,masterrs=7,pickupdefname="USERROLEDATAID")
    ,@DER(id="fc0a850d89848ac4bd8af35ad839c288",name="DER1N_CODEITEM_CODELIST_CODELISTID",type="DER1N",majordeid="85317205b415aa6af990684ca7704515",minordeid="60a039b41c39edc7ff965f1c0958232d" ,majordename="CODELIST",minordename="CODEITEM"   ,masterrs=0,pickupdefname="CODELISTID")
    ,@DER(id="FFB34B7D-BBC8-4042-9790-B28592A8D836",name="DER1N_OA_TZGGRY_ORGUSER_ORGUSERID",type="DER1N",majordeid="1f9576cdcc6a949230c7669182c73648",minordeid="a1db6680ea6fd852ef1e1744bff0fec5" ,majordename="ORGUSER",minordename="OA_TZGGRY"   ,masterrs=0,pickupdefname="ORGUSERID")
})
/**
 * 系统[UniP]模型对象
 */
@Component
public class UniPSampleSysModel extends net.ibizsys.paas.sysmodel.SystemModelBase  {

    private static final Log log = LogFactory.getLog(UniPSampleSysModel.class);
    /**
     * 实体关系[DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID]
     */
    public static final String DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID = "DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID";
    /**
     * 实体关系[DER1N_USERROLEDATAS_USERROLE_USERROLEID]
     */
    public static final String DER1N_USERROLEDATAS_USERROLE_USERROLEID = "DER1N_USERROLEDATAS_USERROLE_USERROLEID";
    /**
     * 实体关系[DER1N_WXMESSAGE_WXENTAPP_WXENTAPPID]
     */
    public static final String DER1N_WXMESSAGE_WXENTAPP_WXENTAPPID = "DER1N_WXMESSAGE_WXENTAPP_WXENTAPPID";
    /**
     * 实体关系[DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID = "DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_L3PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_L3PVPARTID = "DER1N_PPMODEL_PVPART_L3PVPARTID";
    /**
     * 实体关系[DER1N_WFWFVERSION_WFWORKFLOW_WFWFID]
     */
    public static final String DER1N_WFWFVERSION_WFWORKFLOW_WFWFID = "DER1N_WFWFVERSION_WFWORKFLOW_WFWFID";
    /**
     * 实体关系[DER1N_WFWORKFLOW_MSGTEMPLATE_REMINDMSGTEMPLID]
     */
    public static final String DER1N_WFWORKFLOW_MSGTEMPLATE_REMINDMSGTEMPLID = "DER1N_WFWORKFLOW_MSGTEMPLATE_REMINDMSGTEMPLID";
    /**
     * 实体关系[DER1N_WXENTAPP_WXACCOUNT_WXACCOUNTID]
     */
    public static final String DER1N_WXENTAPP_WXACCOUNT_WXACCOUNTID = "DER1N_WXENTAPP_WXACCOUNT_WXACCOUNTID";
    /**
     * 实体关系[DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID]
     */
    public static final String DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID = "DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID";
    /**
     * 实体关系[DER1N_OA_CGSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_CGSQ_ORGUSER_ORGUSERID = "DER1N_OA_CGSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_TSSDTASKPOLICY_TSSDTASK_TSSDTASKID]
     */
    public static final String DER1N_TSSDTASKPOLICY_TSSDTASK_TSSDTASKID = "DER1N_TSSDTASKPOLICY_TSSDTASK_TSSDTASKID";
    /**
     * 实体关系[DER1N_LOGINLOG_LOGINACCOUNT_LOGINACCOUNTID]
     */
    public static final String DER1N_LOGINLOG_LOGINACCOUNT_LOGINACCOUNTID = "DER1N_LOGINLOG_LOGINACCOUNT_LOGINACCOUNTID";
    /**
     * 实体关系[DER1N_QUERYMODEL_DATAENTITY_DEID]
     */
    public static final String DER1N_QUERYMODEL_DATAENTITY_DEID = "DER1N_QUERYMODEL_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_USERROLEDATAACTION_USERROLEDATA_USERROLEDATAID]
     */
    public static final String DER1N_USERROLEDATAACTION_USERROLEDATA_USERROLEDATAID = "DER1N_USERROLEDATAACTION_USERROLEDATA_USERROLEDATAID";
    /**
     * 实体关系[DER1N_CODEITEM_CODEITEM_PCODEITEMID]
     */
    public static final String DER1N_CODEITEM_CODEITEM_PCODEITEMID = "DER1N_CODEITEM_CODEITEM_PCODEITEMID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_R1PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_R1PVPARTID = "DER1N_PPMODEL_PVPART_R1PVPARTID";
    /**
     * 实体关系[DER1N_USERROLEDEFIELDS_USERROLEDEFIELD_USERROLEDEFIELDID]
     */
    public static final String DER1N_USERROLEDEFIELDS_USERROLEDEFIELD_USERROLEDEFIELDID = "DER1N_USERROLEDEFIELDS_USERROLEDEFIELD_USERROLEDEFIELDID";
    /**
     * 实体关系[DER1N_DATASYNCOUT_DATAENTITY_DEID]
     */
    public static final String DER1N_DATASYNCOUT_DATAENTITY_DEID = "DER1N_DATASYNCOUT_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_DATASYNCIN_DATAENTITY_DEID]
     */
    public static final String DER1N_DATASYNCIN_DATAENTITY_DEID = "DER1N_DATASYNCIN_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_C1PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_C1PVPARTID = "DER1N_PPMODEL_PVPART_C1PVPARTID";
    /**
     * 实体关系[DER1N_WFREMINDER_WFSTEPACTOR_WFSTEPACTORID]
     */
    public static final String DER1N_WFREMINDER_WFSTEPACTOR_WFSTEPACTORID = "DER1N_WFREMINDER_WFSTEPACTOR_WFSTEPACTORID";
    /**
     * 实体关系[DER1N_OA_CGSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_CGSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_CGSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID = "DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DERINDEX_WFSYSTEMUSER_WFACTOR]
     */
    public static final String DERINDEX_WFSYSTEMUSER_WFACTOR = "DERINDEX_WFSYSTEMUSER_WFACTOR";
    /**
     * 实体关系[DER1N_TSSDTASK_TSSDENGINE_TSSDENGINEID]
     */
    public static final String DER1N_TSSDTASK_TSSDENGINE_TSSDENGINEID = "DER1N_TSSDTASK_TSSDENGINE_TSSDENGINEID";
    /**
     * 实体关系[DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MINORMSGACCOUNTID]
     */
    public static final String DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MINORMSGACCOUNTID = "DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MINORMSGACCOUNTID";
    /**
     * 实体关系[DER1N_DATAAUDITDETAIL_DATAAUDIT_DATAAUDITID]
     */
    public static final String DER1N_DATAAUDITDETAIL_DATAAUDIT_DATAAUDITID = "DER1N_DATAAUDITDETAIL_DATAAUDIT_DATAAUDITID";
    /**
     * 实体关系[DER1N_WXMEDIA_WXENTAPP_WXENTAPPID]
     */
    public static final String DER1N_WXMEDIA_WXENTAPP_WXENTAPPID = "DER1N_WXMEDIA_WXENTAPP_WXENTAPPID";
    /**
     * 实体关系[DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID]
     */
    public static final String DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID = "DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID";
    /**
     * 实体关系[DER1N_WFSTEPINST_WFINSTANCE_WFINSTANCEID]
     */
    public static final String DER1N_WFSTEPINST_WFINSTANCE_WFINSTANCEID = "DER1N_WFSTEPINST_WFINSTANCE_WFINSTANCEID";
    /**
     * 实体关系[DER1N_TSSDTASKPOLICY_TSSDPOLICY_TSSDPOLICYID]
     */
    public static final String DER1N_TSSDTASKPOLICY_TSSDPOLICY_TSSDPOLICYID = "DER1N_TSSDTASKPOLICY_TSSDPOLICY_TSSDPOLICYID";
    /**
     * 实体关系[DER1N_WFINSTANCE_ORG_ORGID]
     */
    public static final String DER1N_WFINSTANCE_ORG_ORGID = "DER1N_WFINSTANCE_ORG_ORGID";
    /**
     * 实体关系[DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID]
     */
    public static final String DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID = "DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID";
    /**
     * 实体关系[DER1N_PVPART_PORTALPAGE_PORTALPAGEID]
     */
    public static final String DER1N_PVPART_PORTALPAGE_PORTALPAGEID = "DER1N_PVPART_PORTALPAGE_PORTALPAGEID";
    /**
     * 实体关系[DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID]
     */
    public static final String DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID = "DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID";
    /**
     * 实体关系[DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID = "DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_DEDATACHG2_DATAENTITY_DEID]
     */
    public static final String DER1N_DEDATACHG2_DATAENTITY_DEID = "DER1N_DEDATACHG2_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_WXORGSECTOR_WXACCOUNT_WXACCOUNTID]
     */
    public static final String DER1N_WXORGSECTOR_WXACCOUNT_WXACCOUNTID = "DER1N_WXORGSECTOR_WXACCOUNT_WXACCOUNTID";
    /**
     * 实体关系[DER1N_OA_CPMJSQ_OA_CL_OA_CLID]
     */
    public static final String DER1N_OA_CPMJSQ_OA_CL_OA_CLID = "DER1N_OA_CPMJSQ_OA_CL_OA_CLID";
    /**
     * 实体关系[DER1N_USERROLERES_USERROLE_USERROLEID]
     */
    public static final String DER1N_USERROLERES_USERROLE_USERROLEID = "DER1N_USERROLERES_USERROLE_USERROLEID";
    /**
     * 实体关系[DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID]
     */
    public static final String DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID = "DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID";
    /**
     * 实体关系[DERINHERIT_USER_USEROBJECT]
     */
    public static final String DERINHERIT_USER_USEROBJECT = "DERINHERIT_USER_USEROBJECT";
    /**
     * 实体关系[DER1N_USERROLEDATA_ORG_DSTORGID]
     */
    public static final String DER1N_USERROLEDATA_ORG_DSTORGID = "DER1N_USERROLEDATA_ORG_DSTORGID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_L4PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_L4PVPARTID = "DER1N_PPMODEL_PVPART_L4PVPARTID";
    /**
     * 实体关系[DER1N_OA_CLWX_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_CLWX_ORGUSER_ORGUSERID = "DER1N_OA_CLWX_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_ORG_ORG_PORGID]
     */
    public static final String DER1N_ORG_ORG_PORGID = "DER1N_ORG_ORG_PORGID";
    /**
     * 实体关系[DER1N_USERDICTITEM_USERDICT_USERDICTID]
     */
    public static final String DER1N_USERDICTITEM_USERDICT_USERDICTID = "DER1N_USERDICTITEM_USERDICT_USERDICTID";
    /**
     * 实体关系[DER1N_OA_CCSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_CCSQ_ORGUSER_ORGUSERID = "DER1N_OA_CCSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_WFUSERCANDIDATE_WFUSER_WFMAJORUSERID]
     */
    public static final String DER1N_WFUSERCANDIDATE_WFUSER_WFMAJORUSERID = "DER1N_WFUSERCANDIDATE_WFUSER_WFMAJORUSERID";
    /**
     * 实体关系[DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID]
     */
    public static final String DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID = "DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID";
    /**
     * 实体关系[DER1N_WXACCESSTOKEN_WXACCOUNT_WXACCOUNTID]
     */
    public static final String DER1N_WXACCESSTOKEN_WXACCOUNT_WXACCOUNTID = "DER1N_WXACCESSTOKEN_WXACCOUNT_WXACCOUNTID";
    /**
     * 实体关系[DER1N_WXMEDIA_WXACCOUNT_WXACCOUNTID]
     */
    public static final String DER1N_WXMEDIA_WXACCOUNT_WXACCOUNTID = "DER1N_WXMEDIA_WXACCOUNT_WXACCOUNTID";
    /**
     * 实体关系[DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID]
     */
    public static final String DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID = "DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID";
    /**
     * 实体关系[DER1N_WFASSISTWORK_WFSTEPACTOR_WFSTEPACTORID]
     */
    public static final String DER1N_WFASSISTWORK_WFSTEPACTOR_WFSTEPACTORID = "DER1N_WFASSISTWORK_WFSTEPACTOR_WFSTEPACTORID";
    /**
     * 实体关系[DER1N_OA_ZSK_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_ZSK_ORGSECTOR_ORGSECTORID = "DER1N_OA_ZSK_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_CPMJSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_OA_GZRZ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_GZRZ_ORGUSER_ORGUSERID = "DER1N_OA_GZRZ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_YCSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_YCSQ_ORGUSER_ORGUSERID = "DER1N_OA_YCSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_PCSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_PCSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_PCSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_WFACTION_WFWORKFLOW_WFWORKFLOWID]
     */
    public static final String DER1N_WFACTION_WFWORKFLOW_WFWORKFLOWID = "DER1N_WFACTION_WFWORKFLOW_WFWORKFLOWID";
    /**
     * 实体关系[DER1N_WFASSISTWORK_WFINSTANCE_WFINSTANCEID]
     */
    public static final String DER1N_WFASSISTWORK_WFINSTANCE_WFINSTANCEID = "DER1N_WFASSISTWORK_WFINSTANCE_WFINSTANCEID";
    /**
     * 实体关系[DER1N_WFSTEPDATA_WFSTEP_WFSTEPID]
     */
    public static final String DER1N_WFSTEPDATA_WFSTEP_WFSTEPID = "DER1N_WFSTEPDATA_WFSTEP_WFSTEPID";
    /**
     * 实体关系[DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID]
     */
    public static final String DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID = "DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_R4PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_R4PVPARTID = "DER1N_PPMODEL_PVPART_R4PVPARTID";
    /**
     * 实体关系[DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID]
     */
    public static final String DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID = "DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID";
    /**
     * 实体关系[DER1N_USERROLEDATA_DATAENTITY_DEID]
     */
    public static final String DER1N_USERROLEDATA_DATAENTITY_DEID = "DER1N_USERROLEDATA_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_OA_PCSQ_OA_CL_OA_CLID]
     */
    public static final String DER1N_OA_PCSQ_OA_CL_OA_CLID = "DER1N_OA_PCSQ_OA_CL_OA_CLID";
    /**
     * 实体关系[DER1N_ORGSECUSER_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_ORGSECUSER_ORGUSER_ORGUSERID = "DER1N_ORGSECUSER_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID]
     */
    public static final String DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID = "DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID";
    /**
     * 实体关系[DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MAJORMSGACCOUNTID]
     */
    public static final String DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MAJORMSGACCOUNTID = "DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MAJORMSGACCOUNTID";
    /**
     * 实体关系[DER1N_OA_RZRY_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_RZRY_ORGUSER_ORGUSERID = "DER1N_OA_RZRY_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID]
     */
    public static final String DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID = "DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID";
    /**
     * 实体关系[DER1N_WFASSISTWORK_WFWORKFLOW_WFWORKFLOWID]
     */
    public static final String DER1N_WFASSISTWORK_WFWORKFLOW_WFWORKFLOWID = "DER1N_WFASSISTWORK_WFWORKFLOW_WFWORKFLOWID";
    /**
     * 实体关系[DER1N_WFUCPOLICY_WFUSER_MAJORWFUSERID]
     */
    public static final String DER1N_WFUCPOLICY_WFUSER_MAJORWFUSERID = "DER1N_WFUCPOLICY_WFUSER_MAJORWFUSERID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_L1PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_L1PVPARTID = "DER1N_PPMODEL_PVPART_L1PVPARTID";
    /**
     * 实体关系[DER1N_USERROLERES_UNIRES_UNIRESID]
     */
    public static final String DER1N_USERROLERES_UNIRES_UNIRESID = "DER1N_USERROLERES_UNIRES_UNIRESID";
    /**
     * 实体关系[DER1N_OA_CHRY_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_CHRY_ORGUSER_ORGUSERID = "DER1N_OA_CHRY_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID = "DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_TSSDTASKLOG_TSSDTASK_TSSDTASKID]
     */
    public static final String DER1N_TSSDTASKLOG_TSSDTASK_TSSDTASKID = "DER1N_TSSDTASKLOG_TSSDTASK_TSSDTASKID";
    /**
     * 实体关系[DER1N_ORGUSER_ORG_ORGID]
     */
    public static final String DER1N_ORGUSER_ORG_ORGID = "DER1N_ORGUSER_ORG_ORGID";
    /**
     * 实体关系[DER1N_WFWORKLIST_WFINSTANCE_WFINSTANCEID]
     */
    public static final String DER1N_WFWORKLIST_WFINSTANCE_WFINSTANCEID = "DER1N_WFWORKLIST_WFINSTANCE_WFINSTANCEID";
    /**
     * 实体关系[DER1N_USERROLEDATA_ORGSECTOR_DSTORGSECTORID]
     */
    public static final String DER1N_USERROLEDATA_ORGSECTOR_DSTORGSECTORID = "DER1N_USERROLEDATA_ORGSECTOR_DSTORGSECTORID";
    /**
     * 实体关系[DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID]
     */
    public static final String DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID = "DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID";
    /**
     * 实体关系[DER1N_TSSDGROUPDETAIL_TSSDITEM_TSSDITEMID]
     */
    public static final String DER1N_TSSDGROUPDETAIL_TSSDITEM_TSSDITEMID = "DER1N_TSSDGROUPDETAIL_TSSDITEM_TSSDITEMID";
    /**
     * 实体关系[DER1N_USERDICTITEM_USERDICTCAT_USERDICTCATID]
     */
    public static final String DER1N_USERDICTITEM_USERDICTCAT_USERDICTCATID = "DER1N_USERDICTITEM_USERDICTCAT_USERDICTCATID";
    /**
     * 实体关系[DER1N_OA_JPYD_ORGUSER_JBRID]
     */
    public static final String DER1N_OA_JPYD_ORGUSER_JBRID = "DER1N_OA_JPYD_ORGUSER_JBRID";
    /**
     * 实体关系[DER1N_OA_XXRY_OA_XX_OA_XXID]
     */
    public static final String DER1N_OA_XXRY_OA_XX_OA_XXID = "DER1N_OA_XXRY_OA_XX_OA_XXID";
    /**
     * 实体关系[DER1N_WFUSERCANDIDATE_WFUSER_WFMINORUSERID]
     */
    public static final String DER1N_WFUSERCANDIDATE_WFUSER_WFMINORUSERID = "DER1N_WFUSERCANDIDATE_WFUSER_WFMINORUSERID";
    /**
     * 实体关系[DER1N_WFIAACTION_WFSTEP_WFSTEPID]
     */
    public static final String DER1N_WFIAACTION_WFSTEP_WFSTEPID = "DER1N_WFIAACTION_WFSTEP_WFSTEPID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_R2PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_R2PVPARTID = "DER1N_PPMODEL_PVPART_R2PVPARTID";
    /**
     * 实体关系[DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID]
     */
    public static final String DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID = "DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID";
    /**
     * 实体关系[DER1N_OA_STWMDG_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_STWMDG_ORGUSER_ORGUSERID = "DER1N_OA_STWMDG_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_USERROLEDETAIL_USERROLE_USERROLEID]
     */
    public static final String DER1N_USERROLEDETAIL_USERROLE_USERROLEID = "DER1N_USERROLEDETAIL_USERROLE_USERROLEID";
    /**
     * 实体关系[DER1N_ORGSECTOR_ORG_ORGID]
     */
    public static final String DER1N_ORGSECTOR_ORG_ORGID = "DER1N_ORGSECTOR_ORG_ORGID";
    /**
     * 实体关系[DER1N_OA_SBWX_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_SBWX_ORGUSER_ORGUSERID = "DER1N_OA_SBWX_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_TSSDGROUPDETAIL_TSSDGROUP_TSSDGROUPID]
     */
    public static final String DER1N_TSSDGROUPDETAIL_TSSDGROUP_TSSDGROUPID = "DER1N_TSSDGROUPDETAIL_TSSDGROUP_TSSDGROUPID";
    /**
     * 实体关系[DER1N_WFREMINDER_WFUSER_WFUSERID]
     */
    public static final String DER1N_WFREMINDER_WFUSER_WFUSERID = "DER1N_WFREMINDER_WFUSER_WFUSERID";
    /**
     * 实体关系[DER1N_DATASYNCIN2_DATAENTITY_DEID]
     */
    public static final String DER1N_DATASYNCIN2_DATAENTITY_DEID = "DER1N_DATASYNCIN2_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_OA_NSJGHYSQ_OA_HYS_HYSID]
     */
    public static final String DER1N_OA_NSJGHYSQ_OA_HYS_HYSID = "DER1N_OA_NSJGHYSQ_OA_HYS_HYSID";
    /**
     * 实体关系[DER1N_WXORGSECTOR_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_WXORGSECTOR_ORGSECTOR_ORGSECTORID = "DER1N_WXORGSECTOR_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID]
     */
    public static final String DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID = "DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID";
    /**
     * 实体关系[DER1N_DATAENTITY_QUERYMODEL_ACQUERYMODELID]
     */
    public static final String DER1N_DATAENTITY_QUERYMODEL_ACQUERYMODELID = "DER1N_DATAENTITY_QUERYMODEL_ACQUERYMODELID";
    /**
     * 实体关系[DER1N_WFWORKLIST_WFUSER_ORIGINALWFUSERID]
     */
    public static final String DER1N_WFWORKLIST_WFUSER_ORIGINALWFUSERID = "DER1N_WFWORKLIST_WFUSER_ORIGINALWFUSERID";
    /**
     * 实体关系[DER1N_DATASYNCOUT2_DATAENTITY_DEID]
     */
    public static final String DER1N_DATASYNCOUT2_DATAENTITY_DEID = "DER1N_DATASYNCOUT2_DATAENTITY_DEID";
    /**
     * 实体关系[DERINDEX_WFDYNAMICUSER_WFACTOR]
     */
    public static final String DERINDEX_WFDYNAMICUSER_WFACTOR = "DERINDEX_WFDYNAMICUSER_WFACTOR";
    /**
     * 实体关系[DER1N_WFTMPSTEPACTOR_WFACTOR_WFACTORID]
     */
    public static final String DER1N_WFTMPSTEPACTOR_WFACTOR_WFACTORID = "DER1N_WFTMPSTEPACTOR_WFACTOR_WFACTORID";
    /**
     * 实体关系[DER1N_WFSTEPINST_WFSTEP_WFSTEPID]
     */
    public static final String DER1N_WFSTEPINST_WFSTEP_WFSTEPID = "DER1N_WFSTEPINST_WFSTEP_WFSTEPID";
    /**
     * 实体关系[DER1N_ORGSECUSER_ORG_ORGID]
     */
    public static final String DER1N_ORGSECUSER_ORG_ORGID = "DER1N_ORGSECUSER_ORG_ORGID";
    /**
     * 实体关系[DERINDEX_WFUSER_WFACTOR]
     */
    public static final String DERINDEX_WFUSER_WFACTOR = "DERINDEX_WFUSER_WFACTOR";
    /**
     * 实体关系[DER1N_CODELIST_DATAENTITY_DEID]
     */
    public static final String DER1N_CODELIST_DATAENTITY_DEID = "DER1N_CODELIST_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_OA_JPYD_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_JPYD_ORGUSER_ORGUSERID = "DER1N_OA_JPYD_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_C4PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_C4PVPARTID = "DER1N_PPMODEL_PVPART_C4PVPARTID";
    /**
     * 实体关系[DER1N_USERROLEDATAS_USERROLEDATA_USERROLEDATAID]
     */
    public static final String DER1N_USERROLEDATAS_USERROLEDATA_USERROLEDATAID = "DER1N_USERROLEDATAS_USERROLEDATA_USERROLEDATAID";
    /**
     * 实体关系[DER1N_OA_PCSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_PCSQ_ORGUSER_ORGUSERID = "DER1N_OA_PCSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DERINHERIT_USERGROUP_USEROBJECT]
     */
    public static final String DERINHERIT_USERGROUP_USEROBJECT = "DERINHERIT_USERGROUP_USEROBJECT";
    /**
     * 实体关系[DER1N_DATAENTITY_DATAENTITY_DER11DEID]
     */
    public static final String DER1N_DATAENTITY_DATAENTITY_DER11DEID = "DER1N_DATAENTITY_DATAENTITY_DER11DEID";
    /**
     * 实体关系[DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID]
     */
    public static final String DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID = "DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID";
    /**
     * 实体关系[DER1N_USERROLEDETAIL_USEROBJECT_USEROBJECTID]
     */
    public static final String DER1N_USERROLEDETAIL_USEROBJECT_USEROBJECTID = "DER1N_USERROLEDETAIL_USEROBJECT_USEROBJECTID";
    /**
     * 实体关系[DER1N_WFTMPSTEPACTOR_WFSTEP_PREVWFSTEPID]
     */
    public static final String DER1N_WFTMPSTEPACTOR_WFSTEP_PREVWFSTEPID = "DER1N_WFTMPSTEPACTOR_WFSTEP_PREVWFSTEPID";
    /**
     * 实体关系[DER1N_ORGUSER_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_ORGUSER_ORGSECTOR_ORGSECTORID = "DER1N_ORGUSER_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_WXACCOUNT_ORG_ORGID]
     */
    public static final String DER1N_WXACCOUNT_ORG_ORGID = "DER1N_WXACCOUNT_ORG_ORGID";
    /**
     * 实体关系[DER1N_OA_TZGGRY_OA_TZGG_OA_TZGGID]
     */
    public static final String DER1N_OA_TZGGRY_OA_TZGG_OA_TZGGID = "DER1N_OA_TZGGRY_OA_TZGG_OA_TZGGID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_L2PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_L2PVPARTID = "DER1N_PPMODEL_PVPART_L2PVPARTID";
    /**
     * 实体关系[DER1N_WFUCPOLICY_WFUSER_MINORWFUSERID]
     */
    public static final String DER1N_WFUCPOLICY_WFUSER_MINORWFUSERID = "DER1N_WFUCPOLICY_WFUSER_MINORWFUSERID";
    /**
     * 实体关系[DER1N_WFAPPSETTING_MSGTEMPLATE_REMINDMSGTEMPID]
     */
    public static final String DER1N_WFAPPSETTING_MSGTEMPLATE_REMINDMSGTEMPID = "DER1N_WFAPPSETTING_MSGTEMPLATE_REMINDMSGTEMPID";
    /**
     * 实体关系[DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID = "DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID]
     */
    public static final String DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID = "DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID";
    /**
     * 实体关系[DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID]
     */
    public static final String DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID = "DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID";
    /**
     * 实体关系[DER1N_ORGUSER_ORGUSERLEVEL_ORGUSERLEVELID]
     */
    public static final String DER1N_ORGUSER_ORGUSERLEVEL_ORGUSERLEVELID = "DER1N_ORGUSER_ORGUSERLEVEL_ORGUSERLEVELID";
    /**
     * 实体关系[DER1N_OA_YYSSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_YYSSQ_ORGUSER_ORGUSERID = "DER1N_OA_YYSSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_XXRY_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_XXRY_ORGUSER_ORGUSERID = "DER1N_OA_XXRY_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_C2PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_C2PVPARTID = "DER1N_PPMODEL_PVPART_C2PVPARTID";
    /**
     * 实体关系[DERINDEX_WFUSERGROUP_WFACTOR]
     */
    public static final String DERINDEX_WFUSERGROUP_WFACTOR = "DERINDEX_WFUSERGROUP_WFACTOR";
    /**
     * 实体关系[DER1N_OA_RZRY_OA_GZRZ_GZRZID]
     */
    public static final String DER1N_OA_RZRY_OA_GZRZ_GZRZID = "DER1N_OA_RZRY_OA_GZRZ_GZRZID";
    /**
     * 实体关系[DER1N_OA_QXJ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_QXJ_ORGUSER_ORGUSERID = "DER1N_OA_QXJ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_DEDATACHG_DATAENTITY_DEID]
     */
    public static final String DER1N_DEDATACHG_DATAENTITY_DEID = "DER1N_DEDATACHG_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID]
     */
    public static final String DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID = "DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID";
    /**
     * 实体关系[DER1N_MSGTEMPLATE_DATAENTITY_DEID]
     */
    public static final String DER1N_MSGTEMPLATE_DATAENTITY_DEID = "DER1N_MSGTEMPLATE_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_LOGINACCOUNT_USER_USERID]
     */
    public static final String DER1N_LOGINACCOUNT_USER_USERID = "DER1N_LOGINACCOUNT_USER_USERID";
    /**
     * 实体关系[DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID]
     */
    public static final String DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID = "DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID";
    /**
     * 实体关系[DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID = "DER1N_OA_CPMJSQ_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_WXMESSAGE_WXACCOUNT_WXACCOUNTID]
     */
    public static final String DER1N_WXMESSAGE_WXACCOUNT_WXACCOUNTID = "DER1N_WXMESSAGE_WXACCOUNT_WXACCOUNTID";
    /**
     * 实体关系[DER1N_SYSADMINFUNC_SYSADMIN_SYSADMINID]
     */
    public static final String DER1N_SYSADMINFUNC_SYSADMIN_SYSADMINID = "DER1N_SYSADMINFUNC_SYSADMIN_SYSADMINID";
    /**
     * 实体关系[DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID]
     */
    public static final String DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID = "DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID";
    /**
     * 实体关系[DER1N_OA_ZSK_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_ZSK_ORGUSER_ORGUSERID = "DER1N_OA_ZSK_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_CLWX_OA_CL_OA_CLID]
     */
    public static final String DER1N_OA_CLWX_OA_CL_OA_CLID = "DER1N_OA_CLWX_OA_CL_OA_CLID";
    /**
     * 实体关系[DER1N_OA_XX_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_XX_ORGUSER_ORGUSERID = "DER1N_OA_XX_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_USERROLEDEFIELD_DATAENTITY_DEID]
     */
    public static final String DER1N_USERROLEDEFIELD_DATAENTITY_DEID = "DER1N_USERROLEDEFIELD_DATAENTITY_DEID";
    /**
     * 实体关系[DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID = "DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_WFSTEP_WFINSTANCE_WFINSTANCEID]
     */
    public static final String DER1N_WFSTEP_WFINSTANCE_WFINSTANCEID = "DER1N_WFSTEP_WFINSTANCE_WFINSTANCEID";
    /**
     * 实体关系[DER1N_OA_YYSSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_YYSSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_YYSSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID]
     */
    public static final String DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID = "DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID";
    /**
     * 实体关系[DER1N_OA_JPYD_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_JPYD_ORGSECTOR_ORGSECTORID = "DER1N_OA_JPYD_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_OA_TZGG_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_TZGG_ORGUSER_ORGUSERID = "DER1N_OA_TZGG_ORGUSER_ORGUSERID";
    /**
     * 实体关系[DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID]
     */
    public static final String DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID = "DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_R3PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_R3PVPARTID = "DER1N_PPMODEL_PVPART_R3PVPARTID";
    /**
     * 实体关系[DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID]
     */
    public static final String DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID = "DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID";
    /**
     * 实体关系[DER1N_PPMODEL_PVPART_C3PVPARTID]
     */
    public static final String DER1N_PPMODEL_PVPART_C3PVPARTID = "DER1N_PPMODEL_PVPART_C3PVPARTID";
    /**
     * 实体关系[DER1N_USERROLEDATADETAIL_USERROLEDATA_USERROLEDATAID]
     */
    public static final String DER1N_USERROLEDATADETAIL_USERROLEDATA_USERROLEDATAID = "DER1N_USERROLEDATADETAIL_USERROLEDATA_USERROLEDATAID";
    /**
     * 实体关系[DER1N_CODEITEM_CODELIST_CODELISTID]
     */
    public static final String DER1N_CODEITEM_CODELIST_CODELISTID = "DER1N_CODEITEM_CODELIST_CODELISTID";
    /**
     * 实体关系[DER1N_OA_TZGGRY_ORGUSER_ORGUSERID]
     */
    public static final String DER1N_OA_TZGGRY_ORGUSER_ORGUSERID = "DER1N_OA_TZGGRY_ORGUSER_ORGUSERID";

    /**
     * 实体名称[DEMO] -- 演示
     */
    public static final String DEMO = "DEMO";
    /**
     * 实体名称[SYSTEM] -- 系统
     */
    public static final String SYSTEM = "SYSTEM";
    /**
     * 实体名称[WFUSERCANDIDATE] -- 工作流用户候选者
     */
    public static final String WFUSERCANDIDATE = "WFUSERCANDIDATE";
    /**
     * 实体名称[OA_XX] -- 消息
     */
    public static final String OA_XX = "OA_XX";
    /**
     * 实体名称[UNIRES] -- 统一资源
     */
    public static final String UNIRES = "UNIRES";
    /**
     * 实体名称[LVXIN_GROUPMEMBER] -- 群组成员表
     */
    public static final String LVXIN_GROUPMEMBER = "LVXIN_GROUPMEMBER";
    /**
     * 实体名称[DEDATACHG2] -- 实体数据变更（已处理）
     */
    public static final String DEDATACHG2 = "DEDATACHG2";
    /**
     * 实体名称[OA_XMJD] -- 项目进度
     */
    public static final String OA_XMJD = "OA_XMJD";
    /**
     * 实体名称[WFSTEPDATA] -- 工作流步骤数据
     */
    public static final String WFSTEPDATA = "WFSTEPDATA";
    /**
     * 实体名称[SYSADMIN] -- 系统管理模块
     */
    public static final String SYSADMIN = "SYSADMIN";
    /**
     * 实体名称[LVXIN_CONFIG] -- 系统配置表
     */
    public static final String LVXIN_CONFIG = "LVXIN_CONFIG";
    /**
     * 实体名称[USERROLEDATADETAIL] -- 数据对象能力明细
     */
    public static final String USERROLEDATADETAIL = "USERROLEDATADETAIL";
    /**
     * 实体名称[WXENTAPP] -- 微信企业应用
     */
    public static final String WXENTAPP = "WXENTAPP";
    /**
     * 实体名称[DEDATACHGDISP] -- 实体数据变更派发引擎
     */
    public static final String DEDATACHGDISP = "DEDATACHGDISP";
    /**
     * 实体名称[TSSDTASKTYPE] -- 任务调度任务类型
     */
    public static final String TSSDTASKTYPE = "TSSDTASKTYPE";
    /**
     * 实体名称[PVPART] -- 门户视图部件
     */
    public static final String PVPART = "PVPART";
    /**
     * 实体名称[DATAAUDIT] -- 数据审计
     */
    public static final String DATAAUDIT = "DATAAUDIT";
    /**
     * 实体名称[LVXIN_COMMENT] -- 评论表
     */
    public static final String LVXIN_COMMENT = "LVXIN_COMMENT";
    /**
     * 实体名称[OA_PCSQ] -- 派车申请
     */
    public static final String OA_PCSQ = "OA_PCSQ";
    /**
     * 实体名称[LVXIN_ARTICLE] -- 圈子表
     */
    public static final String LVXIN_ARTICLE = "LVXIN_ARTICLE";
    /**
     * 实体名称[LVXIN_CIMSESSION] -- 在线设备表
     */
    public static final String LVXIN_CIMSESSION = "LVXIN_CIMSESSION";
    /**
     * 实体名称[WFWORKLIST] -- 工作流工作列表
     */
    public static final String WFWORKLIST = "WFWORKLIST";
    /**
     * 实体名称[USERROLERES] -- 用户角色资源能力
     */
    public static final String USERROLERES = "USERROLERES";
    /**
     * 实体名称[REGISTRY] -- 注册表
     */
    public static final String REGISTRY = "REGISTRY";
    /**
     * 实体名称[USERROLE] -- 用户角色
     */
    public static final String USERROLE = "USERROLE";
    /**
     * 实体名称[TSSDTASKPOLICY] -- 调度任务项策略
     */
    public static final String TSSDTASKPOLICY = "TSSDTASKPOLICY";
    /**
     * 实体名称[OA_FLFG] -- 法律法规
     */
    public static final String OA_FLFG = "OA_FLFG";
    /**
     * 实体名称[TSSDPOLICYOWNER] -- 任务时刻策略所有者
     */
    public static final String TSSDPOLICYOWNER = "TSSDPOLICYOWNER";
    /**
     * 实体名称[USERROLEDEFIELD] -- 用户角色实体属性访问
     */
    public static final String USERROLEDEFIELD = "USERROLEDEFIELD";
    /**
     * 实体名称[TSSDGROUP] -- 任务时刻策略组
     */
    public static final String TSSDGROUP = "TSSDGROUP";
    /**
     * 实体名称[LVXIN_USER] -- 用户表
     */
    public static final String LVXIN_USER = "LVXIN_USER";
    /**
     * 实体名称[WFUSERGROUPDETAIL] -- 工作流用户组成员
     */
    public static final String WFUSERGROUPDETAIL = "WFUSERGROUPDETAIL";
    /**
     * 实体名称[LVXIN_SEQUENCE] -- 序列表
     */
    public static final String LVXIN_SEQUENCE = "LVXIN_SEQUENCE";
    /**
     * 实体名称[WFCUSTOMPROCESS] -- 工作流预定义处理
     */
    public static final String WFCUSTOMPROCESS = "WFCUSTOMPROCESS";
    /**
     * 实体名称[OA_GZRZ] -- 工作日志
     */
    public static final String OA_GZRZ = "OA_GZRZ";
    /**
     * 实体名称[USERDICTCAT] -- 用户词条类别
     */
    public static final String USERDICTCAT = "USERDICTCAT";
    /**
     * 实体名称[API_XT_FJLJ] -- 附加逻辑
     */
    public static final String API_XT_FJLJ = "API_XT_FJLJ";
    /**
     * 实体名称[LOGINLOG] -- 帐户使用记录
     */
    public static final String LOGINLOG = "LOGINLOG";
    /**
     * 实体名称[TSSDITEM] -- 任务时刻策略项
     */
    public static final String TSSDITEM = "TSSDITEM";
    /**
     * 实体名称[OA_JPYD] -- 机票预订
     */
    public static final String OA_JPYD = "OA_JPYD";
    /**
     * 实体名称[SYSADMINFUNC] -- 系统管理功能
     */
    public static final String SYSADMINFUNC = "SYSADMINFUNC";
    /**
     * 实体名称[TSSDTASK] -- 任务调度任务项
     */
    public static final String TSSDTASK = "TSSDTASK";
    /**
     * 实体名称[WFUSERASSIST] -- 工作流用户代办
     */
    public static final String WFUSERASSIST = "WFUSERASSIST";
    /**
     * 实体名称[WFIAACTION] -- 工作流交互操作
     */
    public static final String WFIAACTION = "WFIAACTION";
    /**
     * 实体名称[WXACCESSTOKEN] -- 微信访问票据
     */
    public static final String WXACCESSTOKEN = "WXACCESSTOKEN";
    /**
     * 实体名称[OA_SBWX] -- 设备维修
     */
    public static final String OA_SBWX = "OA_SBWX";
    /**
     * 实体名称[LVXIN_BOTTLE] -- 漂流瓶表
     */
    public static final String LVXIN_BOTTLE = "LVXIN_BOTTLE";
    /**
     * 实体名称[LVXIN_MOMENTRULE] -- 空间权限表
     */
    public static final String LVXIN_MOMENTRULE = "LVXIN_MOMENTRULE";
    /**
     * 实体名称[USERROLEDATAACTION] -- 用户角色数据操作
     */
    public static final String USERROLEDATAACTION = "USERROLEDATAACTION";
    /**
     * 实体名称[ORGTYPE] -- 组织类型
     */
    public static final String ORGTYPE = "ORGTYPE";
    /**
     * 实体名称[OA_CHRY] -- 参会人员
     */
    public static final String OA_CHRY = "OA_CHRY";
    /**
     * 实体名称[USERDGTHEME] -- 用户表格自定义
     */
    public static final String USERDGTHEME = "USERDGTHEME";
    /**
     * 实体名称[DALOG] -- DA日志
     */
    public static final String DALOG = "DALOG";
    /**
     * 实体名称[ORGSECTOR] -- 组织部门
     */
    public static final String ORGSECTOR = "ORGSECTOR";
    /**
     * 实体名称[USERROLEDATAS] -- 用户角色数据能力
     */
    public static final String USERROLEDATAS = "USERROLEDATAS";
    /**
     * 实体名称[MSGSENDQUEUE] -- 消息发送队列
     */
    public static final String MSGSENDQUEUE = "MSGSENDQUEUE";
    /**
     * 实体名称[LVXIN_SUBSCRIBER] -- 订阅关系表
     */
    public static final String LVXIN_SUBSCRIBER = "LVXIN_SUBSCRIBER";
    /**
     * 实体名称[WFASSISTWORK] -- 工作流代办工作
     */
    public static final String WFASSISTWORK = "WFASSISTWORK";
    /**
     * 实体名称[QUERYMODEL] -- 实体查询模型
     */
    public static final String QUERYMODEL = "QUERYMODEL";
    /**
     * 实体名称[OA_YCSQ] -- 用餐申请
     */
    public static final String OA_YCSQ = "OA_YCSQ";
    /**
     * 实体名称[USERROLEDETAIL] -- 用户角色成员
     */
    public static final String USERROLEDETAIL = "USERROLEDETAIL";
    /**
     * 实体名称[USERROLEDATA] -- 数据对象能力
     */
    public static final String USERROLEDATA = "USERROLEDATA";
    /**
     * 实体名称[USERROLEDEFIELDS] -- 用户角色相关实体属性访问控制
     */
    public static final String USERROLEDEFIELDS = "USERROLEDEFIELDS";
    /**
     * 实体名称[WFWORKFLOW] -- 工作流配置
     */
    public static final String WFWORKFLOW = "WFWORKFLOW";
    /**
     * 实体名称[MSGSENDQUEUEHIS] -- 消息发送队列（历史）
     */
    public static final String MSGSENDQUEUEHIS = "MSGSENDQUEUEHIS";
    /**
     * 实体名称[DATASYNCIN2] -- 数据同步接收队列2
     */
    public static final String DATASYNCIN2 = "DATASYNCIN2";
    /**
     * 实体名称[OA_HYS] -- 会议室
     */
    public static final String OA_HYS = "OA_HYS";
    /**
     * 实体名称[DATAAUDITDETAIL] -- 数据审计明细
     */
    public static final String DATAAUDITDETAIL = "DATAAUDITDETAIL";
    /**
     * 实体名称[TSSDPOLICY] -- 任务时刻策略
     */
    public static final String TSSDPOLICY = "TSSDPOLICY";
    /**
     * 实体名称[OA_QXJ] -- 请休假
     */
    public static final String OA_QXJ = "OA_QXJ";
    /**
     * 实体名称[LVXIN_ORGANIZATION] -- 组织表
     */
    public static final String LVXIN_ORGANIZATION = "LVXIN_ORGANIZATION";
    /**
     * 实体名称[WFACTOR] -- 工作流操作者
     */
    public static final String WFACTOR = "WFACTOR";
    /**
     * 实体名称[CODELIST] -- 代码表
     */
    public static final String CODELIST = "CODELIST";
    /**
     * 实体名称[MSGTEMPLATE] -- 消息模板
     */
    public static final String MSGTEMPLATE = "MSGTEMPLATE";
    /**
     * 实体名称[USERDICTITEM] -- 用户词条
     */
    public static final String USERDICTITEM = "USERDICTITEM";
    /**
     * 实体名称[USERROLETYPE] -- 用户角色类型
     */
    public static final String USERROLETYPE = "USERROLETYPE";
    /**
     * 实体名称[LVXIN_PUBLICACCOUNT] -- 公众账号
     */
    public static final String LVXIN_PUBLICACCOUNT = "LVXIN_PUBLICACCOUNT";
    /**
     * 实体名称[OA_CGSQ] -- 采购申请
     */
    public static final String OA_CGSQ = "OA_CGSQ";
    /**
     * 实体名称[WXACCOUNT] -- 微信公众号
     */
    public static final String WXACCOUNT = "WXACCOUNT";
    /**
     * 实体名称[DATASYNCIN] -- 数据同步接收队列
     */
    public static final String DATASYNCIN = "DATASYNCIN";
    /**
     * 实体名称[CODEITEM] -- 代码项
     */
    public static final String CODEITEM = "CODEITEM";
    /**
     * 实体名称[OA_CPMJSQ] -- 车牌门禁申请
     */
    public static final String OA_CPMJSQ = "OA_CPMJSQ";
    /**
     * 实体名称[TSSDENGINE] -- 任务调度引擎
     */
    public static final String TSSDENGINE = "TSSDENGINE";
    /**
     * 实体名称[WFUCPOLICY] -- 工作流候选用户策略
     */
    public static final String WFUCPOLICY = "WFUCPOLICY";
    /**
     * 实体名称[WFSTEPACTOR] -- 工作流步骤操作者
     */
    public static final String WFSTEPACTOR = "WFSTEPACTOR";
    /**
     * 实体名称[WFACTION] -- 工作流用户操作
     */
    public static final String WFACTION = "WFACTION";
    /**
     * 实体名称[OA_RZRY] -- 日志人员
     */
    public static final String OA_RZRY = "OA_RZRY";
    /**
     * 实体名称[WFUIWIZARD] -- 工作流操作界面
     */
    public static final String WFUIWIZARD = "WFUIWIZARD";
    /**
     * 实体名称[OA_CZRZ] -- 操作日志
     */
    public static final String OA_CZRZ = "OA_CZRZ";
    /**
     * 实体名称[WFSTEP] -- 工作流步骤
     */
    public static final String WFSTEP = "WFSTEP";
    /**
     * 实体名称[LVXIN_MESSAGE] -- 消息记录表
     */
    public static final String LVXIN_MESSAGE = "LVXIN_MESSAGE";
    /**
     * 实体名称[OA_STWMDG] -- 食堂外卖订购
     */
    public static final String OA_STWMDG = "OA_STWMDG";
    /**
     * 实体名称[USERGROUPDETAIL] -- 用户组成员
     */
    public static final String USERGROUPDETAIL = "USERGROUPDETAIL";
    /**
     * 实体名称[LVXIN_GROUP] -- 群组表
     */
    public static final String LVXIN_GROUP = "LVXIN_GROUP";
    /**
     * 实体名称[WFAPPSETTING] -- 工作流系统设定
     */
    public static final String WFAPPSETTING = "WFAPPSETTING";
    /**
     * 实体名称[OA_CCSQ] -- 出差申请
     */
    public static final String OA_CCSQ = "OA_CCSQ";
    /**
     * 实体名称[LVXIN_MANAGER] -- 系统管理员表
     */
    public static final String LVXIN_MANAGER = "LVXIN_MANAGER";
    /**
     * 实体名称[WXORGSECTOR] -- 微信部门
     */
    public static final String WXORGSECTOR = "WXORGSECTOR";
    /**
     * 实体名称[DATASYNCOUT2] -- 数据同步发送队列2
     */
    public static final String DATASYNCOUT2 = "DATASYNCOUT2";
    /**
     * 实体名称[WXMEDIA] -- 微信多媒体内容
     */
    public static final String WXMEDIA = "WXMEDIA";
    /**
     * 实体名称[OA_YYSSQ] -- 饮用水申请
     */
    public static final String OA_YYSSQ = "OA_YYSSQ";
    /**
     * 实体名称[WFSYSTEMUSER] -- 工作流系统用户
     */
    public static final String WFSYSTEMUSER = "WFSYSTEMUSER";
    /**
     * 实体名称[SERVICE] -- 服务
     */
    public static final String SERVICE = "SERVICE";
    /**
     * 实体名称[MSGACCOUNTDETAIL] -- 组消息账户明细
     */
    public static final String MSGACCOUNTDETAIL = "MSGACCOUNTDETAIL";
    /**
     * 实体名称[WFWFVERSION] -- 工作流配置版本
     */
    public static final String WFWFVERSION = "WFWFVERSION";
    /**
     * 实体名称[USERDICT] -- 用户词典
     */
    public static final String USERDICT = "USERDICT";
    /**
     * 实体名称[OA_CL] -- 车辆
     */
    public static final String OA_CL = "OA_CL";
    /**
     * 实体名称[DEDATACHG] -- 实体数据变更
     */
    public static final String DEDATACHG = "DEDATACHG";
    /**
     * 实体名称[PORTALPAGE] -- 门户页面
     */
    public static final String PORTALPAGE = "PORTALPAGE";
    /**
     * 实体名称[OA_NSJGHYSQ] -- 内设机构会议申请
     */
    public static final String OA_NSJGHYSQ = "OA_NSJGHYSQ";
    /**
     * 实体名称[LOGINACCOUNT] -- 登录帐户
     */
    public static final String LOGINACCOUNT = "LOGINACCOUNT";
    /**
     * 实体名称[GG_DB] -- 待办
     */
    public static final String GG_DB = "GG_DB";
    /**
     * 实体名称[USER] -- 用户
     */
    public static final String USER = "USER";
    /**
     * 实体名称[ORGUNITCAT] -- 组织单元类别
     */
    public static final String ORGUNITCAT = "ORGUNITCAT";
    /**
     * 实体名称[OA_YBHYSQ] -- 会议申请
     */
    public static final String OA_YBHYSQ = "OA_YBHYSQ";
    /**
     * 实体名称[OA_CLWX] -- 车辆维修
     */
    public static final String OA_CLWX = "OA_CLWX";
    /**
     * 实体名称[ORGSECUSER] -- 组织部门人员
     */
    public static final String ORGSECUSER = "ORGSECUSER";
    /**
     * 实体名称[TSSDGROUPDETAIL] -- 任务时刻策略组明细
     */
    public static final String TSSDGROUPDETAIL = "TSSDGROUPDETAIL";
    /**
     * 实体名称[ORGUSERLEVEL] -- 组织人员级别
     */
    public static final String ORGUSERLEVEL = "ORGUSERLEVEL";
    /**
     * 实体名称[FILE] -- 文件
     */
    public static final String FILE = "FILE";
    /**
     * 实体名称[WFDYNAMICUSER] -- 工作流动态用户
     */
    public static final String WFDYNAMICUSER = "WFDYNAMICUSER";
    /**
     * 实体名称[PPMODEL] -- 门户页面模型
     */
    public static final String PPMODEL = "PPMODEL";
    /**
     * 实体名称[TSSDTASKLOG] -- 任务调度日志
     */
    public static final String TSSDTASKLOG = "TSSDTASKLOG";
    /**
     * 实体名称[WFUSER] -- 工作流用户
     */
    public static final String WFUSER = "WFUSER";
    /**
     * 实体名称[DATASYNCOUT] -- 数据同步发送队列
     */
    public static final String DATASYNCOUT = "DATASYNCOUT";
    /**
     * 实体名称[OA_TZGG] -- 通知公告
     */
    public static final String OA_TZGG = "OA_TZGG";
    /**
     * 实体名称[OA_XXRY] -- 消息人员
     */
    public static final String OA_XXRY = "OA_XXRY";
    /**
     * 实体名称[USERGROUP] -- 用户组
     */
    public static final String USERGROUP = "USERGROUP";
    /**
     * 实体名称[USEROBJECT] -- 用户对象
     */
    public static final String USEROBJECT = "USEROBJECT";
    /**
     * 实体名称[WFTMPSTEPACTOR] -- 工作流步骤操作者（临时）
     */
    public static final String WFTMPSTEPACTOR = "WFTMPSTEPACTOR";
    /**
     * 实体名称[LVXIN_PUBLICMENU] -- 公众号菜单
     */
    public static final String LVXIN_PUBLICMENU = "LVXIN_PUBLICMENU";
    /**
     * 实体名称[DATAENTITY] -- 实体
     */
    public static final String DATAENTITY = "DATAENTITY";
    /**
     * 实体名称[MSGACCOUNT] -- 消息账户
     */
    public static final String MSGACCOUNT = "MSGACCOUNT";
    /**
     * 实体名称[DATASYNCAGENT] -- 数据同步代理
     */
    public static final String DATASYNCAGENT = "DATASYNCAGENT";
    /**
     * 实体名称[OA_BGYPSQ] -- 办公用品申请
     */
    public static final String OA_BGYPSQ = "OA_BGYPSQ";
    /**
     * 实体名称[WFINSTANCE] -- 工作流实例
     */
    public static final String WFINSTANCE = "WFINSTANCE";
    /**
     * 实体名称[WXMESSAGE] -- 微信消息
     */
    public static final String WXMESSAGE = "WXMESSAGE";
    /**
     * 实体名称[WFUSERGROUP] -- 工作流用户组
     */
    public static final String WFUSERGROUP = "WFUSERGROUP";
    /**
     * 实体名称[ORGUSER] -- 组织人员
     */
    public static final String ORGUSER = "ORGUSER";
    /**
     * 实体名称[ORGSECUSERTYPE] -- 部门人员关系类型
     */
    public static final String ORGSECUSERTYPE = "ORGSECUSERTYPE";
    /**
     * 实体名称[OA_ZSK] -- 知识库
     */
    public static final String OA_ZSK = "OA_ZSK";
    /**
     * 实体名称[WFSTEPINST] -- 工作流步骤子实例
     */
    public static final String WFSTEPINST = "WFSTEPINST";
    /**
     * 实体名称[WFREMINDER] -- 工作流工作催办
     */
    public static final String WFREMINDER = "WFREMINDER";
    /**
     * 实体名称[ORG] -- 组织机构
     */
    public static final String ORG = "ORG";
    /**
     * 实体名称[OA_TZGGRY] -- 通知公告人员
     */
    public static final String OA_TZGGRY = "OA_TZGGRY";

    public UniPSampleSysModel() throws Exception {
        super();
        this.setId("2C40DFCD-0DF5-47BF-91A5-C45F810B0001");
        this.setName("UniP");
        SysModelGlobal.registerSystem("com.sa.unip.srv.UniPSampleSysModel",this);
        this.initAnnotation(UniPSampleSysModel .class);
    }

    /**
     * 获取系统[UniPSample]模型对象
     * @return
     * @throws Exception
     */
    public static UniPSampleSysModel getInstance() throws Exception {
        return (UniPSampleSysModel)SysModelGlobal.getSystem(UniPSampleSysModel.class);
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        super.postConstruct();
        this.prepareCodeLists();
        this.prepareSysCounters();
        this.prepareSysValueRules();
        this.prepareDataEntities();
        this.prepareDTSQueues();
        this.prepareUniStates();
        this.prepareServiceAPIClients();
        this.prepareDEFInputTipSets();
        this.prepareViewMsgs();
        this.prepareViewMsgGroups();
        this.prepareWXAccounts();
        this.prepareWorkflows();
        this.prepareBASchemes();
        this.installPlugins(this.getUniPSamplePlugins());
    }

    /**
     * 手动安装系统
     * @throws Exception
     */
    public void install() throws Exception {
        super.postConstruct();
        this.prepareCodeLists();
        this.prepareSysCounters();
        this.prepareSysValueRules();
        this.prepareDataEntities();
        this.prepareDAOs();
        this.prepareServices();
        this.prepareDTSQueues();
        this.prepareUniStates();
        this.prepareServiceAPIClients();
        this.prepareDEFInputTipSets();
        this.prepareViewMsgs();
        this.prepareViewMsgGroups();
        this.prepareWXAccounts();
        this.prepareWorkflows();
        this.prepareBASchemes();
        this.installPlugins(this.getUniPSamplePlugins());
    }


    @Autowired(required=false)
    @Qualifier("dbDialectUniPSample")
    private IDBDialect dbDialectUniPSample;

    /**
     * 设置当前系统数据设配器
     * @param dbDialectUniPSample
     */
    public void setDBDialectUniPSample(IDBDialect dbDialectUniPSample) {
        this.dbDialectUniPSample = dbDialectUniPSample;
    }

    /**
     * 获取当前系统数据设配器
     * @return
     */
    public IDBDialect getDBDialectUniPSample() {
        return dbDialectUniPSample;
    }


    @Autowired(required=false)
    @Qualifier("sessionFactoryUniPSample")
    private SessionFactory sessionFactoryUniPSample;

    /**
     * 设置当前系统会话工厂
     * @param sessionFactoryUniPSample
     */
    public void setSessionFactoryUniPSample(SessionFactory sessionFactoryUniPSample) {
        this.sessionFactoryUniPSample = sessionFactoryUniPSample;
    }

    /**
     * 获取当前系统会话工厂
     * @return
     */
    public SessionFactory getSessionFactoryUniPSample() {
        return sessionFactoryUniPSample;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.sysmodel.SystemModelBase#getSessionFactory()
     */
    @Override
    public SessionFactory getSessionFactory() {
        if(getSessionFactoryUniPSample()==null)
            return super.getSessionFactory();
        return getSessionFactoryUniPSample();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.sysmodel.SystemModelBase#getDBDialect()
     */
    @Override
    public IDBDialect getDBDialect() {
        if(getDBDialectUniPSample()==null)
            return super.getDBDialect();
        return getDBDialectUniPSample();
    }

    /**
     * 准备系统代码表
     */
    protected void prepareCodeLists() throws Exception {
        createObject("com.sa.unip.srv.subsys.codelist.CL_MYWORKTYPECodeListModel");

        createObject("com.sa.unip.srv.codelist.CodeList16CodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList105CodeListModel");
        createObject("com.sa.unip.srv.codelist.HYLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList24CodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList88CodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_NSJGHYSQBZCodeListModel");
        createObject("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
        createObject("com.sa.unip.srv.codelist.PLPZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_CHZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.SFYFSCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_QXJSQBZCodeListModel");
        createObject("com.sa.unip.srv.codelist.PLPLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList5CodeListModel");
        createObject("com.sa.unip.srv.codelist.WFStatesCodeListModel");
        createObject("com.sa.unip.srv.codelist.ZXZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
        createObject("com.sa.unip.srv.codelist.SortDirCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_SFYDCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList58CodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
        createObject("com.sa.unip.srv.codelist.TZGGLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList20CodeListModel");
        createObject("com.sa.unip.srv.codelist.ZFFSCodeListModel");
        createObject("com.sa.unip.srv.codelist.XXZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList19CodeListModel");
        createObject("com.sa.unip.srv.codelist.CGLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.XBCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_QXJSQZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_HYSQZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.HYSSYQKCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList80CodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList71CodeListModel");
        createObject("com.sa.unip.srv.codelist.QXLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.QXJLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CYSFBSCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_CGSPSQBZCodeListModel");
        createObject("com.sa.unip.srv.codelist.CDLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList50CodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList72CodeListModel");
        createObject("com.sa.unip.srv.codelist.YesNoCodeListModel");
        createObject("com.sa.unip.srv.codelist.XXLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CLSYQKCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_GZRZLXCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList59CodeListModel");
        createObject("com.sa.unip.srv.codelist.TWLJFLCodeListModel");
        createObject("com.sa.unip.srv.codelist.XXSFYFSCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_HYSQBZCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_CGSQZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_SBWXSQZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.QYZTCodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_SBWXSQBZCodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList56CodeListModel");
        createObject("com.sa.unip.srv.codelist.CodeList97CodeListModel");
        createObject("com.sa.unip.srv.codelist.CL_NSJGHYSQZTCodeListModel");

        //初始化用户词条类别代码表
    }

    /**
     * 准备系统属性输入提示集合
     */
    protected void prepareDEFInputTipSets() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化属性输入提示集合发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统视图消息
     */
    protected void prepareViewMsgs() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化视图消息发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统视图消息组
     */
    protected void prepareViewMsgGroups() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化视图消息组发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统统一状态对象
     */
    protected void prepareUniStates() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化统一状态对象发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统分布事务处理队列
     */
    protected void prepareDTSQueues() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化分布事务处理队列发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统服务接口客户端对象
     */
    protected void prepareServiceAPIClients() {
        try {
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化系统服务接口客户端发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统计数器
     */
    protected void prepareSysCounters() throws Exception {
        try {
            ICounterHandler c0 = (ICounterHandler)createObject("com.sa.unip.srv.counter.PortalCounterHandler");
            c0.init(this);
            ICounterHandler c1 = (ICounterHandler)createObject("com.sa.unip.srv.counter.WFExpBarCounterHandler");
            c1.init(this);
            ICounterHandler c2 = (ICounterHandler)createObject("com.sa.unip.srv.counter.PCCountCounterHandler");
            c2.init(this);
            ICounterHandler c3 = (ICounterHandler)createObject("com.sa.unip.srv.counter.MobCountCounterHandler");
            c3.init(this);
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化系统计数器发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统值规则
     */
    protected void prepareSysValueRules() {
        try {
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel0 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel0.setExpression("(-?\\d+)(\\.\\d+)?");
            valueRuleModel0.setId("01bc1646c58b34db649ab16c4b8d5e60");
            valueRuleModel0.setName("浮点数");
//        valueRuleModel0.setRuleInfo("内容必须为浮点数");
            valueRuleModel0.init(this);
            this.registerSystemValueRuleModel(valueRuleModel0);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel1 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel1.setExpression("[0-9]*[1-9][0-9]*");
            valueRuleModel1.setId("0d13b22cb1bf499a6ceea57a92bedef8");
            valueRuleModel1.setName("正整数");
//        valueRuleModel1.setRuleInfo("内容必须为正整数");
            valueRuleModel1.init(this);
            this.registerSystemValueRuleModel(valueRuleModel1);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel2 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel2.setExpression("[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+");
            valueRuleModel2.setId("0ea99d804f06a71115c5a62bc28b3527");
            valueRuleModel2.setName("email地址");
//        valueRuleModel2.setRuleInfo("内容必须为电子邮件格式");
            valueRuleModel2.init(this);
            this.registerSystemValueRuleModel(valueRuleModel2);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel3 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel3.setExpression("\\d+");
            valueRuleModel3.setId("3268e77dd7a4a4b05530bebec4f46c50");
            valueRuleModel3.setName("非负整数（正整数 + 0）");
//        valueRuleModel3.setRuleInfo("内容必须为非负整数（正整数 + 0）");
            valueRuleModel3.init(this);
            this.registerSystemValueRuleModel(valueRuleModel3);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel4 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel4.setExpression("((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\\\d{8}");
            valueRuleModel4.setId("5A9B9DAB-7504-4C65-93A7-1489865DF7AD");
            valueRuleModel4.setName("电话号码");
//        valueRuleModel4.setRuleInfo("内容必须为电话号码格式");
            valueRuleModel4.init(this);
            this.registerSystemValueRuleModel(valueRuleModel4);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel5 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel5.setExpression("[A-Za-z0-9]+");
            valueRuleModel5.setId("6e404aa8db594e2f28a5852a7cdad0e8");
            valueRuleModel5.setName("由数字和26个英文字母组成的字符串");
//        valueRuleModel5.setRuleInfo("内容必须由数字和26个英文字母组成的字符串");
            valueRuleModel5.init(this);
            this.registerSystemValueRuleModel(valueRuleModel5);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel6 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel6.setExpression("[A-Z]+");
            valueRuleModel6.setId("8016fd5dea62b7ca19148a61e566b9d3");
            valueRuleModel6.setName("由26个英文字母的大写组成的字符串");
//        valueRuleModel6.setRuleInfo("内容必须由26个英文字母的大写组成的字符串");
            valueRuleModel6.init(this);
            this.registerSystemValueRuleModel(valueRuleModel6);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel7 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel7.setExpression("\\w+");
            valueRuleModel7.setId("84edfd10899f07328ee6438ffacf8143");
            valueRuleModel7.setName("由数字、26个英文字母或者下划线组成的字符串");
//        valueRuleModel7.setRuleInfo("内容必须由数字、26个英文字母或者下划线组成的字符串");
            valueRuleModel7.init(this);
            this.registerSystemValueRuleModel(valueRuleModel7);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel8 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel8.setExpression("((-\\d+(\\.\\d+)?)|(0+(\\.0+)?))+");
            valueRuleModel8.setId("8a59008054e727cb36eb10e6b864d900");
            valueRuleModel8.setName("非正浮点数（负浮点数 + 0）");
//        valueRuleModel8.setRuleInfo("内容必须为非正浮点数（负浮点数 + 0）");
            valueRuleModel8.init(this);
            this.registerSystemValueRuleModel(valueRuleModel8);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel9 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel9.setExpression("[a-zA-Z_$][a-zA-Z0-9_$]*");
            valueRuleModel9.setId("97841f956bba437825ae258442aeb496");
            valueRuleModel9.setName("代码名称");
//        valueRuleModel9.setRuleInfo("内容必须为字符及数字组成，且开始必须为字符。");
            valueRuleModel9.init(this);
            this.registerSystemValueRuleModel(valueRuleModel9);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel10 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel10.setExpression("((-\\d+)|(0+))+");
            valueRuleModel10.setId("97e9883ae7e261976a128b79c60d6871");
            valueRuleModel10.setName("非正整数（负整数 + 0）");
//        valueRuleModel10.setRuleInfo("内容必须为正整数（负整数 + 0）");
            valueRuleModel10.init(this);
            this.registerSystemValueRuleModel(valueRuleModel10);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel11 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel11.setExpression("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");
            valueRuleModel11.setId("99650333-BE4B-4E36-9E0C-A1B0CD984387");
            valueRuleModel11.setName("身份证号码");
//        valueRuleModel11.setRuleInfo("内容必须填身份证");
            valueRuleModel11.init(this);
            this.registerSystemValueRuleModel(valueRuleModel11);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel12 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel12.setExpression("(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))+");
            valueRuleModel12.setId("9c5f80f095330c696cec98766e567bce");
            valueRuleModel12.setName("正浮点数");
//        valueRuleModel12.setRuleInfo("内容必须为正浮点数");
            valueRuleModel12.init(this);
            this.registerSystemValueRuleModel(valueRuleModel12);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel13 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel13.setExpression("-?\\d+");
            valueRuleModel13.setId("a8804f3a519c547bfb7a2d76bc4b0c1d");
            valueRuleModel13.setName("整数");
//        valueRuleModel13.setRuleInfo("内容必须为整数");
            valueRuleModel13.init(this);
            this.registerSystemValueRuleModel(valueRuleModel13);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel14 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel14.setExpression("[A-Za-z]+");
            valueRuleModel14.setId("b436b7b8f20944fe85a0450feb9b6144");
            valueRuleModel14.setName("由26个英文字母组成的字符串");
//        valueRuleModel14.setRuleInfo("内容必须为26个英文字母组成的字符串");
            valueRuleModel14.init(this);
            this.registerSystemValueRuleModel(valueRuleModel14);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel15 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel15.setExpression("[a-z]+");
            valueRuleModel15.setId("b7228b9943dc4d881c722406dda53537");
            valueRuleModel15.setName("由26个英文字母的小写组成的字符串");
//        valueRuleModel15.setRuleInfo("内容必须为26个英文字母的小写组成的字符串");
            valueRuleModel15.init(this);
            this.registerSystemValueRuleModel(valueRuleModel15);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel16 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel16.setExpression("-[0-9]*[1-9][0-9]*");
            valueRuleModel16.setId("c146a1ccac246c50ef999f17e8bf4c38");
            valueRuleModel16.setName("负整数");
//        valueRuleModel16.setRuleInfo("内容必须为负整数");
            valueRuleModel16.init(this);
            this.registerSystemValueRuleModel(valueRuleModel16);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel17 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel17.setExpression("(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))+");
            valueRuleModel17.setId("c6aaa542c20b9ecf01c6f1087922b9c4");
            valueRuleModel17.setName("负浮点数");
//        valueRuleModel17.setRuleInfo("内容必须为负浮点数");
            valueRuleModel17.init(this);
            this.registerSystemValueRuleModel(valueRuleModel17);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel18 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel18.setExpression("[^\\\\\\/\\:\\*\\?\\\"\\<\\>\\|]+(\\[^\\\\\\/\\:\\*\\?\\\"\\<\\>\\|]+)*");
            valueRuleModel18.setId("dc01ec15e5c043ac869c18a5d93dfbd8");
            valueRuleModel18.setName("文件名称");
//        valueRuleModel18.setRuleInfo("内容不能包括/、\\、?、*、<、>、:");
            valueRuleModel18.init(this);
            this.registerSystemValueRuleModel(valueRuleModel18);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel19 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel19.setExpression("\\d+(\\.\\d+)?");
            valueRuleModel19.setId("f8290b8fc83f51573a4c02112463363c");
            valueRuleModel19.setName("非负浮点数（正浮点数 + 0）");
//        valueRuleModel19.setRuleInfo("内容必须为非负浮点数（正浮点数 + 0）");
            valueRuleModel19.init(this);
            this.registerSystemValueRuleModel(valueRuleModel19);
            net.ibizsys.paas.sysmodel.util.RegExValueRuleModel valueRuleModel20 = new net.ibizsys.paas.sysmodel.util.RegExValueRuleModel();
            valueRuleModel20.setExpression("[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?");
            valueRuleModel20.setId("fb7e8feea11f2c49e548e3a43f9a64d8");
            valueRuleModel20.setName("URL");
//        valueRuleModel20.setRuleInfo("内容必须为有效URL格式");
            valueRuleModel20.init(this);
            this.registerSystemValueRuleModel(valueRuleModel20);
        } catch(Exception ex) {
            log.error(StringHelper.format("初始化系统值规则发生异常，%1$s",ex.getMessage()),ex);
        }
    }

    /**
     * 准备系统实体
     */
    protected void prepareDataEntities() throws Exception {

        createObject("com.sa.unip.srv.subsys.demodel.WFWorkListDEModel");
        createObject("com.sa.unip.srv.subsys.demodel.OrgSectorDEModel");
        createObject("com.sa.unip.srv.subsys.demodel.OrgUserDEModel");
        createObject("com.sa.unip.srv.subsys.demodel.OrgDEModel");

        createObject("com.sa.unip.srv.ywsp.demodel.DemoDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.OA_XXDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPMEMBERDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_CONFIGDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_COMMENTDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_ARTICLEDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_CIMSESSIONDEModel");
        createObject("com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_USERDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_SEQUENCEDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel");
        createObject("com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_BOTTLEDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_MOMENTRULEDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_SUBSCRIBERDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_YCSQDEModel");
        createObject("com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_ORGANIZATIONDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_PUBLICACCOUNTDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel");
        createObject("com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_MESSAGEDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_MANAGERDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_YYSSQDEModel");
        createObject("com.sa.unip.srv.jcsj.demodel.OA_CLDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
        createObject("com.sa.unip.srv.ggsj.demodel.GG_DBDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.LVXIN_PUBLICMENUDEModel");
        createObject("com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel");
        createObject("com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel");
        createObject("com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel");

        IDataEntityModel _DemoDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.DemoDEModel.class);
        IDataEntityModel _SystemDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.SystemDEModel.class);
        IDataEntityModel _WFUserCandidateDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUserCandidateDEModel.class);
        IDataEntityModel _OA_XXDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.OA_XXDEModel.class);
        IDataEntityModel _UniResDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UniResDEModel.class);
        IDataEntityModel _LVXIN_GROUPMEMBERDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPMEMBERDEModel.class);
        IDataEntityModel _DEDataChg2DEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DEDataChg2DEModel.class);
        IDataEntityModel _OA_XMJDDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_XMJDDEModel.class);
        IDataEntityModel _WFStepDataDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFStepDataDEModel.class);
        IDataEntityModel _SysAdminDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.SysAdminDEModel.class);
        IDataEntityModel _LVXIN_CONFIGDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_CONFIGDEModel.class);
        IDataEntityModel _UserRoleDataDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDataDetailDEModel.class);
        IDataEntityModel _WXEntAppDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel.class);
        IDataEntityModel _DEDataChgDispDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DEDataChgDispDEModel.class);
        IDataEntityModel _TSSDTaskTypeDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDTaskTypeDEModel.class);
        IDataEntityModel _PVPartDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.PVPartDEModel.class);
        IDataEntityModel _DataAuditDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataAuditDEModel.class);
        IDataEntityModel _LVXIN_COMMENTDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_COMMENTDEModel.class);
        IDataEntityModel _OA_PCSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel.class);
        IDataEntityModel _LVXIN_ARTICLEDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_ARTICLEDEModel.class);
        IDataEntityModel _LVXIN_CIMSESSIONDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_CIMSESSIONDEModel.class);
        IDataEntityModel _WFWorkListDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.subsys.demodel.WFWorkListDEModel.class);
        IDataEntityModel _UserRoleResDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleResDEModel.class);
        IDataEntityModel _RegistryDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.RegistryDEModel.class);
        IDataEntityModel _UserRoleDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel.class);
        IDataEntityModel _TSSDTaskPolicyDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDTaskPolicyDEModel.class);
        IDataEntityModel _OA_FLFGDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel.class);
        IDataEntityModel _TSSDPolicyOwnerDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDPolicyOwnerDEModel.class);
        IDataEntityModel _UserRoleDEFieldDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDEFieldDEModel.class);
        IDataEntityModel _TSSDGroupDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel.class);
        IDataEntityModel _LVXIN_USERDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_USERDEModel.class);
        IDataEntityModel _WFUserGroupDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDetailDEModel.class);
        IDataEntityModel _LVXIN_SEQUENCEDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_SEQUENCEDEModel.class);
        IDataEntityModel _WFCustomProcessDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFCustomProcessDEModel.class);
        IDataEntityModel _OA_GZRZDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel.class);
        IDataEntityModel _UserDictCatDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserDictCatDEModel.class);
        IDataEntityModel _APIXTFJLJDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ggsj.demodel.APIXTFJLJDEModel.class);
        IDataEntityModel _LoginLogDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.LoginLogDEModel.class);
        IDataEntityModel _TSSDItemDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDItemDEModel.class);
        IDataEntityModel _OA_JPYDDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_JPYDDEModel.class);
        IDataEntityModel _SysAdminFuncDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.SysAdminFuncDEModel.class);
        IDataEntityModel _TSSDTaskDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDTaskDEModel.class);
        IDataEntityModel _WFUserAssistDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUserAssistDEModel.class);
        IDataEntityModel _WFIAActionDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFIAActionDEModel.class);
        IDataEntityModel _WXAccessTokenDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXAccessTokenDEModel.class);
        IDataEntityModel _OA_SBWXDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel.class);
        IDataEntityModel _LVXIN_BOTTLEDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_BOTTLEDEModel.class);
        IDataEntityModel _LVXIN_MOMENTRULEDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_MOMENTRULEDEModel.class);
        IDataEntityModel _UserRoleDataActionDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDataActionDEModel.class);
        IDataEntityModel _OrgTypeDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.OrgTypeDEModel.class);
        IDataEntityModel _OA_CHRYDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel.class);
        IDataEntityModel _UserDGThemeDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserDGThemeDEModel.class);
        IDataEntityModel _DALogDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DALogDEModel.class);
        IDataEntityModel _OrgSectorDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.subsys.demodel.OrgSectorDEModel.class);
        IDataEntityModel _UserRoleDatasDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel.class);
        IDataEntityModel _MsgSendQueueDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.MsgSendQueueDEModel.class);
        IDataEntityModel _LVXIN_SUBSCRIBERDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_SUBSCRIBERDEModel.class);
        IDataEntityModel _WFAssistWorkDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFAssistWorkDEModel.class);
        IDataEntityModel _QueryModelDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.demodel.demodel.QueryModelDEModel.class);
        IDataEntityModel _OA_YCSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_YCSQDEModel.class);
        IDataEntityModel _UserRoleDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDetailDEModel.class);
        IDataEntityModel _UserRoleDataDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDataDEModel.class);
        IDataEntityModel _UserRoleDEFieldsDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleDEFieldsDEModel.class);
        IDataEntityModel _WFWorkflowDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFWorkflowDEModel.class);
        IDataEntityModel _MsgSendQueueHisDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel.class);
        IDataEntityModel _DataSyncIn2DEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataSyncIn2DEModel.class);
        IDataEntityModel _OA_HYSDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.jcsj.demodel.OA_HYSDEModel.class);
        IDataEntityModel _DataAuditDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataAuditDetailDEModel.class);
        IDataEntityModel _TSSDPolicyDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDPolicyDEModel.class);
        IDataEntityModel _OA_QXJDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel.class);
        IDataEntityModel _LVXIN_ORGANIZATIONDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_ORGANIZATIONDEModel.class);
        IDataEntityModel _WFActorDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFActorDEModel.class);
        IDataEntityModel _CodeListDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.CodeListDEModel.class);
        IDataEntityModel _MsgTemplateDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.MsgTemplateDEModel.class);
        IDataEntityModel _UserDictItemDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel.class);
        IDataEntityModel _UserRoleTypeDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserRoleTypeDEModel.class);
        IDataEntityModel _LVXIN_PUBLICACCOUNTDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_PUBLICACCOUNTDEModel.class);
        IDataEntityModel _OA_CGSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel.class);
        IDataEntityModel _WXAccountDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXAccountDEModel.class);
        IDataEntityModel _DataSyncInDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataSyncInDEModel.class);
        IDataEntityModel _CodeItemDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.CodeItemDEModel.class);
        IDataEntityModel _OA_CPMJSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel.class);
        IDataEntityModel _TSSDEngineDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDEngineDEModel.class);
        IDataEntityModel _WFUCPolicyDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUCPolicyDEModel.class);
        IDataEntityModel _WFStepActorDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFStepActorDEModel.class);
        IDataEntityModel _WFActionDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFActionDEModel.class);
        IDataEntityModel _OA_RZRYDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel.class);
        IDataEntityModel _WFUIWizardDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUIWizardDEModel.class);
        IDataEntityModel _OA_CZRZDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel.class);
        IDataEntityModel _WFStepDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFStepDEModel.class);
        IDataEntityModel _LVXIN_MESSAGEDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_MESSAGEDEModel.class);
        IDataEntityModel _OA_STWMDGDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel.class);
        IDataEntityModel _UserGroupDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserGroupDetailDEModel.class);
        IDataEntityModel _LVXIN_GROUPDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_GROUPDEModel.class);
        IDataEntityModel _WFAppSettingDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFAppSettingDEModel.class);
        IDataEntityModel _OA_CCSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel.class);
        IDataEntityModel _LVXIN_MANAGERDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_MANAGERDEModel.class);
        IDataEntityModel _WXOrgSectorDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXOrgSectorDEModel.class);
        IDataEntityModel _DataSyncOut2DEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel.class);
        IDataEntityModel _WXMediaDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXMediaDEModel.class);
        IDataEntityModel _OA_YYSSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_YYSSQDEModel.class);
        IDataEntityModel _WFSystemUserDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFSystemUserDEModel.class);
        IDataEntityModel _ServiceDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.ServiceDEModel.class);
        IDataEntityModel _MsgAccountDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.MsgAccountDetailDEModel.class);
        IDataEntityModel _WFVersionDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFVersionDEModel.class);
        IDataEntityModel _UserDictDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserDictDEModel.class);
        IDataEntityModel _OA_CLDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.jcsj.demodel.OA_CLDEModel.class);
        IDataEntityModel _DEDataChgDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DEDataChgDEModel.class);
        IDataEntityModel _PortalPageDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.PortalPageDEModel.class);
        IDataEntityModel _OA_NSJGHYSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel.class);
        IDataEntityModel _LoginAccountDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.LoginAccountDEModel.class);
        IDataEntityModel _GG_DBDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ggsj.demodel.GG_DBDEModel.class);
        IDataEntityModel _UserDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserDEModel.class);
        IDataEntityModel _OrgUnitCatDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.OrgUnitCatDEModel.class);
        IDataEntityModel _OA_YBHYSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel.class);
        IDataEntityModel _OA_CLWXDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel.class);
        IDataEntityModel _OrgSecUserDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.OrgSecUserDEModel.class);
        IDataEntityModel _TSSDGroupDetailDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDGroupDetailDEModel.class);
        IDataEntityModel _OrgUserLevelDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.OrgUserLevelDEModel.class);
        IDataEntityModel _FileDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.FileDEModel.class);
        IDataEntityModel _WFDynamicUserDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFDynamicUserDEModel.class);
        IDataEntityModel _PPModelDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.PPModelDEModel.class);
        IDataEntityModel _TSSDTaskLogDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.TSSDTaskLogDEModel.class);
        IDataEntityModel _WFUserDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel.class);
        IDataEntityModel _DataSyncOutDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataSyncOutDEModel.class);
        IDataEntityModel _OA_TZGGDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel.class);
        IDataEntityModel _OA_XXRYDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel.class);
        IDataEntityModel _UserGroupDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserGroupDEModel.class);
        IDataEntityModel _UserObjectDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel.class);
        IDataEntityModel _WFTmpStepActorDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFTmpStepActorDEModel.class);
        IDataEntityModel _LVXIN_PUBLICMENUDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.LVXIN_PUBLICMENUDEModel.class);
        IDataEntityModel _DataEntityDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.demodel.demodel.DataEntityDEModel.class);
        IDataEntityModel _MsgAccountDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.MsgAccountDEModel.class);
        IDataEntityModel _DataSyncAgentDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.DataSyncAgentDEModel.class);
        IDataEntityModel _OA_BGYPSQDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel.class);
        IDataEntityModel _WFInstanceDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFInstanceDEModel.class);
        IDataEntityModel _WXMessageDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wx.demodel.WXMessageDEModel.class);
        IDataEntityModel _WFUserGroupDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel.class);
        IDataEntityModel _OrgUserDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.subsys.demodel.OrgUserDEModel.class);
        _OrgUserDEModel.registerDEActionLogic("UPDATE","BEFORE","API_XT_FJLJ","UpdateOrgUserExInfo");
        _OrgUserDEModel.registerDEActionLogic("UPDATE","AFTER","API_XT_FJLJ","ProxyOrgUser2LoginAccount");
        _OrgUserDEModel.registerDEActionLogic("CREATE","BEFORE","API_XT_FJLJ","AddOrgUserExInfo");
        _OrgUserDEModel.registerDEActionLogic("CREATE","AFTER","API_XT_FJLJ","ProxyOrgUser2LoginAccount");
        IDataEntityModel _OrgSecUserTypeDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.common.demodel.OrgSecUserTypeDEModel.class);
        IDataEntityModel _OA_ZSKDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel.class);
        IDataEntityModel _WFStepInstDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFStepInstDEModel.class);
        IDataEntityModel _WFReminderDEModel = DEModelGlobal.getDEModel(net.ibizsys.psrt.srv.wf.demodel.WFReminderDEModel.class);
        IDataEntityModel _OrgDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.subsys.demodel.OrgDEModel.class);
        IDataEntityModel _OA_TZGGRYDEModel = DEModelGlobal.getDEModel(com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel.class);

    }

    /**
     * 准备系统实体服务对象
     */
    protected void prepareServices() throws Exception {

        createObject2("com.sa.unip.srv.subsys.service.WFWorkListService");
        createObject2("com.sa.unip.srv.subsys.service.OrgSectorService");
        createObject2("com.sa.unip.srv.subsys.service.OrgUserService");
        createObject2("com.sa.unip.srv.subsys.service.OrgService");

        createObject2("com.sa.unip.srv.ywsp.service.DemoService");
        createObject2("com.sa.unip.srv.xxtz.service.OA_XXService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_GROUPMEMBERService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_XMJDService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_CONFIGService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_COMMENTService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_PCSQService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_ARTICLEService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_CIMSESSIONService");
        createObject2("com.sa.unip.srv.jcsj.service.OA_FLFGService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_USERService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_SEQUENCEService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_GZRZService");
        createObject2("com.sa.unip.srv.ggsj.service.APIXTFJLJService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_JPYDService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_SBWXService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_BOTTLEService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_MOMENTRULEService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_CHRYService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_SUBSCRIBERService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_YCSQService");
        createObject2("com.sa.unip.srv.jcsj.service.OA_HYSService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_QXJService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_ORGANIZATIONService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_PUBLICACCOUNTService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_CGSQService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_CPMJSQService");
        createObject2("com.sa.unip.srv.xxtz.service.OA_RZRYService");
        createObject2("com.sa.unip.srv.xtgl.service.OA_CZRZService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_MESSAGEService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_STWMDGService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_GROUPService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_CCSQService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_MANAGERService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_YYSSQService");
        createObject2("com.sa.unip.srv.jcsj.service.OA_CLService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService");
        createObject2("com.sa.unip.srv.ggsj.service.GG_DBService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_YBHYSQService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_CLWXService");
        createObject2("com.sa.unip.srv.xxtz.service.OA_TZGGService");
        createObject2("com.sa.unip.srv.xxtz.service.OA_XXRYService");
        createObject2("com.sa.unip.srv.xxtz.service.LVXIN_PUBLICMENUService");
        createObject2("com.sa.unip.srv.ywsp.service.OA_BGYPSQService");
        createObject2("com.sa.unip.srv.jcsj.service.OA_ZSKService");
        createObject2("com.sa.unip.srv.xxtz.service.OA_TZGGRYService");
    }

    /**
     * 准备系统实体数据访问对象
     */
    protected void prepareDAOs() throws Exception {
        createObject2("com.sa.unip.srv.ywsp.dao.DemoDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.OA_XXDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_GROUPMEMBERDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_XMJDDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_CONFIGDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_COMMENTDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_PCSQDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_ARTICLEDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_CIMSESSIONDAO");
        createObject2("com.sa.unip.srv.jcsj.dao.OA_FLFGDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_USERDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_SEQUENCEDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_GZRZDAO");
        createObject2("com.sa.unip.srv.ggsj.dao.APIXTFJLJDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_JPYDDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_SBWXDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_BOTTLEDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_MOMENTRULEDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_CHRYDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_SUBSCRIBERDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_YCSQDAO");
        createObject2("com.sa.unip.srv.jcsj.dao.OA_HYSDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_QXJDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_ORGANIZATIONDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_PUBLICACCOUNTDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_CGSQDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_CPMJSQDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.OA_RZRYDAO");
        createObject2("com.sa.unip.srv.xtgl.dao.OA_CZRZDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_MESSAGEDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_STWMDGDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_GROUPDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_CCSQDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_MANAGERDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_YYSSQDAO");
        createObject2("com.sa.unip.srv.jcsj.dao.OA_CLDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_NSJGHYSQDAO");
        createObject2("com.sa.unip.srv.ggsj.dao.GG_DBDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_YBHYSQDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_CLWXDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.OA_TZGGDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.OA_XXRYDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.LVXIN_PUBLICMENUDAO");
        createObject2("com.sa.unip.srv.ywsp.dao.OA_BGYPSQDAO");
        createObject2("com.sa.unip.srv.jcsj.dao.OA_ZSKDAO");
        createObject2("com.sa.unip.srv.xxtz.dao.OA_TZGGRYDAO");
    }

    /**
     * 准备系统工作流模型
     */
    protected void prepareWorkflows() throws Exception {

        createObject("com.sa.unip.srv.workflow.XXYHZWFRoleModel");

        createObject("com.sa.unip.srv.workflow.NSJGHYSQWFModel");
        createObject("com.sa.unip.srv.workflow.TXGGSQWFModel");
        createObject("com.sa.unip.srv.workflow.STWMDGLCWFModel");
        createObject("com.sa.unip.srv.workflow.JPYDLCWFModel");
        createObject("com.sa.unip.srv.workflow.YBHYSQWFModel");
        createObject("com.sa.unip.srv.workflow.QXJLCWFModel");
        createObject("com.sa.unip.srv.workflow.CCSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.YYSSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.PCSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.YCSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.CPMJSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.CGSQLCWFModel");
        createObject("com.sa.unip.srv.workflow.BGYPSLLCWFModel");
        createObject("com.sa.unip.srv.workflow.RZTJLCWFModel");
        createObject("com.sa.unip.srv.workflow.SBWXLCWFModel");
        createObject("com.sa.unip.srv.workflow.DEMOLCWFModel");
        createObject("com.sa.unip.srv.workflow.CLWXLCWFModel");
    }

    /**
     * 准备大数据架构模型
     */
    protected void prepareBASchemes() throws Exception {
    }

    /**
     * 准备微信公众号
     */
    protected void prepareWXAccounts() throws Exception {
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.sysmodel.SystemModelBase#onInstallRTDatas()
     */
    @Override
    protected void onInstallRTDatas() throws Exception {
        super.onInstallRTDatas();

        net.ibizsys.psrt.srv.common.service.UserDictCatService userDictCatService  = (net.ibizsys.psrt.srv.common.service.UserDictCatService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserDictCatService.class);
        net.ibizsys.psrt.srv.common.service.UserDictService userDictService  = (net.ibizsys.psrt.srv.common.service.UserDictService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserDictService.class);
        net.ibizsys.psrt.srv.common.service.UniResService uniResService  = (net.ibizsys.psrt.srv.common.service.UniResService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UniResService.class);
        net.ibizsys.psrt.srv.common.service.MsgTemplateService msgTemplateService  = (net.ibizsys.psrt.srv.common.service.MsgTemplateService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.MsgTemplateService.class);
        net.ibizsys.psrt.srv.common.service.ServiceService serviceService  = (net.ibizsys.psrt.srv.common.service.ServiceService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.ServiceService.class);
        net.ibizsys.psrt.srv.wf.service.WFAppSettingService wfAppSettingService  = (net.ibizsys.psrt.srv.wf.service.WFAppSettingService)ServiceGlobal.getService(net.ibizsys.psrt.srv.wf.service.WFAppSettingService.class);
        net.ibizsys.psrt.srv.common.service.DataSyncAgentService dataSyncAgentService  = (net.ibizsys.psrt.srv.common.service.DataSyncAgentService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.DataSyncAgentService.class);
        net.ibizsys.psrt.srv.wx.service.WXAccountService wxAccountService  = (net.ibizsys.psrt.srv.wx.service.WXAccountService)ServiceGlobal.getService(net.ibizsys.psrt.srv.wx.service.WXAccountService.class);
        net.ibizsys.psrt.srv.wx.service.WXEntAppService wxEntAppService  = (net.ibizsys.psrt.srv.wx.service.WXEntAppService)ServiceGlobal.getService(net.ibizsys.psrt.srv.wx.service.WXEntAppService.class);

        onInstallRTDatas_DataEntity();

        //初始化用户词条类别

        //初始化系统统一资源
        //统一资源 新建按钮控制
        if(true) {
            net.ibizsys.psrt.srv.common.entity.UniRes uniRes = new net.ibizsys.psrt.srv.common.entity.UniRes();
            uniRes.setUniResId("4A0F05CF-4DA1-43BB-B131-1175A707B4E2");
            uniRes.setUniResName("新建按钮控制");
            uniRes.setUniResType("CUSTOM");
            uniRes.setResourceId("XJANKZ");
            if(uniResService.checkKey(uniRes)==IService.CHECKKEYSTATE_OK) {
                uniResService.create(uniRes,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),uniResService.getDEModel().getLogicName(),uniResService.getDEModel().getDataInfo(uniRes)));
            } else {
                uniResService.update(uniRes,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]更新[%2$s][%3$s]\r\n",this.getName(),uniResService.getDEModel().getLogicName(),uniResService.getDEModel().getDataInfo(uniRes)));
            }
        }

        //初始化系统消息模板
        //消息模板 内设机构会议_负责人审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("0C8F3656-DA80-4300-B2FD-043AE7016708");
            msgTemplate.setMsgTemplateName("内设机构会议_负责人审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_NSJGHYSQID')}|srfdeid=OA_NSJGHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：内设机构会议<${data.get('OA_NSJGHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 车牌门禁申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("17EDA567-B1B3-4BA4-992E-1F605D77B129");
            msgTemplate.setMsgTemplateName("车牌门禁申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CPMJSQID')}|srfdeid=OA_CPMJSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CPMJSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 设备维修_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("1C04D3DA-8056-4F55-B6C4-C49BD15FE15B");
            msgTemplate.setMsgTemplateName("设备维修_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_SBWXID')}|srfdeid=OA_SBWX");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_SBWXNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 采购申请_计财负责人审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("1D4421CA-15AB-490D-ACF9-F6846236C1DE");
            msgTemplate.setMsgTemplateName("采购申请_计财负责人审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CGSQID')}|srfdeid=OA_CGSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CGSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 食堂外卖订购_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("1D5FBF6F-C67E-4E4F-B484-38A5B2F14769");
            msgTemplate.setMsgTemplateName("食堂外卖订购_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_STWMDGID')}|srfdeid=OA_STWMDG");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_STWMDGNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 饮用水申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("1E43F7B5-1019-470D-BB97-68EF051BAC11");
            msgTemplate.setMsgTemplateName("饮用水申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_YYSSQID')}|srfdeid=OA_YYSSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_YYSSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 用餐申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("21A1AFF9-B085-443D-9F4C-55ECF22F22CF");
            msgTemplate.setMsgTemplateName("用餐申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_YCSQID')}|srfdeid=OA_YCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_YCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 机票预定_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("25CB60EF-F415-49A9-A436-F4500E87548E");
            msgTemplate.setMsgTemplateName("机票预定_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_JPYDID')}|srfdeid=OA_JPYD");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_JPYDNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 会议_会议室申请
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("300C3033-1B3A-4336-8994-D39C6030E33D");
            msgTemplate.setMsgTemplateName("会议_会议室申请");
            msgTemplate.setSubject("srfkey=${data.get('oa_ybhysqid')}|srfdeid=OA_YBHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：会议<${data.get('OA_YBHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 采购申请_部门申报审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("375C061D-C7B0-46EE-9723-92F446508BF8");
            msgTemplate.setMsgTemplateName("采购申请_部门申报审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CGSQID')}|srfdeid=OA_CGSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CGSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 出差申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("43CD78C8-53EA-4D4E-A8AD-F7C98840EBA5");
            msgTemplate.setMsgTemplateName("出差申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CCSQID')}|srfdeid=OA_CCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 通用消息模板_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("471EECDD-F0DF-40F9-BD71-5DA7F6C49662");
            msgTemplate.setMsgTemplateName("通用消息模板_部门领导审核");
            msgTemplate.setSubject("");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("部门领导审核消息");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 会议_参会情况通报
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("49567625-AE2B-4EF3-94C8-4A3AEE99AFEB");
            msgTemplate.setMsgTemplateName("会议_参会情况通报");
            msgTemplate.setSubject("srfkey=${data.get('oa_ybhysqid')}|srfdeid=OA_YBHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：会议<${data.get('OA_YBHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 办公用品申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("4ACCE2EA-5EA2-4940-86E8-BC30027AC393");
            msgTemplate.setMsgTemplateName("办公用品申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_BGYPSQID')}|srfdeid=OA_BGYPSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_BGYPSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 日志提交_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("505A824D-F39E-49CA-87D0-A5B86394D11E");
            msgTemplate.setMsgTemplateName("日志提交_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_GZRZID')}|srfdeid=OA_GZRZ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_GZRZNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 饮用水申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("5543B30A-47B2-42F7-BDA1-1D8042AC3C71");
            msgTemplate.setMsgTemplateName("饮用水申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_YYSSQID')}|srfdeid=OA_YYSSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_YYSSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 内设机构会议_参会领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("5999C3C1-A790-4D73-95B4-1E893137AD97");
            msgTemplate.setMsgTemplateName("内设机构会议_参会领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_NSJGHYSQID')}|srfdeid=OA_NSJGHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：内设机构会议<${data.get('OA_NSJGHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 会议_编制座位图
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("5CD82984-321C-4ACE-AFF7-26983C4A10BF");
            msgTemplate.setMsgTemplateName("会议_编制座位图");
            msgTemplate.setSubject("srfkey=${data.get('oa_ybhysqid')}|srfdeid=OA_YBHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：会议<${data.get('OA_YBHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 机票预定_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("60A67EA7-DA1D-4057-84D8-E6B3AD8F4960");
            msgTemplate.setMsgTemplateName("机票预定_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_JPYDID')}|srfdeid=OA_JPYD");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_JPYDNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 工作流通用消息模板
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("61AD12B4-A5C3-4229-88D4-84293267201F");
            msgTemplate.setMsgTemplateName("工作流通用消息模板");
            msgTemplate.setSubject("待办事项");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("部门领导审核消息");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 内设机构会议_秘书处审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("61F104C5-DE11-4E2C-B04E-FCA1DEF50693");
            msgTemplate.setMsgTemplateName("内设机构会议_秘书处审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_NSJGHYSQID')}|srfdeid=OA_NSJGHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：内设机构会议<${data.get('OA_NSJGHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 请休假审批_干部处备案审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("674D1312-C94F-46FE-8227-8EEF41B79F2E");
            msgTemplate.setMsgTemplateName("请休假审批_干部处备案审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_QXJID')}|srfdeid=OA_QXJ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_QXJNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 车辆维修申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("6D6ECD87-B764-405D-B11C-A032047D59AF");
            msgTemplate.setMsgTemplateName("车辆维修申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CLWXID')}|srfdeid=OA_CLWX");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CLWXNAME')}>需要您审核");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 采购申请_分管院领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("75C23ED1-23E7-400C-ACE9-45E895033F02");
            msgTemplate.setMsgTemplateName("采购申请_分管院领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CGSQID')}|srfdeid=OA_CGSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CGSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 待办消息模板
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("7D83ABE0-AE81-4B67-9953-DA00E35C3453");
            msgTemplate.setMsgTemplateName("待办消息模板");
            msgTemplate.setSubject("待办事项");
            msgTemplate.setContentType("HTML");
            msgTemplate.setContent("www.baidu.com");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 通知公告模板_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("80FDD25D-07A0-439A-B843-1F680811223D");
            msgTemplate.setMsgTemplateName("通知公告模板_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_TZGGID')}|srfdeid=OA_TZGG");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：公告<${data.get('OA_TZGGNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 内设机构会议_承办处室负责人审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("943056B8-6F3F-4FC8-BF1D-660FB9EC7ACF");
            msgTemplate.setMsgTemplateName("内设机构会议_承办处室负责人审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_NSJGHYSQID')}|srfdeid=OA_NSJGHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：内设机构会议<${data.get('OA_NSJGHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 会议_参会人员对号入座
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("94E3D35D-EC89-498B-B065-29EA75E07490");
            msgTemplate.setMsgTemplateName("会议_参会人员对号入座");
            msgTemplate.setSubject("srfkey=${data.get('oa_ybhysqid')}|srfdeid=OA_YBHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：会议<${data.get('OA_YBHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 会议_各单位反馈参会名单
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("97D71989-4B3C-49C2-B981-5A220F35D6E8");
            msgTemplate.setMsgTemplateName("会议_各单位反馈参会名单");
            msgTemplate.setSubject("srfkey=${data.get('oa_ybhysqid')}|srfdeid=OA_YBHYSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：会议<${data.get('OA_YBHYSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 派车申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("AE6C1312-05A2-40A9-81B4-197C7E7B2D6D");
            msgTemplate.setMsgTemplateName("派车申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_PCSQID')}|srfdeid=OA_PCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_PCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 车辆维修申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("B1B4FE1A-4502-4164-9D8E-22D92809003C");
            msgTemplate.setMsgTemplateName("车辆维修申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CLWXID')}|srfdeid=OA_CLWX");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CLWXNAME')}>需要您审核");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 采购申请_固定资产相关人员审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("B2CFCC4E-4AAA-45B2-B84D-4CF40C9D063E");
            msgTemplate.setMsgTemplateName("采购申请_固定资产相关人员审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CGSQID')}|srfdeid=OA_CGSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CGSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 采购申请_部门负责人审
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("BA194EF6-ED36-48DA-8241-94D7D4C7267F");
            msgTemplate.setMsgTemplateName("采购申请_部门负责人审");
            msgTemplate.setSubject("srfkey=${data.get('OA_CGSQID')}|srfdeid=OA_CGSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CGSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 用餐申请_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("BDEDDF0D-00C6-4AC4-BB7E-468BE53D74FA");
            msgTemplate.setMsgTemplateName("用餐申请_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_YCSQID')}|srfdeid=OA_YCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_YCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 待办消息模板2
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("CF297B86-2E41-4AEF-BC21-1CE92C1615E2");
            msgTemplate.setMsgTemplateName("待办消息模板2");
            msgTemplate.setSubject("待办事项2");
            msgTemplate.setContentType("HTML");
            msgTemplate.setContent("www.baidu.com");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 出差申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("D7EA15F6-4DF8-4401-A00F-F2345A3BB81A");
            msgTemplate.setMsgTemplateName("出差申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CCSQID')}|srfdeid=OA_CCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 派车申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("DA5F0432-0AE6-47E6-A76C-984731AE12F1");
            msgTemplate.setMsgTemplateName("派车申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_PCSQID')}|srfdeid=OA_PCSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_PCSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 设备维修_资产管理处审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("DAD85CBF-9CFA-447A-B4DF-221C4FD75449");
            msgTemplate.setMsgTemplateName("设备维修_资产管理处审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_SBWXID')}|srfdeid=OA_SBWX");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_SBWXNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 食堂外卖订购_部门领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("E3171749-5538-411C-9C11-9997EB826F0A");
            msgTemplate.setMsgTemplateName("食堂外卖订购_部门领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_STWMDGID')}|srfdeid=OA_STWMDG");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_STWMDGNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 车牌门禁申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("E4446EBB-2FA9-47BA-9C5C-68277A1405E1");
            msgTemplate.setMsgTemplateName("车牌门禁申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_CPMJSQID')}|srfdeid=OA_CPMJSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_CPMJSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 请休假审批_院领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("E47AAF1C-A4FB-483E-8EB7-EA4A9446DDE1");
            msgTemplate.setMsgTemplateName("请休假审批_院领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_QXJID')}|srfdeid=OA_QXJ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_QXJNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 办公用品申请_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("E47EB4BF-B7E6-47C0-B7A9-42D622DB58C6");
            msgTemplate.setMsgTemplateName("办公用品申请_承办处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_BGYPSQID')}|srfdeid=OA_BGYPSQ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_BGYPSQNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 请休假审批_处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("E9706299-BB8E-47AE-88BA-9BDB1B6BA529");
            msgTemplate.setMsgTemplateName("请休假审批_处领导审核");
            msgTemplate.setSubject("srfkey=${data.get('OA_QXJID')}|srfdeid=OA_QXJ");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("待审批：<${data.get('OA_QXJNAME')}>需要您审批");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }
        //消息模板 通用消息模板_承办处领导审核
        if(true) {
            net.ibizsys.psrt.srv.common.entity.MsgTemplate msgTemplate = new net.ibizsys.psrt.srv.common.entity.MsgTemplate();
            msgTemplate.setMsgTemplateId("FDA13AA6-2000-4B0E-85EA-AA89D32C1AE3");
            msgTemplate.setMsgTemplateName("通用消息模板_承办处领导审核");
            msgTemplate.setSubject("");
            msgTemplate.setContentType("TEXT");
            msgTemplate.setContent("承办处领导审核消息");
            msgTemplate.setWCContent("");
            msgTemplate.setIMContent("");
            msgTemplate.setSMSContent("");
            msgTemplate.setMailGroupSend(0);
            if(msgTemplateService.checkKey(msgTemplate)==IService.CHECKKEYSTATE_OK) {
                msgTemplateService.create(msgTemplate,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),msgTemplateService.getDEModel().getLogicName(),msgTemplateService.getDEModel().getDataInfo(msgTemplate)));
            }
        }

        //初始化数据同步代理

        //初始化系统后台作业
        //后台作业 发送生日祝福
        if(true) {
            net.ibizsys.psrt.srv.common.entity.Service service = new net.ibizsys.psrt.srv.common.entity.Service();
            service.setServiceId("6AC7B31E-819B-403B-8197-4349AB81F34A");
            service.setServiceName("发送生日祝福");
            service.setStartMode("MANUAL");
            service.setServiceObject("com.sa.pseom.srv.bkservice.SendBBMessageService");
            service.setServiceParam("CHECKTIMER=86400000\nSINGLEMESSAGEQUANTITY=50");
            service.setContainer("SC01");
            service.setRunOrder(200);
            if(serviceService.checkKey(service)==IService.CHECKKEYSTATE_OK) {
                serviceService.create(service,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),serviceService.getDEModel().getLogicName(),serviceService.getDEModel().getDataInfo(service)));
            }
        }
        //后台作业 发送消息服务
        if(true) {
            net.ibizsys.psrt.srv.common.entity.Service service = new net.ibizsys.psrt.srv.common.entity.Service();
            service.setServiceId("B5636D31-40A6-4329-B029-423E26BB0F28");
            service.setServiceName("发送消息服务");
            service.setStartMode("AUTO");
            service.setServiceObject("com.sa.pseom.srv.bkservice.SendIB5MessageService");
            service.setServiceParam("CHECKTIMER=3000\nSINGLEMESSAGEQUANTITY=50");
            service.setContainer("SC01");
            service.setRunOrder(100);
            if(serviceService.checkKey(service)==IService.CHECKKEYSTATE_OK) {
                serviceService.create(service,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),serviceService.getDEModel().getLogicName(),serviceService.getDEModel().getDataInfo(service)));
            }
        }
        //初始化系统流程配置
        if(true) {
            net.ibizsys.psrt.srv.wf.entity.WFAppSetting wfAppSetting = new net.ibizsys.psrt.srv.wf.entity.WFAppSetting();
            wfAppSetting.setWFAppSettingId("2C40DFCD-0DF5-47BF-91A5-C45F810B0001");
            wfAppSetting.setApplicationId("2C40DFCD-0DF5-47BF-91A5-C45F810B0001");
            wfAppSetting.setWFAppSettingName("UniP");
            wfAppSetting.setRemindMsgTemplId("");
            if(wfAppSettingService.checkKey(wfAppSetting)==IService.CHECKKEYSTATE_OK) {
                wfAppSettingService.create(wfAppSetting,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),wfAppSettingService.getDEModel().getLogicName(),wfAppSettingService.getDEModel().getDataInfo(wfAppSetting)));
            }
        }

    }

    protected void onInstallRTDatas_DataEntity() throws Exception {
        net.ibizsys.psrt.srv.demodel.service.DataEntityService dataEntityService  = (net.ibizsys.psrt.srv.demodel.service.DataEntityService)ServiceGlobal.getService(net.ibizsys.psrt.srv.demodel.service.DataEntityService.class);
        net.ibizsys.psrt.srv.demodel.service.QueryModelService queryModelService  = (net.ibizsys.psrt.srv.demodel.service.QueryModelService)ServiceGlobal.getService(net.ibizsys.psrt.srv.demodel.service.QueryModelService.class);


        if(true) {
            //初始化权限查询模型
        }

        if(true) {
            //初始化权限查询模型
        }

        if(true) {
            //初始化权限查询模型
        }

        if(true) {
            //初始化权限查询模型
            net.ibizsys.psrt.srv.demodel.entity.QueryModel uX_QSDW = new net.ibizsys.psrt.srv.demodel.entity.QueryModel();
            uX_QSDW.setQueryModelId("3B0AE1B6-058F-4076-A4AC-65603F52A127");
            uX_QSDW.setQueryModelName("UX_QSDW");
            uX_QSDW.setQMVersion(1);
            uX_QSDW.setDEId("e3e158d75b7bc6f589686b6e1beb966c");
            uX_QSDW.setDEName("ORG");
            if(queryModelService.checkKey(uX_QSDW)==IService.CHECKKEYSTATE_OK) {
                queryModelService.create(uX_QSDW,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),queryModelService.getDEModel().getLogicName(),queryModelService.getDEModel().getDataInfo(uX_QSDW)));
            }
        }

        // 安装实体 "演示"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("6882a0ebeaba71c3557f87d860621328");
            dataEntity.setDEName("DEMO");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("演示");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "消息"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("a1220a3fe588cd56a7eeedd2457b387d");
            dataEntity.setDEName("OA_XX");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("消息");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "群组成员表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("d3696308fee7fbd75f9be92baa89063f");
            dataEntity.setDEName("LVXIN_GROUPMEMBER");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("群组成员表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "项目进度"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("2f1a376a2199c3504bfe4d4366b45e4e");
            dataEntity.setDEName("OA_XMJD");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("项目进度");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "系统配置表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("0ea97bffefccc73f25814462daf1d684");
            dataEntity.setDEName("LVXIN_CONFIG");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("系统配置表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "评论表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("2da639f83863c6842e535cc46e07b115");
            dataEntity.setDEName("LVXIN_COMMENT");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("评论表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "派车申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("644b022eb662b345d3c2578f43eb4c65");
            dataEntity.setDEName("OA_PCSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("派车申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "圈子表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("abfde35ac3ca24d4307c6f208f10b47a");
            dataEntity.setDEName("LVXIN_ARTICLE");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("圈子表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "在线设备表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("5722eaf665badc4e421ffcf6d4096d2f");
            dataEntity.setDEName("LVXIN_CIMSESSION");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("在线设备表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "法律法规"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("f5d0fdb19f1511578b6c5c9f4c69dcc2");
            dataEntity.setDEName("OA_FLFG");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("法律法规");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "用户表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("cd74f491c67d462e557330620b429f5b");
            dataEntity.setDEName("LVXIN_USER");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("用户表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "序列表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("fcacf5c3de35cfecc0c7902c816cdd77");
            dataEntity.setDEName("LVXIN_SEQUENCE");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("序列表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "工作日志"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("07ddd1ccad9ad74b66da4fac840f8fad");
            dataEntity.setDEName("OA_GZRZ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("工作日志");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "附加逻辑"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("bbc8558d10375e41f01804e6c2206085");
            dataEntity.setDEName("API_XT_FJLJ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("附加逻辑");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "机票预订"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("48f5487b61a60a005e2867457c2a8baa");
            dataEntity.setDEName("OA_JPYD");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("机票预订");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "设备维修"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("3bec83f956549a6be06d66b95e9efa03");
            dataEntity.setDEName("OA_SBWX");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("设备维修");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "漂流瓶表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("661561deacb4d73c7623337e7af7a8b2");
            dataEntity.setDEName("LVXIN_BOTTLE");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("漂流瓶表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "空间权限表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("b602cb07042da689dbd8ba4a09714f6e");
            dataEntity.setDEName("LVXIN_MOMENTRULE");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("空间权限表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "参会人员"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("8ca8432f94aa739a7224de9e5dd0eb34");
            dataEntity.setDEName("OA_CHRY");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("参会人员");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "订阅关系表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("896c77eb9edc9230a56830c83eb00c39");
            dataEntity.setDEName("LVXIN_SUBSCRIBER");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("订阅关系表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "用餐申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("4494d39d58cba00b8eb277e80e350dad");
            dataEntity.setDEName("OA_YCSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("用餐申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "会议室"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("8919f057dd97c6ac882a2d23420be1a3");
            dataEntity.setDEName("OA_HYS");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("会议室");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "请休假"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("43a554dc963230bc837ff475418429b2");
            dataEntity.setDEName("OA_QXJ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("请休假");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "组织表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("711fc6f5e52d4c76ed7eb5d96fed5e7a");
            dataEntity.setDEName("LVXIN_ORGANIZATION");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("组织表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "公众账号"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("f7933ca7f298d8c4a62ee98421a1c0e0");
            dataEntity.setDEName("LVXIN_PUBLICACCOUNT");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("公众账号");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "采购申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("d5b99fe05938f9adcfc252174e25526e");
            dataEntity.setDEName("OA_CGSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("采购申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "车牌门禁申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("04e19d4de092a71460a31ae1e90ba06f");
            dataEntity.setDEName("OA_CPMJSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("车牌门禁申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "日志人员"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("eb8135d3edcb38f493ed0240e9b59f5f");
            dataEntity.setDEName("OA_RZRY");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("日志人员");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "操作日志"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("9aa63784ad7c83fb5b897285d8863ea8");
            dataEntity.setDEName("OA_CZRZ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("操作日志");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "消息记录表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("d06cb73070b882cdcf03a0588f231c3d");
            dataEntity.setDEName("LVXIN_MESSAGE");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("消息记录表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "食堂外卖订购"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("9e3412d4cc2071a7028a726531005e82");
            dataEntity.setDEName("OA_STWMDG");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("食堂外卖订购");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "群组表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("575cb60cd1245b080b7cc69125fa47d9");
            dataEntity.setDEName("LVXIN_GROUP");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("群组表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "出差申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("01c34100c1e11dc5b27d6ef38493e9f4");
            dataEntity.setDEName("OA_CCSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("出差申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "系统管理员表"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("7bbabda4563c0f218563cad95368469a");
            dataEntity.setDEName("LVXIN_MANAGER");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("系统管理员表");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "饮用水申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("c300dfcfd782397bae090b345b40d5f4");
            dataEntity.setDEName("OA_YYSSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("饮用水申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "车辆"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("3d6b755c3692debb8fd539de77b21099");
            dataEntity.setDEName("OA_CL");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("车辆");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "内设机构会议申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("4ab8e29eef72eb9ce66e677cef7051f9");
            dataEntity.setDEName("OA_NSJGHYSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(1);
            dataEntity.setDELogicName("内设机构会议申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "待办"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("8de2c483d6469793d11fbb3b0ed056a5");
            dataEntity.setDEName("GG_DB");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("待办");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "会议申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("c0433bdd5aa541e585e2b3b0e59951da");
            dataEntity.setDEName("OA_YBHYSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(1);
            dataEntity.setDELogicName("会议申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "车辆维修"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("a2ff33334ca80258b31ea5623af023c7");
            dataEntity.setDEName("OA_CLWX");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("车辆维修");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "通知公告"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("7386ce6dfae074294cbbde833b6820ed");
            dataEntity.setDEName("OA_TZGG");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("通知公告");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "消息人员"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("569bd3058e5bf80c26c953bc5a0187c0");
            dataEntity.setDEName("OA_XXRY");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("消息人员");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "公众号菜单"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("23e3d666b8d5f630accb0ec6b4da8485");
            dataEntity.setDEName("LVXIN_PUBLICMENU");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("公众号菜单");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "办公用品申请"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("2f02aaa9f6e6edffb9ba8f29a67a8b43");
            dataEntity.setDEName("OA_BGYPSQ");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("办公用品申请");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "知识库"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("89d40906b952c934951c7674a199b93c");
            dataEntity.setDEName("OA_ZSK");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("知识库");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }
        // 安装实体 "通知公告人员"
        if(true) {
            net.ibizsys.psrt.srv.demodel.entity.DataEntity dataEntity = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
            dataEntity.setDEId("a1db6680ea6fd852ef1e1744bff0fec5");
            dataEntity.setDEName("OA_TZGGRY");
            dataEntity.setDEType(1);
            dataEntity.setIsLogicValid(0);
            dataEntity.setDELogicName("通知公告人员");
            dataEntity.setDEVersion(1);
            if(dataEntityService.checkKey(dataEntity)==IService.CHECKKEYSTATE_OK) {
                dataEntityService.create(dataEntity,false);
                ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n",this.getName(),dataEntityService.getDEModel().getLogicName(),dataEntityService.getDEModel().getDataInfo(dataEntity)));
            }
            //初始化权限查询模型
        }

    }


    @Autowired(required=false)
    @Qualifier("uniPSamplePlugins")
    private net.ibizsys.paas.core.PluginList uniPSamplePlugins;

    /***
     * 获取系统插件配置
     */
    public net.ibizsys.paas.core.PluginList getUniPSamplePlugins() {
        return this.uniPSamplePlugins;
    }

    @Autowired(required=false)
    @Qualifier("uniPSampleServiceAPIClientId")
    private String uniPSampleServiceAPIClientId;

    public String getServiceAPIClientId() {
        return this.uniPSampleServiceAPIClientId;
    }

}