

package com.mycompany.practicalnq3;


public class PracticalNQ3 
{

    public static void main(String[] args)
    {
       Student S1=new Student(111,"Jeneesha","CS");
        System.out.println("Student Id:"+S1.getID());
        System.out.println("Student name:"+S1.getName());
        System.out.println("Student course:"+S1.getCourse());
        
        System.out.println();
        
        Lecturer L1=new Lecturer(222,"Mr.Shefraz","Java");
        System.out.println("Lecturer Id:"+L1.getID());
        System.out.println("Letcturer name:"+L1.getName());
        System.out.println("Lecturer Programme:"+L1.getProgramme());
       
    }
}
