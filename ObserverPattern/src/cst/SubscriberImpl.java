package cst;

public class SubscriberImpl implements Subscriber{
	
	//��������߶��ĵ�����
	
	@SuppressWarnings("unused")
	private Subject subject;
	
	//���췽��
	public SubscriberImpl(Subject subject) {
		this.subject = subject;
		//���ö�������ӵ�����Ķ����б���
		subject.registerObserver(this);
	}
	
	//�������ʱ֪ͨ�����ߵķ���
	@Override
	public void mehtod() {
		// TODO Auto-generated method stub
		System.out.println("��������ˣ�");
	}

}
