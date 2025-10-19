package com.google.android.play.core.integrity;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\IntegrityTokenRequest.smali */
public abstract class IntegrityTokenRequest {

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\IntegrityTokenRequest$Builder.smali */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j5);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new am();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
