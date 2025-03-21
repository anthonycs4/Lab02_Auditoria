package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzess {
    public final String zzA;
    public final JSONObject zzB;
    public final JSONObject zzC;
    public final String zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final int zzL;
    public final int zzM;
    public final boolean zzN;
    public final String zzO;
    public final zzetn zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final int zzS;
    public final String zzT;
    public final int zzU;
    public final String zzV;
    public final boolean zzW;
    public final zzbvs zzX;
    public final boolean zzY;
    public final zzazz zzZ;
    public final List<String> zza;
    public final String zzaa;
    public final boolean zzab;
    public final JSONObject zzac;
    public final boolean zzad;
    public final JSONObject zzae;
    public final boolean zzaf;
    public final String zzag;
    public final boolean zzah;
    public final int zzb;
    public final List<String> zzc;
    public final List<String> zzd;
    public final int zze;
    public final List<String> zzf;
    public final List<String> zzg;
    public final List<String> zzh;
    public final List<String> zzi;
    public final String zzj;
    public final String zzk;
    public final zzbyh zzl;
    public final List<String> zzm;
    public final List<String> zzn;
    public final List<String> zzo;
    public final int zzp;
    public final List<zzest> zzq;
    public final zzesx zzr;
    public final List<String> zzs;
    public final List<zzest> zzt;
    public final JSONObject zzu;
    public final String zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final zzbzr zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzess(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        List<String> list2;
        char c;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<String> emptyList10 = Collections.emptyList();
        List<zzest> emptyList11 = Collections.emptyList();
        List<String> emptyList12 = Collections.emptyList();
        List<zzest> emptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jsonReader.beginObject();
        zzesx zzesxVar = null;
        List<zzest> list3 = emptyList11;
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        JSONObject jSONObject9 = jSONObject5;
        JSONObject jSONObject10 = jSONObject6;
        zzbzr zzbzrVar = null;
        zzbvs zzbvsVar = null;
        zzazz zzazzVar = null;
        String str = null;
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = -1;
        int i3 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i4 = 0;
        int i5 = -1;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        List<String> list4 = emptyList12;
        List<zzest> list5 = emptyList13;
        JSONObject jSONObject11 = jSONObject;
        JSONObject jSONObject12 = jSONObject2;
        zzbyh zzbyhVar = null;
        String str13 = str12;
        int i6 = 0;
        int i7 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str14 = nextName == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : nextName;
            switch (str14.hashCode()) {
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("test_mode_enabled")) {
                        c = Typography.quote;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rtb_native_required_assets")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_timeout_ms")) {
                        c = Typography.amp;
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("content_url")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("force_disable_hardware_acceleration")) {
                        c = Typography.less;
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("native_required_asset_viewability")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_offline_ad")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_closable_area_disabled")) {
                        c = Typography.dollar;
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str14.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 1:
                    i7 = zza(jsonReader.nextString());
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 5:
                    i6 = zzb(jsonReader.nextInt());
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 7:
                    com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case '\b':
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case '\t':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case '\n':
                    str13 = jsonReader.nextString();
                    break;
                case 11:
                    str2 = jsonReader.nextString();
                    break;
                case '\f':
                    zzbyhVar = zzbyh.zza(com.google.android.gms.ads.internal.util.zzbv.zzd(jsonReader));
                    break;
                case '\r':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 14:
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    continue;
                    emptyList10 = list2;
                case 15:
                    list2 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 16:
                    i = jsonReader.nextInt();
                    break;
                case 17:
                    list3 = zzest.zza(jsonReader);
                    break;
                case 18:
                    zzesxVar = new zzesx(jsonReader);
                    break;
                case 19:
                    list5 = zzest.zza(jsonReader);
                    break;
                case 20:
                    list4 = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case 23:
                    str4 = jsonReader.nextString();
                    break;
                case 24:
                    str5 = jsonReader.nextString();
                    break;
                case 25:
                    str6 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader).toString();
                    break;
                case 26:
                    zzbzrVar = zzbzr.zza(com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader));
                    break;
                case 27:
                    str7 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case 29:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i2 = zzc(jsonReader.nextString());
                    break;
                case '&':
                    i3 = jsonReader.nextInt();
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str8 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i4 = jsonReader.nextInt();
                    break;
                case '-':
                    i5 = jsonReader.nextInt();
                    break;
                case '.':
                    str9 = jsonReader.nextString();
                    break;
                case '/':
                    str10 = jsonReader.nextString();
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbvsVar = zzbvs.zza(com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader));
                    break;
                case '2':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '3':
                    zzazzVar = zzazz.zza(com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader));
                    break;
                case '4':
                    str11 = jsonReader.nextString();
                    break;
                case '5':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case '7':
                    str12 = jsonReader.nextString();
                    break;
                case '8':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '9':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
                    break;
                case ':':
                    z15 = jsonReader.nextBoolean();
                    break;
                case ';':
                    str = jsonReader.nextString();
                    break;
                case '<':
                    z16 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            emptyList9 = list;
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i7;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzf = emptyList4;
        this.zze = i6;
        this.zzg = emptyList5;
        this.zzh = emptyList6;
        this.zzi = emptyList7;
        this.zzj = str13;
        this.zzk = str2;
        this.zzl = zzbyhVar;
        this.zzm = emptyList8;
        this.zzn = emptyList9;
        this.zzo = emptyList10;
        this.zzp = i;
        this.zzq = list3;
        this.zzr = zzesxVar;
        this.zzs = list4;
        this.zzt = list5;
        this.zzv = str3;
        this.zzu = jSONObject11;
        this.zzw = str4;
        this.zzx = str5;
        this.zzy = str6;
        this.zzz = zzbzrVar;
        this.zzA = str7;
        this.zzB = jSONObject12;
        this.zzC = jSONObject7;
        this.zzE = z;
        this.zzF = z2;
        this.zzG = z3;
        this.zzH = z4;
        this.zzI = z5;
        this.zzJ = z6;
        this.zzK = z7;
        this.zzL = i2;
        this.zzM = i3;
        this.zzN = z8;
        this.zzO = str8;
        this.zzP = new zzetn(jSONObject8);
        this.zzQ = z9;
        this.zzR = z10;
        this.zzS = i4;
        this.zzT = str9;
        this.zzU = i5;
        this.zzV = str10;
        this.zzW = z11;
        this.zzX = zzbvsVar;
        this.zzY = z12;
        this.zzZ = zzazzVar;
        this.zzaa = str11;
        this.zzab = z13;
        this.zzac = jSONObject9;
        this.zzD = str12;
        this.zzad = z14;
        this.zzae = jSONObject10;
        this.zzaf = z15;
        this.zzag = str;
        this.zzah = z16;
    }

    private static int zza(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzb(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    private static final int zzc(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
