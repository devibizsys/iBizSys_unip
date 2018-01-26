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

@DEDataQuery(id="159c122aac23ac55600f5f2c76bf8fc8",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`CONTENT`, t1.`GID`, t1.`LINK`, t1.`THUMBNAIL`, t1.`TIMESTAP`, t1.`TYPE` FROM `T_LVXIN_ARTICLE` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="LINK",expression="t1.`LINK`")
        ,@DEDataQueryCodeExp(name="THUMBNAIL",expression="t1.`THUMBNAIL`")
        ,@DEDataQueryCodeExp(name="TIMESTAP",expression="t1.`TIMESTAP`")
        ,@DEDataQueryCodeExp(name="TYPE",expression="t1.`TYPE`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_ARTICLEViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_ARTICLEViewDQModel() {
        super();

        this.initAnnotation(LVXIN_ARTICLEViewDQModel.class);
    }

}