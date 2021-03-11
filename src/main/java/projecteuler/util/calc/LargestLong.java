package projecteuler.util.calc;

import projecteuler.util.collection.StreamOf;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class LargestLong extends Largest<Long> {

    public LargestLong(StreamOf<Long> stream) {
        super(stream, Long::compare);
    }

}
