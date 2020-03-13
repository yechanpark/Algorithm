package JavaAPI.Interfaces.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main.comparable();
        System.out.println("-------------------------------");
        Main.comparator(new StudentNameComparator());
        System.out.println("-------------------------------");
        Main.comparator(new StudentMathComparator());
        System.out.println("-------------------------------");
        Main.comparator(new StudentScienceComparator());
        System.out.println("-------------------------------");
        Main.comparator(new StudentEnglishComparator());
        System.out.println("-------------------------------");
        Main.lambda();

    }

    public static void comparable() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("name2", 1, 2, 9));
        studentList.add(new Student("name1", 2, 8, 2));
        studentList.add(new Student("name3", 3, 1, 3));
        studentList.add(new Student("name3", 4, 3, 1));
        studentList.add(new Student("name4", 5, 7, 3));
        studentList.add(new Student("name5", 14, 10, 3));
        studentList.add(new Student("name6", 7, 12, 4));
        studentList.add(new Student("name7", 8, 4, 8));

        System.out.println("정렬 전");
        for (Student student : studentList) {
            System.out.println(
                    "이름 : " + student.getName()
                            + ", 총점 : " + student.getTotalScore()
                            + ", 수학 : " + student.getMathScore()
                            + ", 과학 :" + student.getScienceScore()
                            + ", 영어 : " + student.getEnglishScore()
            );
        }
        System.out.println();

        Collections.sort(studentList);

        System.out.println("기본 정렬 (총점 오름차순) 정렬 후");
        for (Student student : studentList) {
            System.out.println(
                    "이름 : " + student.getName()
                            + ", 총점 : " + student.getTotalScore()
                            + ", 수학 : " + student.getMathScore()
                            + ", 과학 :" + student.getScienceScore()
                            + ", 영어 : " + student.getEnglishScore()
            );
        }
    }

    public static void comparator(Comparator<Student> studentComparator) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("name2", 1, 2, 9));
        studentList.add(new Student("name1", 2, 8, 2));
        studentList.add(new Student("name5", 3, 1, 4));
        studentList.add(new Student("name3", 4, 3, 1));
        studentList.add(new Student("name5", 9, 7, 3));
        studentList.add(new Student("name4", 6, 10, 3));
        studentList.add(new Student("name6", 7, 12, 4));
        studentList.add(new Student("name7", 8, 4, 8));

        System.out.println("정렬 전");
        for (Student student : studentList) {
            System.out.println(
                    "이름 : " + student.getName()
                            + ", 총점 : " + student.getTotalScore()
                            + ", 수학 : " + student.getMathScore()
                            + ", 과학 :" + student.getScienceScore()
                            + ", 영어 : " + student.getEnglishScore()
            );
        }
        System.out.println();

        studentList.sort(studentComparator);

        System.out.println(studentComparator.getClass().getSimpleName() + "정렬 후");
        for (Student student : studentList) {
            System.out.println(
                    "이름 : " + student.getName()
                            + ", 총점 : " + student.getTotalScore()
                            + ", 수학 : " + student.getMathScore()
                            + ", 과학 :" + student.getScienceScore()
                            + ", 영어 : " + student.getEnglishScore()
            );
        }
    }

    public static void lambda() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("name2", 1, 2, 9));
        studentList.add(new Student("name1", 2, 8, 2));
        studentList.add(new Student("name5", 3, 1, 4));
        studentList.add(new Student("name3", 4, 3, 1));
        studentList.add(new Student("name5", 9, 7, 3));
        studentList.add(new Student("name4", 6, 10, 3));
        studentList.add(new Student("name6", 7, 12, 4));
        studentList.add(new Student("name7", 8, 4, 8));

        System.out.println("람다 - 이름 오름차순");
        studentList.stream().sorted(new StudentNameComparator()).forEach((student) -> {
                    System.out.println(
                            "이름 : " + student.getName()
                                    + ", 총점 : " + student.getTotalScore()
                                    + ", 수학 : " + student.getMathScore()
                                    + ", 과학 :" + student.getScienceScore()
                                    + ", 영어 : " + student.getEnglishScore());
                }
        );

        System.out.println("람다 - 이름 내림차순");
        studentList.stream().sorted(new StudentNameComparator().reversed()).forEach((student) -> {
                    System.out.println(
                            "이름 : " + student.getName()
                                    + ", 총점 : " + student.getTotalScore()
                                    + ", 수학 : " + student.getMathScore()
                                    + ", 과학 :" + student.getScienceScore()
                                    + ", 영어 : " + student.getEnglishScore());
                }
        );

    }
}
