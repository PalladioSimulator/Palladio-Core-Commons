package de.uka.ipd.sdq.probfunction.math.apache.distribution;

import org.apache.commons.math3.distribution.NormalDistribution;

/**
 * A lognormal distribution expressed through the normal one: a variable is lognormally
 * distributed when its logarithm is normally distributed.
 *
 * Every method has to transform, the inverse included - the base class inverts the normal
 * distribution in closed form, so without the exponential this class would return the
 * quantiles of that normal distribution instead of its own.
 */
public class LognormalDistributionImpl extends NormalDistribution {

    /** Serializable version identifier */
    private static final long serialVersionUID = -4630735663414796584L;

    /**
     * @param mu
     *            mean of the underlying normal distribution
     * @param sigma
     *            standard deviation of the underlying normal distribution
     */
    public LognormalDistributionImpl(double mu, double sigma) {
        super(mu, sigma);
    }

    @Override
    public double cumulativeProbability(double x) {
        if (x == 0)
            return 0.0;

        return super.cumulativeProbability(Math.log(x));
    }

    @Override
    public double cumulativeProbability(double x0, double x1) {
        return super.cumulativeProbability(Math.log(x0), Math.log(x1));
    }

    @Override
    public double density(double x) {
        return super.density(Math.log(x)) / x;
    }

    @Override
    public double inverseCumulativeProbability(double p) {
        return Math.exp(super.inverseCumulativeProbability(p));
    }

}
