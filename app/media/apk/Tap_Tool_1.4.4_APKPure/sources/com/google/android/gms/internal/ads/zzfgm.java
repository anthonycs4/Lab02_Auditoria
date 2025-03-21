package com.google.android.gms.internal.ads;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgm extends zzfgo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgm() {
        super(null);
    }

    static final zzfgo zzf(int i) {
        zzfgo zzfgoVar;
        zzfgo zzfgoVar2;
        zzfgo zzfgoVar3;
        if (i < 0) {
            zzfgoVar3 = zzfgo.zzb;
            return zzfgoVar3;
        } else if (i > 0) {
            zzfgoVar2 = zzfgo.zzc;
            return zzfgoVar2;
        } else {
            zzfgoVar = zzfgo.zza;
            return zzfgoVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final <T> zzfgo zza(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
        return zzf(comparator.compare(t, t2));
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final zzfgo zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final zzfgo zzc(boolean z, boolean z2) {
        return zzf(zzfjf.zza(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final zzfgo zzd(boolean z, boolean z2) {
        return zzf(zzfjf.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final int zze() {
        return 0;
    }
}
