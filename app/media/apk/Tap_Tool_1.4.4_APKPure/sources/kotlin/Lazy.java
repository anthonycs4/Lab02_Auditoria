package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/Lazy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/Object;", "isInitialized", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface Lazy<T> {
    T getValue();

    boolean isInitialized();
}
