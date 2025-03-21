package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfnh extends zzfmd<zzfqg, zzfqd> {
    final /* synthetic */ zzfni zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnh(zzfni zzfniVar, Class cls) {
        super(cls);
        this.zza = zzfniVar;
    }

    public static final zzfqd zzf(zzfqg zzfqgVar) throws GeneralSecurityException {
        zzfqc zzf = zzfqd.zzf();
        zzf.zzb(zzfqgVar.zza());
        zzf.zzc(zzfxj.zzt(zzfwf.zza(zzfqgVar.zzc())));
        zzf.zza(0);
        return zzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfqg zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfqg.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfqd zzd(zzfqg zzfqgVar) throws GeneralSecurityException {
        return zzf(zzfqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    /* renamed from: zze */
    public final void zzb(zzfqg zzfqgVar) throws GeneralSecurityException {
        zzfwh.zza(zzfqgVar.zzc());
        zzfni zzfniVar = this.zza;
        zzfni.zzl(zzfqgVar.zza());
    }
}
