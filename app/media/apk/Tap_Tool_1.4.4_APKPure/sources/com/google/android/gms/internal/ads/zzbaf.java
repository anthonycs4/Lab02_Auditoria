package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbaf {
    private final AdSize[] zza;
    private final String zzb;

    public zzbaf(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.zza = zzc(string);
        } else if (z || !z2) {
            if (!z) {
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            } else {
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
        } else {
            this.zza = zzc(string2);
        }
        String string3 = obtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.zzb = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static AdSize[] zzc(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    adSizeArr[i] = new AdSize("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.FULL_BANNER;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i] = AdSize.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i] = AdSize.FLUID;
            } else if (!"ICON".equals(trim)) {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            } else {
                adSizeArr[i] = AdSize.zza;
            }
        }
        if (length == 0) {
            String valueOf3 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return adSizeArr;
    }

    public final AdSize[] zza(boolean z) {
        if (z || this.zza.length == 1) {
            return this.zza;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String zzb() {
        return this.zzb;
    }
}
