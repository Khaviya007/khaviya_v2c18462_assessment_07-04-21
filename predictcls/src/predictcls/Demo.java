package predictcls;
import java.util.ArrayList;
import java.util.function.Predicate;
public class Demo {
	public static void main(String[] args) {
	 ArrayList<Student> al=new ArrayList<Student>();
	 al.add(new Student(4,"Tom",15));
	 al.add(new Student(5,"Ram",21));
	 al.add(new Student(2,"Sam",22));
     System.out.println("The Student list is:");
     for(Student s:al) {
    	 System.out.println("id:"+s.id+" "+"name:"+s.name+" "+"age:"+s.age);   
     }
     Predicate<Student> p=(z)->(z.age>18);
    // Predicate<Student> q=(z)->(z.name);
     for(Student z:al) 
     {
     	if(p.test(z))
     	{
     	System.out.println(z.name+" "+z.age+" "+"allowed to watch movie");
     	}
         else 
           {
    	 System.out.println("not allowed to watch movie");
           }
     }
}	
}
class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}


