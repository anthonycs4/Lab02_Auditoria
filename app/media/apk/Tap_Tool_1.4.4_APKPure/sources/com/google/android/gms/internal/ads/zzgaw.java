package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgaw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzfxj zzfxjVar) {
        StringBuilder sb = new StringBuilder(zzfxjVar.zzc());
        for (int i = 0; i < zzfxjVar.zzc(); i++) {
            byte zza = zzfxjVar.zza(i);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza == 92) {
                        sb.append("\\\\");
                    } else {
                        switch (zza) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (zza < 32 || zza > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((zza >>> 6) & 3) + 48));
                                    sb.append((char) (((zza >>> 3) & 7) + 48));
                                    sb.append((char) ((zza & 7) + 48));
                                    break;
                                } else {
                                    sb.append((char) zza);
                                    continue;
                                }
                                break;
                        }
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
