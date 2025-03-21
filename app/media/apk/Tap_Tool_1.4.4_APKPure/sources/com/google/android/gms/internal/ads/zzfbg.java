package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfbg extends zzfbc {
    private String zza;
    private Boolean zzb;
    private Boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzfbc
    public final zzfbc zza(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbc
    public final zzfbc zzb(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbc
    public final zzfbc zzc(boolean z) {
        this.zzc = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbc
    public final zzfbd zzd() {
        String str = this.zza == null ? " clientVersion" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.zzb == null) {
            str = str.concat(" shouldGetAdvertisingId");
        }
        if (this.zzc == null) {
            str = String.valueOf(str).concat(" isGooglePlayServicesAvailable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zzfbh(this.zza, this.zzb.booleanValue(), this.zzc.booleanValue(), null);
    }
}
