package test.demo2;
/*ԭ��ͨ�������ʵ�����������ܡ�*/
/*������Ҫ���ʵĽӿ�A��û��������Ҫ�ķ��� ��ȴ����һ���ӿ�B�з����˺��ʵķ����������ֲ��ܸı���ʽӿ�A��
 * ����������£����ǿ��Զ���һ��������p��������ת�����������pҪʵ�����Ƿ��ʵĽӿ�A���������Ǿ��ܼ���
 * ���ʵ�ǰ�ӿ�A�еķ�������Ȼ��Ŀǰ�������ǵĲˣ���Ȼ����������P�ж���˽�б���C�����󣩣�B�ӿ�ָ�����
 * �������ٶ���һ���������Ĺ���������Ϊ����C��ֵ������A�ӿڵķ���ʵ����ʹ�ö���C��������Դ��B�ӿڵķ�����*/
public class Adapter implements Ps2{
	
	private Usb usb;
	public Adapter(Usb usb) {
		this.usb = usb;
	}
	
	@Override
	public void isPs2() {
		usb.isUsb();
	}
	
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Usber());
		adapter.isPs2();
	}
}
