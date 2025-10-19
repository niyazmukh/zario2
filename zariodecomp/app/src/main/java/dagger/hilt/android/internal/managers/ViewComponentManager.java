package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.n;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import g0.AbstractComponentCallbacksC0567t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ViewComponentManager.smali */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ViewComponentManager$ViewComponentBuilderEntryPoint.smali */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ViewComponentManager$ViewWithFragmentComponentBuilderEntryPoint.smali */
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view, boolean z4) {
        this.view = view;
        this.hasFragmentBindings = z4;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        return this.hasFragmentBindings ? ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build() : ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).mo6build();
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z4) {
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z4);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z4) {
                return null;
            }
            Preconditions.checkState(!(r5 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), getParentContext(GeneratedComponentManager.class, z4).getClass().getName());
        } else {
            Object parentContext2 = getParentContext(GeneratedComponentManager.class, z4);
            if (parentContext2 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext2;
            }
            if (z4) {
                return null;
            }
        }
        throw new IllegalStateException(this.view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    private Context getParentContext(Class<?> cls, boolean z4) {
        Context contextUnwrap = unwrap(this.view.getContext(), cls);
        if (contextUnwrap != Contexts.getApplication(contextUnwrap.getApplicationContext())) {
            return contextUnwrap;
        }
        Preconditions.checkState(z4, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
        return null;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
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

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ViewComponentManager$FragmentContextWrapper.smali */
    public static final class FragmentContextWrapper extends ContextWrapper {
        private LayoutInflater baseInflater;
        private AbstractComponentCallbacksC0567t fragment;
        private final InterfaceC0239t fragmentLifecycleObserver;
        private LayoutInflater inflater;

        public FragmentContextWrapper(Context context, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
            super((Context) Preconditions.checkNotNull(context));
            InterfaceC0239t interfaceC0239t = new InterfaceC0239t() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.InterfaceC0239t
                public void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) {
                    if (nVar == n.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = interfaceC0239t;
            this.baseInflater = null;
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) Preconditions.checkNotNull(abstractComponentCallbacksC0567t);
            this.fragment = abstractComponentCallbacksC0567t2;
            abstractComponentCallbacksC0567t2.f7520R.a(interfaceC0239t);
        }

        public AbstractComponentCallbacksC0567t getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                if (this.baseInflater == null) {
                    this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.inflater = this.baseInflater.cloneInContext(this);
            }
            return this.inflater;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            InterfaceC0239t interfaceC0239t = new InterfaceC0239t() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.InterfaceC0239t
                public void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) {
                    if (nVar == n.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = interfaceC0239t;
            this.baseInflater = layoutInflater;
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) Preconditions.checkNotNull(abstractComponentCallbacksC0567t);
            this.fragment = abstractComponentCallbacksC0567t2;
            abstractComponentCallbacksC0567t2.f7520R.a(interfaceC0239t);
        }
    }
}
