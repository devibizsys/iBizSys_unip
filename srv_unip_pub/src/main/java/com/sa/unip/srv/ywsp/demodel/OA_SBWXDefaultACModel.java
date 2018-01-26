/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="3bec83f956549a6be06d66b95e9efa03",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_SBWXID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_SBWXNAME",format="")
    })
}
         )

/**
 *  实体[OA_SBWX]自动填充 [DEFAULT]对象模型
 */
public class OA_SBWXDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_SBWXDefaultACModel() {
        super();

        this.initAnnotation(OA_SBWXDefaultACModel.class);
    }

}