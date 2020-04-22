package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2020/4/17.
 */

public class VisitAnnexPicturesBean {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : [{"name":"66a87d99-f792-466e-b569-4b2d7ccb8e2a.png","url":"BUL/BUL-20191201-003-000187/66a87d99-f792-466e-b569-4b2d7ccb8e2a.png","type":"照片"},{"name":"03369ec6-6b81-4727-9d05-e567dbd15b22.jpg","url":"BUL/BUL-20191201-003-000187/03369ec6-6b81-4727-9d05-e567dbd15b22.jpg","type":"照片"},{"name":"8b6b1b5f-8807-41c3-804e-65ba2b4f02d5.jpg","url":"BUL/BUL-20191201-003-000187/8b6b1b5f-8807-41c3-804e-65ba2b4f02d5.jpg","type":"照片"},{"name":"b9099c52-0a35-4258-9a83-d17688249c3b.jpg","url":"BUL/BUL-20191201-003-000187/b9099c52-0a35-4258-9a83-d17688249c3b.jpg","type":"照片"}]
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
         * name : 66a87d99-f792-466e-b569-4b2d7ccb8e2a.png
         * url : BUL/BUL-20191201-003-000187/66a87d99-f792-466e-b569-4b2d7ccb8e2a.png
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
}
