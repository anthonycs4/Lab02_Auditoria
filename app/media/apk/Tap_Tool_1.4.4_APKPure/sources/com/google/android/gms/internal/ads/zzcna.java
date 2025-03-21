package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcna implements zzgdq<zzccs> {
    private final zzgeb<zzbqr> zza;
    private final zzgeb<String> zzb;

    public zzcna(zzgeb<zzbqr> zzgebVar, zzgeb<String> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbqt zzbqtVar = new zzbqt();
        String zzb = this.zzb.zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgu)).booleanValue()) {
            return new zzbqs(zzbqtVar, zzb);
        }
        return new zzccs(zzb);
    }
}
