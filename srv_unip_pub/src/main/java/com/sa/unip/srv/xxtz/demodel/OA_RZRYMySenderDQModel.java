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

@DEDataQuery(id="85AF3BE7-3FC4-4F13-A3BE-0DCFB2BFA9CB",name="MySender")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t11.`CZWT`, t1.`GZRZID`, t11.`JRGZCX`, t11.`MEMO`, t11.`MRJH`, t11.`OA_GZRZNAME`, t1.`OA_RZRYID`, t1.`OA_RZRYNAME`, t1.`ORGUSERID`, t11.`RZLX`, t1.`SFYD`, t11.`ORGUSERID` AS `TJRID`, t21.`ORGUSERNAME` AS `TJRNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t11.`XSBT`, t11.`XXT` FROM `T_OA_RZRY` t1  LEFT JOIN T_OA_GZRZ t11 ON t1.GZRZID = t11.OA_GZRZID  LEFT JOIN T_SRFORGUSER t21 ON t11.ORGUSERID = t21.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="CZWT",expression="t11.`CZWT`")
        ,@DEDataQueryCodeExp(name="GZRZID",expression="t1.`GZRZID`")
        ,@DEDataQueryCodeExp(name="JRGZCX",expression="t11.`JRGZCX`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.`MEMO`")
        ,@DEDataQueryCodeExp(name="MRJH",expression="t11.`MRJH`")
        ,@DEDataQueryCodeExp(name="OA_GZRZNAME",expression="t11.`OA_GZRZNAME`")
        ,@DEDataQueryCodeExp(name="OA_RZRYID",expression="t1.`OA_RZRYID`")
        ,@DEDataQueryCodeExp(name="OA_RZRYNAME",expression="t1.`OA_RZRYNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="RZLX",expression="t11.`RZLX`")
        ,@DEDataQueryCodeExp(name="SFYD",expression="t1.`SFYD`")
        ,@DEDataQueryCodeExp(name="TJRID",expression="t11.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="TJRNAME",expression="t21.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="XSBT",expression="t11.`XSBT`")
        ,@DEDataQueryCodeExp(name="XXT",expression="t11.`XXT`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t11.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"TJRID\",\"dename\":\"OA_RZRY\"}')} )")
    })
})
/**
 *  实体数据查询 [我发出的]模型基类
 */
public class OA_RZRYMySenderDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_RZRYMySenderDQModel() {
        super();

        this.initAnnotation(OA_RZRYMySenderDQModel.class);
    }

}