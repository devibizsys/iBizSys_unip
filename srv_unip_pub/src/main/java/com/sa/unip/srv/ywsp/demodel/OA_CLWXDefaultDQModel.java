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

@DEDataQuery(id="467EBD9C-BCD9-43AA-ADEF-73FCBDE3382E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CLPP`, t1.`CLWXBZ`, t1.`CLWXSFSHTG`, t1.`CLWXZT`, t1.`CPH`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DPH`, t1.`DZ`, t1.`FDJH`, t1.`FJ`, t1.`JE`, t1.`MEMO`, t1.`OA_CLID`, t31.`OA_CLNAME`, t1.`OA_CLWXID`, t1.`OA_CLWXNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`WXXM` FROM `T_OA_CLWX` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  LEFT JOIN T_OA_CL t31 ON t1.OA_CLID = t31.OA_CLID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CLPP",expression="t1.`CLPP`")
        ,@DEDataQueryCodeExp(name="CLWXBZ",expression="t1.`CLWXBZ`")
        ,@DEDataQueryCodeExp(name="CLWXSFSHTG",expression="t1.`CLWXSFSHTG`")
        ,@DEDataQueryCodeExp(name="CLWXZT",expression="t1.`CLWXZT`")
        ,@DEDataQueryCodeExp(name="CPH",expression="t1.`CPH`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DPH",expression="t1.`DPH`")
        ,@DEDataQueryCodeExp(name="DZ",expression="t1.`DZ`")
        ,@DEDataQueryCodeExp(name="FDJH",expression="t1.`FDJH`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JE",expression="t1.`JE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CLID",expression="t1.`OA_CLID`")
        ,@DEDataQueryCodeExp(name="OA_CLNAME",expression="t31.`OA_CLNAME`")
        ,@DEDataQueryCodeExp(name="OA_CLWXID",expression="t1.`OA_CLWXID`")
        ,@DEDataQueryCodeExp(name="OA_CLWXNAME",expression="t1.`OA_CLWXNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="WXXM",expression="t1.`WXXM`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_CLWXDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CLWXDefaultDQModel() {
        super();

        this.initAnnotation(OA_CLWXDefaultDQModel.class);
    }

}