package class_objects;

class Student{
    
    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setQualifyingExamMarks(float qualifyingExamMarks){
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    
    public void setResidentialStatus(char residentialStatus){
        this.residentialStatus = residentialStatus;
    }
    
    public void setYearOfEngg(int yearOfEngg){
        this.yearOfEngg = yearOfEngg;
    }
    public int getStudentId(){
        return this.studentId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getQualifyingExamMarks(){
        return this.qualifyingExamMarks;
    }
    
    public char getResidentialStatus(){
        return this.residentialStatus;
    }
    
    public int getYearOfEngg(){
        return this.yearOfEngg;
    }
}

public class StudentTester{
    public static void main(String args[]){
        Student stud1 = new Student();
//        stud1.setStudentId(1001);
//        stud1.setName("Jacob");
//        stud1.setQualifyingExamMarks(80);
//        stud1.setResidentialStatus('H');
//        stud1.setYearOfEngg(3);
        
        stud1.setStudentId(1002);
        stud1.setName("Peter");
        stud1.setQualifyingExamMarks(83);
        stud1.setResidentialStatus('D');
        stud1.setYearOfEngg(2);
        
        System.out.println("********Student Information**********");
        System.out.println("Student Name		:"+stud1.getName());
        System.out.println("Student Id		:"+stud1.getStudentId());
        System.out.println("Qualifying Marks	:"+stud1.getQualifyingExamMarks());
        System.out.println("Year of Engineering	:"+stud1.getYearOfEngg());
		if(stud1.getResidentialStatus() == 'H') {
			System.out.println("Residential status	:Hostellers");  	
        }
		else if(stud1.getResidentialStatus() == 'D') {
			System.out.println("Residential status	:Day Scholar");
		}
        
    }
}
