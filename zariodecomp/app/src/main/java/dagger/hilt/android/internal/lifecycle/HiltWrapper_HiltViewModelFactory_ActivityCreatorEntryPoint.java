package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.codegen.OriginatingElement;

@EntryPoint
@OriginatingElement(topLevelClass = HiltViewModelFactory.class)
@InstallIn({ActivityComponent.class})
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.smali */
public interface HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint extends HiltViewModelFactory.ActivityCreatorEntryPoint {
}
