package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcri implements zzgdq<zzdcx<zzdak>> {
    private final zzcqv zza;
    private final zzgeb<zzcyt> zzb;

    public zzcri(zzcqv zzcqvVar, zzgeb<zzcyt> zzgebVar) {
        this.zza = zzcqvVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzcyt zza = ((zzcsi) this.zzb).zza();
        return new zzdcx(new zzdak(zza) { // from class: com.google.android.gms.internal.ads.zzcqu
            private final zzcyt zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdak
            public final void zza() {
                this.zza.zzc();
            }
        }, zzccz.zzf);
    }
}
