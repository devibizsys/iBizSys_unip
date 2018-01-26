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

@DEDataQuery(id="043C970B-465E-4C67-839B-D0959A740B32",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACTION`, t1.`CONTENT`, t1.`FOMART`, t1.`MID`, t1.`RECEIVER`, t1.`SENDER`, t1.`STATUS`, t1.`TIMESTAMP`, t1.`TITLE` FROM `T_LVXIN_MESSAGE` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTION",expression="t1.`ACTION`")
        ,@DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="FOMART",expression="t1.`FOMART`")
        ,@DEDataQueryCodeExp(name="MID",expression="t1.`MID`")
        ,@DEDataQueryCodeExp(name="RECEIVER",expression="t1.`RECEIVER`")
        ,@DEDataQueryCodeExp(name="SENDER",expression="t1.`SENDER`")
        ,@DEDataQueryCodeExp(name="STATUS",expression="t1.`STATUS`")
        ,@DEDataQueryCodeExp(name="TIMESTAMP",expression="t1.`TIMESTAMP`")
        ,@DEDataQueryCodeExp(name="TITLE",expression="t1.`TITLE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_MESSAGEDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_MESSAGEDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_MESSAGEDefaultDQModel.class);
    }

}