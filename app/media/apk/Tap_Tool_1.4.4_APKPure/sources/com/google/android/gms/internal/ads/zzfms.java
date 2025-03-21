package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfms implements zzfmw {
    final /* synthetic */ zzfma zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfms(zzfma zzfmaVar) {
        this.zza = zzfmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final <Q> zzfma<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        if (this.zza.zze().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final zzfma<?> zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Set<Class<?>> zzd() {
        return Collections.singleton(this.zza.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final Class<?> zze() {
        return null;
    }
}
