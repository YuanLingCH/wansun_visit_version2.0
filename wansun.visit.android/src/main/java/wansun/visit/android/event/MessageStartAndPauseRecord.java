package wansun.visit.android.event;

/**
 *
 * Created by User on 2019/9/27.
 */

public class MessageStartAndPauseRecord {
    public int RECORD_START=0X01;
    public  int RECORD_PAUSE=0X02;

    public MessageStartAndPauseRecord(int start,int pause){
        this.RECORD_START=-start;
        this.RECORD_PAUSE=pause;
    }



    public int getRECORD_START() {
        return RECORD_START;
    }

    public void setRECORD_START(int RECORD_START) {
        this.RECORD_START = RECORD_START;
    }

    public int getRECORD_PAUSE() {
        return RECORD_PAUSE;
    }

    public void setRECORD_PAUSE(int RECORD_PAUSE) {
        this.RECORD_PAUSE = RECORD_PAUSE;
    }
}
