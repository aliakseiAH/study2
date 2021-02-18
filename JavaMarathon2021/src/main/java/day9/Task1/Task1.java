package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student st = new Student("Вася", "хуеплетение 1");
        Teacher te = new Teacher("Зоя Ебцовна", "пиздоныряние");
        System.out.println("Уч группа - " + st.getGroupName());
        System.out.println("Предмет - " + te.getSubjectName());
        st.printInfo();
        te.printInfo();

    }
}
