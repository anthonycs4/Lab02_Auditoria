package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzul implements zzpr {
    public static final zzpx zza = zzuk.zza;
    private final zzum zzb = new zzum(null);
    private final zzahd zzc = new zzahd(16384);
    private boolean zzd;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        r16.zzl();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        if ((r4 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzps r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzahd r0 = new com.google.android.gms.internal.ads.zzahd
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzi()
            r5 = r16
            com.google.android.gms.internal.ads.zzpo r5 = (com.google.android.gms.internal.ads.zzpo) r5
            r5.zzh(r4, r2, r1, r2)
            r0.zzh(r2)
            int r4 = r0.zzr()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9a
            r16.zzl()
            r5.zzj(r3, r2)
            r4 = r3
        L28:
            r1 = 0
        L29:
            byte[] r6 = r0.zzi()
            r8 = 7
            r5.zzh(r6, r2, r8, r2)
            r0.zzh(r2)
            int r6 = r0.zzo()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L52
            if (r6 == r10) goto L52
            r16.zzl()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L51
            r5.zzj(r4, r2)
            goto L28
        L51:
            return r2
        L52:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L58
            return r9
        L58:
            byte[] r9 = r0.zzi()
            int r12 = com.google.android.gms.internal.ads.zzma.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L64
            r12 = -1
            goto L91
        L64:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8b
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L8c
        L8b:
            r8 = 4
        L8c:
            if (r6 != r10) goto L90
            int r8 = r8 + 2
        L90:
            int r12 = r12 + r8
        L91:
            if (r12 != r13) goto L94
            return r2
        L94:
            int r12 = r12 + (-7)
            r5.zzj(r12, r2)
            goto L29
        L9a:
            r0.zzk(r7)
            int r4 = r0.zzA()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzj(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzul.zzd(com.google.android.gms.internal.ads.zzps):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzb.zzb(zzpuVar, new zzwf(Integer.MIN_VALUE, 0, 1));
        zzpuVar.zzbj();
        zzpuVar.zzbk(new zzql(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        int zza2 = zzpsVar.zza(this.zzc.zzi(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzh(0);
        this.zzc.zzf(zza2);
        if (!this.zzd) {
            this.zzb.zzc(0L, 4);
            this.zzd = true;
        }
        this.zzb.zzd(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzd = false;
        this.zzb.zza();
    }
}
