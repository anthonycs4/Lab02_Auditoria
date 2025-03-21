package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzabq {
    private final zzahd zza = new zzahd(32);
    private zzabp zzb;
    private zzabp zzc;
    private zzabp zzd;
    private long zze;
    private final zzaek zzf;

    public zzabq(zzaek zzaekVar, byte[] bArr) {
        this.zzf = zzaekVar;
        zzabp zzabpVar = new zzabp(0L, 65536);
        this.zzb = zzabpVar;
        this.zzc = zzabpVar;
        this.zzd = zzabpVar;
    }

    private final int zzi(int i) {
        zzabp zzabpVar = this.zzd;
        if (!zzabpVar.zzc) {
            zzadr zzc = this.zzf.zzc();
            zzabp zzabpVar2 = new zzabp(this.zzd.zzb, 65536);
            zzabpVar.zzd = zzc;
            zzabpVar.zze = zzabpVar2;
            zzabpVar.zzc = true;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzabp zzabpVar = this.zzd;
        if (j == zzabpVar.zzb) {
            this.zzd = zzabpVar.zze;
        }
    }

    private static zzabp zzk(zzabp zzabpVar, zzol zzolVar, zzabt zzabtVar, zzahd zzahdVar) {
        zzabp zzabpVar2;
        int i;
        if (zzolVar.zzj()) {
            long j = zzabtVar.zzb;
            zzahdVar.zza(1);
            zzabp zzm = zzm(zzabpVar, j, zzahdVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzahdVar.zzi()[0];
            int i2 = b & ByteCompanionObject.MIN_VALUE;
            int i3 = b & ByteCompanionObject.MAX_VALUE;
            zzoh zzohVar = zzolVar.zza;
            byte[] bArr = zzohVar.zza;
            if (bArr == null) {
                zzohVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zzabpVar2 = zzm(zzm, j2, zzohVar.zza, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                zzahdVar.zza(2);
                zzabpVar2 = zzm(zzabpVar2, j3, zzahdVar.zzi(), 2);
                j3 += 2;
                i = zzahdVar.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzohVar.zzc;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzohVar.zzd;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (i2 != 0) {
                int i4 = i * 6;
                zzahdVar.zza(i4);
                zzabpVar2 = zzm(zzabpVar2, j3, zzahdVar.zzi(), i4);
                j3 += i4;
                zzahdVar.zzh(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzahdVar.zzo();
                    iArr4[i5] = zzahdVar.zzB();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzabtVar.zza - ((int) (j3 - zzabtVar.zzb));
            }
            zzqp zzqpVar = zzabtVar.zzc;
            int i6 = zzaht.zza;
            zzohVar.zza(i, iArr2, iArr4, zzqpVar.zzb, zzohVar.zza, zzqpVar.zza, zzqpVar.zzc, zzqpVar.zzd);
            long j4 = zzabtVar.zzb;
            int i7 = (int) (j3 - j4);
            zzabtVar.zzb = j4 + i7;
            zzabtVar.zza -= i7;
        } else {
            zzabpVar2 = zzabpVar;
        }
        if (zzolVar.zze()) {
            zzahdVar.zza(4);
            zzabp zzm2 = zzm(zzabpVar2, zzabtVar.zzb, zzahdVar.zzi(), 4);
            int zzB = zzahdVar.zzB();
            zzabtVar.zzb += 4;
            zzabtVar.zza -= 4;
            zzolVar.zzi(zzB);
            zzabp zzl = zzl(zzm2, zzabtVar.zzb, zzolVar.zzb, zzB);
            zzabtVar.zzb += zzB;
            int i8 = zzabtVar.zza - zzB;
            zzabtVar.zza = i8;
            ByteBuffer byteBuffer = zzolVar.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                zzolVar.zze = ByteBuffer.allocate(i8);
            } else {
                zzolVar.zze.clear();
            }
            return zzl(zzl, zzabtVar.zzb, zzolVar.zze, zzabtVar.zza);
        }
        zzolVar.zzi(zzabtVar.zza);
        return zzl(zzabpVar2, zzabtVar.zzb, zzolVar.zzb, zzabtVar.zza);
    }

    private static zzabp zzl(zzabp zzabpVar, long j, ByteBuffer byteBuffer, int i) {
        zzabp zzn = zzn(zzabpVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzd.zza, zzn.zza(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zze;
            }
        }
        return zzn;
    }

    private static zzabp zzm(zzabp zzabpVar, long j, byte[] bArr, int i) {
        zzabp zzn = zzn(zzabpVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j));
            System.arraycopy(zzn.zzd.zza, zzn.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zze;
            }
        }
        return zzn;
    }

    private static zzabp zzn(zzabp zzabpVar, long j) {
        while (j >= zzabpVar.zzb) {
            zzabpVar = zzabpVar.zze;
        }
        return zzabpVar;
    }

    public final void zza() {
        zzabp zzabpVar = this.zzb;
        if (zzabpVar.zzc) {
            zzabp zzabpVar2 = this.zzd;
            int i = (zzabpVar2.zzc ? 1 : 0) + (((int) (zzabpVar2.zza - zzabpVar.zza)) / 65536);
            zzadr[] zzadrVarArr = new zzadr[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzadrVarArr[i2] = zzabpVar.zzd;
                zzabpVar = zzabpVar.zzb();
            }
            this.zzf.zze(zzadrVarArr);
        }
        zzabp zzabpVar3 = new zzabp(0L, 65536);
        this.zzb = zzabpVar3;
        this.zzc = zzabpVar3;
        this.zzd = zzabpVar3;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzol zzolVar, zzabt zzabtVar) {
        this.zzc = zzk(this.zzc, zzolVar, zzabtVar, this.zza);
    }

    public final void zzd(zzol zzolVar, zzabt zzabtVar) {
        zzk(this.zzc, zzolVar, zzabtVar, this.zza);
    }

    public final void zze(long j) {
        zzabp zzabpVar;
        if (j != -1) {
            while (true) {
                zzabpVar = this.zzb;
                if (j < zzabpVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzabpVar.zzd);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzabpVar.zza) {
                this.zzc = zzabpVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzaec zzaecVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzabp zzabpVar = this.zzd;
        int zza = zzaecVar.zza(zzabpVar.zzd.zza, zzabpVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void zzh(zzahd zzahdVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzabp zzabpVar = this.zzd;
            zzahdVar.zzm(zzabpVar.zzd.zza, zzabpVar.zza(this.zze), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
