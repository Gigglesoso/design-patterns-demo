package cst;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
	//����Ķ������б�
	List<Subscriber> list = new ArrayList<>();
	//���һ��������
	@Override
	public void registerObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}
	//ɾ��һ��������
	@Override
	public void removeObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}
    //֪ͨ������
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Subscriber sub: list) {
			sub.mehtod();
		}
	}

	
}
