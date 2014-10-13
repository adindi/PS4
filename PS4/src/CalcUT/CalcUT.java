package CalcUT;

import static org.junit.Assert.*;
import org.junit.Test;
import CalcEngine.CalcEngine;

public class CalcUT extends CalcEngine {

	@Test
	public final void test() {
		CalcEngine test = new CalcEngine();
		double result = test.returnCalcEngine(10000, 3, 3.25);
		assertEquals(11022.77,result,.001);
	}

}