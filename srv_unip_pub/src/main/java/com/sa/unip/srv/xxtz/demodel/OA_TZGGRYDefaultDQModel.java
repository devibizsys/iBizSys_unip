/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A1CB0284-10C6-446B-858A-951566D24045",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`OA_TZGGID`, t1.`OA_TZGGRYID`, t1.`OA_TZGGRYNAME`, t1.`ORGUSERID`, t1.`SFYD`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_TZGGRY` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="OA_TZGGID",expression="t1.`OA_TZGGID`")
        ,@DEDataQueryCodeExp(name="OA_TZGGRYID",expression="t1.`OA_TZGGRYID`")
        ,@DEDataQueryCodeExp(name="OA_TZGGRYNAME",expression="t1.`OA_TZGGRYNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="SFYD",expression="t1.`SFYD`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_TZGGRYDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_TZGGRYDefaultDQModel() {
        super();

        this.initAnnotation(OA_TZGGRYDefaultDQModel.class);
    }

}