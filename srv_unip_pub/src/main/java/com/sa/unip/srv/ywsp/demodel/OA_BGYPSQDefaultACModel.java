/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="2f02aaa9f6e6edffb9ba8f29a67a8b43",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_BGYPSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_BGYPSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_BGYPSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_BGYPSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_BGYPSQDefaultACModel() {
        super();

        this.initAnnotation(OA_BGYPSQDefaultACModel.class);
    }

}