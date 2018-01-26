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
 * 实体[OA_XXRY] 数据对象
 */
public class OA_XXRY extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OA_XXRY.class);
    /**
     *   实体属性标识[消息人员标识]
     */
    public final static String FIELD_OA_XXRYID = "OA_XXRYID";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[消息人员名称]
     */
    public final static String FIELD_OA_XXRYNAME = "OA_XXRYNAME";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[组织人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[消息标识]
     */
    public final static String FIELD_OA_XXID = "OA_XXID";
    /**
     *   实体属性标识[是否已读]
     */
    public final static String FIELD_SFYD = "SFYD";

    private final static int INDEX_OA_XXRYID = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_UPDATEMAN = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_OA_XXRYNAME = 4;
    private final static int INDEX_CREATEMAN = 5;
    private final static int INDEX_ORGUSERID = 6;
    private final static int INDEX_OA_XXID = 7;
    private final static int INDEX_SFYD = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_OA_XXRYID, INDEX_OA_XXRYID);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_OA_XXRYNAME, INDEX_OA_XXRYNAME);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_OA_XXID, INDEX_OA_XXID);
        fieldIndexMap.put( FIELD_SFYD, INDEX_SFYD);
    }

    private OA_XXRY proxyOA_XXRY = null;

    public OA_XXRY() {
        super();
    }
    private boolean oa_xxryidDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean oa_xxrynameDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean oa_xxidDirtyFlag = false;
    private boolean sfydDirtyFlag = false;

    @Column(name="oa_xxryid")
    private String oa_xxryid;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="oa_xxryname")
    private String oa_xxryname;
    @Column(name="createman")
    private String createman;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="oa_xxid")
    private String oa_xxid;
    @Column(name="sfyd")
    private String sfyd;


    /**
     *  设置属性值[消息人员标识]
     *  @param oa_xxryid
     */
    public void setOA_XXRYID(String oa_xxryid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XXRYID(oa_xxryid);
            return;
        }
        if(oa_xxryid!=null) {
            oa_xxryid = StringHelper.trimRight(oa_xxryid);
            if(oa_xxryid.length()==0) {
                oa_xxryid = null;
            }
        }
        this.oa_xxryid =  oa_xxryid;
        this.oa_xxryidDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息人员标识]
     */
    public String getOA_XXRYID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XXRYID();
        }
        return this.oa_xxryid;
    }

    /**
     *  获取属性值[消息人员标识]是否修改
     */
    public boolean isOA_XXRYIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XXRYIDDirty();
        }
        return this.oa_xxryidDirtyFlag;
    }

    /**
     *  重置属性值[消息人员标识]
     */
    public void resetOA_XXRYID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XXRYID();
            return;
        }

        this.oa_xxryidDirtyFlag = false;
        this.oa_xxryid = null;
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
     *  设置属性值[消息人员名称]
     *  @param oa_xxryname
     */
    public void setOA_XXRYName(String oa_xxryname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOA_XXRYName(oa_xxryname);
            return;
        }
        if(oa_xxryname!=null) {
            oa_xxryname = StringHelper.trimRight(oa_xxryname);
            if(oa_xxryname.length()==0) {
                oa_xxryname = null;
            }
        }
        this.oa_xxryname =  oa_xxryname;
        this.oa_xxrynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息人员名称]
     */
    public String getOA_XXRYName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOA_XXRYName();
        }
        return this.oa_xxryname;
    }

    /**
     *  获取属性值[消息人员名称]是否修改
     */
    public boolean isOA_XXRYNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOA_XXRYNameDirty();
        }
        return this.oa_xxrynameDirtyFlag;
    }

    /**
     *  重置属性值[消息人员名称]
     */
    public void resetOA_XXRYName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOA_XXRYName();
            return;
        }

        this.oa_xxrynameDirtyFlag = false;
        this.oa_xxryname = null;
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
     *  设置属性值[组织人员标识]
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
     *  获取属性值[组织人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[组织人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[组织人员标识]
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
        OA_XXRY.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OA_XXRY et) {
        et.resetOA_XXRYID();
        et.resetCreateDate();
        et.resetUpdateMan();
        et.resetUpdateDate();
        et.resetOA_XXRYName();
        et.resetCreateMan();
        et.resetOrgUserId();
        et.resetOA_XXID();
        et.resetSFYD();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isOA_XXRYIDDirty()) {
            params.put(FIELD_OA_XXRYID,getOA_XXRYID());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isOA_XXRYNameDirty()) {
            params.put(FIELD_OA_XXRYNAME,getOA_XXRYName());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOA_XXIDDirty()) {
            params.put(FIELD_OA_XXID,getOA_XXID());
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

        return  OA_XXRY.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OA_XXRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXRYID:
            return et.getOA_XXRYID();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_OA_XXRYNAME:
            return et.getOA_XXRYName();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_OA_XXID:
            return et.getOA_XXID();
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

        OA_XXRY.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OA_XXRY et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_OA_XXRYID:
            et.setOA_XXRYID(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_OA_XXRYNAME:
            et.setOA_XXRYName(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OA_XXID:
            et.setOA_XXID(DataObject.getStringValue(obj));
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

        return  OA_XXRY.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OA_XXRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXRYID:
            return et.getOA_XXRYID()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_OA_XXRYNAME:
            return et.getOA_XXRYName()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_OA_XXID:
            return et.getOA_XXID()==null;
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

        return  OA_XXRY.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OA_XXRY et,int index) throws Exception {

        switch(index) {
        case INDEX_OA_XXRYID:
            return et.isOA_XXRYIDDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_OA_XXRYNAME:
            return et.isOA_XXRYNameDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_OA_XXID:
            return et.isOA_XXIDDirty();
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
    private static  void fillJSONObject(OA_XXRY et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XXRYID()!=null) {
            JSONObjectHelper.put(json,"oa_xxryid",getJSONValue(et.getOA_XXRYID()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getOA_XXRYName()!=null) {
            JSONObjectHelper.put(json,"oa_xxryname",getJSONValue(et.getOA_XXRYName()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            JSONObjectHelper.put(json,"orguserid",getJSONValue(et.getOrgUserId()),false);
        }
        if(bIncEmpty||et.getOA_XXID()!=null) {
            JSONObjectHelper.put(json,"oa_xxid",getJSONValue(et.getOA_XXID()),false);
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
    private static void fillXmlNode(OA_XXRY et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getOA_XXRYID()!=null) {
            Object obj = et.getOA_XXRYID();
            node.setAttribute("OA_XXRYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getOA_XXRYName()!=null) {
            Object obj = et.getOA_XXRYName();
            node.setAttribute("OA_XXRYNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOA_XXID()!=null) {
            Object obj = et.getOA_XXID();
            node.setAttribute("OA_XXID",(obj==null)?"":(String)obj);
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
        OA_XXRY.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OA_XXRY et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isOA_XXRYIDDirty() && (bIncEmpty||et.getOA_XXRYID()!=null)) {
            dst.set(FIELD_OA_XXRYID,et.getOA_XXRYID());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isOA_XXRYNameDirty() && (bIncEmpty||et.getOA_XXRYName()!=null)) {
            dst.set(FIELD_OA_XXRYNAME,et.getOA_XXRYName());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            dst.set(FIELD_ORGUSERID,et.getOrgUserId());
        }
        if(et.isOA_XXIDDirty() && (bIncEmpty||et.getOA_XXID()!=null)) {
            dst.set(FIELD_OA_XXID,et.getOA_XXID());
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
        return  OA_XXRY.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OA_XXRY et,int index) throws Exception {
        switch(index) {
        case INDEX_OA_XXRYID:
            et.resetOA_XXRYID();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_OA_XXRYNAME:
            et.resetOA_XXRYName();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_OA_XXID:
            et.resetOA_XXID();
            return true;
        case INDEX_SFYD:
            et.resetSFYD();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objXXIDLock = new Object();
    private com.sa.unip.srv.xxtz.entity.OA_XX xxid = null;
    /**
    * 获取父数据 消息
     * @throws Exception
    */
    public com.sa.unip.srv.xxtz.entity.OA_XX getXXID() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getXXID();
        }

        if(this.getOA_XXID()==null)
            return null;
        synchronized(objXXIDLock) {
            if(xxid==null) {
                xxid = new com.sa.unip.srv.xxtz.entity.OA_XX();
                xxid.setOA_XXID(this.getOA_XXID());
                com.sa.unip.srv.xxtz.service.OA_XXService service = (com.sa.unip.srv.xxtz.service.OA_XXService)ServiceGlobal.getService(com.sa.unip.srv.xxtz.service.OA_XXService.class,this.getSessionFactory());
                service.autoGet(xxid);
            }
            return xxid;
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
    private OA_XXRY getProxyEntity() {
        return this.proxyOA_XXRY;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOA_XXRY = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OA_XXRY) {
            this.proxyOA_XXRY = (OA_XXRY)proxyDataObject;
        }

    }

}