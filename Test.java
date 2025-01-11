public class Test {
    public static void main(String[] args) {
      /*  int[] arr = new int[5];

        Student1 std1 = new Student1();
        System.out.println(std1.name);
        std1.name = "Mani";
        std1.id = 26;
        std1.age = 21;
        std1.branch = "cse";

        Student1 std2 = new Student1();
        std2.name="Mani";
        std2.id=26;
        std2.age=22;
        std2.branch="cse";
        System.out.println(std1==std2);

        Student1 std3 = std1;
        std3.name="bhanu";
        System.out.println(std1.name);
        System.out.println(std2.name);
        System.out.println(std3.name);*/
        Student1 s1 = new Student1("mani", 26, 21, "cse");
        System.out.println(s1);
        Student1 s2 = new Student1("bhanu", 03, 26, "aiml");
        System.out.println(s2);

        }
}
