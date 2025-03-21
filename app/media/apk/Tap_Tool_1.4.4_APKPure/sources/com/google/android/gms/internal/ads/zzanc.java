package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzanc {
    private static final int zza = zzarj.zzl("nam");
    private static final int zzb = zzarj.zzl("trk");
    private static final int zzc = zzarj.zzl("cmt");
    private static final int zzd = zzarj.zzl("day");
    private static final int zze = zzarj.zzl("ART");
    private static final int zzf = zzarj.zzl("too");
    private static final int zzg = zzarj.zzl("alb");
    private static final int zzh = zzarj.zzl("com");
    private static final int zzi = zzarj.zzl("wrt");
    private static final int zzj = zzarj.zzl("lyr");
    private static final int zzk = zzarj.zzl("gen");
    private static final int zzl = zzarj.zzl("covr");
    private static final int zzm = zzarj.zzl("gnre");
    private static final int zzn = zzarj.zzl("grp");
    private static final int zzo = zzarj.zzl("disk");
    private static final int zzp = zzarj.zzl("trkn");
    private static final int zzq = zzarj.zzl("tmpo");
    private static final int zzr = zzarj.zzl("cpil");
    private static final int zzs = zzarj.zzl("aART");
    private static final int zzt = zzarj.zzl("sonm");
    private static final int zzu = zzarj.zzl("soal");
    private static final int zzv = zzarj.zzl("soar");
    private static final int zzw = zzarj.zzl("soaa");
    private static final int zzx = zzarj.zzl("soco");
    private static final int zzy = zzarj.zzl("rtng");
    private static final int zzz = zzarj.zzl("pgap");
    private static final int zzA = zzarj.zzl("sosn");
    private static final int zzB = zzarj.zzl("tvsh");
    private static final int zzC = zzarj.zzl("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0035, B:14:0x003c, B:17:0x0045, B:19:0x0049, B:22:0x0053, B:24:0x0057, B:27:0x0061, B:29:0x0067, B:32:0x0071, B:34:0x0075, B:37:0x007f, B:39:0x0084, B:41:0x0090, B:48:0x00ab, B:49:0x00c2, B:50:0x00d4, B:53:0x00dd, B:55:0x00e1, B:58:0x00eb, B:60:0x00ef, B:63:0x00f9, B:65:0x00fd, B:68:0x0107, B:70:0x010b, B:73:0x0115, B:75:0x0119, B:78:0x0123, B:80:0x0127, B:83:0x0131, B:85:0x0135, B:88:0x013f, B:90:0x0143, B:93:0x014d, B:95:0x0151, B:98:0x015b, B:100:0x015f, B:103:0x0169, B:106:0x0171, B:108:0x0177, B:110:0x018a, B:111:0x0191, B:113:0x0195, B:114:0x019c, B:120:0x01a5, B:121:0x01ab, B:123:0x01b3, B:127:0x01be, B:190:0x0292, B:192:0x02a2, B:194:0x02ac, B:193:0x02a7, B:133:0x01dc, B:135:0x01e0, B:137:0x01ec, B:138:0x01fd, B:140:0x020d, B:142:0x0217, B:141:0x0212, B:145:0x021e, B:147:0x0222, B:150:0x0228, B:152:0x022c, B:155:0x0232, B:157:0x0236, B:160:0x0240, B:162:0x0244, B:165:0x024e, B:167:0x0252, B:170:0x025c, B:172:0x0260, B:175:0x026a, B:177:0x026e, B:180:0x0278, B:182:0x027c, B:185:0x0284, B:187:0x0288, B:197:0x02b3, B:200:0x02bd), top: B:205:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #0 {all -> 0x01d5, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0035, B:14:0x003c, B:17:0x0045, B:19:0x0049, B:22:0x0053, B:24:0x0057, B:27:0x0061, B:29:0x0067, B:32:0x0071, B:34:0x0075, B:37:0x007f, B:39:0x0084, B:41:0x0090, B:48:0x00ab, B:49:0x00c2, B:50:0x00d4, B:53:0x00dd, B:55:0x00e1, B:58:0x00eb, B:60:0x00ef, B:63:0x00f9, B:65:0x00fd, B:68:0x0107, B:70:0x010b, B:73:0x0115, B:75:0x0119, B:78:0x0123, B:80:0x0127, B:83:0x0131, B:85:0x0135, B:88:0x013f, B:90:0x0143, B:93:0x014d, B:95:0x0151, B:98:0x015b, B:100:0x015f, B:103:0x0169, B:106:0x0171, B:108:0x0177, B:110:0x018a, B:111:0x0191, B:113:0x0195, B:114:0x019c, B:120:0x01a5, B:121:0x01ab, B:123:0x01b3, B:127:0x01be, B:190:0x0292, B:192:0x02a2, B:194:0x02ac, B:193:0x02a7, B:133:0x01dc, B:135:0x01e0, B:137:0x01ec, B:138:0x01fd, B:140:0x020d, B:142:0x0217, B:141:0x0212, B:145:0x021e, B:147:0x0222, B:150:0x0228, B:152:0x022c, B:155:0x0232, B:157:0x0236, B:160:0x0240, B:162:0x0244, B:165:0x024e, B:167:0x0252, B:170:0x025c, B:172:0x0260, B:175:0x026a, B:177:0x026e, B:180:0x0278, B:182:0x027c, B:185:0x0284, B:187:0x0288, B:197:0x02b3, B:200:0x02bd), top: B:205:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzany zza(com.google.android.gms.internal.ads.zzarc r13) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanc.zza(com.google.android.gms.internal.ads.zzarc):com.google.android.gms.internal.ads.zzany");
    }

    private static zzaoh zzb(int i, String str, zzarc zzarcVar) {
        int zzr2 = zzarcVar.zzr();
        if (zzarcVar.zzr() == zzamp.zzaH) {
            zzarcVar.zzj(8);
            return new zzaoh(str, null, zzarcVar.zzw(zzr2 - 16));
        }
        String valueOf = String.valueOf(zzamp.zzg(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzaof zzc(int i, String str, zzarc zzarcVar, boolean z, boolean z2) {
        int zze2 = zze(zzarcVar);
        if (z2) {
            zze2 = Math.min(1, zze2);
        }
        if (zze2 >= 0) {
            if (z) {
                return new zzaoh(str, null, Integer.toString(zze2));
            }
            return new zzaod("und", str, Integer.toString(zze2));
        }
        String valueOf = String.valueOf(zzamp.zzg(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzaoh zzd(int i, String str, zzarc zzarcVar) {
        int zzr2 = zzarcVar.zzr();
        if (zzarcVar.zzr() == zzamp.zzaH && zzr2 >= 22) {
            zzarcVar.zzj(10);
            int zzm2 = zzarcVar.zzm();
            if (zzm2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(zzm2);
                String sb2 = sb.toString();
                int zzm3 = zzarcVar.zzm();
                if (zzm3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(zzm3);
                    sb2 = sb3.toString();
                }
                return new zzaoh(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzamp.zzg(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzarc zzarcVar) {
        zzarcVar.zzj(4);
        if (zzarcVar.zzr() == zzamp.zzaH) {
            zzarcVar.zzj(8);
            return zzarcVar.zzl();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
