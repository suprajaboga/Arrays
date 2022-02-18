package junittestreports;
import java.util.*;

public class StudentMark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        float physics_marks,chemistry_marks,maths_marks;
        
        physics_marks=sc.nextFloat();
        chemistry_marks=sc.nextFloat();
        maths_marks=sc.nextFloat();
        
        float total_marks=getTotalMarks(physics_marks,chemistry_marks,maths_marks);
        System.out.println("Total marks: "+total_marks);
        
        float percentage_marks=getPercent(physics_marks,chemistry_marks,maths_marks);
        System.out.println("Percentage of marks obtained: "+String.format("%.2f", percentage_marks));
        
        String grade=getGrade(percentage_marks);
        System.out.println("Grade: "+grade);
	}
	public static String getGrade(float percentage) {
		if(percentage>100||percentage<0)
			throw new ArithmeticException("Invalid percentage error");
		if(percentage>=80)
			return "A+";
		else if(percentage>=60&&percentage<=79)
			return "A";
		else if(percentage>=40&&percentage<=59)
			return "B";
		else
			return "C";
	}
	public static float getPercent(float physics_marks,float chemistry_marks,float maths_marks) {
		if(physics_marks>100||chemistry_marks>100||maths_marks>100)
			throw new ArithmeticException("Invalid marks error");
		else if(physics_marks<0||chemistry_marks<0||maths_marks<0)
			throw new ArithmeticException("Invalid marks error");
		float marks_total=physics_marks+chemistry_marks+maths_marks;
		float percentage=(marks_total/300)*100;
		return percentage;
	}
	public static float getTotalMarks(float physics_marks,float chemistry_marks,float maths_marks) {
		if(physics_marks>100||chemistry_marks>100||maths_marks>100)
			throw new ArithmeticException("Invalid marks error");
		else if(physics_marks<0||chemistry_marks<0||maths_marks<0)
			throw new ArithmeticException("Invalid marks error");
		float marks_total=physics_marks+chemistry_marks+maths_marks;
		return marks_total;
	}

}
