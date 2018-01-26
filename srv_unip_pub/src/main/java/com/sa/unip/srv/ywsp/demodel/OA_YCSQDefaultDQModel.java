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

@DEDataQuery(id="49BB16CD-3AAF-4FCC-87F0-AB1F018A27E7",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CFSJ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DJR`, t1.`DJSJ`, t1.`FHSJ`, t1.`LKDW`, t1.`MEMO`, t1.`OA_YCSQID`, t1.`OA_YCSQNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SQSJ`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YCDD`, t1.`YCSFSHTG`, t1.`YCSJ`, t1.`YCSQBZ`, t1.`YCSQZT` FROM `T_OA_YCSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CFSJ",expression="t1.`CFSJ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DJR",expression="t1.`DJR`")
        ,@DEDataQueryCodeExp(name="DJSJ",expression="t1.`DJSJ`")
        ,@DEDataQueryCodeExp(name="FHSJ",expression="t1.`FHSJ`")
        ,@DEDataQueryCodeExp(name="LKDW",expression="t1.`LKDW`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_YCSQID",expression="t1.`OA_YCSQID`")
        ,@DEDataQueryCodeExp(name="OA_YCSQNAME",expression="t1.`OA_YCSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SQSJ",expression="t1.`SQSJ`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YCDD",expression="t1.`YCDD`")
        ,@DEDataQueryCodeExp(name="YCSFSHTG",expression="t1.`YCSFSHTG`")
        ,@DEDataQueryCodeExp(name="YCSJ",expression="t1.`YCSJ`")
        ,@DEDataQueryCodeExp(name="YCSQBZ",expression="t1.`YCSQBZ`")
        ,@DEDataQueryCodeExp(name="YCSQZT",expression="t1.`YCSQZT`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_YCSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_YCSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_YCSQDefaultDQModel.class);
    }

}