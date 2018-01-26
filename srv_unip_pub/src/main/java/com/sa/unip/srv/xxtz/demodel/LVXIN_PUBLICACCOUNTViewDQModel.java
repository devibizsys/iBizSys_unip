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

@DEDataQuery(id="988ef45f22ae1f6cc0d4fe9acc509527",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`APIURL`, t1.`DESCRIPTION`, t1.`GREET`, t1.`LINK`, t1.`NAME`, t1.`POWER`, t1.`STATUS`, t1.`TIMESTAMP` FROM `T_LVXIN_PUBLICACCOUNT` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.`APIURL`")
        ,@DEDataQueryCodeExp(name="DESCRIPTION",expression="t1.`DESCRIPTION`")
        ,@DEDataQueryCodeExp(name="GREET",expression="t1.`GREET`")
        ,@DEDataQueryCodeExp(name="LINK",expression="t1.`LINK`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="POWER",expression="t1.`POWER`")
        ,@DEDataQueryCodeExp(name="STATUS",expression="t1.`STATUS`")
        ,@DEDataQueryCodeExp(name="TIMESTAMP",expression="t1.`TIMESTAMP`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_PUBLICACCOUNTViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_PUBLICACCOUNTViewDQModel() {
        super();

        this.initAnnotation(LVXIN_PUBLICACCOUNTViewDQModel.class);
    }

}