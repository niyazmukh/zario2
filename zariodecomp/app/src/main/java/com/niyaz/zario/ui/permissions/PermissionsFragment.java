package com.niyaz.zario.ui.permissions;

import A2.C0004d;
import S0.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.i0;
import com.niyaz.zario.databinding.FragmentPermissionsBinding;
import com.niyaz.zario.ui.permissions.PermissionsFragment;
import d3.C0445a;
import d3.C0446b;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import e.C0447a;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0562n;
import g0.C0565q;
import g1.i;
import java.util.concurrent.atomic.AtomicReference;
import n3.b;
import u0.AbstractC0953A;
import u0.o;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\permissions\PermissionsFragment.smali */
public final class PermissionsFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6722a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6723b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6724c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6725d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6726e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentPermissionsBinding f6727f0;

    /* renamed from: g0, reason: collision with root package name */
    public C0446b f6728g0;

    /* renamed from: h0, reason: collision with root package name */
    public final C0562n f6729h0;

    public PermissionsFragment() {
        C0447a c0447a = new C0447a(1);
        C0004d c0004d = new C0004d(this, 14);
        i iVar = new i(this, 17);
        if (this.f7527a > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        C0565q c0565q = new C0565q(this, iVar, atomicReference, c0447a, c0004d);
        if (this.f7527a >= 0) {
            c0565q.a();
        } else {
            this.X.add(c0565q);
        }
        this.f6729h0 = new C0562n(atomicReference);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6722a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6726e0) {
            return;
        }
        this.f6726e0 = true;
        ((b) generatedComponent()).injectPermissionsFragment((PermissionsFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6726e0) {
            return;
        }
        this.f6726e0 = true;
        ((b) generatedComponent()).injectPermissionsFragment((PermissionsFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        this.f6727f0 = FragmentPermissionsBinding.inflate(inflater, viewGroup, false);
        Log.d("PermissionsFragment", "PermissionsFragment onCreateView");
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        ScrollView root = fragmentPermissionsBinding.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        Log.d("PermissionsFragment", "PermissionsFragment onDestroyView");
        this.f6727f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void K() {
        this.f7510H = true;
        Log.d("PermissionsFragment", "PermissionsFragment onResume");
        e0();
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        Log.d("PermissionsFragment", "PermissionsFragment onViewCreated");
        Log.d("PermissionsFragment", "Setting up click listeners");
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        final int i = 0;
        fragmentPermissionsBinding.cardNotificationPermission.setOnClickListener(new View.OnClickListener(this) { // from class: n3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsFragment f8972b;

            {
                this.f8972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        Log.d("PermissionsFragment", "Notification permission card clicked");
                        PermissionsFragment permissionsFragment = this.f8972b;
                        permissionsFragment.getClass();
                        Log.d("PermissionsFragment", "requestNotificationPermission called");
                        int i5 = Build.VERSION.SDK_INT;
                        Log.d("PermissionsFragment", "Android version: " + i5 + ", TIRAMISU: 33");
                        if (i5 < 33) {
                            Log.d("PermissionsFragment", "Android version < 13, notifications enabled by default");
                            permissionsFragment.Z().b();
                            permissionsFragment.d0(true);
                            break;
                        } else {
                            C0445a c0445aB = permissionsFragment.Z().b();
                            StringBuilder sb = new StringBuilder("Current notification permission status: ");
                            boolean z4 = c0445aB.f6799b;
                            sb.append(z4);
                            Log.d("PermissionsFragment", sb.toString());
                            if (z4) {
                                Log.d("PermissionsFragment", "Notification permission already granted");
                                permissionsFragment.d0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Launching notification permission request");
                                try {
                                    permissionsFragment.f6729h0.a("android.permission.POST_NOTIFICATIONS");
                                    break;
                                } catch (Exception e5) {
                                    Log.e("PermissionsFragment", "Error launching notification permission request", e5);
                                    return;
                                }
                            }
                        }
                    case 1:
                        Log.d("PermissionsFragment", "Usage permission card clicked");
                        PermissionsFragment permissionsFragment2 = this.f8972b;
                        permissionsFragment2.getClass();
                        Log.d("PermissionsFragment", "requestUsageStatsPermission called");
                        if (permissionsFragment2.Z().b().f6798a) {
                            Log.d("PermissionsFragment", "Usage stats permission already granted");
                            permissionsFragment2.f0(true);
                            break;
                        } else {
                            try {
                                Log.d("PermissionsFragment", "Opening usage access settings");
                                permissionsFragment2.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                                break;
                            } catch (Exception e6) {
                                Log.e("PermissionsFragment", "Error opening usage access settings", e6);
                                return;
                            }
                        }
                    case 2:
                        Log.d("PermissionsFragment", "Battery optimization card clicked");
                        PermissionsFragment permissionsFragment3 = this.f8972b;
                        permissionsFragment3.getClass();
                        Log.d("PermissionsFragment", "requestBatteryOptimization called");
                        AbstractActivityC0570w abstractActivityC0570wL = permissionsFragment3.l();
                        if (abstractActivityC0570wL != null) {
                            if (o.d(abstractActivityC0570wL)) {
                                Log.d("PermissionsFragment", "Battery optimization already disabled");
                                permissionsFragment3.b0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Opening battery optimization settings directly");
                                try {
                                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    intent.setData(Uri.parse("package:" + abstractActivityC0570wL.getPackageName()));
                                    abstractActivityC0570wL.startActivity(intent);
                                    Log.i("BatteryOptimization", "Opened battery optimization settings");
                                    break;
                                } catch (Exception e7) {
                                    Log.e("BatteryOptimization", "Failed to open battery optimization settings", e7);
                                    try {
                                        abstractActivityC0570wL.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                                        Log.i("BatteryOptimization", "Opened general battery optimization list as fallback");
                                        return;
                                    } catch (Exception e8) {
                                        Log.e("BatteryOptimization", "Failed to open fallback battery optimization settings", e8);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        Log.d("PermissionsFragment", "Continue button clicked");
                        AbstractC0953A.b(f.z(this.f8972b), 2131230799);
                        break;
                }
            }
        });
        FragmentPermissionsBinding fragmentPermissionsBinding2 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding2);
        final int i5 = 1;
        fragmentPermissionsBinding2.cardUsagePermission.setOnClickListener(new View.OnClickListener(this) { // from class: n3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsFragment f8972b;

            {
                this.f8972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        Log.d("PermissionsFragment", "Notification permission card clicked");
                        PermissionsFragment permissionsFragment = this.f8972b;
                        permissionsFragment.getClass();
                        Log.d("PermissionsFragment", "requestNotificationPermission called");
                        int i52 = Build.VERSION.SDK_INT;
                        Log.d("PermissionsFragment", "Android version: " + i52 + ", TIRAMISU: 33");
                        if (i52 < 33) {
                            Log.d("PermissionsFragment", "Android version < 13, notifications enabled by default");
                            permissionsFragment.Z().b();
                            permissionsFragment.d0(true);
                            break;
                        } else {
                            C0445a c0445aB = permissionsFragment.Z().b();
                            StringBuilder sb = new StringBuilder("Current notification permission status: ");
                            boolean z4 = c0445aB.f6799b;
                            sb.append(z4);
                            Log.d("PermissionsFragment", sb.toString());
                            if (z4) {
                                Log.d("PermissionsFragment", "Notification permission already granted");
                                permissionsFragment.d0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Launching notification permission request");
                                try {
                                    permissionsFragment.f6729h0.a("android.permission.POST_NOTIFICATIONS");
                                    break;
                                } catch (Exception e5) {
                                    Log.e("PermissionsFragment", "Error launching notification permission request", e5);
                                    return;
                                }
                            }
                        }
                    case 1:
                        Log.d("PermissionsFragment", "Usage permission card clicked");
                        PermissionsFragment permissionsFragment2 = this.f8972b;
                        permissionsFragment2.getClass();
                        Log.d("PermissionsFragment", "requestUsageStatsPermission called");
                        if (permissionsFragment2.Z().b().f6798a) {
                            Log.d("PermissionsFragment", "Usage stats permission already granted");
                            permissionsFragment2.f0(true);
                            break;
                        } else {
                            try {
                                Log.d("PermissionsFragment", "Opening usage access settings");
                                permissionsFragment2.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                                break;
                            } catch (Exception e6) {
                                Log.e("PermissionsFragment", "Error opening usage access settings", e6);
                                return;
                            }
                        }
                    case 2:
                        Log.d("PermissionsFragment", "Battery optimization card clicked");
                        PermissionsFragment permissionsFragment3 = this.f8972b;
                        permissionsFragment3.getClass();
                        Log.d("PermissionsFragment", "requestBatteryOptimization called");
                        AbstractActivityC0570w abstractActivityC0570wL = permissionsFragment3.l();
                        if (abstractActivityC0570wL != null) {
                            if (o.d(abstractActivityC0570wL)) {
                                Log.d("PermissionsFragment", "Battery optimization already disabled");
                                permissionsFragment3.b0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Opening battery optimization settings directly");
                                try {
                                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    intent.setData(Uri.parse("package:" + abstractActivityC0570wL.getPackageName()));
                                    abstractActivityC0570wL.startActivity(intent);
                                    Log.i("BatteryOptimization", "Opened battery optimization settings");
                                    break;
                                } catch (Exception e7) {
                                    Log.e("BatteryOptimization", "Failed to open battery optimization settings", e7);
                                    try {
                                        abstractActivityC0570wL.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                                        Log.i("BatteryOptimization", "Opened general battery optimization list as fallback");
                                        return;
                                    } catch (Exception e8) {
                                        Log.e("BatteryOptimization", "Failed to open fallback battery optimization settings", e8);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        Log.d("PermissionsFragment", "Continue button clicked");
                        AbstractC0953A.b(f.z(this.f8972b), 2131230799);
                        break;
                }
            }
        });
        FragmentPermissionsBinding fragmentPermissionsBinding3 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding3);
        final int i6 = 2;
        fragmentPermissionsBinding3.cardBatteryPermission.setOnClickListener(new View.OnClickListener(this) { // from class: n3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsFragment f8972b;

            {
                this.f8972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        Log.d("PermissionsFragment", "Notification permission card clicked");
                        PermissionsFragment permissionsFragment = this.f8972b;
                        permissionsFragment.getClass();
                        Log.d("PermissionsFragment", "requestNotificationPermission called");
                        int i52 = Build.VERSION.SDK_INT;
                        Log.d("PermissionsFragment", "Android version: " + i52 + ", TIRAMISU: 33");
                        if (i52 < 33) {
                            Log.d("PermissionsFragment", "Android version < 13, notifications enabled by default");
                            permissionsFragment.Z().b();
                            permissionsFragment.d0(true);
                            break;
                        } else {
                            C0445a c0445aB = permissionsFragment.Z().b();
                            StringBuilder sb = new StringBuilder("Current notification permission status: ");
                            boolean z4 = c0445aB.f6799b;
                            sb.append(z4);
                            Log.d("PermissionsFragment", sb.toString());
                            if (z4) {
                                Log.d("PermissionsFragment", "Notification permission already granted");
                                permissionsFragment.d0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Launching notification permission request");
                                try {
                                    permissionsFragment.f6729h0.a("android.permission.POST_NOTIFICATIONS");
                                    break;
                                } catch (Exception e5) {
                                    Log.e("PermissionsFragment", "Error launching notification permission request", e5);
                                    return;
                                }
                            }
                        }
                    case 1:
                        Log.d("PermissionsFragment", "Usage permission card clicked");
                        PermissionsFragment permissionsFragment2 = this.f8972b;
                        permissionsFragment2.getClass();
                        Log.d("PermissionsFragment", "requestUsageStatsPermission called");
                        if (permissionsFragment2.Z().b().f6798a) {
                            Log.d("PermissionsFragment", "Usage stats permission already granted");
                            permissionsFragment2.f0(true);
                            break;
                        } else {
                            try {
                                Log.d("PermissionsFragment", "Opening usage access settings");
                                permissionsFragment2.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                                break;
                            } catch (Exception e6) {
                                Log.e("PermissionsFragment", "Error opening usage access settings", e6);
                                return;
                            }
                        }
                    case 2:
                        Log.d("PermissionsFragment", "Battery optimization card clicked");
                        PermissionsFragment permissionsFragment3 = this.f8972b;
                        permissionsFragment3.getClass();
                        Log.d("PermissionsFragment", "requestBatteryOptimization called");
                        AbstractActivityC0570w abstractActivityC0570wL = permissionsFragment3.l();
                        if (abstractActivityC0570wL != null) {
                            if (o.d(abstractActivityC0570wL)) {
                                Log.d("PermissionsFragment", "Battery optimization already disabled");
                                permissionsFragment3.b0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Opening battery optimization settings directly");
                                try {
                                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    intent.setData(Uri.parse("package:" + abstractActivityC0570wL.getPackageName()));
                                    abstractActivityC0570wL.startActivity(intent);
                                    Log.i("BatteryOptimization", "Opened battery optimization settings");
                                    break;
                                } catch (Exception e7) {
                                    Log.e("BatteryOptimization", "Failed to open battery optimization settings", e7);
                                    try {
                                        abstractActivityC0570wL.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                                        Log.i("BatteryOptimization", "Opened general battery optimization list as fallback");
                                        return;
                                    } catch (Exception e8) {
                                        Log.e("BatteryOptimization", "Failed to open fallback battery optimization settings", e8);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        Log.d("PermissionsFragment", "Continue button clicked");
                        AbstractC0953A.b(f.z(this.f8972b), 2131230799);
                        break;
                }
            }
        });
        FragmentPermissionsBinding fragmentPermissionsBinding4 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding4);
        final int i7 = 3;
        fragmentPermissionsBinding4.btnContinue.setOnClickListener(new View.OnClickListener(this) { // from class: n3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionsFragment f8972b;

            {
                this.f8972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        Log.d("PermissionsFragment", "Notification permission card clicked");
                        PermissionsFragment permissionsFragment = this.f8972b;
                        permissionsFragment.getClass();
                        Log.d("PermissionsFragment", "requestNotificationPermission called");
                        int i52 = Build.VERSION.SDK_INT;
                        Log.d("PermissionsFragment", "Android version: " + i52 + ", TIRAMISU: 33");
                        if (i52 < 33) {
                            Log.d("PermissionsFragment", "Android version < 13, notifications enabled by default");
                            permissionsFragment.Z().b();
                            permissionsFragment.d0(true);
                            break;
                        } else {
                            C0445a c0445aB = permissionsFragment.Z().b();
                            StringBuilder sb = new StringBuilder("Current notification permission status: ");
                            boolean z4 = c0445aB.f6799b;
                            sb.append(z4);
                            Log.d("PermissionsFragment", sb.toString());
                            if (z4) {
                                Log.d("PermissionsFragment", "Notification permission already granted");
                                permissionsFragment.d0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Launching notification permission request");
                                try {
                                    permissionsFragment.f6729h0.a("android.permission.POST_NOTIFICATIONS");
                                    break;
                                } catch (Exception e5) {
                                    Log.e("PermissionsFragment", "Error launching notification permission request", e5);
                                    return;
                                }
                            }
                        }
                    case 1:
                        Log.d("PermissionsFragment", "Usage permission card clicked");
                        PermissionsFragment permissionsFragment2 = this.f8972b;
                        permissionsFragment2.getClass();
                        Log.d("PermissionsFragment", "requestUsageStatsPermission called");
                        if (permissionsFragment2.Z().b().f6798a) {
                            Log.d("PermissionsFragment", "Usage stats permission already granted");
                            permissionsFragment2.f0(true);
                            break;
                        } else {
                            try {
                                Log.d("PermissionsFragment", "Opening usage access settings");
                                permissionsFragment2.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                                break;
                            } catch (Exception e6) {
                                Log.e("PermissionsFragment", "Error opening usage access settings", e6);
                                return;
                            }
                        }
                    case 2:
                        Log.d("PermissionsFragment", "Battery optimization card clicked");
                        PermissionsFragment permissionsFragment3 = this.f8972b;
                        permissionsFragment3.getClass();
                        Log.d("PermissionsFragment", "requestBatteryOptimization called");
                        AbstractActivityC0570w abstractActivityC0570wL = permissionsFragment3.l();
                        if (abstractActivityC0570wL != null) {
                            if (o.d(abstractActivityC0570wL)) {
                                Log.d("PermissionsFragment", "Battery optimization already disabled");
                                permissionsFragment3.b0(true);
                                break;
                            } else {
                                Log.d("PermissionsFragment", "Opening battery optimization settings directly");
                                try {
                                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    intent.setData(Uri.parse("package:" + abstractActivityC0570wL.getPackageName()));
                                    abstractActivityC0570wL.startActivity(intent);
                                    Log.i("BatteryOptimization", "Opened battery optimization settings");
                                    break;
                                } catch (Exception e7) {
                                    Log.e("BatteryOptimization", "Failed to open battery optimization settings", e7);
                                    try {
                                        abstractActivityC0570wL.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                                        Log.i("BatteryOptimization", "Opened general battery optimization list as fallback");
                                        return;
                                    } catch (Exception e8) {
                                        Log.e("BatteryOptimization", "Failed to open fallback battery optimization settings", e8);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        Log.d("PermissionsFragment", "Continue button clicked");
                        AbstractC0953A.b(f.z(this.f8972b), 2131230799);
                        break;
                }
            }
        });
        e0();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6724c0 == null) {
            synchronized (this.f6725d0) {
                try {
                    if (this.f6724c0 == null) {
                        this.f6724c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6724c0;
    }

    public final C0446b Z() {
        C0446b c0446b = this.f6728g0;
        if (c0446b != null) {
            return c0446b;
        }
        kotlin.jvm.internal.i.i("permissionsManager");
        throw null;
    }

    public final void a0() {
        if (this.f6722a0 == null) {
            this.f6722a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6723b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
        }
    }

    public final void b0(boolean z4) {
        Log.d("PermissionsFragment", "Updating battery optimization UI: disabled=" + z4);
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        fragmentPermissionsBinding.tvBatteryStatus.setText(z4 ? r(2131886460) : r(2131886283));
        FragmentPermissionsBinding fragmentPermissionsBinding2 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding2);
        fragmentPermissionsBinding2.cardBatteryPermission.setEnabled(!z4);
    }

    public final void c0(C0445a c0445a) {
        boolean z4 = c0445a.f6799b;
        AbstractActivityC0570w abstractActivityC0570wL = l();
        boolean z5 = false;
        boolean zD = abstractActivityC0570wL != null ? o.d(abstractActivityC0570wL) : false;
        boolean z6 = c0445a.f6798a;
        if (z4 && z6 && zD) {
            z5 = true;
        }
        Log.d("PermissionsFragment", "Continue button state: notification=" + z4 + ", usage=" + z6 + ", battery=" + zD + ", all=" + z5);
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        fragmentPermissionsBinding.btnContinue.setEnabled(z5);
        FragmentPermissionsBinding fragmentPermissionsBinding2 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding2);
        fragmentPermissionsBinding2.btnContinue.setText(z5 ? r(2131886191) : r(2131886192));
    }

    public final void d0(boolean z4) {
        Log.d("PermissionsFragment", "Updating notification permission UI: granted=" + z4);
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        fragmentPermissionsBinding.tvNotificationStatus.setText(z4 ? r(2131886460) : r(2131886283));
        FragmentPermissionsBinding fragmentPermissionsBinding2 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding2);
        fragmentPermissionsBinding2.cardNotificationPermission.setEnabled(!z4);
    }

    public final void e0() {
        Log.d("PermissionsFragment", "Updating permission states");
        C0445a c0445aB = Z().b();
        d0(c0445aB.f6799b);
        f0(c0445aB.f6798a);
        AbstractActivityC0570w abstractActivityC0570wL = l();
        if (abstractActivityC0570wL != null) {
            b0(o.d(abstractActivityC0570wL));
        }
        c0(c0445aB);
    }

    public final void f0(boolean z4) {
        Log.d("PermissionsFragment", "Updating usage stats permission UI: granted=" + z4);
        FragmentPermissionsBinding fragmentPermissionsBinding = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding);
        fragmentPermissionsBinding.tvUsageStatus.setText(z4 ? r(2131886460) : r(2131886283));
        FragmentPermissionsBinding fragmentPermissionsBinding2 = this.f6727f0;
        kotlin.jvm.internal.i.b(fragmentPermissionsBinding2);
        fragmentPermissionsBinding2.cardUsagePermission.setEnabled(!z4);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // g0.AbstractComponentCallbacksC0567t, androidx.lifecycle.InterfaceC0232j
    public final i0 h() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.h());
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final Context n() {
        if (super.n() == null && !this.f6723b0) {
            return null;
        }
        a0();
        return this.f6722a0;
    }
}
