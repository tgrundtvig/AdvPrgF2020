package dk.cphbusiness.advprg.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Target(value=METHOD)
@Retention(value=RUNTIME)
public @interface MyAnnotation
{
}
