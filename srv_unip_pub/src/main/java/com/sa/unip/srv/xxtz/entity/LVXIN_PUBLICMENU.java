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
 * 实体[LVXIN_PUBLICMENU] 数据对象
 */
public class LVXIN_PUBLICMENU extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_PUBLICMENU.class);
    /**
     *   实体属性标识[公众号菜单标识]
     */
    public final static String FIELD_GID = "GID";
    /**
     *   实体属性标识[公众账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[父菜单ID]
     */
    public final static String FIELD_FID = "FID";
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[菜单]
     */
    public final static String FIELD_CODE = "CODE";
    /**
     *   实体属性标识[类型]
     */
    public final static String FIELD_TYPE = "TYPE";
    /**
     *   实体属性标识[链接地址]
     */
    public final static String FIELD_LINK = "LINK";
    /**
     *   实体属性标识[文字内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[排序]
     */
    public final static String FIELD_SORT = "SORT";

    private final static int INDEX_GID = 0;
    private final static int INDEX_ACCOUNT = 1;
    private final static int INDEX_FID = 2;
    private final static int INDEX_NAME = 3;
    private final static int INDEX_CODE = 4;
    private final static int INDEX_TYPE = 5;
    private final static int INDEX_LINK = 6;
    private final static int INDEX_CONTENT = 7;
    private final static int INDEX_SORT = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GID, INDEX_GID);
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_FID, INDEX_FID);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_CODE, INDEX_CODE);
        fieldIndexMap.put( FIELD_TYPE, INDEX_TYPE);
        fieldIndexMap.put( FIELD_LINK, INDEX_LINK);
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_SORT, INDEX_SORT);
    }

    private LVXIN_PUBLICMENU proxyLVXIN_PUBLICMENU = null;

    public LVXIN_PUBLICMENU() {
        super();
    }
    private boolean gidDirtyFlag = false;
    private boolean accountDirtyFlag = false;
    private boolean fidDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean codeDirtyFlag = false;
    private boolean typeDirtyFlag = false;
    private boolean linkDirtyFlag = false;
    private boolean contentDirtyFlag = false;
    private boolean sortDirtyFlag = false;

    @Column(name="gid")
    private String gid;
    @Column(name="account")
    private String account;
    @Column(name="fid")
    private String fid;
    @Column(name="name")
    private String name;
    @Column(name="code")
    private String code;
    @Column(name="type")
    private String type;
    @Column(name="link")
    private String link;
    @Column(name="content")
    private String content;
    @Column(name="sort")
    private Integer sort;


    /**
     *  设置属性值[公众号菜单标识]
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
     *  获取属性值[公众号菜单标识]
     */
    public String getGID() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGID();
        }
        return this.gid;
    }

    /**
     *  获取属性值[公众号菜单标识]是否修改
     */
    public boolean isGIDDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGIDDirty();
        }
        return this.gidDirtyFlag;
    }

    /**
     *  重置属性值[公众号菜单标识]
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
     *  设置属性值[公众账号]
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
     *  获取属性值[公众账号]
     */
    public String getAccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAccount();
        }
        return this.account;
    }

    /**
     *  获取属性值[公众账号]是否修改
     */
    public boolean isAccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAccountDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[公众账号]
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
     *  设置属性值[父菜单ID]
     *  @param fid
     */
    public void setFid(String fid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFid(fid);
            return;
        }
        if(fid!=null) {
            fid = StringHelper.trimRight(fid);
            if(fid.length()==0) {
                fid = null;
            }
        }
        this.fid =  fid;
        this.fidDirtyFlag  = true;
    }

    /**
     *  获取属性值[父菜单ID]
     */
    public String getFid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFid();
        }
        return this.fid;
    }

    /**
     *  获取属性值[父菜单ID]是否修改
     */
    public boolean isFidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFidDirty();
        }
        return this.fidDirtyFlag;
    }

    /**
     *  重置属性值[父菜单ID]
     */
    public void resetFid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFid();
            return;
        }

        this.fidDirtyFlag = false;
        this.fid = null;
    }
    /**
     *  设置属性值[名称]
     *  @param name
     */
    public void setNAME(String name) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setNAME(name);
            return;
        }
        if(name!=null) {
            name = StringHelper.trimRight(name);
            if(name.length()==0) {
                name = null;
            }
        }
        this.name =  name;
        this.nameDirtyFlag  = true;
    }

    /**
     *  获取属性值[名称]
     */
    public String getNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNAME();
        }
        return this.name;
    }

    /**
     *  获取属性值[名称]是否修改
     */
    public boolean isNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNAMEDirty();
        }
        return this.nameDirtyFlag;
    }

    /**
     *  重置属性值[名称]
     */
    public void resetNAME() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetNAME();
            return;
        }

        this.nameDirtyFlag = false;
        this.name = null;
    }
    /**
     *  设置属性值[菜单]
     *  @param code
     */
    public void setCODE(String code) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCODE(code);
            return;
        }
        if(code!=null) {
            code = StringHelper.trimRight(code);
            if(code.length()==0) {
                code = null;
            }
        }
        this.code =  code;
        this.codeDirtyFlag  = true;
    }

    /**
     *  获取属性值[菜单]
     */
    public String getCODE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCODE();
        }
        return this.code;
    }

    /**
     *  获取属性值[菜单]是否修改
     */
    public boolean isCODEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCODEDirty();
        }
        return this.codeDirtyFlag;
    }

    /**
     *  重置属性值[菜单]
     */
    public void resetCODE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCODE();
            return;
        }

        this.codeDirtyFlag = false;
        this.code = null;
    }
    /**
     *  设置属性值[类型]代码表：com.sa.unip.srv.codelist.CDLXCodeListModel
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
     *  获取属性值[类型]代码表：com.sa.unip.srv.codelist.CDLXCodeListModel
     */
    public String getType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getType();
        }
        return this.type;
    }

    /**
     *  获取属性值[类型]是否修改
     */
    public boolean isTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTypeDirty();
        }
        return this.typeDirtyFlag;
    }

    /**
     *  重置属性值[类型]
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
     *  设置属性值[链接地址]
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
     *  获取属性值[链接地址]
     */
    public String getLink() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLink();
        }
        return this.link;
    }

    /**
     *  获取属性值[链接地址]是否修改
     */
    public boolean isLinkDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLinkDirty();
        }
        return this.linkDirtyFlag;
    }

    /**
     *  重置属性值[链接地址]
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
     *  设置属性值[文字内容]
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
     *  获取属性值[文字内容]
     */
    public String getCONTENT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCONTENT();
        }
        return this.content;
    }

    /**
     *  获取属性值[文字内容]是否修改
     */
    public boolean isCONTENTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCONTENTDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[文字内容]
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
     *  设置属性值[排序]
     *  @param sort
     */
    public void setSort(Integer sort) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSort(sort);
            return;
        }
        this.sort =  sort;
        this.sortDirtyFlag  = true;
    }

    /**
     *  获取属性值[排序]
     */
    public Integer getSort() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSort();
        }
        return this.sort;
    }

    /**
     *  获取属性值[排序]是否修改
     */
    public boolean isSortDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSortDirty();
        }
        return this.sortDirtyFlag;
    }

    /**
     *  重置属性值[排序]
     */
    public void resetSort() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSort();
            return;
        }

        this.sortDirtyFlag = false;
        this.sort = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_PUBLICMENU.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_PUBLICMENU et) {
        et.resetGID();
        et.resetAccount();
        et.resetFid();
        et.resetNAME();
        et.resetCODE();
        et.resetType();
        et.resetLink();
        et.resetCONTENT();
        et.resetSort();
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
        if(!bDirtyOnly || isFidDirty()) {
            params.put(FIELD_FID,getFid());
        }
        if(!bDirtyOnly || isNAMEDirty()) {
            params.put(FIELD_NAME,getNAME());
        }
        if(!bDirtyOnly || isCODEDirty()) {
            params.put(FIELD_CODE,getCODE());
        }
        if(!bDirtyOnly || isTypeDirty()) {
            params.put(FIELD_TYPE,getType());
        }
        if(!bDirtyOnly || isLinkDirty()) {
            params.put(FIELD_LINK,getLink());
        }
        if(!bDirtyOnly || isCONTENTDirty()) {
            params.put(FIELD_CONTENT,getCONTENT());
        }
        if(!bDirtyOnly || isSortDirty()) {
            params.put(FIELD_SORT,getSort());
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

        return  LVXIN_PUBLICMENU.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_PUBLICMENU et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID();
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_FID:
            return et.getFid();
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_CODE:
            return et.getCODE();
        case INDEX_TYPE:
            return et.getType();
        case INDEX_LINK:
            return et.getLink();
        case INDEX_CONTENT:
            return et.getCONTENT();
        case INDEX_SORT:
            return et.getSort();
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

        LVXIN_PUBLICMENU.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_PUBLICMENU et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.setGID(DataObject.getStringValue(obj));
            return ;
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_FID:
            et.setFid(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_CODE:
            et.setCODE(DataObject.getStringValue(obj));
            return ;
        case INDEX_TYPE:
            et.setType(DataObject.getStringValue(obj));
            return ;
        case INDEX_LINK:
            et.setLink(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENT:
            et.setCONTENT(DataObject.getStringValue(obj));
            return ;
        case INDEX_SORT:
            et.setSort(DataObject.getIntegerValue(obj));
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

        return  LVXIN_PUBLICMENU.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_PUBLICMENU et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.getGID()==null;
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_FID:
            return et.getFid()==null;
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_CODE:
            return et.getCODE()==null;
        case INDEX_TYPE:
            return et.getType()==null;
        case INDEX_LINK:
            return et.getLink()==null;
        case INDEX_CONTENT:
            return et.getCONTENT()==null;
        case INDEX_SORT:
            return et.getSort()==null;
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

        return  LVXIN_PUBLICMENU.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_PUBLICMENU et,int index) throws Exception {

        switch(index) {
        case INDEX_GID:
            return et.isGIDDirty();
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_FID:
            return et.isFidDirty();
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_CODE:
            return et.isCODEDirty();
        case INDEX_TYPE:
            return et.isTypeDirty();
        case INDEX_LINK:
            return et.isLinkDirty();
        case INDEX_CONTENT:
            return et.isCONTENTDirty();
        case INDEX_SORT:
            return et.isSortDirty();
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
    private static  void fillJSONObject(LVXIN_PUBLICMENU et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            JSONObjectHelper.put(json,"gid",getJSONValue(et.getGID()),false);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getFid()!=null) {
            JSONObjectHelper.put(json,"fid",getJSONValue(et.getFid()),false);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getCODE()!=null) {
            JSONObjectHelper.put(json,"code",getJSONValue(et.getCODE()),false);
        }
        if(bIncEmpty||et.getType()!=null) {
            JSONObjectHelper.put(json,"type",getJSONValue(et.getType()),false);
        }
        if(bIncEmpty||et.getLink()!=null) {
            JSONObjectHelper.put(json,"link",getJSONValue(et.getLink()),false);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            JSONObjectHelper.put(json,"content",getJSONValue(et.getCONTENT()),false);
        }
        if(bIncEmpty||et.getSort()!=null) {
            JSONObjectHelper.put(json,"sort",getJSONValue(et.getSort()),false);
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
    private static void fillXmlNode(LVXIN_PUBLICMENU et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGID()!=null) {
            Object obj = et.getGID();
            node.setAttribute("GID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFid()!=null) {
            Object obj = et.getFid();
            node.setAttribute("FID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCODE()!=null) {
            Object obj = et.getCODE();
            node.setAttribute("CODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getType()!=null) {
            Object obj = et.getType();
            node.setAttribute("TYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLink()!=null) {
            Object obj = et.getLink();
            node.setAttribute("LINK",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCONTENT()!=null) {
            Object obj = et.getCONTENT();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSort()!=null) {
            Object obj = et.getSort();
            node.setAttribute("SORT",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_PUBLICMENU.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_PUBLICMENU et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGIDDirty() && (bIncEmpty||et.getGID()!=null)) {
            dst.set(FIELD_GID,et.getGID());
        }
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isFidDirty() && (bIncEmpty||et.getFid()!=null)) {
            dst.set(FIELD_FID,et.getFid());
        }
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isCODEDirty() && (bIncEmpty||et.getCODE()!=null)) {
            dst.set(FIELD_CODE,et.getCODE());
        }
        if(et.isTypeDirty() && (bIncEmpty||et.getType()!=null)) {
            dst.set(FIELD_TYPE,et.getType());
        }
        if(et.isLinkDirty() && (bIncEmpty||et.getLink()!=null)) {
            dst.set(FIELD_LINK,et.getLink());
        }
        if(et.isCONTENTDirty() && (bIncEmpty||et.getCONTENT()!=null)) {
            dst.set(FIELD_CONTENT,et.getCONTENT());
        }
        if(et.isSortDirty() && (bIncEmpty||et.getSort()!=null)) {
            dst.set(FIELD_SORT,et.getSort());
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
        return  LVXIN_PUBLICMENU.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_PUBLICMENU et,int index) throws Exception {
        switch(index) {
        case INDEX_GID:
            et.resetGID();
            return true;
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_FID:
            et.resetFid();
            return true;
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_CODE:
            et.resetCODE();
            return true;
        case INDEX_TYPE:
            et.resetType();
            return true;
        case INDEX_LINK:
            et.resetLink();
            return true;
        case INDEX_CONTENT:
            et.resetCONTENT();
            return true;
        case INDEX_SORT:
            et.resetSort();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_PUBLICMENU getProxyEntity() {
        return this.proxyLVXIN_PUBLICMENU;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_PUBLICMENU = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_PUBLICMENU) {
            this.proxyLVXIN_PUBLICMENU = (LVXIN_PUBLICMENU)proxyDataObject;
        }

    }

}