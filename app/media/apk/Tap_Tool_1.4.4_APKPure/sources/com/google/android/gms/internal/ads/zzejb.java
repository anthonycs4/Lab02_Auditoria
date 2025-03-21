package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejb implements zzgdq<zzeiz> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<zzdsf> zzb;

    public zzejb(zzgeb<zzflb> zzgebVar, zzgeb<zzdsf> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    public static zzeiz zza(zzflb zzflbVar, zzdsf zzdsfVar) {
        return new zzeiz(zzflbVar, zzdsfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeiz(this.zza.zzb(), this.zzb.zzb());
    }
}
