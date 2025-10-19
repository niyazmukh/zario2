package com.google.android.gms.common.api;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\j.smali */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    public j(Status status) {
        int i = status.f5535a;
        String str = status.f5536b;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f5535a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f5536b;
    }
}
