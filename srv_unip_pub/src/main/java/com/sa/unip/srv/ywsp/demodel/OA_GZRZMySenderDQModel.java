/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="F9E18858-F064-4B5C-89F1-BB721BED9C23",name="MySender")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BYGZCX`, t1.`BZ`, t1.`BZGZCX`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`CSR`, t1.`CZWT`, t1.`FJ`, t1.`JRGZCX`, t1.`MEMO`, t1.`MRJH`, t1.`OA_GZRZID`, t1.`OA_GZRZNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`PICTURE`, t1.`RZLX`, t1.`RZSFSHTG`, t1.`RZTJBZ`, t1.`RZTJZT`, t1.`SFYD`, t1.`SPR`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`XSBT`, t1.`XXT` FROM `T_OA_GZRZ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BYGZCX",expression="t1.`BYGZCX`")
        ,@DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="BZGZCX",expression="t1.`BZGZCX`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="CSR",expression="t1.`CSR`")
        ,@DEDataQueryCodeExp(name="CZWT",expression="t1.`CZWT`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JRGZCX",expression="t1.`JRGZCX`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="MRJH",expression="t1.`MRJH`")
        ,@DEDataQueryCodeExp(name="OA_GZRZID",expression="t1.`OA_GZRZID`")
        ,@DEDataQueryCodeExp(name="OA_GZRZNAME",expression="t1.`OA_GZRZNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="PICTURE",expression="t1.`PICTURE`")
        ,@DEDataQueryCodeExp(name="RZLX",expression="t1.`RZLX`")
        ,@DEDataQueryCodeExp(name="RZSFSHTG",expression="t1.`RZSFSHTG`")
        ,@DEDataQueryCodeExp(name="RZTJBZ",expression="t1.`RZTJBZ`")
        ,@DEDataQueryCodeExp(name="RZTJZT",expression="t1.`RZTJZT`")
        ,@DEDataQueryCodeExp(name="SFYD",expression="t1.`SFYD`")
        ,@DEDataQueryCodeExp(name="SPR",expression="t1.`SPR`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="XSBT",expression="t1.`XSBT`")
        ,@DEDataQueryCodeExp(name="XXT",expression="t1.`XXT`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_GZRZ\"}')} )")
    })
})
/**
 *  实体数据查询 [当前登录人的日志]模型基类
 */
public class OA_GZRZMySenderDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_GZRZMySenderDQModel() {
        super();

        this.initAnnotation(OA_GZRZMySenderDQModel.class);
    }

}