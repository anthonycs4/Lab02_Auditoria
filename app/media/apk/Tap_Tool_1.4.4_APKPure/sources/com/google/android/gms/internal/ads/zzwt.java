package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwt {
    private long zza;
    private long zzb;
    private boolean zzc;

    public final void zza() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }

    public final long zzb(zzjq zzjqVar, zzol zzolVar) {
        if (this.zzc) {
            return zzolVar.zzd;
        }
        ByteBuffer byteBuffer = zzolVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
        }
        int zzb = zznx.zzb(i);
        if (zzb == -1) {
            this.zzc = true;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return zzolVar.zzd;
        }
        long j = this.zza;
        if (j != 0) {
            long j2 = (1000000 * j) / zzjqVar.zzz;
            this.zza = j + zzb;
            return this.zzb + j2;
        }
        long j3 = zzolVar.zzd;
        this.zzb = j3;
        this.zza = zzb - 529;
        return j3;
    }
}
