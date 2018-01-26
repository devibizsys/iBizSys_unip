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

@DEDataSet(id="CD44390E-C3BC-439F-B054-85BBA2A0A98A",name="UX_PRO",queries= {
    @DEDataSetQuery(queryid="5B030788-BFB6-4AF1-9FD9-512160578972",queryname="UX_PRO")
})

public class OrgUX_PRODSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_PRODSModel() {
        super();
        this.initAnnotation(OrgUX_PRODSModel.class);
    }




}