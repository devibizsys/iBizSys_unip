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

@DEDataQuery(id="36BC52EF-2165-4B3D-943C-AFDD9EA9D88F",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CLPP`, t1.`COLOR`, t1.`CPH`, t1.`CPMJSFSHTG`, t1.`CPMJSQBZ`, t1.`CPMJSQZT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FJ`, t1.`LXFS`, t1.`MEMO`, t1.`OA_CLID`, t31.`OA_CLNAME`, t1.`OA_CPMJSQID`, t1.`OA_CPMJSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`ZW` FROM `T_OA_CPMJSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  LEFT JOIN T_OA_CL t31 ON t1.OA_CLID = t31.OA_CLID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CLPP",expression="t1.`CLPP`")
        ,@DEDataQueryCodeExp(name="COLOR",expression="t1.`COLOR`")
        ,@DEDataQueryCodeExp(name="CPH",expression="t1.`CPH`")
        ,@DEDataQueryCodeExp(name="CPMJSFSHTG",expression="t1.`CPMJSFSHTG`")
        ,@DEDataQueryCodeExp(name="CPMJSQBZ",expression="t1.`CPMJSQBZ`")
        ,@DEDataQueryCodeExp(name="CPMJSQZT",expression="t1.`CPMJSQZT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="LXFS",expression="t1.`LXFS`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CLID",expression="t1.`OA_CLID`")
        ,@DEDataQueryCodeExp(name="OA_CLNAME",expression="t31.`OA_CLNAME`")
        ,@DEDataQueryCodeExp(name="OA_CPMJSQID",expression="t1.`OA_CPMJSQID`")
        ,@DEDataQueryCodeExp(name="OA_CPMJSQNAME",expression="t1.`OA_CPMJSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="ZW",expression="t1.`ZW`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_CPMJSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CPMJSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_CPMJSQDefaultDQModel.class);
    }

}