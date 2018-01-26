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

@DEDataQuery(id="2514D210-83E5-4525-83EB-0DF1EB36DB9D",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`OA_FLFGID`, t1.`OA_FLFGNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`ZY` FROM `T_OA_FLFG` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_FLFGID",expression="t1.`OA_FLFGID`")
        ,@DEDataQueryCodeExp(name="OA_FLFGNAME",expression="t1.`OA_FLFGNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="ZY",expression="t1.`ZY`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_FLFGDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_FLFGDefaultDQModel() {
        super();

        this.initAnnotation(OA_FLFGDefaultDQModel.class);
    }

}