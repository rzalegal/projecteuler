package projecteuler.util.log;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class ConsoleLog implements Log {

    @Override
    public void write(String output) {
        System.out.println(output);
    }
}
