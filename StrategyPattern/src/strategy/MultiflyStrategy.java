package strategy;
/**
 * ������Խ�ɫ���˷�����
 * @author Administrator
 */
public class MultiflyStrategy implements Strategy{
	//��������ֵ���
	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}
}
