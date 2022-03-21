package hdfc.loans.homeloans;

public class Student 
{
	int sno;
	String sname;
	
	
	
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}



	public static void main(String args[])
	{
		Student s= new Student(100,"VIKASH");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		System.out.println(s);
		
		Student s1=new Student(101,"VIKASH 1");
		Student s2=new Student(102,"VIKASH 2");
		Student s3=new Student(103,"VIKASH 3");
		Student s4=new Student(104,"VIKASH 4");
		Student s5=new Student(105,"VIKASH 5");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		//System.out.println(s5);
		
		Student[] st= new Student[5];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		st[4]=s5;
		
		for(Student i:st)
		{
			System.out.println(i);
		}
		
	}

}
