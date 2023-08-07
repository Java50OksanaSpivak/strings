package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.strings.Strings.*;

import org.junit.jupiter.api.Test;

class StringsTest {
	@Test
	void arithmeticExpressionTrueTest() {
	String regex = arithmeticExpression();
	assertTrue ("1.5 + a/2*10 -21".matches(regex));
	assertTrue (" .5 + $/2* 10.0 /21.1234".matches(regex));
	assertTrue("5. + __/2* 0.0 /0 ".matches(regex));
	assertTrue("25.".matches(regex));
	assertTrue(" aA123 ".matches(regex));
	}
	
	@Test
	void arithmeticExpressionFalseTest() {
	String regex = arithmeticExpression();
	assertFalse("1.5 # a/2*10 -21".matches(regex));
	assertFalse(".5 + $ 1/2* 10.0 /21.1234".matches(regex));
	assertFalse("5. + _/2* 0.0 /0".matches(regex));
	assertFalse("25 .".matches(regex));
	assertFalse("aA123*".matches(regex));
	assertFalse(" + a * b".matches(regex));
	}
}
