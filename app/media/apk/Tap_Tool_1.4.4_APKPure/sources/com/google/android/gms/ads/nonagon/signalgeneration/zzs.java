package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzfko;
import java.util.Collections;
import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzs implements zzfko<Uri> {
    final /* synthetic */ zzbwb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzt zztVar, zzbwb zzbwbVar) {
        this.zza = zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        try {
            zzbwb zzbwbVar = this.zza;
            String valueOf = String.valueOf(th.getMessage());
            zzbwbVar.zzf(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Uri uri) {
        try {
            this.zza.zze(Collections.singletonList(uri));
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }
}
