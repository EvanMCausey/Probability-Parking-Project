class Date 
{
    private int year;
    private int month;
    private int day;

    Date(int year, int month, int day) {
        this.year = year;           
        this.month = month;           
        this.day = day;           
    }
    String printDate () {
        return this.year + "/" + this.month + "/" + this.day;
    }

    void setYear (int year) {
         this.year = year;
    }

    int getYear () {
        return this.year;
    }

    void setMonth (int month) {
         this.month = month;
    }

    int getMonth () {
        return this.month;
    }

    void setDay (int day) {
         this.day = day;
    }

    int getDay () {
        return this.day;
    }
}

class Time 
{
    private int hour;
    private int minute;
	
    Time(int hour, int minute) {
        this.hour = hour;           
        this.minute = minute;           
    }
    String printTime () {
	String time = this.getHour() + ":" + this.getMinute();
        return time; 
    }

    void setHour (int hour) {
         this.hour = hour;
    }
    int getHour () {
        return this.hour;
    }

    void setMinute (int minute) {
         this.minute = minute;
    }

    int getMinute () {
        return this.minute;
    }
}

class Class 
{
    private String subject;
    private String catalog;
    private String section;
    private String description;
    private String location;
    private int room;
    private Time startTime;
    private Time endTime;
    private Date startDate;
    private Date endDate;

    Class(String subject, String catalog, String section, String description, String location, int room, Time startTime, Time endTime, Date startDate, Date endDate) {
        this.subject = subject;
        this.catalog = catalog;
        this.section = section;
        this.description = description;
        this.location = location;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String printClass () {
	String var = this.subject + " " + this.catalog + " " + this.section + " " + this.description + " " + this.location + " " + this.room + " " + this.startTime.printTime() + " " + this.endTime.printTime() + " " + this.startDate.printDate() + " " + this.endDate.printDate();
        return var;
    }

    void setSubject (String subject) {
         this.subject = subject;
    }
    String getSubject () {
        return this.subject;
    }
    void setCatalog (String catalog) {
         this.catalog = catalog;
    }
    String getCatalog () {
        return this.catalog;
    }
    void setSection (String section) {
         this.section = section;
    }
    String getSection () {
        return this.section;
    }
    void setLocation (String location) {
         this.location = location;
    }
    String getLocation () {
        return this.location;
    }
    void setRoom (int room) {
         this.room = room;
    }
    int  getRoom () {
        return this.room;
    }

}//END OF CLASS

class Student 
{
    private String username = "";
    private String email = "";
    private String password = "";
    private Class classList[] = new Class[4];

    void setUsername (String  username) {
         this.username = username;
    }

    String getUsername () {
        return this.username;
    }

    void setEmail (String  email) {
         this.email = email;
    }

    String getEmail () {
        return this.email;
    }

    String  printClass (int i) {
        return this.classList[i].printClass();
    }

    void setPassword (String  password) {
         this.password = password;
    }
     
    Student(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        Time t1 = new Time(10,30);
        Time t2 = new Time(11,45);
        Date d1 = new Date(2017,1,2);
        Date d2 = new Date(2017,10,2);
	for( int i = 0; i < 4; ++i)
	{
		this.classList[i] =  new Class("ANTHRO","100", "10A", "description", "Mark", 100+i,t1,t2,d1,d2);
        }
    }
}

class StudentDemo 
{
    public static void main(String[] args) {

        Student s1 = new Student("evan", "evan1", "password");
        System.out.println(s1.getUsername());
        System.out.println(s1.getEmail());
        System.out.println(s1.printClass(1));
        //Time t1 = new Time(10,30);
        //Time t2 = new Time(11,45);
        //Date d1 = new Date(2017,1,2);
        //Date d2 = new Date(2017,10,2);
        //Class c1 = new Class("ANTHRO","100", "10A", "description", "Mark", 100,t1,t2,d1,d2);
        //System.out.println(c1.printClass());
        //System.out.println(c1.subject);
        //System.out.println(c1.section);
        //System.out.println("startDate = " + c1.startDate.printDate() );
        //System.out.println("endDate = " + c1.endDate.printDate() );
        //System.out.println("startTime = " + c1.startTime.printTime() );
        //System.out.println("endTime = " + c1.endTime.printTime() );
    }
}
