import java.util.ArrayList;
import java.util.Collections;

 class Student implements Comparable<Student> {
         int age;
         int roll;
         String name;
         public Student (int age,int roll, String name){
            this.age=age;
            this.roll=roll;
            this.name=name;
         }
         public String tostring(){
            return age +" "+ roll +" "+ name; 
         }
         public int compareTo(Student s){
            return this.roll-s.roll;
         }
    
}
public class comparator {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student(14,11, "RAM"));
        list.add(new Student(12,10, "SHYAM"));
       
       Collections.sort(list);
       for(Student s:list){
       System.out.println(s.tostring());
           }
            }
}
