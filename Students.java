package javaPrograms2;

class Student {
    int id;
    String name;
    static String college = "BVRITH";
 
  public Student(int i, String n){
      id=i;
      name=n;
  }

  static void change(){
      college = "SVES";
  }
  void display(){
      System.out.println(id + " " + name + " "+ college);
  }
}
 public class Students{
      public static void main(String[] args){
         
          Student s1 = new Student(1,"Vaidehi");
          s1.change();
          s1.display();
      }
  }
