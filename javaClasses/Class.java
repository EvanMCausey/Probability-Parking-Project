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
