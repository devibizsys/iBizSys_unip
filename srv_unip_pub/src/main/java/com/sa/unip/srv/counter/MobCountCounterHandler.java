/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.counter;


import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.ctrlhandler.CounterGlobal;





/**
 * 移动端计数器计数器处理基类
 */
public class MobCountCounterHandler extends net.ibizsys.paas.ctrlhandler.CustomCounterHandlerBase {

    public MobCountCounterHandler() {
        super();

        this.setId("A2788F84-01B1-442F-BA42-9D0A6440A443");
        this.setName("移动端计数器");

        CounterGlobal.registerCounterHandler("com.sa.unip.srv.counter.MobCountCounterHandler", this);
        CounterGlobal.registerCounterHandler("A2788F84-01B1-442F-BA42-9D0A6440A443", this);
    }

    protected void onInit() throws Exception {
        super.onInit();
    }


}