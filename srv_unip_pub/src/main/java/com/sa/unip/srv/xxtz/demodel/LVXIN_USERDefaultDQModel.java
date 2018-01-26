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

@DEDataQuery(id="6194435B-63EB-4B85-87AC-6D71E4A7A8D0",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`EMAIL`, t1.`GENDER`, t1.`GRADE`, t1.`INLINE`, t1.`LATITUDE`, t1.`LOCATION`, t1.`LONGITUDE`, t1.`MOTTO`, t1.`NAME`, t1.`ORGCODE`, t1.`PASSWORD`, t1.`POWER`, t1.`TELEPHONE` FROM `T_LVXIN_USER` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="EMAIL",expression="t1.`EMAIL`")
        ,@DEDataQueryCodeExp(name="GENDER",expression="t1.`GENDER`")
        ,@DEDataQueryCodeExp(name="GRADE",expression="t1.`GRADE`")
        ,@DEDataQueryCodeExp(name="INLINE",expression="t1.`INLINE`")
        ,@DEDataQueryCodeExp(name="LATITUDE",expression="t1.`LATITUDE`")
        ,@DEDataQueryCodeExp(name="LOCATION",expression="t1.`LOCATION`")
        ,@DEDataQueryCodeExp(name="LONGITUDE",expression="t1.`LONGITUDE`")
        ,@DEDataQueryCodeExp(name="MOTTO",expression="t1.`MOTTO`")
        ,@DEDataQueryCodeExp(name="NAME",expression="t1.`NAME`")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.`ORGCODE`")
        ,@DEDataQueryCodeExp(name="PASSWORD",expression="t1.`PASSWORD`")
        ,@DEDataQueryCodeExp(name="POWER",expression="t1.`POWER`")
        ,@DEDataQueryCodeExp(name="TELEPHONE",expression="t1.`TELEPHONE`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class LVXIN_USERDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_USERDefaultDQModel() {
        super();

        this.initAnnotation(LVXIN_USERDefaultDQModel.class);
    }

}