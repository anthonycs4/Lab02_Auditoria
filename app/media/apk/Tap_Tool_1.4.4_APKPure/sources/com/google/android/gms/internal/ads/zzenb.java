package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzenb implements zzgdq<zzemz> {
    private final zzgeb<zzbvq> zza;
    private final zzgeb<ScheduledExecutorService> zzb;
    private final zzgeb<Context> zzc;

    public zzenb(zzgeb<zzbvq> zzgebVar, zzgeb<ScheduledExecutorService> zzgebVar2, zzgeb<Context> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemz(new zzbvq(), this.zzb.zzb(), ((zzcke) this.zzc).zza(), null);
    }
}
