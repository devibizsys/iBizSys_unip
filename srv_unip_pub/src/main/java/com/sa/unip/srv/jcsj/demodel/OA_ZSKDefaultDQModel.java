/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="EE969593-97A0-4FC2-9968-D13D3160D195",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CONTENT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FJ`, t1.`LRSJ`, t1.`MEMO`, t1.`OA_ZSKID`, t1.`OA_ZSKNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_ZSK` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="LRSJ",expression="t1.`LRSJ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_ZSKID",expression="t1.`OA_ZSKID`")
        ,@DEDataQueryCodeExp(name="OA_ZSKNAME",expression="t1.`OA_ZSKNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_ZSKDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_ZSKDefaultDQModel() {
        super();

        this.initAnnotation(OA_ZSKDefaultDQModel.class);
    }

}