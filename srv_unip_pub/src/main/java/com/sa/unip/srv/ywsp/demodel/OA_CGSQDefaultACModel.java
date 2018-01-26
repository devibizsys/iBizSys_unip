/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="d5b99fe05938f9adcfc252174e25526e",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CGSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CGSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_CGSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_CGSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CGSQDefaultACModel() {
        super();

        this.initAnnotation(OA_CGSQDefaultACModel.class);
    }

}