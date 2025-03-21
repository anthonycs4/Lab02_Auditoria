package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbas extends zzbax<zzbcl> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbas(zzbaw zzbawVar, Context context) {
        this.zzb = zzbawVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbcl zza() {
        zzbaw.zzl(this.zza, "mobile_ads_settings");
        return new zzbel();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbcl zzb() throws RemoteException {
        zzbed zzbedVar;
        zzbedVar = this.zzb.zzc;
        return zzbedVar.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbcl zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzh(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }
}
