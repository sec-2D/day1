MemoryAllocation.java
1)
package Memory;
public class MemoryManagement {
	void run(int i) {
		System.out.println(i++);
		run(i);
	}
	public static void main(String[] args) {
		Anew MemoryManagement().run(1);
	}
}
2)
public class Student {
	String sname;
	int roll;
	float cgp;
	String address;
	Student(String sname,int roll,float cgp,String address) {
		this.sname=sname;
		this.roll=roll;
		this.cgp=cgp;
		this.address=address;
	}
}
class std{
	public static void main(String[] args) {
		Student s=new Student("Ganesh",14,9,"pirapudi");
		update(s);
        System.out.println(s.sname);
        System.out.println(s.roll);
        System.out.println(s.cgp);
		System.out.println(s.address);
	}
	public static Student update(Student s) {
		s.address="vadlamudi";
		s.cgp=10;
		return s;
	}	
}
3) 
public class memorymanagement {
    public static void main(String[] args) {
        int size=100;
        for(int i=0;i<Integer.MAX_VALUE;i++) {
            int[] arr=new int[size];
            System.out.println(i);
            i++;
            size*=2;
        }
    }
    
}

