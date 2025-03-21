package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfnk extends zzfmd<zzfqp, zzfqm> {
    final /* synthetic */ zzfnl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnk(zzfnl zzfnlVar, Class cls) {
        super(cls);
        this.zza = zzfnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfqp zzfqpVar) throws GeneralSecurityException {
        zzfqp zzfqpVar2 = zzfqpVar;
        zzfwh.zza(zzfqpVar2.zzc());
        if (zzfqpVar2.zza().zza() != 12 && zzfqpVar2.zza().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfqp zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfqp.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfqm zzd(zzfqp zzfqpVar) throws GeneralSecurityException {
        zzfqp zzfqpVar2 = zzfqpVar;
        zzfql zzf = zzfqm.zzf();
        zzf.zzc(zzfxj.zzt(zzfwf.zza(zzfqpVar2.zzc())));
        zzf.zzb(zzfqpVar2.zza());
        zzf.zza(0);
        return zzf.zzah();
    }
}
