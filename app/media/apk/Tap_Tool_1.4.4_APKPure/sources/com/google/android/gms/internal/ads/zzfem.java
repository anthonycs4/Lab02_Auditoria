package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfem {
    private final String zza;
    private final zzfel zzb;
    private zzfel zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfem(String str, zzfek zzfekVar) {
        zzfel zzfelVar = new zzfel(null);
        this.zzb = zzfelVar;
        this.zzc = zzfelVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfel zzfelVar = this.zzb.zzb;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (zzfelVar != null) {
            Object obj = zzfelVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfelVar = zzfelVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfem zza(@NullableDecl Object obj) {
        zzfel zzfelVar = new zzfel(null);
        this.zzc.zzb = zzfelVar;
        this.zzc = zzfelVar;
        zzfelVar.zza = obj;
        return this;
    }
}
