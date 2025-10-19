package k;

import android.view.ActionProvider;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\o.smali */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f8270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8271b;

    /* renamed from: c, reason: collision with root package name */
    public g1.i f8272c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f8271b = sVar;
        this.f8270a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f8270a.onCreateActionView(nVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        g1.i iVar = this.f8272c;
        if (iVar != null) {
            l lVar = ((n) iVar.f7594b).f8257n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
