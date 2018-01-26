/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.subsys.demodel;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="AFF79AB3-5D7C-40A4-B305-D022F6A84C21",name="QLCBRXZGL")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t11.`BIZCODE`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`ORDERVALUE`, t1.`ORGID`, t1.`ORGNAME`, t1.`ORGSECTORID`, t1.`ORGSECTORNAME`, t1.`ORGSECUSERTYPEID`, t1.`ORGSECUSERTYPENAME`, t1.`ORGUSERID`, t1.`ORGUSERLEVELID`, t1.`ORGUSERLEVELNAME`, t1.`ORGUSERNAME`, t1.`RESERVER`, t1.`RESERVER10`, t1.`RESERVER11`, t1.`RESERVER12`, t1.`RESERVER13`, t1.`RESERVER14`, t1.`RESERVER15`, t1.`RESERVER16`, t1.`RESERVER17`, t1.`RESERVER18`, t1.`RESERVER19`, t1.`RESERVER2`, t1.`RESERVER20`, t1.`RESERVER21`, t1.`RESERVER22`, t1.`RESERVER25`, t1.`RESERVER26`, t1.`RESERVER27`, t1.`RESERVER28`, t1.`RESERVER29`, t1.`RESERVER3`, t1.`RESERVER30`, t1.`RESERVER4`, t1.`RESERVER5`, t1.`RESERVER6`, t1.`RESERVER7`, t1.`RESERVER8`, t1.`RESERVER9`, t1.`TITLENAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERCODE`, t1.`USERDATA`, t1.`USERDATA2`, t1.`VALIDFLAG` FROM `T_SRFORGUSER` t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="RESERVER23",expression="t1.`RESERVER23`")
        ,@DEDataQueryCodeExp(name="RESERVER24",expression="t1.`RESERVER24`")
        ,@DEDataQueryCodeExp(name="BIZCODE",expression="t11.`BIZCODE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.`ORDERVALUE`")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.`ORGID`")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.`ORGNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.`ORGSECUSERTYPEID`")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.`ORGSECUSERTYPENAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.`ORGUSERID`")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.`ORGUSERLEVELID`")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.`ORGUSERLEVELNAME`")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.`ORGUSERNAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER10",expression="t1.`RESERVER10`")
        ,@DEDataQueryCodeExp(name="RESERVER11",expression="t1.`RESERVER11`")
        ,@DEDataQueryCodeExp(name="RESERVER12",expression="t1.`RESERVER12`")
        ,@DEDataQueryCodeExp(name="RESERVER13",expression="t1.`RESERVER13`")
        ,@DEDataQueryCodeExp(name="RESERVER14",expression="t1.`RESERVER14`")
        ,@DEDataQueryCodeExp(name="RESERVER15",expression="t1.`RESERVER15`")
        ,@DEDataQueryCodeExp(name="RESERVER16",expression="t1.`RESERVER16`")
        ,@DEDataQueryCodeExp(name="RESERVER17",expression="t1.`RESERVER17`")
        ,@DEDataQueryCodeExp(name="RESERVER18",expression="t1.`RESERVER18`")
        ,@DEDataQueryCodeExp(name="RESERVER19",expression="t1.`RESERVER19`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER20",expression="t1.`RESERVER20`")
        ,@DEDataQueryCodeExp(name="RESERVER21",expression="t1.`RESERVER21`")
        ,@DEDataQueryCodeExp(name="RESERVER22",expression="t1.`RESERVER22`")
        ,@DEDataQueryCodeExp(name="RESERVER25",expression="t1.`RESERVER25`")
        ,@DEDataQueryCodeExp(name="RESERVER26",expression="t1.`RESERVER26`")
        ,@DEDataQueryCodeExp(name="RESERVER27",expression="t1.`RESERVER27`")
        ,@DEDataQueryCodeExp(name="RESERVER28",expression="t1.`RESERVER28`")
        ,@DEDataQueryCodeExp(name="RESERVER29",expression="t1.`RESERVER29`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER30",expression="t1.`RESERVER30`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="RESERVER5",expression="t1.`RESERVER5`")
        ,@DEDataQueryCodeExp(name="RESERVER6",expression="t1.`RESERVER6`")
        ,@DEDataQueryCodeExp(name="RESERVER7",expression="t1.`RESERVER7`")
        ,@DEDataQueryCodeExp(name="RESERVER8",expression="t1.`RESERVER8`")
        ,@DEDataQueryCodeExp(name="RESERVER9",expression="t1.`RESERVER9`")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.`TITLENAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.`USERCODE`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`ORGID` =  ${srfdatacontext('ORGID','{\"defname\":\"ORGID\",\"dename\":\"ORGUSER\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t11.BIZCODE, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORDERVALUE, t1.ORGID, t1.ORGNAME, t1.ORGSECTORID, t1.ORGSECTORNAME, t1.ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME, t1.ORGUSERID, t1.ORGUSERLEVELID, t1.ORGUSERLEVELNAME, t1.ORGUSERNAME, t1.RESERVER, t1.RESERVER10, t1.RESERVER11, t1.RESERVER12, t1.RESERVER13, t1.RESERVER14, t1.RESERVER15, t1.RESERVER16, t1.RESERVER17, t1.RESERVER18, t1.RESERVER19, t1.RESERVER2, t1.RESERVER20, t1.RESERVER21, t1.RESERVER22, t1.RESERVER25, t1.RESERVER26, t1.RESERVER27, t1.RESERVER28, t1.RESERVER29, t1.RESERVER3, t1.RESERVER30, t1.RESERVER4, t1.RESERVER5, t1.RESERVER6, t1.RESERVER7, t1.RESERVER8, t1.RESERVER9, t1.TITLENAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERCODE, t1.USERDATA, t1.USERDATA2, t1.VALIDFLAG FROM T_SRFORGUSER t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID  ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="RESERVER23",expression="t1.RESERVER23")
        ,@DEDataQueryCodeExp(name="RESERVER24",expression="t1.RESERVER24")
        ,@DEDataQueryCodeExp(name="BIZCODE",expression="t11.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER10",expression="t1.RESERVER10")
        ,@DEDataQueryCodeExp(name="RESERVER11",expression="t1.RESERVER11")
        ,@DEDataQueryCodeExp(name="RESERVER12",expression="t1.RESERVER12")
        ,@DEDataQueryCodeExp(name="RESERVER13",expression="t1.RESERVER13")
        ,@DEDataQueryCodeExp(name="RESERVER14",expression="t1.RESERVER14")
        ,@DEDataQueryCodeExp(name="RESERVER15",expression="t1.RESERVER15")
        ,@DEDataQueryCodeExp(name="RESERVER16",expression="t1.RESERVER16")
        ,@DEDataQueryCodeExp(name="RESERVER17",expression="t1.RESERVER17")
        ,@DEDataQueryCodeExp(name="RESERVER18",expression="t1.RESERVER18")
        ,@DEDataQueryCodeExp(name="RESERVER19",expression="t1.RESERVER19")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER20",expression="t1.RESERVER20")
        ,@DEDataQueryCodeExp(name="RESERVER21",expression="t1.RESERVER21")
        ,@DEDataQueryCodeExp(name="RESERVER22",expression="t1.RESERVER22")
        ,@DEDataQueryCodeExp(name="RESERVER25",expression="t1.RESERVER25")
        ,@DEDataQueryCodeExp(name="RESERVER26",expression="t1.RESERVER26")
        ,@DEDataQueryCodeExp(name="RESERVER27",expression="t1.RESERVER27")
        ,@DEDataQueryCodeExp(name="RESERVER28",expression="t1.RESERVER28")
        ,@DEDataQueryCodeExp(name="RESERVER29",expression="t1.RESERVER29")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER30",expression="t1.RESERVER30")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="RESERVER5",expression="t1.RESERVER5")
        ,@DEDataQueryCodeExp(name="RESERVER6",expression="t1.RESERVER6")
        ,@DEDataQueryCodeExp(name="RESERVER7",expression="t1.RESERVER7")
        ,@DEDataQueryCodeExp(name="RESERVER8",expression="t1.RESERVER8")
        ,@DEDataQueryCodeExp(name="RESERVER9",expression="t1.RESERVER9")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.USERCODE")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('ORGID','{\"defname\":\"ORGID\",\"dename\":\"ORGUSER\"}')} )")
    })
})

public class OrgUserQLCBRXZGLDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgUserQLCBRXZGLDQModel() {
        super();

        this.initAnnotation(OrgUserQLCBRXZGLDQModel.class);
    }

}