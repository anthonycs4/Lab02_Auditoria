package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdij {
    private final zzdmy zza;
    private final zzdlt zzb;
    private final zzcph zzc;
    private final zzdhh zzd;

    public zzdij(zzdmy zzdmyVar, zzdlt zzdltVar, zzcph zzcphVar, zzdhh zzdhhVar) {
        this.zza = zzdmyVar;
        this.zzb = zzdltVar;
        this.zzc = zzcphVar;
        this.zzd = zzdhhVar;
    }

    public final View zza() throws zzcim {
        zzcib zza = this.zza.zza(zzazx.zzb(), null, null);
        View view = (View) zza;
        view.setVisibility(8);
        zza.zzab("/sendMessageToSdk", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdid
            private final zzdij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcib) obj, map);
            }
        });
        zza.zzab("/adMuted", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdie
            private final zzdij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcib) obj, map);
            }
        });
        this.zzb.zzh(new WeakReference(zza), "/loadHtml", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdif
            private final zzdij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, final Map map) {
                final zzdij zzdijVar = this.zza;
                zzcib zzcibVar = (zzcib) obj;
                zzcibVar.zzR().zzw(new zzcjn(zzdijVar, map) { // from class: com.google.android.gms.internal.ads.zzdii
                    private final zzdij zza;
                    private final Map zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzdijVar;
                        this.zzb = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcjn
                    public final void zza(boolean z) {
                        this.zza.zzd(this.zzb, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcibVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcibVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzh(new WeakReference(zza), "/showOverlay", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdig
            private final zzdij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcib) obj, map);
            }
        });
        this.zzb.zzh(new WeakReference(zza), "/hideOverlay", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdih
            private final zzdij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcib) obj, map);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcib zzcibVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Hiding native ads overlay.");
        zzcibVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcib zzcibVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Showing native ads overlay.");
        zzcibVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcib zzcibVar, Map map) {
        this.zzd.zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcib zzcibVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }
}
