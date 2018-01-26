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

@DEDataQuery(id="ED3CE4C2-9EF2-4A1B-918D-5F9104F227CB",name="CurTzgg")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CONTENT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FSSJ`, t1.`GGSFSHTG`, t1.`JSR`, t1.`MEMO`, t1.`OA_TZGGID`, t1.`OA_TZGGNAME`, t1.`ORGUSERID`, t1.`ORGUSERNAME`, t1.`SFYFS`, t1.`TZGGLX`, t1.`TZGGSQBZ`, t1.`TZGGSQZT`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTATE` FROM `T_OA_TZGG` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FSSJ",expression="t1.`FSSJ`")
        ,@DEDataQueryCodeExp(name="GGSFSHTG",expression="t1.`GGSFSHTG`")
        ,@DEDataQueryCodeExp(name="JSR",expression="t1.`JSR`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OA_TZGGID",expression="t1.`OA_TZGGID`")
        ,@DEDataQueryCodeExp(name="OA_TZGGNAME",expression="t1.`OA_TZGGNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="SFYFS",expression="t1.`SFYFS`")
        ,@DEDataQueryCodeExp(name="TZGGLX",expression="t1.`TZGGLX`")
        ,@DEDataQueryCodeExp(name="TZGGSQBZ",expression="t1.`TZGGSQBZ`")
        ,@DEDataQueryCodeExp(name="TZGGSQZT",expression="t1.`TZGGSQZT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGUSERID` =  ${srfsessioncontext('SRFPERSONID','{\"defname\":\"ORGUSERID\",\"dename\":\"OA_TZGG\"}')} )")
    })
})
/**
 *  实体数据查询 [我的通知公告记录]模型基类
 */
public class OA_TZGGCurTzggDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OA_TZGGCurTzggDQModel() {
        super();

        this.initAnnotation(OA_TZGGCurTzggDQModel.class);
    }

}