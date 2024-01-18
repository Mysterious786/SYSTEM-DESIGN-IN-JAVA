package ObservablePattern.Observer;

import ObservablePattern.Observable.StocksObservable;

public class MobileObserverAlert implements NotificationAlertObserver {
    String mobileNumber;
    //Constructor Injection...
    //Not using Instance of ....
    StocksObservable observable;
    public MobileObserverAlert(String mobileNumber,StocksObservable observable){
        this.observable=observable;
        this.mobileNumber=mobileNumber;
    }
    @Override
    public void update(){
      sendMsgOnMobile(mobileNumber, "Product is in stock hurry up");
    }

    private void sendMsgOnMobile(String mobileNumber,String msg){
        System.out.println("mail message sent to : " + mobileNumber);
    }
    
}