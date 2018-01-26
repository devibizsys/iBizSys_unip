/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.jcsj.entity;


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
 * 实体[OA_ZSK] 数据对象
 */
public class OA_ZSK extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_ZSK.class);
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[知识库标识]
     */
    public final static String FIELD_OA_ZSKID = "OA_ZSKID";
    /**
     *   实体属性标识[标题]
     */
    public final static String FIELD_OA_ZSKNAME = "OA_ZSKNAME";
    /**
     *   实体属性标识[录入人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[录入人]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[录入部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[录入部门]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[录入时间]
     */
    public final static String FIELD_LRSJ = "LRSJ";
    /**
     *   实体属性标识[内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[附件]
     */
    public final static String FIELD_FJ = "FJ";

    private final static int INDEX_UPDATEMAN = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_UPDATEDATE = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_OA_ZSKID = 4;
    private final static int INDEX_OA_ZSKNAME = 5;
    private final static int INDEX_ORGUSERID = 6;
    private final static int INDEX_ORGUSERNAME = 7;
    private final static int INDEX_ORGSECTORID = 8;
    private final static int INDEX_ORGSECTORNAME = 9;
    private final static int INDEX_LRSJ = 10;
    private final static int INDEX_CONTENT = 11;
    private final static int INDEX_MEMO = 12;
    private final static int INDEX_FJ = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_OA_ZSKID, INDEX_OA_ZSKID);
        fieldIndexMap.put( FIELD_OA_ZSKNAME, INDEX_OA_ZSKNAME);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_LRSJ, INDEX_LRSJ);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_FJ, INDEX_FJ);
    }

    private OA_ZSK proxyOA_ZSK = null;

    public OA_ZSK() {
        super();
    }
    private boolean updatemanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean oa_zskidDirtyFlag = false;
    private boolean oa_zsknameDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean lrsjDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean fjDirtyFlag = false;

    @Column(name="updateman")
    private String updateman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createman")
    private String createman;
    @Column(name="oa_zskid")
    private String oa_zskid;
    @Column(name="oa_zskname")
    private String oa_zskname;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="lrsj")
    private Timestamp lrsj;
    @Column(name="content")
    private String content;
    @Column(name="memo")
    private String memo;
    @Column(name="fj")
    private String fj;


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
     *  设置属性值[知识库标识]
     *  @param oa_zskid
     */
    public void setOA_ZSKId(String oa_zskid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_ZSKId(oa_zskid);
            return;
        }
        if(oa_zskid!=null) {
            oa_zskid = StringHelper.trimRight(oa_zskid);
            if(oa_zskid.length()==0) {
                oa_zskid = null;
            }
        }
        this.oa_zskid =  oa_zskid;
        this.oa_zskidDirtyFlag  = true;
    }

    /**
     *  获取属性值[知识库标识]
     */
    public String getOA_ZSKId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_ZSKId();
        }
        return this.oa_zskid;
    }

    /**
     *  获取属性值[知识库标识]是否修改
     */
    public boolean isOA_ZSKIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_ZSKIdDirty();
        }
        return this.oa_zskidDirtyFlag;
    }

    /**
     *  重置属性值[知识库标识]
     */
    public void resetOA_ZSKId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_ZSKId();
            return;
        }

        this.oa_zskidDirtyFlag = false;
        this.oa_zskid = null;
    }
    /**
     *  设置属性值[标题]
     *  @param oa_zskname
     */
    public void setOA_ZSKName(String oa_zskname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_ZSKName(oa_zskname);
            return;
        }
        if(oa_zskname!=null) {
            oa_zskname = StringHelper.trimRight(oa_zskname);
            if(oa_zskname.length()==0) {
                oa_zskname = null;
            }
        }
        this.oa_zskname =  oa_zskname;
        this.oa_zsknameDirtyFlag  = true;
    }

    /**
     *  获取属性值[标题]
     */
    public String getOA_ZSKName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_ZSKName();
        }
        return this.oa_zskname;
    }

    /**
     *  获取属性值[标题]是否修改
     */
    public boolean isOA_ZSKNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_ZSKNameDirty();
        }
        return this.oa_zsknameDirtyFlag;
    }

    /**
     *  重置属性值[标题]
     */
    public void resetOA_ZSKName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_ZSKName();
            return;
        }

        this.oa_zsknameDirtyFlag = false;
        this.oa_zskname = null;
    }
    /**
     *  设置属性值[录入人标识]
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
     *  获取属性值[录入人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[录入人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[录入人标识]
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
     *  设置属性值[录入人]
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
     *  获取属性值[录入人]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[录入人]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[录入人]
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
     *  设置属性值[录入部门标识]
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
     *  获取属性值[录入部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[录入部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[录入部门标识]
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
     *  设置属性值[录入部门]
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
     *  获取属性值[录入部门]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[录入部门]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[录入部门]
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
     *  设置属性值[录入时间]
     *  @param lrsj
     */
    public void setLRSJ(Timestamp lrsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLRSJ(lrsj);
            return;
        }
        this.lrsj =  lrsj;
        this.lrsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[录入时间]
     */
    public Timestamp getLRSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLRSJ();
        }
        return this.lrsj;
    }

    /**
     *  获取属性值[录入时间]是否修改
     */
    public boolean isLRSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLRSJDirty();
        }
        return this.lrsjDirtyFlag;
    }

    /**
     *  重置属性值[录入时间]
     */
    public void resetLRSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLRSJ();
            return;
        }

        this.lrsjDirtyFlag = false;
        this.lrsj = null;
    }
    /**
     *  设置属性值[内容]
     *  @param content
     */
    public void setCONTENT(String content) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCONTENT(content);
            return;
        }
        if(content!=null) {
            content = StringHelper.trimRight(content);
            if(content.length()==0) {
                content = null;
            }
        }
        this.content =  content;
        this.contentDirtyFlag  = true;
    }

    /**
     *  获取属性值[内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[内容]
     */
    public void resetCONTENT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCONTENT();
            return;
        }

        this.contentDirtyFlag = false;
        this.content = null;
    }
    /**
     *  设置属性值[备注]
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
     *  获取属性值[备注]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[备注]
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_ZSK.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_ZSK et) {
        et.resetUpdateMan();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetCreateMan();
        et.resetOA_ZSKId();
        et.resetOA_ZSKName();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetLRSJ();
        et.resetCONTENT();
        et.resetMemo();
        et.resetFJ();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOA_ZSKIdDirty()) {
            params.put(FIELD_OA_ZSKID,getOA_ZSKId());
        }
        if(!bDirtyOnly || isOA_ZSKNameDirty()) {
            params.put(FIELD_OA_ZSKNAME,getOA_ZSKName());
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
        if(!bDirtyOnly || isLRSJDirty()) {
            params.put(FIELD_LRSJ,getLRSJ());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isFJDirty()) {
            params.put(FIELD_FJ,getFJ());
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

        return  OA_ZSK.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_ZSK et,int index) throws Exception {

        switch(index) {
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_OA_ZSKID:
            return et.getOA_ZSKId();
        case INDEX_OA_ZSKNAME:
            return et.getOA_ZSKName();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_LRSJ:
            return et.getLRSJ();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_FJ:
            return et.getFJ();
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

        OA_ZSK.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_ZSK et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_ZSKID:
            et.setOA_ZSKId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_ZSKNAME:
            et.setOA_ZSKName(DataObject.getStringValue(obj));
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
        case INDEX_LRSJ:
            et.setLRSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_FJ:
            et.setFJ(DataObject.getStringValue(obj));
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

        return  OA_ZSK.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_ZSK et,int index) throws Exception {

        switch(index) {
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_OA_ZSKID:
            return et.getOA_ZSKId()==null;
        case INDEX_OA_ZSKNAME:
            return et.getOA_ZSKName()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_LRSJ:
            return et.getLRSJ()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_FJ:
            return et.getFJ()==null;
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

        return  OA_ZSK.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_ZSK et,int index) throws Exception {

        switch(index) {
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_OA_ZSKID:
            return et.isOA_ZSKIdDirty();
        case INDEX_OA_ZSKNAME:
            return et.isOA_ZSKNameDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_LRSJ:
            return et.isLRSJDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_FJ:
            return et.isFJDirty();
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
    private static  void fillJSONObject(OA_ZSK et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOA_ZSKId()!=null) {
            JSONObjectHelper.put(json,"oa_zskid",getJSONValue(et.getOA_ZSKId()),false);
        }
        if(bIncEmpty||et.getOA_ZSKName()!=null) {
            JSONObjectHelper.put(json,"oa_zskname",getJSONValue(et.getOA_ZSKName()),false);
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
        if(bIncEmpty||et.getLRSJ()!=null) {
            JSONObjectHelper.put(json,"lrsj",getJSONValue(et.getLRSJ()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            JSONObjectHelper.put(json,"fj",getJSONValue(et.getFJ()),false);
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
    private static void fillXmlNode(OA_ZSK et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_ZSKId()!=null) {
            Object obj = et.getOA_ZSKId();
            node.setAttribute("OA_ZSKID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_ZSKName()!=null) {
            Object obj = et.getOA_ZSKName();
            node.setAttribute("OA_ZSKNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getLRSJ()!=null) {
            Object obj = et.getLRSJ();
            node.setAttribute("LRSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFJ()!=null) {
            Object obj = et.getFJ();
            node.setAttribute("FJ",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_ZSK.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_ZSK et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOA_ZSKIdDirty() && (bIncEmpty||et.getOA_ZSKId()!=null)) {
            dst.set(FIELD_OA_ZSKID,et.getOA_ZSKId());
        }
        if(et.isOA_ZSKNameDirty() && (bIncEmpty||et.getOA_ZSKName()!=null)) {
            dst.set(FIELD_OA_ZSKNAME,et.getOA_ZSKName());
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
        if(et.isLRSJDirty() && (bIncEmpty||et.getLRSJ()!=null)) {
            dst.set(FIELD_LRSJ,et.getLRSJ());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isFJDirty() && (bIncEmpty||et.getFJ()!=null)) {
            dst.set(FIELD_FJ,et.getFJ());
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
        return  OA_ZSK.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_ZSK et,int index) throws Exception {
        switch(index) {
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_OA_ZSKID:
            et.resetOA_ZSKId();
            return true;
        case INDEX_OA_ZSKNAME:
            et.resetOA_ZSKName();
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
        case INDEX_LRSJ:
            et.resetLRSJ();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_FJ:
            et.resetFJ();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objLRBMBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector lrbmbs = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getLRBMBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLRBMBS();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objLRBMBSLock) {
            if(lrbmbs==null) {
                lrbmbs = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                lrbmbs.setOrgSectorId(this.getOrgSectorId());
                com.sa.unip.srv.subsys.service.OrgSectorService service = (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgSectorService.class,this.getSessionFactory());
                service.autoGet(lrbmbs);
            }
            return lrbmbs;
        }
    }

    private Object objLRRBSLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser lrrbs = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getLRRBS() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLRRBS();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objLRRBSLock) {
            if(lrrbs==null) {
                lrrbs = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                lrrbs.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(lrrbs);
            }
            return lrrbs;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_ZSK getProxyEntity() {
        return this.proxyOA_ZSK;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_ZSK = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_ZSK) {
            this.proxyOA_ZSK = (OA_ZSK)proxyDataObject;
        }

    }

}