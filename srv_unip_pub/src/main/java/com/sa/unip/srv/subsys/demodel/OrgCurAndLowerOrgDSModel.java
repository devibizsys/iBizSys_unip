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

@DEDataSet(id="0607119D-0FFF-435C-86A7-FA098BFA6048",name="CurAndLowerOrg",queries= {
    @DEDataSetQuery(queryid="4660AA94-AAF9-40A6-9B9A-B26C35F618A7",queryname="CurAndLowerOrg")
})

public class OrgCurAndLowerOrgDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgCurAndLowerOrgDSModel() {
        super();
        this.initAnnotation(OrgCurAndLowerOrgDSModel.class);
    }




}