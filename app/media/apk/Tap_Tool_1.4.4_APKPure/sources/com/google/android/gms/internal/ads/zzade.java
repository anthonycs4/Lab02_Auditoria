package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzade implements Comparable<zzade> {
    public final boolean zza;
    private final zzacz zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
        if (r10 < r8.zzh) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
        if (r10 < r8.zzi) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzade(com.google.android.gms.internal.ads.zzjq r7, com.google.android.gms.internal.ads.zzacz r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.zzb = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L33
            int r4 = r7.zzq
            if (r4 == r2) goto L14
            int r5 = r8.zzb
            if (r4 > r5) goto L33
        L14:
            int r4 = r7.zzr
            if (r4 == r2) goto L1c
            int r5 = r8.zzc
            if (r4 > r5) goto L33
        L1c:
            float r4 = r7.zzs
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L29
            int r5 = r8.zzd
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L33
        L29:
            int r4 = r7.zzh
            if (r4 == r2) goto L31
            int r5 = r8.zze
            if (r4 > r5) goto L33
        L31:
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r6.zza = r4
            if (r10 == 0) goto L5e
            int r10 = r7.zzq
            if (r10 == r2) goto L40
            int r4 = r8.zzf
            if (r10 < r4) goto L5e
        L40:
            int r10 = r7.zzr
            if (r10 == r2) goto L48
            int r4 = r8.zzg
            if (r10 < r4) goto L5e
        L48:
            float r10 = r7.zzs
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8.zzh
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5e
        L55:
            int r10 = r7.zzh
            if (r10 == r2) goto L5f
            int r0 = r8.zzi
            if (r10 < r0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r6.zzc = r1
            boolean r9 = com.google.android.gms.internal.ads.zzadf.zzd(r9, r3)
            r6.zzd = r9
            int r9 = r7.zzh
            r6.zze = r9
            int r9 = r7.zzc()
            r6.zzf = r9
        L71:
            com.google.android.gms.internal.ads.zzfgz<java.lang.String> r9 = r8.zzp
            int r9 = r9.size()
            if (r3 >= r9) goto L8d
            java.lang.String r9 = r7.zzl
            if (r9 == 0) goto L8a
            com.google.android.gms.internal.ads.zzfgz<java.lang.String> r10 = r8.zzp
            java.lang.Object r10 = r10.get(r3)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L8a
            goto L90
        L8a:
            int r3 = r3 + 1
            goto L71
        L8d:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L90:
            r6.zzg = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzade.<init>(com.google.android.gms.internal.ads.zzjq, com.google.android.gms.internal.ads.zzacz, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzade zzadeVar) {
        zzfil zzfilVar;
        zzfil zza;
        zzfil zzfilVar2;
        zzfil zzfilVar3;
        if (!this.zza || !this.zzd) {
            zzfilVar = zzadf.zzc;
            zza = zzfilVar.zza();
        } else {
            zza = zzadf.zzc;
        }
        zzfgo zza2 = zzfgo.zzg().zzd(this.zzd, zzadeVar.zzd).zzd(this.zza, zzadeVar.zza).zzd(this.zzc, zzadeVar.zzc).zza(Integer.valueOf(this.zzg), Integer.valueOf(zzadeVar.zzg), zzfil.zzb().zza());
        Integer valueOf = Integer.valueOf(this.zze);
        Integer valueOf2 = Integer.valueOf(zzadeVar.zze);
        if (this.zzb.zzx) {
            zzfilVar3 = zzadf.zzc;
            zzfilVar2 = zzfilVar3.zza();
        } else {
            zzfilVar2 = zzadf.zzd;
        }
        return zza2.zza(valueOf, valueOf2, zzfilVar2).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzadeVar.zzf), zza).zza(Integer.valueOf(this.zze), Integer.valueOf(zzadeVar.zze), zza).zze();
    }
}
