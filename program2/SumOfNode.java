package program2;

//find the sum of two linked lists using Stack
public class SumOfNode {

	class node{
		int val;
		node next;
		public node(int val) {
			this.val=val;
		}
	}
	
	public void printList(node head) {
		while(head!=null){
		System.out.println(head.val+" ");
		head=head.next;
		}
	}
	
	node head1,head2,result;
	int carry;
	
	public void push(int val,int list) {
		node newnode=new node(val);
		if(list==1) {
			newnode.next=head1;
			head1=newnode;
		}
		else if(list==2) {
			newnode.next=head2;
			head2=newnode;
		}
		else {
			newnode.next=result;
			result=newnode;
		}
	}
	
	public void addsameSize(node n,node m) {
		if(n==null) {
			return;
		}
		
		addsameSize(n.next, m.next);
		
		int sum=n.val+m.val+carry;
		carry=sum/10;
		sum=sum%10;
		
		push(sum,3);
		
	}
	
	node cur;
	public void popragateCarry(node head1) {
		if(head1!=cur) {
			popragateCarry(head1.next);
			int sum=carry+head1.val;
			carry=sum/10;
			sum%=10;
			push(sum,3);
		}
	}
	
	public int getSize(node head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	public void addList() {
		if(head1==null) {
			result=head2;
			return;
		}
		if(head2==null) {
			result=head1;
			return;
		}
		
		int size1=getSize(head1);
		int size2=getSize(head2);
		
		if(size1==size2) {
			addsameSize(head1, head2);
		}
		else {
			if(size1<size2) {
				node temp=head1;
				head1=head2;
				head2=temp;
			}
			int diff=Math.abs(size1-size2);
			
			node temp=head1;
			
			while(diff-- >=0) {
				cur=temp;
				temp=temp.next;
			}
			
			addsameSize(cur, head2);

			popragateCarry(head1);
			
			
			
			
			
		}
		if(carry>0) {
			push(carry,3);
		}
		
	}
	
	
	public static void main(String args[])
    {
        SumOfNode list = new SumOfNode();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };
 
        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);
 
        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);
 
        list.addList();
 
        list.printList(list.result);
    }
	
	
	
	
}
