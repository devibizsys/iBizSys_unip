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

@DEDataQuery(id="E9544F81-78BB-4A51-BFC6-F153B7A45F13",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`HYSDZ`, t1.`OA_HYSID`, t1.`OA_HYSNAME`, t1.`SYQK`, t1.`SYSJ`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_HYS` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="HYSDZ",expression="t1.`HYSDZ`")
        ,@DEDataQueryCodeExp(name="OA_HYSID",expression="t1.`OA_HYSID`")
        ,@DEDataQueryCodeExp(name="OA_HYSNAME",expression="t1.`OA_HYSNAME`")
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
public class OA_HYSDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_HYSDefaultDQModel() {
        super();

        this.initAnnotation(OA_HYSDefaultDQModel.class);
    }

}