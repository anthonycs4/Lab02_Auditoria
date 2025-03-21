package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcoc implements zzcnp {
    private final CookieManager zza;

    public zzcoc(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzs.zze().zzk(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zza(Map<String, String> map) {
        if (this.zza == null) {
            return;
        }
        if (map.get("clear") == null) {
            String str = map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) zzbba.zzc().zzb(zzbfq.zzaz), str);
            return;
        }
        String str2 = (String) zzbba.zzc().zzb(zzbfq.zzaz);
        String cookie = this.zza.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List<String> zzc = zzfey.zza(zzfef.zzb(';')).zzc(cookie);
        for (int i = 0; i < zzc.size(); i++) {
            CookieManager cookieManager = this.zza;
            Iterator<String> it = zzfey.zza(zzfef.zzb('=')).zzb(zzc.get(i)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(91);
                sb.append("position (0) must be less than the number of elements that remained (");
                sb.append(0);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            String valueOf = String.valueOf(it.next());
            String valueOf2 = String.valueOf((String) zzbba.zzc().zzb(zzbfq.zzaq));
            cookieManager.setCookie(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }
}
