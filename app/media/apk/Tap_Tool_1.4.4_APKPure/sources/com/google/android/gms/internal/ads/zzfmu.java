package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfmu implements zzfmw {
    final /* synthetic */ zzfmr zza;
    final /* synthetic */ zzfmf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmu(zzfmr zzfmrVar, zzfmf zzfmfVar) {
        this.zza = zzfmrVar;
        this.zzb = zzfmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final <Q> zzfma<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzfmq(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final zzfma<?> zzb() {
        zzfmr zzfmrVar = this.zza;
        return new zzfmq(zzfmrVar, this.zzb, zzfmrVar.zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Set<Class<?>> zzd() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Class<?> zze() {
        return this.zzb.getClass();
    }
}
