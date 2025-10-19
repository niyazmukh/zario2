package g;

import A2.C0009i;
import B3.Q1;
import a.AbstractC0183a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\u.smali */
public final class u extends v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7227c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f7228d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, C0009i c0009i) {
        super(yVar);
        this.f7228d = yVar;
        this.f7229e = c0009i;
    }

    @Override // g.v
    public final IntentFilter e() {
        switch (this.f7227c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // g.v
    public final int f() {
        Location location;
        boolean z4;
        long j5;
        switch (this.f7227c) {
            case 0:
                return ((PowerManager) this.f7229e).isPowerSaveMode() ? 2 : 1;
            default:
                C0009i c0009i = (C0009i) this.f7229e;
                Q1 q12 = (Q1) c0009i.f206d;
                if (q12.f522c > System.currentTimeMillis()) {
                    z4 = q12.f521b;
                } else {
                    Context context = (Context) c0009i.f204b;
                    int iR = AbstractC0183a.r(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) c0009i.f205c;
                    if (iR == 0) {
                        try {
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0183a.r(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (E.f7120d == null) {
                            E.f7120d = new E();
                        }
                        E e7 = E.f7120d;
                        e7.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        e7.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z4 = e7.f7123c == 1;
                        long j6 = e7.f7122b;
                        long j7 = e7.f7121a;
                        e7.a(location.getLatitude(), location.getLongitude(), 86400000 + jCurrentTimeMillis);
                        long j8 = e7.f7122b;
                        if (j6 == -1 || j7 == -1) {
                            j5 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j7) {
                                j8 = jCurrentTimeMillis > j6 ? j7 : j6;
                            }
                            j5 = j8 + 60000;
                        }
                        q12.f521b = z4;
                        q12.f522c = j5;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // g.v
    public final void i() throws PackageManager.NameNotFoundException {
        switch (this.f7227c) {
            case 0:
                this.f7228d.l(true, true);
                break;
            default:
                this.f7228d.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context) {
        super(yVar);
        this.f7228d = yVar;
        this.f7229e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
