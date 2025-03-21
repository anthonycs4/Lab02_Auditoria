package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzamg {
    private final byte[] zza = new byte[8];
    private final Stack<zzamf> zzb = new Stack<>();
    private final zzamm zzc = new zzamm();
    private int zzd;
    private int zze;
    private long zzf;
    private zzami zzg;

    private final long zzd(zzalt zzaltVar, int i) throws IOException, InterruptedException {
        zzaltVar.zzb(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    public final void zzb(zzami zzamiVar) {
        this.zzg = zzamiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzalt r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamg.zzc(com.google.android.gms.internal.ads.zzalt):boolean");
    }
}
