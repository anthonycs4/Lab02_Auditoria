package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzcvn;
import com.google.android.gms.internal.ads.zzcvo;
import com.google.android.gms.internal.ads.zzexf;
import com.google.android.gms.internal.ads.zzexl;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzgeb;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzab implements zzgdq<zzfla<zzaf>> {
    private final zzgeb<zzexl> zza;
    private final zzgeb<zzad> zzb;
    private final zzgeb<zzcvn> zzc;

    public zzab(zzgeb<zzexl> zzgebVar, zzgeb<zzad> zzgebVar2, zzgeb<zzcvn> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzb().zza(zzexf.GENERATE_SIGNALS, ((zzcvo) this.zzc).zzb().zzb()).zzc(((zzae) this.zzb).zzb()).zzh(((Integer) zzbba.zzc().zzb(zzbfq.zzdJ)).intValue(), TimeUnit.SECONDS).zzi();
    }
}
