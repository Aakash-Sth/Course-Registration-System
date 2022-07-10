/**
 * The NonAcademicCourse class is a sub class of the Course class.Constructor,different setter and getter methods, a methods to register and remove a 
course and a display method is defined in this class.
 * @author (Aakash Shrestha)
 * @version (11.0.2)
 */
class NonAcademicCourse extends Course
{//8 instance variables are created:instructorName,startDate,completionDate,examDate,prerequisite,isRegistered,isRemoved,duration
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private int duration;
    private boolean isRegistered;
    private boolean isRemoved;
    /*
     * A constructor is created with 4 parameters: courseID,courseName,duration,prerequisite
     * A call is made to the superclass constructor with three parameters courseID, courseName, and duration.
     * In the constructor starting date, completion date and exam date are initialized as an empty string(""), and isRegistered and isRemoved status to false.
     */
    NonAcademicCourse(String courseID,String coursename,int duration,String prerequisite)
    {
        super(courseID,coursename,duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;   
        this.isRemoved = true;   
    }
    //Accessor/getter method of instructor name
    public String getInstructorName()
    {
        return this.instructorName;
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
    //Accessor/getter method of exam date
    public String getExamDate()
    {
        return this.examDate;
    }
    //Accessor/getter method of prerequisite
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
    //Accessor/getter method of isRegistered
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    //Accessor/getter method of isRemoved
    public boolean getisRemoved()
    {
        return this.isRemoved;
    }
    //Mutator/setter method of Instructor name
    public void setInstructorName(String instructorName)
    {
        if (isRegistered == false) {
            this.instructorName=instructorName;
        }
        else if (isRegistered == true) {
            System.out.println("The course is already registered. Therefore, the instructor name can't be changed.");
        }
    }
    //Method to register a course
    public void register(String courseleader,String instructorName,String startDate,String completionDate,String examDate)
    {
        if (getIsRegistered() == false) {
            setInstructorName(instructorName);
            this.isRegistered = true;
            this.isRemoved = false;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
        }
        else {
            System.out.println("The course is already registered.");
        }
    }
    //Method to remove a course
    public void remove()
    {
        if (isRemoved == true) {
            System.out.println("The course is already removed.");
        }
        else if (isRemoved == false) {
            super.setCourseLeader("");
            this.instructorName = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;   
            this.isRemoved = true;  
        }
    }

    /*
     * a method display calls display method of the super class 
     * displays instructorName,startDate,completionDate,examDate if the course is already registered
     */
    public void display()
    {
        super.display();
        if (isRegistered == true) {
            System.out.println("Instructor Name:"+getInstructorName());
            System.out.println("Starting date:"+getStartDate());
            System.out.println("Completion date:"+getCompletionDate());
            System.out.println("Exam date:"+getExamDate());
        }
    }
}
