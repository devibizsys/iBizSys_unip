/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="f7933ca7f298d8c4a62ee98421a1c0e0",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="ACCOUNT",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="NAME",format="")
    })
}
         )

/**
 *  实体[LVXIN_PUBLICACCOUNT]自动填充 [DEFAULT]对象模型
 */
public class LVXIN_PUBLICACCOUNTDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public LVXIN_PUBLICACCOUNTDefaultACModel() {
        super();

        this.initAnnotation(LVXIN_PUBLICACCOUNTDefaultACModel.class);
    }

}