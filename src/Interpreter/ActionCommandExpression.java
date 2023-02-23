package Interpreter;

public class ActionCommandExpression extends CommandExpression{

	public ActionCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if(!checkValidKeyword(keyword)) return false;
		
		if(context.readNextKeyword() == null) return false;
		
		return false;
	}
	
	

	public static boolean checkValidKeyword(String keyword) {
		boolean bKeywordOk = keyword.equals("FRONT") || keyword.equals("BLACK") || keyword.equals("LEFT") || keyword.equals("RIGHT");
		return bKeywordOk;
	}

	@Override
	public boolean run() {
		System.out.println("cmd: "+keyword);
		return true;
	}

	@Override
	public String toString() {
		System.out.println("cmd: "+keyword);
		return keyword;
	}

}
