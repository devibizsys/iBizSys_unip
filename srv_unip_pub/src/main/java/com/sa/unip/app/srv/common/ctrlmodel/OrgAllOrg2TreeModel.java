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
public class  OrgAllOrg2TreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgAllOrg2TreeModel()  {
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
        node0.setDEDataSetName("CurChild");
        node0.setSortField("ORGCODE");
        //ORG
        node0.setDEName("ORG");
        node0.setId("13A2068C-29C9-4C97-9F06-0CC3015FF5EF");
        node0.setName("非根组织节点");
        node0.setIconCls("fa fa-bank");
        node0.setNodeType("ORG2");

        node0.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("13A2068C-29C9-4C97-9F06-0CC3015FF5EF");
            rs.setChildTreeNodeId("B181FF4C-2B98-4CDF-AC8C-B8CB29E38B46");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("13A2068C-29C9-4C97-9F06-0CC3015FF5EF");
            rs.setChildTreeNodeId("13A2068C-29C9-4C97-9F06-0CC3015FF5EF");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node0);
        TreeStaticNodeModel  node1 = new TreeStaticNodeModel();
        node1.setNodeValue("root");

        node1.setId("3C0D0C7C-AFDC-45EF-B0E5-F3AB99EE40F9");
        node1.setName("根节点");
        node1.setRootNode(true);
        node1.setExpanded(true);
        node1.setNodeType("root");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("3C0D0C7C-AFDC-45EF-B0E5-F3AB99EE40F9");
            rs.setChildTreeNodeId("92D8E7DF-E95D-4E63-BFF8-54E1A5A1151B");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);

        TreeDEDataSetNodeModel  node2 = new TreeDEDataSetNodeModel ();
        node2.setDEDataSetName("UX_AllRoot");
        node2.setSortField("ORGCODE");
        //ORG
        node2.setDEName("ORG");
        node2.setId("92D8E7DF-E95D-4E63-BFF8-54E1A5A1151B");
        node2.setName("根组织节点");
        node2.setIconCls("fa fa-bank");
        node2.setExpanded(true);
        node2.setNodeType("ORG");

        node2.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("92D8E7DF-E95D-4E63-BFF8-54E1A5A1151B");
            rs.setChildTreeNodeId("B181FF4C-2B98-4CDF-AC8C-B8CB29E38B46");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("92D8E7DF-E95D-4E63-BFF8-54E1A5A1151B");
            rs.setChildTreeNodeId("13A2068C-29C9-4C97-9F06-0CC3015FF5EF");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node2);

        TreeDEDataSetNodeModel  node3 = new TreeDEDataSetNodeModel ();
        node3.setDEDataSetName("CurChild");
        node3.setSortField("ORGCODE");
        //ORGSECTOR
        node3.setDEName("ORGSECTOR");
        node3.setId("963694E6-27E9-4E1D-B0CD-A09EC86436A2");
        node3.setName("当前部门子部门");
        node3.setIconCls("fa fa-users");
        node3.setNodeType("ORGSECTOR2");

        node3.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("963694E6-27E9-4E1D-B0CD-A09EC86436A2");
            rs.setChildTreeNodeId("963694E6-27E9-4E1D-B0CD-A09EC86436A2");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node3);

        TreeDEDataSetNodeModel  node4 = new TreeDEDataSetNodeModel ();
        node4.setDEDataSetName("OrgRoot");
        node4.setSortField("ORGCODE");
        //ORGSECTOR
        node4.setDEName("ORGSECTOR");
        node4.setId("B181FF4C-2B98-4CDF-AC8C-B8CB29E38B46");
        node4.setName("组织根部门");
        node4.setIconCls("fa fa-sitemap");
        node4.setNodeType("ORGSECTOR");

        node4.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("B181FF4C-2B98-4CDF-AC8C-B8CB29E38B46");
            rs.setChildTreeNodeId("963694E6-27E9-4E1D-B0CD-A09EC86436A2");
            rs.init(this);
            node4.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node4);
    }
}