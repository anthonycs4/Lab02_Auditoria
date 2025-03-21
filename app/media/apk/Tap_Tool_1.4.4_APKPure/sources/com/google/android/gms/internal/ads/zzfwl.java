package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.2.0 */
/* loaded from: classes.dex */
final class zzfwl extends WeakReference<Throwable> {
    private final int zza;

    public zzfwl(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.zza = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzfwl zzfwlVar = (zzfwl) obj;
            if (this.zza == zzfwlVar.zza && get() == zzfwlVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }
}
