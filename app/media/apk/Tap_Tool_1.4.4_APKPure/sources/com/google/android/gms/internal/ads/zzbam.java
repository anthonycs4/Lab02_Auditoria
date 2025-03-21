package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbam extends zzbax<zzbmn> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbre zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbam(zzbaw zzbawVar, Context context, zzbre zzbreVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbreVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbmn zza() {
        return new zzbmu();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbmn zzb() throws RemoteException {
        try {
            return ((zzbmq) zzccr.zza(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzbal.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbmh(this.zzc));
        } catch (RemoteException | zzccq | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbmn zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbmh(this.zzc));
    }
}
