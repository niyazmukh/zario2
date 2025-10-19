package com.niyaz.zario;

import J0.s;
import android.content.Context;
import androidx.work.WorkerParameters;
import b3.C0294S;
import b3.InterfaceC0296U;
import com.google.firebase.auth.FirebaseAuth;
import com.niyaz.zario.firebase.RemoteSyncWorker;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\g.smali */
public final class g implements i0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6643a;

    public g(i iVar) {
        this.f6643a = iVar;
    }

    @Override // i0.b
    public final s create(Context context, WorkerParameters workerParameters) {
        i iVar = this.f6643a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) iVar.f6646b.provideFirebaseAuthProvider.get();
        DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl = iVar.f6646b;
        return new RemoteSyncWorker(context, workerParameters, firebaseAuth, (C0294S) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.firestoreUserGatewayProvider.get(), daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.remoteSyncDao(), (InterfaceC0296U) daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl.appRemoteSyncNotifierProvider.get());
    }
}
