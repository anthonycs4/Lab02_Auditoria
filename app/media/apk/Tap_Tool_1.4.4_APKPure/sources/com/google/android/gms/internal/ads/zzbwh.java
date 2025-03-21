package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbwh {
    @Nonnull
    private final View zza;
    private final Map<String, WeakReference<View>> zzb;
    private final zzcbj zzc;

    public zzbwh(zzbwg zzbwgVar) {
        View view;
        Map<String, WeakReference<View>> map;
        View view2;
        view = zzbwgVar.zza;
        this.zza = view;
        map = zzbwgVar.zzb;
        this.zzb = map;
        view2 = zzbwgVar.zza;
        zzcbj zza = zzbwd.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzi(new zzbwi(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzccn.zzf("Failed to call remote method.");
        }
    }

    public final void zza(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbwe(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }

    public final void zzb(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzh(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbwf(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcbj zzcbjVar = this.zzc;
        if (zzcbjVar != null) {
            try {
                zzcbjVar.zzf(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                zzccn.zzf("Failed to call remote method.");
                return;
            }
        }
        zzccn.zzd("Failed to get internal reporting info generator.");
    }
}
