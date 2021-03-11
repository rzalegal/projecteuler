package projecteuler.util.calc;

import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
public class Whole implements Number<Long> {

    private final Supplier<Long> longSupplier;

    public Whole(Long justLong) {
        this(() -> justLong);
    }

    public Whole(Whole whole) {
        this(whole::value);
    }

    @Override
    public Long value() {
        return longSupplier.get();
    }
}
