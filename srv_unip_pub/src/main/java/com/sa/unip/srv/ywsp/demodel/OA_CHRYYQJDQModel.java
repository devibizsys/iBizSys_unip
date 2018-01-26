/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="F39E940A-0A98-490A-B61D-59D1A2101331",name="YQJ")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CHSJ`, t1.`CHZT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`OA_CHRYID`, t1.`OA_CHRYNAME`, t21.`ORGSECUSERTYPENAME`, t1.`ORGUSERID`, t21.`ORGUSERNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`YBHYSQID`, t11.`OA_YBHYSQNAME` AS `YBHYSQNAME`, t1.`ZWH`, t1.`ZWHMS` FROM `T_OA_CHRY` t1  LEFT JOIN T_OA_YBHYSQ t11 ON t1.YBHYSQID = t11.OA_YBHYSQID  LEFT JOIN T_SRFORGUSER t21 ON t1.ORGUSERID = t21.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CHSJ",expression="t1.`CHSJ`")
        ,@DEDataQueryCodeExp(name="CHZT",expression="t1.`CHZT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="OA_CHRYID",expression="t1.`OA_CHRYID`")
        ,@DEDataQueryCodeExp(name="OA_CHRYNAME",expression="t1.`OA_CHRYNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t21.`ORGSECUSERTYPENAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t21.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="YBHYSQID",expression="t1.`YBHYSQID`")
        ,@DEDataQueryCodeExp(name="YBHYSQNAME",expression="t11.`OA_YBHYSQNAME`")
        ,@DEDataQueryCodeExp(name="ZWH",expression="t1.`ZWH`")
        ,@DEDataQueryCodeExp(name="ZWHMS",expression="t1.`ZWHMS`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`CHZT` = '20' )")
    })
})
/**
 *  实体数据查询 [已请假人数统计]模型基类
 */
public class OA_CHRYYQJDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CHRYYQJDQModel() {
        super();

        this.initAnnotation(OA_CHRYYQJDQModel.class);
    }

}