package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
/**
 * ����List�еĻ�������
 * @author houtingting
 *
 */
public class TestCl {

	public static void main(String[] args){
		List list = new ArrayList();
		//ArrayList:�Ͳ�ʵ�������飬�̲߳���ȫ��Ч�ʸߣ����ԡ���ѯ�죬�޸ġ����롢ɾ������
		//LinkList:�Ͳ�ʵ���������̲߳���ȫ��Ч�ʸߣ���ѯ�����޸ġ����롢ɾ���졣
		//Vector:�̰߳�ȫ��Ч�ʵ͡��Ͳ�ʵ�������顣
		list.add("aaa");
		list.add(new Date());//hashcode ��equals
	//	list.add(new Dog());
		list.add(1234);//��װ��ģ��Զ�װ��
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		//list.remove("aaa");
		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		
		list.add(list2);
		
		//��˳��Ĳ���
		String str = (String)list.get(0);
		System.out.println(str);
		System.out.println(list.size());
		list.set(1,"ababa");
		list.remove(0);
		System.out.println(list.size());
		
		
	}
}
