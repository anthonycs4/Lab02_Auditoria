package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcrt implements zzgdq<Boolean> {
    private final zzgeb<zzetk> zza;

    public zzcrt(zzgeb<zzetk> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzcvy) this.zza).zza().zza() == null) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdK)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
