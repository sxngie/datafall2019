package edu.uprm.cse.datastructures.list;

public interface List<E> extends Iterable<E> {
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean isMember(E e);
	
	public int firstIndexOf(E e);
	
	public int lastIndexOf(E e);

	public void add(E e);
	
	public void add(E e, int index);
	
	public E get(int index);
	
	public E remove(int index);
	
    public boolean remove(E e);
    
    public int removeAll(E e);
    
	public E replace(int index, E newElement);
	
	public void clear();
	
	public Object[] toArray();

	public List<String> reverse();	
	
	public int replaceAll (E e, E f);
	
//	public static int findMinValue (List<Integer> L) {
//		if (L.isEmpty()) {
//			return 0;
//		}
//		else {
//			int min = L.get(0);
//			for (int h = 1; h < L.size(); h++) {
//					if (L.get(h) <= min) {
//						min = L.get(h);
//					}
//				}
//			return min;
//			}
//	}


}
