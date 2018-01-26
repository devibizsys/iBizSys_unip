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
 * 实体[LVXIN_MANAGER] 数据对象
 */
public class LVXIN_MANAGER extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_MANAGER.class);
    /**
     *   实体属性标识[账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[密码]
     */
    public final static String FIELD_PASSWORD = "PASSWORD";
    /**
     *   实体属性标识[（未使用）]
     */
    public final static String FIELD_STATUS = "STATUS";

    private final static int INDEX_ACCOUNT = 0;
    private final static int INDEX_NAME = 1;
    private final static int INDEX_PASSWORD = 2;
    private final static int INDEX_STATUS = 3;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_PASSWORD, INDEX_PASSWORD);
        fieldIndexMap.put( FIELD_STATUS, INDEX_STATUS);
    }

    private LVXIN_MANAGER proxyLVXIN_MANAGER = null;

    public LVXIN_MANAGER() {
        super();
    }
    private boolean accountDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean passwordDirtyFlag = false;
    private boolean statusDirtyFlag = false;

    @Column(name="account")
    private String account;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="status")
    private String status;


    /**
     *  设置属性值[账号]
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
     *  获取属性值[账号]
     */
    public String getAccount() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAccount();
        }
        return this.account;
    }

    /**
     *  获取属性值[账号]是否修改
     */
    public boolean isAccountDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAccountDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[账号]
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
     *  设置属性值[密码]
     *  @param password
     */
    public void setPassword(String password) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPassword(password);
            return;
        }
        if(password!=null) {
            password = StringHelper.trimRight(password);
            if(password.length()==0) {
                password = null;
            }
        }
        this.password =  password;
        this.passwordDirtyFlag  = true;
    }

    /**
     *  获取属性值[密码]
     */
    public String getPassword() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPassword();
        }
        return this.password;
    }

    /**
     *  获取属性值[密码]是否修改
     */
    public boolean isPasswordDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPasswordDirty();
        }
        return this.passwordDirtyFlag;
    }

    /**
     *  重置属性值[密码]
     */
    public void resetPassword() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPassword();
            return;
        }

        this.passwordDirtyFlag = false;
        this.password = null;
    }
    /**
     *  设置属性值[（未使用）]
     *  @param status
     */
    public void setStatus(String status) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setStatus(status);
            return;
        }
        if(status!=null) {
            status = StringHelper.trimRight(status);
            if(status.length()==0) {
                status = null;
            }
        }
        this.status =  status;
        this.statusDirtyFlag  = true;
    }

    /**
     *  获取属性值[（未使用）]
     */
    public String getStatus() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStatus();
        }
        return this.status;
    }

    /**
     *  获取属性值[（未使用）]是否修改
     */
    public boolean isStatusDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStatusDirty();
        }
        return this.statusDirtyFlag;
    }

    /**
     *  重置属性值[（未使用）]
     */
    public void resetStatus() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetStatus();
            return;
        }

        this.statusDirtyFlag = false;
        this.status = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_MANAGER.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_MANAGER et) {
        et.resetAccount();
        et.resetNAME();
        et.resetPassword();
        et.resetStatus();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isAccountDirty()) {
            params.put(FIELD_ACCOUNT,getAccount());
        }
        if(!bDirtyOnly || isNAMEDirty()) {
            params.put(FIELD_NAME,getNAME());
        }
        if(!bDirtyOnly || isPasswordDirty()) {
            params.put(FIELD_PASSWORD,getPassword());
        }
        if(!bDirtyOnly || isStatusDirty()) {
            params.put(FIELD_STATUS,getStatus());
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

        return  LVXIN_MANAGER.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_MANAGER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_PASSWORD:
            return et.getPassword();
        case INDEX_STATUS:
            return et.getStatus();
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

        LVXIN_MANAGER.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_MANAGER et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_PASSWORD:
            et.setPassword(DataObject.getStringValue(obj));
            return ;
        case INDEX_STATUS:
            et.setStatus(DataObject.getStringValue(obj));
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

        return  LVXIN_MANAGER.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_MANAGER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_PASSWORD:
            return et.getPassword()==null;
        case INDEX_STATUS:
            return et.getStatus()==null;
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

        return  LVXIN_MANAGER.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_MANAGER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_PASSWORD:
            return et.isPasswordDirty();
        case INDEX_STATUS:
            return et.isStatusDirty();
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
    private static  void fillJSONObject(LVXIN_MANAGER et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getPassword()!=null) {
            JSONObjectHelper.put(json,"password",getJSONValue(et.getPassword()),false);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            JSONObjectHelper.put(json,"status",getJSONValue(et.getStatus()),false);
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
    private static void fillXmlNode(LVXIN_MANAGER et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPassword()!=null) {
            Object obj = et.getPassword();
            node.setAttribute("PASSWORD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            Object obj = et.getStatus();
            node.setAttribute("STATUS",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_MANAGER.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_MANAGER et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isPasswordDirty() && (bIncEmpty||et.getPassword()!=null)) {
            dst.set(FIELD_PASSWORD,et.getPassword());
        }
        if(et.isStatusDirty() && (bIncEmpty||et.getStatus()!=null)) {
            dst.set(FIELD_STATUS,et.getStatus());
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
        return  LVXIN_MANAGER.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_MANAGER et,int index) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_PASSWORD:
            et.resetPassword();
            return true;
        case INDEX_STATUS:
            et.resetStatus();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_MANAGER getProxyEntity() {
        return this.proxyLVXIN_MANAGER;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_MANAGER = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_MANAGER) {
            this.proxyLVXIN_MANAGER = (LVXIN_MANAGER)proxyDataObject;
        }

    }

}