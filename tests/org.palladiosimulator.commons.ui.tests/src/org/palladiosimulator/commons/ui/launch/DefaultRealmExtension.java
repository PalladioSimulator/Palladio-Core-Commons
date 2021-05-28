package org.palladiosimulator.commons.ui.launch;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.swt.widgets.Display;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class DefaultRealmExtension implements BeforeEachCallback,
    AfterEachCallback{
    public static class RealmHelper extends Realm {
        @Override
        public boolean isCurrent() {
            // This is not relevant
            return true;
        }
        protected static Realm setDefault(Realm realm) {
            return Realm.setDefault(realm);
        }
    }

    private Realm previousRealm;

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        RealmHelper.setDefault(previousRealm);
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        previousRealm = Realm.getDefault();
        
        Display display = Display.getCurrent() != null
                && !Display.getCurrent().isDisposed() ? Display.getCurrent()
                : Display.getDefault();
        
        RealmHelper.setDefault(DisplayRealm.getRealm(display));
    }
}
