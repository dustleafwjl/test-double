package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    GradeService gradeService;
    @BeforeEach
    public void setup() {
        GradeSystemStub gradeSystemStub = new GradeSystemStub();
        gradeService = new GradeService(gradeSystemStub);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(10010);
        Assertions.assertEquals(95.0, result);
    }
}
