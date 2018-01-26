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

@DEDataQuery(id="C6B7DB8A-3C13-425B-91FB-DEF59591E10B",name="CurJpyd")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CFSJ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FCSJ`, t1.`FJ`, t1.`JBRID`, t31.`ORGUSERNAME` AS `JBRNAME`, t1.`JE`, t1.`JPYDBZ`, t1.`JPYDSFSHTG`, t1.`JPYDZT`, t1.`MDD`, t1.`MEMO`, t1.`OA_JPYDID`, t1.`OA_JPYDNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SFZHM`, t1.`SQSY`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`ZW` FROM `T_OA_JPYD` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  LEFT JOIN T_SRFORGUSER t31 ON t1.JBRID = t31.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CFSJ",expression="t1.`CFSJ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FCSJ",expression="t1.`FCSJ`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JBRID",expression="t1.`JBRID`")
        ,@DEDataQueryCodeExp(name="JBRNAME",expression="t31.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="JE",expression="t1.`JE`")
        ,@DEDataQueryCodeExp(name="JPYDBZ",expression="t1.`JPYDBZ`")
        ,@DEDataQueryCodeExp(name="JPYDSFSHTG",expression="t1.`JPYDSFSHTG`")
        ,@DEDataQueryCodeExp(name="JPYDZT",expression="t1.`JPYDZT`")
        ,@DEDataQueryCodeExp(name="MDD",expression="t1.`MDD`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_JPYDID",expression="t1.`OA_JPYDID`")
        ,@DEDataQueryCodeExp(name="OA_JPYDNAME",expression="t1.`OA_JPYDNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SFZHM",expression="t1.`SFZHM`")
        ,@DEDataQueryCodeExp(name="SQSY",expression="t1.`SQSY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="ZW",expression="t1.`ZW`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_JPYD\"}')} )")
    })
})
/**
 *  实体数据查询 [我的机票预订记录]模型基类
 */
public class OA_JPYDCurJpydDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_JPYDCurJpydDQModel() {
        super();

        this.initAnnotation(OA_JPYDCurJpydDQModel.class);
    }

}