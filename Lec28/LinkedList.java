package Lec28;



public class LinkedList<T> {

	private class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	// O(1)
	public void Addlast(T item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void AddatIndex(T item, int k) {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			Addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;

		}

	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public T removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;

	}
	// O(N)
	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = getNode(size - 2);
			T temp = tail.val;
			prev.next = null;
			tail = prev;
			size--;
			return temp;
		}

	}
	// O(N)
	public T removeatindex(int k) {
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
		}
		else {
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
		
	}
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.Addlast("Raj");
		ll.Addlast("Ankit");
		ll.Addlast("Ankita");
		ll.Addlast("Kunal");
		ll.Display();
		
	}

}





