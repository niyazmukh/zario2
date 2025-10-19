package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\z.1.smali */
public final class C0362z implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5647a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5648b;

    public /* synthetic */ C0362z(Object obj, Object obj2) {
        this.f5648b = obj;
        this.f5647a = obj2;
    }

    public void a(Status status, boolean z4) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f5647a)) {
            map = new HashMap((Map) this.f5647a);
        }
        synchronized (((Map) this.f5648b)) {
            map2 = new HashMap((Map) this.f5648b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((C0362z) this.f5648b).f5648b).remove((TaskCompletionSource) this.f5647a);
    }

    public C0362z() {
        this.f5647a = Collections.synchronizedMap(new WeakHashMap());
        this.f5648b = Collections.synchronizedMap(new WeakHashMap());
    }
}
