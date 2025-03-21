package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzasg extends BroadcastReceiver {
    final /* synthetic */ zzasj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasg(zzasj zzasjVar) {
        this.zza = zzasjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
