package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfdx;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzf extends zzfdx {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfdx
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzs.zzc();
            zzr.zzN(com.google.android.gms.ads.internal.zzs.zzg().zzm(), th);
            throw th;
        }
    }
}
