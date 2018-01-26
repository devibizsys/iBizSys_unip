/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="48f5487b61a60a005e2867457c2a8baa",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_JPYDID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_JPYDNAME",format="")
    })
}
         )

/**
 *  实体[OA_JPYD]自动填充 [DEFAULT]对象模型
 */
public class OA_JPYDDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_JPYDDefaultACModel() {
        super();

        this.initAnnotation(OA_JPYDDefaultACModel.class);
    }

}