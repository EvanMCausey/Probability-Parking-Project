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
