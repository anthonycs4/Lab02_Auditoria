package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznp {
    final /* synthetic */ zznq zza;
    private final Handler zzb = new Handler();
    private final AudioTrack.StreamEventCallback zzc;

    public zznp(zznq zznqVar) {
        this.zza = zznqVar;
        this.zzc = new zzno(this, zznqVar);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(zznn.zza(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
