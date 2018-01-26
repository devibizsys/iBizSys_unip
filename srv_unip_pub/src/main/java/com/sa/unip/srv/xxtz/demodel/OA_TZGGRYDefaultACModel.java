/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="a1db6680ea6fd852ef1e1744bff0fec5",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_TZGGRYID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_TZGGRYNAME",format="")
    })
}
         )

/**
 *  实体[OA_TZGGRY]自动填充 [DEFAULT]对象模型
 */
public class OA_TZGGRYDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_TZGGRYDefaultACModel() {
        super();

        this.initAnnotation(OA_TZGGRYDefaultACModel.class);
    }

}