package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznu implements zzmw {
    final /* synthetic */ zznv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zznu(zznv zznvVar, zznt zzntVar) {
        this.zza = zznvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zza() {
        if (zznv.zzad(this.zza) != null) {
            zznv.zzad(this.zza).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzb(Exception exc) {
        zzagm.zzb("MediaCodecAudioRenderer", "Audio sink error", exc);
        zznv.zzac(this.zza).zzi(exc);
    }
}
