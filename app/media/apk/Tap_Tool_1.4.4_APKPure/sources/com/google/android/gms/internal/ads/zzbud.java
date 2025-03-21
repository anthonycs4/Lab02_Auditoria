package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbud implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbuf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbud(zzbuf zzbufVar) {
        this.zza = zzbufVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzs.zzc();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzr.zzO(context, zzb);
    }
}
