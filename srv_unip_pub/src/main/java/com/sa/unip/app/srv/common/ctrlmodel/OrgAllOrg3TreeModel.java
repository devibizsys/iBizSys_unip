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
public class  OrgAllOrg3TreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgAllOrg3TreeModel()  {
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
        node0.setId("0970767F-C056-4B0D-B41E-2CF3FCA9A0C2");
        node0.setName("非根组织节点");
        node0.setIconCls("fa fa-bank");
        node0.setNodeType("CURORG");

        node0.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("0970767F-C056-4B0D-B41E-2CF3FCA9A0C2");
            rs.setChildTreeNodeId("0970767F-C056-4B0D-B41E-2CF3FCA9A0C2");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("0970767F-C056-4B0D-B41E-2CF3FCA9A0C2");
            rs.setChildTreeNodeId("FCF619AE-332C-4ABE-9439-9529EE11674D");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node0);

        TreeDEDataSetNodeModel  node1 = new TreeDEDataSetNodeModel ();
        node1.setDEDataSetName("UX_AllRoot");
        node1.setSortField("ORGCODE");
        //ORG
        node1.setDEName("ORG");
        node1.setId("1CEBE56D-5A6F-42AD-A688-5E4CFCEC4555");
        node1.setName("根组织节点");
        node1.setIconCls("fa fa-bank");
        node1.setExpanded(true);
        node1.setNodeType("ORG");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("1CEBE56D-5A6F-42AD-A688-5E4CFCEC4555");
            rs.setChildTreeNodeId("FCF619AE-332C-4ABE-9439-9529EE11674D");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("1CEBE56D-5A6F-42AD-A688-5E4CFCEC4555");
            rs.setChildTreeNodeId("0970767F-C056-4B0D-B41E-2CF3FCA9A0C2");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);

        TreeDEDataSetNodeModel  node2 = new TreeDEDataSetNodeModel ();
        node2.setDEDataSetName("CurChild");
        node2.setSortField("ORGCODE");
        //ORGSECTOR
        node2.setDEName("ORGSECTOR");
        node2.setId("42C4B44E-CCA8-440F-83FB-DC20862DB5E9");
        node2.setName("当前部门子部门");
        node2.setIconCls("fa fa-users");
        node2.setNodeType("ORGSECTOR2");

        node2.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("42C4B44E-CCA8-440F-83FB-DC20862DB5E9");
            rs.setChildTreeNodeId("42C4B44E-CCA8-440F-83FB-DC20862DB5E9");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node2);

        TreeDEDataSetNodeModel  node3 = new TreeDEDataSetNodeModel ();
        node3.setDEDataSetName("OrgRoot");
        node3.setSortField("ORGCODE");
        //ORGSECTOR
        node3.setDEName("ORGSECTOR");
        node3.setId("FCF619AE-332C-4ABE-9439-9529EE11674D");
        node3.setName("组织根部门");
        node3.setIconCls("fa fa-sitemap");
        node3.setNodeType("ORGSECTOR");

        node3.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("FCF619AE-332C-4ABE-9439-9529EE11674D");
            rs.setChildTreeNodeId("42C4B44E-CCA8-440F-83FB-DC20862DB5E9");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node3);
        TreeStaticNodeModel  node4 = new TreeStaticNodeModel();
        node4.setNodeValue("root");

        node4.setId("FFB0838D-0F5F-4327-911D-8DAE1C8392E1");
        node4.setName("根节点");
        node4.setRootNode(true);
        node4.setExpanded(true);
        node4.setNodeType("root");

        node4.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("FFB0838D-0F5F-4327-911D-8DAE1C8392E1");
            rs.setChildTreeNodeId("1CEBE56D-5A6F-42AD-A688-5E4CFCEC4555");
            rs.init(this);
            node4.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node4);
    }
}