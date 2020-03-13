package JavaAPI.Interfaces.Compare;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Student implements Comparable<Student> {
    private String name;
    private int mathScore;
    private int scienceScore;
    private int englishScore;
    private int totalScore;

    public Student(String name, int mathScore, int scienceScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
        this.totalScore = mathScore + scienceScore + englishScore;
    }

    // 기본 정렬 기준 : 총점 오름차순
    @Override
    public int compareTo(Student o) {
        return this.getTotalScore() - o.getTotalScore();
    }
}
