/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="eb8135d3edcb38f493ed0240e9b59f5f",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_RZRYID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_RZRYNAME",format="")
    })
}
         )

/**
 *  实体[OA_RZRY]自动填充 [DEFAULT]对象模型
 */
public class OA_RZRYDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_RZRYDefaultACModel() {
        super();

        this.initAnnotation(OA_RZRYDefaultACModel.class);
    }

}