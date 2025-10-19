package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\a.1.smali */
public final class C0526a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0530e f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0527b f7156b;

    public C0526a(C0527b c0527b, C0530e c0530e) {
        this.f7156b = c0527b;
        this.f7155a = c0530e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        C0527b c0527b = this.f7156b;
        DialogInterface.OnClickListener onClickListener = c0527b.f7166l;
        C0530e c0530e = this.f7155a;
        onClickListener.onClick(c0530e.f7176b, i);
        if (c0527b.f7167m) {
            return;
        }
        c0530e.f7176b.dismiss();
    }
}
