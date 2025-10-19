package com.google.android.recaptcha.internal;

import B.a;
import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkn.smali */
public abstract class zzkn<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoh {
    public static void zzd(Iterable iterable, List list) {
        byte[] bArr = zznl.zzb;
        iterable.getClass();
        if (iterable instanceof zznu) {
            List listZza = ((zznu) iterable).zza();
            zznu zznuVar = (zznu) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String strI = a.i("Element at index ", zznuVar.size() - size, " is null.");
                    int size2 = zznuVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strI);
                        }
                        zznuVar.remove(size2);
                    }
                } else if (obj instanceof zzle) {
                    zznuVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzle.zzk(bArr2, 0, bArr2.length);
                    zznuVar.zzb();
                } else {
                    zznuVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzor) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof zzot) {
                ((zzot) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zze(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                zze(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void zze(List list, int i) {
        String strI = a.i("Element at index ", list.size() - i, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strI);
            }
            list.remove(size);
        }
    }

    @Override // 
    public abstract zzkn zza();

    public abstract zzkn zzb(zzko zzkoVar);

    @Override // com.google.android.recaptcha.internal.zzoh
    public final /* bridge */ /* synthetic */ zzoh zzc(zzoi zzoiVar) {
        if (zzm().getClass().isInstance(zzoiVar)) {
            return zzb((zzko) zzoiVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
