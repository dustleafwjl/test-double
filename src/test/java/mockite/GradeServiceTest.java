package mockite;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;
import stub.GradeSystemStub;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystemStub = mock(GradeSystem.class);
        when(gradeSystemStub.gradesFor(10010)).thenReturn(Arrays.asList(90.0, 95.0, 100.0));
        GradeService gradeService = new GradeService(gradeSystemStub);
        double result = gradeService.calculateAverageGrades(10010);
        Assertions.assertEquals(95.0, result);
    }
}
