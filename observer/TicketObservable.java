package observer;

import java.util.Observable;

public class TicketObservable extends Observable {
	private TicketStatus status;

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {

		this.status = status;
		setChanged();
		notifyObservers();
	}

}
