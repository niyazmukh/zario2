package com.google.android.gms.tasks;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\SuccessContinuation.smali */
public interface SuccessContinuation<TResult, TContinuationResult> {
    Task<TContinuationResult> then(TResult tresult);
}
