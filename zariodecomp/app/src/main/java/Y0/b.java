package Y0;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y0\b.smali */
public abstract class b extends zzb implements c {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i == 1) {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zzc(zZzf);
        }
        return true;
    }
}
