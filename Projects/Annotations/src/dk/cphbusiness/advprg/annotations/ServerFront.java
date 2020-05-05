package dk.cphbusiness.advprg.annotations;

public interface ServerFront
{
    public void foo();
    public int someOtherMethodNotRelevantToTheServerFront(int a);

    //@ExportMethod
    public String addName(String name);

    //@ExportMethod
    public String hasName(String name);
    //http:www.cphbusiness.dk/MyServer/addName?name="Anders"
}
