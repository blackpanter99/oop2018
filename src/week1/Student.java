package week1;

public class Student {

     private String name,id,group,email;
    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email ="uet@vnu.edu.com";
    }
    
  
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        email = em;
        this.group = "INT22041";
    }
    

    /**
     * Constructor 3
     * @param s
     */
   
   
     Student(Student s) {
         this.name = s.name;
         this.id = s.id;
         this.email = s.email;
         this.group = s.group;
        
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }
    
    String getInfo() {
        return this.name + " " + this.id + " " + this.group + " " + this.email;
    }
}
