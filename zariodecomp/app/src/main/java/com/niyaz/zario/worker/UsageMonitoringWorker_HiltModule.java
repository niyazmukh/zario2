package com.niyaz.zario.worker;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(topLevelClass = UsageMonitoringWorker.class)
@InstallIn({SingletonComponent.class})
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker_HiltModule.smali */
public interface UsageMonitoringWorker_HiltModule {
    i0.b bind(UsageMonitoringWorker_AssistedFactory usageMonitoringWorker_AssistedFactory);
}
