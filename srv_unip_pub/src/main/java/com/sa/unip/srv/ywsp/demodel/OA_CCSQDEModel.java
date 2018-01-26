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

import com.sa.unip.srv.ywsp.entity.OA_CCSQ;
import com.sa.unip.srv.ywsp.service.OA_CCSQService;


/**
 * 实体[OA_CCSQ]模型对象
 */
public class OA_CCSQDEModel extends net.ibizsys.paas.demodel.DataEntityModelBase<OA_CCSQ>  {

    public OA_CCSQDEModel() throws Exception {
        super();

        this.setId("01c34100c1e11dc5b27d6ef38493e9f4");
        this.setName("OA_CCSQ");
        this.setTableName("T_OA_CCSQ");
        this.setViewName("V_OA_CCSQ");
        this.setLogicName("出差申请");
        this.setDSLink("DEFAULT");
        this.setDataAccCtrlMode(1);
        this.setAuditMode(0);
        DEModelGlobal.registerDEModel("com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel",this);
        this.prepareModels();

        //注册到系统中
        this.getUniPSampleSysModel().registerDataEntityModel(this);
    }

    /**
     * 获取实体[OA_CCSQ]模型对象
     * @return
     * @throws Exception
     */
    public static OA_CCSQDEModel getInstance() throws Exception {
        return (OA_CCSQDEModel)DEModelGlobal.getDEModel(OA_CCSQDEModel.class);
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

    private OA_CCSQService oA_CCSQService;

    /**
     * 获取实际实体服务对象
     * @return
     */
    public  OA_CCSQService getRealService() {
        if(this.oA_CCSQService==null) {
            try {
                this.oA_CCSQService = (OA_CCSQService)ServiceGlobal.getService(getServiceId());
            } catch(Exception ex) {
            }
        }
        return this.oA_CCSQService;
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
        return "com.sa.unip.srv.ywsp.service.OA_CCSQService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.IDataEntityModel#createEntity()
     */
    @Override
    public OA_CCSQ createEntity() {
        return new OA_CCSQ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEFields()
     */
    @Override
    protected void prepareDEFields() throws Exception {
        IDEField iDEField = null;
        IDEFSearchMode iDEFSearchMode = null;
        //注册属性 "CCSQSFSHTG"
        iDEField = this.createDEField("CCSQSFSHTG");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("225b4bac7524677c88b7864d1a7c10ec");
            deFieldModel.setName("CCSQSFSHTG");
            deFieldModel.setLogicName("出差申请是否审核通过");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_CCSQSFSHTG_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_CCSQSFSHTG_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "MEMO"
        iDEField = this.createDEField("MEMO");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("c0a8f4162c1466a26f72a8adb9881dc7");
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
        //注册属性 "OA_CCSQID"
        iDEField = this.createDEField("OA_CCSQID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("6eeaae8c28e92c6365f4530e7e9aeb9c");
            deFieldModel.setName("OA_CCSQID");
            deFieldModel.setLogicName("出差申请标识");
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
        //注册属性 "OA_CCSQNAME"
        iDEField = this.createDEField("OA_CCSQNAME");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("0c6597aed9dde4437d21ded41742dc81");
            deFieldModel.setName("OA_CCSQNAME");
            deFieldModel.setLogicName("出差申请名称");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setMajorDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_OA_CCSQNAME_LIKE");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_OA_CCSQNAME_LIKE");
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
            deFieldModel.setId("2fde8822db4ce73e1142c09393719a5f");
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
            deFieldModel.setId("36efb49353fce6aaad79eaf4b33db931");
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
        //注册属性 "UPDATEDATE"
        iDEField = this.createDEField("UPDATEDATE");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("57e81000545908b9e8b631758547298e");
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
        //注册属性 "UPDATEMAN"
        iDEField = this.createDEField("UPDATEMAN");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("ca83d53685475288c0dee10db5ea3617");
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
        //注册属性 "ORGUSERID"
        iDEField = this.createDEField("ORGUSERID");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("bf02a17e8e25a6eefcad2b37210e6770");
            deFieldModel.setName("ORGUSERID");
            deFieldModel.setLogicName("人员标识");
            deFieldModel.setDataType("PICKUP");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CCSQ_ORGUSER_ORGUSERID");
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
            deFieldModel.setId("a69778c2b30268a3bfc32e7d6f2f5398");
            deFieldModel.setName("ORGUSERNAME");
            deFieldModel.setLogicName("申请人");
            deFieldModel.setDataType("PICKUPTEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setLinkDEField(true);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setDERName("DER1N_OA_CCSQ_ORGUSER_ORGUSERID");
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
        //注册属性 "CCSY"
        iDEField = this.createDEField("CCSY");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("f2cfb9fc147ceb73b7521a5714eee10f");
            deFieldModel.setName("CCSY");
            deFieldModel.setLogicName("出差事由");
            deFieldModel.setDataType("TEXT");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "KSSJ"
        iDEField = this.createDEField("KSSJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("8ecf114a756ded1ae762f782f68565df");
            deFieldModel.setName("KSSJ");
            deFieldModel.setLogicName("开始时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "JSSJ"
        iDEField = this.createDEField("JSSJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("d6ba8b45fe10e6ca8b981058b2e978b6");
            deFieldModel.setName("JSSJ");
            deFieldModel.setLogicName("结束时间");
            deFieldModel.setDataType("DATETIME");
            deFieldModel.setStdDataType(5);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "SC"
        iDEField = this.createDEField("SC");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("5df4f4f1b546633b8f029cc0bf306011");
            deFieldModel.setName("SC");
            deFieldModel.setLogicName("时长");
            deFieldModel.setDataType("INT");
            deFieldModel.setStdDataType(9);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setValueFormat("%1$s");
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "FJ"
        iDEField = this.createDEField("FJ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("c6da1f1787fcbf2ca491fb081f2979c5");
            deFieldModel.setName("FJ");
            deFieldModel.setLogicName("附件");
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
            deFieldModel.setId("d5635e7a1faef7cc704fa2d1fcc3be2f");
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
            deFieldModel.setId("edadb5fcb4fcc45376b996b6840d3207");
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
        //注册属性 "CCSQZT"
        iDEField = this.createDEField("CCSQZT");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("5b461db7f35a7a0d29a1fbf7c2b662e6");
            deFieldModel.setName("CCSQZT");
            deFieldModel.setLogicName("出差申请状态");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTATECodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_CCSQZT_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_CCSQZT_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CCSQBZ"
        iDEField = this.createDEField("CCSQBZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("2331155d952f80e85d4179a4dd92306b");
            deFieldModel.setName("CCSQBZ");
            deFieldModel.setLogicName("出差申请步骤");
            deFieldModel.setDataType("SSCODELIST");
            deFieldModel.setStdDataType(25);
            deFieldModel.setImportOrder(1000);
            deFieldModel.setImportTag("");
            deFieldModel.setCodeListId("com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel");
            deFieldModel.setValueFormat("%1$s");
            iDEFSearchMode = this.createDEFSearchMode(deFieldModel,"N_CCSQBZ_EQ");
            if(iDEFSearchMode==null) {
                DEFSearchModeModel defSearchModeModel = new DEFSearchModeModel();
                defSearchModeModel.setDEField(deFieldModel);
                defSearchModeModel.setName("N_CCSQBZ_EQ");
                defSearchModeModel.setValueOp("EQ");
                defSearchModeModel.init();
                deFieldModel.registerDEFSearchMode(defSearchModeModel);
            }
            deFieldModel.init();
            iDEField = deFieldModel;
        }
        this.registerDEField(iDEField);
        //注册属性 "CCDZ"
        iDEField = this.createDEField("CCDZ");
        if(iDEField==null) {
            DEFieldModel deFieldModel = new DEFieldModel();
            deFieldModel.setDataEntity(this);
            deFieldModel.setId("86c23fc0c87292f685fdc5017daaaa47");
            deFieldModel.setName("CCDZ");
            deFieldModel.setLogicName("出差地址");
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
        IDEACMode _defaultACModel = (IDEACMode)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQDefaultACModel");
        _defaultACModel.init(this);
        this.registerDEACMode(_defaultACModel);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        //注册  DEFAULT
        IDEDataSet _defaultDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQDefaultDSModel");
        _defaultDSModel.init(this);
        this.registerDEDataSet(_defaultDSModel);
        //注册  CurCcsq
        IDEDataSet curCcsqDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQCurCcsqDSModel");
        curCcsqDSModel.init(this);
        this.registerDEDataSet(curCcsqDSModel);
        //注册  CCSQTB
        IDEDataSet cCSQTBDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQCCSQTBDSModel");
        cCSQTBDSModel.init(this);
        this.registerDEDataSet(cCSQTBDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        //注册  CurCcsq
        IDEDataQuery curCcsqDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQCurCcsqDQModel");
        curCcsqDQModel.init(this);
        this.registerDEDataQuery(curCcsqDQModel);
        //注册  DEFAULT
        IDEDataQuery _defaultDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQDefaultDQModel");
        _defaultDQModel.init(this);
        this.registerDEDataQuery(_defaultDQModel);
        //注册  CCSQTB
        IDEDataQuery cCSQTBDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQCCSQTBDQModel");
        cCSQTBDQModel.init(this);
        this.registerDEDataQuery(cCSQTBDQModel);
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
        IDELogic sZMRZLogicModel = (IDELogic)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQSZMRZLogicModel");
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
        //注册  出差申请流程
        IDEWF cCSQLCDEWFModel =(IDEWF)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.ywsp.demodel.OA_CCSQCCSQLCDEWFModel");
        cCSQLCDEWFModel.init(this);
        this.registerDEWF(cCSQLCDEWFModel);

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
        //注册视图 出差申请实体表格视图
        this.registerPDTDEView("MDATAVIEW","3baa7aeffe815c302f4634bab813cc58");
        //注册视图 出差申请实体移动端编辑视图（审核结束）
        this.registerPDTDEView("MOBEDITVIEW","6FBC804F-E289-4E16-8F87-9E8A84AC055F");
        //注册视图 出差申请实体移动端工作流编辑视图（分页关系）(出差申请流程)
        this.registerPDTDEView("MOBWFEDITVIEW:CCSQLC:D","a430fe685662066e013e466d9a837a75");
        //注册视图 出差申请实体移动端工作流编辑视图（分页关系）(出差申请流程v1:部门领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:CCSQLC:W:10","60317f99e72abc41e4a115bd0bbd8981");
        //注册视图 出差申请实体移动端工作流编辑视图（分页关系）(出差申请流程v1:承办处领导审核)
        this.registerPDTDEView("MOBWFEDITVIEW:CCSQLC:W:20","36f337d72b370d025628a4388a451d26");
        //注册视图 出差申请实体移动端工作流多数据视图(出差申请流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:CCSQLC:D","bcc53022fbae688928778c1cb42728e0");
        //注册视图 出差申请实体移动端工作流多数据视图(出差申请流程)
        this.registerPDTDEView("MOBWFMDATAVIEW:CCSQLC:W","c256977b159f38a2030092dcc38c72d0");
        //注册视图 出差申请实体数据多项选择视图
        this.registerPDTDEView("MPICKUPVIEW","37eee84ba87e5ceb972e69f4865eac50");
        //注册视图 出差申请实体数据选择视图
        this.registerPDTDEView("PICKUPVIEW","0ba9a41aad16e1abab0c5378b3621118");
        //注册视图 出差申请实体数据重定向视图
        this.registerPDTDEView("REDIRECTVIEW","d708f4c9dd92df59d7e0514296ac8540");
        //注册视图 出差申请实体工作流视图（分页关系）(出差申请流程)
        this.registerPDTDEView("WFEDITVIEW:CCSQLC:D","633168eaa5cd25f9abb8e4b5a66316ad");
        //注册视图 出差申请实体工作流视图（分页关系）(出差申请流程v1:部门领导审核)
        this.registerPDTDEView("WFEDITVIEW:CCSQLC:W:10","a7b6ab83f4f46834a7e300f1c84c717d");
        //注册视图 出差申请实体工作流视图（分页关系）(出差申请流程v1:承办处领导审核)
        this.registerPDTDEView("WFEDITVIEW:CCSQLC:W:20","1ffd73d89d7e441b9d7ebe2728717237");
        //注册视图 出差申请实体工作流表格视图(出差申请流程)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:D","acad908bfac8639b26a0fc922c98d6fe");
        //注册视图 出差申请实体工作流表格视图(出差申请流程:未提交)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:D:10","e0ae96d3fbef6e90baaf45a1c22d4585");
        //注册视图 出差申请实体工作流表格视图(出差申请流程:审核中)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:D:20","e5a21486561888bf9c98952cf5fd6e5e");
        //注册视图 出差申请实体工作流表格视图(出差申请流程:已完成)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:D:30","d48415d082758da71c09e4e22b35497f");
        //注册视图 出差申请实体工作流表格视图(出差申请流程)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:W","a15f87b07829dea689f89148d3ae9f0a");
        //注册视图 出差申请实体工作流表格视图(出差申请流程:部门领导审核)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:W:10","39e55b258a1fcee5994c5f23ccdcf663");
        //注册视图 出差申请实体工作流表格视图(出差申请流程:承办处领导审核)
        this.registerPDTDEView("WFMDATAVIEW:CCSQLC:W:20","9595c6e49376d8ef906c27492d2e96dd");
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

        //放入属性 OA_CCSQNAME - 出差申请名称
        if(true) {
            DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
            deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
            deDataSetCondImpl.setCondOp(ICondition.CONDOP_LIKE);
            deDataSetCondImpl.setDEFName(OA_CCSQ.FIELD_OA_CCSQNAME);
            deDataSetCondImpl.setCondValue(strQuickSearch);
            groupCondImpl.addChildDEDataQueryCond(deDataSetCondImpl);
        }
    }
}