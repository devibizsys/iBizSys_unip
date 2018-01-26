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

import com.sa.unip.srv.ywsp.entity.OA_CHRY;
import com.sa.unip.srv.ywsp.service.OA_CHRYService;


/**
 * 实体[OA_CHRY]模型对象
 */
public class OA_CHRYDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<OA_CHRY>  {

    public OA_CHRYDEModel() throws Exception {
        super();

        this.setId("8ca8432f94aa739a7224de9e5dd0eb34");
        this.setName("OA_CHRY");
        this.setTableName("T_OA_CHRY");
        this.setViewName("V_OA_CHRY");
        this.setLogicName("参会人员");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[OA_CHRY]模型对象
     * @return
     * @throws Exception
     */
    public static OA_CHRYDEModel getInstance() throws Exception {
        return (OA_CHRYDEModel)DEModelGlobal.getDEModel(OA_CHRYDEModel.class);
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

    private OA_CHRYService oA_CHRYService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  OA_CHRYService getRealService() {
        if(this.oA_CHRYService==null) {
            try {
                this.oA_CHRYService = (OA_CHRYService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.oA_CHRYService;
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
        return "com.sa.unip.srv.ywsp.service.OA_CHRYService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public OA_CHRY createEntity() {
        return new OA_CHRY();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "OA_CHRYID"
        iDEField = this.createDEField("OA_CHRYID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("535ce7ad498bf126ed61b8cf95690762");
            deFieldModel.setName("OA_CHRYID");
            deFieldModel.setLogicName("参会人员标识");
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
        //注册属性 "CREATEDATE"
        iDEField = this.createDEField("CREATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("2a39d5fbe5849535072eb5f24174994d");
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
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("91ba357571bde66f90b46e275dc4c7d4");
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
        //注册属性 "OA_CHRYNAME"
        iDEField = this.createDEField("OA_CHRYNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("c5057a6f2c29c4e0adad11ca7745dbde");
            deFieldModel.setName("OA_CHRYNAME");
            deFieldModel.setLogicName("参会人员名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_OA_CHRYNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_OA_CHRYNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CREATEMAN"
        iDEField = this.createDEField("CREATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d7b1a82b15576cc1aa14a9c7033fde06");
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
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d20a0c045d4d19f282d623517820d312");
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
        //注册属性 "CHZT"
        iDEField = this.createDEField("CHZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("7692789d5b8c1796a7f79bb4015afe9b");
            deFieldModel.setName("CHZT");
            deFieldModel.setLogicName("参会状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_CHZTCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_CHZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_CHZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CHSJ"
        iDEField = this.createDEField("CHSJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d7bcc1a606d01fe3860747377bb26076");
            deFieldModel.setName("CHSJ");
            deFieldModel.setLogicName("参会时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ZWH"
        iDEField = this.createDEField("ZWH");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("52f3a836bb347bea902acf96659fb642");
            deFieldModel.setName("ZWH");
            deFieldModel.setLogicName("座位号");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "YBHYSQID"
        iDEField = this.createDEField("YBHYSQID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("34236b53b0777c67caef712cb6874c1c");
            deFieldModel.setName("YBHYSQID");
            deFieldModel.setLogicName("院办会议申请标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID");
            deFieldModel.setLinkDEFName("OA_YBHYSQID");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_YBHYSQID_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_YBHYSQID_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "YBHYSQNAME"
        iDEField = this.createDEField("YBHYSQNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("fbb7e4259dc2b05d4dc6b5e6afc6638c");
            deFieldModel.setName("YBHYSQNAME");
            deFieldModel.setLogicName("院办会议申请名称");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID");
            deFieldModel.setLinkDEFName("OA_YBHYSQNAME");
            deFieldModel.setPhisicalDEField(false);
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_YBHYSQNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_YBHYSQNAME_LIKE");
                defSearchModeModel.setValueOp("LIKE");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_YBHYSQNAME_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_YBHYSQNAME_EQ");
                defSearchModeModel.setValueOp("EQ");
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
            deFieldModel.setId("54e5faf9dac94595a8d16855040b785f");
            deFieldModel.setName("ORGUSERID");
            deFieldModel.setLogicName("参会人员标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CHRY_ORGUSER_ORGUSERID");
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
            deFieldModel.setId("291b90f04741d8ce72f020da0e6e2304");
            deFieldModel.setName("ORGUSERNAME");
            deFieldModel.setLogicName("参会人员名称");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CHRY_ORGUSER_ORGUSERID");
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
        //注册属性 "ORGSECUSERTYPENAME"
        iDEField = this.createDEField("ORGSECUSERTYPENAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("204089265c985d26edd3b324fc040216");
            deFieldModel.setName("ORGSECUSERTYPENAME");
            deFieldModel.setLogicName("职位");
            deFieldModel.setDataType("PICKUPDATA");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CHRY_ORGUSER_ORGUSERID");
            deFieldModel.setLinkDEFName("ORGSECUSERTYPENAME");
            deFieldModel.setPhisicalDEField(false);
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "ZWHMS"
        iDEField = this.createDEField("ZWHMS");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("a74b81378d3d047a369de288130076c4");
            deFieldModel.setName("ZWHMS");
            deFieldModel.setLogicName("座位号描述");
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
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  YCH2
        IDEDataSet yCH2DSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCH2DSModel");
        yCH2DSModel.init(this);
        this.registerDEDataSet(yCH2DSModel);
        //注册  WCH
        IDEDataSet wCHDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYWCHDSModel");
        wCHDSModel.init(this);
        this.registerDEDataSet(wCHDSModel);
        //注册  YCD
        IDEDataSet yCDDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCDDSModel");
        yCDDSModel.init(this);
        this.registerDEDataSet(yCDDSModel);
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
        //注册  YCH
        IDEDataSet yCHDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCHDSModel");
        yCHDSModel.init(this);
        this.registerDEDataSet(yCHDSModel);
        //注册  YQJ
        IDEDataSet yQJDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYQJDSModel");
        yQJDSModel.init(this);
        this.registerDEDataSet(yQJDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  YCH2
        IDEDataQuery yCH2DQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCH2DQModel");
        yCH2DQModel.init(this);
        this.registerDEDataQuery(yCH2DQModel);
        //注册  WCH
        IDEDataQuery wCHDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYWCHDQModel");
        wCHDQModel.init(this);
        this.registerDEDataQuery(wCHDQModel);
        //注册  YCDJ
        IDEDataQuery yCDJDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCDJDQModel");
        yCDJDQModel.init(this);
        this.registerDEDataQuery(yCDJDQModel);
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
        //注册  YCH
        IDEDataQuery yCHDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYCHDQModel");
        yCHDQModel.init(this);
        this.registerDEDataQuery(yCHDQModel);
        //注册  YQJ
        IDEDataQuery yQJDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYYQJDQModel");
        yQJDQModel.init(this);
        this.registerDEDataQuery(yQJDQModel);
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
        //注册  参加会议
        IDELogic cJHYLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYCJHYLogicModel");
        cJHYLogicModel.init(this);
        this.registerDELogic(cJHYLogicModel);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEUIActions()
    */
    @Override
    protected void prepareDEUIActions() throws Exception {
        //注册  参会
        IDEUIAction cHUIActionModel =(IDEUIAction)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYCHUIActionModel");
        cHUIActionModel.init(this);
        this.registerDEUIAction(cHUIActionModel);
        //注册  参会（移动端）
        IDEUIAction mobCHUIActionModel =(IDEUIAction)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CHRYMobCHUIActionModel");
        mobCHUIActionModel.init(this);
        this.registerDEUIAction(mobCHUIActionModel);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEWFs()
     */
    @Override
    protected void prepareDEWFs() throws Exception {
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
        //注册视图 参会人员实体表格视图
        this.registerPDTDEView("MDATAVIEW","b76206d30801d614a3fadbcef308a63f");
        //注册视图 参会人员实体移动端编辑视图（查看）
        this.registerPDTDEView("MOBEDITVIEW","1B46FE42-5711-4857-9D5E-81B9A5A6BA3E");
        //注册视图 参会人员实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","9803dc950f81e253982a37ff2a56dacb");
        //注册视图 参会人员实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","ae9db8f6ab1a845ace74fe85e2e55287");
        //注册视图 参会人员实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","65d7f06c477159a8bcc224f8599f6615");
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

        //放入属性 OA_CHRYNAME - 参会人员名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(OA_CHRY.FIELD_OA_CHRYNAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}