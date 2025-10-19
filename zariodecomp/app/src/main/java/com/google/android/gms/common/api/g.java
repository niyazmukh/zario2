package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.InterfaceC0366d;
import com.google.android.gms.common.internal.InterfaceC0367e;
import com.google.android.gms.common.internal.InterfaceC0375m;
import h1.C0590c;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\g.smali */
public interface g extends b {
    void connect(InterfaceC0366d interfaceC0366d);

    void disconnect();

    void disconnect(String str);

    C0590c[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC0375m interfaceC0375m, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC0367e interfaceC0367e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
