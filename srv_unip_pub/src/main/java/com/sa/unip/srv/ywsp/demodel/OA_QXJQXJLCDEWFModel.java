/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_QXJ;
import com.sa.unip.srv.ywsp.service.OA_QXJService;

/**
 * 实体[OA_QXJ]工作流[OA_QXJ]模型基类
 */
public class OA_QXJQXJLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_QXJQXJLCDEWFModel.class);

    public OA_QXJQXJLCDEWFModel() {
        super();

        //设置标识
        this.setId("99BCF14D-0B1F-4679-A525-1055ADDB5DA4");
        //设置工作流标识
        this.setWorkflowId("88045D1E-5E70-4191-8A50-F0B3A98AE865");
        //设置实体流程名称
        this.setName("QXJLC");

        //设置流程步骤属性 请休假步骤
        this.setWFStepField("QXJBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 请休假状态
        this.setUDStateField("QXJZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}