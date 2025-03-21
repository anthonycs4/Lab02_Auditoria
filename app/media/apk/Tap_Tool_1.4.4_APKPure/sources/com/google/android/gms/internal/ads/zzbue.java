package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbue implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbuf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbue(zzbuf zzbufVar) {
        this.zza = zzbufVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzf("Operation denied by user.");
    }
}
