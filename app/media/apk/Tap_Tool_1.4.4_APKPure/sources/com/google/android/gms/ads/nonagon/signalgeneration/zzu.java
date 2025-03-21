package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcjz;
import com.google.android.gms.internal.ads.zzcke;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzeuc;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzgdw;
import com.google.android.gms.internal.ads.zzgeb;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzu implements zzgdq<zzt> {
    private final zzgeb<zzcjz> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzfb> zzc;
    private final zzgeb<zzeuc<zzdlt>> zzd;
    private final zzgeb<zzflb> zze;
    private final zzgeb<ScheduledExecutorService> zzf;

    public zzu(zzgeb<zzcjz> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzfb> zzgebVar3, zzgeb<zzeuc<zzdlt>> zzgebVar4, zzgeb<zzflb> zzgebVar5, zzgeb<ScheduledExecutorService> zzgebVar6) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzt(this.zza.zzb(), ((zzcke) this.zzb).zza(), this.zzc.zzb(), this.zzd.zzb(), zzflbVar, this.zzf.zzb());
    }
}
