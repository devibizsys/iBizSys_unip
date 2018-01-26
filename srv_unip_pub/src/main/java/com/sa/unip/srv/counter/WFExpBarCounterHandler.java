/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.counter;


import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.ctrlhandler.CounterGlobal;





/**
 * 流程导航栏计数器计数器处理基类
 */
public class WFExpBarCounterHandler extends net.ibizsys.pswf.ctrlhandler.WFExpBarCounterHandler {

    public WFExpBarCounterHandler() {
        super();

        this.setId("ead704403097c2603be95413835eb3bf");
        this.setName("流程导航栏计数器");

        CounterGlobal.registerCounterHandler("com.sa.unip.srv.counter.WFExpBarCounterHandler", this);
        CounterGlobal.registerCounterHandler("ead704403097c2603be95413835eb3bf", this);
    }

    protected void onInit() throws Exception {
        super.onInit();
    }


}