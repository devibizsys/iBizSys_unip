/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.counter;


import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.ctrlhandler.CounterGlobal;





/**
 * 门户界面计数器计数器处理基类
 */
public class PortalCounterHandler extends net.ibizsys.psportal.core.ctrlhandler.PortalCounterHandler {

    public PortalCounterHandler() {
        super();

        this.setId("2cfc5bba445f0d9908920a83e87ab1c9");
        this.setName("门户界面计数器");

        CounterGlobal.registerCounterHandler("com.sa.unip.srv.counter.PortalCounterHandler", this);
        CounterGlobal.registerCounterHandler("2cfc5bba445f0d9908920a83e87ab1c9", this);
    }

    protected void onInit() throws Exception {
        super.onInit();
    }


}