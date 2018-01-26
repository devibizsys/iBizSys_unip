/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="711fc6f5e52d4c76ed7eb5d96fed5e7a",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="CODE",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="NAME",format="")
    })
}
         )

/**
 *  实体[LVXIN_ORGANIZATION]自动填充 [DEFAULT]对象模型
 */
public class LVXIN_ORGANIZATIONDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public LVXIN_ORGANIZATIONDefaultACModel() {
        super();

        this.initAnnotation(LVXIN_ORGANIZATIONDefaultACModel.class);
    }

}