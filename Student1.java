public class Student1 {
     String name;
     int id;
     int age;
     String branch;
  public Student1(String name,int id,int age,String branch){
    this.name=name;
    this.id=id;
    this.age=age;
    this.branch=branch;
  }
      public void makeNoise(){
        System.out.println("make noise");
      }
      public void Study(){
        System.out.println("students are studying");
      }
      public String toString(){
        return this.name + " " + this.id;
      }
    
}
