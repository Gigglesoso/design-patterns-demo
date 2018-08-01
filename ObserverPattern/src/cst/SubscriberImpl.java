package cst;

public class SubscriberImpl implements Subscriber{
	
	//这个订阅者订阅的主题
	
	@SuppressWarnings("unused")
	private Subject subject;
	
	//构造方法
	public SubscriberImpl(Subject subject) {
		this.subject = subject;
		//将该订阅者添加到主题的订阅列表中
		subject.registerObserver(this);
	}
	
	//主题更新时通知订阅者的方法
	@Override
	public void mehtod() {
		// TODO Auto-generated method stub
		System.out.println("主题更新了！");
	}

}
