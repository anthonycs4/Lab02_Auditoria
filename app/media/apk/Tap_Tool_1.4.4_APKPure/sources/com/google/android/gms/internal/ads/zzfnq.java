package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfnq extends zzfmd<zzfre, zzfrb> {
    final /* synthetic */ zzfnr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnq(zzfnr zzfnrVar, Class cls) {
        super(cls);
        this.zza = zzfnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfre zzfreVar) throws GeneralSecurityException {
        zzfwh.zza(zzfreVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfre zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfre.zzc(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfrb zzd(zzfre zzfreVar) throws GeneralSecurityException {
        zzfra zze = zzfrb.zze();
        zze.zzb(zzfxj.zzt(zzfwf.zza(zzfreVar.zza())));
        zze.zza(0);
        return zze.zzah();
    }
}
