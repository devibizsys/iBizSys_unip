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

@DEDataQuery(id="75C928C9-7F0D-455D-A4B9-3FA7FF7D45CF",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`CODE`, t1.`CONTENT`, t1.`FID`, t1.`GID`, t1.`LINK`, t1.`NAME`, t1.`SORT`, t1.`TYPE` FROM `T_LVXIN_PUBLICMENU` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="CODE",expression="t1.`CODE`")
        ,@DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="FID",expression="t1.`FID`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="LINK",expression="t1.`LINK`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="SORT",expression="t1.`SORT`")
        ,@DEDataQueryCodeExp(name="TYPE",expression="t1.`TYPE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_PUBLICMENUDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_PUBLICMENUDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_PUBLICMENUDefaultDQModel.class);
    }

}