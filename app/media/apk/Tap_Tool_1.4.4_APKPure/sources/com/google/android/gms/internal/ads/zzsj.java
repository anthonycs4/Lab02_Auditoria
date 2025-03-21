package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzsj implements zzpr {
    public static final zzpx zza = zzsh.zza;
    private static final zzys zzb = zzsi.zza;
    private final zzahd zzc;
    private final zznw zzd;
    private final zzqg zze;
    private final zzqh zzf;
    private final zzqq zzg;
    private zzpu zzh;
    private zzqq zzi;
    private zzqq zzj;
    private int zzk;
    private zzxu zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzsl zzq;
    private boolean zzr;

    public zzsj() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzb(com.google.android.gms.internal.ads.zzps r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsj.zzb(com.google.android.gms.internal.ads.zzps):int");
    }

    private final long zzc(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final boolean zzh(zzps zzpsVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza2;
        int i3 = true != z ? 131072 : 32768;
        zzpsVar.zzl();
        if (zzpsVar.zzn() == 0) {
            zzxu zza3 = this.zzf.zza(zzpsVar, null);
            this.zzl = zza3;
            if (zza3 != null) {
                this.zze.zza(zza3);
            }
            i2 = (int) zzpsVar.zzm();
            if (!z) {
                ((zzpo) zzpsVar).zze(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!zzi(zzpsVar)) {
                this.zzc.zzh(0);
                int zzv = this.zzc.zzv();
                if ((i == 0 || zzk(zzv, i)) && (zza2 = zznx.zza(zzv)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzv);
                        i = zzv;
                    }
                    ((zzpo) zzpsVar).zzj(zza2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw new zzkr("Searched too many bytes.");
                    }
                    if (!z) {
                        ((zzpo) zzpsVar).zze(1, false);
                    } else {
                        zzpsVar.zzl();
                        ((zzpo) zzpsVar).zzj(i2 + i6, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzpo) zzpsVar).zze(i2 + i5, false);
        } else {
            zzpsVar.zzl();
        }
        this.zzk = i;
        return true;
    }

    private final boolean zzi(zzps zzpsVar) throws IOException {
        zzsl zzslVar = this.zzq;
        if (zzslVar != null) {
            long zzf = zzslVar.zzf();
            if (zzf != -1 && zzpsVar.zzm() > zzf - 4) {
                return true;
            }
        }
        try {
            return !zzpsVar.zzh(this.zzc.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final zzsl zzj(zzps zzpsVar) throws IOException {
        ((zzpo) zzpsVar).zzh(this.zzc.zzi(), 0, 4, false);
        this.zzc.zzh(0);
        this.zzd.zza(this.zzc.zzv());
        return new zzse(zzpsVar.zzo(), zzpsVar.zzn(), this.zzd);
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return zzh(zzpsVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzh = zzpuVar;
        zzqq zzbi = zzpuVar.zzbi(0, 1);
        this.zzi = zzbi;
        this.zzj = zzbi;
        this.zzh.zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        zzafs.zzf(this.zzi);
        int i = zzaht.zza;
        int zzb2 = zzb(zzpsVar);
        if (zzb2 == -1 && (this.zzq instanceof zzsf)) {
            if (this.zzq.zzc() != zzc(this.zzn)) {
                zzsf zzsfVar = (zzsf) this.zzq;
                throw null;
            }
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzsl zzslVar = this.zzq;
        if (zzslVar instanceof zzsf) {
            zzsf zzsfVar = (zzsf) zzslVar;
            throw null;
        }
    }

    public zzsj(int i) {
        this.zzc = new zzahd(10);
        this.zzd = new zznw();
        this.zze = new zzqg();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzqh();
        zzpq zzpqVar = new zzpq();
        this.zzg = zzpqVar;
        this.zzj = zzpqVar;
    }
}
