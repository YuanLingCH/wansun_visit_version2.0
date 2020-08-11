package wansun.visit.android.bean;

/**
 * Created by User on 2020/6/15.
 */

public class TokenBean {
    private String statusID;
    private String message;
    private String dataType;

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
}
