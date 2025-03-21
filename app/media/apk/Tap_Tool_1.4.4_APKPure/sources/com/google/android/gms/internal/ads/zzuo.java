package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzuo implements zzpr {
    public static final zzpx zza = zzun.zza;
    private final zzup zzb;
    private final zzahd zzc;
    private final zzahd zzd;
    private final zzahc zze;
    private zzpu zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzuo() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        r10.zzl();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
        if ((r4 - r1) >= 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzps r10) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzahd r2 = r9.zzd
            byte[] r2 = r2.zzi()
            r3 = r10
            com.google.android.gms.internal.ads.zzpo r3 = (com.google.android.gms.internal.ads.zzpo) r3
            r4 = 10
            r3.zzh(r2, r0, r4, r0)
            com.google.android.gms.internal.ads.zzahd r2 = r9.zzd
            r2.zzh(r0)
            com.google.android.gms.internal.ads.zzahd r2 = r9.zzd
            int r2 = r2.zzr()
            r4 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r4) goto L8d
            r10.zzl()
            r3.zzj(r1, r0)
            long r4 = r9.zzh
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L31
            long r4 = (long) r1
            r9.zzh = r4
        L31:
            r4 = r1
        L32:
            r2 = 0
            r5 = 0
        L34:
            com.google.android.gms.internal.ads.zzahd r6 = r9.zzd
            byte[] r6 = r6.zzi()
            r7 = 2
            r3.zzh(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzahd r6 = r9.zzd
            r6.zzh(r0)
            com.google.android.gms.internal.ads.zzahd r6 = r9.zzd
            int r6 = r6.zzo()
            boolean r6 = com.google.android.gms.internal.ads.zzup.zzf(r6)
            if (r6 != 0) goto L5f
            r10.zzl()
            int r4 = r4 + 1
            int r2 = r4 - r1
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r2 >= r5) goto L5e
            r3.zzj(r4, r0)
            goto L32
        L5e:
            return r0
        L5f:
            r6 = 1
            int r2 = r2 + r6
            r7 = 4
            if (r2 < r7) goto L6a
            r8 = 188(0xbc, float:2.63E-43)
            if (r5 > r8) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            com.google.android.gms.internal.ads.zzahd r6 = r9.zzd
            byte[] r6 = r6.zzi()
            r3.zzh(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzahc r6 = r9.zze
            r7 = 14
            r6.zzd(r7)
            com.google.android.gms.internal.ads.zzahc r6 = r9.zze
            r7 = 13
            int r6 = r6.zzh(r7)
            r7 = 6
            if (r6 > r7) goto L86
            return r0
        L86:
            int r7 = r6 + (-6)
            r3.zzj(r7, r0)
            int r5 = r5 + r6
            goto L34
        L8d:
            com.google.android.gms.internal.ads.zzahd r2 = r9.zzd
            r4 = 3
            r2.zzk(r4)
            com.google.android.gms.internal.ads.zzahd r2 = r9.zzd
            int r2 = r2.zzA()
            int r4 = r2 + 10
            int r1 = r1 + r4
            r3.zzj(r2, r0)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuo.zzd(com.google.android.gms.internal.ads.zzps):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzf = zzpuVar;
        this.zzb.zzb(zzpuVar, new zzwf(Integer.MIN_VALUE, 0, 1));
        zzpuVar.zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        zzafs.zzf(this.zzf);
        int zza2 = zzpsVar.zza(this.zzc.zzi(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzbk(new zzql(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzh(0);
        this.zzc.zzf(zza2);
        if (!this.zzi) {
            this.zzb.zzc(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zzd(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzi = false;
        this.zzb.zza();
        this.zzg = j2;
    }

    public zzuo(int i) {
        this.zzb = new zzup(true, null);
        this.zzc = new zzahd(2048);
        this.zzh = -1L;
        zzahd zzahdVar = new zzahd(10);
        this.zzd = zzahdVar;
        byte[] zzi = zzahdVar.zzi();
        this.zze = new zzahc(zzi, zzi.length);
    }
}
