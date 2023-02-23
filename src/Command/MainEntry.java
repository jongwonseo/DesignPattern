package Command;

public class MainEntry {

	public static void main(String[] args) {
		CommandGroup cmdGroup = new CommandGroup();
		
		
		Command clearCmd = new ClearCommand();
		System.out.println("asdasdasd");
		cmdGroup.add(clearCmd);

		Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
		cmdGroup.add(yellowColorCmd);
		
		Command moveCmd = new MoveCommand(10, 1);
		cmdGroup.add(moveCmd);
		
		Command printCmd = new PrintCommand("Hello!!!");
		cmdGroup.add(printCmd);
		
		Command moveCmd2 = new MoveCommand(15, 5);
		cmdGroup.add(moveCmd2);
		
		cmdGroup.run();

	}

}
