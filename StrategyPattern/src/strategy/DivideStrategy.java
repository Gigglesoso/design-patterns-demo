package strategy;
/**
 * 具体策略角色：除法策略
 * @author Administrator
 */
public class DivideStrategy implements Strategy{

	@Override
	public int calculate(int num1, int num2) {
		return num1 / num2;
	}

}
