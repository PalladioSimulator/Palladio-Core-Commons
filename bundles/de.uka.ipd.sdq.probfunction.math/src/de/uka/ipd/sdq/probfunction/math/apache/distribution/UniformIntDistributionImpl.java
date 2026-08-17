/**
 * 
 */
package de.uka.ipd.sdq.probfunction.math.apache.distribution;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathRuntimeException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.distribution.AbstractIntegerDistribution;

/**
 * @author joerg
 * 
 */
public class UniformIntDistributionImpl extends AbstractIntegerDistribution {

    /**
	 * 
	 */
    private static final long serialVersionUID = 4771624459254238355L;
    int a, b;
    int intCount;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public UniformIntDistributionImpl(int a, int b) {
        if (b < a)
            throw new MathIllegalArgumentException(LocalizedFormats.SIMPLE_MESSAGE, "Second value has to be greater than first value of interval");

        this.a = a;
        this.b = b;
        intCount = b - a + 1;

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.commons.math3.distribution.AbstractIntegerDistribution#cumulativeProbability(int)
     */
    @Override
    public double cumulativeProbability(int x) {
        if (x < a)
            return 0;
        else if (x > b)
            return 1;

        return (x - a + 1) / (double) intCount;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.commons.math3.distribution.IntegerDistribution#probability(int)
     */
    @Override
    public double probability(int x) {
        if (x < a || x > b)
            return 0;

        return 1.0 / intCount;
    }

    @Override
    public int getSupportLowerBound() {
        return a;
    }

    @Override
    public int getSupportUpperBound() {
        return b;
    }

    @Override
    public boolean isSupportConnected() {
        return true;
    }

    @Override
    public double getNumericalMean() {
        return getMean();
    }

    @Override
    public double getNumericalVariance() {
        return getVariance();
    }

    public double getMean() {
        return (a + b) / 2.0;
    }

    public double getVariance() {
        return (-1.0 * intCount * intCount) / 12.0;
    }

}
