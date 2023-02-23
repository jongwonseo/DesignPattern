package Interpreter;

public class BeginExpression implements Expression{
	private CommandListExpression expression;
	  
	@Override
	public boolean parse(Context context) {
		if(CheckValidKeyword(context.getCurrentKeywrod())) {
			context.readNextKeyword();
			expression = new CommandListExpression();
			return expression.parse(context);
		}else
			return false;
	}

	@Override
	public boolean run() {
		return expression.run();
	}
	
	private static boolean CheckValidKeyword(String keyword) {
		return keyword.equals("BEGIN");
	}
	
	@Override
	public String toString() {
		return "BEGIN" + expression;
	}
}
