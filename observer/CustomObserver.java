package observer;

import java.util.Observable;
import java.util.Observer;


public class CustomObserver implements Observer {

	public void update(Observable o, Object arg) {
		TicketObservable to = (TicketObservable)o;
		if (to.getStatus().equals(TicketStatus.CLOSED))
			System.out.println("From Customer: Great! Thanks.");
		else
			System.out.println("From Customer: Hurry up!");
		
	}

}
