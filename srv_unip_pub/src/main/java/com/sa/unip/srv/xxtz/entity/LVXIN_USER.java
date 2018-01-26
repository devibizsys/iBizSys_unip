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
 * 实体[LVXIN_USER] 数据对象
 */
public class LVXIN_USER extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(LVXIN_USER.class);
    /**
     *   实体属性标识[账号]
     */
    public final static String FIELD_ACCOUNT = "ACCOUNT";
    /**
     *   实体属性标识[密码]
     */
    public final static String FIELD_PASSWORD = "PASSWORD";
    /**
     *   实体属性标识[名称]
     */
    public final static String FIELD_NAME = "NAME";
    /**
     *   实体属性标识[性别]
     */
    public final static String FIELD_GENDER = "GENDER";
    /**
     *   实体属性标识[电话]
     */
    public final static String FIELD_TELEPHONE = "TELEPHONE";
    /**
     *   实体属性标识[邮箱地址]
     */
    public final static String FIELD_EMAIL = "EMAIL";
    /**
     *   实体属性标识[当前经度]
     */
    public final static String FIELD_LONGITUDE = "LONGITUDE";
    /**
     *   实体属性标识[当前维度]
     */
    public final static String FIELD_LATITUDE = "LATITUDE";
    /**
     *   实体属性标识[当前位置信息]
     */
    public final static String FIELD_LOCATION = "LOCATION";
    /**
     *   实体属性标识[用户签名]
     */
    public final static String FIELD_MOTTO = "MOTTO";
    /**
     *   实体属性标识[组织编号]
     */
    public final static String FIELD_ORGCODE = "ORGCODE";
    /**
     *   实体属性标识[在线状态 0 离线 1在线]
     */
    public final static String FIELD_INLINE = "INLINE";
    /**
     *   实体属性标识[级别]
     */
    public final static String FIELD_GRADE = "GRADE";
    /**
     *   实体属性标识[启用0或者禁用1]
     */
    public final static String FIELD_POWER = "POWER";

    private final static int INDEX_ACCOUNT = 0;
    private final static int INDEX_PASSWORD = 1;
    private final static int INDEX_NAME = 2;
    private final static int INDEX_GENDER = 3;
    private final static int INDEX_TELEPHONE = 4;
    private final static int INDEX_EMAIL = 5;
    private final static int INDEX_LONGITUDE = 6;
    private final static int INDEX_LATITUDE = 7;
    private final static int INDEX_LOCATION = 8;
    private final static int INDEX_MOTTO = 9;
    private final static int INDEX_ORGCODE = 10;
    private final static int INDEX_INLINE = 11;
    private final static int INDEX_GRADE = 12;
    private final static int INDEX_POWER = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_ACCOUNT, INDEX_ACCOUNT);
        fieldIndexMap.put( FIELD_PASSWORD, INDEX_PASSWORD);
        fieldIndexMap.put( FIELD_NAME, INDEX_NAME);
        fieldIndexMap.put( FIELD_GENDER, INDEX_GENDER);
        fieldIndexMap.put( FIELD_TELEPHONE, INDEX_TELEPHONE);
        fieldIndexMap.put( FIELD_EMAIL, INDEX_EMAIL);
        fieldIndexMap.put( FIELD_LONGITUDE, INDEX_LONGITUDE);
        fieldIndexMap.put( FIELD_LATITUDE, INDEX_LATITUDE);
        fieldIndexMap.put( FIELD_LOCATION, INDEX_LOCATION);
        fieldIndexMap.put( FIELD_MOTTO, INDEX_MOTTO);
        fieldIndexMap.put( FIELD_ORGCODE, INDEX_ORGCODE);
        fieldIndexMap.put( FIELD_INLINE, INDEX_INLINE);
        fieldIndexMap.put( FIELD_GRADE, INDEX_GRADE);
        fieldIndexMap.put( FIELD_POWER, INDEX_POWER);
    }

    private LVXIN_USER proxyLVXIN_USER = null;

    public LVXIN_USER() {
        super();
    }
    private boolean accountDirtyFlag = false;
    private boolean passwordDirtyFlag = false;
    private boolean nameDirtyFlag = false;
    private boolean genderDirtyFlag = false;
    private boolean telephoneDirtyFlag = false;
    private boolean emailDirtyFlag = false;
    private boolean longitudeDirtyFlag = false;
    private boolean latitudeDirtyFlag = false;
    private boolean locationDirtyFlag = false;
    private boolean mottoDirtyFlag = false;
    private boolean orgcodeDirtyFlag = false;
    private boolean inlineDirtyFlag = false;
    private boolean gradeDirtyFlag = false;
    private boolean powerDirtyFlag = false;

    @Column(name="account")
    private String account;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="gender")
    private String gender;
    @Column(name="telephone")
    private String telephone;
    @Column(name="email")
    private String email;
    @Column(name="longitude")
    private Double longitude;
    @Column(name="latitude")
    private Double latitude;
    @Column(name="location")
    private String location;
    @Column(name="motto")
    private String motto;
    @Column(name="orgcode")
    private String orgcode;
    @Column(name="inline")
    private String inline;
    @Column(name="grade")
    private String grade;
    @Column(name="power")
    private String power;


    /**
     *  设置属性值[账号]
     *  @param account
     */
    public void setACCOUNT(String account) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setACCOUNT(account);
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
    public String getACCOUNT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getACCOUNT();
        }
        return this.account;
    }

    /**
     *  获取属性值[账号]是否修改
     */
    public boolean isACCOUNTDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isACCOUNTDirty();
        }
        return this.accountDirtyFlag;
    }

    /**
     *  重置属性值[账号]
     */
    public void resetACCOUNT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetACCOUNT();
            return;
        }

        this.accountDirtyFlag = false;
        this.account = null;
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
     *  设置属性值[性别]代码表：com.sa.unip.srv.codelist.XBCodeListModel
     *  @param gender
     */
    public void setGENDER(String gender) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGENDER(gender);
            return;
        }
        if(gender!=null) {
            gender = StringHelper.trimRight(gender);
            if(gender.length()==0) {
                gender = null;
            }
        }
        this.gender =  gender;
        this.genderDirtyFlag  = true;
    }

    /**
     *  获取属性值[性别]代码表：com.sa.unip.srv.codelist.XBCodeListModel
     */
    public String getGENDER() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGENDER();
        }
        return this.gender;
    }

    /**
     *  获取属性值[性别]是否修改
     */
    public boolean isGENDERDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGENDERDirty();
        }
        return this.genderDirtyFlag;
    }

    /**
     *  重置属性值[性别]
     */
    public void resetGENDER() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGENDER();
            return;
        }

        this.genderDirtyFlag = false;
        this.gender = null;
    }
    /**
     *  设置属性值[电话]
     *  @param telephone
     */
    public void setTelephone(String telephone) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTelephone(telephone);
            return;
        }
        if(telephone!=null) {
            telephone = StringHelper.trimRight(telephone);
            if(telephone.length()==0) {
                telephone = null;
            }
        }
        this.telephone =  telephone;
        this.telephoneDirtyFlag  = true;
    }

    /**
     *  获取属性值[电话]
     */
    public String getTelephone() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTelephone();
        }
        return this.telephone;
    }

    /**
     *  获取属性值[电话]是否修改
     */
    public boolean isTelephoneDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTelephoneDirty();
        }
        return this.telephoneDirtyFlag;
    }

    /**
     *  重置属性值[电话]
     */
    public void resetTelephone() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTelephone();
            return;
        }

        this.telephoneDirtyFlag = false;
        this.telephone = null;
    }
    /**
     *  设置属性值[邮箱地址]
     *  @param email
     */
    public void setEmail(String email) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEmail(email);
            return;
        }
        if(email!=null) {
            email = StringHelper.trimRight(email);
            if(email.length()==0) {
                email = null;
            }
        }
        this.email =  email;
        this.emailDirtyFlag  = true;
    }

    /**
     *  获取属性值[邮箱地址]
     */
    public String getEmail() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEmail();
        }
        return this.email;
    }

    /**
     *  获取属性值[邮箱地址]是否修改
     */
    public boolean isEmailDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEmailDirty();
        }
        return this.emailDirtyFlag;
    }

    /**
     *  重置属性值[邮箱地址]
     */
    public void resetEmail() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEmail();
            return;
        }

        this.emailDirtyFlag = false;
        this.email = null;
    }
    /**
     *  设置属性值[当前经度]
     *  @param longitude
     */
    public void setLongitude(Double longitude) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLongitude(longitude);
            return;
        }
        this.longitude =  longitude;
        this.longitudeDirtyFlag  = true;
    }

    /**
     *  获取属性值[当前经度]
     */
    public Double getLongitude() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLongitude();
        }
        return this.longitude;
    }

    /**
     *  获取属性值[当前经度]是否修改
     */
    public boolean isLongitudeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLongitudeDirty();
        }
        return this.longitudeDirtyFlag;
    }

    /**
     *  重置属性值[当前经度]
     */
    public void resetLongitude() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLongitude();
            return;
        }

        this.longitudeDirtyFlag = false;
        this.longitude = null;
    }
    /**
     *  设置属性值[当前维度]
     *  @param latitude
     */
    public void setLatitude(Double latitude) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLatitude(latitude);
            return;
        }
        this.latitude =  latitude;
        this.latitudeDirtyFlag  = true;
    }

    /**
     *  获取属性值[当前维度]
     */
    public Double getLatitude() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLatitude();
        }
        return this.latitude;
    }

    /**
     *  获取属性值[当前维度]是否修改
     */
    public boolean isLatitudeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLatitudeDirty();
        }
        return this.latitudeDirtyFlag;
    }

    /**
     *  重置属性值[当前维度]
     */
    public void resetLatitude() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLatitude();
            return;
        }

        this.latitudeDirtyFlag = false;
        this.latitude = null;
    }
    /**
     *  设置属性值[当前位置信息]
     *  @param location
     */
    public void setLocation(String location) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLocation(location);
            return;
        }
        if(location!=null) {
            location = StringHelper.trimRight(location);
            if(location.length()==0) {
                location = null;
            }
        }
        this.location =  location;
        this.locationDirtyFlag  = true;
    }

    /**
     *  获取属性值[当前位置信息]
     */
    public String getLocation() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLocation();
        }
        return this.location;
    }

    /**
     *  获取属性值[当前位置信息]是否修改
     */
    public boolean isLocationDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLocationDirty();
        }
        return this.locationDirtyFlag;
    }

    /**
     *  重置属性值[当前位置信息]
     */
    public void resetLocation() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLocation();
            return;
        }

        this.locationDirtyFlag = false;
        this.location = null;
    }
    /**
     *  设置属性值[用户签名]
     *  @param motto
     */
    public void setMotto(String motto) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMotto(motto);
            return;
        }
        if(motto!=null) {
            motto = StringHelper.trimRight(motto);
            if(motto.length()==0) {
                motto = null;
            }
        }
        this.motto =  motto;
        this.mottoDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户签名]
     */
    public String getMotto() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMotto();
        }
        return this.motto;
    }

    /**
     *  获取属性值[用户签名]是否修改
     */
    public boolean isMottoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMottoDirty();
        }
        return this.mottoDirtyFlag;
    }

    /**
     *  重置属性值[用户签名]
     */
    public void resetMotto() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMotto();
            return;
        }

        this.mottoDirtyFlag = false;
        this.motto = null;
    }
    /**
     *  设置属性值[组织编号]
     *  @param orgcode
     */
    public void setOrgCode(String orgcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgCode(orgcode);
            return;
        }
        if(orgcode!=null) {
            orgcode = StringHelper.trimRight(orgcode);
            if(orgcode.length()==0) {
                orgcode = null;
            }
        }
        this.orgcode =  orgcode;
        this.orgcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织编号]
     */
    public String getOrgCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgCode();
        }
        return this.orgcode;
    }

    /**
     *  获取属性值[组织编号]是否修改
     */
    public boolean isOrgCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgCodeDirty();
        }
        return this.orgcodeDirtyFlag;
    }

    /**
     *  重置属性值[组织编号]
     */
    public void resetOrgCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgCode();
            return;
        }

        this.orgcodeDirtyFlag = false;
        this.orgcode = null;
    }
    /**
     *  设置属性值[在线状态 0 离线 1在线]代码表：com.sa.unip.srv.codelist.ZXZTCodeListModel
     *  @param inline
     */
    public void setINLINE(String inline) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setINLINE(inline);
            return;
        }
        if(inline!=null) {
            inline = StringHelper.trimRight(inline);
            if(inline.length()==0) {
                inline = null;
            }
        }
        this.inline =  inline;
        this.inlineDirtyFlag  = true;
    }

    /**
     *  获取属性值[在线状态 0 离线 1在线]代码表：com.sa.unip.srv.codelist.ZXZTCodeListModel
     */
    public String getINLINE() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getINLINE();
        }
        return this.inline;
    }

    /**
     *  获取属性值[在线状态 0 离线 1在线]是否修改
     */
    public boolean isINLINEDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isINLINEDirty();
        }
        return this.inlineDirtyFlag;
    }

    /**
     *  重置属性值[在线状态 0 离线 1在线]
     */
    public void resetINLINE() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetINLINE();
            return;
        }

        this.inlineDirtyFlag = false;
        this.inline = null;
    }
    /**
     *  设置属性值[级别]
     *  @param grade
     */
    public void setGrade(String grade) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setGrade(grade);
            return;
        }
        if(grade!=null) {
            grade = StringHelper.trimRight(grade);
            if(grade.length()==0) {
                grade = null;
            }
        }
        this.grade =  grade;
        this.gradeDirtyFlag  = true;
    }

    /**
     *  获取属性值[级别]
     */
    public String getGrade() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getGrade();
        }
        return this.grade;
    }

    /**
     *  获取属性值[级别]是否修改
     */
    public boolean isGradeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isGradeDirty();
        }
        return this.gradeDirtyFlag;
    }

    /**
     *  重置属性值[级别]
     */
    public void resetGrade() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetGrade();
            return;
        }

        this.gradeDirtyFlag = false;
        this.grade = null;
    }
    /**
     *  设置属性值[启用0或者禁用1]代码表：com.sa.unip.srv.codelist.QYZTCodeListModel
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
     *  获取属性值[启用0或者禁用1]代码表：com.sa.unip.srv.codelist.QYZTCodeListModel
     */
    public String getPOWER() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOWER();
        }
        return this.power;
    }

    /**
     *  获取属性值[启用0或者禁用1]是否修改
     */
    public boolean isPOWERDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOWERDirty();
        }
        return this.powerDirtyFlag;
    }

    /**
     *  重置属性值[启用0或者禁用1]
     */
    public void resetPOWER() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOWER();
            return;
        }

        this.powerDirtyFlag = false;
        this.power = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        LVXIN_USER.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(LVXIN_USER et) {
        et.resetACCOUNT();
        et.resetPassword();
        et.resetNAME();
        et.resetGENDER();
        et.resetTelephone();
        et.resetEmail();
        et.resetLongitude();
        et.resetLatitude();
        et.resetLocation();
        et.resetMotto();
        et.resetOrgCode();
        et.resetINLINE();
        et.resetGrade();
        et.resetPOWER();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isACCOUNTDirty()) {
            params.put(FIELD_ACCOUNT,getACCOUNT());
        }
        if(!bDirtyOnly || isPasswordDirty()) {
            params.put(FIELD_PASSWORD,getPassword());
        }
        if(!bDirtyOnly || isNAMEDirty()) {
            params.put(FIELD_NAME,getNAME());
        }
        if(!bDirtyOnly || isGENDERDirty()) {
            params.put(FIELD_GENDER,getGENDER());
        }
        if(!bDirtyOnly || isTelephoneDirty()) {
            params.put(FIELD_TELEPHONE,getTelephone());
        }
        if(!bDirtyOnly || isEmailDirty()) {
            params.put(FIELD_EMAIL,getEmail());
        }
        if(!bDirtyOnly || isLongitudeDirty()) {
            params.put(FIELD_LONGITUDE,getLongitude());
        }
        if(!bDirtyOnly || isLatitudeDirty()) {
            params.put(FIELD_LATITUDE,getLatitude());
        }
        if(!bDirtyOnly || isLocationDirty()) {
            params.put(FIELD_LOCATION,getLocation());
        }
        if(!bDirtyOnly || isMottoDirty()) {
            params.put(FIELD_MOTTO,getMotto());
        }
        if(!bDirtyOnly || isOrgCodeDirty()) {
            params.put(FIELD_ORGCODE,getOrgCode());
        }
        if(!bDirtyOnly || isINLINEDirty()) {
            params.put(FIELD_INLINE,getINLINE());
        }
        if(!bDirtyOnly || isGradeDirty()) {
            params.put(FIELD_GRADE,getGrade());
        }
        if(!bDirtyOnly || isPOWERDirty()) {
            params.put(FIELD_POWER,getPOWER());
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

        return  LVXIN_USER.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(LVXIN_USER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getACCOUNT();
        case INDEX_PASSWORD:
            return et.getPassword();
        case INDEX_NAME:
            return et.getNAME();
        case INDEX_GENDER:
            return et.getGENDER();
        case INDEX_TELEPHONE:
            return et.getTelephone();
        case INDEX_EMAIL:
            return et.getEmail();
        case INDEX_LONGITUDE:
            return et.getLongitude();
        case INDEX_LATITUDE:
            return et.getLatitude();
        case INDEX_LOCATION:
            return et.getLocation();
        case INDEX_MOTTO:
            return et.getMotto();
        case INDEX_ORGCODE:
            return et.getOrgCode();
        case INDEX_INLINE:
            return et.getINLINE();
        case INDEX_GRADE:
            return et.getGrade();
        case INDEX_POWER:
            return et.getPOWER();
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

        LVXIN_USER.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(LVXIN_USER et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.setACCOUNT(DataObject.getStringValue(obj));
            return ;
        case INDEX_PASSWORD:
            et.setPassword(DataObject.getStringValue(obj));
            return ;
        case INDEX_NAME:
            et.setNAME(DataObject.getStringValue(obj));
            return ;
        case INDEX_GENDER:
            et.setGENDER(DataObject.getStringValue(obj));
            return ;
        case INDEX_TELEPHONE:
            et.setTelephone(DataObject.getStringValue(obj));
            return ;
        case INDEX_EMAIL:
            et.setEmail(DataObject.getStringValue(obj));
            return ;
        case INDEX_LONGITUDE:
            et.setLongitude(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_LATITUDE:
            et.setLatitude(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_LOCATION:
            et.setLocation(DataObject.getStringValue(obj));
            return ;
        case INDEX_MOTTO:
            et.setMotto(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGCODE:
            et.setOrgCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_INLINE:
            et.setINLINE(DataObject.getStringValue(obj));
            return ;
        case INDEX_GRADE:
            et.setGrade(DataObject.getStringValue(obj));
            return ;
        case INDEX_POWER:
            et.setPOWER(DataObject.getStringValue(obj));
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

        return  LVXIN_USER.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(LVXIN_USER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.getACCOUNT()==null;
        case INDEX_PASSWORD:
            return et.getPassword()==null;
        case INDEX_NAME:
            return et.getNAME()==null;
        case INDEX_GENDER:
            return et.getGENDER()==null;
        case INDEX_TELEPHONE:
            return et.getTelephone()==null;
        case INDEX_EMAIL:
            return et.getEmail()==null;
        case INDEX_LONGITUDE:
            return et.getLongitude()==null;
        case INDEX_LATITUDE:
            return et.getLatitude()==null;
        case INDEX_LOCATION:
            return et.getLocation()==null;
        case INDEX_MOTTO:
            return et.getMotto()==null;
        case INDEX_ORGCODE:
            return et.getOrgCode()==null;
        case INDEX_INLINE:
            return et.getINLINE()==null;
        case INDEX_GRADE:
            return et.getGrade()==null;
        case INDEX_POWER:
            return et.getPOWER()==null;
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

        return  LVXIN_USER.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(LVXIN_USER et,int index) throws Exception {

        switch(index) {
        case INDEX_ACCOUNT:
            return et.isACCOUNTDirty();
        case INDEX_PASSWORD:
            return et.isPasswordDirty();
        case INDEX_NAME:
            return et.isNAMEDirty();
        case INDEX_GENDER:
            return et.isGENDERDirty();
        case INDEX_TELEPHONE:
            return et.isTelephoneDirty();
        case INDEX_EMAIL:
            return et.isEmailDirty();
        case INDEX_LONGITUDE:
            return et.isLongitudeDirty();
        case INDEX_LATITUDE:
            return et.isLatitudeDirty();
        case INDEX_LOCATION:
            return et.isLocationDirty();
        case INDEX_MOTTO:
            return et.isMottoDirty();
        case INDEX_ORGCODE:
            return et.isOrgCodeDirty();
        case INDEX_INLINE:
            return et.isINLINEDirty();
        case INDEX_GRADE:
            return et.isGradeDirty();
        case INDEX_POWER:
            return et.isPOWERDirty();
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
    private static  void fillJSONObject(LVXIN_USER et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getACCOUNT()!=null) {
            JSONObjectHelper.put(json,"account",getJSONValue(et.getACCOUNT()),false);
        }
        if(bIncEmpty||et.getPassword()!=null) {
            JSONObjectHelper.put(json,"password",getJSONValue(et.getPassword()),false);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            JSONObjectHelper.put(json,"name",getJSONValue(et.getNAME()),false);
        }
        if(bIncEmpty||et.getGENDER()!=null) {
            JSONObjectHelper.put(json,"gender",getJSONValue(et.getGENDER()),false);
        }
        if(bIncEmpty||et.getTelephone()!=null) {
            JSONObjectHelper.put(json,"telephone",getJSONValue(et.getTelephone()),false);
        }
        if(bIncEmpty||et.getEmail()!=null) {
            JSONObjectHelper.put(json,"email",getJSONValue(et.getEmail()),false);
        }
        if(bIncEmpty||et.getLongitude()!=null) {
            JSONObjectHelper.put(json,"longitude",getJSONValue(et.getLongitude()),false);
        }
        if(bIncEmpty||et.getLatitude()!=null) {
            JSONObjectHelper.put(json,"latitude",getJSONValue(et.getLatitude()),false);
        }
        if(bIncEmpty||et.getLocation()!=null) {
            JSONObjectHelper.put(json,"location",getJSONValue(et.getLocation()),false);
        }
        if(bIncEmpty||et.getMotto()!=null) {
            JSONObjectHelper.put(json,"motto",getJSONValue(et.getMotto()),false);
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            JSONObjectHelper.put(json,"orgcode",getJSONValue(et.getOrgCode()),false);
        }
        if(bIncEmpty||et.getINLINE()!=null) {
            JSONObjectHelper.put(json,"inline",getJSONValue(et.getINLINE()),false);
        }
        if(bIncEmpty||et.getGrade()!=null) {
            JSONObjectHelper.put(json,"grade",getJSONValue(et.getGrade()),false);
        }
        if(bIncEmpty||et.getPOWER()!=null) {
            JSONObjectHelper.put(json,"power",getJSONValue(et.getPOWER()),false);
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
    private static void fillXmlNode(LVXIN_USER et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getACCOUNT()!=null) {
            Object obj = et.getACCOUNT();
            node.setAttribute("ACCOUNT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPassword()!=null) {
            Object obj = et.getPassword();
            node.setAttribute("PASSWORD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getNAME()!=null) {
            Object obj = et.getNAME();
            node.setAttribute("NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getGENDER()!=null) {
            Object obj = et.getGENDER();
            node.setAttribute("GENDER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTelephone()!=null) {
            Object obj = et.getTelephone();
            node.setAttribute("TELEPHONE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEmail()!=null) {
            Object obj = et.getEmail();
            node.setAttribute("EMAIL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLongitude()!=null) {
            Object obj = et.getLongitude();
            node.setAttribute("LONGITUDE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLatitude()!=null) {
            Object obj = et.getLatitude();
            node.setAttribute("LATITUDE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLocation()!=null) {
            Object obj = et.getLocation();
            node.setAttribute("LOCATION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMotto()!=null) {
            Object obj = et.getMotto();
            node.setAttribute("MOTTO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            Object obj = et.getOrgCode();
            node.setAttribute("ORGCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getINLINE()!=null) {
            Object obj = et.getINLINE();
            node.setAttribute("INLINE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getGrade()!=null) {
            Object obj = et.getGrade();
            node.setAttribute("GRADE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOWER()!=null) {
            Object obj = et.getPOWER();
            node.setAttribute("POWER",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        LVXIN_USER.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(LVXIN_USER et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isACCOUNTDirty() && (bIncEmpty||et.getACCOUNT()!=null)) {
            dst.set(FIELD_ACCOUNT,et.getACCOUNT());
        }
        if(et.isPasswordDirty() && (bIncEmpty||et.getPassword()!=null)) {
            dst.set(FIELD_PASSWORD,et.getPassword());
        }
        if(et.isNAMEDirty() && (bIncEmpty||et.getNAME()!=null)) {
            dst.set(FIELD_NAME,et.getNAME());
        }
        if(et.isGENDERDirty() && (bIncEmpty||et.getGENDER()!=null)) {
            dst.set(FIELD_GENDER,et.getGENDER());
        }
        if(et.isTelephoneDirty() && (bIncEmpty||et.getTelephone()!=null)) {
            dst.set(FIELD_TELEPHONE,et.getTelephone());
        }
        if(et.isEmailDirty() && (bIncEmpty||et.getEmail()!=null)) {
            dst.set(FIELD_EMAIL,et.getEmail());
        }
        if(et.isLongitudeDirty() && (bIncEmpty||et.getLongitude()!=null)) {
            dst.set(FIELD_LONGITUDE,et.getLongitude());
        }
        if(et.isLatitudeDirty() && (bIncEmpty||et.getLatitude()!=null)) {
            dst.set(FIELD_LATITUDE,et.getLatitude());
        }
        if(et.isLocationDirty() && (bIncEmpty||et.getLocation()!=null)) {
            dst.set(FIELD_LOCATION,et.getLocation());
        }
        if(et.isMottoDirty() && (bIncEmpty||et.getMotto()!=null)) {
            dst.set(FIELD_MOTTO,et.getMotto());
        }
        if(et.isOrgCodeDirty() && (bIncEmpty||et.getOrgCode()!=null)) {
            dst.set(FIELD_ORGCODE,et.getOrgCode());
        }
        if(et.isINLINEDirty() && (bIncEmpty||et.getINLINE()!=null)) {
            dst.set(FIELD_INLINE,et.getINLINE());
        }
        if(et.isGradeDirty() && (bIncEmpty||et.getGrade()!=null)) {
            dst.set(FIELD_GRADE,et.getGrade());
        }
        if(et.isPOWERDirty() && (bIncEmpty||et.getPOWER()!=null)) {
            dst.set(FIELD_POWER,et.getPOWER());
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
        return  LVXIN_USER.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(LVXIN_USER et,int index) throws Exception {
        switch(index) {
        case INDEX_ACCOUNT:
            et.resetACCOUNT();
            return true;
        case INDEX_PASSWORD:
            et.resetPassword();
            return true;
        case INDEX_NAME:
            et.resetNAME();
            return true;
        case INDEX_GENDER:
            et.resetGENDER();
            return true;
        case INDEX_TELEPHONE:
            et.resetTelephone();
            return true;
        case INDEX_EMAIL:
            et.resetEmail();
            return true;
        case INDEX_LONGITUDE:
            et.resetLongitude();
            return true;
        case INDEX_LATITUDE:
            et.resetLatitude();
            return true;
        case INDEX_LOCATION:
            et.resetLocation();
            return true;
        case INDEX_MOTTO:
            et.resetMotto();
            return true;
        case INDEX_ORGCODE:
            et.resetOrgCode();
            return true;
        case INDEX_INLINE:
            et.resetINLINE();
            return true;
        case INDEX_GRADE:
            et.resetGrade();
            return true;
        case INDEX_POWER:
            et.resetPOWER();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }






    /**
     *  获取代理的数据对象
     */
    private LVXIN_USER getProxyEntity() {
        return this.proxyLVXIN_USER;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyLVXIN_USER = null;
        if(proxyDataObject!=null && proxyDataObject instanceof LVXIN_USER) {
            this.proxyLVXIN_USER = (LVXIN_USER)proxyDataObject;
        }

    }

}