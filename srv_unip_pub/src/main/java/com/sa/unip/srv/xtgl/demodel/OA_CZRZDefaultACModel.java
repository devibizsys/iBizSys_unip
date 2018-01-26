/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xtgl.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="9aa63784ad7c83fb5b897285d8863ea8",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CZRZID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CZRZNAME",format="")
    })
}
         )

/**
 *  实体[OA_CZRZ]自动填充 [DEFAULT]对象模型
 */
public class OA_CZRZDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CZRZDefaultACModel() {
        super();

        this.initAnnotation(OA_CZRZDefaultACModel.class);
    }

}