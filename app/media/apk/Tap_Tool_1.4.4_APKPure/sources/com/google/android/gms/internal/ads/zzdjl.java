package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdjl {
    private final zzflb zza;
    private final zzdjy zzb;
    private final zzdkd zzc;

    public zzdjl(zzflb zzflbVar, zzdjy zzdjyVar, zzdkd zzdkdVar) {
        this.zza = zzflbVar;
        this.zzb = zzdjyVar;
        this.zzc = zzdkdVar;
    }

    public final zzfla<zzdgz> zza(final zzete zzeteVar, final zzess zzessVar, final JSONObject jSONObject) {
        zzfla zzi;
        final zzfla zzb = this.zza.zzb(new Callable(this, zzeteVar, zzessVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdjj
            private final zzdjl zza;
            private final zzete zzb;
            private final zzess zzc;
            private final JSONObject zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
                this.zzd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzete zzeteVar2 = this.zzb;
                zzess zzessVar2 = this.zzc;
                JSONObject jSONObject2 = this.zzd;
                zzdgz zzdgzVar = new zzdgz();
                zzdgzVar.zza(jSONObject2.optInt("template_id", -1));
                zzdgzVar.zzl(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdgzVar.zzt(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzetk zzetkVar = zzeteVar2.zza.zza;
                if (zzetkVar.zzg.contains(Integer.toString(zzdgzVar.zzv()))) {
                    if (zzdgzVar.zzv() == 3) {
                        if (zzdgzVar.zzQ() == null) {
                            throw new zzebr(1, "No custom template id for custom template ad response.");
                        }
                        if (!zzetkVar.zzh.contains(zzdgzVar.zzQ())) {
                            throw new zzebr(1, "Unexpected custom template id in the response.");
                        }
                    }
                    zzdgzVar.zzi(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzessVar2.zzH) {
                        com.google.android.gms.ads.internal.zzs.zzc();
                        String zzC = com.google.android.gms.ads.internal.util.zzr.zzC();
                        StringBuilder sb = new StringBuilder(String.valueOf(zzC).length() + 3 + String.valueOf(optString).length());
                        sb.append(zzC);
                        sb.append(" : ");
                        sb.append(optString);
                        optString = sb.toString();
                    }
                    zzdgzVar.zzq("headline", optString);
                    zzdgzVar.zzq("body", jSONObject2.optString("body", null));
                    zzdgzVar.zzq("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdgzVar.zzq("store", jSONObject2.optString("store", null));
                    zzdgzVar.zzq("price", jSONObject2.optString("price", null));
                    zzdgzVar.zzq("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdgzVar;
                }
                int zzv = zzdgzVar.zzv();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid template ID: ");
                sb2.append(zzv);
                throw new zzebr(1, sb2.toString());
            }
        });
        final zzfla<List<zzbhu>> zzb2 = this.zzb.zzb(jSONObject, "images");
        final zzfla<zzcib> zzc = this.zzb.zzc(jSONObject, "images", zzessVar, zzeteVar.zzb.zzb);
        final zzfla<zzbhu> zza = this.zzb.zza(jSONObject, "secondary_image");
        final zzfla<zzbhu> zza2 = this.zzb.zza(jSONObject, "app_icon");
        final zzfla<zzbhr> zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfla<zzcib> zze = this.zzb.zze(jSONObject, zzessVar, zzeteVar.zzb.zzb);
        final zzdjy zzdjyVar = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzi = zzfks.zza(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzi = zzfks.zza(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzi = zzfks.zza(null);
                } else {
                    zzi = zzfks.zzi(zzfks.zza(null), new zzfjz(zzdjyVar, optString) { // from class: com.google.android.gms.internal.ads.zzdjt
                        private final zzdjy zza;
                        private final String zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzdjyVar;
                            this.zzb = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzfjz
                        public final zzfla zza(Object obj) {
                            return this.zza.zzf(this.zzb, obj);
                        }
                    }, zzccz.zze);
                }
            }
        }
        final zzfla zzflaVar = zzi;
        final zzfla<List<zzdkc>> zza3 = this.zzc.zza(jSONObject, "custom_assets");
        return zzfks.zzl(zzb, zzb2, zzc, zza, zza2, zzd, zze, zzflaVar, zza3).zza(new Callable(this, zzb, zzb2, zza2, zza, zzd, jSONObject, zze, zzc, zzflaVar, zza3) { // from class: com.google.android.gms.internal.ads.zzdjk
            private final zzdjl zza;
            private final zzfla zzb;
            private final zzfla zzc;
            private final zzfla zzd;
            private final zzfla zze;
            private final zzfla zzf;
            private final JSONObject zzg;
            private final zzfla zzh;
            private final zzfla zzi;
            private final zzfla zzj;
            private final zzfla zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzb;
                this.zzc = zzb2;
                this.zzd = zza2;
                this.zze = zza;
                this.zzf = zzd;
                this.zzg = jSONObject;
                this.zzh = zze;
                this.zzi = zzc;
                this.zzj = zzflaVar;
                this.zzk = zza3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfla zzflaVar2 = this.zzb;
                zzfla zzflaVar3 = this.zzc;
                zzfla zzflaVar4 = this.zzd;
                zzfla zzflaVar5 = this.zze;
                zzfla zzflaVar6 = this.zzf;
                JSONObject jSONObject2 = this.zzg;
                zzfla zzflaVar7 = this.zzh;
                zzfla zzflaVar8 = this.zzi;
                zzfla zzflaVar9 = this.zzj;
                zzfla zzflaVar10 = this.zzk;
                zzdgz zzdgzVar = (zzdgz) zzflaVar2.get();
                zzdgzVar.zzd((List) zzflaVar3.get());
                zzdgzVar.zzj((zzbik) zzflaVar4.get());
                zzdgzVar.zzk((zzbik) zzflaVar5.get());
                zzdgzVar.zzc((zzbic) zzflaVar6.get());
                zzdgzVar.zze(zzdjy.zzj(jSONObject2));
                zzdgzVar.zzf(zzdjy.zzi(jSONObject2));
                zzcib zzcibVar = (zzcib) zzflaVar7.get();
                if (zzcibVar != null) {
                    zzdgzVar.zzm(zzcibVar);
                    zzdgzVar.zzg(zzcibVar.zzH());
                    zzdgzVar.zzb(zzcibVar.zzh());
                }
                zzcib zzcibVar2 = (zzcib) zzflaVar8.get();
                if (zzcibVar2 != null) {
                    zzdgzVar.zzn(zzcibVar2);
                    zzdgzVar.zzh(zzcibVar2.zzH());
                }
                zzcib zzcibVar3 = (zzcib) zzflaVar9.get();
                if (zzcibVar3 != null) {
                    zzdgzVar.zzo(zzcibVar3);
                }
                for (zzdkc zzdkcVar : (List) zzflaVar10.get()) {
                    if (zzdkcVar.zza != 1) {
                        zzdgzVar.zzr(zzdkcVar.zzb, zzdkcVar.zzd);
                    } else {
                        zzdgzVar.zzq(zzdkcVar.zzb, zzdkcVar.zzc);
                    }
                }
                return zzdgzVar;
            }
        }, this.zza);
    }
}
