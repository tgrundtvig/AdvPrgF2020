package blocks.basic.examples;

import blocks.basic.*;
import blocks.basic.impl.BasicBlockFactoryImpl;

import java.util.function.Function;

public class SimpleKeyboardConsoleExample
{
    public static void main(String[] args)
    {
        BasicBlockFactory factory = BasicBlockFactoryImpl.getInstance();
        Input<String> keyboard = factory.getKeyboardBlock();

        Output<String> console = factory.getConsoleBlock();
        ThreadBlock<String> thread = factory.getThreadBlock();
        PushBlock<String, String> push = factory.getPushBlock(new FunctionExample());
        push.setOutput(console);
        thread.setInput(keyboard);
        thread.setOutput(push);
        thread.start();
    }

    private static class FunctionExample implements Function<String, String>
    {
        @Override
        public String apply(String s)
        {
            return s+", for fanden!";
        }
    }
}
