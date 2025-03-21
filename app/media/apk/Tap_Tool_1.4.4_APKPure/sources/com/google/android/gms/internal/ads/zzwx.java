package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    private final boolean zzg;

    public static zzwx zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new zzwx(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities != null && zzaht.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback") && (zzaht.zza > 22 || !(("ODROID-XU3".equals(zzaht.zzd) || "Nexus 10".equals(zzaht.zzd)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)))), codecCapabilities != null && zzaht.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && zzaht.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzaht.zze;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzj = zzj(videoCapabilities, i, i2);
        int i3 = zzj.x;
        int i4 = zzj.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzaht.zzx(i, widthAlignment) * widthAlignment, zzaht.zzx(i2, heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    public final boolean zzc(zzjq zzjqVar) throws zzxi {
        String zzd;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = zzjqVar.zzi;
        int i = 16;
        if (str != null && (zzd = zzags.zzd(str)) != null) {
            if (!this.zzb.equals(zzd)) {
                String str2 = zzjqVar.zzi;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + zzd.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(zzd);
                zzh(sb.toString());
            } else {
                Pair<Integer, Integer> zzf = zzxn.zzf(zzjqVar);
                if (zzf != null) {
                    int intValue = ((Integer) zzf.first).intValue();
                    int intValue2 = ((Integer) zzf.second).intValue();
                    if (!this.zzg) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] zzb = zzb();
                    if (zzaht.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzb.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        int i2 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i2;
                        zzb = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzb) {
                        if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        }
                    }
                    String str3 = zzjqVar.zzi;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + zzd.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(zzd);
                    zzh(sb2.toString());
                }
            }
            return false;
        }
        if (this.zzg) {
            if (zzjqVar.zzq <= 0 || zzjqVar.zzr <= 0) {
                return true;
            }
            if (zzaht.zza >= 21) {
                return zzf(zzjqVar.zzq, zzjqVar.zzr, zzjqVar.zzs);
            }
            boolean z = zzjqVar.zzq * zzjqVar.zzr <= zzxn.zze();
            if (!z) {
                int i3 = zzjqVar.zzq;
                int i4 = zzjqVar.zzr;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("legacyFrameSize, ");
                sb3.append(i3);
                sb3.append("x");
                sb3.append(i4);
                zzh(sb3.toString());
            }
            return z;
        }
        if (zzaht.zza >= 21) {
            int i5 = zzjqVar.zzz;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzh("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzh("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i5)) {
                    StringBuilder sb4 = new StringBuilder(31);
                    sb4.append("sampleRate.support, ");
                    sb4.append(i5);
                    zzh(sb4.toString());
                    return false;
                }
            }
            int i6 = zzjqVar.zzy;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    zzh("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzh("channelCount.aCaps");
                    } else {
                        String str4 = this.zza;
                        String str5 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((zzaht.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            if ("audio/ac3".equals(str5)) {
                                i = 6;
                            } else if (!"audio/eac3".equals(str5)) {
                                i = 30;
                            }
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 59);
                            sb5.append("AssumedMaxChannelAdjustment: ");
                            sb5.append(str4);
                            sb5.append(", [");
                            sb5.append(maxInputChannelCount);
                            sb5.append(" to ");
                            sb5.append(i);
                            sb5.append("]");
                            Log.w("MediaCodecInfo", sb5.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i6) {
                            StringBuilder sb6 = new StringBuilder(33);
                            sb6.append("channelCount.support, ");
                            sb6.append(i6);
                            zzh(sb6.toString());
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzjq zzjqVar) {
        if (this.zzg) {
            return this.zze;
        }
        Pair<Integer, Integer> zzf = zzxn.zzf(zzjqVar);
        return zzf != null && ((Integer) zzf.first).intValue() == 42;
    }

    public final zzom zze(zzjq zzjqVar, zzjq zzjqVar2) {
        int i = true != zzaht.zzc(zzjqVar.zzl, zzjqVar2.zzl) ? 8 : 0;
        if (this.zzg) {
            if (zzjqVar.zzt != zzjqVar2.zzt) {
                i |= 1024;
            }
            if (!this.zze && (zzjqVar.zzq != zzjqVar2.zzq || zzjqVar.zzr != zzjqVar2.zzr)) {
                i |= 512;
            }
            if (!zzaht.zzc(zzjqVar.zzx, zzjqVar2.zzx)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzaht.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzjqVar.zzd(zzjqVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzom(this.zza, zzjqVar, zzjqVar2, true != zzjqVar.zzd(zzjqVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzjqVar.zzy != zzjqVar2.zzy) {
                i |= 4096;
            }
            if (zzjqVar.zzz != zzjqVar2.zzz) {
                i |= 8192;
            }
            if (zzjqVar.zzA != zzjqVar2.zzA) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair<Integer, Integer> zzf = zzxn.zzf(zzjqVar);
                Pair<Integer, Integer> zzf2 = zzxn.zzf(zzjqVar2);
                if (zzf != null && zzf2 != null) {
                    int intValue = ((Integer) zzf.first).intValue();
                    int intValue2 = ((Integer) zzf2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzom(this.zza, zzjqVar, zzjqVar2, 3, 0);
                    }
                }
            }
            if (!zzjqVar.zzd(zzjqVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzom(this.zza, zzjqVar, zzjqVar2, 1, 0);
            }
        }
        return new zzom(this.zza, zzjqVar, zzjqVar2, 0, i);
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzaht.zzb)) && zzi(videoCapabilities, i2, i, d))) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.rotated, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                String sb2 = sb.toString();
                String str = this.zza;
                String str2 = this.zzb;
                String str3 = zzaht.zze;
                int length = String.valueOf(sb2).length();
                int length2 = String.valueOf(str).length();
                StringBuilder sb3 = new StringBuilder(length + 25 + length2 + str2.length() + String.valueOf(str3).length());
                sb3.append("AssumedSupport [");
                sb3.append(sb2);
                sb3.append("] [");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(str2);
                sb3.append("] [");
                sb3.append(str3);
                sb3.append("]");
                Log.d("MediaCodecInfo", sb3.toString());
                return true;
            }
            StringBuilder sb4 = new StringBuilder(69);
            sb4.append("sizeAndRate.support, ");
            sb4.append(i);
            sb4.append("x");
            sb4.append(i2);
            sb4.append("x");
            sb4.append(d);
            zzh(sb4.toString());
            return false;
        }
    }

    public final Point zzg(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i, i2);
    }

    zzwx(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zze = z4;
        this.zzf = z6;
        this.zzg = zzags.zzb(str2);
    }
}
