package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager.smali */
public interface StandardIntegrityManager {

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$PrepareIntegrityTokenRequest.smali */
    public static abstract class PrepareIntegrityTokenRequest {

        /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder.smali */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j5);
        }

        public static Builder builder() {
            c cVar = new c();
            cVar.a(0);
            return cVar;
        }

        public abstract int a();

        public abstract long b();
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$StandardIntegrityToken.smali */
    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i);

        public abstract String token();
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$StandardIntegrityTokenProvider.smali */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$StandardIntegrityTokenRequest.smali */
    public static abstract class StandardIntegrityTokenRequest {

        /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\StandardIntegrityManager$StandardIntegrityTokenRequest$Builder.smali */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new f();
        }

        public abstract String a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
