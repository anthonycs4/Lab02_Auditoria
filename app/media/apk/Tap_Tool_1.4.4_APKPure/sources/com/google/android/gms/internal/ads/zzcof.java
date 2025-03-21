package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcof implements zzcxa {
    private final zzeub zza;

    public zzcof(zzeub zzeubVar) {
        this.zza = zzeubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzb(Context context) {
        try {
            this.zza.zzj();
            if (context != null) {
                this.zza.zzp(context);
            }
        } catch (zzetp e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbA(Context context) {
        try {
            this.zza.zzi();
        } catch (zzetp e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbx(Context context) {
        try {
            this.zza.zzf();
        } catch (zzetp e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
