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

@DEDataSet(id="B422F4EC-2A7F-4660-9D98-0FC9EB63EF8C",name="UX_AllRoot",queries= {
    @DEDataSetQuery(queryid="64B06145-A599-48A7-9DB5-14CAD2FC40EC",queryname="UX_AllRoot")
})

public class OrgUX_AllRootDSModel extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public OrgUX_AllRootDSModel() {
        super();
        this.initAnnotation(OrgUX_AllRootDSModel.class);
    }




}