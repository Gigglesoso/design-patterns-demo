package strategy;
/**
 * ������ɫ��ӵ��һ��������Խ�ɫ�����ã������÷�ʹ��
 * @author Administrator
 */
public class Context {
	//ӵ�еĳ���ӿڵ�����
	public Strategy strategy;
	//�вι��췽��
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	//����
	public int calc(int num1,int num2) {
		return strategy.calculate(num1, num2);
	}
}
