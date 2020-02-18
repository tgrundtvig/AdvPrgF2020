/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advprg.meyer.textio;

import java.io.IOException;

/**
 *
 * @author Tobias Grundtvig
 */
public class TextIO implements ITextIO
{
    private final ISimpleTextIO io;

    public TextIO(ISimpleTextIO io)
    {
        this.io = io;
    }


    @Override
    public boolean getYesOrNo()
    {
        while(true)
        {

            String input = io.get().toLowerCase();
            if(input.equals("y")|| input.equals("yes"))
            {
                return true;
            }
            if(input.equals("n")|| input.equals("no"))
            {
                return false;
            }
            io.put("\nYou must enter (y)es or (n)o: ");
        }
    }

    @Override
    public int getInteger()
    {
        int res = 0;
        boolean ok = false;
        do
        {
            
            String input = io.get();
            try
            {
                res = Integer.parseInt(input);
                ok = true;
            }
            catch(NumberFormatException exp)
            {
                io.put("\nYou must enter an integer!");
            }
        } while(!ok);
        return res;
    }
    
    @Override
    public int getInteger(int min, int max)
    {
        boolean ok = false;
        int res = 0;
        do
        {
            res = getInteger();
            if(res < min || res > max)
            {
                io.put("\nYou must enter an integer between " + min + " and " + max + ", both inclusive.");
            }
            else
            {
                ok = true;
            }
        } while(!ok);
        return res;
    }
    
    @Override
    public int select(String header, Iterable<String> choices, String footer)
    {
        put(header);
        int count = 0;
        for(String s : choices)
        {
            io.put("\n" + (++count) + " - " + s);
        }
        io.put("\n" + footer);
        return getInteger(1, count)-1;
    }

    @Override
    public void put(String s)
    {
        io.put(s);
    }

    @Override
    public void clear()
    {
        io.clear();
    }

    @Override
    public String get()
    {
        return io.get();
    }

    @Override
    public void close() throws IOException
    {
        io.close();
    }    
}
