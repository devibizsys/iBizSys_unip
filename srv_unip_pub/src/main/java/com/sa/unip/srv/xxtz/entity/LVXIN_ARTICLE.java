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
 * 实体[LVXIN_ARTICLE] 数据对象
 */
public class LVXIN_ARTICLE extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_ARTICLE.class);
    /**
     *   实体属性标识[圈子标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[作者账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[文章内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[图片信息(JSON格式)]
     */
    public final static String FIELD_THUMBNAIL = "THUMBNAIL";
    /**
     *   实体属性标识[暂未使用]
     */
    public final static String FIELD_LINK = "LINK";
    /**
     *   实体属性标识[分类]
     */
    public final static String FIELD_TYPE = "TYPE";
    /**
     *   实体属性标识[发布时间]
     */
    public final static String FIELD_TIMESTAP = "TIMESTAP";

    private final static int INDEX_GID = 0;
    private final static int INDEX_ACCOUNT = 1;
    private final static int INDEX_CONTENT = 2;
    private final static int INDEX_THUMBNAIL = 3;
    private final static int INDEX_LINK = 4;
    private final static int INDEX_TYPE = 5;
    private final static int INDEX_TIMESTAP = 6;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_THUMBNAIL, INDEX_THUMBNAIL);
        fieldIndexMap.put( FIELD_LINK, INDEX_LINK);
        fieldIndexMap.put( FIELD_TYPE, INDEX_TYPE);
        fieldIndexMap.put( FIELD_TIMESTAP, INDEX_TIMESTAP);
    }

    private LVXIN_ARTICLE proxyLVXIN_ARTICLE = null;

    public LVXIN_ARTICLE() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean accountDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean thumbnailDirtyFlag = false;
    private boolean linkDirtyFlag = false;
    private boolean typeDirtyFlag = false;
    private boolean timestapDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="account")
    private String account;
    @Column(name="content")
    private String content;
    @Column(name="thumbnail")
    private String thumbnail;
    @Column(name="link")
    private String link;
    @Column(name="type")
    private String type;
    @Column(name="timestap")
    private String timestap;


    /**
     *  设置属性值[圈子标识]
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
     *  获取属性值[圈子标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[圈子标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[圈子标识]
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
     *  设置属性值[文章内容]
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
     *  获取属性值[文章内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[文章内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[文章内容]
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
     *  设置属性值[图片信息(JSON格式)]
     *  @param thumbnail
     */
    public void setTHUMBNAIL(String thumbnail) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTHUMBNAIL(thumbnail);
            return;
        }
        if(thumbnail!=null) {
            thumbnail = StringHelper.trimRight(thumbnail);
            if(thumbnail.length()==0) {
                thumbnail = null;
            }
        }
        this.thumbnail =  thumbnail;
        this.thumbnailDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片信息(JSON格式)]
     */
    public String getTHUMBNAIL() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTHUMBNAIL();
        }
        return this.thumbnail;
    }

    /**
     *  获取属性值[图片信息(JSON格式)]是否修改
     */
    public boolean isTHUMBNAILDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTHUMBNAILDirty();
        }
        return this.thumbnailDirtyFlag;
    }

    /**
     *  重置属性值[图片信息(JSON格式)]
     */
    public void resetTHUMBNAIL() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTHUMBNAIL();
            return;
        }

        this.thumbnailDirtyFlag = false;
        this.thumbnail = null;
    }
    /**
     *  设置属性值[暂未使用]
     *  @param link
     */
    public void setLink(String link) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLink(link);
            return;
        }
        if(link!=null) {
            link = StringHelper.trimRight(link);
            if(link.length()==0) {
                link = null;
            }
        }
        this.link =  link;
        this.linkDirtyFlag  = true;
    }

    /**
     *  获取属性值[暂未使用]
     */
    public String getLink() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLink();
        }
        return this.link;
    }

    /**
     *  获取属性值[暂未使用]是否修改
     */
    public boolean isLinkDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLinkDirty();
        }
        return this.linkDirtyFlag;
    }

    /**
     *  重置属性值[暂未使用]
     */
    public void resetLink() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLink();
            return;
        }

        this.linkDirtyFlag = false;
        this.link = null;
    }
    /**
     *  设置属性值[分类]代码表：com.sa.unip.srv.codelist.TWLJFLCodeListModel
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
     *  获取属性值[分类]代码表：com.sa.unip.srv.codelist.TWLJFLCodeListModel
     */
    public String getType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getType();
        }
        return this.type;
    }

    /**
     *  获取属性值[分类]是否修改
     */
    public boolean isTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTypeDirty();
        }
        return this.typeDirtyFlag;
    }

    /**
     *  重置属性值[分类]
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
     *  @param timestap
     */
    public void setTimestap(String timestap) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTimestap(timestap);
            return;
        }
        if(timestap!=null) {
            timestap = StringHelper.trimRight(timestap);
            if(timestap.length()==0) {
                timestap = null;
            }
        }
        this.timestap =  timestap;
        this.timestapDirtyFlag  = true;
    }

    /**
     *  获取属性值[发布时间]
     */
    public String getTimestap() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTimestap();
        }
        return this.timestap;
    }

    /**
     *  获取属性值[发布时间]是否修改
     */
    public boolean isTimestapDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTimestapDirty();
        }
        return this.timestapDirtyFlag;
    }

    /**
     *  重置属性值[发布时间]
     */
    public void resetTimestap() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTimestap();
            return;
        }

        this.timestapDirtyFlag = false;
        this.timestap = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_ARTICLE.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_ARTICLE et) {
        et.resetGID();
        et.resetAccount();
        et.resetCONTENT();
        et.resetTHUMBNAIL();
        et.resetLink();
        et.resetType();
        et.resetTimestap();
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
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isTHUMBNAILDirty()) {
            params.put(FIELD_THUMBNAIL,getTHUMBNAIL());
        }
        if(!bDirtyOnly || isLinkDirty()) {
            params.put(FIELD_LINK,getLink());
        }
        if(!bDirtyOnly || isTypeDirty()) {
            params.put(FIELD_TYPE,getType());
        }
        if(!bDirtyOnly || isTimestapDirty()) {
            params.put(FIELD_TIMESTAP,getTimestap());
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

        return  LVXIN_ARTICLE.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_ARTICLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_THUMBNAIL:
            return et.getTHUMBNAIL();
        case INDEX_LINK:
            return et.getLink();
        case INDEX_TYPE:
            return et.getType();
        case INDEX_TIMESTAP:
            return et.getTimestap();
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

        LVXIN_ARTICLE.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_ARTICLE et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_THUMBNAIL:
            et.setTHUMBNAIL(DataObject.getStringValue(obj));
            return ;
        case INDEX_LINK:
            et.setLink(DataObject.getStringValue(obj));
            return ;
        case INDEX_TYPE:
            et.setType(DataObject.getStringValue(obj));
            return ;
        case INDEX_TIMESTAP:
            et.setTimestap(DataObject.getStringValue(obj));
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

        return  LVXIN_ARTICLE.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_ARTICLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_THUMBNAIL:
            return et.getTHUMBNAIL()==null;
        case INDEX_LINK:
            return et.getLink()==null;
        case INDEX_TYPE:
            return et.getType()==null;
        case INDEX_TIMESTAP:
            return et.getTimestap()==null;
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

        return  LVXIN_ARTICLE.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_ARTICLE et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_THUMBNAIL:
            return et.isTHUMBNAILDirty();
        case INDEX_LINK:
            return et.isLinkDirty();
        case INDEX_TYPE:
            return et.isTypeDirty();
        case INDEX_TIMESTAP:
            return et.isTimestapDirty();
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
    private static  void fillJSONObject(LVXIN_ARTICLE et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getTHUMBNAIL()!=null) {
            JSONObjectHelper.put(json,"thumbnail",getJSONValue(et.getTHUMBNAIL()),false);
        }
        if(bIncEmpty||et.getLink()!=null) {
            JSONObjectHelper.put(json,"link",getJSONValue(et.getLink()),false);
        }
        if(bIncEmpty||et.getType()!=null) {
            JSONObjectHelper.put(json,"type",getJSONValue(et.getType()),false);
        }
        if(bIncEmpty||et.getTimestap()!=null) {
            JSONObjectHelper.put(json,"timestap",getJSONValue(et.getTimestap()),false);
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
    private static void fillXmlNode(LVXIN_ARTICLE et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTHUMBNAIL()!=null) {
            Object obj = et.getTHUMBNAIL();
            node.setAttribute("THUMBNAIL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLink()!=null) {
            Object obj = et.getLink();
            node.setAttribute("LINK",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getType()!=null) {
            Object obj = et.getType();
            node.setAttribute("TYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTimestap()!=null) {
            Object obj = et.getTimestap();
            node.setAttribute("TIMESTAP",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_ARTICLE.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_ARTICLE et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isTHUMBNAILDirty() && (bIncEmpty||et.getTHUMBNAIL()!=null)) {
            dst.set(FIELD_THUMBNAIL,et.getTHUMBNAIL());
        }
        if(et.isLinkDirty() && (bIncEmpty||et.getLink()!=null)) {
            dst.set(FIELD_LINK,et.getLink());
        }
        if(et.isTypeDirty() && (bIncEmpty||et.getType()!=null)) {
            dst.set(FIELD_TYPE,et.getType());
        }
        if(et.isTimestapDirty() && (bIncEmpty||et.getTimestap()!=null)) {
            dst.set(FIELD_TIMESTAP,et.getTimestap());
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
        return  LVXIN_ARTICLE.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_ARTICLE et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_THUMBNAIL:
            et.resetTHUMBNAIL();
            return true;
        case INDEX_LINK:
            et.resetLink();
            return true;
        case INDEX_TYPE:
            et.resetType();
            return true;
        case INDEX_TIMESTAP:
            et.resetTimestap();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_ARTICLE getProxyEntity() {
        return this.proxyLVXIN_ARTICLE;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_ARTICLE = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_ARTICLE) {
            this.proxyLVXIN_ARTICLE = (LVXIN_ARTICLE)proxyDataObject;
        }

    }

}