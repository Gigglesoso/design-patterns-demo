package test.demo3;
/*�ӿ�������ģʽ*/
/*����������һ���ӿڣ����ж�����N��ķ���������������ȴֻ��ʹ�����е�һ��������������
 *�������ֱ��ʵ�ֽӿڣ���ô����Ҫ�����еķ�������ʵ�֣��������ǽ����ǶԲ���Ҫ�ķ���
 *�����ÿգ�ֻдһ�Դ����ţ��������巽��ʵ�֣�Ҳ�ᵼ���������ӷ�ף�����Ҳ�����㣬
 *��ʱ���ǿ���ʹ��һ����������Ϊ�м�������������������������ʵ�ֽӿڣ����ڳ���������
 *�еķ����������ÿգ���ô�����ڴ���������ļ̳��࣬������д������Ҫʹ�õ��Ǽ����������ɡ�*/
public class AExt extends Adapter{
	
	public void a() {
		System.out.println("����A��������");
	}
	public void b() {
		System.out.println("����B��������");
	}
	
	public static void main(String[] args) {
		AExt aExt = new AExt();
		aExt.a();
		aExt.b();
	}
}