package JavaAPI.Interfaces.Compare;

import java.util.Comparator;

public class StudentScienceComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 오름차순 정렬
        return o1.getScienceScore() - o2.getScienceScore();
    }
}
