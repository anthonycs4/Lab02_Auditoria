package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbfe extends zzbfi<Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfe(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* bridge */ /* synthetic */ Integer zza(Bundle bundle) {
        String zze = zze();
        if (bundle.containsKey(zze.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze) : new String("com.google.android.gms.ads.flag."))) {
            String zze2 = zze();
            return Integer.valueOf(bundle.getInt(zze2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(zze2) : new String("com.google.android.gms.ads.flag.")));
        }
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(zze(), num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* bridge */ /* synthetic */ Integer zzc(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(zze(), zzf().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* bridge */ /* synthetic */ Integer zzd(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zze(), zzf().intValue()));
    }
}
