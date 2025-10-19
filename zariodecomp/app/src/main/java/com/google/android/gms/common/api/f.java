package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\f.smali */
public abstract class f {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    public List<Scope> getImpliedScopes(Object obj) {
        return Collections.emptyList();
    }

    public int getPriority() {
        return API_PRIORITY_OTHER;
    }
}
