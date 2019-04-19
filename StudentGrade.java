import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		 int num=1;
	        Student [] Std = new Student[num];
	        Scanner sc = new Scanner(System.in);
	        
	        int i=0;
	        while(true){
	            if(i>=num)
	                break;
	            Std[i]=new Student();
	            Std[i].setMarks();
	            System.out.println();
	            i++;
	        }
	        
	        System.out.println("The following students are registered:");
	        for(int n=0;n<num;n++){
	            System.out.println("("+(n+1)+") "+Std[n].getStdName());
	        }
	        System.out.println();
	        while(true){
	            System.out.println("Choose a number from 1 to "+num+" to look at the Studeet result entred or type 'any number ' to exit.");
	            int number = sc.nextInt();
	            if(number==0)
	                break;
	            else if(number>0 && number<=num){
	                int index = number-1;
	                Std[index].printStdInfo();
	                Std[index].printResults();
	            }
	            System.out.println();
	        }
	    }    

	}


