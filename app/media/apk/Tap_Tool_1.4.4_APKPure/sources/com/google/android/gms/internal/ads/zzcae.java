package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcae implements zzasi {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzcae(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z) {
        if (com.google.android.gms.ads.internal.zzs.zzA().zzb(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                if (TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzs.zzA().zzf(this.zza, this.zzc);
                } else {
                    com.google.android.gms.ads.internal.zzs.zzA().zzg(this.zza, this.zzc);
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        zza(zzashVar.zzj);
    }
}
