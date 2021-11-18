package de.uka.ipd.sdq.identifier.uiutils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.identifier.Identifier;

public class AnyIdentifierChildPropertyTester extends PropertyTester {

    protected interface PropertyTest {
        boolean test(Object receiver, Object[] args, Object expectedValue);
    }
    
    protected final Map<String, PropertyTest> testers = new HashMap<>();
    
    public AnyIdentifierChildPropertyTester() {
        testers.put("child", this::testChild);
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        var tester = testers.get(property);
        if (tester == null) {
            return false;
        }
        return tester.test(receiver, args, expectedValue);
    }
    
    protected boolean testChild(Object receiver, Object[] args, Object expectedValue) {
        if (!(receiver instanceof EObject)) {
            return false;
        }
        var queue = new LinkedList<EObject>();
        queue.add((EObject)receiver);
        while (!queue.isEmpty()) {
            var element = queue.pop();
            if (element instanceof Identifier) {
                return true;
            }
            queue.addAll(element.eContents());
        }
        return false;
    }

}
