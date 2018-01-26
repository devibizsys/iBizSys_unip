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

@DEDataQuery(id="ae2ba14fea72ca8026943e6a0c10e47d",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`NAME`, t1.`PASSWORD`, t1.`STATUS` FROM `T_LVXIN_MANAGER` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="PASSWORD",expression="t1.`PASSWORD`")
        ,@DEDataQueryCodeExp(name="STATUS",expression="t1.`STATUS`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_MANAGERViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_MANAGERViewDQModel() {
        super();

        this.initAnnotation(LVXIN_MANAGERViewDQModel.class);
    }

}