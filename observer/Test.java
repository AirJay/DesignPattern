package observer;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicketObservable obs = new TicketObservable();
		CustomObserver co = new CustomObserver();
		PAObserver po = new PAObserver();
		obs.addObserver(co);
		obs.addObserver(po);
		
		obs.setStatus(TicketStatus.FIXED);
		System.out.println("-----------------------------");
		obs.setStatus(TicketStatus.CLOSED);

	}

}

