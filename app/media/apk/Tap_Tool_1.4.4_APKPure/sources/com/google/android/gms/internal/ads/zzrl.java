package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzrl implements zzpr {
    private zzpu zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzzj zzg;
    private zzps zzh;
    private zzro zzi;
    private zzti zzj;
    private final zzahd zza = new zzahd(6);
    private long zzf = -1;

    private final int zza(zzps zzpsVar) throws IOException {
        this.zza.zza(2);
        ((zzpo) zzpsVar).zzh(this.zza.zzi(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzb() {
        zzc(new zzxt[0]);
        zzpu zzpuVar = this.zzb;
        Objects.requireNonNull(zzpuVar);
        zzpuVar.zzbj();
        this.zzb.zzbk(new zzql(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        if (zza(zzpsVar) != 65496) {
            return false;
        }
        int zza = zza(zzpsVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zza(2);
            zzpo zzpoVar = (zzpo) zzpsVar;
            zzpoVar.zzh(this.zza.zzi(), 0, 2, false);
            zzpoVar.zzj(this.zza.zzo() - 2, false);
            zza = zza(zzpsVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzpo zzpoVar2 = (zzpo) zzpsVar;
            zzpoVar2.zzj(2, false);
            this.zza.zza(6);
            zzpoVar2.zzh(this.zza.zzi(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzb = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzti zztiVar = this.zzj;
            Objects.requireNonNull(zztiVar);
            zztiVar.zzg(j, j2);
        }
    }

    private final void zzc(zzxt... zzxtVarArr) {
        zzpu zzpuVar = this.zzb;
        Objects.requireNonNull(zzpuVar);
        zzqq zzbi = zzpuVar.zzbi(1024, 4);
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzi(new zzxu(zzxtVarArr));
        zzbi.zza(zzjpVar.zzD());
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r24, com.google.android.gms.internal.ads.zzqj r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrl.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }
}
