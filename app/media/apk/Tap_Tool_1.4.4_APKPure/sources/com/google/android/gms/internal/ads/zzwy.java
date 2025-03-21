package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwy extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzwx zzc;
    public final String zzd;
    public final zzwy zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwy(com.google.android.gms.internal.ads.zzjq r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 36
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzl
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 75
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.<init>(com.google.android.gms.internal.ads.zzjq, java.lang.Throwable, boolean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzwy zza(zzwy zzwyVar, zzwy zzwyVar2) {
        return new zzwy(zzwyVar.getMessage(), zzwyVar.getCause(), zzwyVar.zza, false, zzwyVar.zzc, zzwyVar.zzd, zzwyVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwy(com.google.android.gms.internal.ads.zzjq r9, java.lang.Throwable r10, boolean r11, com.google.android.gms.internal.ads.zzwx r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.zza
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r9.zzl
            int r0 = com.google.android.gms.internal.ads.zzaht.zza
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L48
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L48
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L49
        L48:
            r6 = r4
        L49:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.<init>(com.google.android.gms.internal.ads.zzjq, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzwx):void");
    }

    private zzwy(String str, Throwable th, String str2, boolean z, zzwx zzwxVar, String str3, zzwy zzwyVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzwxVar;
        this.zzd = str3;
        this.zze = zzwyVar;
    }
}
