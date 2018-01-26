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
 * 实体[OA_CHRY] 数据对象
 */
public class OA_CHRY extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_CHRY.class);
    /**
     *   实体属性标识[参会人员标识]
     */
    public final static String FIELD_OA_CHRYID = "OA_CHRYID";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[参会人员名称]
     */
    public final static String FIELD_OA_CHRYNAME = "OA_CHRYNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[参会状态]
     */
    public final static String FIELD_CHZT = "CHZT";
    /**
     *   实体属性标识[参会时间]
     */
    public final static String FIELD_CHSJ = "CHSJ";
    /**
     *   实体属性标识[座位号]
     */
    public final static String FIELD_ZWH = "ZWH";
    /**
     *   实体属性标识[院办会议申请标识]
     */
    public final static String FIELD_YBHYSQID = "YBHYSQID";
    /**
     *   实体属性标识[院办会议申请名称]
     */
    public final static String FIELD_YBHYSQNAME = "YBHYSQNAME";
    /**
     *   实体属性标识[参会人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[参会人员名称]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[职位]
     */
    public final static String FIELD_ORGSECUSERTYPENAME = "ORGSECUSERTYPENAME";
    /**
     *   实体属性标识[座位号描述]
     */
    public final static String FIELD_ZWHMS = "ZWHMS";

    private final static int INDEX_OA_CHRYID = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_UPDATEMAN = 2;
    private final static int INDEX_OA_CHRYNAME = 3;
    private final static int INDEX_CREATEMAN = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_CHZT = 6;
    private final static int INDEX_CHSJ = 7;
    private final static int INDEX_ZWH = 8;
    private final static int INDEX_YBHYSQID = 9;
    private final static int INDEX_YBHYSQNAME = 10;
    private final static int INDEX_ORGUSERID = 11;
    private final static int INDEX_ORGUSERNAME = 12;
    private final static int INDEX_ORGSECUSERTYPENAME = 13;
    private final static int INDEX_ZWHMS = 14;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_CHRYID, INDEX_OA_CHRYID);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_OA_CHRYNAME, INDEX_OA_CHRYNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CHZT, INDEX_CHZT);
        fieldIndexMap.put( FIELD_CHSJ, INDEX_CHSJ);
        fieldIndexMap.put( FIELD_ZWH, INDEX_ZWH);
        fieldIndexMap.put( FIELD_YBHYSQID, INDEX_YBHYSQID);
        fieldIndexMap.put( FIELD_YBHYSQNAME, INDEX_YBHYSQNAME);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECUSERTYPENAME, INDEX_ORGSECUSERTYPENAME);
        fieldIndexMap.put( FIELD_ZWHMS, INDEX_ZWHMS);
    }

    private OA_CHRY proxyOA_CHRY = null;

    public OA_CHRY() {
        super();
    }
    private boolean oa_chryidDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean oa_chrynameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean chztDirtyFlag = false;
    private boolean chsjDirtyFlag = false;
    private boolean zwhDirtyFlag = false;
    private boolean ybhysqidDirtyFlag = false;
    private boolean ybhysqnameDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean orgsecusertypenameDirtyFlag = false;
    private boolean zwhmsDirtyFlag = false;

    @Column(name="oa_chryid")
    private String oa_chryid;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="oa_chryname")
    private String oa_chryname;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="chzt")
    private String chzt;
    @Column(name="chsj")
    private Timestamp chsj;
    @Column(name="zwh")
    private String zwh;
    @Column(name="ybhysqid")
    private String ybhysqid;
    @Column(name="ybhysqname")
    private String ybhysqname;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="orgsecusertypename")
    private String orgsecusertypename;
    @Column(name="zwhms")
    private String zwhms;


    /**
     *  设置属性值[参会人员标识]
     *  @param oa_chryid
     */
    public void setOA_CHRYId(String oa_chryid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CHRYId(oa_chryid);
            return;
        }
        if(oa_chryid!=null) {
            oa_chryid = StringHelper.trimRight(oa_chryid);
            if(oa_chryid.length()==0) {
                oa_chryid = null;
            }
        }
        this.oa_chryid =  oa_chryid;
        this.oa_chryidDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会人员标识]
     */
    public String getOA_CHRYId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CHRYId();
        }
        return this.oa_chryid;
    }

    /**
     *  获取属性值[参会人员标识]是否修改
     */
    public boolean isOA_CHRYIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CHRYIdDirty();
        }
        return this.oa_chryidDirtyFlag;
    }

    /**
     *  重置属性值[参会人员标识]
     */
    public void resetOA_CHRYId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CHRYId();
            return;
        }

        this.oa_chryidDirtyFlag = false;
        this.oa_chryid = null;
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
     *  设置属性值[参会人员名称]
     *  @param oa_chryname
     */
    public void setOA_CHRYName(String oa_chryname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_CHRYName(oa_chryname);
            return;
        }
        if(oa_chryname!=null) {
            oa_chryname = StringHelper.trimRight(oa_chryname);
            if(oa_chryname.length()==0) {
                oa_chryname = null;
            }
        }
        this.oa_chryname =  oa_chryname;
        this.oa_chrynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会人员名称]
     */
    public String getOA_CHRYName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_CHRYName();
        }
        return this.oa_chryname;
    }

    /**
     *  获取属性值[参会人员名称]是否修改
     */
    public boolean isOA_CHRYNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_CHRYNameDirty();
        }
        return this.oa_chrynameDirtyFlag;
    }

    /**
     *  重置属性值[参会人员名称]
     */
    public void resetOA_CHRYName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_CHRYName();
            return;
        }

        this.oa_chrynameDirtyFlag = false;
        this.oa_chryname = null;
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
     *  设置属性值[参会状态]代码表：com.sa.unip.srv.codelist.CL_CHZTCodeListModel
     *  @param chzt
     */
    public void setCHZT(String chzt) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCHZT(chzt);
            return;
        }
        if(chzt!=null) {
            chzt = StringHelper.trimRight(chzt);
            if(chzt.length()==0) {
                chzt = null;
            }
        }
        this.chzt =  chzt;
        this.chztDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会状态]代码表：com.sa.unip.srv.codelist.CL_CHZTCodeListModel
     */
    public String getCHZT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCHZT();
        }
        return this.chzt;
    }

    /**
     *  获取属性值[参会状态]是否修改
     */
    public boolean isCHZTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCHZTDirty();
        }
        return this.chztDirtyFlag;
    }

    /**
     *  重置属性值[参会状态]
     */
    public void resetCHZT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCHZT();
            return;
        }

        this.chztDirtyFlag = false;
        this.chzt = null;
    }
    /**
     *  设置属性值[参会时间]
     *  @param chsj
     */
    public void setCHSJ(Timestamp chsj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCHSJ(chsj);
            return;
        }
        this.chsj =  chsj;
        this.chsjDirtyFlag  = true;
    }

    /**
     *  获取属性值[参会时间]
     */
    public Timestamp getCHSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCHSJ();
        }
        return this.chsj;
    }

    /**
     *  获取属性值[参会时间]是否修改
     */
    public boolean isCHSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCHSJDirty();
        }
        return this.chsjDirtyFlag;
    }

    /**
     *  重置属性值[参会时间]
     */
    public void resetCHSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCHSJ();
            return;
        }

        this.chsjDirtyFlag = false;
        this.chsj = null;
    }
    /**
     *  设置属性值[座位号]
     *  @param zwh
     */
    public void setZwh(String zwh) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZwh(zwh);
            return;
        }
        if(zwh!=null) {
            zwh = StringHelper.trimRight(zwh);
            if(zwh.length()==0) {
                zwh = null;
            }
        }
        this.zwh =  zwh;
        this.zwhDirtyFlag  = true;
    }

    /**
     *  获取属性值[座位号]
     */
    public String getZwh() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZwh();
        }
        return this.zwh;
    }

    /**
     *  获取属性值[座位号]是否修改
     */
    public boolean isZwhDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZwhDirty();
        }
        return this.zwhDirtyFlag;
    }

    /**
     *  重置属性值[座位号]
     */
    public void resetZwh() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZwh();
            return;
        }

        this.zwhDirtyFlag = false;
        this.zwh = null;
    }
    /**
     *  设置属性值[院办会议申请标识]
     *  @param ybhysqid
     */
    public void setYbhysqid(String ybhysqid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setYbhysqid(ybhysqid);
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
     *  获取属性值[院办会议申请标识]
     */
    public String getYbhysqid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYbhysqid();
        }
        return this.ybhysqid;
    }

    /**
     *  获取属性值[院办会议申请标识]是否修改
     */
    public boolean isYbhysqidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYbhysqidDirty();
        }
        return this.ybhysqidDirtyFlag;
    }

    /**
     *  重置属性值[院办会议申请标识]
     */
    public void resetYbhysqid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetYbhysqid();
            return;
        }

        this.ybhysqidDirtyFlag = false;
        this.ybhysqid = null;
    }
    /**
     *  设置属性值[院办会议申请名称]
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
     *  获取属性值[院办会议申请名称]
     */
    public String getYBHYSQNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getYBHYSQNAME();
        }
        return this.ybhysqname;
    }

    /**
     *  获取属性值[院办会议申请名称]是否修改
     */
    public boolean isYBHYSQNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isYBHYSQNAMEDirty();
        }
        return this.ybhysqnameDirtyFlag;
    }

    /**
     *  重置属性值[院办会议申请名称]
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
     *  设置属性值[参会人员标识]
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
     *  获取属性值[参会人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[参会人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[参会人员标识]
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
     *  设置属性值[参会人员名称]
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
     *  获取属性值[参会人员名称]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[参会人员名称]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[参会人员名称]
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
     *  设置属性值[职位]
     *  @param orgsecusertypename
     */
    public void setOrgSecUserTypeName(String orgsecusertypename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserTypeName(orgsecusertypename);
            return;
        }
        if(orgsecusertypename!=null) {
            orgsecusertypename = StringHelper.trimRight(orgsecusertypename);
            if(orgsecusertypename.length()==0) {
                orgsecusertypename = null;
            }
        }
        this.orgsecusertypename =  orgsecusertypename;
        this.orgsecusertypenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[职位]
     */
    public String getOrgSecUserTypeName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserTypeName();
        }
        return this.orgsecusertypename;
    }

    /**
     *  获取属性值[职位]是否修改
     */
    public boolean isOrgSecUserTypeNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserTypeNameDirty();
        }
        return this.orgsecusertypenameDirtyFlag;
    }

    /**
     *  重置属性值[职位]
     */
    public void resetOrgSecUserTypeName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserTypeName();
            return;
        }

        this.orgsecusertypenameDirtyFlag = false;
        this.orgsecusertypename = null;
    }
    /**
     *  设置属性值[座位号描述]
     *  @param zwhms
     */
    public void setZwhms(String zwhms) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setZwhms(zwhms);
            return;
        }
        if(zwhms!=null) {
            zwhms = StringHelper.trimRight(zwhms);
            if(zwhms.length()==0) {
                zwhms = null;
            }
        }
        this.zwhms =  zwhms;
        this.zwhmsDirtyFlag  = true;
    }

    /**
     *  获取属性值[座位号描述]
     */
    public String getZwhms() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getZwhms();
        }
        return this.zwhms;
    }

    /**
     *  获取属性值[座位号描述]是否修改
     */
    public boolean isZwhmsDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isZwhmsDirty();
        }
        return this.zwhmsDirtyFlag;
    }

    /**
     *  重置属性值[座位号描述]
     */
    public void resetZwhms() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetZwhms();
            return;
        }

        this.zwhmsDirtyFlag = false;
        this.zwhms = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_CHRY.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_CHRY et) {
        et.resetOA_CHRYId();
        et.resetCreateDate();
        et.resetUpdateMan();
        et.resetOA_CHRYName();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetCHZT();
        et.resetCHSJ();
        et.resetZwh();
        et.resetYbhysqid();
        et.resetYBHYSQNAME();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetOrgSecUserTypeName();
        et.resetZwhms();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_CHRYIdDirty()) {
            params.put(FIELD_OA_CHRYID,getOA_CHRYId());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOA_CHRYNameDirty()) {
            params.put(FIELD_OA_CHRYNAME,getOA_CHRYName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isCHZTDirty()) {
            params.put(FIELD_CHZT,getCHZT());
        }
        if(!bDirtyOnly || isCHSJDirty()) {
            params.put(FIELD_CHSJ,getCHSJ());
        }
        if(!bDirtyOnly || isZwhDirty()) {
            params.put(FIELD_ZWH,getZwh());
        }
        if(!bDirtyOnly || isYbhysqidDirty()) {
            params.put(FIELD_YBHYSQID,getYbhysqid());
        }
        if(!bDirtyOnly || isYBHYSQNAMEDirty()) {
            params.put(FIELD_YBHYSQNAME,getYBHYSQNAME());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isOrgSecUserTypeNameDirty()) {
            params.put(FIELD_ORGSECUSERTYPENAME,getOrgSecUserTypeName());
        }
        if(!bDirtyOnly || isZwhmsDirty()) {
            params.put(FIELD_ZWHMS,getZwhms());
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

        return  OA_CHRY.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_CHRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CHRYID:
            return et.getOA_CHRYId();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_OA_CHRYNAME:
            return et.getOA_CHRYName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CHZT:
            return et.getCHZT();
        case INDEX_CHSJ:
            return et.getCHSJ();
        case INDEX_ZWH:
            return et.getZwh();
        case INDEX_YBHYSQID:
            return et.getYbhysqid();
        case INDEX_YBHYSQNAME:
            return et.getYBHYSQNAME();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName();
        case INDEX_ZWHMS:
            return et.getZwhms();
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

        OA_CHRY.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_CHRY et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_CHRYID:
            et.setOA_CHRYId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_CHRYNAME:
            et.setOA_CHRYName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CHZT:
            et.setCHZT(DataObject.getStringValue(obj));
            return ;
        case INDEX_CHSJ:
            et.setCHSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_ZWH:
            et.setZwh(DataObject.getStringValue(obj));
            return ;
        case INDEX_YBHYSQID:
            et.setYbhysqid(DataObject.getStringValue(obj));
            return ;
        case INDEX_YBHYSQNAME:
            et.setYBHYSQNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERTYPENAME:
            et.setOrgSecUserTypeName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ZWHMS:
            et.setZwhms(DataObject.getStringValue(obj));
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

        return  OA_CHRY.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_CHRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CHRYID:
            return et.getOA_CHRYId()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_OA_CHRYNAME:
            return et.getOA_CHRYName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CHZT:
            return et.getCHZT()==null;
        case INDEX_CHSJ:
            return et.getCHSJ()==null;
        case INDEX_ZWH:
            return et.getZwh()==null;
        case INDEX_YBHYSQID:
            return et.getYbhysqid()==null;
        case INDEX_YBHYSQNAME:
            return et.getYBHYSQNAME()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName()==null;
        case INDEX_ZWHMS:
            return et.getZwhms()==null;
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

        return  OA_CHRY.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_CHRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_CHRYID:
            return et.isOA_CHRYIdDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_OA_CHRYNAME:
            return et.isOA_CHRYNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CHZT:
            return et.isCHZTDirty();
        case INDEX_CHSJ:
            return et.isCHSJDirty();
        case INDEX_ZWH:
            return et.isZwhDirty();
        case INDEX_YBHYSQID:
            return et.isYbhysqidDirty();
        case INDEX_YBHYSQNAME:
            return et.isYBHYSQNAMEDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_ORGSECUSERTYPENAME:
            return et.isOrgSecUserTypeNameDirty();
        case INDEX_ZWHMS:
            return et.isZwhmsDirty();
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
    private static  void fillJSONObject(OA_CHRY et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_CHRYId()!=null) {
            JSONObjectHelper.put(json,"oa_chryid",getJSONValue(et.getOA_CHRYId()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOA_CHRYName()!=null) {
            JSONObjectHelper.put(json,"oa_chryname",getJSONValue(et.getOA_CHRYName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getCHZT()!=null) {
            JSONObjectHelper.put(json,"chzt",getJSONValue(et.getCHZT()),false);
        }
        if(bIncEmpty||et.getCHSJ()!=null) {
            JSONObjectHelper.put(json,"chsj",getJSONValue(et.getCHSJ()),false);
        }
        if(bIncEmpty||et.getZwh()!=null) {
            JSONObjectHelper.put(json,"zwh",getJSONValue(et.getZwh()),false);
        }
        if(bIncEmpty||et.getYbhysqid()!=null) {
            JSONObjectHelper.put(json,"ybhysqid",getJSONValue(et.getYbhysqid()),false);
        }
        if(bIncEmpty||et.getYBHYSQNAME()!=null) {
            JSONObjectHelper.put(json,"ybhysqname",getJSONValue(et.getYBHYSQNAME()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getOrgSecUserTypeName()!=null) {
            JSONObjectHelper.put(json,"orgsecusertypename",getJSONValue(et.getOrgSecUserTypeName()),false);
        }
        if(bIncEmpty||et.getZwhms()!=null) {
            JSONObjectHelper.put(json,"zwhms",getJSONValue(et.getZwhms()),false);
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
    private static void fillXmlNode(OA_CHRY et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_CHRYId()!=null) {
            Object obj = et.getOA_CHRYId();
            node.setAttribute("OA_CHRYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_CHRYName()!=null) {
            Object obj = et.getOA_CHRYName();
            node.setAttribute("OA_CHRYNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCHZT()!=null) {
            Object obj = et.getCHZT();
            node.setAttribute("CHZT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCHSJ()!=null) {
            Object obj = et.getCHSJ();
            node.setAttribute("CHSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getZwh()!=null) {
            Object obj = et.getZwh();
            node.setAttribute("ZWH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYbhysqid()!=null) {
            Object obj = et.getYbhysqid();
            node.setAttribute("YBHYSQID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getYBHYSQNAME()!=null) {
            Object obj = et.getYBHYSQNAME();
            node.setAttribute("YBHYSQNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserTypeName()!=null) {
            Object obj = et.getOrgSecUserTypeName();
            node.setAttribute("ORGSECUSERTYPENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getZwhms()!=null) {
            Object obj = et.getZwhms();
            node.setAttribute("ZWHMS",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_CHRY.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_CHRY et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_CHRYIdDirty() && (bIncEmpty||et.getOA_CHRYId()!=null)) {
            dst.set(FIELD_OA_CHRYID,et.getOA_CHRYId());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOA_CHRYNameDirty() && (bIncEmpty||et.getOA_CHRYName()!=null)) {
            dst.set(FIELD_OA_CHRYNAME,et.getOA_CHRYName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isCHZTDirty() && (bIncEmpty||et.getCHZT()!=null)) {
            dst.set(FIELD_CHZT,et.getCHZT());
        }
        if(et.isCHSJDirty() && (bIncEmpty||et.getCHSJ()!=null)) {
            dst.set(FIELD_CHSJ,et.getCHSJ());
        }
        if(et.isZwhDirty() && (bIncEmpty||et.getZwh()!=null)) {
            dst.set(FIELD_ZWH,et.getZwh());
        }
        if(et.isYbhysqidDirty() && (bIncEmpty||et.getYbhysqid()!=null)) {
            dst.set(FIELD_YBHYSQID,et.getYbhysqid());
        }
        if(et.isYBHYSQNAMEDirty() && (bIncEmpty||et.getYBHYSQNAME()!=null)) {
            dst.set(FIELD_YBHYSQNAME,et.getYBHYSQNAME());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isOrgSecUserTypeNameDirty() && (bIncEmpty||et.getOrgSecUserTypeName()!=null)) {
            dst.set(FIELD_ORGSECUSERTYPENAME,et.getOrgSecUserTypeName());
        }
        if(et.isZwhmsDirty() && (bIncEmpty||et.getZwhms()!=null)) {
            dst.set(FIELD_ZWHMS,et.getZwhms());
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
        return  OA_CHRY.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_CHRY et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_CHRYID:
            et.resetOA_CHRYId();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_OA_CHRYNAME:
            et.resetOA_CHRYName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_CHZT:
            et.resetCHZT();
            return true;
        case INDEX_CHSJ:
            et.resetCHSJ();
            return true;
        case INDEX_ZWH:
            et.resetZwh();
            return true;
        case INDEX_YBHYSQID:
            et.resetYbhysqid();
            return true;
        case INDEX_YBHYSQNAME:
            et.resetYBHYSQNAME();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_ORGSECUSERTYPENAME:
            et.resetOrgSecUserTypeName();
            return true;
        case INDEX_ZWHMS:
            et.resetZwhms();
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

        if(this.getYbhysqid()==null)
            return null;
        synchronized(objYBHYSQLock) {
            if(ybhysq==null) {
                ybhysq = new com.sa.unip.srv.ywsp.entity.OA_YBHYSQ();
                ybhysq.setOA_YBHYSQId(this.getYbhysqid());
                com.sa.unip.srv.ywsp.service.OA_YBHYSQService service = (com.sa.unip.srv.ywsp.service.OA_YBHYSQService)ServiceGlobal.getService(com.sa.unip.srv.ywsp.service.OA_YBHYSQService.class,this.getSessionFactory());
                service.autoGet(ybhysq);
            }
            return ybhysq;
        }
    }

    private Object objORGUSERLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser orguser = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getORGUSER() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getORGUSER();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objORGUSERLock) {
            if(orguser==null) {
                orguser = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                orguser.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(orguser);
            }
            return orguser;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_CHRY getProxyEntity() {
        return this.proxyOA_CHRY;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_CHRY = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_CHRY) {
            this.proxyOA_CHRY = (OA_CHRY)proxyDataObject;
        }

    }

}