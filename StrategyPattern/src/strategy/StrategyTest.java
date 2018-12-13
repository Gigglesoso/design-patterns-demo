package strategy;
/**
 * ≤‚ ‘¿‡
 * @author Administrator
 *
 */
public class StrategyTest {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		AddStrategy addStrategy = new AddStrategy();
		Context context = new Context(addStrategy);
		int calc = context.calc(num1, num2);
		System.out.println(calc);
	}
}
