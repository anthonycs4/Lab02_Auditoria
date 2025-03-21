package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzp implements zzdya<zzddu> {
    private final Context zza;
    private final zzder zzb;
    private final Executor zzc;
    private final zzesr zzd;

    public zzdzp(Context context, Executor executor, zzder zzderVar, zzesr zzesrVar) {
        this.zza = context;
        this.zzb = zzderVar;
        this.zzc = executor;
        this.zzd = zzesrVar;
    }

    private static String zzd(zzess zzessVar) {
        try {
            return zzessVar.zzu.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        return (this.zza instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzbgo.zza(this.zza) && !TextUtils.isEmpty(zzd(zzessVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzddu> zzb(final zzete zzeteVar, final zzess zzessVar) {
        String zzd = zzd(zzessVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfks.zzi(zzfks.zza(null), new zzfjz(this, parse, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdzn
            private final zzdzp zza;
            private final Uri zzb;
            private final zzete zzc;
            private final zzess zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = parse;
                this.zzc = zzeteVar;
                this.zzd = zzessVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
            }
        }, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(Uri uri, zzete zzeteVar, zzess zzessVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            final zzcde zzcdeVar = new zzcde();
            zzddv zzc = this.zzb.zzc(new zzctc(zzeteVar, zzessVar, null), new zzddy(new zzdez(zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzdzo
                private final zzcde zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzcdeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdez
                public final void zza(boolean z, Context context) {
                    zzcde zzcdeVar2 = this.zza;
                    try {
                        com.google.android.gms.ads.internal.zzs.zzb();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcdeVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcdeVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzc.zzi(), null, new zzcct(0, 0, false, false, false), null));
            this.zzd.zzd();
            return zzfks.zza(zzc.zzh());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
