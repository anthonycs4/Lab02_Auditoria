package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzno extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zznq zza;
    final /* synthetic */ zznp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzno(zznp zznpVar, zznq zznqVar) {
        this.zzb = zznpVar;
        this.zza = zznqVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzmw zzmwVar;
        boolean z;
        zzmw zzmwVar2;
        audioTrack2 = this.zzb.zza.zzn;
        zzafs.zzd(audioTrack == audioTrack2);
        zzmwVar = this.zzb.zza.zzk;
        if (zzmwVar != null) {
            z = this.zzb.zza.zzK;
            if (z) {
                zzmwVar2 = this.zzb.zza.zzk;
                zzmwVar2.zza();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzmw zzmwVar;
        boolean z;
        zzmw zzmwVar2;
        audioTrack2 = this.zzb.zza.zzn;
        zzafs.zzd(audioTrack == audioTrack2);
        zzmwVar = this.zzb.zza.zzk;
        if (zzmwVar != null) {
            z = this.zzb.zza.zzK;
            if (z) {
                zzmwVar2 = this.zzb.zza.zzk;
                zzmwVar2.zza();
            }
        }
    }
}
