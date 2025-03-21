package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzcbj;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcjz;
import com.google.android.gms.internal.ads.zzdhs;
import com.google.android.gms.internal.ads.zzdhu;
import com.google.android.gms.internal.ads.zzdqu;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzenw;
import com.google.android.gms.internal.ads.zzenx;
import com.google.android.gms.internal.ads.zzepg;
import com.google.android.gms.internal.ads.zzeqz;
import com.google.android.gms.internal.ads.zzesl;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzbcd {
    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzb(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzepg zzl = zzcjz.zza(context, zzbreVar, i).zzl();
        zzl.zzd(context);
        zzl.zzb(zzazxVar);
        zzl.zzc(str);
        return zzl.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzc(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeqz zzq = zzcjz.zza(context, zzbreVar, i).zzq();
        zzq.zzd(context);
        zzq.zzb(zzazxVar);
        zzq.zzc(str);
        return zzq.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbq zzd(IObjectWrapper iObjectWrapper, String str, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeej(zzcjz.zza(context, zzbreVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbio zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdhu((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbxy zzf(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzesl zzt = zzcjz.zza(context, zzbreVar, i).zzt();
        zzt.zzc(context);
        return zzt.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbvo zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzs(activity);
        }
        int i = zza.zzk;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new zzy(activity);
                        }
                        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
                    }
                    return new zzu(activity, zza);
                }
                return new zzab(activity);
            }
            return new zzaa(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzr(activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbcl zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcjz.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzi(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, int i) {
        return new zzr((Context) ObjectWrapper.unwrap(iObjectWrapper), zzazxVar, str, new zzcct(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbis zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdhs((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbyo zzk(IObjectWrapper iObjectWrapper, String str, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzesl zzt = zzcjz.zza(context, zzbreVar, i).zzt();
        zzt.zzc(context);
        zzt.zzb(str);
        return zzt.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzl(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzenw zzo = zzcjz.zza(context, zzbreVar, i).zzo();
        zzo.zzb(str);
        zzo.zzc(context);
        zzenx zza = zzo.zza();
        if (i >= ((Integer) zzbba.zzc().zzb(zzbfq.zzdw)).intValue()) {
            return zza.zzb();
        }
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzcbj zzm(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) {
        return zzcjz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbreVar, i).zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbvc zzn(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) {
        return zzcjz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbreVar, i).zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbmn zzo(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i, zzbmk zzbmkVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdqu zzC = zzcjz.zza(context, zzbreVar, i).zzC();
        zzC.zzc(context);
        zzC.zzb(zzbmkVar);
        return zzC.zza().zza();
    }
}
