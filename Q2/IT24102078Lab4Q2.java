import java.util.Scanner;

public class IT24102078Lab4Q2{
public static void main (String [] args)
{
Scanner scanner = new Scanner(System.in);

System.out.print("Please enter exam marks (out of 100): ");
double marks = scanner.nextDouble();

if (marks < 0 || marks > 100)
{ System.out.print (" Invalid input for exam marks. Terminating program.");
return; 
}

System.out.print("Please enter lab submission marks (out of 100)");

System.out.print("Please enter the percentage given for the exam: ");
double percentage = scanner.nextDouble();

System.out.print("Please enter the percentage given for the lab submission: ");

if ( percentage < 0 || percentage > 100)
{ System.out.print ("The percentages must add up to 100 . Terminating program.");
return;
}


double finalMarks = (50.0/100.0)*marks;
double finalLabMarks = (50.0/100.0)*marks;

double finalExamMark = finalMarks + finalLabMarks;

System.out.print("Final Exam Mark is :" + finalExamMark);

}
}
