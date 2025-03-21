package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzeiq implements Callable {
    static final Callable zza = new zzeiq();

    private zzeiq() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new zzeis(com.google.android.gms.ads.internal.zzs.zzm().zzi(), com.google.android.gms.ads.internal.zzs.zzm().zzm());
    }
}
