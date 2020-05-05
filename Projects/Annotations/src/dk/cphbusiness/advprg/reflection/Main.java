package dk.cphbusiness.advprg.reflection;

public class Main
{
    public static void main(String[] args)
    {
        Person t = new Person("Tobias", 46);
        Inspector insp = new Inspector();

        insp.inspect(t);
    }
}
