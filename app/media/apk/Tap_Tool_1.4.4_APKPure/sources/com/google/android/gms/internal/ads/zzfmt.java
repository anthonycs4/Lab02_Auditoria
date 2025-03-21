package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfmt implements zzfmw {
    final /* synthetic */ zzfmf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmt(zzfmf zzfmfVar) {
        this.zza = zzfmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final <Q> zzfma<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzfmc(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final zzfma<?> zzb() {
        zzfmf zzfmfVar = this.zza;
        return new zzfmc(zzfmfVar, zzfmfVar.zzh());
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
        return null;
    }
}
