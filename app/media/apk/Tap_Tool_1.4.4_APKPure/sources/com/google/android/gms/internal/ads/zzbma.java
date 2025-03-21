package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzciy;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzcjm;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbma<T extends zzazi & zzchs & zzcib & zzbog & zzciy & zzcjd & zzcjh & zzcjk & zzcjm> implements zzblp<T> {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdpn zzb;
    private final zzexv zzc;
    private final zzbuh zze;
    private final zzdxo zzf;
    private com.google.android.gms.ads.internal.overlay.zzt zzg = null;
    private final zzccs zzd = new zzccs(null);

    public zzbma(com.google.android.gms.ads.internal.zzb zzbVar, zzbuh zzbuhVar, zzdxo zzdxoVar, zzdpn zzdpnVar, zzexv zzexvVar) {
        this.zza = zzbVar;
        this.zze = zzbuhVar;
        this.zzf = zzdxoVar;
        this.zzb = zzdpnVar;
        this.zzc = zzexvVar;
    }

    public static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.zzs.zze().zzh();
            }
            return -1;
        }
        return -1;
    }

    static Uri zze(Context context, zzfb zzfbVar, Uri uri, View view, Activity activity) {
        if (zzfbVar == null) {
            return uri;
        }
        try {
            return zzfbVar.zzf(uri) ? zzfbVar.zze(uri, context, view, activity) : uri;
        } catch (zzfc unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzf(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            com.google.android.gms.ads.internal.util.zze.zzg(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    private final boolean zzh(T t, Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzs.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzr.zzI(context);
        com.google.android.gms.ads.internal.zzs.zzc();
        com.google.android.gms.ads.internal.util.zzbs zzD = com.google.android.gms.ads.internal.util.zzr.zzD(context);
        zzdpn zzdpnVar = this.zzb;
        if (zzdpnVar != null) {
            zzdxw.zzd(context, zzdpnVar, this.zzc, this.zzf, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.zzP().zzg() && t2.zzj() == null;
        if (zzI) {
            this.zzf.zzc(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzD != null && !z) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfF)).booleanValue()) {
                if (t2.zzP().zzg()) {
                    zzdxw.zzc(t2.zzj(), null, zzD, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    t.zzaJ(zzD, this.zzf, this.zzb, this.zzc, str2, str, com.google.android.gms.ads.internal.zzs.zze().zzh());
                }
                zzdpn zzdpnVar2 = this.zzb;
                if (zzdpnVar2 != null) {
                    zzdxw.zzd(context, zzdpnVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.zzf.zzd(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzs.zzc();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzD == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfF)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzdxw.zzh(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzblz.zzb(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzi(T r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbma.zzi(com.google.android.gms.internal.ads.zzazi, java.util.Map, boolean, java.lang.String):void");
    }

    private final void zzj(boolean z) {
        zzbuh zzbuhVar = this.zze;
        if (zzbuhVar != null) {
            zzbuhVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
            zzexv zzexvVar = this.zzc;
            zzexu zza = zzexu.zza("cct_action");
            zza.zzc("cct_open_status", zzbgn.zza(i));
            zzexvVar.zza(zza);
            return;
        }
        zzdpm zza2 = this.zzb.zza();
        zza2.zzc("action", "cct_action");
        zza2.zzc("cct_open_status", zzbgn.zza(i));
        zza2.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    /* renamed from: zzb */
    public final void zza(T t, Map<String, String> map) {
        boolean z;
        T t2 = t;
        String zza = zzcay.zza(map.get("u"), t2.getContext(), true);
        String str = map.get("a");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzess zzF = t2.zzF();
            zzesv zzaB = t2.zzaB();
            boolean z2 = false;
            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zzF == null || zzaB == null) {
                z = false;
            } else {
                boolean z3 = zzF.zzad;
                str2 = zzaB.zzb;
                z = z3;
            }
            if ("expand".equalsIgnoreCase(str)) {
                if (t2.zzW()) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Cannot expand WebView that is already expanded.");
                    return;
                }
                zzj(false);
                t.zzaG(zzc(map), zzd(map));
                return;
            } else if ("webapp".equalsIgnoreCase(str)) {
                zzj(false);
                if (zza != null) {
                    t.zzaH(zzc(map), zzd(map), zza);
                    return;
                } else {
                    t.zzaI(zzc(map), zzd(map), map.get("html"), map.get("baseurl"));
                    return;
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str)) {
                Context context = t2.getContext();
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcL)).booleanValue()) {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcR)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzcP)).booleanValue()) {
                            z2 = true;
                            break;
                        }
                        String str3 = (String) zzbba.zzc().zzb(zzbfq.zzcQ);
                        if (!str3.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            for (String str4 : zzfey.zza(zzfef.zzb(';')).zzb(str3)) {
                                if (str4.equals(packageName)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                boolean zza2 = zzbgo.zza(t2.getContext());
                if (z2) {
                    if (!zza2) {
                        zzk(4);
                    } else {
                        zzj(true);
                        if (TextUtils.isEmpty(zza)) {
                            com.google.android.gms.ads.internal.util.zze.zzi("Cannot open browser with null or empty url");
                            zzk(7);
                            return;
                        }
                        Uri zzf = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(zza), t2.zzH(), t2.zzj()));
                        if (z && this.zzf != null && zzh(t, t2.getContext(), zzf.toString(), str2)) {
                            return;
                        }
                        this.zzg = new zzblx(this);
                        t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzf.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true));
                        return;
                    }
                }
                map.put("use_first_package", "true");
                map.put("use_running_process", "true");
                zzi(t, map, z, str2);
                return;
            } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase(map.get("system_browser"))) {
                if ("open_app".equalsIgnoreCase(str)) {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfx)).booleanValue()) {
                        zzj(true);
                        String str5 = map.get("p");
                        if (str5 == null) {
                            com.google.android.gms.ads.internal.util.zze.zzi("Package name missing from open app action.");
                            return;
                        } else if (z && this.zzf != null && zzh(t, t2.getContext(), str5, str2)) {
                            return;
                        } else {
                            PackageManager packageManager = t2.getContext().getPackageManager();
                            if (packageManager == null) {
                                com.google.android.gms.ads.internal.util.zze.zzi("Cannot get package manager from open app action.");
                                return;
                            }
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                            if (launchIntentForPackage != null) {
                                t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                zzj(true);
                String str6 = map.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        intent = Intent.parseUri(str6, 0);
                    } catch (URISyntaxException e) {
                        String valueOf = String.valueOf(str6);
                        com.google.android.gms.ads.internal.util.zze.zzg(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                    }
                }
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzf2 = zzf(zze(t2.getContext(), t2.zzU(), data, t2.zzH(), t2.zzj()));
                        if (!TextUtils.isEmpty(intent.getType())) {
                            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfy)).booleanValue()) {
                                intent.setDataAndType(zzf2, intent.getType());
                            }
                        }
                        intent.setData(zzf2);
                    }
                }
                boolean z4 = ((Boolean) zzbba.zzc().zzb(zzbfq.zzfJ)).booleanValue() && "intent_async".equalsIgnoreCase(str) && map.containsKey("event_id");
                HashMap hashMap = new HashMap();
                if (z4) {
                    this.zzg = new zzbly(this, hashMap, map, t);
                }
                if (intent != null) {
                    if (!z || this.zzf == null || !zzh(t, t2.getContext(), intent.getData().toString(), str2)) {
                        t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg));
                        return;
                    } else if (z4) {
                        hashMap.put(map.get("event_id"), true);
                        t.zze("openIntentAsync", hashMap);
                        return;
                    } else {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(zza)) {
                    zza = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(zza), t2.zzH(), t2.zzj())).toString();
                }
                if (!z || this.zzf == null || !zzh(t, t2.getContext(), zza, str2)) {
                    t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(map.get("i"), zza, map.get("m"), map.get("p"), map.get("c"), map.get("f"), map.get("e"), this.zzg));
                    return;
                } else if (z4) {
                    hashMap.put(map.get("event_id"), true);
                    t.zze("openIntentAsync", hashMap);
                    return;
                } else {
                    return;
                }
            } else {
                zzi(t, map, z, str2);
                return;
            }
        }
        this.zza.zzc(zza);
    }
}
