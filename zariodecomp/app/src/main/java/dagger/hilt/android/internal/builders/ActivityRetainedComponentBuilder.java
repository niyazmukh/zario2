package dagger.hilt.android.internal.builders;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;

@DefineComponent.Builder
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\builders\ActivityRetainedComponentBuilder.smali */
public interface ActivityRetainedComponentBuilder {
    ActivityRetainedComponent build();

    ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder);
}
