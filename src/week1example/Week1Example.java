package week1example;

//
public class Week1Example {
    public static void main(String[] args) {
        //store and print 3 student details
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("Peter");
        s1.setSid(34);
        s2.setName("Paul");
        s2.setSid(42);
        s3.setName("John");
        s3.setSid(5);
        //store object in array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for (int i = 0; i<list.length; i++){
            System.out.println(list[i].getName() + " " + list[i].getSid());
        }
        
    }}
    

