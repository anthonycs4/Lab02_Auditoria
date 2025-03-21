package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeav implements zzeap<zzdgu> {
    private final zzdfn zza;
    private final zzflb zzb;
    private final zzdjl zzc;
    private final zzeuc<zzdlt> zzd;

    public zzeav(zzdfn zzdfnVar, zzflb zzflbVar, zzdjl zzdjlVar, zzeuc<zzdlt> zzeucVar) {
        this.zza = zzdfnVar;
        this.zzb = zzflbVar;
        this.zzc = zzdjlVar;
        this.zzd = zzeucVar;
    }

    private final zzfla<zzdgu> zzg(final zzete zzeteVar, final zzess zzessVar, final JSONObject jSONObject) {
        final zzfla<zzdlt> zzb = this.zzd.zzb();
        final zzfla<zzdgz> zza = this.zzc.zza(zzeteVar, zzessVar, jSONObject);
        return zzfks.zzn(zzb, zza).zza(new Callable(this, zza, zzb, zzeteVar, zzessVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzeau
            private final zzeav zza;
            private final zzfla zzb;
            private final zzfla zzc;
            private final zzete zzd;
            private final zzess zze;
            private final JSONObject zzf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
                this.zzc = zzb;
                this.zzd = zzeteVar;
                this.zze = zzessVar;
                this.zzf = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar = zzessVar.zzr;
        return (zzesxVar == null || zzesxVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<List<zzfla<zzdgu>>> zzb(final zzete zzeteVar, final zzess zzessVar) {
        return zzfks.zzi(zzfks.zzi(this.zzd.zzb(), new zzfjz(this, zzessVar) { // from class: com.google.android.gms.internal.ads.zzeaq
            private final zzeav zza;
            private final zzess zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzessVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzf(this.zzb, (zzdlt) obj);
            }
        }, this.zzb), new zzfjz(this, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzear
            private final zzeav zza;
            private final zzete zzb;
            private final zzess zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zze(this.zzb, this.zzc, (JSONArray) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdgu zzc(zzfla zzflaVar, zzfla zzflaVar2, zzete zzeteVar, zzess zzessVar, JSONObject jSONObject) throws Exception {
        zzdgz zzdgzVar = (zzdgz) zzflaVar.get();
        zzdlt zzdltVar = (zzdlt) zzflaVar2.get();
        zzdha zzc = this.zza.zzc(new zzctc(zzeteVar, zzessVar, null), new zzdhl(zzdgzVar), new zzdgb(jSONObject, zzdltVar));
        zzc.zzi().zzb();
        zzc.zzj().zza(zzdltVar);
        zzc.zzk().zza(zzdgzVar.zzR());
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgt)).booleanValue() || !zzc.zzh().zzy()) {
            if (zzdgzVar.zzR() != null && zzdgzVar.zzR().zzR() != null && zzdgzVar.zzR().zzR().zzH()) {
                zzc.zzl().zzi(zzdgzVar.zzR(), false, null);
            }
            if (zzdgzVar.zzS() != null && zzdgzVar.zzS().zzR() != null && zzdgzVar.zzS().zzR().zzH()) {
                zzc.zzl().zzi(zzdgzVar.zzS(), false, null);
            }
        }
        return zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzdlt zzdltVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzc(zzfks.zza(zzdltVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbpt("process json failed");
        }
        return zzfks.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zze(zzete zzeteVar, zzess zzessVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfks.zzc(new zzdsp(3));
        }
        if (zzeteVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zza(Math.min(length, zzeteVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzeteVar.zza.zza.zzk);
            for (int i = 0; i < zzeteVar.zza.zza.zzk; i++) {
                if (i < length) {
                    arrayList.add(zzg(zzeteVar, zzessVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzfks.zzc(new zzdsp(3)));
                }
            }
            return zzfks.zza(arrayList);
        }
        return zzfks.zzj(zzg(zzeteVar, zzessVar, jSONArray.getJSONObject(0)), zzeat.zza, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzf(zzess zzessVar, final zzdlt zzdltVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfK)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzessVar.zzr.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfks.zzi(zzdltVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfjz(this, zzdltVar) { // from class: com.google.android.gms.internal.ads.zzeas
            private final zzeav zza;
            private final zzdlt zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdltVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzd(this.zzb, (JSONObject) obj);
            }
        }, this.zzb);
    }
}
