package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwq implements zzcxt, zzcwk {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzdwz zzd;

    public zzdwq(zzdwz zzdwzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzdwzVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && !this.zzc.zzB()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) zzbba.zzc().zzb(zzbfq.zzes)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            this.zzd.zza(z);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        zzb(true);
    }
}
