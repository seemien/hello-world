/*Seemien Ahmed
 * Assignment 4
 * ExpressionSolver
 * Assignment 3
 * CSC 201
 * Design and implement a utility class "ExpressionSolver" to solve any expression.
 * Precondition: Create five tokens,three floats, two operators. 
 * Post-condition: Evaluate the three operands using the two operators. Bring
 * in one more operator and one more operand and evaluate until the end of expression is reached.
 * Write a driver program to read expressions from a text file (one expression on each line)
 * and print out the original expressions and their evaluated results on screen. 
 */
public class expression {

	private static String expression = "";
	private static int index = 0;
	private static double r = 0;

	public static double solve(String exp) {
		System.out.println("Original expression is [" + exp + "]");
		index = 0;
		expression = exp;

		double r = 0;
		double o1, o2, o3;
		char op1, op2 = 0;

		try {

			o1 = getOperand();
			op1 = getOperator();
			o2 = getOperand();

			while (index < exp.length()) // use the while loop to move through
				// the expression
			{
				op2 = getOperator();
				o3 = getOperand();

				// eval the 1st operator
				if (op1 == '*' || op1 == '/') {
					o1 = evaluateTwoOp(o1, op1, o2);
					op1 = op2;
					o2 = o3;
				} else // eval the 2nd operator
					if (op2 == '*' || op2 == '/') {
						o2 = evaluateTwoOp(o2, op2, o3);
					} else // eval the 1st operator
					{
						o1 = evaluateTwoOp(o1, op1, o2);
						op1 = op2;
						o2 = o3;

					}
			}

			// eval the last operator left
			o1 = evaluateTwoOp(o1, op1, o2);

			r = o1;

		} catch (Exception e) {
			System.out.println("Some exception occurred..." + e.getMessage());
		}

		return (r);
	}

	//// following method evaluates expression inside the brackets//////

	public static boolean hasParen(String exp) {

		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(') {
				return true;
			}
		}

		return false;
	}

	public static double evalParen(String exp) {

		String nExp = "";
		String finalExp = "";

		while (hasParen(exp)) {
			for (int i = 0; i < exp.length(); i++) {
				if (exp.charAt(i) == ')') {
					for (int j = i; j >= 0; j--) {
						if (exp.charAt(j) == '(') {
							double num = solve(exp.substring(j + 1, i));

							int numI = (int) (num + 0.5d);

							String s1 = exp.substring(0, j);
							String s2 = exp.substring(i + 1);
							nExp = s1 + numI + s2;
							exp = nExp;
							finalExp = nExp;
							break;
						}
					}
				}
			}
		}

		return solve(finalExp);
	}

	// use if-else to evaluate operator and operand////

	private static double evaluateTwoOp(double o1, char op1, double o2) {
		double r = 0;
		try {

			if (op1 == '+') {
				r = o1 + o2;
			} else if (op1 == '-') {
				r = o1 - o2;
			} else if (op1 == '*') {
				r = o1 * o2;
			} else if (op1 == '/') {
				r = o1 / o2;
			}
		} catch (Exception e) {
			System.out.println("Some exception occurred..." + e.getMessage());
		}
		return (r);
	}

	// use method getOperand to get the operand from expression
	private static double getOperand() {
		String s = "" + "";
		try {
			while (index < expression.length() &&

					expression.charAt(index) != '+' && expression.charAt(index) != '-'
					&& expression.charAt(index) != '*' && expression.charAt(index) != '/'
					&& expression.charAt(index) != '.' && expression.charAt(index) != '('
					&& expression.charAt(index) != ')')

			{
				s += expression.charAt(index);
				index++;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			r = Double.parseDouble(s);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // +e.getMessage());
		}

		return r;

	}

	private static char getOperator() {

		char o = 0;
		try {
			o = expression.charAt(index);
			index++;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return o;
	}

}