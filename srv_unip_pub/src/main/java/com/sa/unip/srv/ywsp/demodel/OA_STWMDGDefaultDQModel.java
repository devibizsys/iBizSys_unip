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

@DEDataQuery(id="057D73C6-35E3-48C4-B8FC-D89B53D5F3EB",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FJ`, t1.`MEMO`, t1.`OA_STWMDGID`, t1.`OA_STWMDGNAME`, t1.`ORGUSERID`, t11.`ORGUSERNAME`, t1.`SCSJ`, t1.`STWMDGBZ`, t1.`STWMDGZT`, t1.`STWMSFSHTG`, t1.`SY`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YCDD`, t1.`YCRS` FROM `T_OA_STWMDG` t1  LEFT JOIN T_SRFORGUSER t11 ON t1.ORGUSERID = t11.ORGUSERID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FJ",expression="t1.`FJ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_STWMDGID",expression="t1.`OA_STWMDGID`")
        ,@DEDataQueryCodeExp(name="OA_STWMDGNAME",expression="t1.`OA_STWMDGNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t11.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SCSJ",expression="t1.`SCSJ`")
        ,@DEDataQueryCodeExp(name="STWMDGBZ",expression="t1.`STWMDGBZ`")
        ,@DEDataQueryCodeExp(name="STWMDGZT",expression="t1.`STWMDGZT`")
        ,@DEDataQueryCodeExp(name="STWMSFSHTG",expression="t1.`STWMSFSHTG`")
        ,@DEDataQueryCodeExp(name="SY",expression="t1.`SY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YCDD",expression="t1.`YCDD`")
        ,@DEDataQueryCodeExp(name="YCRS",expression="t1.`YCRS`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class OA_STWMDGDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_STWMDGDefaultDQModel() {
        super();

        this.initAnnotation(OA_STWMDGDefaultDQModel.class);
    }

}