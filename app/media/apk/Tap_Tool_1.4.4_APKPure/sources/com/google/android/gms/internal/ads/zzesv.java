package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesv {
    public final List<String> zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzesu zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesv(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i = 0;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        long j = 0;
        zzesu zzesuVar = null;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbv.zzb(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfA)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    if ("bidding_data".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    zzesuVar = new zzesu(jsonReader);
                }
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        this.zzb = str2;
        this.zzd = str3;
        this.zze = i2;
        this.zzf = j;
        this.zzi = zzesuVar;
        this.zzg = z;
        this.zzh = str;
    }
}
