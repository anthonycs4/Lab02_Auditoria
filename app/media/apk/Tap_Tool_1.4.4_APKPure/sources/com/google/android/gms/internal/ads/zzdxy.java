package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxy implements zzbvi {
    private static zzezd zzb(String str) {
        if ("native".equals(str)) {
            return zzezd.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzezd.JAVASCRIPT;
        }
        return zzezd.NONE;
    }

    private static zzezc zzl(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return zzezc.ONE_PIXEL;
                }
                return zzezc.UNSPECIFIED;
            }
            return zzezc.DEFINED_BY_JAVASCRIPT;
        }
        return zzezc.BEGIN_TO_RENDER;
    }

    private static zzeza zzm(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzeza.VIDEO;
            }
            return zzeza.NATIVE_DISPLAY;
        }
        return zzeza.HTML_DISPLAY;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zza(Context context) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("Omid flag is disabled");
            return false;
        } else if (zzeyt.zzb()) {
            return true;
        } else {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdm)).booleanValue()) {
                zzeyt.zzc("1.3.3-google_20200416", context);
                return true;
            }
            zzeyt.zza(context);
            return zzeyt.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final String zzc(Context context) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4) {
        return zze(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, "Google");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            zzeze zza = zzeze.zza(str5, str);
            zzezd zzb = zzb("javascript");
            zzezd zzb2 = zzb(str4);
            if (zzb == zzezd.NONE) {
                return null;
            }
            return ObjectWrapper.wrap(zzeyv.zzf(zzeyw.zzb(zzb, zzb2, true), zzeyx.zza(zza, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzf(String str, WebView webView, String str2, String str3, String str4, zzbvk zzbvkVar, zzbvj zzbvjVar, String str5) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            zzeze zza = zzeze.zza("Google", str);
            zzezd zzb = zzb("javascript");
            zzeza zzm = zzm(zzbvjVar.toString());
            if (zzb == zzezd.NONE) {
                com.google.android.gms.ads.internal.util.zze.zzi("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzm == null) {
                String valueOf = String.valueOf(zzbvjVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                sb.append("Omid html session error; Unable to parse creative type: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                return null;
            } else {
                zzezd zzb2 = zzb(str4);
                if (zzm != zzeza.VIDEO || zzb2 != zzezd.NONE) {
                    return ObjectWrapper.wrap(zzeyv.zzf(zzeyw.zza(zzm, zzl(zzbvkVar.toString()), zzb, zzb2, true), zzeyx.zzb(zza, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
                }
                String valueOf2 = String.valueOf(str4);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzg(String str, WebView webView, String str2, String str3, String str4, String str5, zzbvk zzbvkVar, zzbvj zzbvjVar, String str6) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            zzeze zza = zzeze.zza(str5, str);
            zzezd zzb = zzb("javascript");
            zzezd zzb2 = zzb(str4);
            zzeza zzm = zzm(zzbvjVar.toString());
            if (zzb == zzezd.NONE) {
                com.google.android.gms.ads.internal.util.zze.zzi("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzm == null) {
                String valueOf = String.valueOf(zzbvjVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
                sb.append("Omid js session error; Unable to parse creative type: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                return null;
            } else if (zzm != zzeza.VIDEO || zzb2 != zzezd.NONE) {
                return ObjectWrapper.wrap(zzeyv.zzf(zzeyw.zza(zzm, zzl(zzbvkVar.toString()), zzb, zzb2, true), zzeyx.zzc(zza, webView, str6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
            } else {
                String valueOf2 = String.valueOf(str4);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzeyv) {
                ((zzeyv) unwrap).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzeyv) {
                ((zzeyv) unwrap).zzc();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzeyv) {
                ((zzeyv) unwrap).zzb(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zzeyt.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzeyv) {
                zzeyv zzeyvVar = (zzeyv) unwrap;
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdp)).booleanValue()) {
                    zzeyvVar.zzd(view, zzezb.NOT_VISIBLE, "Ad overlay");
                } else {
                    zzeyvVar.zze(view);
                }
            }
        }
    }
}
