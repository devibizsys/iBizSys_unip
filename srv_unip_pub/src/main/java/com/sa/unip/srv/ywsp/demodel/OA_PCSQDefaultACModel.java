/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="644b022eb662b345d3c2578f43eb4c65",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_PCSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_PCSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_PCSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_PCSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_PCSQDefaultACModel() {
        super();

        this.initAnnotation(OA_PCSQDefaultACModel.class);
    }

}