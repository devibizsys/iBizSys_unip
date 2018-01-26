/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="d06cb73070b882cdcf03a0588f231c3d",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="MID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="TITLE",format="")
    })
}
         )

/**
 *  实体[LVXIN_MESSAGE]自动填充 [DEFAULT]对象模型
 */
public class LVXIN_MESSAGEDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public LVXIN_MESSAGEDefaultACModel() {
        super();

        this.initAnnotation(LVXIN_MESSAGEDefaultACModel.class);
    }

}