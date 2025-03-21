package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzewu {
    final /* synthetic */ zzexd zza;
    private final Object zzb;
    private final List<zzfla<?>> zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzewu(zzexd zzexdVar, Object obj, List list, zzews zzewsVar) {
        this.zza = zzexdVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final <O> zzexc<O> zza(Callable<O> callable) {
        zzflb zzflbVar;
        zzfkr zzo = zzfks.zzo(this.zzc);
        zzfla zza = zzo.zza(zzewt.zza, zzccz.zzf);
        zzexd zzexdVar = this.zza;
        Object obj = this.zzb;
        List<zzfla<?>> list = this.zzc;
        zzflbVar = zzexdVar.zzb;
        return new zzexc<>(zzexdVar, obj, zza, list, zzo.zza(callable, zzflbVar));
    }
}
