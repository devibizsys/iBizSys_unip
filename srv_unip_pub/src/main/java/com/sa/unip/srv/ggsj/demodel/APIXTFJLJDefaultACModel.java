/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.demodel;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="bbc8558d10375e41f01804e6c2206085",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="API_XT_FJLJID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="API_XT_FJLJNAME",format="")
    })
}
         )

/**
 *  实体[API_XT_FJLJ]自动填充 [DEFAULT]对象模型
 */
public class APIXTFJLJDefaultACModel extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public APIXTFJLJDefaultACModel() {
        super();

        this.initAnnotation(APIXTFJLJDefaultACModel.class);
    }

}