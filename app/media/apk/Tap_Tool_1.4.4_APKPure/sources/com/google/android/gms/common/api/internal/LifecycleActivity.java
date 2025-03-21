package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public Activity asActivity() {
        return (Activity) this.zza;
    }

    public FragmentActivity asFragmentActivity() {
        return (FragmentActivity) this.zza;
    }

    public Object asObject() {
        return this.zza;
    }

    public boolean isChimera() {
        return false;
    }

    public boolean isSupport() {
        return this.zza instanceof FragmentActivity;
    }

    public final boolean zza() {
        return this.zza instanceof Activity;
    }

    public LifecycleActivity(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
