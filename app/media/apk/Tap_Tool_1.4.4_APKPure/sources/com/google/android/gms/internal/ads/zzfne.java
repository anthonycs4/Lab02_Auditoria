package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfne extends zzfmd<zzfqa, zzfpx> {
    final /* synthetic */ zzfnf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfne(zzfnf zzfnfVar, Class cls) {
        super(cls);
        this.zza = zzfnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfqa zzfqaVar) throws GeneralSecurityException {
        zzfqa zzfqaVar2 = zzfqaVar;
        ((zzfnh) new zzfni().zzi()).zzb(zzfqaVar2.zza());
        new zzfpg().zzi().zzb(zzfqaVar2.zzc());
        zzfwh.zza(zzfqaVar2.zza().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfqa zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfqa.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfpx zzd(zzfqa zzfqaVar) throws GeneralSecurityException {
        zzfqa zzfqaVar2 = zzfqaVar;
        new zzfni();
        zzfqd zzf = zzfnh.zzf(zzfqaVar2.zza());
        zzfsr zzd = new zzfpg().zzi().zzd(zzfqaVar2.zzc());
        zzfpw zzf2 = zzfpx.zzf();
        zzf2.zzb(zzf);
        zzf2.zzc(zzd);
        zzf2.zza(0);
        return zzf2.zzah();
    }
}
