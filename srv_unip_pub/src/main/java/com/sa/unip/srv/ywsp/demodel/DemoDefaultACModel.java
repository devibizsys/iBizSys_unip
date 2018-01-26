/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="6882a0ebeaba71c3557f87d860621328",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="DEMOID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="DEMONAME",format="")
    })
}
         )

/**
 *  实体[DEMO]自动填充 [DEFAULT]对象模型
 */
public class DemoDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public DemoDefaultACModel() {
        super();

        this.initAnnotation(DemoDefaultACModel.class);
    }

}