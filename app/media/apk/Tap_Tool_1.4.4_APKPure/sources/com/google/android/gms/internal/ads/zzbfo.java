package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbfo implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbfs.zza(new zzffb(this) { // from class: com.google.android.gms.internal.ads.zzbfm
                private final zzbfo zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzffb
                public final Object zza() {
                    return this.zza.zzc();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final void zza(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || context == null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context != null) {
                zzbba.zza();
                SharedPreferences zza = zzbfk.zza(context);
                this.zze = zza;
                if (zza != null) {
                    zza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbhq.zzb(new zzbfn(this));
                zzf();
                this.zzd = true;
                this.zza = false;
                this.zzc.open();
                return;
            }
            this.zza = false;
            this.zzc.open();
        }
    }

    public final <T> T zzb(final zzbfi<T> zzbfiVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbfiVar.zzf();
            }
        }
        if (zzbfiVar.zzm() == 2) {
            Bundle bundle = this.zzf;
            return bundle == null ? zzbfiVar.zzf() : zzbfiVar.zza(bundle);
        } else if (zzbfiVar.zzm() != 1 || !this.zzh.has(zzbfiVar.zze())) {
            return (T) zzbfs.zza(new zzffb(this, zzbfiVar) { // from class: com.google.android.gms.internal.ads.zzbfl
                private final zzbfo zza;
                private final zzbfi zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzbfiVar;
                }

                @Override // com.google.android.gms.internal.ads.zzffb
                public final Object zza() {
                    return this.zza.zzd(this.zzb);
                }
            });
        } else {
            return zzbfiVar.zzc(this.zzh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzc() {
        return this.zze.getString("flag_configuration", "{}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzd(zzbfi zzbfiVar) {
        return zzbfiVar.zzd(this.zze);
    }
}
