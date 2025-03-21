package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfoi extends zzfmd<zzfrk, zzfrh> {
    final /* synthetic */ zzfoj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoi(zzfoj zzfojVar, Class cls) {
        super(cls);
        this.zza = zzfojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfrk zzfrkVar) throws GeneralSecurityException {
        zzfrk zzfrkVar2 = zzfrkVar;
        if (zzfrkVar2.zza() == 64) {
            return;
        }
        int zza = zzfrkVar2.zza();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(zza);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfrk zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfrk.zzc(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfrh zzd(zzfrk zzfrkVar) throws GeneralSecurityException {
        zzfrg zze = zzfrh.zze();
        zze.zzb(zzfxj.zzt(zzfwf.zza(zzfrkVar.zza())));
        zze.zza(0);
        return zze.zzah();
    }
}
