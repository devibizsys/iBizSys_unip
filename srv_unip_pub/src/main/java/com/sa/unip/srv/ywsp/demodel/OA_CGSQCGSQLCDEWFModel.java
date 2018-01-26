/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.demodel;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sa.unip.srv.ywsp.entity.OA_CGSQ;
import com.sa.unip.srv.ywsp.service.OA_CGSQService;

/**
 * 实体[OA_CGSQ]工作流[OA_CGSQ]模型基类
 */
public class OA_CGSQCGSQLCDEWFModel extends net.ibizsys.pswf.core.DEWFModelBase {

    private static final Log log = LogFactory.getLog(OA_CGSQCGSQLCDEWFModel.class);

    public OA_CGSQCGSQLCDEWFModel() {
        super();

        //设置标识
        this.setId("9F574D2F-51AC-4A3A-9951-29C496825BF9");
        //设置工作流标识
        this.setWorkflowId("BE228F3D-0F19-4980-8CA4-067074612E69");
        //设置实体流程名称
        this.setName("CGSQLC");

        //设置流程步骤属性 采购申请步骤
        this.setWFStepField("CGSQBZ");
        //设置流程状态属性 工作流状态
        this.setWFStateField("WFSTATE");
        //设置用户数据状态属性 采购申请状态
        this.setUDStateField("CGSQZT");
        //设置流程实例属性 工作流实例
        this.setWFInstField("WFINSTANCEID");
        //设置流程状态值
        this.setEntityWFState("20");

    }


}