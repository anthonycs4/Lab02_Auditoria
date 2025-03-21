package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehl implements zzeld {
    private static final Object zzf = new Object();
    private final String zza;
    private final String zzb;
    private final zzctz zzc;
    private final zzeuk zzd;
    private final zzetk zze;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzs.zzg().zzl();

    public zzehl(String str, String str2, zzctz zzctzVar, zzeuk zzeukVar, zzetk zzetkVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzctzVar;
        this.zzd = zzeukVar;
        this.zze = zzetkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla zza() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdM)).booleanValue()) {
            this.zzc.zzi(this.zze.zzd);
            bundle.putAll(this.zzd.zzc());
        }
        return zzfks.zza(new zzelc(this, bundle) { // from class: com.google.android.gms.internal.ads.zzehk
            private final zzehl zza;
            private final Bundle zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzelc
            public final void zzd(Object obj) {
                this.zza.zzb(this.zzb, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdM)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdL)).booleanValue()) {
                synchronized (zzf) {
                    this.zzc.zzi(this.zze.zzd);
                    bundle2.putBundle("quality_signals", this.zzd.zzc());
                }
            } else {
                this.zzc.zzi(this.zze.zzd);
                bundle2.putBundle("quality_signals", this.zzd.zzc());
            }
        }
        bundle2.putString("seq_num", this.zza);
        bundle2.putString("session_id", this.zzg.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zzb);
    }
}
