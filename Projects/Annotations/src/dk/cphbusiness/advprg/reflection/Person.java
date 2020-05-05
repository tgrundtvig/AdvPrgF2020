package dk.cphbusiness.advprg.reflection;

import dk.cphbusiness.advprg.annotations.MyAnnotation;

public class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public String getName()
    {
        return name;
    }

    @MyAnnotation
    public void setName(String name)
    {
        this.name = name;
    }

    @MyAnnotation
    public int getAge()
    {
        return age;
    }

    @MyAnnotation
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " (" + age + ")";
    }
}
