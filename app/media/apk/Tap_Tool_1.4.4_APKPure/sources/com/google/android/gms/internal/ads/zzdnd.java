package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdnd implements zzcxa {
    private final zzcib zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnd(zzcib zzcibVar) {
        this.zza = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzb(Context context) {
        zzcib zzcibVar = this.zza;
        if (zzcibVar != null) {
            zzcibVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbA(Context context) {
        zzcib zzcibVar = this.zza;
        if (zzcibVar != null) {
            zzcibVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbx(Context context) {
        zzcib zzcibVar = this.zza;
        if (zzcibVar != null) {
            zzcibVar.destroy();
        }
    }
}
