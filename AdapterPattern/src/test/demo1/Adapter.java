package test.demo1;
/*��������ģʽ��*/
/* ������Ҫ���ʵĽӿ�A��û��������Ҫ�ķ��� ��ȴ����һ���ӿ�B�з����˺��ʵķ����������ֲ��ܸı���ʽӿ�A��
 * ����������£����ǿ��Զ���һ��������p��������ת�����������pҪʵ�����Ƿ��ʵĽӿ�A���������Ǿ��ܼ�����
 * �ʵ�ǰ�ӿ�A�еķ�������Ȼ��Ŀǰ�������ǵĲˣ���Ȼ���ټ̳нӿ�B��ʵ����BB���������ǿ�����������P�з���
 * �ӿ�B�ķ����ˣ���ʱ������������P�еĽӿ�A������ֱ������BB�еĺ��ʷ����������������һ���򵥵�����������*/
public class Adapter extends Usber implements Ps2{

	@Override
	public void isPs2() {
		isUsb();
	}
	
	public static void main(String[] args) {
        Ps2 p = new Adapter();
        p.isPs2();
	}
}