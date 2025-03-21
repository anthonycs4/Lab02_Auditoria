package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzbh extends zzac<String> {
    private final Object zza;
    private final zzah<String> zzb;

    public zzbh(int i, String str, zzah<String> zzahVar, zzag zzagVar) {
        super(i, str, zzagVar);
        this.zza = new Object();
        this.zzb = zzahVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzac
    public final zzai<String> zzr(zzy zzyVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzyVar.zzb;
            Map<String, String> map = zzyVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzyVar.zzb);
        }
        return zzai.zza(str, zzaz.zza(zzyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzac
    /* renamed from: zzz */
    public void zzs(String str) {
        zzah<String> zzahVar;
        synchronized (this.zza) {
            zzahVar = this.zzb;
        }
        zzahVar.zza(str);
    }
}
