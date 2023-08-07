package telran.strings;

public class Strings {
	private static String operand() {
		return "(_[a-zA-Z0-9$_]+|[a-zA-Z0-9$_]*\\.[a-zA-Z0-9$_]+|[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]*|[a-zA-Z0-9$][a-zA-Z0-9$_]*)";
	}
	private static String operator() {
		return "(\\+|\\-|\\*|\\/)";
	}
	static public String arithmeticExpression() {
		String operand = operand();
		String operator = operator();
		return String.format("\\s*(%s\\s*%s\\s*)*%s\\s*", operand, operator, operand);
	}
}
