/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="f5d0fdb19f1511578b6c5c9f4c69dcc2",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_FLFGID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_FLFGNAME",format="")
    })
}
         )

/**
 *  实体[OA_FLFG]自动填充 [DEFAULT]对象模型
 */
public class OA_FLFGDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_FLFGDefaultACModel() {
        super();

        this.initAnnotation(OA_FLFGDefaultACModel.class);
    }

}