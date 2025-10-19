package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\IntegrityServiceException.smali */
public class IntegrityServiceException extends com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f6233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, "Integrity API error (" + i + "): " + com.google.android.play.core.integrity.model.a.a(i) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f6233a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f6233a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
