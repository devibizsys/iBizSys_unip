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

@DEDataQuery(id="0775C7CB-1328-493E-B3A9-6E52EB81AC82",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`NAME`, t1.`VALUE` FROM `T_LVXIN_SEQUENCE` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="VALUE",expression="t1.`VALUE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_SEQUENCEDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_SEQUENCEDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_SEQUENCEDefaultDQModel.class);
    }

}