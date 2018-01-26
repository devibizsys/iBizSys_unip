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

@DEDataQuery(id="D8B6CDE0-0EAA-4313-8B46-5C7776758DAF",name="DEFAULT")
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
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_ARTICLEDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_ARTICLEDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_ARTICLEDefaultDQModel.class);
    }

}