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

@DEDataQuery(id="01EB9AE3-DA1C-4085-B355-D8CE5F132A69",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FSSJ`, t1.`JSR`, t1.`OA_XXID`, t1.`OA_XXNAME`, t1.`ORGUSERID`, t1.`ORGUSERNAME`, t1.`SFYFS`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`XXLX` FROM `T_OA_XX` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FSSJ",expression="t1.`FSSJ`")
        ,@DEDataQueryCodeExp(name="JSR",expression="t1.`JSR`")
        ,@DEDataQueryCodeExp(name="OA_XXID",expression="t1.`OA_XXID`")
        ,@DEDataQueryCodeExp(name="OA_XXNAME",expression="t1.`OA_XXNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SFYFS",expression="t1.`SFYFS`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="XXLX",expression="t1.`XXLX`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_XXDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_XXDefaultDQModel() {
        super();

        this.initAnnotation(OA_XXDefaultDQModel.class);
    }

}