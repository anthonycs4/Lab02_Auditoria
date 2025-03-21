package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvr implements zzpr {
    public static final zzpx zza = zzvp.zza;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzvn zzj;
    private zzpu zzk;
    private boolean zzl;
    private final zzahq zzb = new zzahq(0);
    private final zzahd zzd = new zzahd(4096);
    private final SparseArray<zzvq> zzc = new SparseArray<>();
    private final zzvo zze = new zzvo();

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        byte[] bArr = new byte[14];
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzpoVar.zzj(bArr[13] & 7, false);
            zzpoVar.zzh(bArr, 0, 3, false);
            return ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE)) == 1;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzk = zzpuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r14, com.google.android.gms.internal.ads.zzqj r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvr.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        if (this.zzb.zzc() == -9223372036854775807L || (this.zzb.zza() != 0 && this.zzb.zza() != j2)) {
            this.zzb.zzd(j2);
        }
        zzvn zzvnVar = this.zzj;
        if (zzvnVar != null) {
            zzvnVar.zzb(j2);
        }
        for (int i = 0; i < this.zzc.size(); i++) {
            this.zzc.valueAt(i).zza();
        }
    }
}
