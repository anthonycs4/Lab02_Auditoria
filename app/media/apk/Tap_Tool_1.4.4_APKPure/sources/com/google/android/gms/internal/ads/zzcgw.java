package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgw extends zzcgs {
    public zzcgw(zzceu zzceuVar) {
        super(zzceuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final boolean zza(String str) {
        String zzd = zzccg.zzd(str);
        zzceu zzceuVar = this.zzc.get();
        if (zzceuVar != null && zzd != null) {
            zzceuVar.zzu(zzd, this);
        }
        com.google.android.gms.ads.internal.util.zze.zzi("VideoStreamNoopCache is doing nothing.");
        zzn(str, zzd, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzg() {
    }
}
