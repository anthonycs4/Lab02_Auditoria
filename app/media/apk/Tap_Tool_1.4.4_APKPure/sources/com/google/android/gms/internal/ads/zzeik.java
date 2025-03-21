package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeik implements zzeld<zzeij> {
    private final Context zza;
    private final zzflb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeik(Context context, zzflb zzflbVar) {
        this.zza = context;
        this.zzb = zzflbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeij> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeih
            private final zzeik zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeij zzb() throws Exception {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzs.zzc();
        Context context = this.zza;
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzek)).booleanValue();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String string = !booleanValue ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzem)).booleanValue()) {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        Context context2 = this.zza;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzel)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzeij(string, str, bundle, null);
    }
}
