package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2020/4/17.
 */

public class VisitAnnexUrgeBean {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : {"annexs":[{"name":"2d577b4d-90c7-404f-9da3-3097fcc097b1.jpg","url":"BUL/BUL-20191201-003-000156/2d577b4d-90c7-404f-9da3-3097fcc097b1.jpg","type":"照片"},{"name":"95b1a178-9d46-482c-90e3-38866cd2ee92.mp3","url":"BUL/BUL-20191201-003-000156/95b1a178-9d46-482c-90e3-38866cd2ee92.mp3","type":"录音文件"},{"name":"be040cbe-59af-4b50-9776-73fbe5a898fb.mp3","url":"BUL/BUL-20191201-003-000156/be040cbe-59af-4b50-9776-73fbe5a898fb.mp3","type":"录音文件"}],"urgeRecords":[{"caseCode":"BUL-20191201-003-000156","operateTypeText":"上门催收","operateContent":"也是测试 天气很好","operatorName":"szwsyyy001(yyyyy)","operateTime":1587023999410,"gpsAddress":"广东省深圳市在民治附近","visitObjectName":"深圳阿呆家居有限责任公司"},{"caseCode":"BUL-20191201-003-000156","operateTypeText":"上门催收","operateContent":"测试","operatorName":"szwsyyy001(yyyyy)","operateTime":1587090951688,"gpsAddress":"广东省深圳市在展滔科技大厦-C座附近","visitObjectName":"深圳阿呆家居有限责任公司"},{"caseCode":"BUL-20191201-003-000156","operateTypeText":"上门催收","operateContent":"测试数据查阅","operatorName":"szwsyyy001(yyyyy)","operateTime":1587108947044,"gpsAddress":"广东省深圳市在展滔科技大厦-C座附近","visitObjectName":"深圳阿呆家居有限责任公司"}],"audio":[]}
     */

    private String statusID;
    private String message;
    private String dataType;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<AnnexsBean> annexs;
        private List<UrgeRecordsBean> urgeRecords;
        private List<?> audio;

        public List<AnnexsBean> getAnnexs() {
            return annexs;
        }

        public void setAnnexs(List<AnnexsBean> annexs) {
            this.annexs = annexs;
        }

        public List<UrgeRecordsBean> getUrgeRecords() {
            return urgeRecords;
        }

        public void setUrgeRecords(List<UrgeRecordsBean> urgeRecords) {
            this.urgeRecords = urgeRecords;
        }

        public List<?> getAudio() {
            return audio;
        }

        public void setAudio(List<?> audio) {
            this.audio = audio;
        }

        public static class AnnexsBean {
            /**
             * name : 2d577b4d-90c7-404f-9da3-3097fcc097b1.jpg
             * url : BUL/BUL-20191201-003-000156/2d577b4d-90c7-404f-9da3-3097fcc097b1.jpg
             * type : 照片
             */

            private String name;
            private String url;
            private String type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class UrgeRecordsBean {
            /**
             * caseCode : BUL-20191201-003-000156
             * operateTypeText : 上门催收
             * operateContent : 也是测试 天气很好
             * operatorName : szwsyyy001(yyyyy)
             * operateTime : 1587023999410
             * gpsAddress : 广东省深圳市在民治附近
             * visitObjectName : 深圳阿呆家居有限责任公司
             */

            private String caseCode;
            private String operateTypeText;
            private String operateContent;
            private String operatorName;
            private long operateTime;
            private String gpsAddress;
            private String visitObjectName;

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

            public String getOperateContent() {
                return operateContent;
            }

            public void setOperateContent(String operateContent) {
                this.operateContent = operateContent;
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

            public String getVisitObjectName() {
                return visitObjectName;
            }

            public void setVisitObjectName(String visitObjectName) {
                this.visitObjectName = visitObjectName;
            }
        }
    }
}
