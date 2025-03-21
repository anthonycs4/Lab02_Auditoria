package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzajl extends Handler {
    final /* synthetic */ zzajm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzajl(zzajm zzajmVar, Looper looper) {
        super(looper);
        this.zza = zzajmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzs(message);
    }
}
