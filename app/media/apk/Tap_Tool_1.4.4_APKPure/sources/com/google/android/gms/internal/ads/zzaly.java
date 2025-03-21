package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaly {
    public static final zzaoe zza = new zzalx();
    private static final Pattern zzd = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzb = -1;
    public int zzc = -1;

    public final boolean zza(zzanz zzanzVar) {
        for (int i = 0; i < zzanzVar.zza(); i++) {
            zzany zzb = zzanzVar.zzb(i);
            if (zzb instanceof zzaod) {
                zzaod zzaodVar = (zzaod) zzb;
                String str = zzaodVar.zzb;
                String str2 = zzaodVar.zzc;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = zzd.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.zzb = parseInt;
                                this.zzc = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zzb == -1 || this.zzc == -1) ? false : true;
    }
}
