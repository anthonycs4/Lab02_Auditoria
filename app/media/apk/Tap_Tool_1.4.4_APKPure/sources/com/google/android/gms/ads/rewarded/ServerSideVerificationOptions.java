package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}
