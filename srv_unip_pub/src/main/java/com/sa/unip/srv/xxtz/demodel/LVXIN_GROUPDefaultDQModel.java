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

@DEDataQuery(id="78D8C70B-6E09-4D07-92DC-C04CE2178022",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CATEGORY`, t1.`FOUNDER`, t1.`GROUPID`, t1.`NAME`, t1.`SUMMARY` FROM `T_LVXIN_GROUP` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CATEGORY",expression="t1.`CATEGORY`")
        ,@DEDataQueryCodeExp(name="FOUNDER",expression="t1.`FOUNDER`")
        ,@DEDataQueryCodeExp(name="GROUPID",expression="t1.`GROUPID`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="SUMMARY",expression="t1.`SUMMARY`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_GROUPDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_GROUPDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_GROUPDefaultDQModel.class);
    }

}