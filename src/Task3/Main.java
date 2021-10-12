package Task3;

public class Main {
    public static void main(String[] args) {
        final Student a = new Student("Ivan");
        final Subject math = new Subject("Programming");
        final Grade grade = new Grade();
        grade.setStudent(a);
        grade.setSubject(math);
        grade.setValue(5);
        final Grade grade2 = new Grade("Alex", "Ukrainian", 4);

        System.out.println(grade);
        System.out.println(grade2);
    }
}
