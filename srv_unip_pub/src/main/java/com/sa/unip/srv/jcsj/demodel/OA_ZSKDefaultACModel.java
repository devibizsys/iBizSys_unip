/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="89d40906b952c934951c7674a199b93c",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_ZSKID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_ZSKNAME",format="")
    })
}
         )

/**
 *  实体[OA_ZSK]自动填充 [DEFAULT]对象模型
 */
public class OA_ZSKDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_ZSKDefaultACModel() {
        super();

        this.initAnnotation(OA_ZSKDefaultACModel.class);
    }

}