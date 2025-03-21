package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzrg implements zzpr {
    public static final zzpx zza = zzrf.zza;
    private zzpu zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzre zzp;
    private zzrk zzq;
    private final zzahd zzb = new zzahd(4);
    private final zzahd zzc = new zzahd(9);
    private final zzahd zzd = new zzahd(11);
    private final zzahd zze = new zzahd();
    private final zzrh zzf = new zzrh();
    private int zzh = 1;

    private final zzahd zza(zzps zzpsVar) throws IOException {
        if (this.zzm > this.zze.zzj()) {
            zzahd zzahdVar = this.zze;
            int zzj = zzahdVar.zzj();
            zzahdVar.zzb(new byte[Math.max(zzj + zzj, this.zzm)], 0);
        } else {
            this.zze.zzh(0);
        }
        this.zze.zzf(this.zzm);
        ((zzpo) zzpsVar).zzb(this.zze.zzi(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzb() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzbk(new zzql(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzh(this.zzb.zzi(), 0, 3, false);
        this.zzb.zzh(0);
        if (this.zzb.zzr() != 4607062) {
            return false;
        }
        zzpoVar.zzh(this.zzb.zzi(), 0, 2, false);
        this.zzb.zzh(0);
        if ((this.zzb.zzo() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzpoVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        int zzv = this.zzb.zzv();
        zzpsVar.zzl();
        zzpoVar.zzj(zzv, false);
        zzpoVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        return this.zzb.zzv() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzg = zzpuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r17, com.google.android.gms.internal.ads.zzqj r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }
}
