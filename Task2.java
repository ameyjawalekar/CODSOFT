import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nSTUDENT GRADE CALCULATOR");
        System.out.println("Enter Total Number of Subjects:");
        int total_subjects=sc.nextInt();
        int total_mark=0;

        for(int i=1;i<=total_subjects;i++){
            System.out.println("\nEnter MArks Obtained in Subjects"+i+":");
            int marks=sc.nextInt();
            total_mark+=marks;
        }
        double average_percentage=(double)total_mark/total_subjects;
        char Grade;

        if(average_percentage>=90){
            Grade='A';
        }else if(average_percentage>=80){
            Grade='B';
        }else if(average_percentage>=70){
            Grade='C';
        }else if(average_percentage>=60){
            Grade='D';
        }else if(average_percentage>=50){
            Grade='E';
        }else{
            Grade='F';
        }
        System.out.println("\nTotal Marks Scored:\t\t"+total_mark);
        System.out.println("Average Percentage gained:\t"+average_percentage+"%");
        System.out.println("Grade Obtained:\t\t\t"+Grade);
        System.out.println();
    }
}