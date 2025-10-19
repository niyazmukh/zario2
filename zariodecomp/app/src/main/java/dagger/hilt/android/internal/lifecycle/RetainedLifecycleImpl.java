package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.android.lifecycle.RetainedLifecycle$OnClearedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\RetainedLifecycleImpl.smali */
public final class RetainedLifecycleImpl implements ActivityRetainedLifecycle, ViewModelLifecycle {
    private final Set<RetainedLifecycle$OnClearedListener> listeners = new HashSet();
    private boolean onClearedDispatched = false;

    private void throwIfOnClearedDispatched() {
        if (this.onClearedDispatched) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }

    public void addOnClearedListener(RetainedLifecycle$OnClearedListener retainedLifecycle$OnClearedListener) {
        ThreadUtil.ensureMainThread();
        throwIfOnClearedDispatched();
        this.listeners.add(retainedLifecycle$OnClearedListener);
    }

    public void dispatchOnCleared() {
        ThreadUtil.ensureMainThread();
        this.onClearedDispatched = true;
        Iterator<RetainedLifecycle$OnClearedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
    }

    public void removeOnClearedListener(RetainedLifecycle$OnClearedListener retainedLifecycle$OnClearedListener) {
        ThreadUtil.ensureMainThread();
        throwIfOnClearedDispatched();
        this.listeners.remove(retainedLifecycle$OnClearedListener);
    }
}
