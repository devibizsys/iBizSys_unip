/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import java.io.Serializable;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.view.IView;
import net.ibizsys.paas.core.IDEFSearchMode;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.demodel.DEFSearchModeModel;
import net.ibizsys.paas.demodel.DEFieldModel;
import net.ibizsys.paas.demodel.DEMainStateModel;
import net.ibizsys.paas.demodel.DEDataSyncModel;
import net.ibizsys.paas.demodel.DEActionWizardGroupModel;
import net.ibizsys.paas.demodel.DEActionWizardModel;
import net.ibizsys.paas.demodel.DEDataSetDEAWModel;
import net.ibizsys.paas.demodel.DEActionWizardItemModel;
import net.ibizsys.paas.demodel.IDEActionWizardModel;
import net.ibizsys.paas.demodel.DEUniStateModel;
import net.ibizsys.paas.core.IDEDataQuery;
import net.ibizsys.paas.core.IDEDataSet;
import net.ibizsys.paas.core.IDEAction;
import net.ibizsys.paas.core.IDEACMode;
import net.ibizsys.paas.core.IDELogic;
import net.ibizsys.paas.core.IDEUIAction;
import net.ibizsys.paas.core.IDEWF;
import net.ibizsys.paas.core.IDEMainState;
import net.ibizsys.paas.core.IDEDataImport;
import net.ibizsys.paas.report.IPrintService;
import net.ibizsys.paas.report.IReportService;
import net.ibizsys.paas.demodel.IDEDataExportModel;

import net.ibizsys.paas.demodel.DEBATableModel;
import com.sa.unip.srv.UniPSampleSysModel;

import com.sa.unip.srv.ywsp.entity.OA_SBWX;
import com.sa.unip.srv.ywsp.service.OA_SBWXService;


/**
 * 实体[OA_SBWX]模型对象
 */
public class OA_SBWXDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<OA_SBWX>  {

