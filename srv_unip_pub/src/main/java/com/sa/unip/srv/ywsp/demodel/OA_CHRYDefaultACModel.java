/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="8ca8432f94aa739a7224de9e5dd0eb34",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CHRYID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CHRYNAME",format="")
    })
}
         )

/**
 *  实体[OA_CHRY]自动填充 [DEFAULT]对象模型
 */
public class OA_CHRYDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CHRYDefaultACModel() {
        super();

        this.initAnnotation(OA_CHRYDefaultACModel.class);
    }

}