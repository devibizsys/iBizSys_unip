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

@DEDataQuery(id="c7ff2cb1cbc8febab7a1c71562a812a2",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`DESCRIPTION`, t1.`DOMIAN`, t1.`GID`, t1.`IKEY`, t1.`VALUE` FROM `T_LVXIN_CONFIG` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="DESCRIPTION",expression="t1.`DESCRIPTION`")
        ,@DEDataQueryCodeExp(name="DOMIAN",expression="t1.`DOMIAN`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="IKEY",expression="t1.`IKEY`")
        ,@DEDataQueryCodeExp(name="VALUE",expression="t1.`VALUE`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_CONFIGViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_CONFIGViewDQModel() {
        super();

        this.initAnnotation(LVXIN_CONFIGViewDQModel.class);
    }

}