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
