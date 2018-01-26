/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.demodel;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="37FCD2DA-CB0C-433B-95E8-649532E086A0",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`API_XT_FJLJID`, t1.`API_XT_FJLJNAME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`IP`, t1.`LOGINNAME`, t1.`ORGSECUSERID`, t1.`UKEY`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_API_XT_FJLJ` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="API_XT_FJLJID",expression="t1.`API_XT_FJLJID`")
        ,@DEDataQueryCodeExp(name="API_XT_FJLJNAME",expression="t1.`API_XT_FJLJNAME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="IP",expression="t1.`IP`")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.`LOGINNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.`ORGSECUSERID`")
        ,@DEDataQueryCodeExp(name="UKEY",expression="t1.`UKEY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.API_XT_FJLJID, t1.API_XT_FJLJNAME, t1.CREATEDATE, t1.CREATEMAN, t1.IP, t1.LOGINNAME, t1.ORGSECUSERID, t1.UKEY, t1.UPDATEDATE, t1.UPDATEMAN FROM T_API_XT_FJLJ t1  ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="API_XT_FJLJID",expression="t1.API_XT_FJLJID")
        ,@DEDataQueryCodeExp(name="API_XT_FJLJNAME",expression="t1.API_XT_FJLJNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="IP",expression="t1.IP")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.LOGINNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.ORGSECUSERID")
        ,@DEDataQueryCodeExp(name="UKEY",expression="t1.UKEY")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class APIXTFJLJDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public APIXTFJLJDefaultDQModel() {
        super();

        this.initAnnotation(APIXTFJLJDefaultDQModel.class);
    }

}