/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.Demo;
import com.sa.unip.srv.ywsp.service.DemoService;

/**
 * 实体[DEMO]工作流[DEMO]模型基类
 */
public class DemoDEMOLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(DemoDEMOLCDEWFModel.class);

    public DemoDEMOLCDEWFModel() {
        super();

        //设置标识
        this.setId("43BB3339-637F-41A9-9AB5-6EDCE13EDCA0");
        //设置工作流标识
        this.setWorkflowId("EFE54E8F-B747-4931-9A8E-A24FDD8B6408");
        //设置实体流程名称
        this.setName("DEMOLC");

        //设置流程步骤属性 演示申请步骤
        this.setWFStepField("DEMOSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 演示申请状态
        this.setUDStateField("DEMOSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}