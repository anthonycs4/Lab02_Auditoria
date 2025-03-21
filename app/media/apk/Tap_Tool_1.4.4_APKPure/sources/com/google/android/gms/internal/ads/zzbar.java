package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbar extends zzbax<zzbbq> {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbre zzc;
    final /* synthetic */ zzbaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbar(zzbaw zzbawVar, Context context, String str, zzbre zzbreVar) {
        this.zzd = zzbawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbbq zza() {
        zzbaw.zzl(this.zza, "native_ad");
        return new zzbeh();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbq zzb() throws RemoteException {
        zzazq zzazqVar;
        zzazqVar = this.zzd.zzb;
        return zzazqVar.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbq zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}
