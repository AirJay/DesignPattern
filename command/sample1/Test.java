package command.sample1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Command> list=new ArrayList<Command>();  

        list.add(new Manager());  

        list.add(new Programer());  

        for (Command commond : list) {  

            commond.execute();  

        }  

	}

}
