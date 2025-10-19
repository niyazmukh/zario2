package dagger.hilt.android.internal.managers;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import dagger.hilt.codegen.OriginatingElement;

@EntryPoint
@OriginatingElement(topLevelClass = ActivityRetainedComponentManager.class)
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.smali */
public interface HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint extends ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint {
}
