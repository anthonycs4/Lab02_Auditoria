package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexs {
    private final Executor zza;
    private final zzccs zzb;

    public zzexs(Executor executor, zzccs zzccsVar) {
        this.zza = executor;
        this.zzb = zzccsVar;
    }

    public final void zza(final String str) {
        this.zza.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzexr
            private final zzexs zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(this.zzb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str) {
        this.zzb.zza(str);
    }
}
