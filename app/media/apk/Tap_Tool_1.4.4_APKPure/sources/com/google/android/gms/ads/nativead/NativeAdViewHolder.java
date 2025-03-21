package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzccn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zza = new WeakHashMap<>();
    @NotOnlyInitialized
    private zzbis zzb;
    private WeakReference<View> zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzccn.zzf("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zza.get(view) != null) {
            zzccn.zzf("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zza.put(view, this);
            this.zzc = new WeakReference<>(view);
            this.zzb = zzbay.zzb().zze(view, zza(map), zza(map2));
        }
    }

    private static final HashMap<String, View> zza(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzd(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzccn.zzg("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        ?? zza2 = nativeAd.zza();
        WeakReference<View> weakReference = this.zzc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            zzccn.zzi("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        zzbis zzbisVar = this.zzb;
        if (zzbisVar != 0) {
            try {
                zzbisVar.zzb(zza2);
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbis zzbisVar = this.zzb;
        if (zzbisVar != null) {
            try {
                zzbisVar.zzc();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.zzc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
