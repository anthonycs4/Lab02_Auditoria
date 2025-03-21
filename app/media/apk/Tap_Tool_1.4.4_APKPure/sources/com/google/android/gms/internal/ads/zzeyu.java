package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyu {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(Context context) {
        zzfad.zza(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzezr.zza().zzb(context);
        zzezm.zza().zzb(context);
        zzfab.zza(context);
        zzezo.zza().zzc(context);
    }
}
