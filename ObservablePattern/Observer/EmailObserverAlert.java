package ObservablePattern.Observer;

import ObservablePattern.Observable.StocksObservable;

public class EmailObserverAlert implements NotificationAlertObserver {
    String emailId;
    //Constructor Injection...
    //Not using Instance of ....
    StocksObservable observable;
    public EmailObserverAlert(String emailId,StocksObservable observable){
        this.observable=observable;
        this.emailId=emailId;
    }
    @Override
    public void update(){
      sendMail(emailId,"Product is in stock hurry up");
    }

    private void sendMail(String emailId,String msg){
        System.out.println("mail message sent to : " + emailId);
    }
    
}
