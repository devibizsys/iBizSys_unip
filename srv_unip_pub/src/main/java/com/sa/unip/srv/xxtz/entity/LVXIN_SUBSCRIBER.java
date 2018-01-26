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
 * 实体[LVXIN_SUBSCRIBER] 数据对象
 */
public class LVXIN_SUBSCRIBER extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_SUBSCRIBER.class);
    /**
     *   实体属性标识[订阅关系标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[用户账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[公众账号]
     */
    public final static String FIELD_PUBLICACCOUNT = "PUBLICACCOUNT";
    /**
     *   实体属性标识[关注时间]
     */
    public final static String FIELD_TIMESTAMP = "TIMESTAMP";

    private final static int INDEX_GID = 0;
    private final static int INDEX_ACCOUNT = 1;
    private final static int INDEX_PUBLICACCOUNT = 2;
    private final static int INDEX_TIMESTAMP = 3;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_PUBLICACCOUNT, INDEX_PUBLICACCOUNT);
        fieldIndexMap.put( FIELD_TIMESTAMP, INDEX_TIMESTAMP);
    }

    private LVXIN_SUBSCRIBER proxyLVXIN_SUBSCRIBER = null;

    public LVXIN_SUBSCRIBER() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean accountDirtyFlag = false;
    private boolean publicaccountDirtyFlag = false;
    private boolean timestampDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="account")
    private String account;
    @Column(name="publicaccount")
    private String publicaccount;
    @Column(name="timestamp")
    private String timestamp;


    /**
     *  设置属性值[订阅关系标识]
     *  @param gid
     */
    public void setGID(String gid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGID(gid);
            return;
        }
        if(gid!=null) {
            gid = StringHelper.trimRight(gid);
            if(gid.length()==0) {
                gid = null;
            }
        }
        this.gid =  gid;
        this.gidDirtyFlag  = true;
    }

    /**
     *  获取属性值[订阅关系标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[订阅关系标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[订阅关系标识]
     */
    public void resetGID() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGID();
            return;
        }

        this.gidDirtyFlag = false;
        this.gid = null;
    }
    /**
     *  设置属性值[用户账号]
     *  @param account
     */
    public void setAccount(String account) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setAccount(account);
            return;
        }
        if(account!=null) {
            account = StringHelper.trimRight(account);
            if(account.length()==0) {
                account = null;
            }
        }
        this.account =  account;
        this.accountDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户账号]
     */
    public String getAccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAccount();
        }
        return this.account;
    }

    /**
     *  获取属性值[用户账号]是否修改
     */
    public boolean isAccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAccountDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[用户账号]
     */
    public void resetAccount() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetAccount();
            return;
        }

        this.accountDirtyFlag = false;
        this.account = null;
    }
    /**
     *  设置属性值[公众账号]
     *  @param publicaccount
     */
    public void setPublicaccount(String publicaccount) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPublicaccount(publicaccount);
            return;
        }
        if(publicaccount!=null) {
            publicaccount = StringHelper.trimRight(publicaccount);
            if(publicaccount.length()==0) {
                publicaccount = null;
            }
        }
        this.publicaccount =  publicaccount;
        this.publicaccountDirtyFlag  = true;
    }

    /**
     *  获取属性值[公众账号]
     */
    public String getPublicaccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPublicaccount();
        }
        return this.publicaccount;
    }

    /**
     *  获取属性值[公众账号]是否修改
     */
    public boolean isPublicaccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPublicaccountDirty();
        }
        return this.publicaccountDirtyFlag;
    }

    /**
     *  重置属性值[公众账号]
     */
    public void resetPublicaccount() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPublicaccount();
            return;
        }

        this.publicaccountDirtyFlag = false;
        this.publicaccount = null;
    }
    /**
     *  设置属性值[关注时间]
     *  @param timestamp
     */
    public void setTimestamp(String timestamp) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTimestamp(timestamp);
            return;
        }
        if(timestamp!=null) {
            timestamp = StringHelper.trimRight(timestamp);
            if(timestamp.length()==0) {
                timestamp = null;
            }
        }
        this.timestamp =  timestamp;
        this.timestampDirtyFlag  = true;
    }

    /**
     *  获取属性值[关注时间]
     */
    public String getTimestamp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTimestamp();
        }
        return this.timestamp;
    }

    /**
     *  获取属性值[关注时间]是否修改
     */
    public boolean isTimestampDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTimestampDirty();
        }
        return this.timestampDirtyFlag;
    }

    /**
     *  重置属性值[关注时间]
     */
    public void resetTimestamp() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTimestamp();
            return;
        }

        this.timestampDirtyFlag = false;
        this.timestamp = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_SUBSCRIBER.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_SUBSCRIBER et) {
        et.resetGID();
        et.resetAccount();
        et.resetPublicaccount();
        et.resetTimestamp();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGIDDirty()) {
            params.put(FIELD_GID,getGID());
        }
        if(!bDirtyOnly || isAccountDirty()) {
            params.put(FIELD_ACCOUNT,getAccount());
        }
        if(!bDirtyOnly || isPublicaccountDirty()) {
            params.put(FIELD_PUBLICACCOUNT,getPublicaccount());
        }
        if(!bDirtyOnly || isTimestampDirty()) {
            params.put(FIELD_TIMESTAMP,getTimestamp());
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

        return  LVXIN_SUBSCRIBER.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_SUBSCRIBER et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_PUBLICACCOUNT:
            return et.getPublicaccount();
        case INDEX_TIMESTAMP:
            return et.getTimestamp();
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

        LVXIN_SUBSCRIBER.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_SUBSCRIBER et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_PUBLICACCOUNT:
            et.setPublicaccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_TIMESTAMP:
            et.setTimestamp(DataObject.getStringValue(obj));
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

        return  LVXIN_SUBSCRIBER.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_SUBSCRIBER et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_PUBLICACCOUNT:
            return et.getPublicaccount()==null;
        case INDEX_TIMESTAMP:
            return et.getTimestamp()==null;
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

        return  LVXIN_SUBSCRIBER.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_SUBSCRIBER et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_PUBLICACCOUNT:
            return et.isPublicaccountDirty();
        case INDEX_TIMESTAMP:
            return et.isTimestampDirty();
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
    private static  void fillJSONObject(LVXIN_SUBSCRIBER et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getPublicaccount()!=null) {
            JSONObjectHelper.put(json,"publicaccount",getJSONValue(et.getPublicaccount()),false);
        }
        if(bIncEmpty||et.getTimestamp()!=null) {
            JSONObjectHelper.put(json,"timestamp",getJSONValue(et.getTimestamp()),false);
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
    private static void fillXmlNode(LVXIN_SUBSCRIBER et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPublicaccount()!=null) {
            Object obj = et.getPublicaccount();
            node.setAttribute("PUBLICACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTimestamp()!=null) {
            Object obj = et.getTimestamp();
            node.setAttribute("TIMESTAMP",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_SUBSCRIBER.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_SUBSCRIBER et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isPublicaccountDirty() && (bIncEmpty||et.getPublicaccount()!=null)) {
            dst.set(FIELD_PUBLICACCOUNT,et.getPublicaccount());
        }
        if(et.isTimestampDirty() && (bIncEmpty||et.getTimestamp()!=null)) {
            dst.set(FIELD_TIMESTAMP,et.getTimestamp());
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
        return  LVXIN_SUBSCRIBER.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_SUBSCRIBER et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_PUBLICACCOUNT:
            et.resetPublicaccount();
            return true;
        case INDEX_TIMESTAMP:
            et.resetTimestamp();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_SUBSCRIBER getProxyEntity() {
        return this.proxyLVXIN_SUBSCRIBER;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_SUBSCRIBER = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_SUBSCRIBER) {
            this.proxyLVXIN_SUBSCRIBER = (LVXIN_SUBSCRIBER)proxyDataObject;
        }

    }

}