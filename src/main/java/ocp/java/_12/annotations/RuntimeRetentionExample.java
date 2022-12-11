package ocp.java._12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant{}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediatly{
    int times();
}

class Dog{}

@VeryImportant
class Cat{
    private String name;
    Cat(String name){
        this.name = name;
    }

    @RunImmediatly(times=4)
    public void speak(){
        System.out.println("Meow Meow!");
    }

    public void eat(){
        System.out.println("Gulp Gulp!");
    }
}

public class RuntimeRetentionExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Mini");
        checkIfImportant(cat);
        Dog dog = new Dog();
        checkIfImportant(dog);

        for(Method method: cat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediatly.class)){
                RunImmediatly annotation = method.getAnnotation(RunImmediatly.class);
                for(int i=0; i<annotation.times(); i++) {
                    method.invoke(cat);
                }
            }
        }
    }

    private static void checkIfImportant(Object obj) {
        if(obj.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This class is very important");
        } else{
            System.out.println("This is not an important class");
        }
    }
}