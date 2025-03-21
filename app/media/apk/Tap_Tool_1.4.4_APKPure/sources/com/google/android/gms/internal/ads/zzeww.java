package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeww {
    public static final <O> zzexc<O> zza(zzfla<O> zzflaVar, Object obj, zzexd zzexdVar) {
        zzfla zzflaVar2;
        zzflaVar2 = zzexd.zza;
        return new zzexc<>(zzexdVar, obj, zzflaVar2, Collections.emptyList(), zzflaVar);
    }

    public static final <O> zzexc<O> zzb(Callable<O> callable, Object obj, zzexd zzexdVar) {
        zzflb zzflbVar;
        zzflbVar = zzexdVar.zzb;
        return zzc(callable, zzflbVar, obj, zzexdVar);
    }

    public static final <O> zzexc<O> zzc(Callable<O> callable, zzflb zzflbVar, Object obj, zzexd zzexdVar) {
        zzfla zzflaVar;
        zzflaVar = zzexd.zza;
        return new zzexc<>(zzexdVar, obj, zzflaVar, Collections.emptyList(), zzflbVar.zzb(callable));
    }

    public static final zzexc zzd(final zzewq zzewqVar, zzflb zzflbVar, Object obj, zzexd zzexdVar) {
        return zzc(new Callable(zzewqVar) { // from class: com.google.android.gms.internal.ads.zzewv
            private final zzewq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewqVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zza.zza();
                return null;
            }
        }, zzflbVar, obj, zzexdVar);
    }
}
