package cst;

public interface Subject {
	
	//ע��۲���
	public void registerObserver(Subscriber observer);
	
	//�Ƴ��۲���
	public void removeObserver(Subscriber observer);
	
	//���ѹ۲���
	public void notifyObserver();
}
