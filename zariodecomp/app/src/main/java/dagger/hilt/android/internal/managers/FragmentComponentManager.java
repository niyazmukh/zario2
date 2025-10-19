package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0569v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\FragmentComponentManager.smali */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final AbstractComponentCallbacksC0567t fragment;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\FragmentComponentManager$FragmentComponentBuilderEntryPoint.smali */
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder fragmentComponentBuilder();
    }

    public FragmentComponentManager(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.fragment = abstractComponentCallbacksC0567t;
    }

    private Object createComponent() {
        C0569v c0569v = this.fragment.f7546x;
        Preconditions.checkNotNull(c0569v == null ? null : c0569v.f7555e, "Hilt Fragments must be attached before creating the component.");
        C0569v c0569v2 = this.fragment.f7546x;
        Preconditions.checkState((c0569v2 == null ? null : c0569v2.f7555e) instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (c0569v2 == null ? null : c0569v2.f7555e).getClass());
        validate(this.fragment);
        C0569v c0569v3 = this.fragment.f7546x;
        return ((FragmentComponentBuilderEntryPoint) EntryPoints.get(c0569v3 != null ? c0569v3.f7555e : null, FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.fragment).build();
    }

    public static ContextWrapper createContextWrapper(Context context, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        return new ViewComponentManager.FragmentContextWrapper(context, abstractComponentCallbacksC0567t);
    }

    public static final Context findActivity(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void initializeArguments(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        Preconditions.checkNotNull(abstractComponentCallbacksC0567t);
        if (abstractComponentCallbacksC0567t.f7532f == null) {
            abstractComponentCallbacksC0567t.W(new Bundle());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } finally {
                }
            }
        }
        return this.component;
    }

    public void validate(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
    }

    public static ContextWrapper createContextWrapper(LayoutInflater layoutInflater, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, abstractComponentCallbacksC0567t);
    }
}
