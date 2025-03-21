package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzdto;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzgdw;
import com.google.android.gms.internal.ads.zzgeb;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzae implements zzgdq<zzad> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzdtn> zzb;

    public zzae(zzgeb<Executor> zzgebVar, zzgeb<zzdtn> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzad zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzad(zzflbVar, ((zzdto) this.zzb).zzb());
    }
}
