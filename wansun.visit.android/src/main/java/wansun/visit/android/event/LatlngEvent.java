package wansun.visit.android.event;

/**
 * Created by User on 2019/12/12.
 */

public class LatlngEvent {
    public  double lat;
    public  double lng;
    public  String currentAddress;
    public  LatlngEvent( double lat,double lng,String currentAddress){
        this.lat=lat;
        this.lng=lng;
        this.currentAddress=currentAddress;

    }

}
