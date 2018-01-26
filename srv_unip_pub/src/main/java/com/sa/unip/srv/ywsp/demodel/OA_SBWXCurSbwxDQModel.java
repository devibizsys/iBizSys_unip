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

@DEDataQuery(id="BBEDE1E6-9096-4E62-84EC-42751504E6E9",name="CurSbwx")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DH`, t1.`FJH`, t1.`GZXX`, t1.`MEMO`, t1.`OA_SBWXID`, t1.`OA_SBWXNAME`, t1.`ORGSECTORID`, t21.`ORGSECTORNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`RQ`, t1.`SB`, t1.`SBWXBZ`, t1.`SBWXSFSHTG`, t1.`SBWXZT`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE` FROM `T_OA_SBWX` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  LEFT JOIN T_SRFORGSECTOR t21 ON t1.ORGSECTORID = t21.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DH",expression="t1.`DH`")
        ,@DEDataQueryCodeExp(name="FJH",expression="t1.`FJH`")
        ,@DEDataQueryCodeExp(name="GZXX",expression="t1.`GZXX`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_SBWXID",expression="t1.`OA_SBWXID`")
        ,@DEDataQueryCodeExp(name="OA_SBWXNAME",expression="t1.`OA_SBWXNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t21.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="RQ",expression="t1.`RQ`")
        ,@DEDataQueryCodeExp(name="SB",expression="t1.`SB`")
        ,@DEDataQueryCodeExp(name="SBWXBZ",expression="t1.`SBWXBZ`")
        ,@DEDataQueryCodeExp(name="SBWXSFSHTG",expression="t1.`SBWXSFSHTG`")
        ,@DEDataQueryCodeExp(name="SBWXZT",expression="t1.`SBWXZT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_SBWX\"}')} )")
    })
})
/**
 *  实体数据查询 [我的设备维修申请记录]模型基类
 */
public class OA_SBWXCurSbwxDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_SBWXCurSbwxDQModel() {
        super();

        this.initAnnotation(OA_SBWXCurSbwxDQModel.class);
    }

}