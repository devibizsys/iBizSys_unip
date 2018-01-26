/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="a2ff33334ca80258b31ea5623af023c7",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_CLWXID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_CLWXNAME",format="")
    })
}
         )

/**
 *  实体[OA_CLWX]自动填充 [DEFAULT]对象模型
 */
public class OA_CLWXDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_CLWXDefaultACModel() {
        super();

        this.initAnnotation(OA_CLWXDefaultACModel.class);
    }

}