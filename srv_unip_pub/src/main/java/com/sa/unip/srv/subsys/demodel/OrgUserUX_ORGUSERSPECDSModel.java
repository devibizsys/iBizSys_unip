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

@DEDataSet(id="9099093A-7313-4B9A-843B-C5E3E3DF7F96",name="UX_ORGUSERSPEC",queries= {
    @DEDataSetQuery(queryid="BE1C6462-5686-46B9-8E46-1CFCB77523B9",queryname="UX_ORGUSERSPEC")
})

public class OrgUserUX_ORGUSERSPECDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserUX_ORGUSERSPECDSModel() {
        super();
        this.initAnnotation(OrgUserUX_ORGUSERSPECDSModel.class);
    }




}