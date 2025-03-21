package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmr {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbmn zzc;

    public zzbmr(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
    }

    public static final boolean zzc(String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgn)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) zzbba.zzc().zzb(zzbfq.zzgp)).intValue()) {
                zzccn.zzd("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = zzbay.zzb().zzj(this.zza, new zzbrb(), this.zzb);
    }

    public final boolean zza(String str) {
        if (zzc(str)) {
            zzd();
            zzbmn zzbmnVar = this.zzc;
            if (zzbmnVar != null) {
                try {
                    zzbmnVar.zze(str);
                    return true;
                } catch (RemoteException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void zzb() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgn)).booleanValue()) {
            zzd();
            zzbmn zzbmnVar = this.zzc;
            if (zzbmnVar != null) {
                try {
                    zzbmnVar.zzf();
                } catch (RemoteException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
