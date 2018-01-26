/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ywsp.entity;


import java.io.Serializable;
import java.util.HashMap;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;

import java.sql.Timestamp;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;
import net.ibizsys.paas.util.JSONObjectHelper;
import net.ibizsys.paas.xml.XmlNode;
import net.ibizsys.paas.service.ServiceGlobal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 实体[OA_QXJ] 数据对象
 */
public class OA_QXJ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_QXJ.class);
    /**
     *   实体属性标识[院办会议标识]
     */
    public final static String FIELD_YBHYSQID = "YBHYSQID";
    /**
     *   实体属性标识[会议标题]
     */
    public final static String FIELD_YBHYSQNAME = "YBHYSQNAME";
    /**
     *   实体属性标识[请休假是否审核通过]
     */
    public final static String FIELD_QXJSFSHTG = "QXJSFSHTG";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[请休假标识]
     */
    public final static String FIELD_OA_QXJID = "OA_QXJID";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[请休假名称]
     */
    public final static String FIELD_OA_QXJNAME = "OA_QXJNAME";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[申请人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[职务]
     */
    public final static String FIELD_ZW = "ZW";
    /**
     *   实体属性标识[参加工作时间]
     */
    public final static String FIELD_CJGZSJ = "CJGZSJ";
    /**
     *   实体属性标识[请休假类型]
     */
    public final static String FIELD_QXJLX = "QXJLX";
    /**
     *   实体属性标识[请休假事由]
     */
    public final static String FIELD_QXJSY = "QXJSY";
    /**
     *   实体属性标识[开始时间]
     */
    public final static String FIELD_KSSJ = "KSSJ";
    /**
     *   实体属性标识[结束时间]
     */
    public final static String FIELD_JSSJ = "JSSJ";
    /**
     *   实体属性标识[时长]
     */
    public final static String FIELD_SC = "SC";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[请休假状态]
     */
    public final static String FIELD_QXJZT = "QXJZT";
    /**
     *   实体属性标识[请休假步骤]
     */
    public final static String FIELD_QXJBZ = "QXJBZ";

    private final static int INDEX_YBHYSQID = 0;
    private final static int INDEX_YBHYSQNAME = 1;
    private final static int INDEX_QXJSFSHTG = 2;
    private final static int INDEX_FJ = 3;
    private final static int INDEX_OA_QXJID = 4;
    private final static int INDEX_CREATEMAN = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_CREATEDATE = 7;
    private final static int INDEX_OA_QXJNAME = 8;
    private final static int INDEX_UPDATEMAN = 9;
    private final static int INDEX_ORGUSERID = 10;
    private final static int INDEX_ORGUSERNAME = 11;
    private final static int INDEX_ZW = 12;
    private final static int INDEX_CJGZSJ = 13;
    private final static int INDEX_QXJLX = 14;
    private final static int INDEX_QXJSY = 15;
    private final static int INDEX_KSSJ = 16;
    private final static int INDEX_JSSJ = 17;
    private final static int INDEX_SC = 18;
    private final static int INDEX_MEMO = 19;
    private final static int INDEX_WFINSTANCEID = 20;
    private final static int INDEX_WFSTATE = 21;
    private final static int INDEX_QXJZT = 22;
    private final static int INDEX_QXJBZ = 23;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_YBHYSQID, INDEX_YBHYSQID);
        fieldIndexMap.put( FIELD_YBHYSQNAME, INDEX_YBHYSQNAME);
        fieldIndexMap.put( FIELD_QXJSFSHTG, INDEX_QXJSFSHTG);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_OA_QXJID, INDEX_OA_QXJID);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_QXJNAME, INDEX_OA_QXJNAME);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ZW, INDEX_ZW);
        fieldIndexMap.put( FIELD_CJGZSJ, INDEX_CJGZSJ);
        fieldIndexMap.put( FIELD_QXJLX, INDEX_QXJLX);
        fieldIndexMap.put( FIELD_QXJSY, INDEX_QXJSY);
        fieldIndexMap.put( FIELD_KSSJ, INDEX_KSSJ);
        fieldIndexMap.put( FIELD_JSSJ, INDEX_JSSJ);
        fieldIndexMap.put( FIELD_SC, INDEX_SC);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_QXJZT, INDEX_QXJZT);
        fieldIndexMap.put( FIELD_QXJBZ, INDEX_QXJBZ);
    }

    private OA_QXJ proxyOA_QXJ = null;

    public OA_QXJ() {
        super();
    }
    private boolean ybhysqidDirtyFlag = false;
    private boolean ybhysqnameDirtyFlag = false;
    private boolean qxjsfshtgDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean oa_qxjidDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_qxjnameDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean zwDirtyFlag = false;
    private boolean cjgzsjDirtyFlag = false;
    private boolean qxjlxDirtyFlag = false;
    private boolean qxjsyDirtyFlag = false;
    private boolean kssjDirtyFlag = false;
    private boolean jssjDirtyFlag = false;
    private boolean scDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean qxjztDirtyFlag = false;
    private boolean qxjbzDirtyFlag = false;

    @Column(name="ybhysqid")
    private String ybhysqid;
    @Column(name="ybhysqname")
    private String ybhysqname;
    @Column(name="qxjsfshtg")
    private String qxjsfshtg;
    @Column(name="fj")
    private String fj;
    @Column(name="oa_qxjid")
    private String oa_qxjid;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_qxjname")
    private String oa_qxjname;
    @Column(name="updateman")
    private String updateman;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="zw")
    private String zw;
    @Column(name="cjgzsj")
    private Timestamp cjgzsj;
    @Column(name="qxjlx")
    private String qxjlx;
    @Column(name="qxjsy")
    private String qxjsy;
    @Column(name="kssj")
    private Timestamp kssj;
    @Column(name="jssj")
    private Timestamp jssj;
    @Column(name="sc")
    private Integer sc;
    @Column(name="memo")
    private String memo;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="qxjzt")
    private String qxjzt;
    @Column(name="qxjbz")
    private String qxjbz;


    /**
     *  设置属性值[院办会议标识]
     *  @param ybhysqid
     */
    public void setYBHYSQID(String ybhysqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYBHYSQID(ybhysqid);
            return;
        }
        if(ybhysqid!=null) {
            ybhysqid = StringHelper.trimRight(ybhysqid);
            if(ybhysqid.length()==0) {
                ybhysqid = null;
            }
        }
        this.ybhysqid =  ybhysqid;
        this.ybhysqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[院办会议标识]
     */
    public String getYBHYSQID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYBHYSQID();
        }
        return this.ybhysqid;
    }

    /**
     *  获取属性值[院办会议标识]是否修改
     */
    public boolean isYBHYSQIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYBHYSQIDDirty();
        }
        return this.ybhysqidDirtyFlag;
    }

    /**
     *  重置属性值[院办会议标识]
     */
    public void resetYBHYSQID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYBHYSQID();
            return;
        }

        this.ybhysqidDirtyFlag = false;
        this.ybhysqid = null;
    }
    /**
     *  设置属性值[会议标题]
     *  @param ybhysqname
     */
    public void setYBHYSQNAME(String ybhysqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYBHYSQNAME(ybhysqname);
            return;
        }
        if(ybhysqname!=null) {
            ybhysqname = StringHelper.trimRight(ybhysqname);
            if(ybhysqname.length()==0) {
                ybhysqname = null;
            }
        }
        this.ybhysqname =  ybhysqname;
        this.ybhysqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[会议标题]
     */
    public String getYBHYSQNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYBHYSQNAME();
        }
        return this.ybhysqname;
    }

    /**
     *  获取属性值[会议标题]是否修改
     */
    public boolean isYBHYSQNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYBHYSQNAMEDirty();
        }
        return this.ybhysqnameDirtyFlag;
    }

    /**
     *  重置属性值[会议标题]
     */
    public void resetYBHYSQNAME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYBHYSQNAME();
            return;
        }

        this.ybhysqnameDirtyFlag = false;
        this.ybhysqname = null;
    }
    /**
     *  设置属性值[请休假是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param qxjsfshtg
     */
    public void setQxjsfshtg(String qxjsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQxjsfshtg(qxjsfshtg);
            return;
        }
        if(qxjsfshtg!=null) {
            qxjsfshtg = StringHelper.trimRight(qxjsfshtg);
            if(qxjsfshtg.length()==0) {
                qxjsfshtg = null;
            }
        }
        this.qxjsfshtg =  qxjsfshtg;
        this.qxjsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getQxjsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQxjsfshtg();
        }
        return this.qxjsfshtg;
    }

    /**
     *  获取属性值[请休假是否审核通过]是否修改
     */
    public boolean isQxjsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQxjsfshtgDirty();
        }
        return this.qxjsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[请休假是否审核通过]
     */
    public void resetQxjsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQxjsfshtg();
            return;
        }

        this.qxjsfshtgDirtyFlag = false;
        this.qxjsfshtg = null;
    }
    /**
     *  设置属性值[附件]
     *  @param fj
     */
    public void setFj(String fj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFj(fj);
            return;
        }
        if(fj!=null) {
            fj = StringHelper.trimRight(fj);
            if(fj.length()==0) {
                fj = null;
            }
        }
        this.fj =  fj;
        this.fjDirtyFlag  = true;
    }

    /**
     *  获取属性值[附件]
     */
    public String getFj() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFj();
        }
        return this.fj;
    }

    /**
     *  获取属性值[附件]是否修改
     */
    public boolean isFjDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFjDirty();
        }
        return this.fjDirtyFlag;
    }

    /**
     *  重置属性值[附件]
     */
    public void resetFj() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFj();
            return;
        }

        this.fjDirtyFlag = false;
        this.fj = null;
    }
    /**
     *  设置属性值[请休假标识]
     *  @param oa_qxjid
     */
    public void setOA_QXJId(String oa_qxjid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_QXJId(oa_qxjid);
            return;
        }
        if(oa_qxjid!=null) {
            oa_qxjid = StringHelper.trimRight(oa_qxjid);
            if(oa_qxjid.length()==0) {
                oa_qxjid = null;
            }
        }
        this.oa_qxjid =  oa_qxjid;
        this.oa_qxjidDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假标识]
     */
    public String getOA_QXJId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_QXJId();
        }
        return this.oa_qxjid;
    }

    /**
     *  获取属性值[请休假标识]是否修改
     */
    public boolean isOA_QXJIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_QXJIdDirty();
        }
        return this.oa_qxjidDirtyFlag;
    }

    /**
     *  重置属性值[请休假标识]
     */
    public void resetOA_QXJId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_QXJId();
            return;
        }

        this.oa_qxjidDirtyFlag = false;
        this.oa_qxjid = null;
    }
    /**
     *  设置属性值[建立人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     *  @param createman
     */
    public void setCreateMan(String createman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateMan(createman);
            return;
        }
        if(createman!=null) {
            createman = StringHelper.trimRight(createman);
            if(createman.length()==0) {
                createman = null;
            }
        }
        this.createman =  createman;
        this.createmanDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     */
    public String getCreateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateMan();
        }
        return this.createman;
    }

    /**
     *  获取属性值[建立人]是否修改
     */
    public boolean isCreateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateManDirty();
        }
        return this.createmanDirtyFlag;
    }

    /**
     *  重置属性值[建立人]
     */
    public void resetCreateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateMan();
            return;
        }

        this.createmanDirtyFlag = false;
        this.createman = null;
    }
    /**
     *  设置属性值[更新时间]
     *  @param updatedate
     */
    public void setUpdateDate(Timestamp updatedate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateDate(updatedate);
            return;
        }
        this.updatedate =  updatedate;
        this.updatedateDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新时间]
     */
    public Timestamp getUpdateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateDate();
        }
        return this.updatedate;
    }

    /**
     *  获取属性值[更新时间]是否修改
     */
    public boolean isUpdateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateDateDirty();
        }
        return this.updatedateDirtyFlag;
    }

    /**
     *  重置属性值[更新时间]
     */
    public void resetUpdateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateDate();
            return;
        }

        this.updatedateDirtyFlag = false;
        this.updatedate = null;
    }
    /**
     *  设置属性值[建立时间]
     *  @param createdate
     */
    public void setCreateDate(Timestamp createdate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateDate(createdate);
            return;
        }
        this.createdate =  createdate;
        this.createdateDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立时间]
     */
    public Timestamp getCreateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateDate();
        }
        return this.createdate;
    }

    /**
     *  获取属性值[建立时间]是否修改
     */
    public boolean isCreateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateDateDirty();
        }
        return this.createdateDirtyFlag;
    }

    /**
     *  重置属性值[建立时间]
     */
    public void resetCreateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateDate();
            return;
        }

        this.createdateDirtyFlag = false;
        this.createdate = null;
    }
    /**
     *  设置属性值[请休假名称]
     *  @param oa_qxjname
     */
    public void setOA_QXJName(String oa_qxjname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_QXJName(oa_qxjname);
            return;
        }
        if(oa_qxjname!=null) {
            oa_qxjname = StringHelper.trimRight(oa_qxjname);
            if(oa_qxjname.length()==0) {
                oa_qxjname = null;
            }
        }
        this.oa_qxjname =  oa_qxjname;
        this.oa_qxjnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假名称]
     */
    public String getOA_QXJName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_QXJName();
        }
        return this.oa_qxjname;
    }

    /**
     *  获取属性值[请休假名称]是否修改
     */
    public boolean isOA_QXJNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_QXJNameDirty();
        }
        return this.oa_qxjnameDirtyFlag;
    }

    /**
     *  重置属性值[请休假名称]
     */
    public void resetOA_QXJName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_QXJName();
            return;
        }

        this.oa_qxjnameDirtyFlag = false;
        this.oa_qxjname = null;
    }
    /**
     *  设置属性值[更新人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     *  @param updateman
     */
    public void setUpdateMan(String updateman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateMan(updateman);
            return;
        }
        if(updateman!=null) {
            updateman = StringHelper.trimRight(updateman);
            if(updateman.length()==0) {
                updateman = null;
            }
        }
        this.updateman =  updateman;
        this.updatemanDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新人]代码表：com.sa.unip.srv.codelist.SysOperatorCodeListModel
     */
    public String getUpdateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateMan();
        }
        return this.updateman;
    }

    /**
     *  获取属性值[更新人]是否修改
     */
    public boolean isUpdateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateManDirty();
        }
        return this.updatemanDirtyFlag;
    }

    /**
     *  重置属性值[更新人]
     */
    public void resetUpdateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateMan();
            return;
        }

        this.updatemanDirtyFlag = false;
        this.updateman = null;
    }
    /**
     *  设置属性值[人员标识]
     *  @param orguserid
     */
    public void setOrgUserId(String orguserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserId(orguserid);
            return;
        }
        if(orguserid!=null) {
            orguserid = StringHelper.trimRight(orguserid);
            if(orguserid.length()==0) {
                orguserid = null;
            }
        }
        this.orguserid =  orguserid;
        this.orguseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[人员标识]
     */
    public void resetOrgUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserId();
            return;
        }

        this.orguseridDirtyFlag = false;
        this.orguserid = null;
    }
    /**
     *  设置属性值[申请人]
     *  @param orgusername
     */
    public void setOrgUserName(String orgusername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserName(orgusername);
            return;
        }
        if(orgusername!=null) {
            orgusername = StringHelper.trimRight(orgusername);
            if(orgusername.length()==0) {
                orgusername = null;
            }
        }
        this.orgusername =  orgusername;
        this.orgusernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[申请人]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[申请人]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[申请人]
     */
    public void resetOrgUserName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserName();
            return;
        }

        this.orgusernameDirtyFlag = false;
        this.orgusername = null;
    }
    /**
     *  设置属性值[职务]
     *  @param zw
     */
    public void setZW(String zw) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZW(zw);
            return;
        }
        if(zw!=null) {
            zw = StringHelper.trimRight(zw);
            if(zw.length()==0) {
                zw = null;
            }
        }
        this.zw =  zw;
        this.zwDirtyFlag  = true;
    }

    /**
     *  获取属性值[职务]
     */
    public String getZW() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZW();
        }
        return this.zw;
    }

    /**
     *  获取属性值[职务]是否修改
     */
    public boolean isZWDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZWDirty();
        }
        return this.zwDirtyFlag;
    }

    /**
     *  重置属性值[职务]
     */
    public void resetZW() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZW();
            return;
        }

        this.zwDirtyFlag = false;
        this.zw = null;
    }
    /**
     *  设置属性值[参加工作时间]
     *  @param cjgzsj
     */
    public void setCJGZSJ(Timestamp cjgzsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCJGZSJ(cjgzsj);
            return;
        }
        this.cjgzsj =  cjgzsj;
        this.cjgzsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[参加工作时间]
     */
    public Timestamp getCJGZSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCJGZSJ();
        }
        return this.cjgzsj;
    }

    /**
     *  获取属性值[参加工作时间]是否修改
     */
    public boolean isCJGZSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCJGZSJDirty();
        }
        return this.cjgzsjDirtyFlag;
    }

    /**
     *  重置属性值[参加工作时间]
     */
    public void resetCJGZSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCJGZSJ();
            return;
        }

        this.cjgzsjDirtyFlag = false;
        this.cjgzsj = null;
    }
    /**
     *  设置属性值[请休假类型]代码表：com.sa.unip.srv.codelist.QXJLXCodeListModel
     *  @param qxjlx
     */
    public void setQxjlx(String qxjlx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQxjlx(qxjlx);
            return;
        }
        if(qxjlx!=null) {
            qxjlx = StringHelper.trimRight(qxjlx);
            if(qxjlx.length()==0) {
                qxjlx = null;
            }
        }
        this.qxjlx =  qxjlx;
        this.qxjlxDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假类型]代码表：com.sa.unip.srv.codelist.QXJLXCodeListModel
     */
    public String getQxjlx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQxjlx();
        }
        return this.qxjlx;
    }

    /**
     *  获取属性值[请休假类型]是否修改
     */
    public boolean isQxjlxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQxjlxDirty();
        }
        return this.qxjlxDirtyFlag;
    }

    /**
     *  重置属性值[请休假类型]
     */
    public void resetQxjlx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQxjlx();
            return;
        }

        this.qxjlxDirtyFlag = false;
        this.qxjlx = null;
    }
    /**
     *  设置属性值[请休假事由]
     *  @param qxjsy
     */
    public void setQXJSY(String qxjsy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQXJSY(qxjsy);
            return;
        }
        if(qxjsy!=null) {
            qxjsy = StringHelper.trimRight(qxjsy);
            if(qxjsy.length()==0) {
                qxjsy = null;
            }
        }
        this.qxjsy =  qxjsy;
        this.qxjsyDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假事由]
     */
    public String getQXJSY() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQXJSY();
        }
        return this.qxjsy;
    }

    /**
     *  获取属性值[请休假事由]是否修改
     */
    public boolean isQXJSYDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQXJSYDirty();
        }
        return this.qxjsyDirtyFlag;
    }

    /**
     *  重置属性值[请休假事由]
     */
    public void resetQXJSY() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQXJSY();
            return;
        }

        this.qxjsyDirtyFlag = false;
        this.qxjsy = null;
    }
    /**
     *  设置属性值[开始时间]
     *  @param kssj
     */
    public void setKSSJ(Timestamp kssj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setKSSJ(kssj);
            return;
        }
        this.kssj =  kssj;
        this.kssjDirtyFlag  = true;
    }

    /**
     *  获取属性值[开始时间]
     */
    public Timestamp getKSSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getKSSJ();
        }
        return this.kssj;
    }

    /**
     *  获取属性值[开始时间]是否修改
     */
    public boolean isKSSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isKSSJDirty();
        }
        return this.kssjDirtyFlag;
    }

    /**
     *  重置属性值[开始时间]
     */
    public void resetKSSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetKSSJ();
            return;
        }

        this.kssjDirtyFlag = false;
        this.kssj = null;
    }
    /**
     *  设置属性值[结束时间]
     *  @param jssj
     */
    public void setJSSJ(Timestamp jssj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJSSJ(jssj);
            return;
        }
        this.jssj =  jssj;
        this.jssjDirtyFlag  = true;
    }

    /**
     *  获取属性值[结束时间]
     */
    public Timestamp getJSSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJSSJ();
        }
        return this.jssj;
    }

    /**
     *  获取属性值[结束时间]是否修改
     */
    public boolean isJSSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJSSJDirty();
        }
        return this.jssjDirtyFlag;
    }

    /**
     *  重置属性值[结束时间]
     */
    public void resetJSSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJSSJ();
            return;
        }

        this.jssjDirtyFlag = false;
        this.jssj = null;
    }
    /**
     *  设置属性值[时长]
     *  @param sc
     */
    public void setSc(Integer sc) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSc(sc);
            return;
        }
        this.sc =  sc;
        this.scDirtyFlag  = true;
    }

    /**
     *  获取属性值[时长]
     */
    public Integer getSc() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSc();
        }
        return this.sc;
    }

    /**
     *  获取属性值[时长]是否修改
     */
    public boolean isScDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isScDirty();
        }
        return this.scDirtyFlag;
    }

    /**
     *  重置属性值[时长]
     */
    public void resetSc() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSc();
            return;
        }

        this.scDirtyFlag = false;
        this.sc = null;
    }
    /**
     *  设置属性值[审核意见]
     *  @param memo
     */
    public void setMemo(String memo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMemo(memo);
            return;
        }
        if(memo!=null) {
            memo = StringHelper.trimRight(memo);
            if(memo.length()==0) {
                memo = null;
            }
        }
        this.memo =  memo;
        this.memoDirtyFlag  = true;
    }

    /**
     *  获取属性值[审核意见]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[审核意见]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[审核意见]
     */
    public void resetMemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMemo();
            return;
        }

        this.memoDirtyFlag = false;
        this.memo = null;
    }
    /**
     *  设置属性值[工作流实例]
     *  @param wfinstanceid
     */
    public void setWFINSTANCEID(String wfinstanceid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFINSTANCEID(wfinstanceid);
            return;
        }
        if(wfinstanceid!=null) {
            wfinstanceid = StringHelper.trimRight(wfinstanceid);
            if(wfinstanceid.length()==0) {
                wfinstanceid = null;
            }
        }
        this.wfinstanceid =  wfinstanceid;
        this.wfinstanceidDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流实例]
     */
    public String getWFINSTANCEID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFINSTANCEID();
        }
        return this.wfinstanceid;
    }

    /**
     *  获取属性值[工作流实例]是否修改
     */
    public boolean isWFINSTANCEIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFINSTANCEIDDirty();
        }
        return this.wfinstanceidDirtyFlag;
    }

    /**
     *  重置属性值[工作流实例]
     */
    public void resetWFINSTANCEID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFINSTANCEID();
            return;
        }

        this.wfinstanceidDirtyFlag = false;
        this.wfinstanceid = null;
    }
    /**
     *  设置属性值[工作流状态]代码表：com.sa.unip.srv.codelist.WFStatesCodeListModel
     *  @param wfstate
     */
    public void setWFSTATE(Integer wfstate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFSTATE(wfstate);
            return;
        }
        this.wfstate =  wfstate;
        this.wfstateDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流状态]代码表：com.sa.unip.srv.codelist.WFStatesCodeListModel
     */
    public Integer getWFSTATE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFSTATE();
        }
        return this.wfstate;
    }

    /**
     *  获取属性值[工作流状态]是否修改
     */
    public boolean isWFSTATEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFSTATEDirty();
        }
        return this.wfstateDirtyFlag;
    }

    /**
     *  重置属性值[工作流状态]
     */
    public void resetWFSTATE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFSTATE();
            return;
        }

        this.wfstateDirtyFlag = false;
        this.wfstate = null;
    }
    /**
     *  设置属性值[请休假状态]代码表：com.sa.unip.srv.codelist.CL_QXJSQZTCodeListModel
     *  @param qxjzt
     */
    public void setQXJZT(String qxjzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQXJZT(qxjzt);
            return;
        }
        if(qxjzt!=null) {
            qxjzt = StringHelper.trimRight(qxjzt);
            if(qxjzt.length()==0) {
                qxjzt = null;
            }
        }
        this.qxjzt =  qxjzt;
        this.qxjztDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假状态]代码表：com.sa.unip.srv.codelist.CL_QXJSQZTCodeListModel
     */
    public String getQXJZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQXJZT();
        }
        return this.qxjzt;
    }

    /**
     *  获取属性值[请休假状态]是否修改
     */
    public boolean isQXJZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQXJZTDirty();
        }
        return this.qxjztDirtyFlag;
    }

    /**
     *  重置属性值[请休假状态]
     */
    public void resetQXJZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQXJZT();
            return;
        }

        this.qxjztDirtyFlag = false;
        this.qxjzt = null;
    }
    /**
     *  设置属性值[请休假步骤]代码表：com.sa.unip.srv.codelist.CL_QXJSQBZCodeListModel
     *  @param qxjbz
     */
    public void setQXJBZ(String qxjbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQXJBZ(qxjbz);
            return;
        }
        if(qxjbz!=null) {
            qxjbz = StringHelper.trimRight(qxjbz);
            if(qxjbz.length()==0) {
                qxjbz = null;
            }
        }
        this.qxjbz =  qxjbz;
        this.qxjbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[请休假步骤]代码表：com.sa.unip.srv.codelist.CL_QXJSQBZCodeListModel
     */
    public String getQXJBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQXJBZ();
        }
        return this.qxjbz;
    }

    /**
     *  获取属性值[请休假步骤]是否修改
     */
    public boolean isQXJBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQXJBZDirty();
        }
        return this.qxjbzDirtyFlag;
    }

    /**
     *  重置属性值[请休假步骤]
     */
    public void resetQXJBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQXJBZ();
            return;
        }

        this.qxjbzDirtyFlag = false;
        this.qxjbz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_QXJ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_QXJ et) {
        et.resetYBHYSQID();
        et.resetYBHYSQNAME();
        et.resetQxjsfshtg();
        et.resetFj();
        et.resetOA_QXJId();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetCreateDate();
        et.resetOA_QXJName();
        et.resetUpdateMan();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetZW();
        et.resetCJGZSJ();
        et.resetQxjlx();
        et.resetQXJSY();
        et.resetKSSJ();
        et.resetJSSJ();
        et.resetSc();
        et.resetMemo();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetQXJZT();
        et.resetQXJBZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isYBHYSQIDDirty()) {
            params.put(FIELD_YBHYSQID,getYBHYSQID());
        }
        if(!bDirtyOnly || isYBHYSQNAMEDirty()) {
            params.put(FIELD_YBHYSQNAME,getYBHYSQNAME());
        }
        if(!bDirtyOnly || isQxjsfshtgDirty()) {
            params.put(FIELD_QXJSFSHTG,getQxjsfshtg());
        }
        if(!bDirtyOnly || isFjDirty()) {
            params.put(FIELD_FJ,getFj());
        }
        if(!bDirtyOnly || isOA_QXJIdDirty()) {
            params.put(FIELD_OA_QXJID,getOA_QXJId());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isOA_QXJNameDirty()) {
            params.put(FIELD_OA_QXJNAME,getOA_QXJName());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isZWDirty()) {
            params.put(FIELD_ZW,getZW());
        }
        if(!bDirtyOnly || isCJGZSJDirty()) {
            params.put(FIELD_CJGZSJ,getCJGZSJ());
        }
        if(!bDirtyOnly || isQxjlxDirty()) {
            params.put(FIELD_QXJLX,getQxjlx());
        }
        if(!bDirtyOnly || isQXJSYDirty()) {
            params.put(FIELD_QXJSY,getQXJSY());
        }
        if(!bDirtyOnly || isKSSJDirty()) {
            params.put(FIELD_KSSJ,getKSSJ());
        }
        if(!bDirtyOnly || isJSSJDirty()) {
            params.put(FIELD_JSSJ,getJSSJ());
        }
        if(!bDirtyOnly || isScDirty()) {
            params.put(FIELD_SC,getSc());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isQXJZTDirty()) {
            params.put(FIELD_QXJZT,getQXJZT());
        }
        if(!bDirtyOnly || isQXJBZDirty()) {
            params.put(FIELD_QXJBZ,getQXJBZ());
        }
        super.onFillMap(params, bDirtyOnly);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#get(java.lang.String)
     */
    @Override
    public Object get(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().get(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.get(strParamName);

        return  OA_QXJ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_QXJ et,int index) throws Exception {

        switch(index) {
        case INDEX_YBHYSQID:
            return et.getYBHYSQID();
        case INDEX_YBHYSQNAME:
            return et.getYBHYSQNAME();
        case INDEX_QXJSFSHTG:
            return et.getQxjsfshtg();
        case INDEX_FJ:
            return et.getFj();
        case INDEX_OA_QXJID:
            return et.getOA_QXJId();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_QXJNAME:
            return et.getOA_QXJName();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ZW:
            return et.getZW();
        case INDEX_CJGZSJ:
            return et.getCJGZSJ();
        case INDEX_QXJLX:
            return et.getQxjlx();
        case INDEX_QXJSY:
            return et.getQXJSY();
        case INDEX_KSSJ:
            return et.getKSSJ();
        case INDEX_JSSJ:
            return et.getJSSJ();
        case INDEX_SC:
            return et.getSc();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_QXJZT:
            return et.getQXJZT();
        case INDEX_QXJBZ:
            return et.getQXJBZ();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#set(java.lang.String, java.lang.Object)
     */
    @Override
    public void set(String strParamName,Object objValue) throws Exception {
        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().set(strParamName,objValue);
            return;
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null) {
            super.set(strParamName,objValue);
            return;
        }

        OA_QXJ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_QXJ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_YBHYSQID:
            et.setYBHYSQID(DataObject.getStringValue(obj));
            return ;
        case INDEX_YBHYSQNAME:
            et.setYBHYSQNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_QXJSFSHTG:
            et.setQxjsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFj(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_QXJID:
            et.setOA_QXJId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_QXJNAME:
            et.setOA_QXJName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZW:
            et.setZW(DataObject.getStringValue(obj));
            return ;
        case INDEX_CJGZSJ:
            et.setCJGZSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_QXJLX:
            et.setQxjlx(DataObject.getStringValue(obj));
            return ;
        case INDEX_QXJSY:
            et.setQXJSY(DataObject.getStringValue(obj));
            return ;
        case INDEX_KSSJ:
            et.setKSSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_JSSJ:
            et.setJSSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SC:
            et.setSc(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_QXJZT:
            et.setQXJZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_QXJBZ:
            et.setQXJBZ(DataObject.getStringValue(obj));
            return ;
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#isNull(java.lang.String)
     */
    @Override
    public boolean isNull(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNull(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.isNull(strParamName);

        return  OA_QXJ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_QXJ et,int index) throws Exception {

        switch(index) {
        case INDEX_YBHYSQID:
            return et.getYBHYSQID()==null;
        case INDEX_YBHYSQNAME:
            return et.getYBHYSQNAME()==null;
        case INDEX_QXJSFSHTG:
            return et.getQxjsfshtg()==null;
        case INDEX_FJ:
            return et.getFj()==null;
        case INDEX_OA_QXJID:
            return et.getOA_QXJId()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_QXJNAME:
            return et.getOA_QXJName()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ZW:
            return et.getZW()==null;
        case INDEX_CJGZSJ:
            return et.getCJGZSJ()==null;
        case INDEX_QXJLX:
            return et.getQxjlx()==null;
        case INDEX_QXJSY:
            return et.getQXJSY()==null;
        case INDEX_KSSJ:
            return et.getKSSJ()==null;
        case INDEX_JSSJ:
            return et.getJSSJ()==null;
        case INDEX_SC:
            return et.getSc()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_QXJZT:
            return et.getQXJZT()==null;
        case INDEX_QXJBZ:
            return et.getQXJBZ()==null;
        default:
            throw new Exception("不明属性标识");
        }
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#contains(java.lang.String)
     */
    @Override
    public boolean contains(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().contains(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.contains(strParamName);

        return  OA_QXJ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_QXJ et,int index) throws Exception {

        switch(index) {
        case INDEX_YBHYSQID:
            return et.isYBHYSQIDDirty();
        case INDEX_YBHYSQNAME:
            return et.isYBHYSQNAMEDirty();
        case INDEX_QXJSFSHTG:
            return et.isQxjsfshtgDirty();
        case INDEX_FJ:
            return et.isFjDirty();
        case INDEX_OA_QXJID:
            return et.isOA_QXJIdDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_QXJNAME:
            return et.isOA_QXJNameDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ZW:
            return et.isZWDirty();
        case INDEX_CJGZSJ:
            return et.isCJGZSJDirty();
        case INDEX_QXJLX:
            return et.isQxjlxDirty();
        case INDEX_QXJSY:
            return et.isQXJSYDirty();
        case INDEX_KSSJ:
            return et.isKSSJDirty();
        case INDEX_JSSJ:
            return et.isJSSJDirty();
        case INDEX_SC:
            return et.isScDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_QXJZT:
            return et.isQXJZTDirty();
        case INDEX_QXJBZ:
            return et.isQXJBZDirty();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillJSONObject(net.sf.json.JSONObject, boolean)
     */
    @Override
    protected void onFillJSONObject(JSONObject objJSON, boolean bIncludeEmpty) throws Exception {
        fillJSONObject(this,objJSON,bIncludeEmpty);
        super.onFillJSONObject(objJSON, bIncludeEmpty);
    }

    /**
     * 填充当前对象到JSON
     * @param et 当前数据对象
     * @param json JSON对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static  void fillJSONObject(OA_QXJ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYBHYSQID()!=null) {
            JSONObjectHelper.put(json,"ybhysqid",getJSONValue(et.getYBHYSQID()),false);
        }
        if(bIncEmpty||et.getYBHYSQNAME()!=null) {
            JSONObjectHelper.put(json,"ybhysqname",getJSONValue(et.getYBHYSQNAME()),false);
        }
        if(bIncEmpty||et.getQxjsfshtg()!=null) {
            JSONObjectHelper.put(json,"qxjsfshtg",getJSONValue(et.getQxjsfshtg()),false);
        }
        if(bIncEmpty||et.getFj()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFj()),false);
        }
        if(bIncEmpty||et.getOA_QXJId()!=null) {
            JSONObjectHelper.put(json,"oa_qxjid",getJSONValue(et.getOA_QXJId()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getOA_QXJName()!=null) {
            JSONObjectHelper.put(json,"oa_qxjname",getJSONValue(et.getOA_QXJName()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getZW()!=null) {
            JSONObjectHelper.put(json,"zw",getJSONValue(et.getZW()),false);
        }
        if(bIncEmpty||et.getCJGZSJ()!=null) {
            JSONObjectHelper.put(json,"cjgzsj",getJSONValue(et.getCJGZSJ()),false);
        }
        if(bIncEmpty||et.getQxjlx()!=null) {
            JSONObjectHelper.put(json,"qxjlx",getJSONValue(et.getQxjlx()),false);
        }
        if(bIncEmpty||et.getQXJSY()!=null) {
            JSONObjectHelper.put(json,"qxjsy",getJSONValue(et.getQXJSY()),false);
        }
        if(bIncEmpty||et.getKSSJ()!=null) {
            JSONObjectHelper.put(json,"kssj",getJSONValue(et.getKSSJ()),false);
        }
        if(bIncEmpty||et.getJSSJ()!=null) {
            JSONObjectHelper.put(json,"jssj",getJSONValue(et.getJSSJ()),false);
        }
        if(bIncEmpty||et.getSc()!=null) {
            JSONObjectHelper.put(json,"sc",getJSONValue(et.getSc()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getQXJZT()!=null) {
            JSONObjectHelper.put(json,"qxjzt",getJSONValue(et.getQXJZT()),false);
        }
        if(bIncEmpty||et.getQXJBZ()!=null) {
            JSONObjectHelper.put(json,"qxjbz",getJSONValue(et.getQXJBZ()),false);
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillXmlNode(net.ibizsys.paas.xml.XmlNode, boolean)
     */
    @Override
    protected void onFillXmlNode(XmlNode xmlNode,boolean bIncludeEmpty) throws Exception {
        fillXmlNode(this,xmlNode,bIncludeEmpty);
        super.onFillXmlNode(xmlNode, bIncludeEmpty);
    }

    /**
     * 填充当前对象到Xml节点中
     * @param et 当前数据对象
     * @param node Xml节点
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void fillXmlNode(OA_QXJ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getYBHYSQID()!=null) {
            Object obj = et.getYBHYSQID();
            node.setAttribute("YBHYSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYBHYSQNAME()!=null) {
            Object obj = et.getYBHYSQNAME();
            node.setAttribute("YBHYSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getQxjsfshtg()!=null) {
            Object obj = et.getQxjsfshtg();
            node.setAttribute("QXJSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFj()!=null) {
            Object obj = et.getFj();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_QXJId()!=null) {
            Object obj = et.getOA_QXJId();
            node.setAttribute("OA_QXJID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_QXJName()!=null) {
            Object obj = et.getOA_QXJName();
            node.setAttribute("OA_QXJNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZW()!=null) {
            Object obj = et.getZW();
            node.setAttribute("ZW",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCJGZSJ()!=null) {
            Object obj = et.getCJGZSJ();
            node.setAttribute("CJGZSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getQxjlx()!=null) {
            Object obj = et.getQxjlx();
            node.setAttribute("QXJLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getQXJSY()!=null) {
            Object obj = et.getQXJSY();
            node.setAttribute("QXJSY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getKSSJ()!=null) {
            Object obj = et.getKSSJ();
            node.setAttribute("KSSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getJSSJ()!=null) {
            Object obj = et.getJSSJ();
            node.setAttribute("JSSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSc()!=null) {
            Object obj = et.getSc();
            node.setAttribute("SC",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getQXJZT()!=null) {
            Object obj = et.getQXJZT();
            node.setAttribute("QXJZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getQXJBZ()!=null) {
            Object obj = et.getQXJBZ();
            node.setAttribute("QXJBZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_QXJ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_QXJ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isYBHYSQIDDirty() && (bIncEmpty||et.getYBHYSQID()!=null)) {
            dst.set(FIELD_YBHYSQID,et.getYBHYSQID());
        }
        if(et.isYBHYSQNAMEDirty() && (bIncEmpty||et.getYBHYSQNAME()!=null)) {
            dst.set(FIELD_YBHYSQNAME,et.getYBHYSQNAME());
        }
        if(et.isQxjsfshtgDirty() && (bIncEmpty||et.getQxjsfshtg()!=null)) {
            dst.set(FIELD_QXJSFSHTG,et.getQxjsfshtg());
        }
        if(et.isFjDirty() && (bIncEmpty||et.getFj()!=null)) {
            dst.set(FIELD_FJ,et.getFj());
        }
        if(et.isOA_QXJIdDirty() && (bIncEmpty||et.getOA_QXJId()!=null)) {
            dst.set(FIELD_OA_QXJID,et.getOA_QXJId());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isOA_QXJNameDirty() && (bIncEmpty||et.getOA_QXJName()!=null)) {
            dst.set(FIELD_OA_QXJNAME,et.getOA_QXJName());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isZWDirty() && (bIncEmpty||et.getZW()!=null)) {
            dst.set(FIELD_ZW,et.getZW());
        }
        if(et.isCJGZSJDirty() && (bIncEmpty||et.getCJGZSJ()!=null)) {
            dst.set(FIELD_CJGZSJ,et.getCJGZSJ());
        }
        if(et.isQxjlxDirty() && (bIncEmpty||et.getQxjlx()!=null)) {
            dst.set(FIELD_QXJLX,et.getQxjlx());
        }
        if(et.isQXJSYDirty() && (bIncEmpty||et.getQXJSY()!=null)) {
            dst.set(FIELD_QXJSY,et.getQXJSY());
        }
        if(et.isKSSJDirty() && (bIncEmpty||et.getKSSJ()!=null)) {
            dst.set(FIELD_KSSJ,et.getKSSJ());
        }
        if(et.isJSSJDirty() && (bIncEmpty||et.getJSSJ()!=null)) {
            dst.set(FIELD_JSSJ,et.getJSSJ());
        }
        if(et.isScDirty() && (bIncEmpty||et.getSc()!=null)) {
            dst.set(FIELD_SC,et.getSc());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isQXJZTDirty() && (bIncEmpty||et.getQXJZT()!=null)) {
            dst.set(FIELD_QXJZT,et.getQXJZT());
        }
        if(et.isQXJBZDirty() && (bIncEmpty||et.getQXJBZ()!=null)) {
            dst.set(FIELD_QXJBZ,et.getQXJBZ());
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#remove(java.lang.String)
     */
    @Override
    public boolean remove(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().remove(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.remove(strParamName);
        return  OA_QXJ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_QXJ et,int index) throws Exception {
        switch(index) {
        case INDEX_YBHYSQID:
            et.resetYBHYSQID();
            return true;
        case INDEX_YBHYSQNAME:
            et.resetYBHYSQNAME();
            return true;
        case INDEX_QXJSFSHTG:
            et.resetQxjsfshtg();
            return true;
        case INDEX_FJ:
            et.resetFj();
            return true;
        case INDEX_OA_QXJID:
            et.resetOA_QXJId();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_OA_QXJNAME:
            et.resetOA_QXJName();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_ZW:
            et.resetZW();
            return true;
        case INDEX_CJGZSJ:
            et.resetCJGZSJ();
            return true;
        case INDEX_QXJLX:
            et.resetQxjlx();
            return true;
        case INDEX_QXJSY:
            et.resetQXJSY();
            return true;
        case INDEX_KSSJ:
            et.resetKSSJ();
            return true;
        case INDEX_JSSJ:
            et.resetJSSJ();
            return true;
        case INDEX_SC:
            et.resetSc();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_QXJZT:
            et.resetQXJZT();
            return true;
        case INDEX_QXJBZ:
            et.resetQXJBZ();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objYBHYSQLock = new Object();
    private com.sa.unip.srv.ywsp.entity.OA_YBHYSQ ybhysq = null;
    /**
    * 获取父数据 会议申请
     * @throws Exception
    */
    public com.sa.unip.srv.ywsp.entity.OA_YBHYSQ getYBHYSQ() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYBHYSQ();
        }

        if(this.getYBHYSQID()==null)
            return null;
        synchronized(objYBHYSQLock) {
            if(ybhysq==null) {
                ybhysq = new com.sa.unip.srv.ywsp.entity.OA_YBHYSQ();
                ybhysq.setOA_YBHYSQId(this.getYBHYSQID());
                com.sa.unip.srv.ywsp.service.OA_YBHYSQService service = (com.sa.unip.srv.ywsp.service.OA_YBHYSQService)ServiceGlobal.getService(com.sa.unip.srv.ywsp.service.OA_YBHYSQService.class,this.getSessionFactory());
                service.autoGet(ybhysq);
            }
            return ybhysq;
        }
    }

    private Object objRYBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser rybs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getRYBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRYBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objRYBSLock) {
            if(rybs==null) {
                rybs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                rybs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(rybs);
            }
            return rybs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_QXJ getProxyEntity() {
        return this.proxyOA_QXJ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_QXJ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_QXJ) {
            this.proxyOA_QXJ = (OA_QXJ)proxyDataObject;
        }

    }

}