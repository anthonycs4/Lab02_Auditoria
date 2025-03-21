package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeju implements zzgdq<zzejs> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<Set<String>> zzc;

    public zzeju(zzgeb<zzflb> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<Set<String>> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejs(this.zza.zzb(), ((zzeuo) this.zzb).zza(), this.zzc.zzb());
    }
}
