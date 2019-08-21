package com.itcast.domain;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Field;

@Father
public class FatherJ{
    @Father(name="bb")
    String name;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FatherJ> fatherJClass = FatherJ.class;
        FatherJ fatherJ = fatherJClass.newInstance();
        Field[] declaredFields = fatherJClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            Annotation[] annotation = declaredField.getAnnotations();
            for (Annotation annotation1 : annotation) {
                System.out.println(annotation1);
            }
        }
    }
}
