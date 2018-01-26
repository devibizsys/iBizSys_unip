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

@DEDataQuery(id="305e51c112cfedad9afa08b7e84c8e48",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`ARTICLEID`, t1.`CONTENT`, t1.`GID`, t1.`TIMESTAMP`, t1.`TYPE` FROM `T_LVXIN_COMMENT` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="ARTICLEID",expression="t1.`ARTICLEID`")
        ,@DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="TIMESTAMP",expression="t1.`TIMESTAMP`")
        ,@DEDataQueryCodeExp(name="TYPE",expression="t1.`TYPE`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_COMMENTViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_COMMENTViewDQModel() {
        super();

        this.initAnnotation(LVXIN_COMMENTViewDQModel.class);
    }

}