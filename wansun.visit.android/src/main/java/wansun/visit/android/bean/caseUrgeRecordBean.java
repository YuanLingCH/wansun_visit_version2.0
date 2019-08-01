package wansun.visit.android.bean;

import java.util.List;

/**
 * Created by User on 2019/3/4.
 */

public class caseUrgeRecordBean {


    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : [{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577728179","measure":"无","operateDate":1562645201733,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13208778822","measure":"无","operateDate":1562638603015,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13208778822","measure":"无","operateDate":1562636915405,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13628777614","measure":"无","operateDate":1562636726561,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577728179","measure":"无","operateDate":1562144011324,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577749992","measure":"无","operateDate":1562142866237,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577728179","measure":"无","operateDate":1562140483035,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577749992","measure":"通话中","operateDate":1562051929095,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"13577728179","measure":"关机","operateDate":1562051818189,"operator":"kmws273"},{"promiseAmount":null,"promiseDate":null,"operateTypeDecoration":"电催","operateObjectContent":"0877-4963327","measure":"无法接通","operateDate":1562051665308,"operator":"kmws273"}]
     * page : {"counts":10,"pageNum":1,"pageSize":20}
     */

    private String statusID;
    private String message;
    private String dataType;
    private PageBean page;
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

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PageBean {
        /**
         * counts : 10
         * pageNum : 1
         * pageSize : 20
         */

        private int counts;
        private int pageNum;
        private int pageSize;

        public int getCounts() {
            return counts;
        }

        public void setCounts(int counts) {
            this.counts = counts;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    public static class DataBean {
        /**
         * promiseAmount : null
         * promiseDate : null
         * operateTypeDecoration : 电催
         * operateObjectContent : 13577728179
         * measure : 无
         * operateDate : 1562645201733
         * operator : kmws273
         */

        private Object promiseAmount;
        private long promiseDate;
        private String operateTypeDecoration;
        private String operateObjectContent;
        private String measure;
        private long operateDate;
        private String operator;

        public Object getPromiseAmount() {
            return promiseAmount;
        }

        public void setPromiseAmount(Object promiseAmount) {
            this.promiseAmount = promiseAmount;
        }

        public long getPromiseDate() {
            return promiseDate;
        }

        public void setPromiseDate(long promiseDate) {
            this.promiseDate = promiseDate;
        }

        public String getOperateTypeDecoration() {
            return operateTypeDecoration;
        }

        public void setOperateTypeDecoration(String operateTypeDecoration) {
            this.operateTypeDecoration = operateTypeDecoration;
        }

        public String getOperateObjectContent() {
            return operateObjectContent;
        }

        public void setOperateObjectContent(String operateObjectContent) {
            this.operateObjectContent = operateObjectContent;
        }

        public String getMeasure() {
            return measure;
        }

        public void setMeasure(String measure) {
            this.measure = measure;
        }

        public long getOperateDate() {
            return operateDate;
        }

        public void setOperateDate(long operateDate) {
            this.operateDate = operateDate;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }
    }
}
