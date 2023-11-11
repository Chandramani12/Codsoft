package com.info.GradeCalculation;
import java.util.*;
import java.io.*;
import java.text.*;
public class GradeCalculation {
	static Scanner sc;
	public int MarksCalculation(int nsub,int marks[]) { //calculate the marks
		int totalMarks=0;
		for(int i=0;i<nsub;i++) {
			System.out.print("Enter marks obtained in subject "+(i+1)+ " : ");
			
			marks[i]=sc.nextInt();
			
			totalMarks=totalMarks+marks[i];
		}
		System.out.println(" Total Marks " + totalMarks);
		CalPercentage(totalMarks,nsub);
		
		return 0;
		
		
	}
	public void CalPercentage(int totalmarks,int numberofsubject) { //calulate percentage
		double averagePercentage=(double) totalmarks/(numberofsubject*100)*100;
		DecimalFormat df = new DecimalFormat("#.00");
		String averagePercentage1=df.format(averagePercentage);
		
		
		System.out.println("Average Percentage: " + averagePercentage1 + "%");
		displayGrade(averagePercentage);
	}
	
	public void displayGrade(double averagePercentage) {//display Grade
		char grade;
		switch((int)averagePercentage/10) {
		case 9:
        case 10:
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        case 6:
            grade = 'D';
            break;
        default:
            grade = 'F';
            break;
      }
		System.out.println("Display Grade :"+ grade);
		
	}
	
	public static void main(String[] args) {//Main method and store the marks and 
		System.out.print("Enter the number of subject :- ");
		sc=new Scanner(System.in);
		
		int numberofsubject=sc.nextInt();
		
		int[] marks=new int[numberofsubject];
		GradeCalculation obj=new GradeCalculation();
		int result=obj.MarksCalculation(numberofsubject,marks);
		
		
		sc.close();	
	}
	
}
