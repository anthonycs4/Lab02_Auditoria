package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdo<T> implements zzgdq<T> {
    private zzgeb<T> zza;

    public static <T> void zza(zzgeb<T> zzgebVar, zzgeb<T> zzgebVar2) {
        zzgdo zzgdoVar = (zzgdo) zzgebVar;
        if (zzgdoVar.zza == null) {
            zzgdoVar.zza = zzgebVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final T zzb() {
        zzgeb<T> zzgebVar = this.zza;
        if (zzgebVar == null) {
            throw new IllegalStateException();
        }
        return zzgebVar.zzb();
    }
}
