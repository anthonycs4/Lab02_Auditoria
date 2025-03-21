package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzakr extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzakz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakr(zzakz zzakzVar, AudioTrack audioTrack) {
        this.zzb = zzakzVar;
        this.zza = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            conditionVariable = this.zzb.zze;
            conditionVariable.open();
        }
    }
}
