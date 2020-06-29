package spring_51;

import common.CustomType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AnnotationUtils;

public class AnnotationSearchTest {

    @Test
    public void shouldFindNestedAnnotation() {
        Deprecated annotation = AnnotationUtils.findAnnotation(CustomType.class, Deprecated.class);
        Assertions.assertNotNull(annotation);
    }

}
