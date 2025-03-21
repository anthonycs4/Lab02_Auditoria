package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbzo implements zzbzu {
    public static final /* synthetic */ int zzb = 0;
    private static final List<Future<Void>> zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgbu zzd;
    private final LinkedHashMap<String, zzgcs> zze;
    private final Context zzh;
    private final zzbzr zzi;
    private final zzbzq zzn;
    private final List<String> zzf = new ArrayList();
    private final List<String> zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet<String> zzk = new HashSet<>();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbzo(Context context, zzcct zzcctVar, zzbzr zzbzrVar, String str, zzbzq zzbzqVar, byte[] bArr) {
        Preconditions.checkNotNull(zzbzrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap<>();
        this.zzn = zzbzqVar;
        this.zzi = zzbzrVar;
        for (String str2 : zzbzrVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgbu zze = zzgcw.zze();
        zze.zza(zzgco.OCTAGON_AD);
        zze.zzc(str);
        zze.zzd(str);
        zzgbv zza = zzgbw.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza.zza(str3);
        }
        zze.zze(zza.zzah());
        zzgcu zza2 = zzgcv.zza();
        zza2.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzcctVar.zza;
        if (str4 != null) {
            zza2.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza2.zzb(apkVersion);
        }
        zze.zzl(zza2.zzah());
        this.zzd = zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final zzbzr zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zzb(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzj();
            } else {
                this.zzd.zzi(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final boolean zzc() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbzr r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzs.zzc()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.zze.zzg(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.zze.zzi(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.zze.zzg(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbzt.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbzj r8 = new com.google.android.gms.internal.ads.zzbzj
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzr.zzk(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzo.zzd(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zze(String str, Map<String, String> map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    this.zze.get(str).zzd(zzgcr.zzb(3));
                }
                return;
            }
            zzgcs zzd = zzgct.zzd();
            zzgcr zzb2 = zzgcr.zzb(i);
            if (zzb2 != null) {
                zzd.zzd(zzb2);
            }
            zzd.zza(this.zze.size());
            zzd.zzb(str);
            zzgbz zza = zzgcc.zza();
            if (this.zzk.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String value = entry.getValue() != null ? entry.getValue() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (this.zzk.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzgbx zza2 = zzgby.zza();
                        zza2.zza(zzfxj.zzv(key));
                        zza2.zzb(zzfxj.zzv(value));
                        zza.zza(zza2.zzah());
                    }
                }
            }
            zzd.zzc(zza.zzah());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfla zzi = zzfks.zzi(zzfks.zza(Collections.emptyMap()), new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzbzk
                private final zzbzo zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfjz
                public final zzfla zza(Object obj) {
                    return this.zza.zzg((Map) obj);
                }
            }, zzccz.zzf);
            zzfla zzh = zzfks.zzh(zzi, 10L, TimeUnit.SECONDS, zzccz.zzd);
            zzfks.zzp(zzi, new zzbzn(this, zzh), zzccz.zzf);
            zzc.add(zzh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzg(Map map) throws Exception {
        zzgcs zzgcsVar;
        zzfla zzj;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgcsVar = this.zze.get(str);
                            }
                            if (zzgcsVar == null) {
                                String valueOf = String.valueOf(str);
                                zzbzt.zza(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgcsVar.zze(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzbhi.zzb.zze().booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzfks.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zza(zzgco.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z = this.zza;
        if ((!z || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfks.zza(null);
        }
        synchronized (this.zzj) {
            for (zzgcs zzgcsVar2 : this.zze.values()) {
                this.zzd.zzg(zzgcsVar2.zzah());
            }
            this.zzd.zzm(this.zzf);
            this.zzd.zzn(this.zzg);
            if (zzbzt.zzb()) {
                String zzb2 = this.zzd.zzb();
                String zzh = this.zzd.zzh();
                StringBuilder sb = new StringBuilder(String.valueOf(zzb2).length() + 53 + String.valueOf(zzh).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(zzb2);
                sb.append("\n  clickUrl: ");
                sb.append(zzh);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzgct zzgctVar : this.zzd.zzf()) {
                    sb2.append("    [");
                    sb2.append(zzgctVar.zzc());
                    sb2.append("] ");
                    sb2.append(zzgctVar.zza());
                }
                zzbzt.zza(sb2.toString());
            }
            zzfla<String> zzb3 = new com.google.android.gms.ads.internal.util.zzbp(this.zzh).zzb(1, this.zzi.zzb, null, this.zzd.zzah().zzao());
            if (zzbzt.zzb()) {
                zzb3.zze(zzbzl.zza, zzccz.zza);
            }
            zzj = zzfks.zzj(zzb3, zzbzm.zza, zzccz.zzf);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Bitmap bitmap) {
        zzfxh zzB = zzfxj.zzB();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzB);
        synchronized (this.zzj) {
            zzgbu zzgbuVar = this.zzd;
            zzgch zza = zzgcl.zza();
            zza.zzc(zzB.zza());
            zza.zzb("image/png");
            zza.zza(zzgck.TYPE_CREATIVE);
            zzgbuVar.zzk(zza.zzah());
        }
    }
}
