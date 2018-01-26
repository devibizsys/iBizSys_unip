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

@DEDataQuery(id="2F6A41E4-9FFA-45F5-9EB7-5B602A59BEAC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CFSJ`, t1.`CLPP`, t1.`CPH`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DZ`, t1.`FCSJ`, t1.`FJ`, t1.`JE`, t1.`MEMO`, t1.`OA_CLID`, t31.`OA_CLNAME`, t1.`OA_PCSQID`, t1.`OA_PCSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`PCSQBZ`, t1.`PCSQSFSHTG`, t1.`PCSQZT`, t1.`SY`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YCLX` FROM `T_OA_PCSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  LEFT JOIN T_OA_CL t31 ON t1.OA_CLID = t31.OA_CLID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CFSJ",expression="t1.`CFSJ`")
        ,@DEDataQueryCodeExp(name="CLPP",expression="t1.`CLPP`")
        ,@DEDataQueryCodeExp(name="CPH",expression="t1.`CPH`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DZ",expression="t1.`DZ`")
        ,@DEDataQueryCodeExp(name="FCSJ",expression="t1.`FCSJ`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JE",expression="t1.`JE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CLID",expression="t1.`OA_CLID`")
        ,@DEDataQueryCodeExp(name="OA_CLNAME",expression="t31.`OA_CLNAME`")
        ,@DEDataQueryCodeExp(name="OA_PCSQID",expression="t1.`OA_PCSQID`")
        ,@DEDataQueryCodeExp(name="OA_PCSQNAME",expression="t1.`OA_PCSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="PCSQBZ",expression="t1.`PCSQBZ`")
        ,@DEDataQueryCodeExp(name="PCSQSFSHTG",expression="t1.`PCSQSFSHTG`")
        ,@DEDataQueryCodeExp(name="PCSQZT",expression="t1.`PCSQZT`")
        ,@DEDataQueryCodeExp(name="SY",expression="t1.`SY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YCLX",expression="t1.`YCLX`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_PCSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_PCSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_PCSQDefaultDQModel.class);
    }

}