package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepy {
    public static <T> void zza(AtomicReference<T> atomicReference, zzepx<T> zzepxVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzepxVar.zza(t);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.zze.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
