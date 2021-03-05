package striner;

public class StudyClassJava {

    public static void main(String[] args) {
        StudyClassJava studyClassJava = new StudyClassJava();
        studyClassJava.fun2();
    }

    public void fun1() {
        System.out.println("StudyClassJava -- fun1()");
    }

    private void fun2() {
        // java调用scala-object
        StudyClassScala.printFunObject("JavaUtil01 -- fun2()");

        // java调用scala-class
        StudyClassScala studyClassScala = new StudyClassScala();
        studyClassScala.printFunClass("JavaUtil02 -- fun2()");
    }
}
