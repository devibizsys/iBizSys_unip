/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xtgl.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6EE3F36D-9359-48C8-9FF1-32C8561C450E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`CZDX`, t1.`CZLX`, t1.`CZRID`, t1.`IP`, t1.`MEMO`, t1.`OA_CZRZID`, t1.`OA_CZRZNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_OA_CZRZ` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="CZDX",expression="t1.`CZDX`")
        ,@DEDataQueryCodeExp(name="CZLX",expression="t1.`CZLX`")
        ,@DEDataQueryCodeExp(name="CZRID",expression="t1.`CZRID`")
        ,@DEDataQueryCodeExp(name="IP",expression="t1.`IP`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CZRZID",expression="t1.`OA_CZRZID`")
        ,@DEDataQueryCodeExp(name="OA_CZRZNAME",expression="t1.`OA_CZRZNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_CZRZDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CZRZDefaultDQModel() {
        super();

        this.initAnnotation(OA_CZRZDefaultDQModel.class);
    }

}