import java.util.*;
import java.util.Date;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i,j;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		//getstudent([index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(student);
		for(i=0;i<students.length;i++)
		{
			al.add(students[i]);
		}
		students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(Student s:this.students){al.add(s);}
		al.add(student);
		students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(int i=0;i<index;i++){al.add(getStudent(i));}
		al.add(student);
		for(int i=index;i<this.students.length;i++){al.add(getStudent(i));}
		this.students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(i=0;i<index;i++)
		{
			al.add(getStudent(i));
		}
		for(i=index+1;i<this.students.length;i++){al.add(getStudent(i));}
		this.students=al.toArray(new Student[al.size()]);
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(i=0;i<students.length;i++)
		{
			if(getStudent(i).equals(student))
			{
				
			}
			else{al.add(getStudent(i));}
		}
		students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(i=0;i<index;i++)
		{
			al.add(getStudent(i));
		}
		students=al.toArray(new Student[al.size()]);
	 }

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
		for(i=0;i<this.students.length;i++)
		{
			if(getStudent(i).equals(student)){break;}
			else{al.add(getStudent(i));}
		}
		this.students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		List<Student> al=new ArrayList<Student>();
	for(i=index+1;i<this.students.length;i++)
	{
		al.add(getStudent(i));
		
	}
	this.students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(i=0;i<this.students.length;i++)
		{
			if(getStudent(i).equals(student)){break;}
		}
		for(int j=i+1;j<this.students.length;j++){al.add(getStudent(j));}
		this.students=al.toArray(new Student[al.size()]);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student temp;
		List<Student> al=new ArrayList<Student>();
		for(i=0;i<this.students.length;i++)
		{
			for(j=0;j<this.students.length;j++)
			{
				if(this.students[j].getId()>this.students[j+1].getId()){
					temp=this.students[j];
					this.students[j]=this.students[j+1];
					this.students[j+1]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>(); 
		for(Student s:this.students)
		{
			if((s.getBirthDate()).equals(date)){al.add(s);}
		}
		return students=al.toArray(new Student[al.size()]);
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		for(Student s:this.students){
			if(s.getBirthDate().after(firstDate) && s.getBirthDate().before(lastDate)){al.add(s);}
		}
		return students=al.toArray(new Student[al.size()]);
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		double max=0;
		for(Student s:this.students)
		{
			if(s.getAvgMark() > max){max=s.getAvgMark();}
		}
		for(Student s:this.students)
		{
			if(s.getAvgMark() == max){al.add(s);}
		}
		return students=al.toArray(new Student[al.size()]);
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i=0;
		for(Student s:students){if(s.getId()==student.getId()){break;}else{i++;}}
		return students[i+1];
		//return null;
	}
}
