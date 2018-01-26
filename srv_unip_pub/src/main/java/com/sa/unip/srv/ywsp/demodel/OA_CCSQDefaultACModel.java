/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="01c34100c1e11dc5b27d6ef38493e9f4",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CCSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CCSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_CCSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_CCSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CCSQDefaultACModel() {
        super();

        this.initAnnotation(OA_CCSQDefaultACModel.class);
    }

}