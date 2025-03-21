package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapf implements zzamd {
    private zzapd zze;
    private zzapd zzf;
    private zzajt zzg;
    private zzajt zzh;
    private long zzi;
    private zzape zzk;
    private final zzaqh zzl;
    private final zzapc zza = new zzapc();
    private final zzapb zzb = new zzapb();
    private final zzarc zzc = new zzarc(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzapf(zzaqh zzaqhVar, byte[] bArr) {
        this.zzl = zzaqhVar;
        zzapd zzapdVar = new zzapd(0L, 65536);
        this.zze = zzapdVar;
        this.zzf = zzapdVar;
    }

    private final void zzo(long j, byte[] bArr, int i) {
        zzp(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzaqb zzaqbVar = this.zze.zzd;
            System.arraycopy(zzaqbVar.zza, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzd(zzaqbVar);
                zzapd zzapdVar = this.zze;
                zzapdVar.zzd = null;
                this.zze = zzapdVar.zze;
            }
        }
    }

    private final void zzp(long j) {
        while (true) {
            zzapd zzapdVar = this.zze;
            if (j < zzapdVar.zzb) {
                return;
            }
            this.zzl.zzd(zzapdVar.zzd);
            zzapd zzapdVar2 = this.zze;
            zzapdVar2.zzd = null;
            this.zze = zzapdVar2.zze;
        }
    }

    private final boolean zzq() {
        return this.zzd.compareAndSet(0, 1);
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzs();
    }

    private final void zzs() {
        this.zza.zza();
        zzapd zzapdVar = this.zze;
        if (zzapdVar.zzc) {
            zzapd zzapdVar2 = this.zzf;
            int i = (zzapdVar2.zzc ? 1 : 0) + (((int) (zzapdVar2.zza - zzapdVar.zza)) / 65536);
            zzaqb[] zzaqbVarArr = new zzaqb[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzaqbVarArr[i2] = zzapdVar.zzd;
                zzapdVar.zzd = null;
                zzapdVar = zzapdVar.zze;
            }
            this.zzl.zze(zzaqbVarArr);
        }
        zzapd zzapdVar3 = new zzapd(0L, 65536);
        this.zze = zzapdVar3;
        this.zzf = zzapdVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzf();
    }

    private final int zzt(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzapd zzapdVar = this.zzf;
            if (zzapdVar.zzc) {
                this.zzf = zzapdVar.zze;
            }
            zzapd zzapdVar2 = this.zzf;
            zzaqb zzc = this.zzl.zzc();
            zzapd zzapdVar3 = new zzapd(this.zzf.zzb, 65536);
            zzapdVar2.zzd = zzc;
            zzapdVar2.zze = zzapdVar3;
            zzapdVar2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza(zzajt zzajtVar) {
        zzajt zzajtVar2 = zzajtVar == null ? null : zzajtVar;
        boolean zzj = this.zza.zzj(zzajtVar2);
        this.zzh = zzajtVar;
        zzape zzapeVar = this.zzk;
        if (zzapeVar == null || !zzj) {
            return;
        }
        zzapeVar.zzp(zzajtVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzarc zzarcVar, int i) {
        if (zzq()) {
            while (i > 0) {
                int zzt = zzt(i);
                zzarcVar.zzk(this.zzf.zzd.zza, this.zzj, zzt);
                this.zzj += zzt;
                this.zzi += zzt;
                i -= zzt;
            }
            zzr();
            return;
        }
        zzarcVar.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i, int i2, int i3, zzamc zzamcVar) {
        if (zzq()) {
            try {
                this.zza.zzk(j, i, this.zzi - i2, i2, zzamcVar);
                return;
            } finally {
                zzr();
            }
        }
        this.zza.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final int zzd(zzalt zzaltVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzq()) {
            int zzc = zzaltVar.zzc(i);
            if (zzc != -1) {
                return zzc;
            }
            throw new EOFException();
        }
        try {
            int zza = zzaltVar.zza(this.zzf.zzd.zza, this.zzj, zzt(i));
            if (zza != -1) {
                this.zzj += zza;
                this.zzi += zza;
                return zza;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final void zze(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzs();
        this.zza.zzb();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final int zzf() {
        return this.zza.zzc();
    }

    public final void zzg() {
        if (this.zzd.getAndSet(2) == 0) {
            zzs();
        }
    }

    public final boolean zzh() {
        return this.zza.zzd();
    }

    public final zzajt zzi() {
        return this.zza.zze();
    }

    public final long zzj() {
        return this.zza.zzf();
    }

    public final void zzk() {
        long zzh = this.zza.zzh();
        if (zzh != -1) {
            zzp(zzh);
        }
    }

    public final boolean zzl(long j, boolean z) {
        long zzi = this.zza.zzi(j, z);
        if (zzi == -1) {
            return false;
        }
        zzp(zzi);
        return true;
    }

    public final int zzm(zzaju zzajuVar, zzalm zzalmVar, boolean z, boolean z2, long j) {
        int i;
        int zzg = this.zza.zzg(zzajuVar, zzalmVar, z, z2, this.zzg, this.zzb);
        if (zzg == -5) {
            this.zzg = zzajuVar.zza;
            return -5;
        } else if (zzg != -4) {
            return -3;
        } else {
            if (!zzalmVar.zzc()) {
                if (zzalmVar.zzc < j) {
                    zzalmVar.zzf(Integer.MIN_VALUE);
                }
                if (zzalmVar.zzi()) {
                    zzapb zzapbVar = this.zzb;
                    long j2 = zzapbVar.zzb;
                    this.zzc.zza(1);
                    zzo(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzc.zza[0];
                    int i2 = b & ByteCompanionObject.MIN_VALUE;
                    int i3 = b & ByteCompanionObject.MAX_VALUE;
                    zzalk zzalkVar = zzalmVar.zza;
                    if (zzalkVar.zza == null) {
                        zzalkVar.zza = new byte[16];
                    }
                    zzo(j3, zzalkVar.zza, i3);
                    long j4 = j3 + i3;
                    if (i2 != 0) {
                        this.zzc.zza(2);
                        zzo(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzm();
                    } else {
                        i = 1;
                    }
                    zzalk zzalkVar2 = zzalmVar.zza;
                    int[] iArr = zzalkVar2.zzd;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzalkVar2.zze;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (i2 != 0) {
                        int i4 = i * 6;
                        this.zzc.zza(i4);
                        zzo(j4, this.zzc.zza, i4);
                        j4 += i4;
                        this.zzc.zzi(0);
                        for (int i5 = 0; i5 < i; i5++) {
                            iArr2[i5] = this.zzc.zzm();
                            iArr4[i5] = this.zzc.zzu();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzapbVar.zza - ((int) (j4 - zzapbVar.zzb));
                    }
                    zzamc zzamcVar = zzapbVar.zzd;
                    zzalk zzalkVar3 = zzalmVar.zza;
                    byte[] bArr = zzamcVar.zzb;
                    byte[] bArr2 = zzalkVar3.zza;
                    int i6 = zzamcVar.zza;
                    zzalkVar3.zza(i, iArr2, iArr4, bArr, bArr2, 1);
                    long j5 = zzapbVar.zzb;
                    int i7 = (int) (j4 - j5);
                    zzapbVar.zzb = j5 + i7;
                    zzapbVar.zza -= i7;
                }
                zzalmVar.zzh(this.zzb.zza);
                zzapb zzapbVar2 = this.zzb;
                long j6 = zzapbVar2.zzb;
                ByteBuffer byteBuffer = zzalmVar.zzb;
                int i8 = zzapbVar2.zza;
                zzp(j6);
                while (i8 > 0) {
                    int i9 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i8, 65536 - i9);
                    zzaqb zzaqbVar = this.zze.zzd;
                    byteBuffer.put(zzaqbVar.zza, i9, min);
                    j6 += min;
                    i8 -= min;
                    if (j6 == this.zze.zzb) {
                        this.zzl.zzd(zzaqbVar);
                        zzapd zzapdVar = this.zze;
                        zzapdVar.zzd = null;
                        this.zze = zzapdVar.zze;
                    }
                }
                zzp(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final void zzn(zzape zzapeVar) {
        this.zzk = zzapeVar;
    }
}
