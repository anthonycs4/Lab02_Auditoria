package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeka implements zzeld<zzekb> {
    private final zzflb zza;
    private final Bundle zzb;

    public zzeka(zzflb zzflbVar, Bundle bundle) {
        this.zza = zzflbVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzekb> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzejz
            private final zzeka zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzekb zzb() throws Exception {
        return new zzekb(this.zzb);
    }
}
