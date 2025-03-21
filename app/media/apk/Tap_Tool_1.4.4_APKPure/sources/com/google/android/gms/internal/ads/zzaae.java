package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaae extends zzzt<Void> {
    private final zzaal zza;
    private final boolean zzb;
    private final zzlp zzc;
    private final zzln zzd;
    private zzaac zze;
    private zzaab zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaae(zzaal zzaalVar, boolean z) {
        boolean z2;
        this.zza = zzaalVar;
        if (z) {
            zzaalVar.zzs();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzlp();
        this.zzd = new zzln();
        zzaalVar.zzr();
        this.zze = zzaac.zzj(zzaalVar.zzy());
    }

    private final Object zzC(Object obj) {
        return (zzaac.zzm(this.zze) == null || !obj.equals(zzaac.zzd)) ? obj : zzaac.zzm(this.zze);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzD(long j) {
        zzaab zzaabVar = this.zzf;
        int zzh = this.zze.zzh(zzaabVar.zza.zza);
        if (zzh == -1) {
            return;
        }
        zzaac zzaacVar = this.zze;
        zzln zzlnVar = this.zzd;
        zzaacVar.zzg(zzh, zzlnVar, false);
        long j2 = zzlnVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzaabVar.zzq(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    /* renamed from: zzA */
    public final zzaab zzB(zzaaj zzaajVar, zzaek zzaekVar, long j) {
        zzaab zzaabVar = new zzaab(zzaajVar, zzaekVar, j, null);
        zzaabVar.zzs(this.zza);
        if (this.zzh) {
            zzaabVar.zzt(zzaajVar.zzc(zzC(zzaajVar.zza)));
        } else {
            this.zzf = zzaabVar;
            if (!this.zzg) {
                this.zzg = true;
                zzv(null, this.zza);
            }
        }
        return zzaabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzm
    public final void zza(zzafp zzafpVar) {
        super.zza(zzafpVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzm
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzaal
    public final void zzt() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void zzu(java.lang.Void r12, com.google.android.gms.internal.ads.zzaal r13, com.google.android.gms.internal.ads.zzlq r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.zzh
            r13 = 0
            if (r12 == 0) goto L1c
            com.google.android.gms.internal.ads.zzaac r12 = r11.zze
            com.google.android.gms.internal.ads.zzaac r12 = r12.zzl(r14)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzaab r12 = r11.zzf
            if (r12 == 0) goto L9f
            long r0 = r12.zzr()
            r11.zzD(r0)
            goto L9f
        L1c:
            boolean r12 = r14.zzt()
            if (r12 == 0) goto L38
            boolean r12 = r11.zzi
            if (r12 == 0) goto L2d
            com.google.android.gms.internal.ads.zzaac r12 = r11.zze
            com.google.android.gms.internal.ads.zzaac r12 = r12.zzl(r14)
            goto L35
        L2d:
            java.lang.Object r12 = com.google.android.gms.internal.ads.zzlp.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaac.zzd
            com.google.android.gms.internal.ads.zzaac r12 = com.google.android.gms.internal.ads.zzaac.zzk(r14, r12, r0)
        L35:
            r11.zze = r12
            goto L9f
        L38:
            com.google.android.gms.internal.ads.zzlp r12 = r11.zzc
            r0 = 0
            r1 = 0
            r14.zze(r0, r12, r1)
            com.google.android.gms.internal.ads.zzlp r12 = r11.zzc
            java.lang.Object r12 = r12.zzb
            com.google.android.gms.internal.ads.zzaab r3 = r11.zzf
            if (r3 == 0) goto L66
            long r3 = r3.zzo()
            com.google.android.gms.internal.ads.zzaac r5 = r11.zze
            com.google.android.gms.internal.ads.zzaab r6 = r11.zzf
            com.google.android.gms.internal.ads.zzaaj r6 = r6.zza
            java.lang.Object r6 = r6.zza
            com.google.android.gms.internal.ads.zzln r7 = r11.zzd
            r5.zzf(r6, r7)
            com.google.android.gms.internal.ads.zzaac r5 = r11.zze
            com.google.android.gms.internal.ads.zzlp r6 = r11.zzc
            r5.zze(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L66
            r9 = r3
            goto L67
        L66:
            r9 = r1
        L67:
            com.google.android.gms.internal.ads.zzlp r6 = r11.zzc
            com.google.android.gms.internal.ads.zzln r7 = r11.zzd
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.zzv(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.zzi
            if (r0 == 0) goto L86
            com.google.android.gms.internal.ads.zzaac r12 = r11.zze
            com.google.android.gms.internal.ads.zzaac r12 = r12.zzl(r14)
            goto L8a
        L86:
            com.google.android.gms.internal.ads.zzaac r12 = com.google.android.gms.internal.ads.zzaac.zzk(r14, r12, r1)
        L8a:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzaab r12 = r11.zzf
            if (r12 == 0) goto L9f
            r11.zzD(r2)
            com.google.android.gms.internal.ads.zzaaj r12 = r12.zza
            java.lang.Object r13 = r12.zza
            java.lang.Object r13 = r11.zzC(r13)
            com.google.android.gms.internal.ads.zzaaj r13 = r12.zzc(r13)
        L9f:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzaac r12 = r11.zze
            r11.zze(r12)
            if (r13 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzaab r12 = r11.zzf
            java.util.Objects.requireNonNull(r12)
            r12.zzt(r13)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzu(java.lang.Object, com.google.android.gms.internal.ads.zzaal, com.google.android.gms.internal.ads.zzlq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    protected final /* bridge */ /* synthetic */ zzaaj zzw(Void r2, zzaaj zzaajVar) {
        Object obj = zzaajVar.zza;
        if (zzaac.zzm(this.zze) != null && zzaac.zzm(this.zze).equals(obj)) {
            obj = zzaac.zzd;
        }
        return zzaajVar.zzc(obj);
    }

    public final zzlq zzx() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzkd zzy() {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzz(zzaah zzaahVar) {
        ((zzaab) zzaahVar).zzu();
        if (zzaahVar == this.zzf) {
            this.zzf = null;
        }
    }
}
