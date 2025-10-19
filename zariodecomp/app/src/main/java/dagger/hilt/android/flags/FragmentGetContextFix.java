package dagger.hilt.android.flags;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import javax.inject.Qualifier;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\flags\FragmentGetContextFix.smali */
public final class FragmentGetContextFix {

    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    @Qualifier
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\flags\FragmentGetContextFix$DisableFragmentGetContextFix.smali */
    public @interface DisableFragmentGetContextFix {
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\flags\FragmentGetContextFix$FragmentGetContextFixEntryPoint.smali */
    public interface FragmentGetContextFixEntryPoint {
        @DisableFragmentGetContextFix
        Set<Boolean> getDisableFragmentGetContextFix();
    }

    @InstallIn({SingletonComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\flags\FragmentGetContextFix$FragmentGetContextFixModule.smali */
    public static abstract class FragmentGetContextFixModule {
        @DisableFragmentGetContextFix
        public abstract Set<Boolean> disableFragmentGetContextFix();
    }

    private FragmentGetContextFix() {
    }

    public static boolean isFragmentGetContextFixDisabled(Context context) {
        Set<Boolean> disableFragmentGetContextFix = ((FragmentGetContextFixEntryPoint) EntryPointAccessors.fromApplication(context, FragmentGetContextFixEntryPoint.class)).getDisableFragmentGetContextFix();
        Preconditions.checkState(disableFragmentGetContextFix.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (disableFragmentGetContextFix.isEmpty()) {
            return true;
        }
        return disableFragmentGetContextFix.iterator().next().booleanValue();
    }
}
