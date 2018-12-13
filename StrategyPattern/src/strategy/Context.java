package strategy;
/**
 * 环境角色，拥有一个抽象策略角色的引用，供调用方使用
 * @author Administrator
 */
public class Context {
	//拥有的抽象接口的引用
	public Strategy strategy;
	//有参构造方法
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	//计算
	public int calc(int num1,int num2) {
		return strategy.calculate(num1, num2);
	}
}
