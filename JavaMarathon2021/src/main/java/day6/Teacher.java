package day6;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student n) {
        int grade = (int) (Math.random()*4+2);
        String litGrade=" ";
        switch (grade) {
            case 2: litGrade = "Омерзительно";
            break;
            case 3: litGrade = "Долбоёб";
            break;
            case 4: litGrade = "Почти, псина";
            break;
            case 5: litGrade = "Заебись, жаль, что ты ебанат";
            break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " +
        n.getName() + " по предмету " + subject + " на оценку " + litGrade);

    }
}
