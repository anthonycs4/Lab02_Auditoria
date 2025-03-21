package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeho implements zzeld<zzehp> {
    private final zzflb zza;
    private final Context zzb;

    public zzeho(zzflb zzflbVar, Context context) {
        this.zza = zzflbVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzehp> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzehn
            private final zzeho zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzehp zzb() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        return new zzehp(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzs.zzh().zzb(), com.google.android.gms.ads.internal.zzs.zzh().zzd());
    }
}
