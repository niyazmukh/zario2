package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zzab.smali */
final class zzab implements Continuation {
    final /* synthetic */ Collection zza;

    public zzab(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return Tasks.forResult(arrayList);
    }
}
