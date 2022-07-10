
/**
 * The AcademicCourse class is a sub class of the Course class.Constructor,different setter and getter methods, a method to register a course and a 
   display method is defined in this class.
 * @author (Aakash Shrestha)
 * @version (11.0.2)
 */

class AcademicCourse extends Course
{   //7 instance variable are created: lecturerName,level,credit,startDate,completionDate,numofAssessments,isRegistered.
    private String lecturerName;
    private String level;
    private String credit;
    private String startDate;
    private String completionDate;
    private int numofAssessments;
    private boolean isRegistered;
    /*
     * A constructor is created with 6 parameters: courseID,courseName,duration,level,credit,numofAssessments
     * A call is made to the superclass constructor with three parameters, the courseID, courseName, and duration.
     * In the constructor,lecturer name, starting date and completion date are initialized as an empty ("") string and isRegistered status is 
       initialized to false.
    */
    AcademicCourse(String courseID,String courseName,int duration,String level,String credit,int numofAssessments)
    {
        super(courseID,courseName,duration);
        this.lecturerName = "";
        this.startDate = "";
        this.completionDate = "";
        this.isRegistered = false;   
    }
    //Accessor/getter method of lecturer name
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    //Accessor/getter method of level
    public String getLevel()
    {
        return this.level;
    }
    //Accessor/getter method of credit
    public String getCredit()
    {
        return this.credit;
    }
    //Accessor/getter method of start date
    public String getStartDate()
    {
        return this.startDate;
    }
    //Accessor/getter method of completion date
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    //Accessor/getter method of number of assessments
    public int getNumofAssessments()
    {
        return this.numofAssessments; 
    }
    //Accessor/getter method of isRegistered
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    //Mutator/setter method of Lecturer name
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    //Mutator/setter method of number of assesments
    public void setNumofAssessments(int numofAssessments)
    {
        this.numofAssessments = numofAssessments;
    }
    //Method to register a course
    public void register(String courseLeader,String lecturerName,String startDate,String completionDate)
    {
        if (getIsRegistered() == true) 
        //statements to be displayed if a course is already registered
        { 
            System.out.println("The course is already registered with following details.");
            System.out.println("Lecturer Name:"+getLecturerName());
            System.out.println("Starting date:"+getStartDate());
            System.out.println("Completion date:"+getCompletionDate());
        }
        //statements to be displayed if a course is not registered
        else if(getIsRegistered() == false) 
        { 
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }   
    }
      /*
     * a method display calls display method of the super class 
     * displays lecturer name,level, credit, starting date, completion date and number of assessments if the course is already registered
     */
    public void display()
    {
        super.display();
        if (isRegistered == true) 
        {
            System.out.println("Lecturer Name:"+getLecturerName());
            System.out.println("Level:"+getLevel());
            System.out.println("Credit:"+getCredit());
            System.out.println("Starting date:"+getStartDate());
            System.out.println("Completion date:"+getCompletionDate());
            System.out.println("Number of Assessments:"+getNumofAssessments());
        }
    }
}
