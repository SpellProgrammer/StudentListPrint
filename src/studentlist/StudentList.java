package studentlist;
public class StudentList {
public static void main(String[] args){
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setAge(21);
        s1.setName("Peter");
        
        Student s2 = new Student();
        s2.setAge(18);
        s2.setName("George");
        
        Student s3 = new Student();
        s3.setAge(20);
        s3.setName("Sarah");
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i].getName() + " " + list[i].getAge());
           
        }
    }
}
