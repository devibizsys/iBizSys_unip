/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_YBHYSQ;
import com.sa.unip.srv.ywsp.service.OA_YBHYSQService;

/**
 * 实体[OA_YBHYSQ]工作流[OA_YBHYSQ]模型基类
 */
public class OA_YBHYSQYBHYSQDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_YBHYSQYBHYSQDEWFModel.class);

    public OA_YBHYSQYBHYSQDEWFModel() {
        super();

        //设置标识
        this.setId("CDE6EE4D-A4F4-48BA-83D1-F4C9976BFC68");
        //设置工作流标识
        this.setWorkflowId("8202F292-D8BD-4FA8-B9C3-7948EEFCC24D");
        //设置实体流程名称
        this.setName("YBHYSQ");

        //设置流程步骤属性 会议申请步骤
        this.setWFStepField("HYSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 会议申请状态
        this.setUDStateField("HYSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}