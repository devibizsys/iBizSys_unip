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


import com.sa.unip.srv.subsys.service.OrgService;
import net.ibizsys.psrt.srv.common.dao.OrgDAO;
import net.ibizsys.psrt.srv.common.entity.Org;


/**
 * 组织机构 实体模型
 * 注意，此文件不能修改
 */
public class OrgDEModel extends net.ibizsys.psrt.srv.common.demodel.OrgDEModel  {

    public OrgDEModel() throws Exception {
        super();

        DEModelGlobal.registerDEModel("com.sa.unip.srv.subsys.demodel.OrgDEModel",this);
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
     * 获取实体[Org]模型对象
     * @return
     * @throws Exception
     */
    public static OrgDEModel getInstance() throws Exception {
        return (OrgDEModel)DEModelGlobal.getDEModel(OrgDEModel.class);
    }

    @Override
    public String getServiceId() {
        return "com.sa.unip.srv.subsys.service.OrgService";
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataSets()
     */
    @Override
    protected void prepareDEDataSets() throws Exception {
        super.prepareDEDataSets();
        //注册  CurAndLowerOrg
        IDEDataSet curAndLowerOrgDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgCurAndLowerOrgDSModel");
        curAndLowerOrgDSModel.init(this);
        this.registerDEDataSet(curAndLowerOrgDSModel);
        //注册  AHUX_All
        IDEDataSet aHUX_AllDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgAHUX_AllDSModel");
        aHUX_AllDSModel.init(this);
        this.registerDEDataSet(aHUX_AllDSModel);
        //注册  UX_PRO_PCY
        IDEDataSet uX_PRO_PCYDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_PRO_PCYDSModel");
        uX_PRO_PCYDSModel.init(this);
        this.registerDEDataSet(uX_PRO_PCYDSModel);
        //注册  UX_All
        IDEDataSet uX_AllDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_AllDSModel");
        uX_AllDSModel.init(this);
        this.registerDEDataSet(uX_AllDSModel);
        //注册  UX_ORGXJDW
        IDEDataSet uX_ORGXJDWDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_ORGXJDWDSModel");
        uX_ORGXJDWDSModel.init(this);
        this.registerDEDataSet(uX_ORGXJDWDSModel);
        //注册  UX_CITYDW
        IDEDataSet uX_CITYDWDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CITYDWDSModel");
        uX_CITYDWDSModel.init(this);
        this.registerDEDataSet(uX_CITYDWDSModel);
        //注册  UX_AllRoot
        IDEDataSet uX_AllRootDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_AllRootDSModel");
        uX_AllRootDSModel.init(this);
        this.registerDEDataSet(uX_AllRootDSModel);
        //注册  UX_PRO
        IDEDataSet uX_PRODSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_PRODSModel");
        uX_PRODSModel.init(this);
        this.registerDEDataSet(uX_PRODSModel);
        //注册  UX_CITY
        IDEDataSet uX_CITYDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CITYDSModel");
        uX_CITYDSModel.init(this);
        this.registerDEDataSet(uX_CITYDSModel);
        //注册  UX_All_CDOELIST
        IDEDataSet uX_All_CDOELISTDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_All_CDOELISTDSModel");
        uX_All_CDOELISTDSModel.init(this);
        this.registerDEDataSet(uX_All_CDOELISTDSModel);
        //注册  UX_CXSYQZ
        IDEDataSet uX_CXSYQZDSModel = (IDEDataSet)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CXSYQZDSModel");
        uX_CXSYQZDSModel.init(this);
        this.registerDEDataSet(uX_CXSYQZDSModel);
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.demodel.DataEntityModelBase#prepareDEDataQueries()
     */
    @Override
    protected void prepareDEDataQueries() throws Exception {
        super.prepareDEDataQueries();
        //注册  UX_QSDW
        IDEDataQuery uX_QSDWDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_QSDWDQModel");
        uX_QSDWDQModel.init(this);
        this.registerDEDataQuery(uX_QSDWDQModel);
        //注册  UX_All_CDOELIST
        IDEDataQuery uX_All_CDOELISTDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_All_CDOELISTDQModel");
        uX_All_CDOELISTDQModel.init(this);
        this.registerDEDataQuery(uX_All_CDOELISTDQModel);
        //注册  CurAndLowerOrg
        IDEDataQuery curAndLowerOrgDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgCurAndLowerOrgDQModel");
        curAndLowerOrgDQModel.init(this);
        this.registerDEDataQuery(curAndLowerOrgDQModel);
        //注册  AHUX_All
        IDEDataQuery aHUX_AllDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgAHUX_AllDQModel");
        aHUX_AllDQModel.init(this);
        this.registerDEDataQuery(aHUX_AllDQModel);
        //注册  UX_PRO
        IDEDataQuery uX_PRODQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_PRODQModel");
        uX_PRODQModel.init(this);
        this.registerDEDataQuery(uX_PRODQModel);
        //注册  UX_AllRoot
        IDEDataQuery uX_AllRootDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_AllRootDQModel");
        uX_AllRootDQModel.init(this);
        this.registerDEDataQuery(uX_AllRootDQModel);
        //注册  UX_ORGXJDW
        IDEDataQuery uX_ORGXJDWDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_ORGXJDWDQModel");
        uX_ORGXJDWDQModel.init(this);
        this.registerDEDataQuery(uX_ORGXJDWDQModel);
        //注册  UX_CITYDW
        IDEDataQuery uX_CITYDWDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CITYDWDQModel");
        uX_CITYDWDQModel.init(this);
        this.registerDEDataQuery(uX_CITYDWDQModel);
        //注册  UX_All_SJ_AH
        IDEDataQuery uX_All_SJ_AHDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_All_SJ_AHDQModel");
        uX_All_SJ_AHDQModel.init(this);
        this.registerDEDataQuery(uX_All_SJ_AHDQModel);
        //注册  UX_PRO_PCY
        IDEDataQuery uX_PRO_PCYDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_PRO_PCYDQModel");
        uX_PRO_PCYDQModel.init(this);
        this.registerDEDataQuery(uX_PRO_PCYDQModel);
        //注册  UX_CXSYQZ
        IDEDataQuery uX_CXSYQZDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CXSYQZDQModel");
        uX_CXSYQZDQModel.init(this);
        this.registerDEDataQuery(uX_CXSYQZDQModel);
        //注册  UX_CITY
        IDEDataQuery uX_CITYDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_CITYDQModel");
        uX_CITYDQModel.init(this);
        this.registerDEDataQuery(uX_CITYDQModel);
        //注册  UX_All
        IDEDataQuery uX_AllDQModel =(IDEDataQuery)this.getUniPSampleSysModel().createObject("com.sa.unip.srv.subsys.demodel.OrgUX_AllDQModel");
        uX_AllDQModel.init(this);
        this.registerDEDataQuery(uX_AllDQModel);
    }

}