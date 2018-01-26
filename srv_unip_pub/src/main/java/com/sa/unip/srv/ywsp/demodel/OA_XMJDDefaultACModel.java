/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="2f1a376a2199c3504bfe4d4366b45e4e",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="OA_XMJDID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="OA_XMJDNAME",format="")
    })
}
         )

/**
 *  实体[OA_XMJD]自动填充 [DEFAULT]对象模型
 */
public class OA_XMJDDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public OA_XMJDDefaultACModel() {
        super();

        this.initAnnotation(OA_XMJDDefaultACModel.class);
    }

}