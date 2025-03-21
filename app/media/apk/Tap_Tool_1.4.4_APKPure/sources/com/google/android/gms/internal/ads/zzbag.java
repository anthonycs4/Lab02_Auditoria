package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbag extends zzbax<zzbvo> {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbag(zzbaw zzbawVar, Activity activity) {
        this.zzb = zzbawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbvo zza() {
        zzbaw.zzl(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbvo zzb() throws RemoteException {
        zzbvl zzbvlVar;
        zzbvlVar = this.zzb.zzf;
        return zzbvlVar.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbvo zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
