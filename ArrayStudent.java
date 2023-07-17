package Codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStudent {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

//		Student st = new Student(1, "Rohan", 23);
//		Student st1 = new Student(2, "Shyam", 24);
//		Student st2 = new Student(3, "Ram", 25);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of student you wan to enter:");
		int n = Integer.parseInt(br.readLine());
//		System.out.println("Enter the roll no :");
//		int rollNo = Integer.parseInt(br.readLine());
//		System.out.println("Enter Name :");
//		String name = br.readLine();
//		System.out.println("Enter the age :");
//		int age = Integer.parseInt(br.readLine());
		
		ArrayList<Student> al = new ArrayList<Student>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the roll no :");
			int rollNo = Integer.parseInt(br.readLine());
			System.out.println("Enter Name :");
			String name = br.readLine();
			System.out.println("Enter the age :");
			int age = Integer.parseInt(br.readLine());
			Student s = new Student(rollNo, name, age);
			al.add(s);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Student st3= (Student)itr.next();
			System.out.println(st3.rollNo+ " "+st3.name+" "+st3.age);
		}
	}

}
