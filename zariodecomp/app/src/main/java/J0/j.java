package J0;

import android.app.Notification;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2055b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f2056c;

    public j(int i, Notification notification, int i5) {
        this.f2054a = i;
        this.f2056c = notification;
        this.f2055b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f2054a == jVar.f2054a && this.f2055b == jVar.f2055b) {
            return this.f2056c.equals(jVar.f2056c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2056c.hashCode() + (((this.f2054a * 31) + this.f2055b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f2054a + ", mForegroundServiceType=" + this.f2055b + ", mNotification=" + this.f2056c + '}';
    }
}
