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
 * 实体[LVXIN_COMMENT] 数据对象
 */
public class LVXIN_COMMENT extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_COMMENT.class);
    /**
     *   实体属性标识[评论标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[作者账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[文章ID]
     */
    public final static String FIELD_ARTICLEID = "ARTICLEID";
    /**
     *   实体属性标识[评伦内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[分类（圈子或其他）]
     */
    public final static String FIELD_TYPE = "TYPE";
    /**
     *   实体属性标识[发布时间]
     */
    public final static String FIELD_TIMESTAMP = "TIMESTAMP";

    private final static int INDEX_GID = 0;
    private final static int INDEX_ACCOUNT = 1;
    private final static int INDEX_ARTICLEID = 2;
    private final static int INDEX_CONTENT = 3;
    private final static int INDEX_TYPE = 4;
    private final static int INDEX_TIMESTAMP = 5;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_ARTICLEID, INDEX_ARTICLEID);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_TYPE, INDEX_TYPE);
        fieldIndexMap.put( FIELD_TIMESTAMP, INDEX_TIMESTAMP);
    }

    private LVXIN_COMMENT proxyLVXIN_COMMENT = null;

    public LVXIN_COMMENT() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean accountDirtyFlag = false;
    private boolean articleidDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean typeDirtyFlag = false;
    private boolean timestampDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="account")
    private String account;
    @Column(name="articleid")
    private String articleid;
    @Column(name="content")
    private String content;
    @Column(name="type")
    private String type;
    @Column(name="timestamp")
    private String timestamp;


    /**
     *  设置属性值[评论标识]
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
     *  获取属性值[评论标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[评论标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[评论标识]
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
     *  设置属性值[作者账号]
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
     *  获取属性值[作者账号]
     */
    public String getAccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAccount();
        }
        return this.account;
    }

    /**
     *  获取属性值[作者账号]是否修改
     */
    public boolean isAccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAccountDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[作者账号]
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
     *  设置属性值[文章ID]
     *  @param articleid
     */
    public void setArticleid(String articleid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setArticleid(articleid);
            return;
        }
        if(articleid!=null) {
            articleid = StringHelper.trimRight(articleid);
            if(articleid.length()==0) {
                articleid = null;
            }
        }
        this.articleid =  articleid;
        this.articleidDirtyFlag  = true;
    }

    /**
     *  获取属性值[文章ID]
     */
    public String getArticleid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getArticleid();
        }
        return this.articleid;
    }

    /**
     *  获取属性值[文章ID]是否修改
     */
    public boolean isArticleidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isArticleidDirty();
        }
        return this.articleidDirtyFlag;
    }

    /**
     *  重置属性值[文章ID]
     */
    public void resetArticleid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetArticleid();
            return;
        }

        this.articleidDirtyFlag = false;
        this.articleid = null;
    }
    /**
     *  设置属性值[评伦内容]
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
     *  获取属性值[评伦内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[评伦内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[评伦内容]
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
     *  设置属性值[分类（圈子或其他）]
     *  @param type
     */
    public void setType(String type) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setType(type);
            return;
        }
        if(type!=null) {
            type = StringHelper.trimRight(type);
            if(type.length()==0) {
                type = null;
            }
        }
        this.type =  type;
        this.typeDirtyFlag  = true;
    }

    /**
     *  获取属性值[分类（圈子或其他）]
     */
    public String getType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getType();
        }
        return this.type;
    }

    /**
     *  获取属性值[分类（圈子或其他）]是否修改
     */
    public boolean isTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTypeDirty();
        }
        return this.typeDirtyFlag;
    }

    /**
     *  重置属性值[分类（圈子或其他）]
     */
    public void resetType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetType();
            return;
        }

        this.typeDirtyFlag = false;
        this.type = null;
    }
    /**
     *  设置属性值[发布时间]
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
     *  获取属性值[发布时间]
     */
    public String getTimestamp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTimestamp();
        }
        return this.timestamp;
    }

    /**
     *  获取属性值[发布时间]是否修改
     */
    public boolean isTimestampDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTimestampDirty();
        }
        return this.timestampDirtyFlag;
    }

    /**
     *  重置属性值[发布时间]
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
        LVXIN_COMMENT.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_COMMENT et) {
        et.resetGID();
        et.resetAccount();
        et.resetArticleid();
        et.resetCONTENT();
        et.resetType();
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
        if(!bDirtyOnly || isArticleidDirty()) {
            params.put(FIELD_ARTICLEID,getArticleid());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isTypeDirty()) {
            params.put(FIELD_TYPE,getType());
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

        return  LVXIN_COMMENT.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_COMMENT et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_ARTICLEID:
            return et.getArticleid();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_TYPE:
            return et.getType();
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

        LVXIN_COMMENT.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_COMMENT et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_ARTICLEID:
            et.setArticleid(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_TYPE:
            et.setType(DataObject.getStringValue(obj));
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

        return  LVXIN_COMMENT.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_COMMENT et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_ARTICLEID:
            return et.getArticleid()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_TYPE:
            return et.getType()==null;
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

        return  LVXIN_COMMENT.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_COMMENT et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_ARTICLEID:
            return et.isArticleidDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_TYPE:
            return et.isTypeDirty();
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
    private static  void fillJSONObject(LVXIN_COMMENT et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getArticleid()!=null) {
            JSONObjectHelper.put(json,"articleid",getJSONValue(et.getArticleid()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getType()!=null) {
            JSONObjectHelper.put(json,"type",getJSONValue(et.getType()),false);
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
    private static void fillXmlNode(LVXIN_COMMENT et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getArticleid()!=null) {
            Object obj = et.getArticleid();
            node.setAttribute("ARTICLEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getType()!=null) {
            Object obj = et.getType();
            node.setAttribute("TYPE",(obj==null)?"":(String)obj);
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
        LVXIN_COMMENT.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_COMMENT et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isArticleidDirty() && (bIncEmpty||et.getArticleid()!=null)) {
            dst.set(FIELD_ARTICLEID,et.getArticleid());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isTypeDirty() && (bIncEmpty||et.getType()!=null)) {
            dst.set(FIELD_TYPE,et.getType());
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
        return  LVXIN_COMMENT.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_COMMENT et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_ARTICLEID:
            et.resetArticleid();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_TYPE:
            et.resetType();
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
    private LVXIN_COMMENT getProxyEntity() {
        return this.proxyLVXIN_COMMENT;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_COMMENT = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_COMMENT) {
            this.proxyLVXIN_COMMENT = (LVXIN_COMMENT)proxyDataObject;
        }

    }

}