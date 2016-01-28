package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Courses{
    private String courseNumber;
    private String courseName;
    private double credits;
    private String prerequisites;

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void courseName() {
        System.out.print(" Intro Java ");
    }

    public void courseNumber() {
        System.out.print(" 152684 ");
    }

    public void credits() {
        System.out.print(3.0);
    }

    public void Prerequisites() {
        System.out.print(" Intro To Programming ");
    }

    
}
