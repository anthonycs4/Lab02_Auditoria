package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekf implements zzgdq<zzekd> {
    private final zzgeb<String> zza;
    private final zzgeb<String> zzb;

    public zzekf(zzgeb<String> zzgebVar, zzgeb<String> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    public static zzekd zza(String str, String str2) {
        return new zzekd(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzekd(this.zza.zzb(), this.zzb.zzb());
    }
}