    public OA_SBWXDEModel() throws Exception {
        super();

        this.setId("3bec83f956549a6be06d66b95e9efa03");
        this.setName("OA_SBWX");
        this.setTableName("T_OA_SBWX");
        this.setViewName("V_OA_SBWX");
        this.setLogicName("设备维修");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[OA_SBWX]模型对象
     * @return
     * @throws Exception
     */
    public static OA_SBWXDEModel getInstance() throws Exception {
        return (OA_SBWXDEModel)DEModelGlobal.getDEModel(OA_SBWXDEModel.class);
    }


    private UniPSampleSysModel uniPSampleSysModel;
    /**
     * 获取当前系统[UniPSample]模型对象
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
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#getSystem()
     */
    @Override
    public  ISystem getSystem() {
        return this.getUniPSampleSysModel();
    }

    private OA_SBWXService oA_SBWXService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  OA_SBWXService getRealService() {
        if(this.oA_SBWXService==null) {
            try {
                this.oA_SBWXService = (OA_SBWXService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.oA_SBWXService;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#getService()
     */
    @Override
    public IService getService() {
        return this.getRealService();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#getServiceId()
     */
    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.ywsp.service.OA_SBWXService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public OA_SBWX createEntity() {
        return new OA_SBWX();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "SBWXSFSHTG"
        iDEField = this.createDEField("SBWXSFSHTG");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("e88ce2067ddb71724d1ed4cd4cddaa6d");
            deFieldModel.setName("SBWXSFSHTG");
            deFieldModel.setLogicName("设备维修是否审核通过");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_SBWXSFSHTG_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_SBWXSFSHTG_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "BZ"
        iDEField = this.createDEField("BZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("57b96415770ea5264f805846f7284328");
            deFieldModel.setName("BZ");
            deFieldModel.setLogicName("备注");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("05d8f61963885de065e92a760a01a3b6");
            deFieldModel.setName("UPDATEMAN");
            deFieldModel.setLogicName("更新人");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("UPDATEMAN");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "OA_SBWXID"
        iDEField = this.createDEField("OA_SBWXID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("9829c8087faa0d7d5ea3e5bafee3393b");
            deFieldModel.setName("OA_SBWXID");
            deFieldModel.setLogicName("设备维修标识");
            deFieldModel.setDataType("GUID");
            deFieldModel.setStdDataType(25);
            deFieldModel.setKeyDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("9bf9adde1f233b7d2ba11e2a518c4ce5");
            deFieldModel.setName("UPDATEDATE");
            deFieldModel.setLogicName("更新时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("UPDATEDATE");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CREATEMAN"
        iDEField = this.createDEField("CREATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("bfbb5b9cd185ee0820b7a5cd0372edfb");
            deFieldModel.setName("CREATEMAN");
            deFieldModel.setLogicName("建立人");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("CREATEMAN");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.SysOperatorCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CREATEDATE"
        iDEField = this.createDEField("CREATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("c768737e06bd12358917ee41f8f852f4");
            deFieldModel.setName("CREATEDATE");
            deFieldModel.setLogicName("建立时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setPreDefinedType("CREATEDATE");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "OA_SBWXNAME"
        iDEField = this.createDEField("OA_SBWXNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d9cb1fba76f00a97567770c38026a382");
            deFieldModel.setName("OA_SBWXNAME");
            deFieldModel.setLogicName("设备维修名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_OA_SBWXNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_OA_SBWXNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ORGUSERID"
        iDEField = this.createDEField("ORGUSERID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("aa75ce496ef93cbb6832797e3930044b");
            deFieldModel.setName("ORGUSERID");
            deFieldModel.setLogicName("申请人标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_SBWX_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGUSERID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERID_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ORGUSERNAME"
        iDEField = this.createDEField("ORGUSERNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8158d9cb15d816efaee42752509134cf");
            deFieldModel.setName("ORGUSERNAME");
            deFieldModel.setLogicName("申请人");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_SBWX_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGUSERNAME");
            deFieldModel.setPhisicalDEField(false);
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGUSERNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGUSERNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ORGSECTORID"
        iDEField = this.createDEField("ORGSECTORID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("206a16e1b8f8c1999841dacbd37048b5");
            deFieldModel.setName("ORGSECTORID");
            deFieldModel.setLogicName("部门标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID");
            deFieldModel.setLinkDEFName("ORGSECTORID");
            deFieldModel.setPreDefinedType("ORGSECTORID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORID_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ORGSECTORNAME"
        iDEField = this.createDEField("ORGSECTORNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("b02fd372def138cf2592c148973d41eb");
            deFieldModel.setName("ORGSECTORNAME");
            deFieldModel.setLogicName("部门名称");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_SBWX_ORGSECTOR_ORGSECTORID");
            deFieldModel.setLinkDEFName("ORGSECTORNAME");
            deFieldModel.setPhisicalDEField(false);
            deFieldModel.setPreDefinedType("ORGSECTORNAME");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_ORGSECTORNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_ORGSECTORNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "RQ"
        iDEField = this.createDEField("RQ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("4337f0b53bb612a209906d63889ae00f");
            deFieldModel.setName("RQ");
            deFieldModel.setLogicName("日期");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "GZXX"
        iDEField = this.createDEField("GZXX");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("f74782777c01c067445bf2ef3a649caf");
            deFieldModel.setName("GZXX");
            deFieldModel.setLogicName("故障现象");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "FJH"
        iDEField = this.createDEField("FJH");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("e3bbb5802828501fc0227875b95021d3");
            deFieldModel.setName("FJH");
            deFieldModel.setLogicName("房间号");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "DH"
        iDEField = this.createDEField("DH");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("52d0e0036291dc6d78f8d765deb9661b");
            deFieldModel.setName("DH");
            deFieldModel.setLogicName("电话");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "MEMO"
        iDEField = this.createDEField("MEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("3a11738e738c1f12fe1a8996863803e3");
            deFieldModel.setName("MEMO");
            deFieldModel.setLogicName("审核意见");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WFINSTANCEID"
        iDEField = this.createDEField("WFINSTANCEID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8354eb21186e6f5993cfb30d2f7e0b54");
            deFieldModel.setName("WFINSTANCEID");
            deFieldModel.setLogicName("工作流实例");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "WFSTATE"
        iDEField = this.createDEField("WFSTATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("deb540328f5f11aea8da451c21f055f1");
            deFieldModel.setName("WFSTATE");
            deFieldModel.setLogicName("工作流状态");
            deFieldModel.setDataType("WFSTATE");
            deFieldModel.setStdDataType(9);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.WFStatesCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SBWXZT"
        iDEField = this.createDEField("SBWXZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("df6316923eba1581f549cf2039cfc5b5");
            deFieldModel.setName("SBWXZT");
            deFieldModel.setLogicName("设备维修状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SBWXSQZTCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_SBWXZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_SBWXZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SBWXBZ"
        iDEField = this.createDEField("SBWXBZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d131bea78238f268099e73fa3add8ab7");
            deFieldModel.setName("SBWXBZ");
            deFieldModel.setLogicName("设备维修步骤");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SBWXSQBZCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_SBWXBZ_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_SBWXBZ_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SB"
        iDEField = this.createDEField("SB");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("f18ba32697fb94632e722d425541a11b");
            deFieldModel.setName("SB");
            deFieldModel.setLogicName("设备");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEACModes()
     */
    @Override
    protected void prepareDEACModes() throws Exception {
        //注册  DEFAULT
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
        //注册  CurSbwx
        IDEDataSet curSbwxDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXCurSbwxDSModel");
        curSbwxDSModel.init(this);
        this.registerDEDataSet(curSbwxDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
        //注册  CurSbwx
        IDEDataQuery curSbwxDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXCurSbwxDQModel");
        curSbwxDQModel.init(this);
        this.registerDEDataQuery(curSbwxDQModel);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActions()
     */
    @Override
    protected void prepareDEActions() throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDELogics()
     */
    @Override
    protected void prepareDELogics() throws Exception {
        //注册  设置默认值
        IDELogic sZMRZLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXSZMRZLogicModel");
        sZMRZLogicModel.init(this);
        this.registerDELogic(sZMRZLogicModel);
        this.registerDEActionLogic("CREATE","BEFORE","SZMRZ");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEUIActions()
    */
    @Override
    protected void prepareDEUIActions() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEWFs()
     */
    @Override
    protected void prepareDEWFs() throws Exception {
        //注册  设备维修流程
        IDEWF sBWXLCDEWFModel =(IDEWF)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_SBWXSBWXLCDEWFModel");
        sBWXLCDEWFModel.init(this);
        this.registerDEWF(sBWXLCDEWFModel);

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEUniStates()
     */
    @Override
    protected void prepareDEUniStates() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEMainStates()
     */
    @Override
    protected void prepareDEMainStates() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSyncs()
     */
    @Override
    protected void prepareDEDataSyncs() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#preparePDTDEViews()
     */
    @Override
    protected void preparePDTDEViews() throws Exception {
        //注册视图 设备维修实体表格视图
        this.registerPDTDEView("MDATAVIEW","f41195243af70a7b15ec239f1e28826a");
        //注册视图 设备维修实体移动端编辑视图（审核结束）
        this.registerPDTDEView("MOBEDITVIEW","DA44F1BB-FBD1-4C65-9F3B-6382A4C1CB91");
        //注册视图 设备维修实体移动端工作流编辑视图（分页关系）(设备维修流程)
        this.registerPDTDEView("MOBWFEDITVIEW:SBWXLC:D","8cd784d72fe1488d43b22341441e7fd7");
        //注册视图 设备维修实体移动端工作流编辑视图（分页关系）(设备维修流程v1:部门领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:SBWXLC:W:10","50ed734e2dbfa2f611bf3baeb44ea03a");
        //注册视图 设备维修实体移动端工作流编辑视图（分页关系）(设备维修流程v1:资产管理处审核)
        this.registerPDTDEView("MOBWFEDITVIEW:SBWXLC:W:20","266640393a46f8a729fa1354cfec9c96");
        //注册视图 设备维修实体移动端工作流多数据视图(设备维修流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:SBWXLC:D","dda0ab8b6a1fbc6069fc610485f492be");
        //注册视图 设备维修实体移动端工作流多数据视图(设备维修流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:SBWXLC:W","7874871ddd6410d767c547fa9be4608d");
        //注册视图 设备维修实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","74ba876bb81aa0c76ca4526c3947e41a");
        //注册视图 设备维修实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","c8c0fe9ef7959b832ac7813a401d3053");
        //注册视图 设备维修实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","fa75b4c11764cc4f7bcf32ba778341a2");
        //注册视图 设备维修实体工作流视图（分页关系）(设备维修流程)
        this.registerPDTDEView("WFEDITVIEW:SBWXLC:D","48a5c226ce81823099f1eaf0d0e5fc9b");
        //注册视图 设备维修实体工作流视图（分页关系）(设备维修流程v1:部门领导审核)
        this.registerPDTDEView("WFEDITVIEW:SBWXLC:W:10","baaaf80f374c3608dc03abc0eca382d1");
        //注册视图 设备维修实体工作流视图（分页关系）(设备维修流程v1:资产管理处审核)
        this.registerPDTDEView("WFEDITVIEW:SBWXLC:W:20","7819b956e02394eb925b95e026d7c640");
        //注册视图 设备维修实体工作流表格视图(设备维修流程)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:D","5b6a3c2df5842469f09c20605e87685b");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:未提交)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:D:10","ec15868a3449d53198dd1c52b7486c36");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:审核中)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:D:20","7efb26b41dd59e06394df629b64bb01f");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:已完成)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:D:30","17f8f1b68810e95b9d104733c6604364");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:已取消)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:D:40","6e62935d322bace01e94f154ff93ad59");
        //注册视图 设备维修实体工作流表格视图(设备维修流程)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:W","eb0d6ef5dceb4d388d05705167f035f0");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:部门领导审核)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:W:10","d6faaba3b7488b2e1de6556336d700ad");
        //注册视图 设备维修实体工作流表格视图(设备维修流程:资产管理处审核)
        this.registerPDTDEView("WFMDATAVIEW:SBWXLC:W:20","9c2e7ba49a520f90901aabf5621efbcc");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEOPPrivTagMaps()
     */
    @Override
    protected void prepareDEOPPrivTagMaps()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEPrints()
     */
    @Override
    protected void prepareDEPrints()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEReports()
     */
    @Override
    protected void prepareDEReports()throws Exception {
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataExports()
     */
    @Override
    protected void prepareDEDataExports() throws Exception {

    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActionWizards()
     */
    @Override
    protected void prepareDEActionWizards() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEActionWizardGroups()
     */
    @Override
    protected void prepareDEActionWizardGroups() throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEBATables()
     */
    @Override
    protected void prepareDEBATables() throws Exception {
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#onFillFetchQuickSearchConditions(net.ibizsys.paas.core.DEDataSetCond, java.lang.String)
     */
    @Override
    protected void onFillFetchQuickSearchConditions(DEDataSetCond groupCondImpl,String strQuickSearch)  throws Exception {
        super.onFillFetchQuickSearchConditions(groupCondImpl,strQuickSearch);

        //放入属性 OA_SBWXNAME - 设备维修名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(OA_SBWX.FIELD_OA_SBWXNAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}