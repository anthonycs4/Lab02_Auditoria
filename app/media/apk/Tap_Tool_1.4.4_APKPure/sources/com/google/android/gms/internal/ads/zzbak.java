package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbak extends zzbax<zzbvc> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbre zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbak(zzbaw zzbawVar, Context context, zzbre zzbreVar) {
        this.zza = context;
        this.zzb = zzbreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbvc zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbvc zzb() throws RemoteException {
        try {
            return ((zzbvf) zzccr.zza(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzbaj.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzccq | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbvc zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzn(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
