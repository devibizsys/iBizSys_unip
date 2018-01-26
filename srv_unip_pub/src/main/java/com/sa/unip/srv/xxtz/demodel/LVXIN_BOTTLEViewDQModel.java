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

@DEDataQuery(id="7ef1c4f36a2fa1fb8987adc884c7a2b9",name="VIEW",viewlevel=0)
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
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_BOTTLEViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_BOTTLEViewDQModel() {
        super();

        this.initAnnotation(LVXIN_BOTTLEViewDQModel.class);
    }

}