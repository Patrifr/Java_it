package SPRINT1.TASCA_7.N2.Ex1_Json;

import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Serializer {
        String directory() default "";
        String fileName() default "ObjectFile.json";
    }
