package com.jda.beans;

import java.util.Iterator;  
import java.util.List;  
  
public class Questions {  
private int id;  
private String name;  
private List<String> answers;  
  
public Questions() {}  
public Questions(int id, String name, List<String> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
  
}  

