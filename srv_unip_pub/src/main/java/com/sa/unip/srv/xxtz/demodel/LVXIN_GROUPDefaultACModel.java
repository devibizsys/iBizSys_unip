/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="575cb60cd1245b080b7cc69125fa47d9",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="GROUPID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="NAME",format="")
    })
}
         )

/**
 *  实体[LVXIN_GROUP]自动填充 [DEFAULT]对象模型
 */
public class LVXIN_GROUPDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public LVXIN_GROUPDefaultACModel() {
        super();

        this.initAnnotation(LVXIN_GROUPDefaultACModel.class);
    }

}