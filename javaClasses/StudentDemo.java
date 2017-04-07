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
