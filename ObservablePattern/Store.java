package ObservablePattern;
import ObservablePattern.Observable.*;
import ObservablePattern.Observer.*;
public class Store {
    public static void main(String[] args) {
         StocksObservable iphoneStockObservable = new IphoneObservableImplementation();

    NotificationAlertObserver observer1 = new EmailObserverAlert("saqlainzarjisansari@gmail.com", iphoneStockObservable);
    NotificationAlertObserver observer2 = new MobileObserverAlert("9883512201", iphoneStockObservable);

    iphoneStockObservable.add(observer1);
    iphoneStockObservable.add(observer2);
    iphoneStockObservable.setStockCount(10);
    }
   

}
