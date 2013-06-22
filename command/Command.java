package command;

public abstract class Command {
	protected Reciever reciever;
	
	public Command(Reciever reciever){
		this.reciever = reciever;
	}
	
	public abstract void execute();

}
