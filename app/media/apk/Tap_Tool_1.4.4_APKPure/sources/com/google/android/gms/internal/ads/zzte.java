package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.core.view.ViewCompat;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzte {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzxt zza(zzahd zzahdVar) {
        String str;
        int zzg = zzahdVar.zzg() + zzahdVar.zzv();
        int zzv = zzahdVar.zzv();
        int i = (zzv >> 24) & 255;
        zzxt zzxtVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzv & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzv2 = zzahdVar.zzv();
                    if (zzahdVar.zzv() == 1684108385) {
                        zzahdVar.zzk(8);
                        String zzF = zzahdVar.zzF(zzv2 - 16);
                        zzxtVar = new zzyo("und", zzF, zzF);
                    } else {
                        String valueOf = String.valueOf(zzsq.zzf(zzv));
                        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzxtVar;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return zzb(zzv, "TIT2", zzahdVar);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return zzb(zzv, "TCOM", zzahdVar);
                    }
                    if (i2 == 6578553) {
                        return zzb(zzv, "TDRC", zzahdVar);
                    }
                    if (i2 == 4280916) {
                        return zzb(zzv, "TPE1", zzahdVar);
                    }
                    if (i2 == 7630703) {
                        return zzb(zzv, "TSSE", zzahdVar);
                    }
                    if (i2 == 6384738) {
                        return zzb(zzv, "TALB", zzahdVar);
                    }
                    if (i2 == 7108978) {
                        return zzb(zzv, "USLT", zzahdVar);
                    }
                    if (i2 == 6776174) {
                        return zzb(zzv, "TCON", zzahdVar);
                    }
                    if (i2 == 6779504) {
                        return zzb(zzv, "TIT1", zzahdVar);
                    }
                }
            } else if (zzv == 1735291493) {
                int zze = zze(zzahdVar);
                String str2 = (zze <= 0 || zze > 192) ? null : zza[zze - 1];
                if (str2 != null) {
                    zzxtVar = new zzzd("TCON", null, str2);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzxtVar;
            } else if (zzv == 1684632427) {
                return zzd(1684632427, "TPOS", zzahdVar);
            } else {
                if (zzv == 1953655662) {
                    return zzd(1953655662, "TRCK", zzahdVar);
                }
                if (zzv == 1953329263) {
                    return zzc(1953329263, "TBPM", zzahdVar, true, false);
                }
                if (zzv == 1668311404) {
                    return zzc(1668311404, "TCMP", zzahdVar, true, true);
                }
                if (zzv == 1668249202) {
                    int zzv3 = zzahdVar.zzv();
                    if (zzahdVar.zzv() == 1684108385) {
                        int zzv4 = zzahdVar.zzv() & ViewCompat.MEASURED_SIZE_MASK;
                        if (zzv4 == 13) {
                            str = "image/jpeg";
                        } else if (zzv4 == 14) {
                            str = "image/png";
                            zzv4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(zzv4);
                            Log.w("MetadataUtil", sb.toString());
                        } else {
                            zzahdVar.zzk(4);
                            int i3 = zzv3 - 16;
                            byte[] bArr = new byte[i3];
                            zzahdVar.zzm(bArr, 0, i3);
                            zzxtVar = new zzyg(str, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzxtVar;
                } else if (zzv == 1631670868) {
                    return zzb(1631670868, "TPE2", zzahdVar);
                } else {
                    if (zzv == 1936682605) {
                        return zzb(1936682605, "TSOT", zzahdVar);
                    }
                    if (zzv == 1936679276) {
                        return zzb(1936679276, "TSO2", zzahdVar);
                    }
                    if (zzv == 1936679282) {
                        return zzb(1936679282, "TSOA", zzahdVar);
                    }
                    if (zzv == 1936679265) {
                        return zzb(1936679265, "TSOP", zzahdVar);
                    }
                    if (zzv == 1936679791) {
                        return zzb(1936679791, "TSOC", zzahdVar);
                    }
                    if (zzv == 1920233063) {
                        return zzc(1920233063, "ITUNESADVISORY", zzahdVar, false, false);
                    }
                    if (zzv == 1885823344) {
                        return zzc(1885823344, "ITUNESGAPLESS", zzahdVar, false, true);
                    }
                    if (zzv == 1936683886) {
                        return zzb(1936683886, "TVSHOWSORT", zzahdVar);
                    }
                    if (zzv == 1953919848) {
                        return zzb(1953919848, "TVSHOW", zzahdVar);
                    }
                    if (zzv == 757935405) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzahdVar.zzg() < zzg) {
                            int zzg2 = zzahdVar.zzg();
                            int zzv5 = zzahdVar.zzv();
                            int zzv6 = zzahdVar.zzv();
                            zzahdVar.zzk(4);
                            if (zzv6 == 1835360622) {
                                str3 = zzahdVar.zzF(zzv5 - 12);
                            } else if (zzv6 == 1851878757) {
                                str4 = zzahdVar.zzF(zzv5 - 12);
                            } else {
                                if (zzv6 == 1684108385) {
                                    i5 = zzv5;
                                }
                                if (zzv6 == 1684108385) {
                                    i4 = zzg2;
                                }
                                zzahdVar.zzk(zzv5 - 12);
                            }
                        }
                        if (str3 != null && str4 != null && i4 != -1) {
                            zzahdVar.zzh(i4);
                            zzahdVar.zzk(16);
                            zzxtVar = new zzyx(str3, str4, zzahdVar.zzF(i5 - 16));
                        }
                        return zzxtVar;
                    }
                }
            }
            String valueOf2 = String.valueOf(zzsq.zzf(zzv));
            Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            zzahdVar.zzh(zzg);
        }
    }

    private static zzzd zzb(int i, String str, zzahd zzahdVar) {
        int zzv = zzahdVar.zzv();
        if (zzahdVar.zzv() == 1684108385) {
            zzahdVar.zzk(8);
            return new zzzd(str, null, zzahdVar.zzF(zzv - 16));
        }
        String valueOf = String.valueOf(zzsq.zzf(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzyv zzc(int i, String str, zzahd zzahdVar, boolean z, boolean z2) {
        int zze = zze(zzahdVar);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze >= 0) {
            if (z) {
                return new zzzd(str, null, Integer.toString(zze));
            }
            return new zzyo("und", str, Integer.toString(zze));
        }
        String valueOf = String.valueOf(zzsq.zzf(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzzd zzd(int i, String str, zzahd zzahdVar) {
        int zzv = zzahdVar.zzv();
        if (zzahdVar.zzv() == 1684108385 && zzv >= 22) {
            zzahdVar.zzk(10);
            int zzo = zzahdVar.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzahdVar.zzo();
                if (zzo2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(zzo2);
                    sb2 = sb3.toString();
                }
                return new zzzd(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzsq.zzf(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzahd zzahdVar) {
        zzahdVar.zzk(4);
        if (zzahdVar.zzv() == 1684108385) {
            zzahdVar.zzk(8);
            return zzahdVar.zzn();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
