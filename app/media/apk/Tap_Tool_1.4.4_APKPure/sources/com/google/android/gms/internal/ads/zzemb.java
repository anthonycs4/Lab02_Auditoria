package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemb implements zzeld<zzemc> {
    private final Context zza;
    private final String zzb;
    private final zzflb zzc;

    public zzemb(zzbxh zzbxhVar, Context context, String str, zzflb zzflbVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzflbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzemc> zza() {
        return this.zzc.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzema
            private final zzemb zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemc(new JSONObject());
            }
        });
    }
}
