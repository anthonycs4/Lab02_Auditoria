package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzanv implements zzant {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzanv(boolean z) {
        this.zza = z ? 1 : 0;
    }

    private final void zze() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final int zza() {
        zze();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final MediaCodecInfo zzb(int i) {
        zze();
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final boolean zzd(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
