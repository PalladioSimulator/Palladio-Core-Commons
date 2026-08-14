package de.uka.ipd.sdq.probfunction.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.uka.ipd.sdq.probfunction.math.IContinousPDF;
import de.uka.ipd.sdq.probfunction.math.IPDFFactory;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.ISamplePDF;

/**
 * Pins down what the distributions and the Fourier transform currently compute.
 *
 * This bundle wraps Apache Commons Math, and replacing that library replaces every
 * distribution implementation underneath it. None of that fails to compile - it changes
 * numbers, and there was nothing here to notice:
 *
 * <ul>
 * <li>{@code inverseF} is what {@code drawSample} draws through, so a different inversion
 * changes every sampled value and with it every simulation run,</li>
 * <li>the Fourier transform has a normalisation convention. The forward transform here is
 * unnormalised, which is why the first coefficient equals the sum of the input. A convention
 * that normalises by the square root of the sample count would halve these values for four
 * samples - and would still pass a round trip test, because the inverse transform would scale
 * them back. That is why both directions are pinned separately.</li>
 * </ul>
 *
 * The expected values were recorded from this bundle built against commons-math 2.1. The
 * tolerance leaves room for a different solver arriving at the same answer, but not for a
 * changed formula, parameterisation or normalisation.
 */
public class DistributionCharacterisationTest {

    private static final double TOL = 1e-9;

    private final IProbabilityFunctionFactory factory = IProbabilityFunctionFactory.eINSTANCE;
    private final IPDFFactory pdfs = factory.getPDFFactory();

    /** The quantiles inverseF is probed at. */
    private static final double[] P = { 0.01, 0.25, 0.5, 0.75, 0.99 };

    private static void assertValues(String what, double[] expected, double[] actual) {
        assertEquals(what + " length", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(what + "[" + i + "]", expected[i], actual[i], TOL);
        }
    }

    private static double[] cdf(IContinousPDF pdf, double... xs) {
        double[] out = new double[xs.length];
        for (int i = 0; i < xs.length; i++) {
            out[i] = pdf.cdf(xs[i]);
        }
        return out;
    }

    private static double[] density(IContinousPDF pdf, double... xs) {
        double[] out = new double[xs.length];
        for (int i = 0; i < xs.length; i++) {
            out[i] = pdf.density(xs[i]);
        }
        return out;
    }

    private static double[] inverse(IContinousPDF pdf) {
        double[] out = new double[P.length];
        for (int i = 0; i < P.length; i++) {
            out[i] = pdf.inverseF(P[i]);
        }
        return out;
    }

    private static double[] toArray(List<Double> values) {
        double[] out = new double[values.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = values.get(i);
        }
        return out;
    }

    @Test
    public void normalDistribution() {
        IContinousPDF pdf = pdfs.createNormalDistribution(2.0, 0.5);
        assertValues("normal cdf", new double[] { 0.0013498980316301035, 0.15865525393145702,
                0.5, 0.841344746068543, 0.9986501019683699 }, cdf(pdf, 0.5, 1.5, 2.0, 2.5, 3.5));
        assertValues("normal density", new double[] { 0.008863696823876015, 0.48394144903828673,
                0.7978845608028654, 0.48394144903828673, 0.008863696823876015 },
                density(pdf, 0.5, 1.5, 2.0, 2.5, 3.5));
        assertValues("normal inverseF", new double[] { 0.8368260629795808, 1.6627551249041626, 2.0,
                2.3372448750958377, 3.1631739370204195 }, inverse(pdf));
    }

