package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzx {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcaw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzx(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcaw zzcawVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcawVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzak)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzD() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzal)).booleanValue()) {
            this.zzb.zzC(-1);
            this.zzb.zzE(j);
        } else {
            this.zzb.zzC(i);
            this.zzb.zzE(j);
        }
        zzb();
    }

    public final void zzb() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzal)).booleanValue()) {
            this.zzc.zza();
        }
    }
}
