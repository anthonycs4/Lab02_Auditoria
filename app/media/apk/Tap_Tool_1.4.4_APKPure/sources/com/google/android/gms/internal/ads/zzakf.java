package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzakf {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static zzajt zza(zzarc zzarcVar, String str, String str2, zzalq zzalqVar) {
        int i = zzc[(zzarcVar.zzl() & 192) >> 6];
        int zzl = zzarcVar.zzl();
        int i2 = zzd[(zzl & 56) >> 3];
        if ((zzl & 4) != 0) {
            i2++;
        }
        return zzajt.zzb(str, "audio/ac3", null, -1, -1, i2, i, null, zzalqVar, 0, str2);
    }

    public static zzajt zzb(zzarc zzarcVar, String str, String str2, zzalq zzalqVar) {
        zzarcVar.zzj(2);
        int i = zzc[(zzarcVar.zzl() & 192) >> 6];
        int zzl = zzarcVar.zzl();
        int i2 = zzd[(zzl & 14) >> 1];
        if ((zzl & 1) != 0) {
            i2++;
        }
        return zzajt.zzb(str, "audio/eac3", null, -1, -1, i2, i, null, zzalqVar, 0, str2);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}
