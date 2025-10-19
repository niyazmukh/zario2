package com.google.android.gms.tasks;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\CancellationToken.smali */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    public abstract CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener);
}
