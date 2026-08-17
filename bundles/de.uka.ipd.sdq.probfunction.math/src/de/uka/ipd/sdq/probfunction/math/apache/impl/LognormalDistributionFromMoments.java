package de.uka.ipd.sdq.probfunction.math.apache.impl;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathRuntimeException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

import de.uka.ipd.sdq.probfunction.math.IRandomGenerator;
import de.uka.ipd.sdq.probfunction.math.apache.distribution.LognormalDistributionFromMomentsImpl;
import de.uka.ipd.sdq.probfunction.math.exception.ProbabilityFunctionException;

public class LognormalDistributionFromMoments extends LognormalDistribution {

    /**
     * Constructs a GammaDist object based on the distribution mean and distribution coefficient of
     * variance.
     * 
     * @param distribution
     *            mean
     * @param coefficient
     *            of variance ( = standard deviation / mean)
     */
    public LognormalDistributionFromMoments(double mean, double variance, IRandomGenerator rng) {
        super(rng);

        try {
            this.internalFunction = new LognormalDistributionFromMomentsImpl(mean, variance);
        } catch (MathIllegalArgumentException | MathIllegalStateException | MathArithmeticException
                | MathUnsupportedOperationException | MathRuntimeException e) {
            throw new ProbabilityFunctionException(e.getLocalizedMessage());

        }
    }

}
