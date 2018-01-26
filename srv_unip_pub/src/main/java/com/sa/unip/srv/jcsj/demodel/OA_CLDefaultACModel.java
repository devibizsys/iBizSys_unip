/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="3d6b755c3692debb8fd539de77b21099",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CLID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CLNAME",format="")
    })
}
         )

/**
 *  实体[OA_CL]自动填充 [DEFAULT]对象模型
 */
public class OA_CLDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CLDefaultACModel() {
        super();

        this.initAnnotation(OA_CLDefaultACModel.class);
    }

}