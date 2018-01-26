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

@DEDataQuery(id="1E90A181-4600-4A5C-A012-2AB3EE463025",name="CurCcsq")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CCDZ`, t1.`CCSQBZ`, t1.`CCSQSFSHTG`, t1.`CCSQZT`, t1.`CCSY`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FJ`, t1.`JSSJ`, t1.`KSSJ`, t1.`MEMO`, t1.`OA_CCSQID`, t1.`OA_CCSQNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SC`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE` FROM `T_OA_CCSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CCDZ",expression="t1.`CCDZ`")
        ,@DEDataQueryCodeExp(name="CCSQBZ",expression="t1.`CCSQBZ`")
        ,@DEDataQueryCodeExp(name="CCSQSFSHTG",expression="t1.`CCSQSFSHTG`")
        ,@DEDataQueryCodeExp(name="CCSQZT",expression="t1.`CCSQZT`")
        ,@DEDataQueryCodeExp(name="CCSY",expression="t1.`CCSY`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JSSJ",expression="t1.`JSSJ`")
        ,@DEDataQueryCodeExp(name="KSSJ",expression="t1.`KSSJ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CCSQID",expression="t1.`OA_CCSQID`")
        ,@DEDataQueryCodeExp(name="OA_CCSQNAME",expression="t1.`OA_CCSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SC",expression="t1.`SC`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_CCSQ\"}')} )")
    })
})
/**
 *  实体数据查询 [我的出差记录]模型基类
 */
public class OA_CCSQCurCcsqDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CCSQCurCcsqDQModel() {
        super();

        this.initAnnotation(OA_CCSQCurCcsqDQModel.class);
    }

}