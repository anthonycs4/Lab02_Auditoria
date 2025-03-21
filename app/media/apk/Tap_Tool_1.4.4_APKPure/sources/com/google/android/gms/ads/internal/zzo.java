package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfb;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzo implements Callable<zzfb> {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzfb call() throws Exception {
        zzcct zzcctVar;
        Context context;
        zzcctVar = this.zza.zza;
        String str = zzcctVar.zza;
        context = this.zza.zzd;
        return new zzfb(zzfa.zzs(str, context, false, 1));
    }
}
