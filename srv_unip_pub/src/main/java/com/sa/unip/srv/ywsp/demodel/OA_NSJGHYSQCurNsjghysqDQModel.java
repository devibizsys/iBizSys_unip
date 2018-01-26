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

@DEDataQuery(id="EBF43001-8672-4B25-9555-288BD546A9F6",name="CurNsjghysq")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BZ`, t1.`CBCSFZRYJ`, t1.`CHLD`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLE`, t1.`HYDD`, t1.`HYSID`, t1.`HYSJ`, t1.`HYSNAME`, t1.`HYYQ`, t1.`MEMO`, t1.`MSCYJ`, t1.`NSJGHYSQBZ`, t1.`NSJGHYSQZT`, t1.`NSJGSFSHTG`, t1.`OA_NSJGHYSQID`, t1.`OA_NSJGHYSQNAME`, t1.`ORGSECTORID`, t1.`ORGSECTORNAME`, t1.`ORGUSERID`, t1.`ORGUSERNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`YBFZRYJ` FROM `T_OA_NSJGHYSQ` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BZ",expression="t1.`BZ`")
        ,@DEDataQueryCodeExp(name="CBCSFZRYJ",expression="t1.`CBCSFZRYJ`")
        ,@DEDataQueryCodeExp(name="CHLD",expression="t1.`CHLD`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="HYDD",expression="t1.`HYDD`")
        ,@DEDataQueryCodeExp(name="HYSID",expression="t1.`HYSID`")
        ,@DEDataQueryCodeExp(name="HYSJ",expression="t1.`HYSJ`")
        ,@DEDataQueryCodeExp(name="HYSNAME",expression="t1.`HYSNAME`")
        ,@DEDataQueryCodeExp(name="HYYQ",expression="t1.`HYYQ`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="MSCYJ",expression="t1.`MSCYJ`")
        ,@DEDataQueryCodeExp(name="NSJGHYSQBZ",expression="t1.`NSJGHYSQBZ`")
        ,@DEDataQueryCodeExp(name="NSJGHYSQZT",expression="t1.`NSJGHYSQZT`")
        ,@DEDataQueryCodeExp(name="NSJGSFSHTG",expression="t1.`NSJGSFSHTG`")
        ,@DEDataQueryCodeExp(name="OA_NSJGHYSQID",expression="t1.`OA_NSJGHYSQID`")
        ,@DEDataQueryCodeExp(name="OA_NSJGHYSQNAME",expression="t1.`OA_NSJGHYSQNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="YBFZRYJ",expression="t1.`YBFZRYJ`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
        ,@DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_NSJGHYSQ\"}')} )")
    })
})
/**
 *  实体数据查询 [我的内设机构会议申请记录]模型基类
 */
public class OA_NSJGHYSQCurNsjghysqDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_NSJGHYSQCurNsjghysqDQModel() {
        super();

        this.initAnnotation(OA_NSJGHYSQCurNsjghysqDQModel.class);
    }

}