/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.xxtz.entity;


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
 * 实体[OA_XX] 数据对象
 */
public class OA_XX extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_XX.class);
    /**
     *   实体属性标识[消息标识]
     */
    public final static String FIELD_OA_XXID = "OA_XXID";
    /**
     *   实体属性标识[消息标题]
     */
    public final static String FIELD_OA_XXNAME = "OA_XXNAME";
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
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[消息内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[发送时间]
     */
    public final static String FIELD_FSSJ = "FSSJ";
    /**
     *   实体属性标识[消息类型]
     */
    public final static String FIELD_XXLX = "XXLX";
    /**
     *   实体属性标识[发送人标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[发送人名称]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[接收人员]
     */
    public final static String FIELD_JSR = "JSR";
    /**
     *   实体属性标识[是否已发送]
     */
    public final static String FIELD_SFYFS = "SFYFS";

    private final static int INDEX_OA_XXID = 0;
    private final static int INDEX_OA_XXNAME = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_CREATEMAN = 4;
    private final static int INDEX_UPDATEMAN = 5;
    private final static int INDEX_CONTENT = 6;
    private final static int INDEX_FSSJ = 7;
    private final static int INDEX_XXLX = 8;
    private final static int INDEX_ORGUSERID = 9;
    private final static int INDEX_ORGUSERNAME = 10;
    private final static int INDEX_JSR = 11;
    private final static int INDEX_SFYFS = 12;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_XXID, INDEX_OA_XXID);
        fieldIndexMap.put( FIELD_OA_XXNAME, INDEX_OA_XXNAME);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_FSSJ, INDEX_FSSJ);
        fieldIndexMap.put( FIELD_XXLX, INDEX_XXLX);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_JSR, INDEX_JSR);
        fieldIndexMap.put( FIELD_SFYFS, INDEX_SFYFS);
    }

    private OA_XX proxyOA_XX = null;

    public OA_XX() {
        super();
    }
    private boolean oa_xxidDirtyFlag = false;
    private boolean oa_xxnameDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean fssjDirtyFlag = false;
    private boolean xxlxDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean jsrDirtyFlag = false;
    private boolean sfyfsDirtyFlag = false;

    @Column(name="oa_xxid")
    private String oa_xxid;
    @Column(name="oa_xxname")
    private String oa_xxname;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="content")
    private String content;
    @Column(name="fssj")
    private Timestamp fssj;
    @Column(name="xxlx")
    private String xxlx;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="jsr")
    private String jsr;
    @Column(name="sfyfs")
    private String sfyfs;


    /**
     *  设置属性值[消息标识]
     *  @param oa_xxid
     */
    public void setOA_XXID(String oa_xxid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XXID(oa_xxid);
            return;
        }
        if(oa_xxid!=null) {
            oa_xxid = StringHelper.trimRight(oa_xxid);
            if(oa_xxid.length()==0) {
                oa_xxid = null;
            }
        }
        this.oa_xxid =  oa_xxid;
        this.oa_xxidDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息标识]
     */
    public String getOA_XXID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XXID();
        }
        return this.oa_xxid;
    }

    /**
     *  获取属性值[消息标识]是否修改
     */
    public boolean isOA_XXIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XXIDDirty();
        }
        return this.oa_xxidDirtyFlag;
    }

    /**
     *  重置属性值[消息标识]
     */
    public void resetOA_XXID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XXID();
            return;
        }

        this.oa_xxidDirtyFlag = false;
        this.oa_xxid = null;
    }
    /**
     *  设置属性值[消息标题]
     *  @param oa_xxname
     */
    public void setOA_XXName(String oa_xxname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XXName(oa_xxname);
            return;
        }
        if(oa_xxname!=null) {
            oa_xxname = StringHelper.trimRight(oa_xxname);
            if(oa_xxname.length()==0) {
                oa_xxname = null;
            }
        }
        this.oa_xxname =  oa_xxname;
        this.oa_xxnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息标题]
     */
    public String getOA_XXName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XXName();
        }
        return this.oa_xxname;
    }

    /**
     *  获取属性值[消息标题]是否修改
     */
    public boolean isOA_XXNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XXNameDirty();
        }
        return this.oa_xxnameDirtyFlag;
    }

    /**
     *  重置属性值[消息标题]
     */
    public void resetOA_XXName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XXName();
            return;
        }

        this.oa_xxnameDirtyFlag = false;
        this.oa_xxname = null;
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
     *  设置属性值[消息内容]
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
     *  获取属性值[消息内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[消息内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[消息内容]
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
     *  设置属性值[发送时间]
     *  @param fssj
     */
    public void setFSSJ(Timestamp fssj) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFSSJ(fssj);
            return;
        }
        this.fssj =  fssj;
        this.fssjDirtyFlag  = true;
    }

    /**
     *  获取属性值[发送时间]
     */
    public Timestamp getFSSJ() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFSSJ();
        }
        return this.fssj;
    }

    /**
     *  获取属性值[发送时间]是否修改
     */
    public boolean isFSSJDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFSSJDirty();
        }
        return this.fssjDirtyFlag;
    }

    /**
     *  重置属性值[发送时间]
     */
    public void resetFSSJ() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFSSJ();
            return;
        }

        this.fssjDirtyFlag = false;
        this.fssj = null;
    }
    /**
     *  设置属性值[消息类型]代码表：com.sa.unip.srv.codelist.XXLXCodeListModel
     *  @param xxlx
     */
    public void setXXLX(String xxlx) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setXXLX(xxlx);
            return;
        }
        if(xxlx!=null) {
            xxlx = StringHelper.trimRight(xxlx);
            if(xxlx.length()==0) {
                xxlx = null;
            }
        }
        this.xxlx =  xxlx;
        this.xxlxDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息类型]代码表：com.sa.unip.srv.codelist.XXLXCodeListModel
     */
    public String getXXLX() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXXLX();
        }
        return this.xxlx;
    }

    /**
     *  获取属性值[消息类型]是否修改
     */
    public boolean isXXLXDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isXXLXDirty();
        }
        return this.xxlxDirtyFlag;
    }

    /**
     *  重置属性值[消息类型]
     */
    public void resetXXLX() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetXXLX();
            return;
        }

        this.xxlxDirtyFlag = false;
        this.xxlx = null;
    }
    /**
     *  设置属性值[发送人标识]
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
     *  获取属性值[发送人标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[发送人标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[发送人标识]
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
     *  设置属性值[发送人名称]
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
     *  获取属性值[发送人名称]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[发送人名称]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[发送人名称]
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
     *  设置属性值[接收人员]
     *  @param jsr
     */
    public void setJSR(String jsr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setJSR(jsr);
            return;
        }
        if(jsr!=null) {
            jsr = StringHelper.trimRight(jsr);
            if(jsr.length()==0) {
                jsr = null;
            }
        }
        this.jsr =  jsr;
        this.jsrDirtyFlag  = true;
    }

    /**
     *  获取属性值[接收人员]
     */
    public String getJSR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getJSR();
        }
        return this.jsr;
    }

    /**
     *  获取属性值[接收人员]是否修改
     */
    public boolean isJSRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isJSRDirty();
        }
        return this.jsrDirtyFlag;
    }

    /**
     *  重置属性值[接收人员]
     */
    public void resetJSR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetJSR();
            return;
        }

        this.jsrDirtyFlag = false;
        this.jsr = null;
    }
    /**
     *  设置属性值[是否已发送]代码表：com.sa.unip.srv.codelist.XXSFYFSCodeListModel
     *  @param sfyfs
     */
    public void setSFYFS(String sfyfs) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFYFS(sfyfs);
            return;
        }
        if(sfyfs!=null) {
            sfyfs = StringHelper.trimRight(sfyfs);
            if(sfyfs.length()==0) {
                sfyfs = null;
            }
        }
        this.sfyfs =  sfyfs;
        this.sfyfsDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否已发送]代码表：com.sa.unip.srv.codelist.XXSFYFSCodeListModel
     */
    public String getSFYFS() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFYFS();
        }
        return this.sfyfs;
    }

    /**
     *  获取属性值[是否已发送]是否修改
     */
    public boolean isSFYFSDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFYFSDirty();
        }
        return this.sfyfsDirtyFlag;
    }

    /**
     *  重置属性值[是否已发送]
     */
    public void resetSFYFS() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFYFS();
            return;
        }

        this.sfyfsDirtyFlag = false;
        this.sfyfs = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_XX.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_XX et) {
        et.resetOA_XXID();
        et.resetOA_XXName();
        et.resetCreateDate();
        et.resetUpdateDate();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetCONTENT();
        et.resetFSSJ();
        et.resetXXLX();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetJSR();
        et.resetSFYFS();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_XXIDDirty()) {
            params.put(FIELD_OA_XXID,getOA_XXID());
        }
        if(!bDirtyOnly || isOA_XXNameDirty()) {
            params.put(FIELD_OA_XXNAME,getOA_XXName());
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
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isFSSJDirty()) {
            params.put(FIELD_FSSJ,getFSSJ());
        }
        if(!bDirtyOnly || isXXLXDirty()) {
            params.put(FIELD_XXLX,getXXLX());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isJSRDirty()) {
            params.put(FIELD_JSR,getJSR());
        }
        if(!bDirtyOnly || isSFYFSDirty()) {
            params.put(FIELD_SFYFS,getSFYFS());
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

        return  OA_XX.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_XX et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXID:
            return et.getOA_XXID();
        case INDEX_OA_XXNAME:
            return et.getOA_XXName();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_FSSJ:
            return et.getFSSJ();
        case INDEX_XXLX:
            return et.getXXLX();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_JSR:
            return et.getJSR();
        case INDEX_SFYFS:
            return et.getSFYFS();
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

        OA_XX.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_XX et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_XXID:
            et.setOA_XXID(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_XXNAME:
            et.setOA_XXName(DataObject.getStringValue(obj));
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
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_FSSJ:
            et.setFSSJ(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_XXLX:
            et.setXXLX(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_JSR:
            et.setJSR(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFYFS:
            et.setSFYFS(DataObject.getStringValue(obj));
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

        return  OA_XX.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_XX et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXID:
            return et.getOA_XXID()==null;
        case INDEX_OA_XXNAME:
            return et.getOA_XXName()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_FSSJ:
            return et.getFSSJ()==null;
        case INDEX_XXLX:
            return et.getXXLX()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_JSR:
            return et.getJSR()==null;
        case INDEX_SFYFS:
            return et.getSFYFS()==null;
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

        return  OA_XX.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_XX et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXID:
            return et.isOA_XXIDDirty();
        case INDEX_OA_XXNAME:
            return et.isOA_XXNameDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_FSSJ:
            return et.isFSSJDirty();
        case INDEX_XXLX:
            return et.isXXLXDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_JSR:
            return et.isJSRDirty();
        case INDEX_SFYFS:
            return et.isSFYFSDirty();
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
    private static  void fillJSONObject(OA_XX et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XXID()!=null) {
            JSONObjectHelper.put(json,"oa_xxid",getJSONValue(et.getOA_XXID()),false);
        }
        if(bIncEmpty||et.getOA_XXName()!=null) {
            JSONObjectHelper.put(json,"oa_xxname",getJSONValue(et.getOA_XXName()),false);
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
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getFSSJ()!=null) {
            JSONObjectHelper.put(json,"fssj",getJSONValue(et.getFSSJ()),false);
        }
        if(bIncEmpty||et.getXXLX()!=null) {
            JSONObjectHelper.put(json,"xxlx",getJSONValue(et.getXXLX()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            JSONObjectHelper.put(json,"orgusername",getJSONValue(et.getOrgUserName()),false);
        }
        if(bIncEmpty||et.getJSR()!=null) {
            JSONObjectHelper.put(json,"jsr",getJSONValue(et.getJSR()),false);
        }
        if(bIncEmpty||et.getSFYFS()!=null) {
            JSONObjectHelper.put(json,"sfyfs",getJSONValue(et.getSFYFS()),false);
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
    private static void fillXmlNode(OA_XX et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XXID()!=null) {
            Object obj = et.getOA_XXID();
            node.setAttribute("OA_XXID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_XXName()!=null) {
            Object obj = et.getOA_XXName();
            node.setAttribute("OA_XXNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFSSJ()!=null) {
            Object obj = et.getFSSJ();
            node.setAttribute("FSSJ",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getXXLX()!=null) {
            Object obj = et.getXXLX();
            node.setAttribute("XXLX",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getJSR()!=null) {
            Object obj = et.getJSR();
            node.setAttribute("JSR",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFYFS()!=null) {
            Object obj = et.getSFYFS();
            node.setAttribute("SFYFS",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_XX.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_XX et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_XXIDDirty() && (bIncEmpty||et.getOA_XXID()!=null)) {
            dst.set(FIELD_OA_XXID,et.getOA_XXID());
        }
        if(et.isOA_XXNameDirty() && (bIncEmpty||et.getOA_XXName()!=null)) {
            dst.set(FIELD_OA_XXNAME,et.getOA_XXName());
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
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isFSSJDirty() && (bIncEmpty||et.getFSSJ()!=null)) {
            dst.set(FIELD_FSSJ,et.getFSSJ());
        }
        if(et.isXXLXDirty() && (bIncEmpty||et.getXXLX()!=null)) {
            dst.set(FIELD_XXLX,et.getXXLX());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            dst.set(FIELD_ORGUSERNAME,et.getOrgUserName());
        }
        if(et.isJSRDirty() && (bIncEmpty||et.getJSR()!=null)) {
            dst.set(FIELD_JSR,et.getJSR());
        }
        if(et.isSFYFSDirty() && (bIncEmpty||et.getSFYFS()!=null)) {
            dst.set(FIELD_SFYFS,et.getSFYFS());
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
        return  OA_XX.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_XX et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_XXID:
            et.resetOA_XXID();
            return true;
        case INDEX_OA_XXNAME:
            et.resetOA_XXName();
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
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_FSSJ:
            et.resetFSSJ();
            return true;
        case INDEX_XXLX:
            et.resetXXLX();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_JSR:
            et.resetJSR();
            return true;
        case INDEX_SFYFS:
            et.resetSFYFS();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objFSRLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser fsr = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getFSR() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFSR();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objFSRLock) {
            if(fsr==null) {
                fsr = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                fsr.setOrgUserId(this.getOrgUserId());
                com.sa.unip.srv.subsys.service.OrgUserService service = (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService(com.sa.unip.srv.subsys.service.OrgUserService.class,this.getSessionFactory());
                service.autoGet(fsr);
            }
            return fsr;
        }
    }





    /**
     *  获取代理的数据对象
     */
    private OA_XX getProxyEntity() {
        return this.proxyOA_XX;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_XX = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_XX) {
            this.proxyOA_XX = (OA_XX)proxyDataObject;
        }

    }

}