package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2020/5/20.
 */

public class fileUploadBean {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : [{"fileGuid":"f8d01385-afba-435a-a040-554e017c20cf","sourceFileName":"BVA-20190704-001-000018_20200528_115432.jpg","fileName":"9742c3a8-991d-432d-893a-b9aad7155f66.jpg","contentTypeName":"照片","contentLength":0,"filePath":"http://visit-api.cnwansun.com/visit/files/BVA/BVA-20190704-001-000018/9742c3a8-991d-432d-893a-b9aad7155f66.jpg","fileSize":1077327,"uploaderId":36,"uploaderName":null,"uploadTime":1590638894423,"isDel":false,"linkId":"1b68f1ad-1624-467d-bfe8-1b6efcf8ee4e","linkType":2,"linkTypeText":"外访单附件","remark":""}]
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
         * fileGuid : f8d01385-afba-435a-a040-554e017c20cf
         * sourceFileName : BVA-20190704-001-000018_20200528_115432.jpg
         * fileName : 9742c3a8-991d-432d-893a-b9aad7155f66.jpg
         * contentTypeName : 照片
         * contentLength : 0
         * filePath : http://visit-api.cnwansun.com/visit/files/BVA/BVA-20190704-001-000018/9742c3a8-991d-432d-893a-b9aad7155f66.jpg
         * fileSize : 1077327
         * uploaderId : 36
         * uploaderName : null
         * uploadTime : 1590638894423
         * isDel : false
         * linkId : 1b68f1ad-1624-467d-bfe8-1b6efcf8ee4e
         * linkType : 2
         * linkTypeText : 外访单附件
         * remark :
         */

        private String fileGuid;
        private String sourceFileName;
        private String fileName;
        private String contentTypeName;
        private int contentLength;
        private String filePath;
        private int fileSize;
        private int uploaderId;
        private Object uploaderName;
        private long uploadTime;
        private boolean isDel;
        private String linkId;
        private int linkType;
        private String linkTypeText;
        private String remark;

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

        public int getContentLength() {
            return contentLength;
        }

        public void setContentLength(int contentLength) {
            this.contentLength = contentLength;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
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

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
