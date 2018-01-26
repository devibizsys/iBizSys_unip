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
public class  OrgUX_DQS2TreeModel extends net.ibizsys.paas.ctrlmodel.TreeModelBase {

    public OrgUX_DQS2TreeModel()  {
        super();

        this.setEnableRootSelect(true);
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
        node0.setDEDataSetName("UX_PRO");
        node0.setIdField("ORGID");
        node0.setTextField("ORGNAME");
        node0.setSortField("ORGID");
        node0.setSortDir("ASC");
        //ORG
        node0.setDEName("ORG");
        node0.setId("034004B0-E556-452E-A300-CD5BC6F239B3");
        node0.setName("省院");
        node0.setIconCls("fa fa-bank");
        node0.setNodeType("PROV");

        node0.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("034004B0-E556-452E-A300-CD5BC6F239B3");
            rs.setChildTreeNodeId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
            rs.init(this);
            node0.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node0);

        TreeDEDataSetNodeModel  node1 = new TreeDEDataSetNodeModel ();
        node1.setDEDataSetName("UX_CITYDW");
        node1.setIdField("ORGID");
        node1.setTextField("ORGNAME");
        node1.setSortField("ORGID");
        node1.setSortDir("ASC");
        //ORG
        node1.setDEName("ORG");
        node1.setId("0627B87A-3C43-46D9-A3F3-F517E8B2D7EA");
        node1.setName("城市单位");
        node1.setIconCls("fa fa-bank");
        node1.setNodeType("SYDW");

        node1.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("0627B87A-3C43-46D9-A3F3-F517E8B2D7EA");
            rs.setChildTreeNodeId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
            rs.init(this);
            node1.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node1);

        TreeDEDataSetNodeModel  node2 = new TreeDEDataSetNodeModel ();
        node2.setDEDataSetName("UX_CITY");
        node2.setIdField("ORGID");
        node2.setTextField("ORGNAME");
        node2.setSortField("ORGID");
        node2.setSortDir("ASC");
        //ORG
        node2.setDEName("ORG");
        node2.setId("4689546D-8518-4A92-90F9-03ACADDD1620");
        node2.setName("城市");
        node2.setIconCls("fa fa-navicon");
        node2.setNodeType("QBSY");

        node2.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("4689546D-8518-4A92-90F9-03ACADDD1620");
            rs.setChildTreeNodeId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("4689546D-8518-4A92-90F9-03ACADDD1620");
            rs.setChildTreeNodeId("0627B87A-3C43-46D9-A3F3-F517E8B2D7EA");
            rs.init(this);
            node2.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node2);

        TreeDEDataSetNodeModel  node3 = new TreeDEDataSetNodeModel ();
        node3.setDEDataSetName("CurChild");
        node3.setSortField("ORGCODE");
        //ORGSECTOR
        node3.setDEName("ORGSECTOR");
        node3.setId("674AE5D1-3F84-4601-91A1-A1E422937533");
        node3.setName("当前部门子部门");
        node3.setIconCls("fa fa-sitemap");
        node3.setNodeType("ORGSECTOR2");

        node3.init(this);
        registerTreeNodeModel(node3);
        TreeStaticNodeModel  node4 = new TreeStaticNodeModel();
        node4.setNodeValue("DQALL");

        node4.setId("6902B415-D12D-41B8-83B6-72E9F1B5C941");
        node4.setName("全部地区");
        node4.setRootNode(true);
        node4.setIconCls("fa fa-navicon");
        node4.setExpanded(true);
        node4.setEnableCheck(true);
        node4.setNodeType("DQALL");

        node4.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("6902B415-D12D-41B8-83B6-72E9F1B5C941");
            rs.setChildTreeNodeId("034004B0-E556-452E-A300-CD5BC6F239B3");
            rs.init(this);
            node4.registerTreeNodeRSModel(rs );
        }
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("6902B415-D12D-41B8-83B6-72E9F1B5C941");
            rs.setChildTreeNodeId("4689546D-8518-4A92-90F9-03ACADDD1620");
            rs.init(this);
            node4.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node4);

        TreeDEDataSetNodeModel  node5 = new TreeDEDataSetNodeModel ();
        node5.setDEDataSetName("UX_PRO_PCY");
        node5.setIdField("ORGID");
        node5.setTextField("ORGNAME");
        node5.setSortField("ORGID");
        node5.setSortDir("ASC");
        //ORG
        node5.setDEName("ORG");
        node5.setId("B2AE86C2-1587-49BB-BA42-F048F6DDF2F3");
        node5.setName("省院派出院");
        node5.setIconCls("fa fa-bank");
        node5.setNodeType("PROPCY");

        node5.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("B2AE86C2-1587-49BB-BA42-F048F6DDF2F3");
            rs.setChildTreeNodeId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
            rs.init(this);
            node5.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node5);

        TreeDEDataSetNodeModel  node6 = new TreeDEDataSetNodeModel ();
        node6.setDEDataSetName("OrgRoot");
        node6.setSortField("ORGCODE");
        //ORGSECTOR
        node6.setDEName("ORGSECTOR");
        node6.setId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
        node6.setName("组织部门");
        node6.setIconCls("fa fa-sitemap");
        node6.setNodeType("ORGSECTOR");

        node6.init(this);
        if(true) {
            TreeNodeRSModel rs = new TreeNodeRSModel();
            rs.setParentTreeNodeId("BB20FDF1-EFF5-4F22-99C9-668B7F23311E");
            rs.setChildTreeNodeId("674AE5D1-3F84-4601-91A1-A1E422937533");
            rs.init(this);
            node6.registerTreeNodeRSModel(rs );
        }
        registerTreeNodeModel(node6);
    }
}