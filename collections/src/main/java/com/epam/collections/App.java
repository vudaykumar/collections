package com.epam.collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyList<String> lst = new MyList<>();
    	
    	//add elements to my list
    	lst.add("One");
    	lst.add("Two");
    	lst.add("Three");
    	lst.add("Four");
    	lst.add("Five");
    	lst.add("Six");
    	lst.add("Seven");
    	lst.add("Eight");
    	lst.add("Nine");
    	lst.add("Ten");
    	lst.add("Eleven");
    	lst.add("Twelve");
    	lst.add("Thirteen");
    	lst.add("Fourteen");
    	lst.add("Fifteen");
    	
    	//print my list
    	lst.print();
    	
    	//remove begin
    	System.out.println("Removing element at index 0");
    	lst.remove(0);
    	lst.print();
    	
    	//remove end
    	System.out.println("Removing element at index 13");
    	lst.remove(13);
    	lst.print();
    	
    	//remove from middle
    	System.out.println("Removing element at index 3");
    	lst.remove(3);
    	lst.print();
    	
    	//retrieving elements
    	System.out.println("Item at index 0 = "+lst.fetch(0));
    	System.out.println("Item at index 5 = "+lst.fetch(5));
    	System.out.println("Item at index 7 = "+lst.fetch(7));
    	
    	//printing final my list size
    	System.out.println("Size = "+lst.getSize());
    	
    }
}
