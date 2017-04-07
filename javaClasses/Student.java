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
