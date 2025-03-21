package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbi implements zzax {
    final /* synthetic */ Context zza;
    private File zzb = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
