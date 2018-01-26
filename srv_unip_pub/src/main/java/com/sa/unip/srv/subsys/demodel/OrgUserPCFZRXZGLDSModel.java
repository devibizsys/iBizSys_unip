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

@DEDataSet(id="4C21A032-2459-4C29-BB0B-8AD4E46B8B46",name="PCFZRXZGL",queries= {
    @DEDataSetQuery(queryid="C3748F85-85B8-47D2-8FE7-C6A78EA6C3B0",queryname="PCFZRXZGL")
})

public class OrgUserPCFZRXZGLDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserPCFZRXZGLDSModel() {
        super();
        this.initAnnotation(OrgUserPCFZRXZGLDSModel.class);
    }




}