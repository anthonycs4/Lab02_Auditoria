package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzanu implements zzant {
    private zzanu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzanu(zzanq zzanqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final boolean zzd(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
