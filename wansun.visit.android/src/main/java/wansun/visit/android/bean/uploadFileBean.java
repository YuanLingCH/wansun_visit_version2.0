package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2019/7/26.
 */

public class uploadFileBean {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : [{"fileGuid":"f61e6cfd-784f-4de6-9108-0454f47659b7","sourceFileName":"AAE-20190702-001-000036_20190726_184720.jpg","fileName":"6c3820cb-ca84-4b01-b545-c2a8de66e16f.jpg","contentTypeName":"照片","contentLength":null,"filePath":"http://192.168.166.133:8082/files/AAE/AAE-20190702-001-000036/6c3820cb-ca84-4b01-b545-c2a8de66e16f.jpg","fileSize":387829,"uploaderId":100044,"uploaderName":null,"uploadTime":1564138082396,"isDel":false,"linkId":"9d635a46-f619-4a81-8f3e-18330752f66e","linkType":2,"linkTypeText":"外访单附件","remark":null}]
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
         * fileGuid : f61e6cfd-784f-4de6-9108-0454f47659b7
         * sourceFileName : AAE-20190702-001-000036_20190726_184720.jpg
         * fileName : 6c3820cb-ca84-4b01-b545-c2a8de66e16f.jpg
         * contentTypeName : 照片
         * contentLength : null
         * filePath : http://192.168.166.133:8082/files/AAE/AAE-20190702-001-000036/6c3820cb-ca84-4b01-b545-c2a8de66e16f.jpg
         * fileSize : 387829
         * uploaderId : 100044
         * uploaderName : null
         * uploadTime : 1564138082396
         * isDel : false
         * linkId : 9d635a46-f619-4a81-8f3e-18330752f66e
         * linkType : 2
         * linkTypeText : 外访单附件
         * remark : null
         */

        private String fileGuid;
        private String sourceFileName;
        private String fileName;
        private String contentTypeName;
        private Object contentLength;
        private Object filePath;
        private int fileSize;
        private int uploaderId;
        private Object uploaderName;
        private long uploadTime;
        private boolean isDel;
        private String linkId;
        private int linkType;
        private String linkTypeText;
        private Object remark;

        public String getFileGuid() {
            return fileGuid;
        }

        public void setFileGuid(String fileGuid) {
            this.fileGuid = fileGuid;
        }

        public String getSourceFileName() {
            return sourceFileName;
        }

        public void setSourceFileName(String sourceFileName) {
            this.sourceFileName = sourceFileName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getContentTypeName() {
            return contentTypeName;
        }

        public void setContentTypeName(String contentTypeName) {
            this.contentTypeName = contentTypeName;
        }

        public Object getContentLength() {
            return contentLength;
        }

        public void setContentLength(Object contentLength) {
            this.contentLength = contentLength;
        }

        public Object getFilePath() {
            return filePath;
        }

        public void setFilePath(Object  filePath) {
            this.filePath = filePath;
        }

        public int getFileSize() {
            return fileSize;
        }

        public void setFileSize(int fileSize) {
            this.fileSize = fileSize;
        }

        public int getUploaderId() {
            return uploaderId;
        }

        public void setUploaderId(int uploaderId) {
            this.uploaderId = uploaderId;
        }

        public Object getUploaderName() {
            return uploaderName;
        }

        public void setUploaderName(Object uploaderName) {
            this.uploaderName = uploaderName;
        }

        public long getUploadTime() {
            return uploadTime;
        }

        public void setUploadTime(long uploadTime) {
            this.uploadTime = uploadTime;
        }

        public boolean isIsDel() {
            return isDel;
        }

        public void setIsDel(boolean isDel) {
            this.isDel = isDel;
        }

        public String getLinkId() {
            return linkId;
        }

        public void setLinkId(String linkId) {
            this.linkId = linkId;
        }

        public int getLinkType() {
            return linkType;
        }

        public void setLinkType(int linkType) {
            this.linkType = linkType;
        }

        public String getLinkTypeText() {
            return linkTypeText;
        }

        public void setLinkTypeText(String linkTypeText) {
            this.linkTypeText = linkTypeText;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }
    }
}
