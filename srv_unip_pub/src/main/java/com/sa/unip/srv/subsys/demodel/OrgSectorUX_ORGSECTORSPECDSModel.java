/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.demodel;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="B9216193-E62E-4EE1-AD4F-059EE63BDF67",name="UX_ORGSECTORSPEC",queries= {
    @DEDataSetQuery(queryid="46BDF465-8042-48E5-AC2F-C8C9647B5DBB",queryname="UX_ORGSECTORSPEC")
})

public class OrgSectorUX_ORGSECTORSPECDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgSectorUX_ORGSECTORSPECDSModel() {
        super();
        this.initAnnotation(OrgSectorUX_ORGSECTORSPECDSModel.class);
    }




}