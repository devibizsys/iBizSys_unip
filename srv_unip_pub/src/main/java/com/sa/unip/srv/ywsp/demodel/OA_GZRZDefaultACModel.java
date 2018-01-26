/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="07ddd1ccad9ad74b66da4fac840f8fad",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_GZRZID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_GZRZNAME",format="")
    })
}
         )

/**
 *  实体[OA_GZRZ]自动填充 [DEFAULT]对象模型
 */
public class OA_GZRZDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_GZRZDefaultACModel() {
        super();

        this.initAnnotation(OA_GZRZDefaultACModel.class);
    }

}