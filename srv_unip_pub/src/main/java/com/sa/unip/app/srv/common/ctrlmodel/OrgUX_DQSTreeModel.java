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
public class  OrgUX_DQSTreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgUX_DQSTreeModel()  {
        super();

        this.setRootVisible(true);
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
        node0.setDEDataSetName("UX_PRO_PCY");
        node0.setIdField("ORGID");
        node0.setTextField("ORGNAME");
        node0.setSortField("ORGID");
        node0.setSortDir("ASC");
        //ORG
        node0.setDEName("ORG");
        node0.setId("01EDE64D-D289-4630-8154-B81971A58047");
        node0.setName("省院派出院");
        node0.setIconCls("fa fa-bank");
        node0.setNodeType("PROPCY");

        node0.init(this);
        registerTreeNodeModel(node0);

        TreeDEDataSetNodeModel  node1 = new TreeDEDataSetNodeModel ();
        node1.setDEDataSetName("UX_CITY");
        node1.setIdField("ORGID");
        node1.setTextField("ORGNAME");
        node1.setSortField("ORGID");
        node1.setSortDir("ASC");
        //ORG
        node1.setDEName("ORG");
        node1.setId("4A10A2CE-082F-4294-8226-17110BA578F8");
        node1.setName("城市");
        node1.setIconCls("fa fa-navicon");
        node1.setNodeType("QBSY");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("4A10A2CE-082F-4294-8226-17110BA578F8");
            rs.setChildTreeNodeId("5F0628F6-E5A6-40B4-8C72-43AB51CAD0F1");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);

        TreeDEDataSetNodeModel  node2 = new TreeDEDataSetNodeModel ();
        node2.setDEDataSetName("UX_CITYDW");
        node2.setIdField("ORGID");
        node2.setTextField("ORGNAME");
        node2.setSortField("ORGID");
        node2.setSortDir("ASC");
        //ORG
        node2.setDEName("ORG");
        node2.setId("5F0628F6-E5A6-40B4-8C72-43AB51CAD0F1");
        node2.setName("城市单位");
        node2.setIconCls("fa fa-bank");
        node2.setNodeType("SYDW");

        node2.init(this);
        registerTreeNodeModel(node2);
        TreeStaticNodeModel  node3 = new TreeStaticNodeModel();
        node3.setNodeValue("DQALL");

        node3.setId("86A92611-88BB-4DC5-AE52-FDFD2162E602");
        node3.setName("全部地区");
        node3.setRootNode(true);
        node3.setIconCls("fa fa-navicon");
        node3.setExpanded(true);
        node3.setNodeType("DQALL");

        node3.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("86A92611-88BB-4DC5-AE52-FDFD2162E602");
            rs.setChildTreeNodeId("88D28FB0-7AE7-42DC-BD83-620CA2D0EFE9");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("86A92611-88BB-4DC5-AE52-FDFD2162E602");
            rs.setChildTreeNodeId("4A10A2CE-082F-4294-8226-17110BA578F8");
            rs.init(this);
            node3.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node3);

        TreeDEDataSetNodeModel  node4 = new TreeDEDataSetNodeModel ();
        node4.setDEDataSetName("UX_PRO");
        node4.setIdField("ORGID");
        node4.setTextField("ORGNAME");
        node4.setSortField("ORGID");
        node4.setSortDir("ASC");
        //ORG
        node4.setDEName("ORG");
        node4.setId("88D28FB0-7AE7-42DC-BD83-620CA2D0EFE9");
        node4.setName("省院");
        node4.setIconCls("fa fa-bank");
        node4.setNodeType("PROV");

        node4.init(this);
        registerTreeNodeModel(node4);
    }
}