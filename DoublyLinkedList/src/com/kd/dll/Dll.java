package com.kd.dll;

import java.util.ArrayList;

public class Dll {
	public Node head;
	public Node tail;
	public Node ret;
	public Node pre;
//	
	public Dll() {
		
		this.head = null;
		this.tail = null;
	}
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            runner.prev = runner;
            
        }
        tail=newNode;
    }    
	public void printValuesBackward() {
		//This method prints the values of the nodes from the tail to the head.
		ArrayList<Integer> dllArray= new ArrayList<Integer>();
        Node runner=head;
        int count=0;
        while(runner!=null){
            dllArray.add(runner.value);
            runner=runner.next;
            count++;
        }
        System.out.println("Sll values are: ");
        for(int i=count-1; i>=0; i--) {
        	System.out.println(dllArray.get(i));
        }
        
		
	}
	public Node pop() {
		//This method removes the last node of our DLL and returns it.
		Node runner = head;
		while(runner.next.next != null) {
         runner = runner.next;
		}
		ret=runner.next;
		runner.next.prev=null;
		runner.next=null;
		this.tail=runner;
		return ret;
	}
	public boolean contains(Integer value) {
		//This method returns a boolean whether the value in the argument is in the list or not. 
		//Return true if the value exists, else, return false.
		Node runner = head;
		while(runner!=null){
			if(runner.value == value) {
				return true;
			}
			runner = runner.next;
		}
		return false;
	
	}
	
	public int size() {
		//Returns the number of nodes in the list.
		int size=0;
		Node runner = head;
		while(runner!=null){
			size++;
			runner = runner.next;
		}
		return size;
		
	}
	
	
	public void insertAt(int val, int index) {
		//Inserts a node at a specific index. For example, let's say that we have 3 nodes in our list. 
		//If we call insertAt(newNode, 1), the newNode should be inserted right after the head. (head is index 0)
		int s=size();
		if (index>s+1) {
			System.out.println("The requested index is out of range.");
		}
		else if(index==s+1) {
			add(val);
		}
		else {
			 Node newNode = new Node(val);
			 Node runner = head;
			 for(int i=1; i<index-1; i++) {
				 runner=runner.next;
				
			 }
			 newNode.next=runner.next;
			 newNode.prev=runner;
			 runner.next=newNode;
			 newNode.next.prev=newNode;
			 System.out.println("New node added.");
			
		}
		
	}
	public void removeAt(int index) {
		//This method removes a node at an index. For example, let's say that we have 3 nodes in our list. 
		//If we call removeAt(1), the middle node is removed. (head is index 0)
				
		int s=size();
		if (index>=s+1) {
			System.out.println("The requested index is out of range.");
		}
		else {
			Node runner = head;
			for (int i=1; i<index-1; i++) {
				runner=runner.next;
			}
			ret=runner.next.next;
			runner.next.next=null;
			runner.next.prev=null;
			runner.next=ret;
			ret.prev=runner;
			System.out.println("Node removed.");
		
		}
		
	}
	public boolean isPalindrome() {
		//This method returns a boolean whether the node is a palindrome or not. 
		//Return true if it is a palindrome, else, return false.
		int s=size();
		int count=0;
		Node runner = head;
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		
		while(count<s/2) {
			if(runner.value!=tail.value) {
				return false;
			}
			runner=runner.next;
			tail=tail.prev;
			count++;
		}
		return true;
	}
	

}
