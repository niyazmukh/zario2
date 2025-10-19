package T;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import l.U0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T\a.smali */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f3122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U0 u02) {
        super(new Handler());
        this.f3122a = u02;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        U0 u02 = this.f3122a;
        if (!u02.f3126b || (cursor = u02.f3127c) == null || cursor.isClosed()) {
            return;
        }
        u02.f3125a = u02.f3127c.requery();
    }
}
