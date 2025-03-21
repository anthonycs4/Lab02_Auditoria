package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcgg extends zzbl {
    static final zzcgg zzb = new zzcgg();

    zzcgg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbp zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbr();
        }
        if ("mvhd".equals(str)) {
            return new zzbs();
        }
        return new zzbt(str);
    }
}
