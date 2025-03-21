package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexw implements zzgdq<zzexv> {
    private final zzgeb<zzeyb> zza;
    private final zzgeb<zzeyi> zzb;
    private final zzgeb<ScheduledExecutorService> zzc;

    public zzexw(zzgeb<zzeyb> zzgebVar, zzgeb<zzeyi> zzgebVar2, zzgeb<ScheduledExecutorService> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgdk zzc = zzgdp.zzc(this.zza);
        zzgdk zzc2 = zzgdp.zzc(this.zzb);
        ScheduledExecutorService zzb = this.zzc.zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfO)).booleanValue()) {
            obj = new zzexy((zzexv) zzc.zzb(), zzb);
        } else {
            obj = (zzexv) zzc2.zzb();
        }
        zzgdw.zzb(obj);
        return obj;
    }
}
