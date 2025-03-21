package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbly implements com.google.android.gms.ads.internal.overlay.zzt {
    boolean zza = false;
    final /* synthetic */ Map zzb;
    final /* synthetic */ Map zzc;
    final /* synthetic */ zzazi zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbly(zzbma zzbmaVar, Map map, Map map2, zzazi zzaziVar) {
        this.zzb = map;
        this.zzc = map2;
        this.zzd = zzaziVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        this.zzb.put((String) this.zzc.get("event_id"), Boolean.valueOf(z));
        ((zzbog) this.zzd).zze("openIntentAsync", this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzb(int i) {
    }
}
