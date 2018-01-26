/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_BGYPSQ;
import com.sa.unip.srv.ywsp.service.OA_BGYPSQService;

/**
 * 实体[OA_BGYPSQ]工作流[OA_BGYPSQ]模型基类
 */
public class OA_BGYPSQBGYPSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_BGYPSQBGYPSQLCDEWFModel.class);

    public OA_BGYPSQBGYPSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("AFB1D21D-733B-4FE4-B4DA-6D182D8ABAB2");
        //设置工作流标识
        this.setWorkflowId("DE0E3BE2-18D6-45AF-8D11-B57FE2335985");
        //设置实体流程名称
        this.setName("BGYPSQLC");

        //设置流程步骤属性 办公用品申请步骤
        this.setWFStepField("BGYPSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 办公用品申请状态
        this.setUDStateField("BGYPSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}