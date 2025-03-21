package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahy {
    public final String zza;

    private zzahy(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzahy zza(zzahd zzahdVar) {
        String str;
        zzahdVar.zzk(2);
        int zzn = zzahdVar.zzn();
        int i = zzn >> 1;
        int zzn2 = (zzahdVar.zzn() >> 3) | ((zzn & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzn2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(zzn2);
        return new zzahy(i, zzn2, sb.toString());
    }
}
