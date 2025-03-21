package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaon implements zzaqq {
    final /* synthetic */ zzaoq zza;
    private final Uri zzb;
    private final zzaqe zzc;
    private final zzaoo zzd;
    private final zzaqw zze;
    private final zzalz zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public final void zza(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final boolean zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final void zzd() throws IOException, InterruptedException {
        zzalt zzaltVar;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                long zza = this.zzc.zza(new zzaqg(this.zzb, null, j2, j2, -1L, null, 0));
                this.zzj = zza;
                if (zza != -1) {
                    j = j2;
                    zza += j;
                    this.zzj = zza;
                } else {
                    j = j2;
                }
                zzaltVar = new zzalt(this.zzc, j, zza);
                try {
                    zzalu zzb = this.zzd.zzb(zzaltVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    long j3 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zzc();
                            i2 = zzb.zzg(zzaltVar, this.zzf);
                            if (zzaltVar.zzh() > zzaoq.zzy(this.zza) + j3) {
                                j3 = zzaltVar.zzh();
                                this.zze.zzb();
                                zzaoq.zzA(this.zza).post(zzaoq.zzz(this.zza));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && zzaltVar != null) {
                                this.zzf.zza = zzaltVar.zzh();
                            }
                            zzarj.zzc(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzaltVar.zzh();
                        i = i2;
                    }
                    zzarj.zzc(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzaltVar = null;
            }
        }
    }

    public zzaon(zzaoq zzaoqVar, Uri uri, zzaqe zzaqeVar, zzaoo zzaooVar, zzaqw zzaqwVar) {
        this.zza = zzaoqVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzaqeVar);
        this.zzc = zzaqeVar;
        Objects.requireNonNull(zzaooVar);
        this.zzd = zzaooVar;
        this.zze = zzaqwVar;
        this.zzf = new zzalz();
        this.zzh = true;
        this.zzj = -1L;
    }
}
