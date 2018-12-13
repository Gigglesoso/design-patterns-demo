package strategy;
/**
 * 具体策略角色：乘法策略
 * @author Administrator
 */
public class MultiflyStrategy implements Strategy{
	//返回两个值相加
	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}
}
