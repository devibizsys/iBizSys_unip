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

@DEDataQuery(id="8896478e1651ece6c33d0cddc6e30677",name="VIEW",viewlevel=0)
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACCOUNT`, t1.`APNSABLE`, t1.`BINDTIME`, t1.`CHANNEL`, t1.`CLIENTVERSION`, t1.`DEVICEID`, t1.`DEVICEMODEL`, t1.`GID`, t1.`HEARTBEAT`, t1.`HOSTADDRESS`, t1.`LATIYUDE`, t1.`LOCATION`, t1.`LONGITUDE`, t1.`NID`, t1.`PACKAGENAME`, t1.`STATUS`, t1.`SYSTEMVERSION` FROM `T_LVXIN_CIMSESSION` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCOUNT",expression="t1.`ACCOUNT`")
        ,@DEDataQueryCodeExp(name="APNSABLE",expression="t1.`APNSABLE`")
        ,@DEDataQueryCodeExp(name="BINDTIME",expression="t1.`BINDTIME`")
        ,@DEDataQueryCodeExp(name="CHANNEL",expression="t1.`CHANNEL`")
        ,@DEDataQueryCodeExp(name="CLIENTVERSION",expression="t1.`CLIENTVERSION`")
        ,@DEDataQueryCodeExp(name="DEVICEID",expression="t1.`DEVICEID`")
        ,@DEDataQueryCodeExp(name="DEVICEMODEL",expression="t1.`DEVICEMODEL`")
        ,@DEDataQueryCodeExp(name="GID",expression="t1.`GID`")
        ,@DEDataQueryCodeExp(name="HEARTBEAT",expression="t1.`HEARTBEAT`")
        ,@DEDataQueryCodeExp(name="HOSTADDRESS",expression="t1.`HOSTADDRESS`")
        ,@DEDataQueryCodeExp(name="LATIYUDE",expression="t1.`LATIYUDE`")
        ,@DEDataQueryCodeExp(name="LOCATION",expression="t1.`LOCATION`")
        ,@DEDataQueryCodeExp(name="LONGITUDE",expression="t1.`LONGITUDE`")
        ,@DEDataQueryCodeExp(name="NID",expression="t1.`NID`")
        ,@DEDataQueryCodeExp(name="PACKAGENAME",expression="t1.`PACKAGENAME`")
        ,@DEDataQueryCodeExp(name="STATUS",expression="t1.`STATUS`")
        ,@DEDataQueryCodeExp(name="SYSTEMVERSION",expression="t1.`SYSTEMVERSION`")
    },
    conds={})
})
/**
 *  实体数据查询 [默认（全部数据）]模型基类
 */
public class LVXIN_CIMSESSIONViewDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LVXIN_CIMSESSIONViewDQModel() {
        super();

        this.initAnnotation(LVXIN_CIMSESSIONViewDQModel.class);
    }

}