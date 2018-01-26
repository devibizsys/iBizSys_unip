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

@DEDataSet(id="FFD9BCFA-670A-45F3-8FDE-ED6D436A08B0",name="ORGSECTORUSER",queries= {
    @DEDataSetQuery(queryid="FFD9BCFA-670A-45F3-8FDE-ED6D436A08B0",queryname="ORGSECTORUSER")
})

public class OrgUserOrgSectorUserDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUserOrgSectorUserDSModel() {
        super();
        this.initAnnotation(OrgUserOrgSectorUserDSModel.class);
    }




}