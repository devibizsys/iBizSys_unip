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

@DEDataSet(id="8A009AFB-A67E-46FC-8936-DB9B2D1E5163",name="UX_ORGSECTORXJBM",queries= {
    @DEDataSetQuery(queryid="B1C73F8A-D9B3-4CB3-98A1-93953CB6AE31",queryname="UX_ORGSECTORXJBM")
})

public class OrgSectorUX_ORGSECTORXJBMDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgSectorUX_ORGSECTORXJBMDSModel() {
        super();
        this.initAnnotation(OrgSectorUX_ORGSECTORXJBMDSModel.class);
    }




}