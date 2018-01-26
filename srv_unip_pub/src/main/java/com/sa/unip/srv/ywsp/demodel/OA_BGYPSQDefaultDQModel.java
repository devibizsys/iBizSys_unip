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

@DEDataQuery(id="0025E501-DF30-4D98-B7EA-0927518DE623",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BGYPMC`, t1.`BGYPSFSHTG`, t1.`BGYPSQBZ`, t1.`BGYPSQZT`, t1.`BZ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DH`, t1.`FJH`, t1.`MEMO`, t1.`OA_BGYPSQID`, t1.`OA_BGYPSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`RQ`, t1.`SL`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE` FROM `T_OA_BGYPSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BGYPMC",expression="t1.`BGYPMC`")
        ,@DEDataQueryCodeExp(name="BGYPSFSHTG",expression="t1.`BGYPSFSHTG`")
        ,@DEDataQueryCodeExp(name="BGYPSQBZ",expression="t1.`BGYPSQBZ`")
        ,@DEDataQueryCodeExp(name="BGYPSQZT",expression="t1.`BGYPSQZT`")
        ,@DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DH",expression="t1.`DH`")
        ,@DEDataQueryCodeExp(name="FJH",expression="t1.`FJH`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_BGYPSQID",expression="t1.`OA_BGYPSQID`")
        ,@DEDataQueryCodeExp(name="OA_BGYPSQNAME",expression="t1.`OA_BGYPSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="RQ",expression="t1.`RQ`")
        ,@DEDataQueryCodeExp(name="SL",expression="t1.`SL`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_BGYPSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_BGYPSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_BGYPSQDefaultDQModel.class);
    }

}