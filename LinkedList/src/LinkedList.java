import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	void insertAtBegin(int n) {
		Node temp=new Node(n);
		temp.next=head;
		
		head=temp;
	}
	void insertAt(int i,int n) {
		int j=0;
		Node temp=new Node(n);
		Node initial=head;
		while((i-1)>0) {
			head=head.next;
			i--;
		}
		Node d=head.next;
		head.next=temp;
		temp.next=d;
		head=initial;
		
	}

	void insertAtEnd(int i) {

		while ((head.next != null)) {
			head = head.next;
		}

		head.next = new Node(i); 
	}

	void insertAll(List<Integer> list) {
		Node in=head;
		while(head.next!=null) {
			head=head.next;
		}
		for(Integer i:list) {
			Node temp=new Node(i);
			head.next=temp;
			head=temp;
		}
		head=in;
	}
	void insertAllAt(int i,List<Integer> list) {
		Node in=head;
		while((i-1)>0) {
			head=head.next;
			i--;
		}
		Node d=head.next;
		for(Integer o:list) {
			Node temp=new Node(o);
			head.next=temp;
			head=temp;
		}
		head.next=d;
		head=in;
	}
	
	void clear() {
		head=null;
	}
	  boolean contains(int n){
		Node in=head;
		  while(in!=null) {
			  if(in.key==n) {
				  return true;
			  }
			  in=in.next;
		  }
		return false;
	}
	  int getFirst() {
		  return head.key;
	  }
	  int getLast() {
		  Node in=head;
		  while(in.next!=null) {
			  in=in.next;
		  }
		  return in.key;
	  }
	  int indexOf(int n) {
		  int index=0;
		  Node in=head;
		  while(in.next!=null) {
			 if(in.key==n) {
				 return index;
			 }else {
				 index++;
			 }
			 in=in.next;
		  }
		  return -1;
		  
	  }
	  
	  void reverseList() {
		  Node curr=head,prev=null;
		  while(curr!=null) {
			  Node n=curr.next;
			  curr.next=prev;
			  prev=curr;
			  curr=n;
		  }
		  head=prev;
	  }
	  
	  //middle of linklist
	  int getMiddle() {
		  Node fast=head,slow=head;
		  while(fast.next != null && fast.next.next!=null) {
			  fast=fast.next.next;
			  slow=slow.next;
		  }
		return slow.key;
	  }
	  
	  void reverseReccursive(Node curr,Node prev) {
		if(curr==null) {
			return;
		}
		if(curr.next==null) {
			head=curr;
			curr.next=prev;
			return;
		}
		Node n=curr.next;
		curr.next=prev;
		reverseReccursive(n, curr);
	  }
	  
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtBegin(10);
		list.insertAtBegin(20);
		list.insertAtBegin(30);
		list.insertAtBegin(40);
		list.insertAtBegin(50);
//		list.insertAtBegin(60);
//		list.insertAtBegin(70);
//		list.insertAt(5,15);
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
//		l.add(5);

		//list.insertAll(l);
		//list.insertAllAt(2,l);
		//list.clear();
//		boolean b=list.contains(10);
//		int first=list.getFirst();
//		int last=list.getLast();
//		System.out.println(last);
	//	int i=list.indexOf(40);
		
		int i=list.getMiddle();
		list.reverseList();
		//list.reverseReccursive();
		System.out.println(list);
	}

}
