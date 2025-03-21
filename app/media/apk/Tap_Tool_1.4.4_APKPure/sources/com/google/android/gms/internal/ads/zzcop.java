package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcop implements zzblp<Object> {
    final /* synthetic */ zzcos zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcop(zzcos zzcosVar) {
        this.zza = zzcosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        Executor executor;
        if (zzcos.zze(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcoo
                private final zzcop zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcox zzcoxVar;
                    zzcoxVar = this.zza.zza.zzd;
                    zzcoxVar.zzf();
                }
            });
        }
    }
}
