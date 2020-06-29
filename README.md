# spring-framework-annotation-utils-bug


### Problem

As of Spring 5.2 `AnnotationUtils.findAnnotation` is not searching
for nested annotations properly.

Sample:

```
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface CustomAnnotation {
}

@CustomAnnotation
public class CustomType {
}
```

In Spring 5.1.x the following code returns proper result:

```
Deprecated annotation = AnnotationUtils.findAnnotation(CustomType.class, Deprecated.class);
```

but not in Spring 5.2.x.

### Test

Run `mvn clean test` to reproduce.
