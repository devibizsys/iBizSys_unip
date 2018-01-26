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

@DEDataQuery(id="852dd593fe304edca3cd68954a574b1a",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`GID`, t1.`PUBLICACCOUNT`, t1.`TIMESTAMP` FROM `T_LVXIN_SUBSCRIBER` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="PUBLICACCOUNT",expression="t1.`PUBLICACCOUNT`")
        ,@DEDataQueryCodeExp(name="TIMESTAMP",expression="t1.`TIMESTAMP`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_SUBSCRIBERViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_SUBSCRIBERViewDQModel() {
        super();

        this.initAnnotation(LVXIN_SUBSCRIBERViewDQModel.class);
    }

}