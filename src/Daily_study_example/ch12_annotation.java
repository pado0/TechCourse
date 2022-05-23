package Daily_study_example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TestInfo(testedBy = "hyo", count = 2)
public class ch12_annotation {
    public static void main(String[] args) {

        Class<ch12_annotation> cls = ch12_annotation.class;
        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);

        System.out.println(anno.count());
        System.out.println(anno.testedBy());
    }

}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;
    String testedBy();
}