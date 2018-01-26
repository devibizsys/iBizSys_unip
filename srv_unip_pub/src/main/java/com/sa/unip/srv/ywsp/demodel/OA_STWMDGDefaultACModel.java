/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="9e3412d4cc2071a7028a726531005e82",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_STWMDGID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_STWMDGNAME",format="")
    })
}
         )

/**
 *  实体[OA_STWMDG]自动填充 [DEFAULT]对象模型
 */
public class OA_STWMDGDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_STWMDGDefaultACModel() {
        super();

        this.initAnnotation(OA_STWMDGDefaultACModel.class);
    }

}