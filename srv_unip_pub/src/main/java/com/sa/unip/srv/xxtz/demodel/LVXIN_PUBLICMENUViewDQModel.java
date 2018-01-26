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

@DEDataQuery(id="cc3ed3b618ecb523dabf8301f00b741e",name="VIEW",viewlevel=0)
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
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_PUBLICMENUViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_PUBLICMENUViewDQModel() {
        super();

        this.initAnnotation(LVXIN_PUBLICMENUViewDQModel.class);
    }

}