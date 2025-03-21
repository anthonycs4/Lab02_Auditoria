package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzcaw zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcaw zzcawVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzcawVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context context;
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (string.isEmpty() || this.zze.equals(string)) {
                return;
            }
            this.zze = string;
            boolean z = string.charAt(0) != '1';
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzao)).booleanValue()) {
                this.zzc.zzA(z);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && z && (context = this.zza) != null) {
                    context.deleteDatabase("OfflineUpload.db");
                }
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaj)).booleanValue()) {
                this.zzd.zza();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
