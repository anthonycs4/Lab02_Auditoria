package com.google.android.gms.internal.ads;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfln extends zzfkz<zzfla> {
    final /* synthetic */ zzflp zza;
    private final zzfjy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfln(zzflp zzflpVar, zzfjy zzfjyVar) {
        this.zza = zzflpVar;
        Objects.requireNonNull(zzfjyVar);
        this.zzb = zzfjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final /* bridge */ /* synthetic */ zzfla zza() throws Exception {
        zzfla zza = this.zzb.zza();
        zzfes.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
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
    final /* bridge */ /* synthetic */ void zzf(zzfla zzflaVar, Throwable th) {
        zzfla zzflaVar2 = zzflaVar;
        if (th == null) {
            this.zza.zzj(zzflaVar2);
        } else {
            this.zza.zzi(th);
        }
    }
}
