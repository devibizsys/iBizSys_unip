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
 * 实体[LVXIN_PUBLICACCOUNT] 数据对象
 */
public class LVXIN_PUBLICACCOUNT extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_PUBLICACCOUNT.class);
    /**
     *   实体属性标识[公众账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[账号介绍]
     */
    public final static String FIELD_DESCRIPTION = "DESCRIPTION";
    /**
     *   实体属性标识[(保留字段)]
     */
    public final static String FIELD_POWER = "POWER";
    /**
     *   实体属性标识[主页地址]
     */
    public final static String FIELD_LINK = "LINK";
    /**
     *   实体属性标识[关注时欢迎语]
     */
    public final static String FIELD_GREET = "GREET";
    /**
     *   实体属性标识[接口地址]
     */
    public final static String FIELD_APIURL = "APIURL";
    /**
     *   实体属性标识[状态]
     */
    public final static String FIELD_STATUS = "STATUS";
    /**
     *   实体属性标识[创建时间]
     */
    public final static String FIELD_TIMESTAMP = "TIMESTAMP";

    private final static int INDEX_ACCOUNT = 0;
    private final static int INDEX_NAME = 1;
    private final static int INDEX_DESCRIPTION = 2;
    private final static int INDEX_POWER = 3;
    private final static int INDEX_LINK = 4;
    private final static int INDEX_GREET = 5;
    private final static int INDEX_APIURL = 6;
    private final static int INDEX_STATUS = 7;
    private final static int INDEX_TIMESTAMP = 8;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_DESCRIPTION, INDEX_DESCRIPTION);
        fieldIndexMap.put( FIELD_POWER, INDEX_POWER);
        fieldIndexMap.put( FIELD_LINK, INDEX_LINK);
        fieldIndexMap.put( FIELD_GREET, INDEX_GREET);
        fieldIndexMap.put( FIELD_APIURL, INDEX_APIURL);
        fieldIndexMap.put( FIELD_STATUS, INDEX_STATUS);
        fieldIndexMap.put( FIELD_TIMESTAMP, INDEX_TIMESTAMP);
    }

    private LVXIN_PUBLICACCOUNT proxyLVXIN_PUBLICACCOUNT = null;

    public LVXIN_PUBLICACCOUNT() {
        super();
    }
    private boolean accountDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean descriptionDirtyFlag = false;
    private boolean powerDirtyFlag = false;
    private boolean linkDirtyFlag = false;
    private boolean greetDirtyFlag = false;
    private boolean apiurlDirtyFlag = false;
    private boolean statusDirtyFlag = false;
    private boolean timestampDirtyFlag = false;

    @Column(name="account")
    private String account;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="power")
    private String power;
    @Column(name="link")
    private String link;
    @Column(name="greet")
    private String greet;
    @Column(name="apiurl")
    private String apiurl;
    @Column(name="status")
    private String status;
    @Column(name="timestamp")
    private String timestamp;


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
     *  设置属性值[账号介绍]
     *  @param description
     */
    public void setDescription(String description) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDescription(description);
            return;
        }
        if(description!=null) {
            description = StringHelper.trimRight(description);
            if(description.length()==0) {
                description = null;
            }
        }
        this.description =  description;
        this.descriptionDirtyFlag  = true;
    }

    /**
     *  获取属性值[账号介绍]
     */
    public String getDescription() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDescription();
        }
        return this.description;
    }

    /**
     *  获取属性值[账号介绍]是否修改
     */
    public boolean isDescriptionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDescriptionDirty();
        }
        return this.descriptionDirtyFlag;
    }

    /**
     *  重置属性值[账号介绍]
     */
    public void resetDescription() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDescription();
            return;
        }

        this.descriptionDirtyFlag = false;
        this.description = null;
    }
    /**
     *  设置属性值[(保留字段)]
     *  @param power
     */
    public void setPOWER(String power) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOWER(power);
            return;
        }
        if(power!=null) {
            power = StringHelper.trimRight(power);
            if(power.length()==0) {
                power = null;
            }
        }
        this.power =  power;
        this.powerDirtyFlag  = true;
    }

    /**
     *  获取属性值[(保留字段)]
     */
    public String getPOWER() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOWER();
        }
        return this.power;
    }

    /**
     *  获取属性值[(保留字段)]是否修改
     */
    public boolean isPOWERDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOWERDirty();
        }
        return this.powerDirtyFlag;
    }

    /**
     *  重置属性值[(保留字段)]
     */
    public void resetPOWER() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOWER();
            return;
        }

        this.powerDirtyFlag = false;
        this.power = null;
    }
    /**
     *  设置属性值[主页地址]
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
     *  获取属性值[主页地址]
     */
    public String getLink() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLink();
        }
        return this.link;
    }

    /**
     *  获取属性值[主页地址]是否修改
     */
    public boolean isLinkDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLinkDirty();
        }
        return this.linkDirtyFlag;
    }

    /**
     *  重置属性值[主页地址]
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
     *  设置属性值[关注时欢迎语]
     *  @param greet
     */
    public void setGreet(String greet) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGreet(greet);
            return;
        }
        if(greet!=null) {
            greet = StringHelper.trimRight(greet);
            if(greet.length()==0) {
                greet = null;
            }
        }
        this.greet =  greet;
        this.greetDirtyFlag  = true;
    }

    /**
     *  获取属性值[关注时欢迎语]
     */
    public String getGreet() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGreet();
        }
        return this.greet;
    }

    /**
     *  获取属性值[关注时欢迎语]是否修改
     */
    public boolean isGreetDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGreetDirty();
        }
        return this.greetDirtyFlag;
    }

    /**
     *  重置属性值[关注时欢迎语]
     */
    public void resetGreet() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGreet();
            return;
        }

        this.greetDirtyFlag = false;
        this.greet = null;
    }
    /**
     *  设置属性值[接口地址]
     *  @param apiurl
     */
    public void setAPIURL(String apiurl) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setAPIURL(apiurl);
            return;
        }
        if(apiurl!=null) {
            apiurl = StringHelper.trimRight(apiurl);
            if(apiurl.length()==0) {
                apiurl = null;
            }
        }
        this.apiurl =  apiurl;
        this.apiurlDirtyFlag  = true;
    }

    /**
     *  获取属性值[接口地址]
     */
    public String getAPIURL() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getAPIURL();
        }
        return this.apiurl;
    }

    /**
     *  获取属性值[接口地址]是否修改
     */
    public boolean isAPIURLDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isAPIURLDirty();
        }
        return this.apiurlDirtyFlag;
    }

    /**
     *  重置属性值[接口地址]
     */
    public void resetAPIURL() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetAPIURL();
            return;
        }

        this.apiurlDirtyFlag = false;
        this.apiurl = null;
    }
    /**
     *  设置属性值[状态]
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
     *  获取属性值[状态]
     */
    public String getStatus() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getStatus();
        }
        return this.status;
    }

    /**
     *  获取属性值[状态]是否修改
     */
    public boolean isStatusDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isStatusDirty();
        }
        return this.statusDirtyFlag;
    }

    /**
     *  重置属性值[状态]
     */
    public void resetStatus() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetStatus();
            return;
        }

        this.statusDirtyFlag = false;
        this.status = null;
    }
    /**
     *  设置属性值[创建时间]
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
     *  获取属性值[创建时间]
     */
    public String getTimestamp() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTimestamp();
        }
        return this.timestamp;
    }

    /**
     *  获取属性值[创建时间]是否修改
     */
    public boolean isTimestampDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTimestampDirty();
        }
        return this.timestampDirtyFlag;
    }

    /**
     *  重置属性值[创建时间]
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
        LVXIN_PUBLICACCOUNT.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_PUBLICACCOUNT et) {
        et.resetAccount();
        et.resetNAME();
        et.resetDescription();
        et.resetPOWER();
        et.resetLink();
        et.resetGreet();
        et.resetAPIURL();
        et.resetStatus();
        et.resetTimestamp();
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
        if(!bDirtyOnly || isDescriptionDirty()) {
            params.put(FIELD_DESCRIPTION,getDescription());
        }
        if(!bDirtyOnly || isPOWERDirty()) {
            params.put(FIELD_POWER,getPOWER());
        }
        if(!bDirtyOnly || isLinkDirty()) {
            params.put(FIELD_LINK,getLink());
        }
        if(!bDirtyOnly || isGreetDirty()) {
            params.put(FIELD_GREET,getGreet());
        }
        if(!bDirtyOnly || isAPIURLDirty()) {
            params.put(FIELD_APIURL,getAPIURL());
        }
        if(!bDirtyOnly || isStatusDirty()) {
            params.put(FIELD_STATUS,getStatus());
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

        return  LVXIN_PUBLICACCOUNT.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_PUBLICACCOUNT et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getAccount();
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_DESCRIPTION:
            return et.getDescription();
        case INDEX_POWER:
            return et.getPOWER();
        case INDEX_LINK:
            return et.getLink();
        case INDEX_GREET:
            return et.getGreet();
        case INDEX_APIURL:
            return et.getAPIURL();
        case INDEX_STATUS:
            return et.getStatus();
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

        LVXIN_PUBLICACCOUNT.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_PUBLICACCOUNT et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.setAccount(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_DESCRIPTION:
            et.setDescription(DataObject.getStringValue(obj));
            return ;
        case INDEX_POWER:
            et.setPOWER(DataObject.getStringValue(obj));
            return ;
        case INDEX_LINK:
            et.setLink(DataObject.getStringValue(obj));
            return ;
        case INDEX_GREET:
            et.setGreet(DataObject.getStringValue(obj));
            return ;
        case INDEX_APIURL:
            et.setAPIURL(DataObject.getStringValue(obj));
            return ;
        case INDEX_STATUS:
            et.setStatus(DataObject.getStringValue(obj));
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

        return  LVXIN_PUBLICACCOUNT.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_PUBLICACCOUNT et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getAccount()==null;
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_DESCRIPTION:
            return et.getDescription()==null;
        case INDEX_POWER:
            return et.getPOWER()==null;
        case INDEX_LINK:
            return et.getLink()==null;
        case INDEX_GREET:
            return et.getGreet()==null;
        case INDEX_APIURL:
            return et.getAPIURL()==null;
        case INDEX_STATUS:
            return et.getStatus()==null;
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

        return  LVXIN_PUBLICACCOUNT.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_PUBLICACCOUNT et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.isAccountDirty();
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_DESCRIPTION:
            return et.isDescriptionDirty();
        case INDEX_POWER:
            return et.isPOWERDirty();
        case INDEX_LINK:
            return et.isLinkDirty();
        case INDEX_GREET:
            return et.isGreetDirty();
        case INDEX_APIURL:
            return et.isAPIURLDirty();
        case INDEX_STATUS:
            return et.isStatusDirty();
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
    private static  void fillJSONObject(LVXIN_PUBLICACCOUNT et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getAccount()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getAccount()),false);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getDescription()!=null) {
            JSONObjectHelper.put(json,"description",getJSONValue(et.getDescription()),false);
        }
        if(bIncEmpty||et.getPOWER()!=null) {
            JSONObjectHelper.put(json,"power",getJSONValue(et.getPOWER()),false);
        }
        if(bIncEmpty||et.getLink()!=null) {
            JSONObjectHelper.put(json,"link",getJSONValue(et.getLink()),false);
        }
        if(bIncEmpty||et.getGreet()!=null) {
            JSONObjectHelper.put(json,"greet",getJSONValue(et.getGreet()),false);
        }
        if(bIncEmpty||et.getAPIURL()!=null) {
            JSONObjectHelper.put(json,"apiurl",getJSONValue(et.getAPIURL()),false);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            JSONObjectHelper.put(json,"status",getJSONValue(et.getStatus()),false);
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
    private static void fillXmlNode(LVXIN_PUBLICACCOUNT et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getAccount()!=null) {
            Object obj = et.getAccount();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDescription()!=null) {
            Object obj = et.getDescription();
            node.setAttribute("DESCRIPTION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOWER()!=null) {
            Object obj = et.getPOWER();
            node.setAttribute("POWER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLink()!=null) {
            Object obj = et.getLink();
            node.setAttribute("LINK",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getGreet()!=null) {
            Object obj = et.getGreet();
            node.setAttribute("GREET",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getAPIURL()!=null) {
            Object obj = et.getAPIURL();
            node.setAttribute("APIURL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getStatus()!=null) {
            Object obj = et.getStatus();
            node.setAttribute("STATUS",(obj==null)?"":(String)obj);
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
        LVXIN_PUBLICACCOUNT.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_PUBLICACCOUNT et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isAccountDirty() && (bIncEmpty||et.getAccount()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getAccount());
        }
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isDescriptionDirty() && (bIncEmpty||et.getDescription()!=null)) {
            dst.set(FIELD_DESCRIPTION,et.getDescription());
        }
        if(et.isPOWERDirty() && (bIncEmpty||et.getPOWER()!=null)) {
            dst.set(FIELD_POWER,et.getPOWER());
        }
        if(et.isLinkDirty() && (bIncEmpty||et.getLink()!=null)) {
            dst.set(FIELD_LINK,et.getLink());
        }
        if(et.isGreetDirty() && (bIncEmpty||et.getGreet()!=null)) {
            dst.set(FIELD_GREET,et.getGreet());
        }
        if(et.isAPIURLDirty() && (bIncEmpty||et.getAPIURL()!=null)) {
            dst.set(FIELD_APIURL,et.getAPIURL());
        }
        if(et.isStatusDirty() && (bIncEmpty||et.getStatus()!=null)) {
            dst.set(FIELD_STATUS,et.getStatus());
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
        return  LVXIN_PUBLICACCOUNT.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_PUBLICACCOUNT et,int index) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.resetAccount();
            return true;
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_DESCRIPTION:
            et.resetDescription();
            return true;
        case INDEX_POWER:
            et.resetPOWER();
            return true;
        case INDEX_LINK:
            et.resetLink();
            return true;
        case INDEX_GREET:
            et.resetGreet();
            return true;
        case INDEX_APIURL:
            et.resetAPIURL();
            return true;
        case INDEX_STATUS:
            et.resetStatus();
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
    private LVXIN_PUBLICACCOUNT getProxyEntity() {
        return this.proxyLVXIN_PUBLICACCOUNT;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_PUBLICACCOUNT = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_PUBLICACCOUNT) {
            this.proxyLVXIN_PUBLICACCOUNT = (LVXIN_PUBLICACCOUNT)proxyDataObject;
        }

    }

}