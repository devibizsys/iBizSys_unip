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

@DEDataQuery(id="20FAF266-0059-4C50-85D7-74E4F3C6ACC1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CODE`, t1.`NAME`, t1.`PARENTCODE`, t1.`SORT` FROM `T_LVXIN_ORGANIZATION` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CODE",expression="t1.`CODE`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="PARENTCODE",expression="t1.`PARENTCODE`")
        ,@DEDataQueryCodeExp(name="SORT",expression="t1.`SORT`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_ORGANIZATIONDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_ORGANIZATIONDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_ORGANIZATIONDefaultDQModel.class);
    }

}