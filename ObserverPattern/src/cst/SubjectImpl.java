package cst;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
	//主题的订阅者列表
	List<Subscriber> list = new ArrayList<>();
	//添加一个订阅者
	@Override
	public void registerObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}
	//删除一个订阅者
	@Override
	public void removeObserver(Subscriber observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}
    //通知订阅者
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Subscriber sub: list) {
			sub.mehtod();
		}
	}

	
}
