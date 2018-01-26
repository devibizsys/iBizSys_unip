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

@DEDataSet(id="68E0200F-9B9A-496E-9387-229C6FFFC743",name="UX_ORGXJDW",queries= {
    @DEDataSetQuery(queryid="6883D7B5-681C-49F6-A305-303F3C83F81A",queryname="UX_ORGXJDW")
})

public class OrgUX_ORGXJDWDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_ORGXJDWDSModel() {
        super();
        this.initAnnotation(OrgUX_ORGXJDWDSModel.class);
    }




}