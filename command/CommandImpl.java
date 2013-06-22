package command;

public class CommandImpl extends Command{

	public CommandImpl(Reciever reciever) {
		super(reciever);
		
	}

	public void execute() {
		reciever.action();
		
	}

}
