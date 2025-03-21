package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqg {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = zzaht.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza(zzxu zzxuVar) {
        for (int i = 0; i < zzxuVar.zza(); i++) {
            zzxt zzb = zzxuVar.zzb(i);
            if (zzb instanceof zzyo) {
                zzyo zzyoVar = (zzyo) zzb;
                if ("iTunSMPB".equals(zzyoVar.zzb) && zzc(zzyoVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzyx) {
                zzyx zzyxVar = (zzyx) zzb;
                if ("com.apple.iTunes".equals(zzyxVar.zza) && "iTunSMPB".equals(zzyxVar.zzb) && zzc(zzyxVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
