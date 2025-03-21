package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzanw {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map<String, Integer> zzf;
    private static final zzanl zza = zzanl.zza("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zzanr, List<zzanl>> zzc = new HashMap<>();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static zzanl zza(String str, boolean z) throws zzans {
        List<zzanl> zzb2 = zzb(str, z);
        if (zzb2.isEmpty()) {
            return null;
        }
        return zzb2.get(0);
    }

    public static synchronized List<zzanl> zzb(String str, boolean z) throws zzans {
        zzant zzanuVar;
        synchronized (zzanw.class) {
            zzanr zzanrVar = new zzanr(str, z);
            HashMap<zzanr, List<zzanl>> hashMap = zzc;
            List<zzanl> list = hashMap.get(zzanrVar);
            if (list != null) {
                return list;
            }
            if (zzarj.zza >= 21) {
                zzanuVar = new zzanv(z);
            } else {
                zzanuVar = new zzanu(null);
            }
            List<zzanl> zze2 = zze(zzanrVar, zzanuVar);
            if (z && zze2.isEmpty() && zzarj.zza >= 21 && zzarj.zza <= 23) {
                zze2 = zze(zzanrVar, new zzanu(null));
                if (!zze2.isEmpty()) {
                    String str2 = zze2.get(0).zza;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzanl> unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzanrVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzc() throws zzans {
        if (zzg == -1) {
            int i = 0;
            zzanl zza2 = zza("video/avc", false);
            if (zza2 != null) {
                MediaCodecInfo.CodecProfileLevel[] zzc2 = zza2.zzc();
                int length = zzc2.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = zzc2[i].level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, zzarj.zza >= 21 ? 345600 : 172800);
            }
            zzg = i;
        }
        return zzg;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> zzd(String str) {
        char c;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2 || c == 3) {
                int length = split.length;
                if (length < 2) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                    } else if (length >= 3) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                    } else {
                        Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
                } catch (NumberFormatException unused) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
            }
            return null;
        } else if (split.length < 4) {
            Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        } else {
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i = 1;
            } else if (!"2".equals(group)) {
                String valueOf3 = String.valueOf(group);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            Integer num = zzf.get(split[3]);
            if (num == null) {
                String valueOf4 = String.valueOf(matcher.group(1));
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
                return null;
            }
            return new Pair<>(Integer.valueOf(i), num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0 A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:106:0x01c5, B:108:0x01cf, B:110:0x01d9, B:112:0x01e1, B:119:0x01f0, B:124:0x01f9), top: B:155:0x01c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzanl> zze(com.google.android.gms.internal.ads.zzanr r18, com.google.android.gms.internal.ads.zzant r19) throws com.google.android.gms.internal.ads.zzans {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zze(com.google.android.gms.internal.ads.zzanr, com.google.android.gms.internal.ads.zzant):java.util.List");
    }
}
