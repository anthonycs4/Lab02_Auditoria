package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbuj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbuk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuj(zzbuk zzbukVar) {
        this.zza = zzbukVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzf("User canceled the download.");
    }
}
