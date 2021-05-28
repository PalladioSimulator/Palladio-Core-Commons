package org.palladiosimulator.commons.ui.e4;

import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.E4PartWrapper;

@SuppressWarnings("restriction")
/**
 * This mixin interface contains the adaptation logic to enable a legacy property sheet page to
 * listen to E4 selection events.
 * 
 * You should probably not need this interface directly.
 * 
 * @see E4PartWrappingAdapterDelegator
 * 
 * @author Sebastian Krach
 *
 */
public interface E4SelectionAwarePropertySheetPageMixin extends ISelectionListener {
    public static final String ADAPTED_PART = "org.palladiosimulator.commons.ui.e4.adaptedpart";

    IWorkbenchPart getAdaptedWorkbenchPart();

    default boolean isInitialized() {
        return true;
    }

    default void setSelection(MPart activePart, Object selection) {
        var viewPart = getAdaptedWorkbenchPart();
        if (isInitialized() && activePart != null && (activePart == viewPart || (activePart.getTransientData()
            .containsKey(E4PartWrapper.E4_WRAPPER_KEY)
                && activePart.getTransientData()
                    .get(E4PartWrapper.E4_WRAPPER_KEY) == viewPart))) {
            if (selection == null) {
                this.selectionChanged(viewPart, StructuredSelection.EMPTY);
            } else {
                if (selection instanceof Object[]) {
                    this.selectionChanged(viewPart, new StructuredSelection((Object[]) selection));
                } else if (selection instanceof List) {
                    this.selectionChanged(viewPart, new StructuredSelection((List<?>) selection));
                } else {
                    this.selectionChanged(viewPart, new StructuredSelection(selection));
                }
            }
        }
    }

}
