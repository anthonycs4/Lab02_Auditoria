package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfoa extends zzfmd<zzfug, zzfud> {
    final /* synthetic */ zzfob zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoa(zzfob zzfobVar, Class cls) {
        super(cls);
        this.zza = zzfobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfug zzfugVar) throws GeneralSecurityException {
        zzfug zzfugVar2 = zzfugVar;
        if (zzfugVar2.zza().isEmpty() || !zzfugVar2.zzc()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfug zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfug.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfud zzd(zzfug zzfugVar) throws GeneralSecurityException {
        zzfuc zze = zzfud.zze();
        zze.zzb(zzfugVar);
        zze.zza(0);
        return zze.zzah();
    }
}
