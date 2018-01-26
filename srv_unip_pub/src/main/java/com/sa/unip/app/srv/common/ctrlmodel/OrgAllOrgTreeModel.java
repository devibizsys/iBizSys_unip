/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.srv.common.ctrlmodel;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.GlobalContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.datamodel.DataItemModel;
import net.ibizsys.paas.datamodel.DataItemParamModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;

import net.ibizsys.paas.ctrlmodel.TreeNodeRSModel;
import net.ibizsys.paas.ctrlmodel.TreeStaticNodeModel;
import net.ibizsys.paas.ctrlmodel.TreeCodeListNodeModel;
import net.ibizsys.paas.ctrlmodel.TreeDEDataSetNodeModel;
/**
 * 实体[组织机构]树视图[treeexpbar_tree]部件模型
 */
public class  OrgAllOrgTreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgAllOrgTreeModel()  {
        super();

    }

    private com.sa.unip.srv.subsys.demodel.OrgDEModel orgDEModel;
    protected  com.sa.unip.srv.subsys.demodel.OrgDEModel getOrgDEModel() {
        if(this.orgDEModel==null) {
            try {
                this.orgDEModel = (com.sa.unip.srv.subsys.demodel.OrgDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgDEModel;
    }

    @Override
    public IDataEntityModel getDEModel() {
        return this.getOrgDEModel();
    }


    /**
      * 准备树模型
      * @throws Exception
      */
    @Override
    protected void onPrepareTreeMode() throws Exception {

        TreeDEDataSetNodeModel  node0 = new TreeDEDataSetNodeModel ();
        node0.setDEDataSetName("AllRoot");
        node0.setSortField("LEVELCODE");
        //ORG
        node0.setDEName("ORG");
        node0.setId("0CC92652-2BCB-43F4-9964-319FCFA6CBB5");
        node0.setName("根组织节点");
        node0.setNodeType("ORG");

        node0.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("0CC92652-2BCB-43F4-9964-319FCFA6CBB5");
            rs.setChildTreeNodeId("66B650C1-669B-486F-8A9F-B2CCD4302056");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node0);

        TreeDEDataSetNodeModel  node1 = new TreeDEDataSetNodeModel ();
        node1.setDEDataSetName("OrgRoot");
        node1.setSortField("ORDERVALUE");
        //ORGSECTOR
        node1.setDEName("ORGSECTOR");
        node1.setId("66B650C1-669B-486F-8A9F-B2CCD4302056");
        node1.setName("组织根部门");
        node1.setNodeType("ORGSECTOR");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("66B650C1-669B-486F-8A9F-B2CCD4302056");
            rs.setChildTreeNodeId("FA0667F6-6319-432F-B066-7D7083801299");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);
        TreeStaticNodeModel  node2 = new TreeStaticNodeModel();
        node2.setNodeValue("root");

        node2.setId("E315F114-7DFA-4BB5-BF95-774FD86011EB");
        node2.setName("根节点");
        node2.setRootNode(true);
        node2.setExpanded(true);
        node2.setNodeType("root");

        node2.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("E315F114-7DFA-4BB5-BF95-774FD86011EB");
            rs.setChildTreeNodeId("0CC92652-2BCB-43F4-9964-319FCFA6CBB5");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node2);

        TreeDEDataSetNodeModel  node3 = new TreeDEDataSetNodeModel ();
        node3.setDEDataSetName("CurChild");
        //ORGSECTOR
        node3.setDEName("ORGSECTOR");
        node3.setId("FA0667F6-6319-432F-B066-7D7083801299");
        node3.setName("当前部门子部门");
        node3.setNodeType("ORGSECTOR2");

        node3.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("FA0667F6-6319-432F-B066-7D7083801299");
            rs.setChildTreeNodeId("FA0667F6-6319-432F-B066-7D7083801299");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node3);
    }
}