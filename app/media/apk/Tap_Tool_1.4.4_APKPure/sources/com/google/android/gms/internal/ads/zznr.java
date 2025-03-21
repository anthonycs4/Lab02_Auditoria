package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzjq zza(byte[] bArr, String str, String str2, zzor zzorVar) {
        zzahc zzahcVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzahcVar = new zzahc(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzahcVar = new zzahc(copyOf, length);
            if (copyOf[0] == 31) {
                zzahc zzahcVar2 = new zzahc(copyOf, length);
                while (zzahcVar2.zzb() >= 16) {
                    zzahcVar2.zzf(2);
                    zzahcVar.zzl(zzahcVar2.zzh(14), 14);
                }
            }
            zzahcVar.zza(copyOf, copyOf.length);
        }
        zzahcVar.zzf(60);
        int i3 = zzb[zzahcVar.zzh(6)];
        int i4 = zzc[zzahcVar.zzh(4)];
        int zzh = zzahcVar.zzh(5);
        int i5 = zzh < 29 ? (zzd[zzh] * 1000) / 2 : -1;
        zzahcVar.zzf(10);
        int i6 = zzahcVar.zzh(2) > 0 ? 1 : 0;
        zzjp zzjpVar = new zzjp();
        zzjpVar.zza(str);
        zzjpVar.zzj("audio/vnd.dts");
        zzjpVar.zzf(i5);
        zzjpVar.zzw(i3 + i6);
        zzjpVar.zzx(i4);
        zzjpVar.zzm(null);
        zzjpVar.zzd(str2);
        return zzjpVar.zzD();
    }
}
