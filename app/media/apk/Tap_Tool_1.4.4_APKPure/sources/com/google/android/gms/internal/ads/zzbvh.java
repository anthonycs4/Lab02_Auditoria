package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbvh implements zzbvi {
    static boolean zza = false;
    static boolean zzb = false;
    private static final Object zzd = new Object();
    zzeyr zzc;

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zza(Context context) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue()) {
                if (zza) {
                    return true;
                }
                try {
                    zzb(context);
                    boolean zze = this.zzc.zze(ObjectWrapper.wrap(context));
                    zza = zze;
                    return zze;
                } catch (RemoteException e) {
                    e = e;
                    zzccn.zzl("#007 Could not call remote method.", e);
                    return false;
                } catch (NullPointerException e2) {
                    e = e2;
                    zzccn.zzl("#007 Could not call remote method.", e);
                    return false;
                }
            }
            return false;
        }
    }

    final void zzb(Context context) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && !zzb) {
                try {
                    zzb = true;
                    this.zzc = (zzeyr) zzccr.zza(context, "com.google.android.gms.ads.omid.DynamiteOmid", zzbvg.zza);
                } catch (zzccq e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final String zzc(Context context) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue()) {
            try {
                zzb(context);
                String valueOf = String.valueOf(this.zzc.zzh());
                return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
            } catch (RemoteException | NullPointerException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4) {
        return zze(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, "Google");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                try {
                    return this.zzc.zzk(str, ObjectWrapper.wrap(webView), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, str5);
                } catch (RemoteException | NullPointerException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                    return null;
                }
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzf(String str, WebView webView, String str2, String str3, String str4, zzbvk zzbvkVar, zzbvj zzbvjVar, String str5) {
        synchronized (zzd) {
            try {
                try {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdn)).booleanValue()) {
                            return zze(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, "Google");
                        }
                        try {
                            return this.zzc.zzm(str, ObjectWrapper.wrap(webView), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, "Google", zzbvkVar.toString(), zzbvjVar.toString(), str5);
                        } catch (RemoteException | NullPointerException e) {
                            zzccn.zzl("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzg(String str, WebView webView, String str2, String str3, String str4, String str5, zzbvk zzbvkVar, zzbvj zzbvjVar, String str6) {
        synchronized (zzd) {
            try {
                try {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdo)).booleanValue()) {
                            return zze(str, webView, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, str5);
                        }
                        try {
                            return this.zzc.zzl(str, ObjectWrapper.wrap(webView), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str4, str5, zzbvkVar.toString(), zzbvjVar.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            zzccn.zzl("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(IObjectWrapper iObjectWrapper) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                try {
                    this.zzc.zzf(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(IObjectWrapper iObjectWrapper) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                try {
                    this.zzc.zzi(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(IObjectWrapper iObjectWrapper, View view) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                try {
                    this.zzc.zzg(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(IObjectWrapper iObjectWrapper, View view) {
        synchronized (zzd) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdk)).booleanValue() && zza) {
                try {
                    this.zzc.zzj(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
