package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzui implements zzpr {
    public static final zzpx zza = zzuh.zza;
    private final zzuj zzb = new zzuj(null);
    private final zzahd zzc = new zzahd(2786);
    private boolean zzd;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if ((r4 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        r9.zzl();
        r4 = r4 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzps r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzahd r0 = new com.google.android.gms.internal.ads.zzahd
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzi()
            r5 = r9
            com.google.android.gms.internal.ads.zzpo r5 = (com.google.android.gms.internal.ads.zzpo) r5
            r5.zzh(r4, r2, r1, r2)
            r0.zzh(r2)
            int r4 = r0.zzr()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L62
            r9.zzl()
            r5.zzj(r3, r2)
            r4 = r3
        L26:
            r1 = 0
        L27:
            byte[] r6 = r0.zzi()
            r7 = 6
            r5.zzh(r6, r2, r7, r2)
            r0.zzh(r2)
            int r6 = r0.zzo()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4a
            r9.zzl()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L49
            r5.zzj(r4, r2)
            goto L26
        L49:
            return r2
        L4a:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L50
            return r6
        L50:
            byte[] r6 = r0.zzi()
            int r6 = com.google.android.gms.internal.ads.zzlx.zzd(r6)
            r7 = -1
            if (r6 != r7) goto L5c
            return r2
        L5c:
            int r6 = r6 + (-6)
            r5.zzj(r6, r2)
            goto L27
        L62:
            r4 = 3
            r0.zzk(r4)
            int r4 = r0.zzA()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzj(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzd(com.google.android.gms.internal.ads.zzps):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzb.zzb(zzpuVar, new zzwf(Integer.MIN_VALUE, 0, 1));
        zzpuVar.zzbj();
        zzpuVar.zzbk(new zzql(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        int zza2 = zzpsVar.zza(this.zzc.zzi(), 0, 2786);
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
