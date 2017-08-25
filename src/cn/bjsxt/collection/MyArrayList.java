package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList,�������Ǹ��õ����ArrayList��ĵͲ�ṹ��
 * 
 * @author houtingting
 *
 */
public class MyArrayList {

	private Object[] elementDate;
	private int size;

	public int size() {
		return size;
	}

	public MyArrayList() {
		this(10);// Ĭ�����鳤����10
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		elementDate = new Object[initialCapacity];
	}

	public static void main(String[] args) {
		// List list = new ArrayList();
		MyArrayList list = new MyArrayList(3);
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("333");
		list.add("333");
		list.add("333");
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));
		System.out.println(list.get(6));
		list.remove(2);
		System.out.println(list.size());
		// System.out.println(list.get(10));
	}

	public void add(Object obj) {
		// �������ݺ����ݵĸ���
		if (size + 1 > elementDate.length) {
			Object[] newArray = new Object[size * 2 + 1];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
		elementDate[size] = obj;
		size++;
	}

	public Object get(int index) {
		rangeCheck(index);
		return elementDate[index];
	}

	public void remove(int index) {
		rangeCheck(index);
		int numMove = size - index - 1;
		if (numMove > 0) {
			System.arraycopy(elementDate, index + 1, elementDate, index, numMove);
		}
		elementDate[--size] = null;
	}

	public void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(obj)) { // ע��Ͳ���õ���equals
				remove(i);
			}
		}
	}

	public Object set(int index, Object obj) {
		rangeCheck(index);
		Object oldValue = elementDate[index];
		elementDate[index] = obj;
		return oldValue;
	}

	public void add(int index, Object obj) {
		rangeCheck(index);
		// �������ݺ����ݵĸ���
		if (size + 1 > elementDate.length) {
			Object[] newArray = new Object[size * 2 + 1];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			elementDate = newArray;
		}
		
		System.arraycopy(elementDate, index, elementDate, index + 1, size - index);
		elementDate[index] = obj;
		size++;
	}
}
