package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaen implements zzadx, zzafp {
    public static final zzfhb<String, Integer> zza;
    public static final zzfgz<Long> zzb;
    public static final zzfgz<Long> zzc;
    public static final zzfgz<Long> zzd;
    public static final zzfgz<Long> zze;
    public static final zzfgz<Long> zzf;
    public static final zzfgz<Long> zzg;
    private static zzaen zzh;
    private final zzfhd<Integer, Long> zzi;
    private final zzadw zzj;
    private final zzahj zzk;
    private final zzaft zzl;
    private final boolean zzm;
    private int zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;

    static {
        zzfha zzfhaVar = new zzfha();
        zzfhaVar.zza("AD", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("AE", 1, 4, 4, 4, 2, 2);
        zzfhaVar.zza("AF", 4, 4, 3, 4, 2, 2);
        zzfhaVar.zza("AG", 4, 2, 1, 4, 2, 2);
        zzfhaVar.zza("AI", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("AL", 1, 1, 1, 1, 2, 2);
        zzfhaVar.zza("AM", 2, 2, 1, 3, 2, 2);
        zzfhaVar.zza("AO", 3, 4, 3, 1, 2, 2);
        zzfhaVar.zza("AR", 2, 4, 2, 1, 2, 2);
        zzfhaVar.zza("AS", 2, 2, 3, 3, 2, 2);
        zzfhaVar.zza("AT", 0, 1, 0, 0, 0, 2);
        zzfhaVar.zza("AU", 0, 2, 0, 1, 1, 2);
        zzfhaVar.zza("AW", 1, 2, 0, 4, 2, 2);
        zzfhaVar.zza("AX", 0, 2, 2, 2, 2, 2);
        zzfhaVar.zza("AZ", 3, 3, 3, 4, 4, 2);
        zzfhaVar.zza("BA", 1, 1, 0, 1, 2, 2);
        zzfhaVar.zza("BB", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("BD", 2, 0, 3, 3, 2, 2);
        zzfhaVar.zza("BE", 0, 0, 2, 3, 2, 2);
        zzfhaVar.zza("BF", 4, 4, 4, 2, 2, 2);
        zzfhaVar.zza("BG", 0, 1, 0, 0, 2, 2);
        zzfhaVar.zza("BH", 1, 0, 2, 4, 2, 2);
        zzfhaVar.zza("BI", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("BJ", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("BL", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("BM", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("BN", 3, 2, 1, 0, 2, 2);
        zzfhaVar.zza("BO", 1, 2, 4, 2, 2, 2);
        zzfhaVar.zza("BQ", 1, 2, 1, 2, 2, 2);
        zzfhaVar.zza("BR", 2, 4, 3, 2, 2, 2);
        zzfhaVar.zza("BS", 2, 2, 1, 3, 2, 2);
        zzfhaVar.zza("BT", 3, 0, 3, 2, 2, 2);
        zzfhaVar.zza("BW", 3, 4, 1, 1, 2, 2);
        zzfhaVar.zza("BY", 1, 1, 1, 2, 2, 2);
        zzfhaVar.zza("BZ", 2, 2, 2, 2, 2, 2);
        zzfhaVar.zza("CA", 0, 3, 1, 2, 4, 2);
        zzfhaVar.zza("CD", 4, 2, 2, 1, 2, 2);
        zzfhaVar.zza("CF", 4, 2, 3, 2, 2, 2);
        zzfhaVar.zza("CG", 3, 4, 2, 2, 2, 2);
        zzfhaVar.zza("CH", 0, 0, 0, 0, 1, 2);
        zzfhaVar.zza("CI", 3, 3, 3, 3, 2, 2);
        zzfhaVar.zza("CK", 2, 2, 3, 0, 2, 2);
        zzfhaVar.zza("CL", 1, 1, 2, 2, 2, 2);
        zzfhaVar.zza("CM", 3, 4, 3, 2, 2, 2);
        zzfhaVar.zza("CN", 2, 2, 2, 1, 3, 2);
        zzfhaVar.zza("CO", 2, 3, 4, 2, 2, 2);
        zzfhaVar.zza("CR", 2, 3, 4, 4, 2, 2);
        zzfhaVar.zza("CU", 4, 4, 2, 2, 2, 2);
        zzfhaVar.zza("CV", 2, 3, 1, 0, 2, 2);
        zzfhaVar.zza("CW", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("CY", 1, 1, 0, 0, 2, 2);
        zzfhaVar.zza("CZ", 0, 1, 0, 0, 1, 2);
        zzfhaVar.zza("DE", 0, 0, 1, 1, 0, 2);
        zzfhaVar.zza("DJ", 4, 0, 4, 4, 2, 2);
        zzfhaVar.zza("DK", 0, 0, 1, 0, 0, 2);
        zzfhaVar.zza("DM", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("DO", 3, 4, 4, 4, 2, 2);
        zzfhaVar.zza("DZ", 3, 3, 4, 4, 2, 4);
        zzfhaVar.zza("EC", 2, 4, 3, 1, 2, 2);
        zzfhaVar.zza("EE", 0, 1, 0, 0, 2, 2);
        zzfhaVar.zza("EG", 3, 4, 3, 3, 2, 2);
        zzfhaVar.zza("EH", 2, 2, 2, 2, 2, 2);
        zzfhaVar.zza("ER", 4, 2, 2, 2, 2, 2);
        zzfhaVar.zza("ES", 0, 1, 1, 1, 2, 2);
        zzfhaVar.zza("ET", 4, 4, 4, 1, 2, 2);
        zzfhaVar.zza("FI", 0, 0, 0, 0, 0, 2);
        zzfhaVar.zza("FJ", 3, 0, 2, 3, 2, 2);
        zzfhaVar.zza("FK", 4, 2, 2, 2, 2, 2);
        zzfhaVar.zza("FM", 3, 2, 4, 4, 2, 2);
        zzfhaVar.zza("FO", 1, 2, 0, 1, 2, 2);
        zzfhaVar.zza("FR", 1, 1, 2, 0, 1, 2);
        zzfhaVar.zza("GA", 3, 4, 1, 1, 2, 2);
        zzfhaVar.zza("GB", 0, 0, 1, 1, 1, 2);
        zzfhaVar.zza("GD", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("GE", 1, 1, 1, 2, 2, 2);
        zzfhaVar.zza("GF", 2, 2, 2, 3, 2, 2);
        zzfhaVar.zza("GG", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("GH", 3, 1, 3, 2, 2, 2);
        zzfhaVar.zza("GI", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("GL", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("GM", 4, 3, 2, 4, 2, 2);
        zzfhaVar.zza("GN", 4, 3, 4, 2, 2, 2);
        zzfhaVar.zza("GP", 2, 1, 2, 3, 2, 2);
        zzfhaVar.zza("GQ", 4, 2, 2, 4, 2, 2);
        zzfhaVar.zza("GR", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("GT", 3, 2, 3, 1, 2, 2);
        zzfhaVar.zza("GU", 1, 2, 3, 4, 2, 2);
        zzfhaVar.zza("GW", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("GY", 3, 3, 3, 4, 2, 2);
        zzfhaVar.zza("HK", 0, 1, 2, 3, 2, 0);
        zzfhaVar.zza("HN", 3, 1, 3, 3, 2, 2);
        zzfhaVar.zza("HR", 1, 1, 0, 0, 3, 2);
        zzfhaVar.zza("HT", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("HU", 0, 0, 0, 0, 0, 2);
        zzfhaVar.zza("ID", 3, 2, 3, 3, 2, 2);
        zzfhaVar.zza("IE", 0, 0, 1, 1, 3, 2);
        zzfhaVar.zza("IL", 1, 0, 2, 3, 4, 2);
        zzfhaVar.zza("IM", 0, 2, 0, 1, 2, 2);
        zzfhaVar.zza("IN", 2, 1, 3, 3, 2, 2);
        zzfhaVar.zza("IO", 4, 2, 2, 4, 2, 2);
        zzfhaVar.zza("IQ", 3, 3, 4, 4, 2, 2);
        zzfhaVar.zza("IR", 3, 2, 3, 2, 2, 2);
        zzfhaVar.zza("IS", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("IT", 0, 4, 0, 1, 2, 2);
        zzfhaVar.zza("JE", 2, 2, 1, 2, 2, 2);
        zzfhaVar.zza("JM", 3, 3, 4, 4, 2, 2);
        zzfhaVar.zza("JO", 2, 2, 1, 1, 2, 2);
        zzfhaVar.zza("JP", 0, 0, 0, 0, 2, 1);
        zzfhaVar.zza("KE", 3, 4, 2, 2, 2, 2);
        zzfhaVar.zza("KG", 2, 0, 1, 1, 2, 2);
        zzfhaVar.zza("KH", 1, 0, 4, 3, 2, 2);
        zzfhaVar.zza("KI", 4, 2, 4, 3, 2, 2);
        zzfhaVar.zza("KM", 4, 3, 2, 3, 2, 2);
        zzfhaVar.zza("KN", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("KP", 4, 2, 2, 2, 2, 2);
        zzfhaVar.zza("KR", 0, 0, 1, 3, 1, 2);
        zzfhaVar.zza("KW", 1, 3, 1, 1, 1, 2);
        zzfhaVar.zza("KY", 1, 2, 0, 2, 2, 2);
        zzfhaVar.zza("KZ", 2, 2, 2, 3, 2, 2);
        zzfhaVar.zza("LA", 1, 2, 1, 1, 2, 2);
        zzfhaVar.zza("LB", 3, 2, 0, 0, 2, 2);
        zzfhaVar.zza("LC", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("LI", 0, 2, 2, 2, 2, 2);
        zzfhaVar.zza("LK", 2, 0, 2, 3, 2, 2);
        zzfhaVar.zza("LR", 3, 4, 4, 3, 2, 2);
        zzfhaVar.zza("LS", 3, 3, 2, 3, 2, 2);
        zzfhaVar.zza("LT", 0, 0, 0, 0, 2, 2);
        zzfhaVar.zza("LU", 1, 0, 1, 1, 2, 2);
        zzfhaVar.zza("LV", 0, 0, 0, 0, 2, 2);
        zzfhaVar.zza("LY", 4, 2, 4, 3, 2, 2);
        zzfhaVar.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2, 2);
        zzfhaVar.zza("MC", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("MD", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("ME", 1, 2, 0, 1, 2, 2);
        zzfhaVar.zza("MF", 2, 2, 1, 1, 2, 2);
        zzfhaVar.zza("MG", 3, 4, 2, 2, 2, 2);
        zzfhaVar.zza("MH", 4, 2, 2, 4, 2, 2);
        zzfhaVar.zza("MK", 1, 1, 0, 0, 2, 2);
        zzfhaVar.zza("ML", 4, 4, 2, 2, 2, 2);
        zzfhaVar.zza("MM", 2, 3, 3, 3, 2, 2);
        zzfhaVar.zza("MN", 2, 4, 2, 2, 2, 2);
        zzfhaVar.zza("MO", 0, 2, 4, 4, 2, 2);
        zzfhaVar.zza("MP", 0, 2, 2, 2, 2, 2);
        zzfhaVar.zza("MQ", 2, 2, 2, 3, 2, 2);
        zzfhaVar.zza("MR", 3, 0, 4, 3, 2, 2);
        zzfhaVar.zza("MS", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("MT", 0, 2, 0, 0, 2, 2);
        zzfhaVar.zza("MU", 2, 1, 1, 2, 2, 2);
        zzfhaVar.zza("MV", 4, 3, 2, 4, 2, 2);
        zzfhaVar.zza("MW", 4, 2, 1, 0, 2, 2);
        zzfhaVar.zza("MX", 2, 4, 4, 4, 4, 2);
        zzfhaVar.zza("MY", 1, 0, 3, 2, 2, 2);
        zzfhaVar.zza("MZ", 3, 3, 2, 1, 2, 2);
        zzfhaVar.zza("NA", 4, 3, 3, 2, 2, 2);
        zzfhaVar.zza("NC", 3, 0, 4, 4, 2, 2);
        zzfhaVar.zza("NE", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("NF", 2, 2, 2, 2, 2, 2);
        zzfhaVar.zza("NG", 3, 3, 2, 3, 2, 2);
        zzfhaVar.zza("NI", 2, 1, 4, 4, 2, 2);
        zzfhaVar.zza("NL", 0, 2, 3, 2, 0, 2);
        zzfhaVar.zza("NO", 0, 1, 2, 0, 0, 2);
        zzfhaVar.zza("NP", 2, 0, 4, 2, 2, 2);
        zzfhaVar.zza("NR", 3, 2, 3, 1, 2, 2);
        zzfhaVar.zza("NU", 4, 2, 2, 2, 2, 2);
        zzfhaVar.zza("NZ", 0, 2, 1, 2, 4, 2);
        zzfhaVar.zza("OM", 2, 2, 1, 3, 3, 2);
        zzfhaVar.zza("PA", 1, 3, 3, 3, 2, 2);
        zzfhaVar.zza("PE", 2, 3, 4, 4, 2, 2);
        zzfhaVar.zza("PF", 2, 2, 2, 1, 2, 2);
        zzfhaVar.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2, 2);
        zzfhaVar.zza("PH", 2, 1, 3, 3, 3, 2);
        zzfhaVar.zza("PK", 3, 2, 3, 3, 2, 2);
        zzfhaVar.zza("PL", 1, 0, 1, 2, 3, 2);
        zzfhaVar.zza("PM", 0, 2, 2, 2, 2, 2);
        zzfhaVar.zza("PR", 2, 1, 2, 2, 4, 3);
        zzfhaVar.zza("PS", 3, 3, 2, 2, 2, 2);
        zzfhaVar.zza("PT", 0, 1, 1, 0, 2, 2);
        zzfhaVar.zza("PW", 1, 2, 4, 1, 2, 2);
        zzfhaVar.zza("PY", 2, 0, 3, 2, 2, 2);
        zzfhaVar.zza("QA", 2, 3, 1, 2, 3, 2);
        zzfhaVar.zza("RE", 1, 0, 2, 2, 2, 2);
        zzfhaVar.zza("RO", 0, 1, 0, 1, 0, 2);
        zzfhaVar.zza("RS", 1, 2, 0, 0, 2, 2);
        zzfhaVar.zza("RU", 0, 1, 0, 1, 4, 2);
        zzfhaVar.zza("RW", 3, 3, 3, 1, 2, 2);
        zzfhaVar.zza("SA", 2, 2, 2, 1, 1, 2);
        zzfhaVar.zza("SB", 4, 2, 3, 2, 2, 2);
        zzfhaVar.zza("SC", 4, 2, 1, 3, 2, 2);
        zzfhaVar.zza("SD", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("SE", 0, 0, 0, 0, 0, 2);
        zzfhaVar.zza("SG", 1, 0, 1, 2, 3, 2);
        zzfhaVar.zza("SH", 4, 2, 2, 2, 2, 2);
        zzfhaVar.zza("SI", 0, 0, 0, 0, 2, 2);
        zzfhaVar.zza("SJ", 2, 2, 2, 2, 2, 2);
        zzfhaVar.zza("SK", 0, 1, 0, 0, 2, 2);
        zzfhaVar.zza("SL", 4, 3, 4, 0, 2, 2);
        zzfhaVar.zza("SM", 0, 2, 2, 2, 2, 2);
        zzfhaVar.zza("SN", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("SO", 3, 3, 3, 4, 2, 2);
        zzfhaVar.zza("SR", 3, 2, 2, 2, 2, 2);
        zzfhaVar.zza("SS", 4, 4, 3, 3, 2, 2);
        zzfhaVar.zza("ST", 2, 2, 1, 2, 2, 2);
        zzfhaVar.zza("SV", 2, 1, 4, 3, 2, 2);
        zzfhaVar.zza("SX", 2, 2, 1, 0, 2, 2);
        zzfhaVar.zza("SY", 4, 3, 3, 2, 2, 2);
        zzfhaVar.zza("SZ", 3, 3, 2, 4, 2, 2);
        zzfhaVar.zza("TC", 2, 2, 2, 0, 2, 2);
        zzfhaVar.zza("TD", 4, 3, 4, 4, 2, 2);
        zzfhaVar.zza("TG", 3, 2, 2, 4, 2, 2);
        zzfhaVar.zza("TH", 0, 3, 2, 3, 2, 2);
        zzfhaVar.zza("TJ", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("TL", 4, 0, 4, 4, 2, 2);
        zzfhaVar.zza("TM", 4, 2, 4, 3, 2, 2);
        zzfhaVar.zza("TN", 2, 1, 1, 2, 2, 2);
        zzfhaVar.zza("TO", 3, 3, 4, 3, 2, 2);
        zzfhaVar.zza("TR", 1, 2, 1, 1, 2, 2);
        zzfhaVar.zza("TT", 1, 4, 0, 1, 2, 2);
        zzfhaVar.zza("TV", 3, 2, 2, 4, 2, 2);
        zzfhaVar.zza("TW", 0, 0, 0, 0, 1, 0);
        zzfhaVar.zza("TZ", 3, 3, 3, 2, 2, 2);
        zzfhaVar.zza("UA", 0, 3, 1, 1, 2, 2);
        zzfhaVar.zza("UG", 3, 2, 3, 3, 2, 2);
        zzfhaVar.zza("US", 1, 1, 2, 2, 4, 2);
        zzfhaVar.zza("UY", 2, 2, 1, 1, 2, 2);
        zzfhaVar.zza("UZ", 2, 1, 3, 4, 2, 2);
        zzfhaVar.zza("VC", 1, 2, 2, 2, 2, 2);
        zzfhaVar.zza("VE", 4, 4, 4, 4, 2, 2);
        zzfhaVar.zza("VG", 2, 2, 1, 1, 2, 2);
        zzfhaVar.zza("VI", 1, 2, 1, 2, 2, 2);
        zzfhaVar.zza("VN", 0, 1, 3, 4, 2, 2);
        zzfhaVar.zza("VU", 4, 0, 3, 1, 2, 2);
        zzfhaVar.zza("WF", 4, 2, 2, 4, 2, 2);
        zzfhaVar.zza("WS", 3, 1, 3, 1, 2, 2);
        zzfhaVar.zza("XK", 0, 1, 1, 0, 2, 2);
        zzfhaVar.zza("YE", 4, 4, 4, 3, 2, 2);
        zzfhaVar.zza("YT", 4, 2, 2, 3, 2, 2);
        zzfhaVar.zza("ZA", 3, 3, 2, 1, 2, 2);
        zzfhaVar.zza("ZM", 3, 2, 3, 3, 2, 2);
        zzfhaVar.zza("ZW", 3, 2, 4, 3, 2, 2);
        zza = zzfhaVar.zzb();
        zzb = zzfgz.zzm(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        zzc = zzfgz.zzm(248000L, 160000L, 142000L, 127000L, 113000L);
        zzd = zzfgz.zzm(2200000L, 1300000L, 950000L, 760000L, 520000L);
        zze = zzfgz.zzm(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        zzf = zzfgz.zzm(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        zzg = zzfgz.zzm(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    }

    @Deprecated
    public zzaen() {
        zzfhd.zza();
        zzaft zzaftVar = zzaft.zza;
        throw null;
    }

    public static synchronized zzaen zza(Context context) {
        zzaen zzaenVar;
        synchronized (zzaen.class) {
            if (zzh == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                zzfgz<Integer> zza2 = zza.zza(zzaht.zzU(context));
                if (zza2.isEmpty()) {
                    zza2 = zzfgz.zzn(2, 2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zzfgz<Long> zzfgzVar = zzb;
                hashMap.put(2, zzfgzVar.get(zza2.get(0).intValue()));
                hashMap.put(3, zzc.get(zza2.get(1).intValue()));
                hashMap.put(4, zzd.get(zza2.get(2).intValue()));
                hashMap.put(5, zze.get(zza2.get(3).intValue()));
                hashMap.put(10, zzf.get(zza2.get(4).intValue()));
                hashMap.put(9, zzg.get(zza2.get(5).intValue()));
                hashMap.put(7, zzfgzVar.get(zza2.get(0).intValue()));
                zzh = new zzaen(applicationContext, hashMap, 2000, zzaft.zza, true, null);
            }
            zzaenVar = zzh;
        }
        return zzaenVar;
    }

    private final void zzh(int i, long j, long j2) {
        int i2;
        if (i != 0) {
            i2 = i;
        } else if (j == 0 && j2 == this.zzu) {
            return;
        } else {
            i2 = 0;
        }
        this.zzu = j2;
        this.zzj.zza(i2, j, j2);
    }

    private final long zzi(int i) {
        Long l = this.zzi.get(Integer.valueOf(i));
        if (l == null) {
            l = this.zzi.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean zzj(zzaej zzaejVar, boolean z) {
        return z && !zzaejVar.zza(8);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzb(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final synchronized void zzc(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
        if (zzj(zzaejVar, z)) {
            if (this.zzn == 0) {
                this.zzo = SystemClock.elapsedRealtime();
            }
            this.zzn++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final synchronized void zzd(zzaef zzaefVar, zzaej zzaejVar, boolean z, int i) {
        if (zzj(zzaejVar, z)) {
            this.zzp += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final synchronized void zze(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
        if (zzj(zzaejVar, z)) {
            zzafs.zzd(this.zzn > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.zzo);
            this.zzr += i;
            long j = this.zzs;
            long j2 = this.zzp;
            this.zzs = j + j2;
            if (i > 0) {
                this.zzk.zzb((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.zzr >= 2000 || this.zzs >= 524288) {
                    this.zzt = this.zzk.zzc(0.5f);
                }
                zzh(i, this.zzp, this.zzt);
                this.zzo = elapsedRealtime;
                this.zzp = 0L;
            }
            this.zzn--;
        }
    }

    /* synthetic */ zzaen(Context context, Map map, int i, zzaft zzaftVar, boolean z, zzaem zzaemVar) {
        this.zzi = zzfhd.zzd(map);
        this.zzj = new zzadw();
        this.zzk = new zzahj(2000);
        this.zzl = zzaftVar;
        this.zzm = true;
        if (context != null) {
            zzahb zza2 = zzahb.zza(context);
            int zzc2 = zza2.zzc();
            this.zzq = zzc2;
            this.zzt = zzi(zzc2);
            zza2.zzb(new zzagy(this) { // from class: com.google.android.gms.internal.ads.zzael
                private final zzaen zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzagy
                public final void zza(int i2) {
                    this.zza.zzf(i2);
                }
            });
            return;
        }
        this.zzq = 0;
        this.zzt = zzi(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf(int i) {
        int i2 = this.zzq;
        if (i2 == 0 || this.zzm) {
            if (i2 == i) {
                return;
            }
            this.zzq = i;
            if (i != 1 && i != 0 && i != 8) {
                this.zzt = zzi(i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzh(this.zzn > 0 ? (int) (elapsedRealtime - this.zzo) : 0, this.zzp, this.zzt);
                this.zzo = elapsedRealtime;
                this.zzp = 0L;
                this.zzs = 0L;
                this.zzr = 0L;
                this.zzk.zza();
            }
        }
    }
}
