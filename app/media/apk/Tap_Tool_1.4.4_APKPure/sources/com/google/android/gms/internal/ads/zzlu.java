package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzlu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzlt zza(byte[] bArr) throws zzkr {
        return zzb(new zzahc(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
        if (r12 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzlt zzb(com.google.android.gms.internal.ads.zzahc r12, boolean r13) throws com.google.android.gms.internal.ads.zzkr {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzb(com.google.android.gms.internal.ads.zzahc, boolean):com.google.android.gms.internal.ads.zzlt");
    }

    private static int zzc(zzahc zzahcVar) {
        int zzh = zzahcVar.zzh(5);
        return zzh == 31 ? zzahcVar.zzh(6) + 32 : zzh;
    }

    private static int zzd(zzahc zzahcVar) throws zzkr {
        int zzh = zzahcVar.zzh(4);
        if (zzh == 15) {
            return zzahcVar.zzh(24);
        }
        if (zzh < 13) {
            return zzb[zzh];
        }
        throw new zzkr();
    }
}
