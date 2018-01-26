/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_SBWX;
import com.sa.unip.srv.ywsp.service.OA_SBWXService;

/**
 * 实体[OA_SBWX]工作流[OA_SBWX]模型基类
 */
public class OA_SBWXSBWXLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_SBWXSBWXLCDEWFModel.class);

    public OA_SBWXSBWXLCDEWFModel() {
        super();

        //设置标识
        this.setId("28AC6E5F-3454-4BA3-A263-E46338D036BB");
        //设置工作流标识
        this.setWorkflowId("EAF48546-27E1-44CE-BB9D-3660F92B6A39");
        //设置实体流程名称
        this.setName("SBWXLC");

        //设置流程步骤属性 设备维修步骤
        this.setWFStepField("SBWXBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 设备维修状态
        this.setUDStateField("SBWXZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}