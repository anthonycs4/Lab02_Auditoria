package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzflo extends zzfkz {
    final /* synthetic */ zzflp zza;
    private final Callable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflo(zzflp zzflpVar, Callable callable) {
        this.zza = zzflpVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final void zzf(Object obj, Throwable th) {
        if (th == null) {
            this.zza.zzh(obj);
        } else {
            this.zza.zzi(th);
        }
    }
}
