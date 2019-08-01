package wansun.visit.android.event;

/**
 * Created by User on 2019/3/12.
 */

public class MessageEvent {
   public String  filePath;

    public MessageEvent(String filePath) {
        this.filePath = filePath;

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
