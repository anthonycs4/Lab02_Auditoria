package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdwm implements Callable {
    private final zzdwk zza;

    private zzdwm(zzdwk zzdwkVar) {
        this.zza = zzdwkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzdwk zzdwkVar) {
        return new zzdwm(zzdwkVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
