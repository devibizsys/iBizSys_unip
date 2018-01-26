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

@DEDataQuery(id="FBBB94B1-9CD7-430E-9ED3-3FBD022396EA",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DH`, t1.`FJH`, t1.`MEMO`, t1.`OA_YYSSQID`, t1.`OA_YYSSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SL`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YYSSFSHTG`, t1.`YYSSQBZ`, t1.`YYSSQZT` FROM `T_OA_YYSSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DH",expression="t1.`DH`")
        ,@DEDataQueryCodeExp(name="FJH",expression="t1.`FJH`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_YYSSQID",expression="t1.`OA_YYSSQID`")
        ,@DEDataQueryCodeExp(name="OA_YYSSQNAME",expression="t1.`OA_YYSSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SL",expression="t1.`SL`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YYSSFSHTG",expression="t1.`YYSSFSHTG`")
        ,@DEDataQueryCodeExp(name="YYSSQBZ",expression="t1.`YYSSQBZ`")
        ,@DEDataQueryCodeExp(name="YYSSQZT",expression="t1.`YYSSQZT`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_YYSSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_YYSSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_YYSSQDefaultDQModel.class);
    }

}