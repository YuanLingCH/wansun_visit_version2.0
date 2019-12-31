package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2019/10/23.
 */

public class performancCountsBean {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : [{"caseCode":"AAE-20190702-001-000104","operateTypeText":"上门催收","operatorName":"szadmin","operateTime":1571796298998,"gpsAddress":"深圳龙华明治大道展滔科技大厦"},{"caseCode":"AAE-20190702-001-000104","operateTypeText":"上门催收","operatorName":"szadmin","operateTime":1571800633574,"gpsAddress":"广东省深圳市在展滔科技大厦-C座附近"},{"caseCode":"AAE-20190702-001-000104","operateTypeText":"上门催收","operatorName":"szadmin","operateTime":1571800726565,"gpsAddress":"广东省深圳市在展滔科技大厦-C座附近"},{"caseCode":"AAE-20190702-001-000104","operateTypeText":"上门催收","operatorName":"szadmin","operateTime":1571815675754,"gpsAddress":"广东省深圳市在展滔科技大厦-C座附近"}]
     */

    private String statusID;
    private String message;
    private String dataType;
    private List<DataBean> data;

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * caseCode : AAE-20190702-001-000104
         * operateTypeText : 上门催收
         * operatorName : szadmin
         * operateTime : 1571796298998
         * gpsAddress : 深圳龙华明治大道展滔科技大厦
         * visitObjectName
         */

        private String caseCode;
        private String operateTypeText;
        private String operatorName;
        private long operateTime;
        private String gpsAddress;
        private String visitObjectName;

        public String getVisitObjectName() {
            return visitObjectName;
        }

        public void setVisitObjectName(String visitObjectName) {
            this.visitObjectName = visitObjectName;
        }

        public String getCaseCode() {
            return caseCode;
        }

        public void setCaseCode(String caseCode) {
            this.caseCode = caseCode;
        }

        public String getOperateTypeText() {
            return operateTypeText;
        }

        public void setOperateTypeText(String operateTypeText) {
            this.operateTypeText = operateTypeText;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public long getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(long operateTime) {
            this.operateTime = operateTime;
        }

        public String getGpsAddress() {
            return gpsAddress;
        }

        public void setGpsAddress(String gpsAddress) {
            this.gpsAddress = gpsAddress;
        }
    }
}
