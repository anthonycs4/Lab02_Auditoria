package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbkv implements zzblp {
    static final zzblp zza = new zzbkv();

    private zzbkv() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzcjd zzcjdVar = (zzcjd) obj;
        zzblp<zzcib> zzblpVar = zzblo.zza;
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfx)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcjdVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf2).length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbog) zzcjdVar).zze("openableApp", hashMap);
    }
}
