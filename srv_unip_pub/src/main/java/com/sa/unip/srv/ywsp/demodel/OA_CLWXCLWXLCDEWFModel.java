/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_CLWX;
import com.sa.unip.srv.ywsp.service.OA_CLWXService;

/**
 * 实体[OA_CLWX]工作流[OA_CLWX]模型基类
 */
public class OA_CLWXCLWXLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_CLWXCLWXLCDEWFModel.class);

    public OA_CLWXCLWXLCDEWFModel() {
        super();

        //设置标识
        this.setId("CB92693E-A0D2-48C2-946B-E1272A46D2BB");
        //设置工作流标识
        this.setWorkflowId("F0924354-0FAF-4863-BAF3-7438CB558E48");
        //设置实体流程名称
        this.setName("CLWXLC");

        //设置流程步骤属性 车辆维修步骤
        this.setWFStepField("CLWXBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 车辆维修状态
        this.setUDStateField("CLWXZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}