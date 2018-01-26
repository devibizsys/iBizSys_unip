/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.srv.common.ctrlmodel;


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
 * 实体[组织机构]树视图[tree]部件模型
 */
public class  OrgAllOrgSectorUserTreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgAllOrgSectorUserTreeModel()  {
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
        node0.setDEDataSetName("OrgRoot");
        node0.setSortField("ORDERVALUE");
        //ORGSECTOR
        node0.setDEName("ORGSECTOR");
        node0.setId("548F703D-7092-458E-986F-4D9B26BB6681");
        node0.setName("组织根部门");
        node0.setNodeType("ORGSECTOR");

        node0.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("548F703D-7092-458E-986F-4D9B26BB6681");
            rs.setChildTreeNodeId("5AA655FC-A07A-467E-983E-E1B8BDFC33F3");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("548F703D-7092-458E-986F-4D9B26BB6681");
            rs.setChildTreeNodeId("FB49FFA4-E303-4247-9F75-2A1C29B1E1EC");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node0);

        TreeDEDataSetNodeModel  node1 = new TreeDEDataSetNodeModel ();
        node1.setDEDataSetName("CurChild");
        //ORGSECTOR
        node1.setDEName("ORGSECTOR");
        node1.setId("5AA655FC-A07A-467E-983E-E1B8BDFC33F3");
        node1.setName("当前部门子部门");
        node1.setNodeType("ORGSECTOR2");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("5AA655FC-A07A-467E-983E-E1B8BDFC33F3");
            rs.setChildTreeNodeId("5AA655FC-A07A-467E-983E-E1B8BDFC33F3");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("5AA655FC-A07A-467E-983E-E1B8BDFC33F3");
            rs.setChildTreeNodeId("FB49FFA4-E303-4247-9F75-2A1C29B1E1EC");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);
        TreeStaticNodeModel  node2 = new TreeStaticNodeModel();
        node2.setNodeValue("root");

        node2.setId("5E463B39-682D-483F-A71C-9455209947D1");
        node2.setName("默认根节点");
        node2.setRootNode(true);
        node2.setExpanded(true);
        node2.setNodeType("root");

        node2.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("5E463B39-682D-483F-A71C-9455209947D1");
            rs.setChildTreeNodeId("AE75A707-E52F-4FAF-9BBB-642BB43F4E00");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node2);

        TreeDEDataSetNodeModel  node3 = new TreeDEDataSetNodeModel ();
        node3.setDEDataSetName("AllRoot");
        node3.setSortField("LEVELCODE");
        //ORG
        node3.setDEName("ORG");
        node3.setId("AE75A707-E52F-4FAF-9BBB-642BB43F4E00");
        node3.setName("根组织节点");
        node3.setNodeType("ORG");

        node3.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("AE75A707-E52F-4FAF-9BBB-642BB43F4E00");
            rs.setChildTreeNodeId("548F703D-7092-458E-986F-4D9B26BB6681");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node3);

        TreeDEDataSetNodeModel  node4 = new TreeDEDataSetNodeModel ();
        node4.setDEDataSetName("OrgSectorUser");
        //ORGUSER
        node4.setDEName("ORGUSER");
        node4.setId("FB49FFA4-E303-4247-9F75-2A1C29B1E1EC");
        node4.setName("组织人员");
        node4.setAppendPNodeId(true);
        node4.setNodeType("ORGUSER");

        node4.init(this);
        registerTreeNodeModel(node4);
    }
}