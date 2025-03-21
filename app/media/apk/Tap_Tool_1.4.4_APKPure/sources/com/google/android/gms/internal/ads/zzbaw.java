package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbaw {
    private final zzazr zza;
    private final zzazq zzb;
    private final zzbed zzc;
    private final zzbkf zzd;
    private final zzbza zze;
    private final zzbvl zzf;
    private final zzbkg zzg;

    public zzbaw(zzazr zzazrVar, zzazq zzazqVar, zzbed zzbedVar, zzbkf zzbkfVar, zzbza zzbzaVar, zzbvl zzbvlVar, zzbkg zzbkgVar) {
        this.zza = zzazrVar;
        this.zzb = zzazqVar;
        this.zzc = zzbedVar;
        this.zzd = zzbkfVar;
        this.zze = zzbzaVar;
        this.zzf = zzbvlVar;
        this.zzg = zzbkgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbay.zza().zze(context, zzbay.zzd().zza, "gmob-apps", bundle, true);
    }

    public final zzbbu zza(Context context, zzazx zzazxVar, String str, zzbre zzbreVar) {
        return new zzbao(this, context, zzazxVar, str, zzbreVar).zzd(context, false);
    }

    public final zzbbu zzb(Context context, zzazx zzazxVar, String str, zzbre zzbreVar) {
        return new zzbaq(this, context, zzazxVar, str, zzbreVar).zzd(context, false);
    }

    public final zzbbq zzc(Context context, String str, zzbre zzbreVar) {
        return new zzbar(this, context, str, zzbreVar).zzd(context, false);
    }

    public final zzbio zzd(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new zzbat(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbis zze(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new zzbau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbyo zzf(Context context, String str, zzbre zzbreVar) {
        return new zzbav(this, context, str, zzbreVar).zzd(context, false);
    }

    public final zzbvo zzg(Activity activity) {
        zzbag zzbagVar = new zzbag(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzccn.zzf("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return zzbagVar.zzd(activity, z);
    }

    public final zzcbj zzh(Context context, zzbre zzbreVar) {
        return new zzbai(this, context, zzbreVar).zzd(context, false);
    }

    public final zzbvc zzi(Context context, zzbre zzbreVar) {
        return new zzbak(this, context, zzbreVar).zzd(context, false);
    }

    public final zzbmn zzj(Context context, zzbre zzbreVar, OnH5AdsEventListener onH5AdsEventListener) {
        return new zzbam(this, context, zzbreVar, onH5AdsEventListener).zzd(context, false);
    }
}
