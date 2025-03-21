package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahn implements zzage {
    private Message zza;
    private zzaho zzb;

    private zzahn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzahn(zzahm zzahmVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzaho.zzk(this);
    }

    public final zzahn zzb(Message message, zzaho zzahoVar) {
        this.zza = message;
        this.zzb = zzahoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
