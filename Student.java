import java.util.Scanner;

public class Student {
	private String stdName, RegNo;
    private int yob;
    private String[] courses = {"ComputerNetworking", "ComputerSystem", "OperatingSystem", "BIT-BasicStatistics", "SAD", "OOPII"};
    int n=courses.length;
    private int[] marks = new int[n];
    private double sum;
    Scanner sc = new Scanner(System.in);
    
    Student() {
        System.out.println("Enter the name of Student : ");
        this.stdName=(sc.nextLine()).toUpperCase();
        
        System.out.println("Enter "+stdName+"'s RegNo: ");
        this.RegNo=(sc.nextLine()).toUpperCase();
        System.out.println("Enter "+stdName+"'s year of birth: ");
        
        while(true){
            int test=0;
            try{
            test=sc.nextInt();
            }catch(Exception ex){
            sc.next();
            System.out.println("Enter only integers please");
            }
            if(test>1985 && test<2010){
                this.yob=test;
                break;
            }else
                System.out.println("The year of birth entered is invalid,try again!");
        }
        
    }
    Student(String name, int yob){
        stdName=name.toUpperCase();
        System.out.println("Enter "+stdName+"'s RegNo: ");
        RegNo=sc.next();
    }
    Student(String name, String regNo){
        this.stdName = name.toUpperCase();
        this.RegNo=regNo.toUpperCase();
        System.out.println("Enter "+stdName+"'s year of birth: ");
        this.yob=sc.nextInt();
        
    }
    Student(String name, int yob, String regNo) {
        this.stdName=name.toUpperCase();
        this.RegNo=regNo.toUpperCase();
        this.yob=yob;
    }
    
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName.toUpperCase();
    }
    public String getRegNo() {
        return RegNo;
    }
    public void setRegNo(String regNo) {
        this.RegNo = regNo.toUpperCase();
    }
    public double getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void setMarks(){
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+stdName+"'s marks in "+courses[i]+": ");
            int test=sc.nextInt();
            if(test>=0 && test<=100){
                marks[i]=test;
                sum+=marks[i];
                  
          }else{
                System.out.println("Enter a score between 0 and 100!\n");
                i--;
            }
        }
    }
    public double getAver(){
        double aver=Math.round((sum/n)*100.0)/100.0;
        return aver;
    }
    public void printResults() {
        System.out.println("\nCourses\t\t\tMarks");
        for(int i=0;i<n;i++){
            System.out.println(courses[i]+"\t\t\t"+marks[i]);
        }
        System.out.println(stdName+"'s the student average is "+getAver());
    }
    public void printStdInfo(){
        System.out.printf("Full name: %s\nReg No: %s\nYear of birth: %d%n", stdName, RegNo, yob);
    }
}
