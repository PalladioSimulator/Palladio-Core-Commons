/**
 *
 */
package de.uka.ipd.sdq.probfunction.math.apache.distribution;

import org.apache.commons.math3.distribution.AbstractRealDistribution;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * @author joerg
 *
 * Hand written rather than taken from Commons Math, whose uniform distribution offers a
 * density where this one deliberately refuses to.
 */
public class UniformDistributionImpl extends AbstractRealDistribution {

    /**
	 *
	 */
    private static final long serialVersionUID = 4771624459254238355L;
    double a, b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public UniformDistributionImpl(double a, double b) {
        if (b < a)
            throw new MathIllegalArgumentException(LocalizedFormats.SIMPLE_MESSAGE,
                    "Second value has to be greater than first value of interval");

        this.a = a;
        this.b = b;

    }

    @Override
    public double cumulativeProbability(double x) {
        if (x < a)
            return 0;
        else if (x > b)
            return 1;

        return (x - a) / (b - a);
    }

    /** Deliberately not implemented: this distribution does not offer a density. */
    @Override
    public double density(double x) {
        throw new MathUnsupportedOperationException(LocalizedFormats.SIMPLE_MESSAGE,
                "This distribution does not have a density function implemented");
    }

    public double getMean() {
        return (a + b) / 2;
    }

    public double getVariance() {
        return 1 / 12.0 * (b - a) * (b - a);
    }

    @Override
    public double getNumericalMean() {
        return getMean();
    }

    @Override
    public double getNumericalVariance() {
        return getVariance();
    }

    @Override
    public double getSupportLowerBound() {
        return a;
    }

    @Override
    public double getSupportUpperBound() {
        return b;
    }

    @Override
    public boolean isSupportLowerBoundInclusive() {
        return true;
    }

    @Override
    public boolean isSupportUpperBoundInclusive() {
        return true;
    }

    @Override
    public boolean isSupportConnected() {
        return true;
    }

}
