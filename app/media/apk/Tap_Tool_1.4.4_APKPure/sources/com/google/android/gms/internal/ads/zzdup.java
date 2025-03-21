package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdup implements zzfjz {
    static final zzfjz zza = new zzdup();

    private zzdup() {
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla zza(Object obj) {
        return zzfks.zzc(((ExecutionException) obj).getCause());
    }
}
