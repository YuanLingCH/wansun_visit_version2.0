package wansun.visit.android.bean;

import java.io.Serializable;

/**
 * Created by User on 2019/7/25.
 */

public class collectionRrecordsBean  implements Serializable{
    private String name;
    private String urgeTypeName;
    private  String callRecords; //通话记录
    private Object remark;
    private long createDate;
    private String phone;
    private String address;
    private String contactSummaryText;
    private String contactResultText;
    private String creator;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrgeTypeName() {
        return urgeTypeName;
    }

    public void setUrgeTypeName(String urgeTypeName) {
        this.urgeTypeName = urgeTypeName;
    }

    public String getCallRecords() {
        return callRecords;
    }

    public void setCallRecords(String callRecords) {
        this.callRecords = callRecords;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactSummaryText() {
        return contactSummaryText;
    }

    public void setContactSummaryText(String contactSummaryText) {
        this.contactSummaryText = contactSummaryText;
    }

    public String getContactResultText() {
        return contactResultText;
    }

    public void setContactResultText(String contactResultText) {
        this.contactResultText = contactResultText;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
