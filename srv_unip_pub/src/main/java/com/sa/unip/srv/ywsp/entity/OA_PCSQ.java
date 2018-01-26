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
 * 实体[OA_PCSQ] 数据对象
 */
public class OA_PCSQ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_PCSQ.class);
    /**
     *   实体属性标识[审核意见]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[派车申请是否审核通过]
     */
    public final static String FIELD_PCSQSFSHTG = "PCSQSFSHTG";
    /**
     *   实体属性标识[派车申请标识]
     */
    public final static String FIELD_OA_PCSQID = "OA_PCSQID";
    /**
     *   实体属性标识[派车申请名称]
     */
    public final static String FIELD_OA_PCSQNAME = "OA_PCSQNAME";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[申请人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[申请人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[用车类型]
     */
    public final static String FIELD_YCLX = "YCLX";
    /**
     *   实体属性标识[事由]
     */
    public final static String FIELD_SY = "SY";
    /**
     *   实体属性标识[地址]
     */
    public final static String FIELD_DZ = "DZ";
    /**
     *   实体属性标识[金额]
     */
    public final static String FIELD_JE = "JE";
    /**
     *   实体属性标识[出发时间]
     */
    public final static String FIELD_CFSJ = "CFSJ";
    /**
     *   实体属性标识[返程时间]
     */
    public final static String FIELD_FCSJ = "FCSJ";
    /**
     *   实体属性标识[车辆品牌]
     */
    public final static String FIELD_CLPP = "CLPP";
    /**
     *   实体属性标识[车牌号]
     */
    public final static String FIELD_CPH = "CPH";
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
     *   实体属性标识[派车申请状态]
     */
    public final static String FIELD_PCSQZT = "PCSQZT";
    /**
     *   实体属性标识[派车申请步骤]
     */
    public final static String FIELD_PCSQBZ = "PCSQBZ";
    /**
     *   实体属性标识[车辆标识]
     */
    public final static String FIELD_OA_CLID = "OA_CLID";
    /**
     *   实体属性标识[车辆名称]
     */
    public final static String FIELD_OA_CLNAME = "OA_CLNAME";

    private final static int INDEX_MEMO = 0;
    private final static int INDEX_PCSQSFSHTG = 1;
    private final static int INDEX_OA_PCSQID = 2;
    private final static int INDEX_OA_PCSQNAME = 3;
    private final static int INDEX_CREATEDATE = 4;
    private final static int INDEX_CREATEMAN = 5;
    private final static int INDEX_UPDATEMAN = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_ORGUSERID = 8;
    private final static int INDEX_ORGUSERNAME = 9;
    private final static int INDEX_ORGSECTORID = 10;
    private final static int INDEX_ORGSECTORNAME = 11;
    private final static int INDEX_YCLX = 12;
    private final static int INDEX_SY = 13;
    private final static int INDEX_DZ = 14;
    private final static int INDEX_JE = 15;
    private final static int INDEX_CFSJ = 16;
    private final static int INDEX_FCSJ = 17;
    private final static int INDEX_CLPP = 18;
    private final static int INDEX_CPH = 19;
    private final static int INDEX_FJ = 20;
    private final static int INDEX_WFINSTANCEID = 21;
    private final static int INDEX_WFSTATE = 22;
    private final static int INDEX_PCSQZT = 23;
    private final static int INDEX_PCSQBZ = 24;
    private final static int INDEX_OA_CLID = 25;
    private final static int INDEX_OA_CLNAME = 26;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_PCSQSFSHTG, INDEX_PCSQSFSHTG);
        fieldIndexMap.put( FIELD_OA_PCSQID, INDEX_OA_PCSQID);
        fieldIndexMap.put( FIELD_OA_PCSQNAME, INDEX_OA_PCSQNAME);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_YCLX, INDEX_YCLX);
        fieldIndexMap.put( FIELD_SY, INDEX_SY);
        fieldIndexMap.put( FIELD_DZ, INDEX_DZ);
        fieldIndexMap.put( FIELD_JE, INDEX_JE);
        fieldIndexMap.put( FIELD_CFSJ, INDEX_CFSJ);
        fieldIndexMap.put( FIELD_FCSJ, INDEX_FCSJ);
        fieldIndexMap.put( FIELD_CLPP, INDEX_CLPP);
        fieldIndexMap.put( FIELD_CPH, INDEX_CPH);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFSTATE, INDEX_WFSTATE);
        fieldIndexMap.put( FIELD_PCSQZT, INDEX_PCSQZT);
        fieldIndexMap.put( FIELD_PCSQBZ, INDEX_PCSQBZ);
        fieldIndexMap.put( FIELD_OA_CLID, INDEX_OA_CLID);
        fieldIndexMap.put( FIELD_OA_CLNAME, INDEX_OA_CLNAME);
    }

    private OA_PCSQ proxyOA_PCSQ = null;

    public OA_PCSQ() {
        super();
    }
    private boolean memoDirtyFlag = false;
    private boolean pcsqsfshtgDirtyFlag = false;
    private boolean oa_pcsqidDirtyFlag = false;
    private boolean oa_pcsqnameDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean yclxDirtyFlag = false;
    private boolean syDirtyFlag = false;
    private boolean dzDirtyFlag = false;
    private boolean jeDirtyFlag = false;
    private boolean cfsjDirtyFlag = false;
    private boolean fcsjDirtyFlag = false;
    private boolean clppDirtyFlag = false;
    private boolean cphDirtyFlag = false;
    private boolean fjDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfstateDirtyFlag = false;
    private boolean pcsqztDirtyFlag = false;
    private boolean pcsqbzDirtyFlag = false;
    private boolean oa_clidDirtyFlag = false;
    private boolean oa_clnameDirtyFlag = false;

    @Column(name="memo")
    private String memo;
    @Column(name="pcsqsfshtg")
    private String pcsqsfshtg;
    @Column(name="oa_pcsqid")
    private String oa_pcsqid;
    @Column(name="oa_pcsqname")
    private String oa_pcsqname;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="yclx")
    private String yclx;
    @Column(name="sy")
    private String sy;
    @Column(name="dz")
    private String dz;
    @Column(name="je")
    private Double je;
    @Column(name="cfsj")
    private Timestamp cfsj;
    @Column(name="fcsj")
    private Timestamp fcsj;
    @Column(name="clpp")
    private String clpp;
    @Column(name="cph")
    private String cph;
    @Column(name="fj")
    private String fj;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfstate")
    private Integer wfstate;
    @Column(name="pcsqzt")
    private String pcsqzt;
    @Column(name="pcsqbz")
    private String pcsqbz;
    @Column(name="oa_clid")
    private String oa_clid;
    @Column(name="oa_clname")
    private String oa_clname;


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
     *  设置属性值[派车申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     *  @param pcsqsfshtg
     */
    public void setPcsqsfshtg(String pcsqsfshtg) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPcsqsfshtg(pcsqsfshtg);
            return;
        }
        if(pcsqsfshtg!=null) {
            pcsqsfshtg = StringHelper.trimRight(pcsqsfshtg);
            if(pcsqsfshtg.length()==0) {
                pcsqsfshtg = null;
            }
        }
        this.pcsqsfshtg =  pcsqsfshtg;
        this.pcsqsfshtgDirtyFlag  = true;
    }

    /**
     *  获取属性值[派车申请是否审核通过]代码表：com.sa.unip.srv.codelist.CL_SFSHTGCodeListModel
     */
    public String getPcsqsfshtg() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPcsqsfshtg();
        }
        return this.pcsqsfshtg;
    }

    /**
     *  获取属性值[派车申请是否审核通过]是否修改
     */
    public boolean isPcsqsfshtgDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPcsqsfshtgDirty();
        }
        return this.pcsqsfshtgDirtyFlag;
    }

    /**
     *  重置属性值[派车申请是否审核通过]
     */
    public void resetPcsqsfshtg() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPcsqsfshtg();
            return;
        }

        this.pcsqsfshtgDirtyFlag = false;
        this.pcsqsfshtg = null;
    }
    /**
     *  设置属性值[派车申请标识]
     *  @param oa_pcsqid
     */
    public void setOA_PCSQId(String oa_pcsqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_PCSQId(oa_pcsqid);
            return;
        }
        if(oa_pcsqid!=null) {
            oa_pcsqid = StringHelper.trimRight(oa_pcsqid);
            if(oa_pcsqid.length()==0) {
                oa_pcsqid = null;
            }
        }
        this.oa_pcsqid =  oa_pcsqid;
        this.oa_pcsqidDirtyFlag  = true;
    }

    /**
     *  获取属性值[派车申请标识]
     */
    public String getOA_PCSQId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_PCSQId();
        }
        return this.oa_pcsqid;
    }

    /**
     *  获取属性值[派车申请标识]是否修改
     */
    public boolean isOA_PCSQIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_PCSQIdDirty();
        }
        return this.oa_pcsqidDirtyFlag;
    }

    /**
     *  重置属性值[派车申请标识]
     */
    public void resetOA_PCSQId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_PCSQId();
            return;
        }

        this.oa_pcsqidDirtyFlag = false;
        this.oa_pcsqid = null;
    }
    /**
     *  设置属性值[派车申请名称]
     *  @param oa_pcsqname
     */
    public void setOA_PCSQName(String oa_pcsqname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_PCSQName(oa_pcsqname);
            return;
        }
        if(oa_pcsqname!=null) {
            oa_pcsqname = StringHelper.trimRight(oa_pcsqname);
            if(oa_pcsqname.length()==0) {
                oa_pcsqname = null;
            }
        }
        this.oa_pcsqname =  oa_pcsqname;
        this.oa_pcsqnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[派车申请名称]
     */
    public String getOA_PCSQName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_PCSQName();
        }
        return this.oa_pcsqname;
    }

    /**
     *  获取属性值[派车申请名称]是否修改
     */
    public boolean isOA_PCSQNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_PCSQNameDirty();
        }
        return this.oa_pcsqnameDirtyFlag;
    }

    /**
     *  重置属性值[派车申请名称]
     */
    public void resetOA_PCSQName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_PCSQName();
            return;
        }

        this.oa_pcsqnameDirtyFlag = false;
        this.oa_pcsqname = null;
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
     *  设置属性值[申请人标识]
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
     *  获取属性值[申请人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[申请人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[申请人标识]
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
     *  设置属性值[部门标识]
     *  @param orgsectorid
     */
    public void setOrgSectorId(String orgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorId(orgsectorid);
            return;
        }
        if(orgsectorid!=null) {
            orgsectorid = StringHelper.trimRight(orgsectorid);
            if(orgsectorid.length()==0) {
                orgsectorid = null;
            }
        }
        this.orgsectorid =  orgsectorid;
        this.orgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[部门标识]
     */
    public void resetOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorId();
            return;
        }

        this.orgsectoridDirtyFlag = false;
        this.orgsectorid = null;
    }
    /**
     *  设置属性值[部门名称]
     *  @param orgsectorname
     */
    public void setOrgSectorName(String orgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorName(orgsectorname);
            return;
        }
        if(orgsectorname!=null) {
            orgsectorname = StringHelper.trimRight(orgsectorname);
            if(orgsectorname.length()==0) {
                orgsectorname = null;
            }
        }
        this.orgsectorname =  orgsectorname;
        this.orgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门名称]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[部门名称]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[部门名称]
     */
    public void resetOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorName();
            return;
        }

        this.orgsectornameDirtyFlag = false;
        this.orgsectorname = null;
    }
    /**
     *  设置属性值[用车类型]
     *  @param yclx
     */
    public void setYclx(String yclx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYclx(yclx);
            return;
        }
        if(yclx!=null) {
            yclx = StringHelper.trimRight(yclx);
            if(yclx.length()==0) {
                yclx = null;
            }
        }
        this.yclx =  yclx;
        this.yclxDirtyFlag  = true;
    }

    /**
     *  获取属性值[用车类型]
     */
    public String getYclx() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYclx();
        }
        return this.yclx;
    }

    /**
     *  获取属性值[用车类型]是否修改
     */
    public boolean isYclxDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYclxDirty();
        }
        return this.yclxDirtyFlag;
    }

    /**
     *  重置属性值[用车类型]
     */
    public void resetYclx() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYclx();
            return;
        }

        this.yclxDirtyFlag = false;
        this.yclx = null;
    }
    /**
     *  设置属性值[事由]
     *  @param sy
     */
    public void setSy(String sy) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSy(sy);
            return;
        }
        if(sy!=null) {
            sy = StringHelper.trimRight(sy);
            if(sy.length()==0) {
                sy = null;
            }
        }
        this.sy =  sy;
        this.syDirtyFlag  = true;
    }

    /**
     *  获取属性值[事由]
     */
    public String getSy() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSy();
        }
        return this.sy;
    }

    /**
     *  获取属性值[事由]是否修改
     */
    public boolean isSyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSyDirty();
        }
        return this.syDirtyFlag;
    }

    /**
     *  重置属性值[事由]
     */
    public void resetSy() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSy();
            return;
        }

        this.syDirtyFlag = false;
        this.sy = null;
    }
    /**
     *  设置属性值[地址]
     *  @param dz
     */
    public void setDZ(String dz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDZ(dz);
            return;
        }
        if(dz!=null) {
            dz = StringHelper.trimRight(dz);
            if(dz.length()==0) {
                dz = null;
            }
        }
        this.dz =  dz;
        this.dzDirtyFlag  = true;
    }

    /**
     *  获取属性值[地址]
     */
    public String getDZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDZ();
        }
        return this.dz;
    }

    /**
     *  获取属性值[地址]是否修改
     */
    public boolean isDZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDZDirty();
        }
        return this.dzDirtyFlag;
    }

    /**
     *  重置属性值[地址]
     */
    public void resetDZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDZ();
            return;
        }

        this.dzDirtyFlag = false;
        this.dz = null;
    }
    /**
     *  设置属性值[金额]
     *  @param je
     */
    public void setJe(Double je) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJe(je);
            return;
        }
        this.je =  je;
        this.jeDirtyFlag  = true;
    }

    /**
     *  获取属性值[金额]
     */
    public Double getJe() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJe();
        }
        return this.je;
    }

    /**
     *  获取属性值[金额]是否修改
     */
    public boolean isJeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJeDirty();
        }
        return this.jeDirtyFlag;
    }

    /**
     *  重置属性值[金额]
     */
    public void resetJe() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJe();
            return;
        }

        this.jeDirtyFlag = false;
        this.je = null;
    }
    /**
     *  设置属性值[出发时间]
     *  @param cfsj
     */
    public void setCFSJ(Timestamp cfsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCFSJ(cfsj);
            return;
        }
        this.cfsj =  cfsj;
        this.cfsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[出发时间]
     */
    public Timestamp getCFSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCFSJ();
        }
        return this.cfsj;
    }

    /**
     *  获取属性值[出发时间]是否修改
     */
    public boolean isCFSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCFSJDirty();
        }
        return this.cfsjDirtyFlag;
    }

    /**
     *  重置属性值[出发时间]
     */
    public void resetCFSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCFSJ();
            return;
        }

        this.cfsjDirtyFlag = false;
        this.cfsj = null;
    }
    /**
     *  设置属性值[返程时间]
     *  @param fcsj
     */
    public void setFCSJ(Timestamp fcsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFCSJ(fcsj);
            return;
        }
        this.fcsj =  fcsj;
        this.fcsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[返程时间]
     */
    public Timestamp getFCSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFCSJ();
        }
        return this.fcsj;
    }

    /**
     *  获取属性值[返程时间]是否修改
     */
    public boolean isFCSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFCSJDirty();
        }
        return this.fcsjDirtyFlag;
    }

    /**
     *  重置属性值[返程时间]
     */
    public void resetFCSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFCSJ();
            return;
        }

        this.fcsjDirtyFlag = false;
        this.fcsj = null;
    }
    /**
     *  设置属性值[车辆品牌]
     *  @param clpp
     */
    public void setClpp(String clpp) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setClpp(clpp);
            return;
        }
        if(clpp!=null) {
            clpp = StringHelper.trimRight(clpp);
            if(clpp.length()==0) {
                clpp = null;
            }
        }
        this.clpp =  clpp;
        this.clppDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆品牌]
     */
    public String getClpp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getClpp();
        }
        return this.clpp;
    }

    /**
     *  获取属性值[车辆品牌]是否修改
     */
    public boolean isClppDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isClppDirty();
        }
        return this.clppDirtyFlag;
    }

    /**
     *  重置属性值[车辆品牌]
     */
    public void resetClpp() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetClpp();
            return;
        }

        this.clppDirtyFlag = false;
        this.clpp = null;
    }
    /**
     *  设置属性值[车牌号]
     *  @param cph
     */
    public void setCph(String cph) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCph(cph);
            return;
        }
        if(cph!=null) {
            cph = StringHelper.trimRight(cph);
            if(cph.length()==0) {
                cph = null;
            }
        }
        this.cph =  cph;
        this.cphDirtyFlag  = true;
    }

    /**
     *  获取属性值[车牌号]
     */
    public String getCph() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCph();
        }
        return this.cph;
    }

    /**
     *  获取属性值[车牌号]是否修改
     */
    public boolean isCphDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCphDirty();
        }
        return this.cphDirtyFlag;
    }

    /**
     *  重置属性值[车牌号]
     */
    public void resetCph() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCph();
            return;
        }

        this.cphDirtyFlag = false;
        this.cph = null;
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
     *  设置属性值[派车申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     *  @param pcsqzt
     */
    public void setPCSQZT(String pcsqzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPCSQZT(pcsqzt);
            return;
        }
        if(pcsqzt!=null) {
            pcsqzt = StringHelper.trimRight(pcsqzt);
            if(pcsqzt.length()==0) {
                pcsqzt = null;
            }
        }
        this.pcsqzt =  pcsqzt;
        this.pcsqztDirtyFlag  = true;
    }

    /**
     *  获取属性值[派车申请状态]代码表：com.sa.unip.srv.codelist.CL_WFSTATECodeListModel
     */
    public String getPCSQZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPCSQZT();
        }
        return this.pcsqzt;
    }

    /**
     *  获取属性值[派车申请状态]是否修改
     */
    public boolean isPCSQZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPCSQZTDirty();
        }
        return this.pcsqztDirtyFlag;
    }

    /**
     *  重置属性值[派车申请状态]
     */
    public void resetPCSQZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPCSQZT();
            return;
        }

        this.pcsqztDirtyFlag = false;
        this.pcsqzt = null;
    }
    /**
     *  设置属性值[派车申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     *  @param pcsqbz
     */
    public void setPCSQBZ(String pcsqbz) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPCSQBZ(pcsqbz);
            return;
        }
        if(pcsqbz!=null) {
            pcsqbz = StringHelper.trimRight(pcsqbz);
            if(pcsqbz.length()==0) {
                pcsqbz = null;
            }
        }
        this.pcsqbz =  pcsqbz;
        this.pcsqbzDirtyFlag  = true;
    }

    /**
     *  获取属性值[派车申请步骤]代码表：com.sa.unip.srv.codelist.CL_WFSTEPCodeListModel
     */
    public String getPCSQBZ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPCSQBZ();
        }
        return this.pcsqbz;
    }

    /**
     *  获取属性值[派车申请步骤]是否修改
     */
    public boolean isPCSQBZDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPCSQBZDirty();
        }
        return this.pcsqbzDirtyFlag;
    }

    /**
     *  重置属性值[派车申请步骤]
     */
    public void resetPCSQBZ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPCSQBZ();
            return;
        }

        this.pcsqbzDirtyFlag = false;
        this.pcsqbz = null;
    }
    /**
     *  设置属性值[车辆标识]
     *  @param oa_clid
     */
    public void setOA_CLId(String oa_clid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CLId(oa_clid);
            return;
        }
        if(oa_clid!=null) {
            oa_clid = StringHelper.trimRight(oa_clid);
            if(oa_clid.length()==0) {
                oa_clid = null;
            }
        }
        this.oa_clid =  oa_clid;
        this.oa_clidDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆标识]
     */
    public String getOA_CLId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CLId();
        }
        return this.oa_clid;
    }

    /**
     *  获取属性值[车辆标识]是否修改
     */
    public boolean isOA_CLIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CLIdDirty();
        }
        return this.oa_clidDirtyFlag;
    }

    /**
     *  重置属性值[车辆标识]
     */
    public void resetOA_CLId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CLId();
            return;
        }

        this.oa_clidDirtyFlag = false;
        this.oa_clid = null;
    }
    /**
     *  设置属性值[车辆名称]
     *  @param oa_clname
     */
    public void setOA_CLName(String oa_clname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CLName(oa_clname);
            return;
        }
        if(oa_clname!=null) {
            oa_clname = StringHelper.trimRight(oa_clname);
            if(oa_clname.length()==0) {
                oa_clname = null;
            }
        }
        this.oa_clname =  oa_clname;
        this.oa_clnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[车辆名称]
     */
    public String getOA_CLName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CLName();
        }
        return this.oa_clname;
    }

    /**
     *  获取属性值[车辆名称]是否修改
     */
    public boolean isOA_CLNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CLNameDirty();
        }
        return this.oa_clnameDirtyFlag;
    }

    /**
     *  重置属性值[车辆名称]
     */
    public void resetOA_CLName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CLName();
            return;
        }

        this.oa_clnameDirtyFlag = false;
        this.oa_clname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_PCSQ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_PCSQ et) {
        et.resetMemo();
        et.resetPcsqsfshtg();
        et.resetOA_PCSQId();
        et.resetOA_PCSQName();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetYclx();
        et.resetSy();
        et.resetDZ();
        et.resetJe();
        et.resetCFSJ();
        et.resetFCSJ();
        et.resetClpp();
        et.resetCph();
        et.resetFJ();
        et.resetWFINSTANCEID();
        et.resetWFSTATE();
        et.resetPCSQZT();
        et.resetPCSQBZ();
        et.resetOA_CLId();
        et.resetOA_CLName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isPcsqsfshtgDirty()) {
            params.put(FIELD_PCSQSFSHTG,getPcsqsfshtg());
        }
        if(!bDirtyOnly || isOA_PCSQIdDirty()) {
            params.put(FIELD_OA_PCSQID,getOA_PCSQId());
        }
        if(!bDirtyOnly || isOA_PCSQNameDirty()) {
            params.put(FIELD_OA_PCSQNAME,getOA_PCSQName());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isYclxDirty()) {
            params.put(FIELD_YCLX,getYclx());
        }
        if(!bDirtyOnly || isSyDirty()) {
            params.put(FIELD_SY,getSy());
        }
        if(!bDirtyOnly || isDZDirty()) {
            params.put(FIELD_DZ,getDZ());
        }
        if(!bDirtyOnly || isJeDirty()) {
            params.put(FIELD_JE,getJe());
        }
        if(!bDirtyOnly || isCFSJDirty()) {
            params.put(FIELD_CFSJ,getCFSJ());
        }
        if(!bDirtyOnly || isFCSJDirty()) {
            params.put(FIELD_FCSJ,getFCSJ());
        }
        if(!bDirtyOnly || isClppDirty()) {
            params.put(FIELD_CLPP,getClpp());
        }
        if(!bDirtyOnly || isCphDirty()) {
            params.put(FIELD_CPH,getCph());
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
        if(!bDirtyOnly || isPCSQZTDirty()) {
            params.put(FIELD_PCSQZT,getPCSQZT());
        }
        if(!bDirtyOnly || isPCSQBZDirty()) {
            params.put(FIELD_PCSQBZ,getPCSQBZ());
        }
        if(!bDirtyOnly || isOA_CLIdDirty()) {
            params.put(FIELD_OA_CLID,getOA_CLId());
        }
        if(!bDirtyOnly || isOA_CLNameDirty()) {
            params.put(FIELD_OA_CLNAME,getOA_CLName());
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

        return  OA_PCSQ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_PCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_PCSQSFSHTG:
            return et.getPcsqsfshtg();
        case INDEX_OA_PCSQID:
            return et.getOA_PCSQId();
        case INDEX_OA_PCSQNAME:
            return et.getOA_PCSQName();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_YCLX:
            return et.getYclx();
        case INDEX_SY:
            return et.getSy();
        case INDEX_DZ:
            return et.getDZ();
        case INDEX_JE:
            return et.getJe();
        case INDEX_CFSJ:
            return et.getCFSJ();
        case INDEX_FCSJ:
            return et.getFCSJ();
        case INDEX_CLPP:
            return et.getClpp();
        case INDEX_CPH:
            return et.getCph();
        case INDEX_FJ:
            return et.getFJ();
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID();
        case INDEX_WFSTATE:
            return et.getWFSTATE();
        case INDEX_PCSQZT:
            return et.getPCSQZT();
        case INDEX_PCSQBZ:
            return et.getPCSQBZ();
        case INDEX_OA_CLID:
            return et.getOA_CLId();
        case INDEX_OA_CLNAME:
            return et.getOA_CLName();
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

        OA_PCSQ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_PCSQ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_PCSQSFSHTG:
            et.setPcsqsfshtg(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_PCSQID:
            et.setOA_PCSQId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_PCSQNAME:
            et.setOA_PCSQName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_YCLX:
            et.setYclx(DataObject.getStringValue(obj));
            return ;
        case INDEX_SY:
            et.setSy(DataObject.getStringValue(obj));
            return ;
        case INDEX_DZ:
            et.setDZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_JE:
            et.setJe(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_CFSJ:
            et.setCFSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_FCSJ:
            et.setFCSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CLPP:
            et.setClpp(DataObject.getStringValue(obj));
            return ;
        case INDEX_CPH:
            et.setCph(DataObject.getStringValue(obj));
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
        case INDEX_PCSQZT:
            et.setPCSQZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_PCSQBZ:
            et.setPCSQBZ(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CLID:
            et.setOA_CLId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CLNAME:
            et.setOA_CLName(DataObject.getStringValue(obj));
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

        return  OA_PCSQ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_PCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_PCSQSFSHTG:
            return et.getPcsqsfshtg()==null;
        case INDEX_OA_PCSQID:
            return et.getOA_PCSQId()==null;
        case INDEX_OA_PCSQNAME:
            return et.getOA_PCSQName()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_YCLX:
            return et.getYclx()==null;
        case INDEX_SY:
            return et.getSy()==null;
        case INDEX_DZ:
            return et.getDZ()==null;
        case INDEX_JE:
            return et.getJe()==null;
        case INDEX_CFSJ:
            return et.getCFSJ()==null;
        case INDEX_FCSJ:
            return et.getFCSJ()==null;
        case INDEX_CLPP:
            return et.getClpp()==null;
        case INDEX_CPH:
            return et.getCph()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFINSTANCEID()==null;
        case INDEX_WFSTATE:
            return et.getWFSTATE()==null;
        case INDEX_PCSQZT:
            return et.getPCSQZT()==null;
        case INDEX_PCSQBZ:
            return et.getPCSQBZ()==null;
        case INDEX_OA_CLID:
            return et.getOA_CLId()==null;
        case INDEX_OA_CLNAME:
            return et.getOA_CLName()==null;
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

        return  OA_PCSQ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_PCSQ et,int index) throws Exception {

        switch(index) {
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_PCSQSFSHTG:
            return et.isPcsqsfshtgDirty();
        case INDEX_OA_PCSQID:
            return et.isOA_PCSQIdDirty();
        case INDEX_OA_PCSQNAME:
            return et.isOA_PCSQNameDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_YCLX:
            return et.isYclxDirty();
        case INDEX_SY:
            return et.isSyDirty();
        case INDEX_DZ:
            return et.isDZDirty();
        case INDEX_JE:
            return et.isJeDirty();
        case INDEX_CFSJ:
            return et.isCFSJDirty();
        case INDEX_FCSJ:
            return et.isFCSJDirty();
        case INDEX_CLPP:
            return et.isClppDirty();
        case INDEX_CPH:
            return et.isCphDirty();
        case INDEX_FJ:
            return et.isFJDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFINSTANCEIDDirty();
        case INDEX_WFSTATE:
            return et.isWFSTATEDirty();
        case INDEX_PCSQZT:
            return et.isPCSQZTDirty();
        case INDEX_PCSQBZ:
            return et.isPCSQBZDirty();
        case INDEX_OA_CLID:
            return et.isOA_CLIdDirty();
        case INDEX_OA_CLNAME:
            return et.isOA_CLNameDirty();
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
    private static  void fillJSONObject(OA_PCSQ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getPcsqsfshtg()!=null) {
            JSONObjectHelper.put(json,"pcsqsfshtg",getJSONValue(et.getPcsqsfshtg()),false);
        }
        if(bIncEmpty||et.getOA_PCSQId()!=null) {
            JSONObjectHelper.put(json,"oa_pcsqid",getJSONValue(et.getOA_PCSQId()),false);
        }
        if(bIncEmpty||et.getOA_PCSQName()!=null) {
            JSONObjectHelper.put(json,"oa_pcsqname",getJSONValue(et.getOA_PCSQName()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"orgsectorid",getJSONValue(et.getOrgSectorId()),false);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"orgsectorname",getJSONValue(et.getOrgSectorName()),false);
        }
        if(bIncEmpty||et.getYclx()!=null) {
            JSONObjectHelper.put(json,"yclx",getJSONValue(et.getYclx()),false);
        }
        if(bIncEmpty||et.getSy()!=null) {
            JSONObjectHelper.put(json,"sy",getJSONValue(et.getSy()),false);
        }
        if(bIncEmpty||et.getDZ()!=null) {
            JSONObjectHelper.put(json,"dz",getJSONValue(et.getDZ()),false);
        }
        if(bIncEmpty||et.getJe()!=null) {
            JSONObjectHelper.put(json,"je",getJSONValue(et.getJe()),false);
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            JSONObjectHelper.put(json,"cfsj",getJSONValue(et.getCFSJ()),false);
        }
        if(bIncEmpty||et.getFCSJ()!=null) {
            JSONObjectHelper.put(json,"fcsj",getJSONValue(et.getFCSJ()),false);
        }
        if(bIncEmpty||et.getClpp()!=null) {
            JSONObjectHelper.put(json,"clpp",getJSONValue(et.getClpp()),false);
        }
        if(bIncEmpty||et.getCph()!=null) {
            JSONObjectHelper.put(json,"cph",getJSONValue(et.getCph()),false);
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
        if(bIncEmpty||et.getPCSQZT()!=null) {
            JSONObjectHelper.put(json,"pcsqzt",getJSONValue(et.getPCSQZT()),false);
        }
        if(bIncEmpty||et.getPCSQBZ()!=null) {
            JSONObjectHelper.put(json,"pcsqbz",getJSONValue(et.getPCSQBZ()),false);
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            JSONObjectHelper.put(json,"oa_clid",getJSONValue(et.getOA_CLId()),false);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            JSONObjectHelper.put(json,"oa_clname",getJSONValue(et.getOA_CLName()),false);
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
    private static void fillXmlNode(OA_PCSQ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPcsqsfshtg()!=null) {
            Object obj = et.getPcsqsfshtg();
            node.setAttribute("PCSQSFSHTG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_PCSQId()!=null) {
            Object obj = et.getOA_PCSQId();
            node.setAttribute("OA_PCSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_PCSQName()!=null) {
            Object obj = et.getOA_PCSQName();
            node.setAttribute("OA_PCSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYclx()!=null) {
            Object obj = et.getYclx();
            node.setAttribute("YCLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSy()!=null) {
            Object obj = et.getSy();
            node.setAttribute("SY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDZ()!=null) {
            Object obj = et.getDZ();
            node.setAttribute("DZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJe()!=null) {
            Object obj = et.getJe();
            node.setAttribute("JE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCFSJ()!=null) {
            Object obj = et.getCFSJ();
            node.setAttribute("CFSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getFCSJ()!=null) {
            Object obj = et.getFCSJ();
            node.setAttribute("FCSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getClpp()!=null) {
            Object obj = et.getClpp();
            node.setAttribute("CLPP",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCph()!=null) {
            Object obj = et.getCph();
            node.setAttribute("CPH",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getPCSQZT()!=null) {
            Object obj = et.getPCSQZT();
            node.setAttribute("PCSQZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPCSQBZ()!=null) {
            Object obj = et.getPCSQBZ();
            node.setAttribute("PCSQBZ",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CLId()!=null) {
            Object obj = et.getOA_CLId();
            node.setAttribute("OA_CLID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CLName()!=null) {
            Object obj = et.getOA_CLName();
            node.setAttribute("OA_CLNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_PCSQ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_PCSQ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isPcsqsfshtgDirty() && (bIncEmpty||et.getPcsqsfshtg()!=null)) {
            dst.set(FIELD_PCSQSFSHTG,et.getPcsqsfshtg());
        }
        if(et.isOA_PCSQIdDirty() && (bIncEmpty||et.getOA_PCSQId()!=null)) {
            dst.set(FIELD_OA_PCSQID,et.getOA_PCSQId());
        }
        if(et.isOA_PCSQNameDirty() && (bIncEmpty||et.getOA_PCSQName()!=null)) {
            dst.set(FIELD_OA_PCSQNAME,et.getOA_PCSQName());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isOrgSectorIdDirty() && (bIncEmpty||et.getOrgSectorId()!=null)) {
            dst.set(FIELD_ORGSECTORID,et.getOrgSectorId());
        }
        if(et.isOrgSectorNameDirty() && (bIncEmpty||et.getOrgSectorName()!=null)) {
            dst.set(FIELD_ORGSECTORNAME,et.getOrgSectorName());
        }
        if(et.isYclxDirty() && (bIncEmpty||et.getYclx()!=null)) {
            dst.set(FIELD_YCLX,et.getYclx());
        }
        if(et.isSyDirty() && (bIncEmpty||et.getSy()!=null)) {
            dst.set(FIELD_SY,et.getSy());
        }
        if(et.isDZDirty() && (bIncEmpty||et.getDZ()!=null)) {
            dst.set(FIELD_DZ,et.getDZ());
        }
        if(et.isJeDirty() && (bIncEmpty||et.getJe()!=null)) {
            dst.set(FIELD_JE,et.getJe());
        }
        if(et.isCFSJDirty() && (bIncEmpty||et.getCFSJ()!=null)) {
            dst.set(FIELD_CFSJ,et.getCFSJ());
        }
        if(et.isFCSJDirty() && (bIncEmpty||et.getFCSJ()!=null)) {
            dst.set(FIELD_FCSJ,et.getFCSJ());
        }
        if(et.isClppDirty() && (bIncEmpty||et.getClpp()!=null)) {
            dst.set(FIELD_CLPP,et.getClpp());
        }
        if(et.isCphDirty() && (bIncEmpty||et.getCph()!=null)) {
            dst.set(FIELD_CPH,et.getCph());
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
        if(et.isPCSQZTDirty() && (bIncEmpty||et.getPCSQZT()!=null)) {
            dst.set(FIELD_PCSQZT,et.getPCSQZT());
        }
        if(et.isPCSQBZDirty() && (bIncEmpty||et.getPCSQBZ()!=null)) {
            dst.set(FIELD_PCSQBZ,et.getPCSQBZ());
        }
        if(et.isOA_CLIdDirty() && (bIncEmpty||et.getOA_CLId()!=null)) {
            dst.set(FIELD_OA_CLID,et.getOA_CLId());
        }
        if(et.isOA_CLNameDirty() && (bIncEmpty||et.getOA_CLName()!=null)) {
            dst.set(FIELD_OA_CLNAME,et.getOA_CLName());
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
        return  OA_PCSQ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_PCSQ et,int index) throws Exception {
        switch(index) {
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_PCSQSFSHTG:
            et.resetPcsqsfshtg();
            return true;
        case INDEX_OA_PCSQID:
            et.resetOA_PCSQId();
            return true;
        case INDEX_OA_PCSQNAME:
            et.resetOA_PCSQName();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_YCLX:
            et.resetYclx();
            return true;
        case INDEX_SY:
            et.resetSy();
            return true;
        case INDEX_DZ:
            et.resetDZ();
            return true;
        case INDEX_JE:
            et.resetJe();
            return true;
        case INDEX_CFSJ:
            et.resetCFSJ();
            return true;
        case INDEX_FCSJ:
            et.resetFCSJ();
            return true;
        case INDEX_CLPP:
            et.resetClpp();
            return true;
        case INDEX_CPH:
            et.resetCph();
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
        case INDEX_PCSQZT:
            et.resetPCSQZT();
            return true;
        case INDEX_PCSQBZ:
            et.resetPCSQBZ();
            return true;
        case INDEX_OA_CLID:
            et.resetOA_CLId();
            return true;
        case INDEX_OA_CLNAME:
            et.resetOA_CLName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objBMBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector bmbs = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getBMBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBMBS();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objBMBSLock) {
            if(bmbs==null) {
                bmbs = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                bmbs.setOrgSectorId(this.getOrgSectorId());
                com.sa.unip.srv.subsys.service.OrgSectorService service = (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgSectorService.class,this.getSessionFactory());
                service.autoGet(bmbs);
            }
            return bmbs;
        }
    }

    private Object objCLBSLock = new Object();
    private com.sa.unip.srv.jcsj.entity.OA_CL clbs = null;
    /**
    * 获取父数据 车辆
     * @throws Exception
    */
    public com.sa.unip.srv.jcsj.entity.OA_CL getCLBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCLBS();
        }

        if(this.getOA_CLId()==null)
            return null;
        synchronized(objCLBSLock) {
            if(clbs==null) {
                clbs = new com.sa.unip.srv.jcsj.entity.OA_CL();
                clbs.setOA_CLId(this.getOA_CLId());
                com.sa.unip.srv.jcsj.service.OA_CLService service = (com.sa.unip.srv.jcsj.service.OA_CLService)ServiceGlobal.getService(com.sa.unip.srv.jcsj.service.OA_CLService.class,this.getSessionFactory());
                service.autoGet(clbs);
            }
            return clbs;
        }
    }

    private Object objSQRBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser sqrbs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getSQRBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSQRBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objSQRBSLock) {
            if(sqrbs==null) {
                sqrbs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                sqrbs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(sqrbs);
            }
            return sqrbs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_PCSQ getProxyEntity() {
        return this.proxyOA_PCSQ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_PCSQ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_PCSQ) {
            this.proxyOA_PCSQ = (OA_PCSQ)proxyDataObject;
        }

    }

}