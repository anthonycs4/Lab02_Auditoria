package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfr extends BroadcastReceiver {
    private boolean zza = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfr(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.zza = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zza = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zza;
    }
}
