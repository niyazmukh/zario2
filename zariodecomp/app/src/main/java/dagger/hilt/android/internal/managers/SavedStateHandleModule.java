package dagger.hilt.android.internal.managers;

import androidx.lifecycle.X;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.lifecycle.ActivityRetainedSavedState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@InstallIn({ActivityRetainedComponent.class})
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\SavedStateHandleModule.smali */
abstract class SavedStateHandleModule {
    @ActivityRetainedScoped
    @ActivityRetainedSavedState
    public static X provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
