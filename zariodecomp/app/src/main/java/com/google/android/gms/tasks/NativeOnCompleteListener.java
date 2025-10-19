package com.google.android.gms.tasks;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\NativeOnCompleteListener.smali */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j5) {
        this.zza = j5;
    }

    public static void createAndAddCallback(Task<Object> task, long j5) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j5));
    }

    public native void nativeOnComplete(long j5, Object obj, boolean z4, boolean z5, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
