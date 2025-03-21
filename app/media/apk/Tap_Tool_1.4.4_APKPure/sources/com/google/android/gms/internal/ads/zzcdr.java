package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcdr implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcdz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdr(zzcdz zzcdzVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcdzVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcea zzceaVar;
        zzcea zzceaVar2;
        zzcdz.zzs(this.zzb, this.zza);
        zzceaVar = this.zzb.zzs;
        if (zzceaVar != null) {
            zzceaVar2 = this.zzb.zzs;
            zzceaVar2.zzb();
        }
    }
}
