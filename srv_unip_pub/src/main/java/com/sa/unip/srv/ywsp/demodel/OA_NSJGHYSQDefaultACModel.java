/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="4ab8e29eef72eb9ce66e677cef7051f9",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_NSJGHYSQID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_NSJGHYSQNAME",format="")
    })
}
         )

/**
 *  实体[OA_NSJGHYSQ]自动填充 [DEFAULT]对象模型
 */
public class OA_NSJGHYSQDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_NSJGHYSQDefaultACModel() {
        super();

        this.initAnnotation(OA_NSJGHYSQDefaultACModel.class);
    }

}