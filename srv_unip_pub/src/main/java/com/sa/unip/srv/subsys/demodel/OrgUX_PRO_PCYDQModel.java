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

import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="E1A91434-0AE8-46B7-BDA4-8EC75C4E4878",name="UX_PRO_PCY")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={},
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.PORGID AS PORGID, t11.ORGNAME AS PORGNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2 FROM T_SRFORG t1  LEFT JOIN T_SRFORG t11 ON t1.PORGID = t11.ORGID  ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={},
    conds={
        @DEDataQueryCodeCond(condition="( substr(t1.ORGID,0,4) = substr( ${srfsessioncontext('SRFORGID','{\"defname\":\"ORGID\",\"dename\":\"ORG\"}')} ,0,4) )")
        ,@DEDataQueryCodeCond(condition="( t1.PORGID IS NOT NULL )")
    })
})

public class OrgUX_PRO_PCYDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgUX_PRO_PCYDQModel() {
        super();

        this.initAnnotation(OrgUX_PRO_PCYDQModel.class);
    }

}