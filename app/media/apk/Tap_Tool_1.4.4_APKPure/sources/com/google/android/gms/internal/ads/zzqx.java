package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqx implements zzpr {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private zzpu zzo;
    private zzqq zzp;
    private zzqm zzq;
    private boolean zzr;
    public static final zzpx zza = zzqw.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzaht.zzr("#!AMR\n");
    private static final byte[] zze = zzaht.zzr("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzqx() {
        this(0);
    }

    public zzqx(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private final boolean zza(zzps zzpsVar) throws IOException {
        byte[] bArr = zzd;
        if (zzb(zzpsVar, bArr)) {
            this.zzh = false;
            ((zzpo) zzpsVar).zze(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (zzb(zzpsVar, bArr2)) {
            this.zzh = true;
            ((zzpo) zzpsVar).zze(bArr2.length, false);
            return true;
        }
        return false;
    }

    private static boolean zzb(zzps zzpsVar, byte[] bArr) throws IOException {
        zzpsVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzpo) zzpsVar).zzh(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: EOFException -> 0x0099, TryCatch #0 {EOFException -> 0x0099, blocks: (B:4:0x0007, B:6:0x001a, B:20:0x0038, B:22:0x0041, B:21:0x003d, B:28:0x0054, B:31:0x005d, B:32:0x007f, B:33:0x0080, B:34:0x0098), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: EOFException -> 0x0099, TryCatch #0 {EOFException -> 0x0099, blocks: (B:4:0x0007, B:6:0x001a, B:20:0x0038, B:22:0x0041, B:21:0x003d, B:28:0x0054, B:31:0x005d, B:32:0x007f, B:33:0x0080, B:34:0x0098), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzc(com.google.android.gms.internal.ads.zzps r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L9a
            r12.zzl()     // Catch: java.io.EOFException -> L99
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L99
            r4 = r12
            com.google.android.gms.internal.ads.zzpo r4 = (com.google.android.gms.internal.ads.zzpo) r4     // Catch: java.io.EOFException -> L99
            r4.zzh(r0, r3, r2, r3)     // Catch: java.io.EOFException -> L99
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L99
            r0 = r0[r3]     // Catch: java.io.EOFException -> L99
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L80
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.zzh     // Catch: java.io.EOFException -> L99
            if (r4 == 0) goto L2b
            r5 = 10
            if (r0 < r5) goto L36
            r5 = 13
            if (r0 <= r5) goto L2b
            goto L36
        L2b:
            if (r4 != 0) goto L54
            r5 = 12
            if (r0 < r5) goto L36
            r5 = 14
            if (r0 > r5) goto L36
            goto L54
        L36:
            if (r4 == 0) goto L3d
            int[] r4 = com.google.android.gms.internal.ads.zzqx.zzc     // Catch: java.io.EOFException -> L99
            r0 = r4[r0]     // Catch: java.io.EOFException -> L99
            goto L41
        L3d:
            int[] r4 = com.google.android.gms.internal.ads.zzqx.zzb     // Catch: java.io.EOFException -> L99
            r0 = r4[r0]     // Catch: java.io.EOFException -> L99
        L41:
            r11.zzj = r0     // Catch: java.io.EOFException -> L99
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L4c
            r11.zzm = r0
            r4 = r0
        L4c:
            if (r4 != r0) goto L9a
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
            goto L9a
        L54:
            com.google.android.gms.internal.ads.zzkr r12 = new com.google.android.gms.internal.ads.zzkr     // Catch: java.io.EOFException -> L99
            java.lang.String r3 = "WB"
            java.lang.String r5 = "NB"
            if (r2 == r4) goto L5d
            r3 = r5
        L5d:
            int r2 = r3.length()     // Catch: java.io.EOFException -> L99
            int r2 = r2 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L99
            r4.<init>(r2)     // Catch: java.io.EOFException -> L99
            java.lang.String r2 = "Illegal AMR "
            r4.append(r2)     // Catch: java.io.EOFException -> L99
            r4.append(r3)     // Catch: java.io.EOFException -> L99
            java.lang.String r2 = " frame type "
            r4.append(r2)     // Catch: java.io.EOFException -> L99
            r4.append(r0)     // Catch: java.io.EOFException -> L99
            java.lang.String r0 = r4.toString()     // Catch: java.io.EOFException -> L99
            r12.<init>(r0)     // Catch: java.io.EOFException -> L99
            throw r12     // Catch: java.io.EOFException -> L99
        L80:
            com.google.android.gms.internal.ads.zzkr r12 = new com.google.android.gms.internal.ads.zzkr     // Catch: java.io.EOFException -> L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L99
            r3 = 42
            r2.<init>(r3)     // Catch: java.io.EOFException -> L99
            java.lang.String r3 = "Invalid padding bits for frame header "
            r2.append(r3)     // Catch: java.io.EOFException -> L99
            r2.append(r0)     // Catch: java.io.EOFException -> L99
            java.lang.String r0 = r2.toString()     // Catch: java.io.EOFException -> L99
            r12.<init>(r0)     // Catch: java.io.EOFException -> L99
            throw r12     // Catch: java.io.EOFException -> L99
        L99:
            return r1
        L9a:
            com.google.android.gms.internal.ads.zzqq r4 = r11.zzp
            int r12 = com.google.android.gms.internal.ads.zzqo.zza(r4, r12, r0, r2)
            if (r12 != r1) goto La3
            return r1
        La3:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto Lab
            return r3
        Lab:
            com.google.android.gms.internal.ads.zzqq r4 = r11.zzp
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzd(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzc(com.google.android.gms.internal.ads.zzps):int");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return zza(zzpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzo = zzpuVar;
        this.zzp = zzpuVar.zzbi(0, 1);
        zzpuVar.zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        zzafs.zzf(this.zzp);
        int i = zzaht.zza;
        if (zzpsVar.zzn() != 0 || zza(zzpsVar)) {
            if (!this.zzr) {
                this.zzr = true;
                boolean z = this.zzh;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                zzqq zzqqVar = this.zzp;
                zzjp zzjpVar = new zzjp();
                zzjpVar.zzj(str);
                zzjpVar.zzk(zzf);
                zzjpVar.zzw(1);
                zzjpVar.zzx(i2);
                zzqqVar.zza(zzjpVar.zzD());
            }
            int zzc2 = zzc(zzpsVar);
            if (!this.zzl) {
                zzql zzqlVar = new zzql(-9223372036854775807L, 0L);
                this.zzq = zzqlVar;
                this.zzo.zzbk(zzqlVar);
                this.zzl = true;
            }
            return zzc2;
        }
        throw new zzkr("Could not find AMR header.");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
    }
}
