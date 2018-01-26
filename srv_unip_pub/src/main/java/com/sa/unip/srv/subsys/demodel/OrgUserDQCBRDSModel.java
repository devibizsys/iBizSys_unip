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

@DEDataSet(id="A00226FD-C588-4F33-885B-037F00EDA2D0",name="DQCBR",queries= {
    @DEDataSetQuery(queryid="E61D00E5-CC70-4F43-8763-3FC4C87FAA25",queryname="DQCBR")
})

public class OrgUserDQCBRDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserDQCBRDSModel() {
        super();
        this.initAnnotation(OrgUserDQCBRDSModel.class);
    }




}