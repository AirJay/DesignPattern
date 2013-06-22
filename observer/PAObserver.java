package observer;

import java.util.Observable;
import java.util.Observer;


public class PAObserver implements Observer {

	public void update(Observable o, Object arg) {
		TicketObservable to = (TicketObservable)o;
		if (to.getStatus().equals(TicketStatus.FIXED))
			System.out.println("From PA: Ok,we will do the test");
		else
			System.out.println("From PA: Developer, Hurry up!");
		
	}

}
