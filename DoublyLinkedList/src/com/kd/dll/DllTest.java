package com.kd.dll;

public class DllTest {
	public static void main(String[] args) {
        Dll doubly = new Dll();
        doubly.add(3);
        doubly.add(4);
        doubly.add(10);
        doubly.add(5);
        doubly.add(15);
        doubly.add(2);
       
        doubly.printValuesBackward();
        
        Node last=doubly.pop();
        System.out.println("Last Node is: "+last.value);
        
        boolean res=doubly.contains(1);
        System.out.println("Value present is: "+res);
        
        int len=doubly.size();
        System.out.println("Size of Dll is: "+len);
        
        doubly.insertAt(1, 3);
        
        doubly.insertAt(12, 6);
        doubly.removeAt(2);
        doubly.printValuesBackward();
      
        boolean pal=doubly.isPalindrome();
        System.out.println("The result is: "+pal);
    }

}
