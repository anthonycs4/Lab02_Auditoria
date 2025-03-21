package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzzn implements zzabb {
    private final zzpx zza;
    private zzpr zzb;
    private zzps zzc;

    public zzzn(zzpx zzpxVar) {
        this.zza = zzpxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r6.zzn() != r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
        if (r6.zzn() != r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzaec r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.gms.internal.ads.zzpu r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzpo r6 = new com.google.android.gms.internal.ads.zzpo
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzpr r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzpx r8 = r7.zza
            com.google.android.gms.internal.ads.zzpr[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.zzb = r8
            goto L7f
        L20:
            r0 = 0
        L21:
            if (r0 >= r10) goto L7b
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r2 == 0) goto L3f
            r7.zzb = r1     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r1 != 0) goto L37
            long r0 = r6.zzn()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L38
        L37:
            r13 = 1
        L38:
            com.google.android.gms.internal.ads.zzafs.zzd(r13)
            r6.zzl()
            goto L7b
        L3f:
            com.google.android.gms.internal.ads.zzpr r1 = r7.zzb
            if (r1 != 0) goto L71
            long r1 = r6.zzn()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L6f
            goto L71
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzpr r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzn()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L5a
        L59:
            r13 = 1
        L5a:
            com.google.android.gms.internal.ads.zzafs.zzd(r13)
            r6.zzl()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzpr r1 = r7.zzb
            if (r1 != 0) goto L71
            long r1 = r6.zzn()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L6f
            goto L71
        L6f:
            r1 = 0
            goto L72
        L71:
            r1 = 1
        L72:
            com.google.android.gms.internal.ads.zzafs.zzd(r1)
            r6.zzl()
            int r0 = r0 + 1
            goto L21
        L7b:
            com.google.android.gms.internal.ads.zzpr r10 = r7.zzb
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.zzpr r8 = r7.zzb
            r8.zze(r15)
            return
        L85:
            com.google.android.gms.internal.ads.zzaci r10 = new com.google.android.gms.internal.ads.zzaci
            java.lang.String r8 = com.google.android.gms.internal.ads.zzaht.zzL(r8)
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 58
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzn.zza(com.google.android.gms.internal.ads.zzaec, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzpu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc() {
        zzpr zzprVar = this.zzb;
        if (zzprVar instanceof zzsj) {
            ((zzsj) zzprVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final long zzd() {
        zzps zzpsVar = this.zzc;
        if (zzpsVar != null) {
            return zzpsVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zze(long j, long j2) {
        zzpr zzprVar = this.zzb;
        Objects.requireNonNull(zzprVar);
        zzprVar.zzg(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzf(zzqj zzqjVar) throws IOException {
        zzpr zzprVar = this.zzb;
        Objects.requireNonNull(zzprVar);
        zzps zzpsVar = this.zzc;
        Objects.requireNonNull(zzpsVar);
        return zzprVar.zzf(zzpsVar, zzqjVar);
    }
}
