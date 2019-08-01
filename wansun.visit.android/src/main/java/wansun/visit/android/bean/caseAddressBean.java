package wansun.visit.android.bean;

import java.io.Serializable;

/**
 * Created by User on 2019/7/25.
 */

public class caseAddressBean implements Serializable{
    /**
     * addressStatusRemark : null
     * address2 : 抵押物地址2
     * addressTypeText : 抵押物地址
     * country : null
     * addressStatusText : 有效
     * city : null
     * address1 : 抵押物地址1
     * postCode : 7878
     * addressType : 6
     * province : null
     * addressStatus : 1
     * addressGuId : 6a735ec7-b969-4672-b169-1b2b37f407eb
     * creator : szadmin
     * createDate : 1563957421380
     * isDel : false
     * remark : 备注测试数据
     * isVisited : false
     * isLetter : false
     * address1Ext : null
     * address2Ext : null
     */

    private Object addressStatusRemark;
    private String address2;
    private String addressTypeText;
    private Object country;
    private String addressStatusText;
    private Object city;
    private String address1;
    private String postCode;
    private int addressType;
    private Object province;
    private int addressStatus;
    private String addressGuId;
    private String creator;
    private long createDate;
    private boolean isDel;
    private String remark;
    private boolean isVisited;
    private boolean isLetter;
    private Object address1Ext;
    private Object address2Ext;
    private String name;
    private String RelationText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationText() {
        return RelationText;
    }

    public void setRelationText(String relationText) {
        RelationText = relationText;
    }

    public Object getAddressStatusRemark() {
        return addressStatusRemark;
    }

    public void setAddressStatusRemark(Object addressStatusRemark) {
        this.addressStatusRemark = addressStatusRemark;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddressTypeText() {
        return addressTypeText;
    }

    public void setAddressTypeText(String addressTypeText) {
        this.addressTypeText = addressTypeText;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getAddressStatusText() {
        return addressStatusText;
    }

    public void setAddressStatusText(String addressStatusText) {
        this.addressStatusText = addressStatusText;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getAddressType() {
        return addressType;
    }

    public void setAddressType(int addressType) {
        this.addressType = addressType;
    }

    public Object getProvince() {
        return province;
    }

    public void setProvince(Object province) {
        this.province = province;
    }

    public int getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(int addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getAddressGuId() {
        return addressGuId;
    }

    public void setAddressGuId(String addressGuId) {
        this.addressGuId = addressGuId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public boolean isIsLetter() {
        return isLetter;
    }

    public void setIsLetter(boolean isLetter) {
        this.isLetter = isLetter;
    }

    public Object getAddress1Ext() {
        return address1Ext;
    }

    public void setAddress1Ext(Object address1Ext) {
        this.address1Ext = address1Ext;
    }

    public Object getAddress2Ext() {
        return address2Ext;
    }

    public void setAddress2Ext(Object address2Ext) {
        this.address2Ext = address2Ext;
    }
}
