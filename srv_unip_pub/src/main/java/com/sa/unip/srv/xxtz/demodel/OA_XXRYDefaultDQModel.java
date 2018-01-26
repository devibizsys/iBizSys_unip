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

@DEDataQuery(id="386E8821-ED0F-48FE-89F8-5F1D8E7591DC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`OA_XXID`, t1.`OA_XXRYID`, t1.`OA_XXRYNAME`, t1.`ORGUSERID`, t1.`SFYD`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_XXRY` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="OA_XXID",expression="t1.`OA_XXID`")
        ,@DEDataQueryCodeExp(name="OA_XXRYID",expression="t1.`OA_XXRYID`")
        ,@DEDataQueryCodeExp(name="OA_XXRYNAME",expression="t1.`OA_XXRYNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="SFYD",expression="t1.`SFYD`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_XXRYDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_XXRYDefaultDQModel() {
        super();

        this.initAnnotation(OA_XXRYDefaultDQModel.class);
    }

}