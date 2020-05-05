package dk.cphbusiness.advprg.annotations;

public interface Server
{
    public void setUpServer(Object serverInterface) throws IllegalArgumentException;

    public void runServer();
}
