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

@DEDataQuery(id="8409EB49-0ED1-40BD-88DC-572C8C25419F",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`BKBJDEMO`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DEMOID`, t1.`DEMONAME`, t1.`DEMOSQBZ`, t1.`DEMOSQZT`, t1.`DHWBKDEMO`, t1.`DSJXZDEMO`, t1.`DXLBDEMO`, t1.`SJDEMO`, t1.`SJXZDEMO`, t1.`TPDEMO`, t1.`TPLBDEMO`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WBKDEMO`, t1.`WFINSTANCEID`, t1.`WFSTATE`, t1.`WJDEMO`, t1.`XLLBDEMO`, t1.`XXKLBDEMO` FROM `T_DEMO` t1  ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BKBJDEMO",expression="t1.`BKBJDEMO`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEMOID",expression="t1.`DEMOID`")
        ,@DEDataQueryCodeExp(name="DEMONAME",expression="t1.`DEMONAME`")
        ,@DEDataQueryCodeExp(name="DEMOSQBZ",expression="t1.`DEMOSQBZ`")
        ,@DEDataQueryCodeExp(name="DEMOSQZT",expression="t1.`DEMOSQZT`")
        ,@DEDataQueryCodeExp(name="DHWBKDEMO",expression="t1.`DHWBKDEMO`")
        ,@DEDataQueryCodeExp(name="DSJXZDEMO",expression="t1.`DSJXZDEMO`")
        ,@DEDataQueryCodeExp(name="DXLBDEMO",expression="t1.`DXLBDEMO`")
        ,@DEDataQueryCodeExp(name="SJDEMO",expression="t1.`SJDEMO`")
        ,@DEDataQueryCodeExp(name="SJXZDEMO",expression="t1.`SJXZDEMO`")
        ,@DEDataQueryCodeExp(name="TPDEMO",expression="t1.`TPDEMO`")
        ,@DEDataQueryCodeExp(name="TPLBDEMO",expression="t1.`TPLBDEMO`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WBKDEMO",expression="t1.`WBKDEMO`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="WJDEMO",expression="t1.`WJDEMO`")
        ,@DEDataQueryCodeExp(name="XLLBDEMO",expression="t1.`XLLBDEMO`")
        ,@DEDataQueryCodeExp(name="XXKLBDEMO",expression="t1.`XXKLBDEMO`")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public class DemoDefaultDQModel extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DemoDefaultDQModel() {
        super();

        this.initAnnotation(DemoDefaultDQModel.class);
    }

}