/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="d3696308fee7fbd75f9be92baa89063f",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="GID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="ACCOUNT",format="")
    })
}
         )

/**
 *  实体[LVXIN_GROUPMEMBER]自动填充 [DEFAULT]对象模型
 */
public class LVXIN_GROUPMEMBERDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public LVXIN_GROUPMEMBERDefaultACModel() {
        super();

        this.initAnnotation(LVXIN_GROUPMEMBERDefaultACModel.class);
    }

}