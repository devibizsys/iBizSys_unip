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

@DEDataQuery(id="1ECBFCD4-644B-4DCC-A749-C7B31586951C",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CLPP`, t1.`COLOR`, t1.`CPH`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DPH`, t1.`FDJH`, t1.`FJ`, t1.`OA_CLID`, t1.`OA_CLNAME`, t1.`SYQK`, t1.`SYSJ`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_CL` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CLPP",expression="t1.`CLPP`")
        ,@DEDataQueryCodeExp(name="COLOR",expression="t1.`COLOR`")
        ,@DEDataQueryCodeExp(name="CPH",expression="t1.`CPH`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DPH",expression="t1.`DPH`")
        ,@DEDataQueryCodeExp(name="FDJH",expression="t1.`FDJH`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="OA_CLID",expression="t1.`OA_CLID`")
        ,@DEDataQueryCodeExp(name="OA_CLNAME",expression="t1.`OA_CLNAME`")
        ,@DEDataQueryCodeExp(name="SYQK",expression="t1.`SYQK`")
        ,@DEDataQueryCodeExp(name="SYSJ",expression="t1.`SYSJ`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_CLDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CLDefaultDQModel() {
        super();

        this.initAnnotation(OA_CLDefaultDQModel.class);
    }

}