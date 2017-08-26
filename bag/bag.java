import java.util.Iterator;
public class bag<Item> implements Iterable<Item>{
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	private Node first;
	private class Node
	{
		Item item;
		Node next;
	}
	public void add(Item item)
	{
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
	}
	private class ListIterator implements Iterator<Item>
	{
		private Node current=first;
		public boolean hasNext()
		{ return current!=null; }
		public void remove() {}
		public Item next()
		{
			Item item=current.item;
			current=current.next;
			return item;
		}
	}
}
