package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbq implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcde zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbq(zzcbr zzcbrVar, Context context, zzcde zzcdeVar) {
        this.zza = context;
        this.zzb = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            zzccn.zzg("Exception while getting advertising Id info", e);
        }
    }
}
