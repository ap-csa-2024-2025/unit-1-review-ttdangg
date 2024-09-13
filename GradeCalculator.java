public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course_name = "AP Computer Science A";
    System.out.println("course name: " + course_name);

    int time_spent = 135;
    System.out.println("average time spent in a week for the course (in minutes): " + time_spent);


    int hw_grade1 = 77;
    int hw_grade2 = 64;
    int hw_grade3 = 80;
    int hw_grade4 = 100; 
    System.out.println("homework grades for this course: ");
    System.out.println(hw_grade1);
    System.out.println(hw_grade2);
    System.out.println(hw_grade3);
    System.out.println(hw_grade4);

    System.out.println("quiz grades for this course: ");
    double quiz_score1 = 97.3;
    double quiz_score2 = 76.7;
    System.out.println(quiz_score1);
    System.out.println(quiz_score2);

    System.out.println("final exam grade for this course: ");
    double final_exam_score = 92.35; 
    System.out.println(final_exam_score);

    int time_hour = (time_spent/60);
    int leftover_time = (time_spent%60);
    System.out.println("Weekly time spent: " + time_hour + "h" + leftover_time);
    
    
    double avg_hw_grade = (double)(hw_grade1 + hw_grade2 + hw_grade3 + hw_grade4) / 4; 
    System.out.println("Average homework grade: " + avg_hw_grade);

    double avg_quiz_grade = (quiz_score1 + quiz_score2) / 2; 
    System.out.println("Average quiz grade: " + avg_quiz_grade);

    System.out.println("Final exam grade: " + final_exam_score);

    double overall_grade = (avg_hw_grade * 0.35) + (avg_quiz_grade * 0.15) + (final_exam_score * 0.50);
    System.out.println("Overall grade: " + overall_grade);


  }
}
