package com.google.android.recaptcha;

import R3.a;
import S0.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\RecaptchaErrorCode.smali */
public final class RecaptchaErrorCode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RecaptchaErrorCode[] $VALUES;
    private final int errorCode;
    private final String errorMessage;
    public static final RecaptchaErrorCode UNKNOWN_ERROR = new RecaptchaErrorCode("UNKNOWN_ERROR", 0, 0, "Unknown Error");
    public static final RecaptchaErrorCode NETWORK_ERROR = new RecaptchaErrorCode("NETWORK_ERROR", 1, 1, "Network Error");
    public static final RecaptchaErrorCode INVALID_SITEKEY = new RecaptchaErrorCode("INVALID_SITEKEY", 2, 2, "Site key invalid");
    public static final RecaptchaErrorCode INVALID_KEYTYPE = new RecaptchaErrorCode("INVALID_KEYTYPE", 3, 3, "Key type invalid");
    public static final RecaptchaErrorCode INVALID_PACKAGE_NAME = new RecaptchaErrorCode("INVALID_PACKAGE_NAME", 4, 4, "Package name not allowed");
    public static final RecaptchaErrorCode INVALID_ACTION = new RecaptchaErrorCode("INVALID_ACTION", 5, 5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information");
    public static final RecaptchaErrorCode INVALID_TIMEOUT = new RecaptchaErrorCode("INVALID_TIMEOUT", 6, 6, "Invalid timeout, minimum value is 5_000L milliseconds");
    public static final RecaptchaErrorCode NO_NETWORK_FOUND = new RecaptchaErrorCode("NO_NETWORK_FOUND", 7, 7, "No network found on device");
    public static final RecaptchaErrorCode INTERNAL_ERROR = new RecaptchaErrorCode("INTERNAL_ERROR", 8, 100, "Internal Error");

    private static final /* synthetic */ RecaptchaErrorCode[] $values() {
        return new RecaptchaErrorCode[]{UNKNOWN_ERROR, NETWORK_ERROR, INVALID_SITEKEY, INVALID_KEYTYPE, INVALID_PACKAGE_NAME, INVALID_ACTION, INVALID_TIMEOUT, NO_NETWORK_FOUND, INTERNAL_ERROR};
    }

    static {
        RecaptchaErrorCode[] recaptchaErrorCodeArr$values = $values();
        $VALUES = recaptchaErrorCodeArr$values;
        $ENTRIES = f.y(recaptchaErrorCodeArr$values);
    }

    private RecaptchaErrorCode(String str, int i, int i5, String str2) {
        this.errorCode = i5;
        this.errorMessage = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static RecaptchaErrorCode valueOf(String str) {
        return (RecaptchaErrorCode) Enum.valueOf(RecaptchaErrorCode.class, str);
    }

    public static RecaptchaErrorCode[] values() {
        return (RecaptchaErrorCode[]) $VALUES.clone();
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
