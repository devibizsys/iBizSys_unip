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

@DEDataQuery(id="26BC6840-6CFE-49BA-9F90-40E85579A13D",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CONTENT`, t1.`GID`, t1.`LENGTH`, t1.`RECEIVER`, t1.`REGION`, t1.`SENDER`, t1.`STATUS`, t1.`TIMESTAMP`, t1.`TYPE` FROM `T_LVXIN_BOTTLE` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="LENGTH",expression="t1.`LENGTH`")
        ,@DEDataQueryCodeExp(name="RECEIVER",expression="t1.`RECEIVER`")
        ,@DEDataQueryCodeExp(name="REGION",expression="t1.`REGION`")
        ,@DEDataQueryCodeExp(name="SENDER",expression="t1.`SENDER`")
        ,@DEDataQueryCodeExp(name="STATUS",expression="t1.`STATUS`")
        ,@DEDataQueryCodeExp(name="TIMESTAMP",expression="t1.`TIMESTAMP`")
        ,@DEDataQueryCodeExp(name="TYPE",expression="t1.`TYPE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_BOTTLEDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_BOTTLEDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_BOTTLEDefaultDQModel.class);
    }

}