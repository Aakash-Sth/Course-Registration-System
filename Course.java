
/**
 * The Course class is a super class. Constructor,different setter and getter methods and a display method is defined in this class.
 *
 * @author (Aakash Shrestha)
 * @version (11.0.2)
 */
public class Course
{  
    //Four instance variable are created: courseID,courseName,courseLeader, duration
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration; 
    /*
     * A constructor is created with 3 parameters: courseID,courseName,duration
     * The courseID, courseName and duration are initialized in the constructor by being assigned the value of the constructor's parameters.
     * The course leader is set to empty string in the constructor.
     */
    Course(String courseID,String courseName,int duration)
    { 
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    //Mutator/setter method of course leader
    public void setCourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;        
    }
    //Accessor/getter method of course leader
    public String getCourseLeader() 
    {
        return this.courseLeader;
    }
    //Accessor/getter method of courseID
    public String getCourseId() 
    {      
        return this.courseID;
    }
    //Accessor/getter method of Course name
    public String getCourseName()
    {
        return this.courseName;
    }
    //Accessor/getter method of course duration
    public int getDuration()
    {
        return this.duration;
    }
    //method for displaying courseID,courseName,duration, courseLeader
    public void display()
    {
        System.out.println("CourseID:"+getCourseId());
        System.out.println("Course name:"+getCourseName());
        System.out.println("Duration:"+getDuration());
        if (getCourseLeader() != "") {
            System.out.println("Course leader:"+getCourseLeader());//course leader is displayed only if it isn't ""
        }
    }
}
