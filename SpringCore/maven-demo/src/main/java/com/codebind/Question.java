package com.codebind;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question {
	private int id;  
	private String name;  
	private List<String> answers;
	private Map<Integer,String> map;
	  
	public Question() {}  
	public Question(int id, String name, List<String> answers) {  
	      
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	public Question(int id, String name,Map<Integer,String> map) {
		  this.id = id;  
		    this.name = name; 
		    this.map=map;
	}
	  
	public void displayInfo(){  
		  
		
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  }
	    public void displayInfo1(){  
		    System.out.println(id+" "+name);  
		    System.out.println("answers are:");  
		    for (Map.Entry<Integer,String> entry : map.entrySet())  
	            System.out.println( + entry.getKey() + 
	                             "." + entry.getValue()); 
	}  

}
