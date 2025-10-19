package o0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\p.1.smali */
public final class C0793p extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f9100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f9102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0767B f9103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f9104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793p(kotlin.jvm.internal.o oVar, ArrayList arrayList, kotlin.jvm.internal.p pVar, C0767B c0767b, Bundle bundle) {
        super(1);
        this.f9100a = oVar;
        this.f9101b = arrayList;
        this.f9102c = pVar;
        this.f9103d = c0767b;
        this.f9104e = bundle;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        List listSubList;
        C0787j entry = (C0787j) obj;
        kotlin.jvm.internal.i.e(entry, "entry");
        this.f9100a.f8428a = true;
        ArrayList arrayList = this.f9101b;
        int iIndexOf = arrayList.indexOf(entry);
        if (iIndexOf != -1) {
            kotlin.jvm.internal.p pVar = this.f9102c;
            int i = iIndexOf + 1;
            listSubList = arrayList.subList(pVar.f8429a, i);
            pVar.f8429a = i;
        } else {
            listSubList = L3.s.f2351a;
        }
        this.f9103d.a(entry.f9069b, this.f9104e, entry, listSubList);
        return K3.k.f2288a;
    }
}
