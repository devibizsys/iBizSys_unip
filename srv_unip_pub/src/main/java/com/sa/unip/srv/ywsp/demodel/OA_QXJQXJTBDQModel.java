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

@DEDataQuery(id="F4ED301A-460E-4A6A-8FE2-C97C65B767B9",name="QXJTB")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT count(*) qxjcs ,t2.ORGUSERNAME name from t_oa_qxj t1 LEFT JOIN t_srforguser t2 on t1.ORGUSERID = t2.ORGUSERID  GROUP BY    t1.ORGUSERID order by qxjcs DESC LIMIT 0,8 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
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
    conds={})
})
/**
 *  实体数据查询 [请休假图表]模型基类
 */
public class OA_QXJQXJTBDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_QXJQXJTBDQModel() {
        super();

        this.initAnnotation(OA_QXJQXJTBDQModel.class);
    }

}