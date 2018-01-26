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

@DEDataQuery(id="3fdd02741899480bfd8d6760db294951",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`GID`, t1.`GROUPID`, t1.`HOST` FROM `T_LVXIN_GROUPMEMBER` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="GROUPID",expression="t1.`GROUPID`")
        ,@DEDataQueryCodeExp(name="HOST",expression="t1.`HOST`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_GROUPMEMBERViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_GROUPMEMBERViewDQModel() {
        super();

        this.initAnnotation(LVXIN_GROUPMEMBERViewDQModel.class);
    }

}