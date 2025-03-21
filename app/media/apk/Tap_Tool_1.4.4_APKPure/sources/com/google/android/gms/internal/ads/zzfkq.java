package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfkq<V> implements Runnable {
    final Future<V> zza;
    final zzfko<? super V> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkq(Future<V> future, zzfko<? super V> zzfkoVar) {
        this.zza = future;
        this.zzb = zzfkoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future<V> future = this.zza;
        if (!(future instanceof zzfls) || (zza = zzflt.zza((zzfls) future)) == null) {
            try {
                this.zzb.zzb(zzfks.zzq(this.zza));
                return;
            } catch (Error e) {
                e = e;
                this.zzb.zza(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.zzb.zza(e);
                return;
            } catch (ExecutionException e3) {
                this.zzb.zza(e3.getCause());
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzfem zza = zzfen.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
