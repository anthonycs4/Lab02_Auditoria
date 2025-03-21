package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgk extends com.google.android.gms.ads.internal.util.zzb {
    final zzceu zza;
    final zzcgs zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgk(zzceu zzceuVar, zzcgs zzcgsVar, String str, String[] strArr) {
        this.zza = zzceuVar;
        this.zzb = zzcgsVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzs.zzy().zza(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzb(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzr.zza.post(new zzcgj(this));
        }
    }
}
