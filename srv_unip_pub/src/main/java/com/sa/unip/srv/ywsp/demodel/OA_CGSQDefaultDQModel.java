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

@DEDataQuery(id="B1EEC08D-B03E-4392-923F-82BF15B1D416",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CGLX`, t1.`CGSFSHTG`, t1.`CGSQBZ`, t1.`CGSQZT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`GG`, t1.`JG`, t1.`MEMO`, t1.`OA_CGSQID`, t1.`OA_CGSQNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SL`, t1.`SQSY`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`ZFFS` FROM `T_OA_CGSQ` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CGLX",expression="t1.`CGLX`")
        ,@DEDataQueryCodeExp(name="CGSFSHTG",expression="t1.`CGSFSHTG`")
        ,@DEDataQueryCodeExp(name="CGSQBZ",expression="t1.`CGSQBZ`")
        ,@DEDataQueryCodeExp(name="CGSQZT",expression="t1.`CGSQZT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="GG",expression="t1.`GG`")
        ,@DEDataQueryCodeExp(name="JG",expression="t1.`JG`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_CGSQID",expression="t1.`OA_CGSQID`")
        ,@DEDataQueryCodeExp(name="OA_CGSQNAME",expression="t1.`OA_CGSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SL",expression="t1.`SL`")
        ,@DEDataQueryCodeExp(name="SQSY",expression="t1.`SQSY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="ZFFS",expression="t1.`ZFFS`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_CGSQDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_CGSQDefaultDQModel() {
        super();

        this.initAnnotation(OA_CGSQDefaultDQModel.class);
    }

}