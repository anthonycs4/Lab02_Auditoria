package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeml implements zzeld<zzemm> {
    final zzflb zza;
    final Context zzb;
    final zzauv zzc;

    public zzeml(zzauv zzauvVar, zzflb zzflbVar, Context context, byte[] bArr) {
        this.zzc = zzauvVar;
        this.zza = zzflbVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzemm> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemk
            private final zzeml zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemm(new JSONObject());
            }
        });
    }
}
