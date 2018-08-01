package cst;

public interface Subject {
	
	//注册观察者
	public void registerObserver(Subscriber observer);
	
	//移除观察者
	public void removeObserver(Subscriber observer);
	
	//唤醒观察者
	public void notifyObserver();
}
