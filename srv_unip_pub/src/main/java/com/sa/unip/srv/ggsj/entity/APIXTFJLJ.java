/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.srv.ggsj.entity;


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
 * 实体[APIXTFJLJ] 数据对象
 */
public class APIXTFJLJ extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(APIXTFJLJ.class);
    /**
     *   实体属性标识[UKEY]
     */
    public final static String FIELD_UKEY = "UKEY";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[组织人员关系]
     */
    public final static String FIELD_ORGSECUSERID = "ORGSECUSERID";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[IP]
     */
    public final static String FIELD_IP = "IP";
    /**
     *   实体属性标识[附加逻辑标识]
     */
    public final static String FIELD_API_XT_FJLJID = "API_XT_FJLJID";
    /**
     *   实体属性标识[附加逻辑名称]
     */
    public final static String FIELD_API_XT_FJLJNAME = "API_XT_FJLJNAME";
    /**
     *   实体属性标识[登录名]
     */
    public final static String FIELD_LOGINNAME = "LOGINNAME";

    private final static int INDEX_UKEY = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_ORGSECUSERID = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_IP = 6;
    private final static int INDEX_API_XT_FJLJID = 7;
    private final static int INDEX_API_XT_FJLJNAME = 8;
    private final static int INDEX_LOGINNAME = 9;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_UKEY, INDEX_UKEY);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_ORGSECUSERID, INDEX_ORGSECUSERID);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_IP, INDEX_IP);
        fieldIndexMap.put( FIELD_API_XT_FJLJID, INDEX_API_XT_FJLJID);
        fieldIndexMap.put( FIELD_API_XT_FJLJNAME, INDEX_API_XT_FJLJNAME);
        fieldIndexMap.put( FIELD_LOGINNAME, INDEX_LOGINNAME);
    }

    private APIXTFJLJ proxyAPIXTFJLJ = null;

    public APIXTFJLJ() {
        super();
    }
    private boolean ukeyDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean orgsecuseridDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean ipDirtyFlag = false;
    private boolean api_xt_fjljidDirtyFlag = false;
    private boolean api_xt_fjljnameDirtyFlag = false;
    private boolean loginnameDirtyFlag = false;

    @Column(name="ukey")
    private String ukey;
    @Column(name="createman")
    private String createman;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="orgsecuserid")
    private String orgsecuserid;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="ip")
    private String ip;
    @Column(name="api_xt_fjljid")
    private String api_xt_fjljid;
    @Column(name="api_xt_fjljname")
    private String api_xt_fjljname;
    @Column(name="loginname")
    private String loginname;


    /**
     *  设置属性值[UKEY]
     *  @param ukey
     */
    public void setUKEY(String ukey) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUKEY(ukey);
            return;
        }
        if(ukey!=null) {
            ukey = StringHelper.trimRight(ukey);
            if(ukey.length()==0) {
                ukey = null;
            }
        }
        this.ukey =  ukey;
        this.ukeyDirtyFlag  = true;
    }

    /**
     *  获取属性值[UKEY]
     */
    public String getUKEY() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUKEY();
        }
        return this.ukey;
    }

    /**
     *  获取属性值[UKEY]是否修改
     */
    public boolean isUKEYDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUKEYDirty();
        }
        return this.ukeyDirtyFlag;
    }

    /**
     *  重置属性值[UKEY]
     */
    public void resetUKEY() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUKEY();
            return;
        }

        this.ukeyDirtyFlag = false;
        this.ukey = null;
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
     *  设置属性值[组织人员关系]
     *  @param orgsecuserid
     */
    public void setOrgSecUserId(String orgsecuserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserId(orgsecuserid);
            return;
        }
        if(orgsecuserid!=null) {
            orgsecuserid = StringHelper.trimRight(orgsecuserid);
            if(orgsecuserid.length()==0) {
                orgsecuserid = null;
            }
        }
        this.orgsecuserid =  orgsecuserid;
        this.orgsecuseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织人员关系]
     */
    public String getOrgSecUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserId();
        }
        return this.orgsecuserid;
    }

    /**
     *  获取属性值[组织人员关系]是否修改
     */
    public boolean isOrgSecUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserIdDirty();
        }
        return this.orgsecuseridDirtyFlag;
    }

    /**
     *  重置属性值[组织人员关系]
     */
    public void resetOrgSecUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserId();
            return;
        }

        this.orgsecuseridDirtyFlag = false;
        this.orgsecuserid = null;
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
     *  设置属性值[IP]
     *  @param ip
     */
    public void setIP(String ip) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIP(ip);
            return;
        }
        if(ip!=null) {
            ip = StringHelper.trimRight(ip);
            if(ip.length()==0) {
                ip = null;
            }
        }
        this.ip =  ip;
        this.ipDirtyFlag  = true;
    }

    /**
     *  获取属性值[IP]
     */
    public String getIP() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIP();
        }
        return this.ip;
    }

    /**
     *  获取属性值[IP]是否修改
     */
    public boolean isIPDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIPDirty();
        }
        return this.ipDirtyFlag;
    }

    /**
     *  重置属性值[IP]
     */
    public void resetIP() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIP();
            return;
        }

        this.ipDirtyFlag = false;
        this.ip = null;
    }
    /**
     *  设置属性值[附加逻辑标识]
     *  @param api_xt_fjljid
     */
    public void setApi_xt_fjljid(String api_xt_fjljid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setApi_xt_fjljid(api_xt_fjljid);
            return;
        }
        if(api_xt_fjljid!=null) {
            api_xt_fjljid = StringHelper.trimRight(api_xt_fjljid);
            if(api_xt_fjljid.length()==0) {
                api_xt_fjljid = null;
            }
        }
        this.api_xt_fjljid =  api_xt_fjljid;
        this.api_xt_fjljidDirtyFlag  = true;
    }

    /**
     *  获取属性值[附加逻辑标识]
     */
    public String getApi_xt_fjljid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getApi_xt_fjljid();
        }
        return this.api_xt_fjljid;
    }

    /**
     *  获取属性值[附加逻辑标识]是否修改
     */
    public boolean isApi_xt_fjljidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isApi_xt_fjljidDirty();
        }
        return this.api_xt_fjljidDirtyFlag;
    }

    /**
     *  重置属性值[附加逻辑标识]
     */
    public void resetApi_xt_fjljid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetApi_xt_fjljid();
            return;
        }

        this.api_xt_fjljidDirtyFlag = false;
        this.api_xt_fjljid = null;
    }
    /**
     *  设置属性值[附加逻辑名称]
     *  @param api_xt_fjljname
     */
    public void setApi_xt_fjljname(String api_xt_fjljname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setApi_xt_fjljname(api_xt_fjljname);
            return;
        }
        if(api_xt_fjljname!=null) {
            api_xt_fjljname = StringHelper.trimRight(api_xt_fjljname);
            if(api_xt_fjljname.length()==0) {
                api_xt_fjljname = null;
            }
        }
        this.api_xt_fjljname =  api_xt_fjljname;
        this.api_xt_fjljnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[附加逻辑名称]
     */
    public String getApi_xt_fjljname() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getApi_xt_fjljname();
        }
        return this.api_xt_fjljname;
    }

    /**
     *  获取属性值[附加逻辑名称]是否修改
     */
    public boolean isApi_xt_fjljnameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isApi_xt_fjljnameDirty();
        }
        return this.api_xt_fjljnameDirtyFlag;
    }

    /**
     *  重置属性值[附加逻辑名称]
     */
    public void resetApi_xt_fjljname() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetApi_xt_fjljname();
            return;
        }

        this.api_xt_fjljnameDirtyFlag = false;
        this.api_xt_fjljname = null;
    }
    /**
     *  设置属性值[登录名]
     *  @param loginname
     */
    public void setLoginName(String loginname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLoginName(loginname);
            return;
        }
        if(loginname!=null) {
            loginname = StringHelper.trimRight(loginname);
            if(loginname.length()==0) {
                loginname = null;
            }
        }
        this.loginname =  loginname;
        this.loginnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[登录名]
     */
    public String getLoginName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLoginName();
        }
        return this.loginname;
    }

    /**
     *  获取属性值[登录名]是否修改
     */
    public boolean isLoginNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLoginNameDirty();
        }
        return this.loginnameDirtyFlag;
    }

    /**
     *  重置属性值[登录名]
     */
    public void resetLoginName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLoginName();
            return;
        }

        this.loginnameDirtyFlag = false;
        this.loginname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        APIXTFJLJ.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(APIXTFJLJ et) {
        et.resetUKEY();
        et.resetCreateMan();
        et.resetCreateDate();
        et.resetUpdateMan();
        et.resetOrgSecUserId();
        et.resetUpdateDate();
        et.resetIP();
        et.resetApi_xt_fjljid();
        et.resetApi_xt_fjljname();
        et.resetLoginName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isUKEYDirty()) {
            params.put(FIELD_UKEY,getUKEY());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isOrgSecUserIdDirty()) {
            params.put(FIELD_ORGSECUSERID,getOrgSecUserId());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isIPDirty()) {
            params.put(FIELD_IP,getIP());
        }
        if(!bDirtyOnly || isApi_xt_fjljidDirty()) {
            params.put(FIELD_API_XT_FJLJID,getApi_xt_fjljid());
        }
        if(!bDirtyOnly || isApi_xt_fjljnameDirty()) {
            params.put(FIELD_API_XT_FJLJNAME,getApi_xt_fjljname());
        }
        if(!bDirtyOnly || isLoginNameDirty()) {
            params.put(FIELD_LOGINNAME,getLoginName());
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

        return  APIXTFJLJ.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(APIXTFJLJ et,int index) throws Exception {

        switch(index) {
        case INDEX_UKEY:
            return et.getUKEY();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_ORGSECUSERID:
            return et.getOrgSecUserId();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_IP:
            return et.getIP();
        case INDEX_API_XT_FJLJID:
            return et.getApi_xt_fjljid();
        case INDEX_API_XT_FJLJNAME:
            return et.getApi_xt_fjljname();
        case INDEX_LOGINNAME:
            return et.getLoginName();
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

        APIXTFJLJ.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(APIXTFJLJ et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_UKEY:
            et.setUKEY(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERID:
            et.setOrgSecUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_IP:
            et.setIP(DataObject.getStringValue(obj));
            return ;
        case INDEX_API_XT_FJLJID:
            et.setApi_xt_fjljid(DataObject.getStringValue(obj));
            return ;
        case INDEX_API_XT_FJLJNAME:
            et.setApi_xt_fjljname(DataObject.getStringValue(obj));
            return ;
        case INDEX_LOGINNAME:
            et.setLoginName(DataObject.getStringValue(obj));
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

        return  APIXTFJLJ.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(APIXTFJLJ et,int index) throws Exception {

        switch(index) {
        case INDEX_UKEY:
            return et.getUKEY()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_ORGSECUSERID:
            return et.getOrgSecUserId()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_IP:
            return et.getIP()==null;
        case INDEX_API_XT_FJLJID:
            return et.getApi_xt_fjljid()==null;
        case INDEX_API_XT_FJLJNAME:
            return et.getApi_xt_fjljname()==null;
        case INDEX_LOGINNAME:
            return et.getLoginName()==null;
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

        return  APIXTFJLJ.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(APIXTFJLJ et,int index) throws Exception {

        switch(index) {
        case INDEX_UKEY:
            return et.isUKEYDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_ORGSECUSERID:
            return et.isOrgSecUserIdDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_IP:
            return et.isIPDirty();
        case INDEX_API_XT_FJLJID:
            return et.isApi_xt_fjljidDirty();
        case INDEX_API_XT_FJLJNAME:
            return et.isApi_xt_fjljnameDirty();
        case INDEX_LOGINNAME:
            return et.isLoginNameDirty();
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
    private static  void fillJSONObject(APIXTFJLJ et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getUKEY()!=null) {
            JSONObjectHelper.put(json,"ukey",getJSONValue(et.getUKEY()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getOrgSecUserId()!=null) {
            JSONObjectHelper.put(json,"orgsecuserid",getJSONValue(et.getOrgSecUserId()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getIP()!=null) {
            JSONObjectHelper.put(json,"ip",getJSONValue(et.getIP()),false);
        }
        if(bIncEmpty||et.getApi_xt_fjljid()!=null) {
            JSONObjectHelper.put(json,"api_xt_fjljid",getJSONValue(et.getApi_xt_fjljid()),false);
        }
        if(bIncEmpty||et.getApi_xt_fjljname()!=null) {
            JSONObjectHelper.put(json,"api_xt_fjljname",getJSONValue(et.getApi_xt_fjljname()),false);
        }
        if(bIncEmpty||et.getLoginName()!=null) {
            JSONObjectHelper.put(json,"loginname",getJSONValue(et.getLoginName()),false);
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
    private static void fillXmlNode(APIXTFJLJ et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getUKEY()!=null) {
            Object obj = et.getUKEY();
            node.setAttribute("UKEY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserId()!=null) {
            Object obj = et.getOrgSecUserId();
            node.setAttribute("ORGSECUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getIP()!=null) {
            Object obj = et.getIP();
            node.setAttribute("IP",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getApi_xt_fjljid()!=null) {
            Object obj = et.getApi_xt_fjljid();
            node.setAttribute("API_XT_FJLJID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getApi_xt_fjljname()!=null) {
            Object obj = et.getApi_xt_fjljname();
            node.setAttribute("API_XT_FJLJNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLoginName()!=null) {
            Object obj = et.getLoginName();
            node.setAttribute("LOGINNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        APIXTFJLJ.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(APIXTFJLJ et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isUKEYDirty() && (bIncEmpty||et.getUKEY()!=null)) {
            dst.set(FIELD_UKEY,et.getUKEY());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isOrgSecUserIdDirty() && (bIncEmpty||et.getOrgSecUserId()!=null)) {
            dst.set(FIELD_ORGSECUSERID,et.getOrgSecUserId());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isIPDirty() && (bIncEmpty||et.getIP()!=null)) {
            dst.set(FIELD_IP,et.getIP());
        }
        if(et.isApi_xt_fjljidDirty() && (bIncEmpty||et.getApi_xt_fjljid()!=null)) {
            dst.set(FIELD_API_XT_FJLJID,et.getApi_xt_fjljid());
        }
        if(et.isApi_xt_fjljnameDirty() && (bIncEmpty||et.getApi_xt_fjljname()!=null)) {
            dst.set(FIELD_API_XT_FJLJNAME,et.getApi_xt_fjljname());
        }
        if(et.isLoginNameDirty() && (bIncEmpty||et.getLoginName()!=null)) {
            dst.set(FIELD_LOGINNAME,et.getLoginName());
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
        return  APIXTFJLJ.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(APIXTFJLJ et,int index) throws Exception {
        switch(index) {
        case INDEX_UKEY:
            et.resetUKEY();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_ORGSECUSERID:
            et.resetOrgSecUserId();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_IP:
            et.resetIP();
            return true;
        case INDEX_API_XT_FJLJID:
            et.resetApi_xt_fjljid();
            return true;
        case INDEX_API_XT_FJLJNAME:
            et.resetApi_xt_fjljname();
            return true;
        case INDEX_LOGINNAME:
            et.resetLoginName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private APIXTFJLJ getProxyEntity() {
        return this.proxyAPIXTFJLJ;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyAPIXTFJLJ = null;
        if(proxyDataObject!=null && proxyDataObject instanceof APIXTFJLJ) {
            this.proxyAPIXTFJLJ = (APIXTFJLJ)proxyDataObject;
        }

    }

}