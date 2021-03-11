package projecteuler.util.calc;

import java.util.function.UnaryOperator;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class Increment implements UnaryOperator<Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 1;
    }

}
