/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_JPYD;
import com.sa.unip.srv.ywsp.service.OA_JPYDService;

/**
 * 实体[OA_JPYD]工作流[OA_JPYD]模型基类
 */
public class OA_JPYDJPYDLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_JPYDJPYDLCDEWFModel.class);

    public OA_JPYDJPYDLCDEWFModel() {
        super();

        //设置标识
        this.setId("DE772CBE-6B2E-435A-81DD-06312ED1985B");
        //设置工作流标识
        this.setWorkflowId("61BAE9BB-0074-4AB9-8AB1-2CCE45599290");
        //设置实体流程名称
        this.setName("JPYDLC");

        //设置流程步骤属性 机票预订步骤
        this.setWFStepField("JPYDBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 机票预订状态
        this.setUDStateField("JPYDZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}