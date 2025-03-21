package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzcxp;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedb<AdT, AdapterT, ListenerT extends zzcxp> implements zzdya<AdT> {
    private final zzdyc<AdapterT, ListenerT> zza;
    private final zzdyi<AdT, AdapterT, ListenerT> zzb;
    private final zzexl zzc;
    private final zzflb zzd;

    public zzedb(zzexl zzexlVar, zzflb zzflbVar, zzdyc<AdapterT, ListenerT> zzdycVar, zzdyi<AdT, AdapterT, ListenerT> zzdyiVar) {
        this.zzc = zzexlVar;
        this.zzd = zzflbVar;
        this.zzb = zzdyiVar;
        this.zza = zzdycVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        return !zzessVar.zzs.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<AdT> zzb(final zzete zzeteVar, final zzess zzessVar) {
        final zzdyd<AdapterT, ListenerT> zzdydVar;
        Iterator<String> it = zzessVar.zzs.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdydVar = null;
                break;
            }
            try {
                zzdydVar = this.zza.zza(it.next(), zzessVar.zzu);
                break;
            } catch (zzetp unused) {
            }
        }
        if (zzdydVar == null) {
            return zzfks.zzc(new zzebd("Unable to instantiate mediation adapter class."));
        }
        zzcde zzcdeVar = new zzcde();
        zzdydVar.zzc.zza(new zzeda(this, zzdydVar, zzcdeVar));
        if (zzessVar.zzH) {
            Bundle bundle = zzeteVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzexl zzexlVar = this.zzc;
        return zzeww.zzd(new zzewq(this, zzeteVar, zzessVar, zzdydVar) { // from class: com.google.android.gms.internal.ads.zzecy
            private final zzedb zza;
            private final zzete zzb;
            private final zzess zzc;
            private final zzdyd zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
                this.zzd = zzdydVar;
            }

            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zza() {
                this.zza.zzd(this.zzb, this.zzc, this.zzd);
            }
        }, this.zzd, zzexf.ADAPTER_LOAD_AD_SYN, zzexlVar).zzj(zzexf.ADAPTER_LOAD_AD_ACK).zze(zzcdeVar).zzj(zzexf.ADAPTER_WRAP_ADAPTER).zzb(new zzewp(this, zzeteVar, zzessVar, zzdydVar) { // from class: com.google.android.gms.internal.ads.zzecz
            private final zzedb zza;
            private final zzete zzb;
            private final zzess zzc;
            private final zzdyd zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
                this.zzd = zzdydVar;
            }

            @Override // com.google.android.gms.internal.ads.zzewp
            public final Object zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, (Void) obj);
            }
        }).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzete zzeteVar, zzess zzessVar, zzdyd zzdydVar, Void r4) throws Exception {
        return this.zzb.zzb(zzeteVar, zzessVar, zzdydVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzete zzeteVar, zzess zzessVar, zzdyd zzdydVar) throws Exception {
        this.zzb.zza(zzeteVar, zzessVar, zzdydVar);
    }
}
