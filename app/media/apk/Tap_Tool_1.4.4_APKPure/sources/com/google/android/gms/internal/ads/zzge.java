package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzge extends BroadcastReceiver {
    final /* synthetic */ zzgf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzge(zzgf zzgfVar) {
        this.zza = zzgfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg();
    }
}
