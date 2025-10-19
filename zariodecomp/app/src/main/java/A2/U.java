package A2;

import android.database.sqlite.SQLiteTransactionListener;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\U.smali */
public final class U implements SQLiteTransactionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f139a;

    public U(X x3) {
        this.f139a = x3;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.f139a.f148f.q();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        this.f139a.f148f.o();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }
}
