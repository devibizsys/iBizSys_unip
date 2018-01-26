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
 * 实体[OA_CCSQ] 数据对象
 */
public class OA_CCSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CCSQ.class);
    /**
     *   实体属性标识[出差申请是否审核通过]
     */
    public final static String FIELD_CCSQSFSHTG = "CCSQSFSHTG";
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[出差申请标识]
     */
    public final static String FIELD_OA_CCSQID = "OA_CCSQID";
    /**
     *   实体属性标识[出差申请名称]
     */
    public final static String FIELD_OA_CCSQNAME = "OA_CCSQNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
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
     *   实体属性标识[出差事由]
     */
    public final static String FIELD_CCSY = "CCSY";
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
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";
    /**
     *   实体属性标识[工作流实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     *   实体属性标识[工作流状态]
     */
    public final static String FIELD_WFSTATE = "WFSTATE";
    /**
     *   实体属性标识[出差申请状态]
     */
    public final static String FIELD_CCSQZT = "CCSQZT";
    /**
     *   实体属性标识[出差申请步骤]
     */
    public final static String FIELD_CCSQBZ = "CCSQBZ";
    /**
     *   实体属性标识[出差地址]
     */
    public final static String FIELD_CCDZ = "CCDZ";

    private final static int INDEX_CCSQSFSHTG = 0;
    private final static int INDEX_MEMO = 1;
    private final static int INDEX_OA_CCSQID = 2;
    private final static int INDEX_OA_CCSQNAME = 3;
    private final static int INDEX_CREATEMAN = 4;
    private final static int INDEX_CREATEDATE = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_CCSY = 10;
    private final static int INDEX_KSSJ = 11;
    private final static int INDEX_JSSJ = 12;
    private final static int INDEX_SC = 13;
    private final static int INDEX_FJ = 14;
    private final static int INDEX_WFINSTANCEID = 15;
    private final static int INDEX_WFSTATE = 16;
    private final static int INDEX_CCSQZT = 17;
    private final static int INDEX_CCSQBZ = 18;
    private final static int INDEX_CCDZ = 19;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CCSQSFSHTG, INDEX_CCSQSFSHTG);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_OA_CCSQID, INDEX_OA_CCSQID);
        fieldIndexMap.put( FIELD_OA_CCSQNAME, INDEX_OA_CCSQNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_CCSY, INDEX_CCSY);
        fieldIndexMap.put( FIELD_KSSJ, INDEX_KSSJ);
        fieldIndexMap.put( FIELD_JSSJ, INDEX_JSSJ);
        fieldIndexMap.put( FIELD_SC, INDEX_SC);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_CCSQZT, INDEX_CCSQZT);
        fieldIndexMap.put( FIELD_CCSQBZ, INDEX_CCSQBZ);
        fieldIndexMap.put( FIELD_CCDZ, INDEX_CCDZ);
    }

    private OA_CCSQ proxyOA_CCSQ = null;

    public OA_CCSQ() {
        super();
    }
    private boolean ccsqsfshtgDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean oa_ccsqidDirtyFlag = false;
    private boolean oa_ccsqnameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean ccsyDirtyFlag = false;
    private boolean kssjDirtyFlag = false;
    private boolean jssjDirtyFlag = false;
    private boolean scDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean ccsqztDirtyFlag = false;
    private boolean ccsqbzDirtyFlag = false;
    private boolean ccdzDirtyFlag = false;

    @Column(name="ccsqsfshtg")
    private String ccsqsfshtg;
    @Column(name="memo")
    private String memo;
    @Column(name="oa_ccsqid")
    private String oa_ccsqid;
    @Column(name="oa_ccsqname")
    private String oa_ccsqname;
    @Column(name="createman")
    private String createman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="ccsy")
    private String ccsy;
    @Column(name="kssj")
    private Timestamp kssj;
    @Column(name="jssj")
    private Timestamp jssj;
    @Column(name="sc")
    private Integer sc;
    @Column(name="fj")
    private String fj;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="ccsqzt")
    private String ccsqzt;
    @Column(name="ccsqbz")
    private String ccsqbz;
    @Column(name="ccdz")
    private String ccdz;


    /**
     *  设置属性值[出差申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param ccsqsfshtg
     */
    public void setCcsqsfshtg(String ccsqsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCcsqsfshtg(ccsqsfshtg);
            return;
        }
        if(ccsqsfshtg!=null) {
            ccsqsfshtg = StringHelper.trimRight(ccsqsfshtg);
            if(ccsqsfshtg.length()==0) {
                ccsqsfshtg = null;
            }
        }
        this.ccsqsfshtg =  ccsqsfshtg;
        this.ccsqsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getCcsqsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCcsqsfshtg();
        }
        return this.ccsqsfshtg;
    }

    /**
     *  获取属性值[出差申请是否审核通过]是否修改
     */
    public boolean isCcsqsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCcsqsfshtgDirty();
        }
        return this.ccsqsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[出差申请是否审核通过]
     */
    public void resetCcsqsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCcsqsfshtg();
            return;
        }

        this.ccsqsfshtgDirtyFlag = false;
        this.ccsqsfshtg = null;
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
     *  设置属性值[出差申请标识]
     *  @param oa_ccsqid
     */
    public void setOA_CCSQId(String oa_ccsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CCSQId(oa_ccsqid);
            return;
        }
        if(oa_ccsqid!=null) {
            oa_ccsqid = StringHelper.trimRight(oa_ccsqid);
            if(oa_ccsqid.length()==0) {
                oa_ccsqid = null;
            }
        }
        this.oa_ccsqid =  oa_ccsqid;
        this.oa_ccsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差申请标识]
     */
    public String getOA_CCSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CCSQId();
        }
        return this.oa_ccsqid;
    }

    /**
     *  获取属性值[出差申请标识]是否修改
     */
    public boolean isOA_CCSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CCSQIdDirty();
        }
        return this.oa_ccsqidDirtyFlag;
    }

    /**
     *  重置属性值[出差申请标识]
     */
    public void resetOA_CCSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CCSQId();
            return;
        }

        this.oa_ccsqidDirtyFlag = false;
        this.oa_ccsqid = null;
    }
    /**
     *  设置属性值[出差申请名称]
     *  @param oa_ccsqname
     */
    public void setOA_CCSQName(String oa_ccsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CCSQName(oa_ccsqname);
            return;
        }
        if(oa_ccsqname!=null) {
            oa_ccsqname = StringHelper.trimRight(oa_ccsqname);
            if(oa_ccsqname.length()==0) {
                oa_ccsqname = null;
            }
        }
        this.oa_ccsqname =  oa_ccsqname;
        this.oa_ccsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差申请名称]
     */
    public String getOA_CCSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CCSQName();
        }
        return this.oa_ccsqname;
    }

    /**
     *  获取属性值[出差申请名称]是否修改
     */
    public boolean isOA_CCSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CCSQNameDirty();
        }
        return this.oa_ccsqnameDirtyFlag;
    }

    /**
     *  重置属性值[出差申请名称]
     */
    public void resetOA_CCSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CCSQName();
            return;
        }

        this.oa_ccsqnameDirtyFlag = false;
        this.oa_ccsqname = null;
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
     *  设置属性值[出差事由]
     *  @param ccsy
     */
    public void setCCSY(String ccsy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCCSY(ccsy);
            return;
        }
        if(ccsy!=null) {
            ccsy = StringHelper.trimRight(ccsy);
            if(ccsy.length()==0) {
                ccsy = null;
            }
        }
        this.ccsy =  ccsy;
        this.ccsyDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差事由]
     */
    public String getCCSY() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCCSY();
        }
        return this.ccsy;
    }

    /**
     *  获取属性值[出差事由]是否修改
     */
    public boolean isCCSYDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCCSYDirty();
        }
        return this.ccsyDirtyFlag;
    }

    /**
     *  重置属性值[出差事由]
     */
    public void resetCCSY() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCCSY();
            return;
        }

        this.ccsyDirtyFlag = false;
        this.ccsy = null;
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
     *  设置属性值[附件]
     *  @param fj
     */
    public void setFJ(String fj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFJ(fj);
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
    public String getFJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFJ();
        }
        return this.fj;
    }

    /**
     *  获取属性值[附件]是否修改
     */
    public boolean isFJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFJDirty();
        }
        return this.fjDirtyFlag;
    }

    /**
     *  重置属性值[附件]
     */
    public void resetFJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFJ();
            return;
        }

        this.fjDirtyFlag = false;
        this.fj = null;
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
     *  设置属性值[出差申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param ccsqzt
     */
    public void setCCSQZT(String ccsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCCSQZT(ccsqzt);
            return;
        }
        if(ccsqzt!=null) {
            ccsqzt = StringHelper.trimRight(ccsqzt);
            if(ccsqzt.length()==0) {
                ccsqzt = null;
            }
        }
        this.ccsqzt =  ccsqzt;
        this.ccsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getCCSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCCSQZT();
        }
        return this.ccsqzt;
    }

    /**
     *  获取属性值[出差申请状态]是否修改
     */
    public boolean isCCSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCCSQZTDirty();
        }
        return this.ccsqztDirtyFlag;
    }

    /**
     *  重置属性值[出差申请状态]
     */
    public void resetCCSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCCSQZT();
            return;
        }

        this.ccsqztDirtyFlag = false;
        this.ccsqzt = null;
    }
    /**
     *  设置属性值[出差申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param ccsqbz
     */
    public void setCCSQBZ(String ccsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCCSQBZ(ccsqbz);
            return;
        }
        if(ccsqbz!=null) {
            ccsqbz = StringHelper.trimRight(ccsqbz);
            if(ccsqbz.length()==0) {
                ccsqbz = null;
            }
        }
        this.ccsqbz =  ccsqbz;
        this.ccsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getCCSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCCSQBZ();
        }
        return this.ccsqbz;
    }

    /**
     *  获取属性值[出差申请步骤]是否修改
     */
    public boolean isCCSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCCSQBZDirty();
        }
        return this.ccsqbzDirtyFlag;
    }

    /**
     *  重置属性值[出差申请步骤]
     */
    public void resetCCSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCCSQBZ();
            return;
        }

        this.ccsqbzDirtyFlag = false;
        this.ccsqbz = null;
    }
    /**
     *  设置属性值[出差地址]
     *  @param ccdz
     */
    public void setCCDZ(String ccdz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCCDZ(ccdz);
            return;
        }
        if(ccdz!=null) {
            ccdz = StringHelper.trimRight(ccdz);
            if(ccdz.length()==0) {
                ccdz = null;
            }
        }
        this.ccdz =  ccdz;
        this.ccdzDirtyFlag  = true;
    }

    /**
     *  获取属性值[出差地址]
     */
    public String getCCDZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCCDZ();
        }
        return this.ccdz;
    }

    /**
     *  获取属性值[出差地址]是否修改
     */
    public boolean isCCDZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCCDZDirty();
        }
        return this.ccdzDirtyFlag;
    }

    /**
     *  重置属性值[出差地址]
     */
    public void resetCCDZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCCDZ();
            return;
        }

        this.ccdzDirtyFlag = false;
        this.ccdz = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CCSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CCSQ et) {
        et.resetCcsqsfshtg();
        et.resetMemo();
        et.resetOA_CCSQId();
        et.resetOA_CCSQName();
        et.resetCreateMan();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetCCSY();
        et.resetKSSJ();
        et.resetJSSJ();
        et.resetSc();
        et.resetFJ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetCCSQZT();
        et.resetCCSQBZ();
        et.resetCCDZ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCcsqsfshtgDirty()) {
            params.put(FIELD_CCSQSFSHTG,getCcsqsfshtg());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOA_CCSQIdDirty()) {
            params.put(FIELD_OA_CCSQID,getOA_CCSQId());
        }
        if(!bDirtyOnly || isOA_CCSQNameDirty()) {
            params.put(FIELD_OA_CCSQNAME,getOA_CCSQName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
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
        if(!bDirtyOnly || isCCSYDirty()) {
            params.put(FIELD_CCSY,getCCSY());
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
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
        }
        if(!bDirtyOnly || isWFINSTANCEIDDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFINSTANCEID());
        }
        if(!bDirtyOnly || isWFSTATEDirty()) {
            params.put(FIELD_WFSTATE,getWFSTATE());
        }
        if(!bDirtyOnly || isCCSQZTDirty()) {
            params.put(FIELD_CCSQZT,getCCSQZT());
        }
        if(!bDirtyOnly || isCCSQBZDirty()) {
            params.put(FIELD_CCSQBZ,getCCSQBZ());
        }
        if(!bDirtyOnly || isCCDZDirty()) {
            params.put(FIELD_CCDZ,getCCDZ());
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

        return  OA_CCSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CCSQSFSHTG:
            return et.getCcsqsfshtg();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_OA_CCSQID:
            return et.getOA_CCSQId();
        case INDEX_OA_CCSQNAME:
            return et.getOA_CCSQName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_CCSY:
            return et.getCCSY();
        case INDEX_KSSJ:
            return et.getKSSJ();
        case INDEX_JSSJ:
            return et.getJSSJ();
        case INDEX_SC:
            return et.getSc();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_CCSQZT:
            return et.getCCSQZT();
        case INDEX_CCSQBZ:
            return et.getCCSQBZ();
        case INDEX_CCDZ:
            return et.getCCDZ();
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

        OA_CCSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CCSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CCSQSFSHTG:
            et.setCcsqsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CCSQID:
            et.setOA_CCSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CCSQNAME:
            et.setOA_CCSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
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
        case INDEX_CCSY:
            et.setCCSY(DataObject.getStringValue(obj));
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
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFINSTANCEID(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTATE:
            et.setWFSTATE(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CCSQZT:
            et.setCCSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_CCSQBZ:
            et.setCCSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_CCDZ:
            et.setCCDZ(DataObject.getStringValue(obj));
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

        return  OA_CCSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CCSQSFSHTG:
            return et.getCcsqsfshtg()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_OA_CCSQID:
            return et.getOA_CCSQId()==null;
        case INDEX_OA_CCSQNAME:
            return et.getOA_CCSQName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_CCSY:
            return et.getCCSY()==null;
        case INDEX_KSSJ:
            return et.getKSSJ()==null;
        case INDEX_JSSJ:
            return et.getJSSJ()==null;
        case INDEX_SC:
            return et.getSc()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_CCSQZT:
            return et.getCCSQZT()==null;
        case INDEX_CCSQBZ:
            return et.getCCSQBZ()==null;
        case INDEX_CCDZ:
            return et.getCCDZ()==null;
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

        return  OA_CCSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_CCSQSFSHTG:
            return et.isCcsqsfshtgDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_OA_CCSQID:
            return et.isOA_CCSQIdDirty();
        case INDEX_OA_CCSQNAME:
            return et.isOA_CCSQNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_CCSY:
            return et.isCCSYDirty();
        case INDEX_KSSJ:
            return et.isKSSJDirty();
        case INDEX_JSSJ:
            return et.isJSSJDirty();
        case INDEX_SC:
            return et.isScDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_CCSQZT:
            return et.isCCSQZTDirty();
        case INDEX_CCSQBZ:
            return et.isCCSQBZDirty();
        case INDEX_CCDZ:
            return et.isCCDZDirty();
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
    private static  void fillJSONObject(OA_CCSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCcsqsfshtg()!=null) {
            JSONObjectHelper.put(json,"ccsqsfshtg",getJSONValue(et.getCcsqsfshtg()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getOA_CCSQId()!=null) {
            JSONObjectHelper.put(json,"oa_ccsqid",getJSONValue(et.getOA_CCSQId()),false);
        }
        if(bIncEmpty||et.getOA_CCSQName()!=null) {
            JSONObjectHelper.put(json,"oa_ccsqname",getJSONValue(et.getOA_CCSQName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
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
        if(bIncEmpty||et.getCCSY()!=null) {
            JSONObjectHelper.put(json,"ccsy",getJSONValue(et.getCCSY()),false);
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
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFINSTANCEID()),false);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            JSONObjectHelper.put(json,"wfstate",getJSONValue(et.getWFSTATE()),false);
        }
        if(bIncEmpty||et.getCCSQZT()!=null) {
            JSONObjectHelper.put(json,"ccsqzt",getJSONValue(et.getCCSQZT()),false);
        }
        if(bIncEmpty||et.getCCSQBZ()!=null) {
            JSONObjectHelper.put(json,"ccsqbz",getJSONValue(et.getCCSQBZ()),false);
        }
        if(bIncEmpty||et.getCCDZ()!=null) {
            JSONObjectHelper.put(json,"ccdz",getJSONValue(et.getCCDZ()),false);
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
    private static void fillXmlNode(OA_CCSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCcsqsfshtg()!=null) {
            Object obj = et.getCcsqsfshtg();
            node.setAttribute("CCSQSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CCSQId()!=null) {
            Object obj = et.getOA_CCSQId();
            node.setAttribute("OA_CCSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CCSQName()!=null) {
            Object obj = et.getOA_CCSQName();
            node.setAttribute("OA_CCSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
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
        if(bIncEmpty||et.getCCSY()!=null) {
            Object obj = et.getCCSY();
            node.setAttribute("CCSY",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFINSTANCEID()!=null) {
            Object obj = et.getWFINSTANCEID();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFSTATE()!=null) {
            Object obj = et.getWFSTATE();
            node.setAttribute("WFSTATE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCCSQZT()!=null) {
            Object obj = et.getCCSQZT();
            node.setAttribute("CCSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCCSQBZ()!=null) {
            Object obj = et.getCCSQBZ();
            node.setAttribute("CCSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCCDZ()!=null) {
            Object obj = et.getCCDZ();
            node.setAttribute("CCDZ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CCSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CCSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCcsqsfshtgDirty() && (bIncEmpty||et.getCcsqsfshtg()!=null)) {
            dst.set(FIELD_CCSQSFSHTG,et.getCcsqsfshtg());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isOA_CCSQIdDirty() && (bIncEmpty||et.getOA_CCSQId()!=null)) {
            dst.set(FIELD_OA_CCSQID,et.getOA_CCSQId());
        }
        if(et.isOA_CCSQNameDirty() && (bIncEmpty||et.getOA_CCSQName()!=null)) {
            dst.set(FIELD_OA_CCSQNAME,et.getOA_CCSQName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
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
        if(et.isCCSYDirty() && (bIncEmpty||et.getCCSY()!=null)) {
            dst.set(FIELD_CCSY,et.getCCSY());
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
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
        }
        if(et.isWFINSTANCEIDDirty() && (bIncEmpty||et.getWFINSTANCEID()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFINSTANCEID());
        }
        if(et.isWFSTATEDirty() && (bIncEmpty||et.getWFSTATE()!=null)) {
            dst.set(FIELD_WFSTATE,et.getWFSTATE());
        }
        if(et.isCCSQZTDirty() && (bIncEmpty||et.getCCSQZT()!=null)) {
            dst.set(FIELD_CCSQZT,et.getCCSQZT());
        }
        if(et.isCCSQBZDirty() && (bIncEmpty||et.getCCSQBZ()!=null)) {
            dst.set(FIELD_CCSQBZ,et.getCCSQBZ());
        }
        if(et.isCCDZDirty() && (bIncEmpty||et.getCCDZ()!=null)) {
            dst.set(FIELD_CCDZ,et.getCCDZ());
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
        return  OA_CCSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CCSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_CCSQSFSHTG:
            et.resetCcsqsfshtg();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_OA_CCSQID:
            et.resetOA_CCSQId();
            return true;
        case INDEX_OA_CCSQNAME:
            et.resetOA_CCSQName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
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
        case INDEX_CCSY:
            et.resetCCSY();
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
        case INDEX_FJ:
            et.resetFJ();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFINSTANCEID();
            return true;
        case INDEX_WFSTATE:
            et.resetWFSTATE();
            return true;
        case INDEX_CCSQZT:
            et.resetCCSQZT();
            return true;
        case INDEX_CCSQBZ:
            et.resetCCSQBZ();
            return true;
        case INDEX_CCDZ:
            et.resetCCDZ();
            return true;
        default:
            throw new Exception("不明属性标识");
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
    private OA_CCSQ getProxyEntity() {
        return this.proxyOA_CCSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CCSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CCSQ) {
            this.proxyOA_CCSQ = (OA_CCSQ)proxyDataObject;
        }

    }

}