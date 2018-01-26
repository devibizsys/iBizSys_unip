/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.demodel;


import java.io.Serializable;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.core.IDEDataSetCond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
import com.sa.unip.srv.UniPSampleSysModel;


import com.sa.unip.srv.subsys.service.OrgUserService;
import net.ibizsys.psrt.srv.common.dao.OrgUserDAO;
import net.ibizsys.psrt.srv.common.entity.OrgUser;


/**
 * 组织人员 实体模型
 * 注意，此文件不能修改
 */
public class OrgUserDEModel extends net.ibizsys.psrt.srv.common.demodel.OrgUserDEModel  {

    public OrgUserDEModel() throws Exception {
        super();

        DEModelGlobal.registerDEModel("com.sa.unip.srv.subsys.demodel.OrgUserDEModel",this);
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

    /**
     * 获取实体[OrgUser]模型对象
     * @return
     * @throws Exception
     */
    public static OrgUserDEModel getInstance() throws Exception {
        return (OrgUserDEModel)DEModelGlobal.getDEModel(OrgUserDEModel.class);
    }

    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.subsys.service.OrgUserService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        super.prepareDEDataSets();
        //注册  UX_ORGXJRY
        IDEDataSet uX_ORGXJRYDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserUX_ORGXJRYDSModel");
        uX_ORGXJRYDSModel.init(this);
        this.registerDEDataSet(uX_ORGXJRYDSModel);
        //注册  QLCBRXZGL
        IDEDataSet qLCBRXZGLDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserQLCBRXZGLDSModel");
        qLCBRXZGLDSModel.init(this);
        this.registerDEDataSet(qLCBRXZGLDSModel);
        //注册  PCFZRXZGL
        IDEDataSet pCFZRXZGLDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserPCFZRXZGLDSModel");
        pCFZRXZGLDSModel.init(this);
        this.registerDEDataSet(pCFZRXZGLDSModel);
        //注册  UX_ORGUSERSPEC
        IDEDataSet uX_ORGUSERSPECDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserUX_ORGUSERSPECDSModel");
        uX_ORGUSERSPECDSModel.init(this);
        this.registerDEDataSet(uX_ORGUSERSPECDSModel);
        //注册  DQCBR
        IDEDataSet dQCBRDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserDQCBRDSModel");
        dQCBRDSModel.init(this);
        this.registerDEDataSet(dQCBRDSModel);
        //注册  ORGSECTORUSER
        IDEDataSet orgSectorUserDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserOrgSectorUserDSModel");
        orgSectorUserDSModel.init(this);
        this.registerDEDataSet(orgSectorUserDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        super.prepareDEDataQueries();
        //注册  UX_ORGXJRY
        IDEDataQuery uX_ORGXJRYDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserUX_ORGXJRYDQModel");
        uX_ORGXJRYDQModel.init(this);
        this.registerDEDataQuery(uX_ORGXJRYDQModel);
        //注册  QLCBRXZGL
        IDEDataQuery qLCBRXZGLDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserQLCBRXZGLDQModel");
        qLCBRXZGLDQModel.init(this);
        this.registerDEDataQuery(qLCBRXZGLDQModel);
        //注册  UX_ORGUSERSPEC
        IDEDataQuery uX_ORGUSERSPECDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserUX_ORGUSERSPECDQModel");
        uX_ORGUSERSPECDQModel.init(this);
        this.registerDEDataQuery(uX_ORGUSERSPECDQModel);
        //注册  PCFZRXZGL
        IDEDataQuery pCFZRXZGLDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserPCFZRXZGLDQModel");
        pCFZRXZGLDQModel.init(this);
        this.registerDEDataQuery(pCFZRXZGLDQModel);
        //注册  DQCBR
        IDEDataQuery dQCBRDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserDQCBRDQModel");
        dQCBRDQModel.init(this);
        this.registerDEDataQuery(dQCBRDQModel);
        //注册  ORGSECTORUSER
        IDEDataQuery orgSectorUserDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUserOrgSectorUserDQModel");
        orgSectorUserDQModel.init(this);
        this.registerDEDataQuery(orgSectorUserDQModel);
    }

}