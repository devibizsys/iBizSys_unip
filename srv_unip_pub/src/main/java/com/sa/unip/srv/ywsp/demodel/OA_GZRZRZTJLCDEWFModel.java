/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_GZRZ;
import com.sa.unip.srv.ywsp.service.OA_GZRZService;

/**
 * 实体[OA_GZRZ]工作流[OA_GZRZ]模型基类
 */
public class OA_GZRZRZTJLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_GZRZRZTJLCDEWFModel.class);

    public OA_GZRZRZTJLCDEWFModel() {
        super();

        //设置标识
        this.setId("2C996634-8819-473F-B708-C2CB3990A386");
        //设置工作流标识
        this.setWorkflowId("E7BDF6C1-A7A2-43BB-AB28-4E6DC36DA33F");
        //设置实体流程名称
        this.setName("RZTJLC");

        //设置流程步骤属性 日志提交步骤
        this.setWFStepField("RZTJBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 日志提交状态
        this.setUDStateField("RZTJZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}