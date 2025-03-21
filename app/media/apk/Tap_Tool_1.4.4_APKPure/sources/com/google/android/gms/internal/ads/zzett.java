package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzett {
    public static zzblp<zzcib> zza(final zzdxo zzdxoVar, final zzeyn zzeynVar) {
        return new zzblp(zzeynVar, zzdxoVar) { // from class: com.google.android.gms.internal.ads.zzetq
            private final zzeyn zza;
            private final zzdxo zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeynVar;
                this.zzb = zzdxoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzeyn zzeynVar2 = this.zza;
                zzdxo zzdxoVar2 = this.zzb;
                zzcib zzcibVar = (zzcib) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("URL missing from click GMSG.");
                } else {
                    zzfks.zzp(zzblo.zza(zzcibVar, str), new zzets(zzcibVar, zzeynVar2, zzdxoVar2), zzccz.zza);
                }
            }
        };
    }

    public static <T extends zzchs & zzciy & zzcjd & zzcjl> zzblp<T> zzb(final zzdxo zzdxoVar, final zzeyn zzeynVar) {
        return new zzblp(zzeynVar, zzdxoVar) { // from class: com.google.android.gms.internal.ads.zzetr
            private final zzeyn zza;
            private final zzdxo zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeynVar;
                this.zzb = zzdxoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzeyn zzeynVar2 = this.zza;
                zzdxo zzdxoVar2 = this.zzb;
                zzchs zzchsVar = (zzchs) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("URL missing from httpTrack GMSG.");
                } else if (!zzchsVar.zzF().zzad) {
                    zzeynVar2.zzb(str);
                } else {
                    zzdxoVar2.zze(new zzdxq(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis(), ((zzciy) zzchsVar).zzaB().zzb, str, 2));
                }
            }
        };
    }
}
