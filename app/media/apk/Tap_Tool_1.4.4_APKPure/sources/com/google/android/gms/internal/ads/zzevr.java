package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
import java.util.ArrayDeque;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevr<AdT extends zzcsn> {
    private final zzeuv zza;
    private final zzevp<AdT> zzb;
    private final zzeur zzc;
    private zzevx<AdT> zze;
    private int zzf = 1;
    private final ArrayDeque<zzevq> zzd = new ArrayDeque<>();

    public zzevr(zzeuv zzeuvVar, zzeur zzeurVar, zzevp<AdT> zzevpVar) {
        this.zza = zzeuvVar;
        this.zzc = zzeurVar;
        this.zzb = zzevpVar;
        zzeurVar.zza(new zzeuq(this) { // from class: com.google.android.gms.internal.ads.zzevm
            private final zzevr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzeuq
            public final void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzevx zzd(zzevr zzevrVar, zzevx zzevxVar) {
        zzevrVar.zze = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzew)).booleanValue() && !com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzevq pollFirst = this.zzd.pollFirst();
                if (pollFirst.zzb() != null && this.zza.zzc(pollFirst.zzb())) {
                    zzevx<AdT> zzevxVar = new zzevx<>(this.zza, this.zzb, pollFirst);
                    this.zze = zzevxVar;
                    zzevxVar.zza(new zzevn(this, pollFirst));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzevq zzevqVar) {
        this.zzd.add(zzevqVar);
    }

    public final synchronized zzfla<zzevo<AdT>> zzb(zzevq zzevqVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzevqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
