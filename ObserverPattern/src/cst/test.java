package cst;
/*
 *观察者与被观察者之间是属于轻度的关联关系，并且是抽象耦合的，这样，对于两者来说都比较容易进行扩展。
 *观察者模式是一种常用的触发机制，它形成一条触发链，依次对各个观察者的方法进行处理。
 *但同时，这也算是观察者模式一个缺点，由于是链式触发，当观察者比较多的时候，性能问题是比较令人担忧的。
 *并且，在链式结构中，比较容易出现循环引用的错误，造成系统假死。
 *并且因为观察者列表中维护了一份观察者的引用，当它们没有被及时地释放的话，可能会引起内存泄漏
 */
public class test {
	public static void main(String[] args) {
		Subject subject = new SubjectImpl();
		Subscriber subscriber = new SubscriberImpl(subject);
		subject.notifyObserver();
	}
}
