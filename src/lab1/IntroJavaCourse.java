package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Courses{
    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
        
    }
  
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

}
