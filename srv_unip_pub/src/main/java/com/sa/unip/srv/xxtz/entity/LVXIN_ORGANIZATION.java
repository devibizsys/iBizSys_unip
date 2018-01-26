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
 * 实体[LVXIN_ORGANIZATION] 数据对象
 */
public class LVXIN_ORGANIZATION extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_ORGANIZATION.class);
    /**
     *   实体属性标识[组织标识]
     */
    public final static String FIELD_CODE = "CODE";
    /**
     *   实体属性标识[组织名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[上级编号]
     */
    public final static String FIELD_PARENTCODE = "PARENTCODE";
    /**
     *   实体属性标识[排序]
     */
    public final static String FIELD_SORT = "SORT";

    private final static int INDEX_CODE = 0;
    private final static int INDEX_NAME = 1;
    private final static int INDEX_PARENTCODE = 2;
    private final static int INDEX_SORT = 3;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CODE, INDEX_CODE);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_PARENTCODE, INDEX_PARENTCODE);
        fieldIndexMap.put( FIELD_SORT, INDEX_SORT);
    }

    private LVXIN_ORGANIZATION proxyLVXIN_ORGANIZATION = null;

    public LVXIN_ORGANIZATION() {
        super();
    }
    private boolean codeDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean parentcodeDirtyFlag = false;
    private boolean sortDirtyFlag = false;

    @Column(name="code")
    private String code;
    @Column(name="name")
    private String name;
    @Column(name="parentcode")
    private String parentcode;
    @Column(name="sort")
    private String sort;


    /**
     *  设置属性值[组织标识]
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
     *  获取属性值[组织标识]
     */
    public String getCODE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCODE();
        }
        return this.code;
    }

    /**
     *  获取属性值[组织标识]是否修改
     */
    public boolean isCODEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCODEDirty();
        }
        return this.codeDirtyFlag;
    }

    /**
     *  重置属性值[组织标识]
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
     *  设置属性值[组织名称]
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
     *  获取属性值[组织名称]
     */
    public String getNAME() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getNAME();
        }
        return this.name;
    }

    /**
     *  获取属性值[组织名称]是否修改
     */
    public boolean isNAMEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNAMEDirty();
        }
        return this.nameDirtyFlag;
    }

    /**
     *  重置属性值[组织名称]
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
     *  设置属性值[上级编号]
     *  @param parentcode
     */
    public void setParentcode(String parentcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setParentcode(parentcode);
            return;
        }
        if(parentcode!=null) {
            parentcode = StringHelper.trimRight(parentcode);
            if(parentcode.length()==0) {
                parentcode = null;
            }
        }
        this.parentcode =  parentcode;
        this.parentcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级编号]
     */
    public String getParentcode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getParentcode();
        }
        return this.parentcode;
    }

    /**
     *  获取属性值[上级编号]是否修改
     */
    public boolean isParentcodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isParentcodeDirty();
        }
        return this.parentcodeDirtyFlag;
    }

    /**
     *  重置属性值[上级编号]
     */
    public void resetParentcode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetParentcode();
            return;
        }

        this.parentcodeDirtyFlag = false;
        this.parentcode = null;
    }
    /**
     *  设置属性值[排序]
     *  @param sort
     */
    public void setSort(String sort) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSort(sort);
            return;
        }
        if(sort!=null) {
            sort = StringHelper.trimRight(sort);
            if(sort.length()==0) {
                sort = null;
            }
        }
        this.sort =  sort;
        this.sortDirtyFlag  = true;
    }

    /**
     *  获取属性值[排序]
     */
    public String getSort() {
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
        LVXIN_ORGANIZATION.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_ORGANIZATION et) {
        et.resetCODE();
        et.resetNAME();
        et.resetParentcode();
        et.resetSort();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCODEDirty()) {
            params.put(FIELD_CODE,getCODE());
        }
        if(!bDirtyOnly || isNAMEDirty()) {
            params.put(FIELD_NAME,getNAME());
        }
        if(!bDirtyOnly || isParentcodeDirty()) {
            params.put(FIELD_PARENTCODE,getParentcode());
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

        return  LVXIN_ORGANIZATION.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_ORGANIZATION et,int index) throws Exception {

        switch(index) {
        case INDEX_CODE:
            return et.getCODE();
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_PARENTCODE:
            return et.getParentcode();
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

        LVXIN_ORGANIZATION.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_ORGANIZATION et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CODE:
            et.setCODE(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_PARENTCODE:
            et.setParentcode(DataObject.getStringValue(obj));
            return ;
        case INDEX_SORT:
            et.setSort(DataObject.getStringValue(obj));
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

        return  LVXIN_ORGANIZATION.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_ORGANIZATION et,int index) throws Exception {

        switch(index) {
        case INDEX_CODE:
            return et.getCODE()==null;
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_PARENTCODE:
            return et.getParentcode()==null;
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

        return  LVXIN_ORGANIZATION.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_ORGANIZATION et,int index) throws Exception {

        switch(index) {
        case INDEX_CODE:
            return et.isCODEDirty();
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_PARENTCODE:
            return et.isParentcodeDirty();
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
    private static  void fillJSONObject(LVXIN_ORGANIZATION et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCODE()!=null) {
            JSONObjectHelper.put(json,"code",getJSONValue(et.getCODE()),false);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getParentcode()!=null) {
            JSONObjectHelper.put(json,"parentcode",getJSONValue(et.getParentcode()),false);
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
    private static void fillXmlNode(LVXIN_ORGANIZATION et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCODE()!=null) {
            Object obj = et.getCODE();
            node.setAttribute("CODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getParentcode()!=null) {
            Object obj = et.getParentcode();
            node.setAttribute("PARENTCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSort()!=null) {
            Object obj = et.getSort();
            node.setAttribute("SORT",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_ORGANIZATION.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_ORGANIZATION et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCODEDirty() && (bIncEmpty||et.getCODE()!=null)) {
            dst.set(FIELD_CODE,et.getCODE());
        }
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isParentcodeDirty() && (bIncEmpty||et.getParentcode()!=null)) {
            dst.set(FIELD_PARENTCODE,et.getParentcode());
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
        return  LVXIN_ORGANIZATION.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_ORGANIZATION et,int index) throws Exception {
        switch(index) {
        case INDEX_CODE:
            et.resetCODE();
            return true;
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_PARENTCODE:
            et.resetParentcode();
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
    private LVXIN_ORGANIZATION getProxyEntity() {
        return this.proxyLVXIN_ORGANIZATION;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_ORGANIZATION = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_ORGANIZATION) {
            this.proxyLVXIN_ORGANIZATION = (LVXIN_ORGANIZATION)proxyDataObject;
        }

    }

}