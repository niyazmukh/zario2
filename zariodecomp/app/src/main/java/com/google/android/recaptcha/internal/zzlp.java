package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzlp.smali */
final class zzlp implements zznh {
    static final zznh zza = new zzlp();

    private zzlp() {
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final boolean zza(int i) {
        zzlq zzlqVar;
        zzlq zzlqVar2 = zzlq.EDITION_UNKNOWN;
        if (i == 0) {
            zzlqVar = zzlq.EDITION_UNKNOWN;
        } else if (i == 1) {
            zzlqVar = zzlq.EDITION_1_TEST_ONLY;
        } else if (i == 2) {
            zzlqVar = zzlq.EDITION_2_TEST_ONLY;
        } else if (i == 900) {
            zzlqVar = zzlq.EDITION_LEGACY;
        } else if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 998:
                    zzlqVar = zzlq.EDITION_PROTO2;
                    break;
                case 999:
                    zzlqVar = zzlq.EDITION_PROTO3;
                    break;
                case 1000:
                    zzlqVar = zzlq.EDITION_2023;
                    break;
                case 1001:
                    zzlqVar = zzlq.EDITION_2024;
                    break;
                default:
                    switch (i) {
                        case 99997:
                            zzlqVar = zzlq.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzlqVar = zzlq.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzlqVar = zzlq.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzlqVar = null;
                            break;
                    }
            }
        } else {
            zzlqVar = zzlq.EDITION_MAX;
        }
        return zzlqVar != null;
    }
}
