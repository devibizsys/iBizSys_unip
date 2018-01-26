/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="7386ce6dfae074294cbbde833b6820ed",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_TZGGID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_TZGGNAME",format="")
    })
}
         )

/**
 *  实体[OA_TZGG]自动填充 [DEFAULT]对象模型
 */
public class OA_TZGGDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_TZGGDefaultACModel() {
        super();

        this.initAnnotation(OA_TZGGDefaultACModel.class);
    }

}