package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;
import k0.AbstractC0653c;
import k0.C0655e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\SavedStateHandleHolder.smali */
public final class SavedStateHandleHolder {
    private AbstractC0653c extras;
    private X handle;
    private final boolean nonComponentActivity;

    public SavedStateHandleHolder(AbstractC0653c abstractC0653c) {
        this.nonComponentActivity = abstractC0653c == null;
        this.extras = abstractC0653c;
    }

    public void clear() {
        this.extras = null;
    }

    public X getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!this.nonComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        X x3 = this.handle;
        if (x3 != null) {
            return x3;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        C0655e c0655e = new C0655e(this.extras);
        c0655e.b(a0.f4628c, Bundle.EMPTY);
        this.extras = c0655e;
        X xD = a0.d(c0655e);
        this.handle = xD;
        this.extras = null;
        return xD;
    }

    public boolean isInvalid() {
        return this.handle == null && this.extras == null;
    }

    public void setExtras(AbstractC0653c abstractC0653c) {
        if (this.handle != null) {
            return;
        }
        this.extras = abstractC0653c;
    }
}
