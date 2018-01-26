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
 * 实体[OA_TZGGRY] 数据对象
 */
public class OA_TZGGRY extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_TZGGRY.class);
    /**
     *   实体属性标识[通知公告人员标识]
     */
    public final static String FIELD_OA_TZGGRYID = "OA_TZGGRYID";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[通知公告人员名称]
     */
    public final static String FIELD_OA_TZGGRYNAME = "OA_TZGGRYNAME";
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
     *   实体属性标识[通知公告标识]
     */
    public final static String FIELD_OA_TZGGID = "OA_TZGGID";
    /**
     *   实体属性标识[人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[是否已读]
     */
    public final static String FIELD_SFYD = "SFYD";

    private final static int INDEX_OA_TZGGRYID = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_OA_TZGGRYNAME = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_UPDATEMAN = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_OA_TZGGID = 6;
    private final static int INDEX_ORGUSERID = 7;
    private final static int INDEX_SFYD = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_TZGGRYID, INDEX_OA_TZGGRYID);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_OA_TZGGRYNAME, INDEX_OA_TZGGRYNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_OA_TZGGID, INDEX_OA_TZGGID);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_SFYD, INDEX_SFYD);
    }

    private OA_TZGGRY proxyOA_TZGGRY = null;

    public OA_TZGGRY() {
        super();
    }
    private boolean oa_tzggryidDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean oa_tzggrynameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean oa_tzggidDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean sfydDirtyFlag = false;

    @Column(name="oa_tzggryid")
    private String oa_tzggryid;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="oa_tzggryname")
    private String oa_tzggryname;
    @Column(name="createman")
    private String createman;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="oa_tzggid")
    private String oa_tzggid;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="sfyd")
    private String sfyd;


    /**
     *  设置属性值[通知公告人员标识]
     *  @param oa_tzggryid
     */
    public void setOA_TZGGRYId(String oa_tzggryid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_TZGGRYId(oa_tzggryid);
            return;
        }
        if(oa_tzggryid!=null) {
            oa_tzggryid = StringHelper.trimRight(oa_tzggryid);
            if(oa_tzggryid.length()==0) {
                oa_tzggryid = null;
            }
        }
        this.oa_tzggryid =  oa_tzggryid;
        this.oa_tzggryidDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告人员标识]
     */
    public String getOA_TZGGRYId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_TZGGRYId();
        }
        return this.oa_tzggryid;
    }

    /**
     *  获取属性值[通知公告人员标识]是否修改
     */
    public boolean isOA_TZGGRYIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_TZGGRYIdDirty();
        }
        return this.oa_tzggryidDirtyFlag;
    }

    /**
     *  重置属性值[通知公告人员标识]
     */
    public void resetOA_TZGGRYId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_TZGGRYId();
            return;
        }

        this.oa_tzggryidDirtyFlag = false;
        this.oa_tzggryid = null;
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
     *  设置属性值[通知公告人员名称]
     *  @param oa_tzggryname
     */
    public void setOA_TZGGRYName(String oa_tzggryname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_TZGGRYName(oa_tzggryname);
            return;
        }
        if(oa_tzggryname!=null) {
            oa_tzggryname = StringHelper.trimRight(oa_tzggryname);
            if(oa_tzggryname.length()==0) {
                oa_tzggryname = null;
            }
        }
        this.oa_tzggryname =  oa_tzggryname;
        this.oa_tzggrynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告人员名称]
     */
    public String getOA_TZGGRYName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_TZGGRYName();
        }
        return this.oa_tzggryname;
    }

    /**
     *  获取属性值[通知公告人员名称]是否修改
     */
    public boolean isOA_TZGGRYNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_TZGGRYNameDirty();
        }
        return this.oa_tzggrynameDirtyFlag;
    }

    /**
     *  重置属性值[通知公告人员名称]
     */
    public void resetOA_TZGGRYName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_TZGGRYName();
            return;
        }

        this.oa_tzggrynameDirtyFlag = false;
        this.oa_tzggryname = null;
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
     *  设置属性值[通知公告标识]
     *  @param oa_tzggid
     */
    public void setOA_TZGGId(String oa_tzggid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_TZGGId(oa_tzggid);
            return;
        }
        if(oa_tzggid!=null) {
            oa_tzggid = StringHelper.trimRight(oa_tzggid);
            if(oa_tzggid.length()==0) {
                oa_tzggid = null;
            }
        }
        this.oa_tzggid =  oa_tzggid;
        this.oa_tzggidDirtyFlag  = true;
    }

    /**
     *  获取属性值[通知公告标识]
     */
    public String getOA_TZGGId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_TZGGId();
        }
        return this.oa_tzggid;
    }

    /**
     *  获取属性值[通知公告标识]是否修改
     */
    public boolean isOA_TZGGIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_TZGGIdDirty();
        }
        return this.oa_tzggidDirtyFlag;
    }

    /**
     *  重置属性值[通知公告标识]
     */
    public void resetOA_TZGGId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_TZGGId();
            return;
        }

        this.oa_tzggidDirtyFlag = false;
        this.oa_tzggid = null;
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
     *  设置属性值[是否已读]
     *  @param sfyd
     */
    public void setSFYD(String sfyd) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSFYD(sfyd);
            return;
        }
        if(sfyd!=null) {
            sfyd = StringHelper.trimRight(sfyd);
            if(sfyd.length()==0) {
                sfyd = null;
            }
        }
        this.sfyd =  sfyd;
        this.sfydDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否已读]
     */
    public String getSFYD() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSFYD();
        }
        return this.sfyd;
    }

    /**
     *  获取属性值[是否已读]是否修改
     */
    public boolean isSFYDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSFYDDirty();
        }
        return this.sfydDirtyFlag;
    }

    /**
     *  重置属性值[是否已读]
     */
    public void resetSFYD() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSFYD();
            return;
        }

        this.sfydDirtyFlag = false;
        this.sfyd = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OA_TZGGRY.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_TZGGRY et) {
        et.resetOA_TZGGRYId();
        et.resetCreateDate();
        et.resetOA_TZGGRYName();
        et.resetCreateMan();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetOA_TZGGId();
        et.resetOrgUserId();
        et.resetSFYD();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_TZGGRYIdDirty()) {
            params.put(FIELD_OA_TZGGRYID,getOA_TZGGRYId());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isOA_TZGGRYNameDirty()) {
            params.put(FIELD_OA_TZGGRYNAME,getOA_TZGGRYName());
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
        if(!bDirtyOnly || isOA_TZGGIdDirty()) {
            params.put(FIELD_OA_TZGGID,getOA_TZGGId());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isSFYDDirty()) {
            params.put(FIELD_SFYD,getSFYD());
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

        return  OA_TZGGRY.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_TZGGRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_TZGGRYID:
            return et.getOA_TZGGRYId();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_OA_TZGGRYNAME:
            return et.getOA_TZGGRYName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_OA_TZGGID:
            return et.getOA_TZGGId();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_SFYD:
            return et.getSFYD();
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

        OA_TZGGRY.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_TZGGRY et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_TZGGRYID:
            et.setOA_TZGGRYId(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_TZGGRYNAME:
            et.setOA_TZGGRYName(DataObject.getStringValue(obj));
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
        case INDEX_OA_TZGGID:
            et.setOA_TZGGId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_SFYD:
            et.setSFYD(DataObject.getStringValue(obj));
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

        return  OA_TZGGRY.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_TZGGRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_TZGGRYID:
            return et.getOA_TZGGRYId()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_OA_TZGGRYNAME:
            return et.getOA_TZGGRYName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_OA_TZGGID:
            return et.getOA_TZGGId()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_SFYD:
            return et.getSFYD()==null;
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

        return  OA_TZGGRY.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_TZGGRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_TZGGRYID:
            return et.isOA_TZGGRYIdDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_OA_TZGGRYNAME:
            return et.isOA_TZGGRYNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_OA_TZGGID:
            return et.isOA_TZGGIdDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_SFYD:
            return et.isSFYDDirty();
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
    private static  void fillJSONObject(OA_TZGGRY et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_TZGGRYId()!=null) {
            JSONObjectHelper.put(json,"oa_tzggryid",getJSONValue(et.getOA_TZGGRYId()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getOA_TZGGRYName()!=null) {
            JSONObjectHelper.put(json,"oa_tzggryname",getJSONValue(et.getOA_TZGGRYName()),false);
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
        if(bIncEmpty||et.getOA_TZGGId()!=null) {
            JSONObjectHelper.put(json,"oa_tzggid",getJSONValue(et.getOA_TZGGId()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            JSONObjectHelper.put(json,"sfyd",getJSONValue(et.getSFYD()),false);
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
    private static void fillXmlNode(OA_TZGGRY et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_TZGGRYId()!=null) {
            Object obj = et.getOA_TZGGRYId();
            node.setAttribute("OA_TZGGRYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_TZGGRYName()!=null) {
            Object obj = et.getOA_TZGGRYName();
            node.setAttribute("OA_TZGGRYNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getOA_TZGGId()!=null) {
            Object obj = et.getOA_TZGGId();
            node.setAttribute("OA_TZGGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSFYD()!=null) {
            Object obj = et.getSFYD();
            node.setAttribute("SFYD",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OA_TZGGRY.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_TZGGRY et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_TZGGRYIdDirty() && (bIncEmpty||et.getOA_TZGGRYId()!=null)) {
            dst.set(FIELD_OA_TZGGRYID,et.getOA_TZGGRYId());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isOA_TZGGRYNameDirty() && (bIncEmpty||et.getOA_TZGGRYName()!=null)) {
            dst.set(FIELD_OA_TZGGRYNAME,et.getOA_TZGGRYName());
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
        if(et.isOA_TZGGIdDirty() && (bIncEmpty||et.getOA_TZGGId()!=null)) {
            dst.set(FIELD_OA_TZGGID,et.getOA_TZGGId());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isSFYDDirty() && (bIncEmpty||et.getSFYD()!=null)) {
            dst.set(FIELD_SFYD,et.getSFYD());
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
        return  OA_TZGGRY.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_TZGGRY et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_TZGGRYID:
            et.resetOA_TZGGRYId();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_OA_TZGGRYNAME:
            et.resetOA_TZGGRYName();
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
        case INDEX_OA_TZGGID:
            et.resetOA_TZGGId();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_SFYD:
            et.resetSFYD();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objTZGGLock = new Object();
    private com.sa.unip.srv.xxtz.entity.OA_TZGG tzgg = null;
    /**
    * 获取父数据 通知公告
     * @throws Exception
    */
    public com.sa.unip.srv.xxtz.entity.OA_TZGG getTZGG() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTZGG();
        }

        if(this.getOA_TZGGId()==null)
            return null;
        synchronized(objTZGGLock) {
            if(tzgg==null) {
                tzgg = new com.sa.unip.srv.xxtz.entity.OA_TZGG();
                tzgg.setOA_TZGGId(this.getOA_TZGGId());
                com.sa.unip.srv.xxtz.service.OA_TZGGService service = (com.sa.unip.srv.xxtz.service.OA_TZGGService)ServiceGlobal.getService(com.sa.unip.srv.xxtz.service.OA_TZGGService.class,this.getSessionFactory());
                service.autoGet(tzgg);
            }
            return tzgg;
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
    private OA_TZGGRY getProxyEntity() {
        return this.proxyOA_TZGGRY;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_TZGGRY = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_TZGGRY) {
            this.proxyOA_TZGGRY = (OA_TZGGRY)proxyDataObject;
        }

    }

}