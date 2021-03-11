package projecteuler.util.calc;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class SqrtWhole extends Whole {

    public SqrtWhole(Long of) {
        super((long) Math.sqrt(of));
    }

}
