package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfb {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzex zzd;

    public zzfb(zzex zzexVar) {
        this.zzd = zzexVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzfc {
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new zzfc("Parameter already exists: dc_ms");
                }
            } catch (UnsupportedOperationException unused) {
                throw new zzfc("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzfc("Query parameter already exists: ms");
    }

    public final boolean zza(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final zzex zzb() {
        return this.zzd;
    }

    public final Uri zzc(Uri uri, Context context) throws zzfc {
        return zzg(uri, this.zzd.zzj(context));
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzd(motionEvent);
    }

    public final Uri zze(Uri uri, Context context, View view, Activity activity) throws zzfc {
        try {
            return zzg(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzfc("Provided Uri is not in a valid state");
        }
    }

    public final boolean zzf(Uri uri) {
        if (zza(uri)) {
            String[] strArr = zzc;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
