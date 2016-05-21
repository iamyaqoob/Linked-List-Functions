import java.util.*;
import java.io.*;
class a {
	private static class node{
		int d;
		node next;
		public node(int	 d){
			this.d = d;
			this.next = null;
		}
	}

	static int size=1;

	public static void add(node head,int d){
		node newNode = new node(d);
		while(head.next !=null){
			head=  head.next;
		}
		head.next = newNode;
		size++;
	}

	public static void display(node head){
		String s="";
		while(head!=null){
			s+=head.d+" ";
			head = head.next;
		}
		System.out.println(s);
		System.out.println("size is ->>>>>>  "+size);
	}

	public static node nthnode(node h,int n){
		if(h==null){
			return null;
		}
		int c=1;
		while(h!=null && c<n){
			h = h.next;
			c++;
		}return h;
	}

	public static node deleteLL(node h){
		if(h==null){
			return null;
		}
		node t1 = h;
		node t2 = h.next;
		while(t2!=null){
			t1 = null;
			t1 = t2;
			t2 = t2.next;
		}
		t1 = null;
		return t1;
	}

	public static node middle(node h){
		if(h==null){
			return null;
		}
		node s=h;
		node f = h;
		while(f!=null && f.next!=null){
			s = s.next;
			f = f.next.next;
		}
		return s;
	}

	public static node reverse(node head){
		node c=head;
		node p = null;
		while(c!=null){
			node nextSave = c.next;
			c.next = p;
			p =c;
			c=nextSave;
		}
		return p;
	}

	public static void pallindrome(node head){
		node mid = middle(head);
		node r = reverse(mid);
		display(head);
		display(r);
	}

	public static node insertSORT(node head,int x){
		node newNode = new node(x);

		size++;
		
		if(head==null || head.d >= x){
			newNode.next = head;
			head = newNode;
			return head;
		}
		else{
			node current = head;
			//node t=null;
			while(current.next!=null && current.next.d < x){
				//t = current;
				current = current.next;
			}
			
				//t.next = newNode;
				newNode.next = current.next;
				current.next = newNode;
			return head;

		}
	}

	public static void main (String[] args) throws Exception{
		node h = new node(2);
		add(h,5);
		add(h,7);
		add(h,10);
		add(h,15);
		//add(h,99);
		display(h);
		
	}
}