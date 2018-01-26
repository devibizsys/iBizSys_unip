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

@DEDataQuery(id="BA96D43F-98A9-40F0-853E-6FF1CCD22305",name="CurYbhysq")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t11.`RESERVER30` AS `DHHM`, t1.`ENABLE`, t1.`FJ`, t1.`HYLX`, t1.`HYNR`, t1.`HYSJ`, t1.`HYSQBZ`, t1.`HYSQZT`, t1.`HYYQ`, t1.`MEMO`, t1.`OA_HYSID`, t31.`OA_HYSNAME`, t1.`OA_YBHYSQID`, t1.`OA_YBHYSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SFSHTG`, t1.`SQSJ`, t1.`TZZRS`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WCHRS`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YCDRS`, t1.`YCHRS`, t1.`YQJRS` FROM `T_OA_YBHYSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  LEFT JOIN T_OA_HYS t31 ON t1.OA_HYSID = t31.OA_HYSID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CHRYZWSJ",expression="t1.`CHRYZWSJ`")
        ,@DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DHHM",expression="t11.`RESERVER30`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="HYLX",expression="t1.`HYLX`")
        ,@DEDataQueryCodeExp(name="HYNR",expression="t1.`HYNR`")
        ,@DEDataQueryCodeExp(name="HYSJ",expression="t1.`HYSJ`")
        ,@DEDataQueryCodeExp(name="HYSQBZ",expression="t1.`HYSQBZ`")
        ,@DEDataQueryCodeExp(name="HYSQZT",expression="t1.`HYSQZT`")
        ,@DEDataQueryCodeExp(name="HYYQ",expression="t1.`HYYQ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_HYSID",expression="t1.`OA_HYSID`")
        ,@DEDataQueryCodeExp(name="OA_HYSNAME",expression="t31.`OA_HYSNAME`")
        ,@DEDataQueryCodeExp(name="OA_YBHYSQID",expression="t1.`OA_YBHYSQID`")
        ,@DEDataQueryCodeExp(name="OA_YBHYSQNAME",expression="t1.`OA_YBHYSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SFSHTG",expression="t1.`SFSHTG`")
        ,@DEDataQueryCodeExp(name="SQSJ",expression="t1.`SQSJ`")
        ,@DEDataQueryCodeExp(name="TZZRS",expression="t1.`TZZRS`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WCHRS",expression="t1.`WCHRS`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YCDRS",expression="t1.`YCDRS`")
        ,@DEDataQueryCodeExp(name="YCHRS",expression="t1.`YCHRS`")
        ,@DEDataQueryCodeExp(name="YQJRS",expression="t1.`YQJRS`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
        ,@DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_YBHYSQ\"}')} )")
    })
})
/**
 *  实体数据查询 [我的会议申请记录]模型基类
 */
public class OA_YBHYSQCurYbhysqDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_YBHYSQCurYbhysqDQModel() {
        super();

        this.initAnnotation(OA_YBHYSQCurYbhysqDQModel.class);
    }

}