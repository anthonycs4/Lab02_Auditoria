package com.google.android.gms.internal.ads;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfgo {
    private static final zzfgo zza = new zzfgm();
    private static final zzfgo zzb = new zzfgn(-1);
    private static final zzfgo zzc = new zzfgn(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfgo(zzfgm zzfgmVar) {
    }

    public static zzfgo zzg() {
        return zza;
    }

    public abstract <T> zzfgo zza(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract zzfgo zzb(int i, int i2);

    public abstract zzfgo zzc(boolean z, boolean z2);

    public abstract zzfgo zzd(boolean z, boolean z2);

    public abstract int zze();
}
