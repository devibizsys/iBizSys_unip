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

@DEDataQuery(id="850a6b5935f23a77c5b444c223533c73",name="VIEW",viewlevel=0)
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
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_ORGANIZATIONViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_ORGANIZATIONViewDQModel() {
        super();

        this.initAnnotation(LVXIN_ORGANIZATIONViewDQModel.class);
    }

}