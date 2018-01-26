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
 * 实体[LVXIN_GROUP] 数据对象
 */
public class LVXIN_GROUP extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_GROUP.class);
    /**
     *   实体属性标识[群组标识]
     */
    public final static String FIELD_GROUPID = "GROUPID";
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[群组简介]
     */
    public final static String FIELD_SUMMARY = "SUMMARY";
    /**
     *   实体属性标识[分类（暂未使用）]
     */
    public final static String FIELD_CATEGORY = "CATEGORY";
    /**
     *   实体属性标识[创建者用户账号（account）]
     */
    public final static String FIELD_FOUNDER = "FOUNDER";

    private final static int INDEX_GROUPID = 0;
    private final static int INDEX_NAME = 1;
    private final static int INDEX_SUMMARY = 2;
    private final static int INDEX_CATEGORY = 3;
    private final static int INDEX_FOUNDER = 4;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_GROUPID, INDEX_GROUPID);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_SUMMARY, INDEX_SUMMARY);
        fieldIndexMap.put( FIELD_CATEGORY, INDEX_CATEGORY);
        fieldIndexMap.put( FIELD_FOUNDER, INDEX_FOUNDER);
    }

    private LVXIN_GROUP proxyLVXIN_GROUP = null;

    public LVXIN_GROUP() {
        super();
    }
    private boolean groupidDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean summaryDirtyFlag = false;
    private boolean categoryDirtyFlag = false;
    private boolean founderDirtyFlag = false;

    @Column(name="groupid")
    private String groupid;
    @Column(name="name")
    private String name;
    @Column(name="summary")
    private String summary;
    @Column(name="category")
    private String category;
    @Column(name="founder")
    private String founder;


    /**
     *  设置属性值[群组标识]
     *  @param groupid
     */
    public void setGroupid(String groupid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGroupid(groupid);
            return;
        }
        if(groupid!=null) {
            groupid = StringHelper.trimRight(groupid);
            if(groupid.length()==0) {
                groupid = null;
            }
        }
        this.groupid =  groupid;
        this.groupidDirtyFlag  = true;
    }

    /**
     *  获取属性值[群组标识]
     */
    public String getGroupid() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGroupid();
        }
        return this.groupid;
    }

    /**
     *  获取属性值[群组标识]是否修改
     */
    public boolean isGroupidDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGroupidDirty();
        }
        return this.groupidDirtyFlag;
    }

    /**
     *  重置属性值[群组标识]
     */
    public void resetGroupid() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGroupid();
            return;
        }

        this.groupidDirtyFlag = false;
        this.groupid = null;
    }
    /**
     *  设置属性值[名称]
     *  @param name
     */
    public void setName(String name) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setName(name);
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
    public String getName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getName();
        }
        return this.name;
    }

    /**
     *  获取属性值[名称]是否修改
     */
    public boolean isNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNameDirty();
        }
        return this.nameDirtyFlag;
    }

    /**
     *  重置属性值[名称]
     */
    public void resetName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetName();
            return;
        }

        this.nameDirtyFlag = false;
        this.name = null;
    }
    /**
     *  设置属性值[群组简介]
     *  @param summary
     */
    public void setSummary(String summary) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSummary(summary);
            return;
        }
        if(summary!=null) {
            summary = StringHelper.trimRight(summary);
            if(summary.length()==0) {
                summary = null;
            }
        }
        this.summary =  summary;
        this.summaryDirtyFlag  = true;
    }

    /**
     *  获取属性值[群组简介]
     */
    public String getSummary() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSummary();
        }
        return this.summary;
    }

    /**
     *  获取属性值[群组简介]是否修改
     */
    public boolean isSummaryDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSummaryDirty();
        }
        return this.summaryDirtyFlag;
    }

    /**
     *  重置属性值[群组简介]
     */
    public void resetSummary() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSummary();
            return;
        }

        this.summaryDirtyFlag = false;
        this.summary = null;
    }
    /**
     *  设置属性值[分类（暂未使用）]
     *  @param category
     */
    public void setCategory(String category) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCategory(category);
            return;
        }
        if(category!=null) {
            category = StringHelper.trimRight(category);
            if(category.length()==0) {
                category = null;
            }
        }
        this.category =  category;
        this.categoryDirtyFlag  = true;
    }

    /**
     *  获取属性值[分类（暂未使用）]
     */
    public String getCategory() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCategory();
        }
        return this.category;
    }

    /**
     *  获取属性值[分类（暂未使用）]是否修改
     */
    public boolean isCategoryDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCategoryDirty();
        }
        return this.categoryDirtyFlag;
    }

    /**
     *  重置属性值[分类（暂未使用）]
     */
    public void resetCategory() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCategory();
            return;
        }

        this.categoryDirtyFlag = false;
        this.category = null;
    }
    /**
     *  设置属性值[创建者用户账号（account）]
     *  @param founder
     */
    public void setFounder(String founder) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFounder(founder);
            return;
        }
        if(founder!=null) {
            founder = StringHelper.trimRight(founder);
            if(founder.length()==0) {
                founder = null;
            }
        }
        this.founder =  founder;
        this.founderDirtyFlag  = true;
    }

    /**
     *  获取属性值[创建者用户账号（account）]
     */
    public String getFounder() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFounder();
        }
        return this.founder;
    }

    /**
     *  获取属性值[创建者用户账号（account）]是否修改
     */
    public boolean isFounderDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFounderDirty();
        }
        return this.founderDirtyFlag;
    }

    /**
     *  重置属性值[创建者用户账号（account）]
     */
    public void resetFounder() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFounder();
            return;
        }

        this.founderDirtyFlag = false;
        this.founder = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_GROUP.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_GROUP et) {
        et.resetGroupid();
        et.resetName();
        et.resetSummary();
        et.resetCategory();
        et.resetFounder();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isGroupidDirty()) {
            params.put(FIELD_GROUPID,getGroupid());
        }
        if(!bDirtyOnly || isNameDirty()) {
            params.put(FIELD_NAME,getName());
        }
        if(!bDirtyOnly || isSummaryDirty()) {
            params.put(FIELD_SUMMARY,getSummary());
        }
        if(!bDirtyOnly || isCategoryDirty()) {
            params.put(FIELD_CATEGORY,getCategory());
        }
        if(!bDirtyOnly || isFounderDirty()) {
            params.put(FIELD_FOUNDER,getFounder());
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

        return  LVXIN_GROUP.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_GROUP et,int index) throws Exception {

        switch(index) {
        case INDEX_GROUPID:
            return et.getGroupid();
        case INDEX_NAME:
            return et.getName();
        case INDEX_SUMMARY:
            return et.getSummary();
        case INDEX_CATEGORY:
            return et.getCategory();
        case INDEX_FOUNDER:
            return et.getFounder();
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

        LVXIN_GROUP.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_GROUP et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_GROUPID:
            et.setGroupid(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setName(DataObject.getStringValue(obj));
            return ;
        case INDEX_SUMMARY:
            et.setSummary(DataObject.getStringValue(obj));
            return ;
        case INDEX_CATEGORY:
            et.setCategory(DataObject.getStringValue(obj));
            return ;
        case INDEX_FOUNDER:
            et.setFounder(DataObject.getStringValue(obj));
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

        return  LVXIN_GROUP.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_GROUP et,int index) throws Exception {

        switch(index) {
        case INDEX_GROUPID:
            return et.getGroupid()==null;
        case INDEX_NAME:
            return et.getName()==null;
        case INDEX_SUMMARY:
            return et.getSummary()==null;
        case INDEX_CATEGORY:
            return et.getCategory()==null;
        case INDEX_FOUNDER:
            return et.getFounder()==null;
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

        return  LVXIN_GROUP.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_GROUP et,int index) throws Exception {

        switch(index) {
        case INDEX_GROUPID:
            return et.isGroupidDirty();
        case INDEX_NAME:
            return et.isNameDirty();
        case INDEX_SUMMARY:
            return et.isSummaryDirty();
        case INDEX_CATEGORY:
            return et.isCategoryDirty();
        case INDEX_FOUNDER:
            return et.isFounderDirty();
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
    private static  void fillJSONObject(LVXIN_GROUP et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGroupid()!=null) {
            JSONObjectHelper.put(json,"groupid",getJSONValue(et.getGroupid()),false);
        }
        if(bIncEmpty||et.getName()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getName()),false);
        }
        if(bIncEmpty||et.getSummary()!=null) {
            JSONObjectHelper.put(json,"summary",getJSONValue(et.getSummary()),false);
        }
        if(bIncEmpty||et.getCategory()!=null) {
            JSONObjectHelper.put(json,"category",getJSONValue(et.getCategory()),false);
        }
        if(bIncEmpty||et.getFounder()!=null) {
            JSONObjectHelper.put(json,"founder",getJSONValue(et.getFounder()),false);
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
    private static void fillXmlNode(LVXIN_GROUP et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getGroupid()!=null) {
            Object obj = et.getGroupid();
            node.setAttribute("GROUPID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getName()!=null) {
            Object obj = et.getName();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSummary()!=null) {
            Object obj = et.getSummary();
            node.setAttribute("SUMMARY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCategory()!=null) {
            Object obj = et.getCategory();
            node.setAttribute("CATEGORY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFounder()!=null) {
            Object obj = et.getFounder();
            node.setAttribute("FOUNDER",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_GROUP.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_GROUP et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isGroupidDirty() && (bIncEmpty||et.getGroupid()!=null)) {
            dst.set(FIELD_GROUPID,et.getGroupid());
        }
        if(et.isNameDirty() && (bIncEmpty||et.getName()!=null)) {
            dst.set(FIELD_NAME,et.getName());
        }
        if(et.isSummaryDirty() && (bIncEmpty||et.getSummary()!=null)) {
            dst.set(FIELD_SUMMARY,et.getSummary());
        }
        if(et.isCategoryDirty() && (bIncEmpty||et.getCategory()!=null)) {
            dst.set(FIELD_CATEGORY,et.getCategory());
        }
        if(et.isFounderDirty() && (bIncEmpty||et.getFounder()!=null)) {
            dst.set(FIELD_FOUNDER,et.getFounder());
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
        return  LVXIN_GROUP.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_GROUP et,int index) throws Exception {
        switch(index) {
        case INDEX_GROUPID:
            et.resetGroupid();
            return true;
        case INDEX_NAME:
            et.resetName();
            return true;
        case INDEX_SUMMARY:
            et.resetSummary();
            return true;
        case INDEX_CATEGORY:
            et.resetCategory();
            return true;
        case INDEX_FOUNDER:
            et.resetFounder();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_GROUP getProxyEntity() {
        return this.proxyLVXIN_GROUP;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_GROUP = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_GROUP) {
            this.proxyLVXIN_GROUP = (LVXIN_GROUP)proxyDataObject;
        }

    }

}