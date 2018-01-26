/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.counter;


import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.ctrlhandler.CounterGlobal;





/**
 * PC端计数器计数器处理基类
 */
public class PCCountCounterHandler extends net.ibizsys.paas.ctrlhandler.CustomCounterHandlerBase {

    public PCCountCounterHandler() {
        super();

        this.setId("1064F163-D617-4EDF-ADE1-A0948BE1EB8C");
        this.setName("PC端计数器");

        CounterGlobal.registerCounterHandler("com.sa.unip.srv.counter.PCCountCounterHandler", this);
        CounterGlobal.registerCounterHandler("1064F163-D617-4EDF-ADE1-A0948BE1EB8C", this);
    }

    protected void onInit() throws Exception {
        super.onInit();
    }


}