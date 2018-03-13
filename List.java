import java.io.*;

public class List {
	
	public Node head = null; //Empty list
	
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	public void insertAtBegin(Node newNode)
	{
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(Node newNode)
	{
		Node temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = newNode;
	}
	
	public void insertAtIndex(Node newNode, int index)
	{
		Node temp;
		Node pre = head;
		
		for(int i = 0; i < index - 1; i++)
			pre.next = pre;
		
		temp = pre.next;
		newNode.next = temp;
		pre.next = newNode;
	}
	
	
	public void deleteAtBegin()
	{
		Node temp = head;
		head = head.next;
		temp = null;
		System.gc();
	}
	
	
	public void deleteAtEnd()
	{
		Node pre = head;
		Node temp = pre.next;
		
		/*
		while(pre.next.next != null)
			pre = pre.next;
		
		temp = pre.next;*/
		
		while(temp.next != null)
		{
			pre = temp;
			temp = temp.next;
		}
		
		pre.next = null;
		temp = null;
		
		System.gc();
	}
	
	
	public void printList()
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out) );
		
		try
		{
			Node temp = head;
			while(temp != null)
			{
				bw.write( temp.toString() );
				temp = temp.next;
			}
			
			bw.flush();
		}
		catch(Exception ex) {  ex.printStackTrace(); }
	}
	
	public void quickSort()
	{
		if(!isEmpty())
		{
			List leftList = new List();
			List rightList = new List();
			Node pivot = head;
			Node temp = head.next;
			
			while(temp != null)
			{
				if(temp.value < pivot.value)
					leftList.insertAtEnd(temp.clone());
				else
					rightList.insertAtEnd(temp.clone());
				
				temp = temp.next;
			}
			
			leftList.quickSort();
			rightList.quickSort();
			pivot.next = rightList.head;
			leftList.insertAtEnd(pivot);
			head = leftList.head;
		}
	}
	
	public Node getNode(int index)
	{
		if(listSize() < index)
			return null;
		else
		{
			Node temp = head;
			for(int i = 0; i < index; i++)
				temp = temp.next;
			
			return temp;
		}
	}
	
	
	public Node binarySearch()
	{
		int max = listSize() - 1, min = 0;
		int middle = (max + min) / 2;
		
		while()
		{
			
		}
		
		return null;
	}
	
	
	public int listSize()
	{
		int counter = 0;
		Node temp = head;
		
		while(temp != null)
		{
			counter += 1;
			temp = temp.next;
		}
		
		return counter;
	}
	
	public static void main(String[] args) throws IOException
	{
		List students = new List();
		
		students.insertAtBegin(new Node("Paula", 22, 565352));
		students.insertAtBegin(new Node("Juan", 25, 456987));
		students.insertAtEnd(new Node("Pedro", 27, 897654));
		students.insertAtIndex(new Node("Maria", 20, 654844), 1);
		
		students.printList();
		
		System.out.println("--");
		
		students.deleteAtBegin();
		students.deleteAtEnd();
		
		students.printList();
		
	}
}
