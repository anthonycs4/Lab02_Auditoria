package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzccm {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List<String> zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set<String> zzf = new HashSet(Arrays.asList(new String[0]));

    public zzccm() {
        this(null);
    }

    public static void zzg() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzccn.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzi() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    public static boolean zzj() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzk(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && zzbha.zza.zze().booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e) {
                zzccn.zzj("Fail to determine debug setting.", e);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzl(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzq(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzm(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzq(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    private final void zzn(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zzr("onNetworkRequest", new zzccl(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzcch
            private final String zza;
            private final String zzb;
            private final Map zzc;
            private final byte[] zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = str2;
                this.zzc = map;
                this.zzd = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzccl
            public final void zza(JsonWriter jsonWriter) {
                zzccm.zzm(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter);
            }
        });
    }

    private final void zzo(final Map<String, ?> map, final int i) {
        zzr("onNetworkResponse", new zzccl(i, map) { // from class: com.google.android.gms.internal.ads.zzcci
            private final int zza;
            private final Map zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = i;
                this.zzb = map;
            }

            @Override // com.google.android.gms.internal.ads.zzccl
            public final void zza(JsonWriter jsonWriter) {
                zzccm.zzl(this.zza, this.zzb, jsonWriter);
            }
        });
    }

    private final void zzp(final String str) {
        zzr("onNetworkRequestError", new zzccl(str) { // from class: com.google.android.gms.internal.ads.zzcck
            private final String zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzccl
            public final void zza(JsonWriter jsonWriter) {
                String str2 = this.zza;
                int i = zzccm.zza;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void zzq(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzf.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    zzccn.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zzr(String str, zzccl zzcclVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzcclVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzccn.zzg("unable to log", e);
        }
        zzs(stringWriter.toString());
    }

    private static synchronized void zzs(String str) {
        synchronized (zzccm.class) {
            zzccn.zzh("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzccn.zzh(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzccn.zzh("GMA Debug FINISH");
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzj()) {
            zzn(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzb(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (zzj()) {
            zzn(str, "GET", map, bArr);
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i) {
        if (zzj()) {
            String str = null;
            zzo(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzccn.zzi(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzp(str);
            }
        }
    }

    public final void zzd(Map<String, ?> map, int i) {
        if (zzj()) {
            zzo(map, i);
            if (i < 200 || i >= 300) {
                zzp(null);
            }
        }
    }

    public final void zze(String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        zzr("onNetworkResponseBody", new zzccl(bArr) { // from class: com.google.android.gms.internal.ads.zzccj
            private final byte[] zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzccl
            public final void zza(JsonWriter jsonWriter) {
                byte[] bArr2 = this.zza;
                int i = zzccm.zza;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zzd2 = zzccg.zzd(encode);
                    if (zzd2 != null) {
                        jsonWriter.name("bodydigest").value(zzd2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzccm(String str) {
        List<String> asList;
        if (!zzj()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.zzg = asList;
    }
}
