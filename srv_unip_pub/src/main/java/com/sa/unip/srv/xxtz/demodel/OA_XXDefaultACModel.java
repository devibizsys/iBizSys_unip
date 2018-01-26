/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="a1220a3fe588cd56a7eeedd2457b387d",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_XXID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_XXNAME",format="")
    })
}
         )

/**
 *  实体[OA_XX]自动填充 [DEFAULT]对象模型
 */
public class OA_XXDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_XXDefaultACModel() {
        super();

        this.initAnnotation(OA_XXDefaultACModel.class);
    }

}