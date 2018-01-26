/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="8919f057dd97c6ac882a2d23420be1a3",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_HYSID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_HYSNAME",format="")
    })
}
         )

/**
 *  实体[OA_HYS]自动填充 [DEFAULT]对象模型
 */
public class OA_HYSDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_HYSDefaultACModel() {
        super();

        this.initAnnotation(OA_HYSDefaultACModel.class);
    }

}