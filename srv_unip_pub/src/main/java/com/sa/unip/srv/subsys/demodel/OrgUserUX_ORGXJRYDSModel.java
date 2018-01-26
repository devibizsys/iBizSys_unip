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

@DEDataSet(id="35FC7293-5F7E-4A12-898D-9B638F620D35",name="UX_ORGXJRY",queries= {
    @DEDataSetQuery(queryid="440CD66A-8126-46AA-869D-17E74818AA0C",queryname="UX_ORGXJRY")
})

public class OrgUserUX_ORGXJRYDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserUX_ORGXJRYDSModel() {
        super();
        this.initAnnotation(OrgUserUX_ORGXJRYDSModel.class);
    }




}