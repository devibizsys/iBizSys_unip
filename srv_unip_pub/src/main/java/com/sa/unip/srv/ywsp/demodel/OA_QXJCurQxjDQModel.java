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

@DEDataQuery(id="C566EB3F-9334-458D-926D-BAB6E81C8BDD",name="curQxj")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CJGZSJ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FJ`, t1.`JSSJ`, t1.`KSSJ`, t1.`MEMO`, t1.`OA_QXJID`, t1.`OA_QXJNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`QXJBZ`, t1.`QXJLX`, t1.`QXJSFSHTG`, t1.`QXJSY`, t1.`QXJZT`, t1.`SC`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YBHYSQID`, t1.`YBHYSQNAME`, t1.`ZW` FROM `T_OA_QXJ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CJGZSJ",expression="t1.`CJGZSJ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="JSSJ",expression="t1.`JSSJ`")
        ,@DEDataQueryCodeExp(name="KSSJ",expression="t1.`KSSJ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_QXJID",expression="t1.`OA_QXJID`")
        ,@DEDataQueryCodeExp(name="OA_QXJNAME",expression="t1.`OA_QXJNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="QXJBZ",expression="t1.`QXJBZ`")
        ,@DEDataQueryCodeExp(name="QXJLX",expression="t1.`QXJLX`")
        ,@DEDataQueryCodeExp(name="QXJSFSHTG",expression="t1.`QXJSFSHTG`")
        ,@DEDataQueryCodeExp(name="QXJSY",expression="t1.`QXJSY`")
        ,@DEDataQueryCodeExp(name="QXJZT",expression="t1.`QXJZT`")
        ,@DEDataQueryCodeExp(name="SC",expression="t1.`SC`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YBHYSQID",expression="t1.`YBHYSQID`")
        ,@DEDataQueryCodeExp(name="YBHYSQNAME",expression="t1.`YBHYSQNAME`")
        ,@DEDataQueryCodeExp(name="ZW",expression="t1.`ZW`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_QXJ\"}')} )")
    })
})
/**
 *  实体数据查询 [我的请休假记录]模型基类
 */
public class OA_QXJCurQxjDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_QXJCurQxjDQModel() {
        super();

        this.initAnnotation(OA_QXJCurQxjDQModel.class);
    }

}