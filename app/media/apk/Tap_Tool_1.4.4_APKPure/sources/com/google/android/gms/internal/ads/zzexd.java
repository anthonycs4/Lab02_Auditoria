package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzexd<E> {
    private static final zzfla<?> zza = zzfks.zza(null);
    private final zzflb zzb;
    private final ScheduledExecutorService zzc;
    private final zzexe<E> zzd;

    public zzexd(zzflb zzflbVar, ScheduledExecutorService scheduledExecutorService, zzexe<E> zzexeVar) {
        this.zzb = zzflbVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzexeVar;
    }

    public final <I> zzexc<I> zza(E e, zzfla<I> zzflaVar) {
        return new zzexc<>(this, e, zzflaVar, Collections.singletonList(zzflaVar), zzflaVar);
    }

    public final zzewu zzb(E e, zzfla<?>... zzflaVarArr) {
        return new zzewu(this, e, Arrays.asList(zzflaVarArr), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzc(E e);
}