    @Test
    public void exponentialDistribution() {
        IContinousPDF pdf = pdfs.createExponentialDistribution(0.4);
        assertValues("exponential cdf", new double[] { 0.03921056084767682, 0.3296799539643607,
                0.6321205588285577, 0.8646647167633873, 0.9816843611112658 },
                cdf(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("exponential density", new double[] { 0.3843157756609293, 0.2681280184142557,
                0.14715177646857694, 0.054134113294645084, 0.007326255555493671 },
                density(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("exponential inverseF", new double[] { 0.025125839633753626, 0.7192051811294522,
                1.7328679513998633, 3.4657359027997265, 11.512925464970227 }, inverse(pdf));
    }

    @Test
    public void gammaDistribution() {
        IContinousPDF pdf = pdfs.createGammaDistribution(2.0, 1.5);
        assertValues("gamma cdf", new double[] { 0.00212588263294108, 0.14430480161234654,
                0.49633172576650164, 0.8454126954952396, 0.9902431408563948 },
                cdf(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("gamma density", new double[] { 0.041578088223627456, 0.22818538623670756,
                0.20986178093062427, 0.079275540771672, 0.005656150228176924 },
                density(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("gamma inverseF", new double[] { 0.2228321103800574, 1.4419181446097973,
                2.517520485025065, 4.038951793334571, 9.957528102219754 }, inverse(pdf));
    }

    @Test
    public void lognormalDistribution() {
        IContinousPDF pdf = pdfs.createLognormalDistribution(0.5, 0.75);
        assertValues("lognormal cdf", new double[] { 9.319588884476593e-05, 0.2524925375469229,
                0.7105712431117281, 0.9304633180942297, 0.9918793347936188 },
                cdf(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("lognormal density", new double[] { 0.004939781323352625, 0.425930674029803,
                0.18239331801754707, 0.035622227503154254, 0.002961321103369551 },
                density(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("lognormal inverseF", new double[] { 0.2880097614386551, 0.9941498661758537,
                1.6487212707001282, 2.734277718377902, 9.43815867530676 }, inverse(pdf));
    }

    @Test
    public void uniformDistribution() {
        IContinousPDF pdf = pdfs.createUniformDistribution(1.0, 4.0);
        assertValues("uniform cdf", new double[] { 0.0, 0.0, 0.5, 1.0, 1.0 },
                cdf(pdf, 0.5, 1.0, 2.5, 4.0, 5.0));
        assertValues("uniform inverseF", new double[] { 1.03, 1.75, 2.5, 3.25, 3.9699999999999998 },
                inverse(pdf));
    }

    /**
     * The uniform distribution is hand written here and inherits the default density, which
     * refuses to answer. Commons Math ships a uniform distribution that does implement it, so
     * this is the one place where replacing the library turns an exception into a number.
     * Pinned so that the change is noticed rather than discovered.
     */
    @Test
    public void uniformDistributionHasNoDensity() {
        IContinousPDF pdf = pdfs.createUniformDistribution(1.0, 4.0);
        try {
            pdf.density(2.5);
            fail("expected the uniform distribution to refuse a density");
        } catch (RuntimeException expected) {
            // 'This distribution does not have a density function implemented'
        }
    }

    @Test
    public void chiSquareDistribution() {
        IContinousPDF pdf = pdfs.createChiSquareDistribution(3);
        assertValues("chiSquare cdf", new double[] { 0.008162576268123521, 0.1987480430987992,
                0.5247089166569794, 0.8282028557032647, 0.9814338645369567 },
                cdf(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("chiSquare density", new double[] { 0.12000389484301359, 0.24197072451914337,
                0.18072239266818127, 0.07322491280963243, 0.008500366602520341 },
                density(pdf, 0.1, 1.0, 2.5, 5.0, 10.0));
        assertValues("chiSquare inverseF", new double[] { 0.11483180189911713, 1.212532903060689,
                2.365973884375346, 4.108344935406652, 11.344866730147213 }, inverse(pdf));
    }

    @Test
    public void studentTDistribution() {
        IContinousPDF pdf = pdfs.createStudentTDistribution(5);
        assertValues("studentT cdf", new double[] { 0.050969739414929154, 0.3191494358204644, 0.5,
                0.6808505641795356, 0.9490302605850709 }, cdf(pdf, -2.0, -0.5, 0.0, 0.5, 2.0));
        assertValues("studentT density", new double[] { 0.06509031032621647, 0.32791853132274656,
                0.37960668982249446, 0.32791853132274656, 0.06509031032621647 },
                density(pdf, -2.0, -0.5, 0.0, 0.5, 2.0));
        assertValues("studentT inverseF", new double[] { -3.3649299988886607, -0.7266868438003483,
                0.0, 0.726686843800348, 3.364929998888658 }, inverse(pdf));
    }

    @Test
    public void fourierTransformIsUnnormalisedForwards() {
        ISamplePDF pdf = factory.createSamplePDFFromDouble(1.0, Arrays.asList(0.1, 0.2, 0.3, 0.4),
                factory.createDefaultUnit());
        ISamplePDF frequency = (ISamplePDF) pdf.getFourierTransform();

        assertValues("fourier forward", new double[] { 1.0, -0.19999999999999998,
                -0.20000000000000007, -0.19999999999999998 },
                toArray(frequency.getValuesAsDouble()));
    }

    @Test
    public void fourierTransformRoundTripsBackToTheInput() {
        ISamplePDF pdf = factory.createSamplePDFFromDouble(1.0, Arrays.asList(0.1, 0.2, 0.3, 0.4),
                factory.createDefaultUnit());
        ISamplePDF frequency = (ISamplePDF) pdf.getFourierTransform();
        ISamplePDF back = (ISamplePDF) frequency.getInverseFourierTransform();

        assertValues("fourier round trip", new double[] { 0.1, 0.2, 0.3, 0.4 },
                toArray(back.getValuesAsDouble()));
    }
}
