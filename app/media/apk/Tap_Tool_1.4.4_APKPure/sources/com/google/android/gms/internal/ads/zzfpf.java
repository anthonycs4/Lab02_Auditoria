package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfpf extends zzfmd<zzfsu, zzfsr> {
    final /* synthetic */ zzfpg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpf(zzfpg zzfpgVar, Class cls) {
        super(cls);
        this.zza = zzfpgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfsu zzfsuVar) throws GeneralSecurityException {
        zzfsu zzfsuVar2 = zzfsuVar;
        if (zzfsuVar2.zzc() >= 16) {
            zzfpg.zzl(zzfsuVar2.zza());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfsu zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfsu.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfsr zzd(zzfsu zzfsuVar) throws GeneralSecurityException {
        zzfsu zzfsuVar2 = zzfsuVar;
        zzfsq zzf = zzfsr.zzf();
        zzf.zza(0);
        zzf.zzb(zzfsuVar2.zza());
        zzf.zzc(zzfxj.zzt(zzfwf.zza(zzfsuVar2.zzc())));
        return zzf.zzah();
    }
}
