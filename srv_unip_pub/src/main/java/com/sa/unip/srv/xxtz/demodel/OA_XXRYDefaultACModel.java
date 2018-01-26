/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="569bd3058e5bf80c26c953bc5a0187c0",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_XXRYID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_XXRYNAME",format="")
    })
}
         )

/**
 *  实体[OA_XXRY]自动填充 [DEFAULT]对象模型
 */
public class OA_XXRYDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_XXRYDefaultACModel() {
        super();

        this.initAnnotation(OA_XXRYDefaultACModel.class);
    }

}