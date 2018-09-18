package week1;

public class StudentManagement {

    public static int MAX = 100;
    public static Student arr[] = new Student[MAX];

    public boolean sameGroup(Student s1, Student s2) {
       if((s1.getEmail()==s2.getEmail()) && (s1.getGroup()== s2.getGroup()) && (s1.getId()== s2.getId()) && (s1.getName() == s2.getName()))
       {
           return true;
       }
       return false;
    }

    void studentsByGroup() {
        for(int i = 0 ; i < MAX ; i++)
        {
            int count = 0;
            
            if(arr[i] == null)
            {
                break;
            }
            else
            {
            for(int j = 0 ; j < MAX ; j++)
              {
                if(arr[j] == null)
                {
                    break;
                }
                else if(arr[i].getGroup() == arr[j].getGroup())
                {
                    
                    if(j < i)
                    {
                        break;
                       // continue;
                    }
                    else
                    {  
                          if(count == 0)
                          {
                              System.out.println("Lớp học phần"+" "+arr[j].getGroup());
                          }
                          System.out.println(arr[j].getInfo());
                          count++;
                        
                    }
                }
            
              }      
            }
        }
                             
    }

    void removeStudent(String id) {
       for(int i = 0 ; i < MAX ; i++)
        {
            if(arr[i]==null)
            {
                break;
            }
            if(arr[i].getId() == id)
            {
                for(int j = i ; j < MAX ; j++)
                {
                    if(arr[j] == null)
                    {
                        break;
                    }
                    arr[j] = arr[j+1];
                    MAX--;
                }
            }
        }
    }

    public static void main(String[] args) {
         StudentManagement stm = new StudentManagement();
        Student st1 = new Student();
        Student st2 = new Student("Nguyen Canh Hoang", "17020766", "k62-IE8");
        Student st3 = new Student(st2);
        Student st4 = new Student();
        st4.setName("Nguyen Canh Hoang");
        st4.setGroup("“INT22042");
        st4.setId("17020765");
        st4.setEmail("abc@gmail.com");
        stm.sameGroup(st2, st3);
    }
}
