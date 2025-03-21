package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.CharCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzags {
    private static final ArrayList<zzagq> zza = new ArrayList<>();
    private static final Pattern zzb = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzi(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzi(str));
    }

    public static String zzd(String str) {
        zzagr zzh;
        String zzu = zzaht.zzu(str.trim());
        if (zzu.startsWith("avc1") || zzu.startsWith("avc3")) {
            return "video/avc";
        }
        if (zzu.startsWith("hev1") || zzu.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (zzu.startsWith("dvav") || zzu.startsWith("dva1") || zzu.startsWith("dvhe") || zzu.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (zzu.startsWith("av01")) {
            return "video/av01";
        }
        if (zzu.startsWith("vp9") || zzu.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (zzu.startsWith("vp8") || zzu.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String str2 = null;
        if (zzu.startsWith("mp4a")) {
            if (zzu.startsWith("mp4a.") && (zzh = zzh(zzu)) != null) {
                str2 = zze(zzh.zza);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (zzu.startsWith("ac-3") || zzu.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (zzu.startsWith("ec-3") || zzu.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (zzu.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (zzu.startsWith("ac-4") || zzu.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (zzu.startsWith("dtsc") || zzu.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (zzu.startsWith("dtsh") || zzu.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (zzu.startsWith("opus")) {
                return "audio/opus";
            }
            if (zzu.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (zzu.startsWith("flac")) {
                return "audio/flac";
            }
            if (zzu.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (zzu.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (zzu.contains("cea708")) {
                return "application/cea-708";
            }
            if (zzu.contains("eia608") || zzu.contains("cea608")) {
                return "application/cea-608";
            }
            int size = zza.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zzagq zzagqVar = zza.get(i);
                String str3 = zzagqVar.zzb;
                if (zzu.startsWith(null)) {
                    String str4 = zzagqVar.zza;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    public static String zze(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzi(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zza.size();
        for (int i = 0; i < size; i++) {
            zzagq zzagqVar = zza.get(i);
            String str2 = zzagqVar.zza;
            if (str.equals(null)) {
                int i2 = zzagqVar.zzc;
                return 0;
            }
        }
        return -1;
    }

    public static String zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 2;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    static zzagr zzh(String str) {
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            try {
                return new zzagr(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    private static String zzi(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzc(String str, String str2) {
        char c;
        zzagr zzh;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (zzh = zzh(str2)) == null) {
                    return false;
                }
                int i = zzh.zzb;
                int i2 = zzlu.zza;
                char c2 = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : CharCompanionObject.MIN_VALUE : (char) 16 : '\f' : (char) 11 : '\n';
                return (c2 == 0 || c2 == 16) ? false : true;
            default:
                return false;
        }
    }
}
