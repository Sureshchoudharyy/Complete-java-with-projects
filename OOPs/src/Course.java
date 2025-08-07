public class Course {
    int duratrion;
    String name;

    public Course(){
        System.out.println("Constructor called....");
    }

    public Course(String name, int duration){
        this.name = name;
        this.duratrion = duration;
        System.out.println("this "+name+" course will complete in "+duration+" months");
    }
    void learn(Course c1){
        System.out.println("we are learning "+c1.name);
    }

    public static void main(String[] args) {
        Course c1 = new Course();
        c1.name = "Java";
        c1.learn(c1);

        Course c2 = new Course();
        c2.name = "Devops";
        c2.learn(c2);

        Course c3 = new Course("DSA", 4);
    }
}
