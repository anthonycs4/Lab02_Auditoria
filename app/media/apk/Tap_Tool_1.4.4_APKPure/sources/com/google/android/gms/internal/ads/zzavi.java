package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzavi implements zzfyo {
    UNKNOWN_EVENT_TYPE(0),
    AD_REQUEST(1),
    AD_LOADED(2),
    AD_IMPRESSION(5),
    AD_FIRST_CLICK(6),
    AD_SUBSEQUENT_CLICK(7),
    REQUEST_WILL_START(8),
    REQUEST_DID_END(9),
    REQUEST_WILL_UPDATE_SIGNALS(10),
    REQUEST_DID_UPDATE_SIGNALS(11),
    REQUEST_WILL_BUILD_URL(12),
    REQUEST_DID_BUILD_URL(13),
    REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
    REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
    REQUEST_WILL_PROCESS_RESPONSE(16),
    REQUEST_DID_PROCESS_RESPONSE(17),
    REQUEST_WILL_RENDER(18),
    REQUEST_DID_RENDER(19),
    AD_FAILED_TO_LOAD(3),
    AD_FAILED_TO_LOAD_NO_FILL(4),
    AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
    AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
    AD_FAILED_TO_LOAD_TIMEOUT(102),
    AD_FAILED_TO_LOAD_CANCELLED(103),
    AD_FAILED_TO_LOAD_NO_ERROR(104),
    AD_FAILED_TO_LOAD_NOT_FOUND(105),
    REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
    REQUEST_DID_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_CONTEXT_MENU),
    REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_HAND),
    REQUEST_FAILED_TO_BUILD_URL(PointerIconCompat.TYPE_HELP),
    REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(PointerIconCompat.TYPE_WAIT),
    REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
    REQUEST_FAILED_TO_UPDATE_SIGNALS(PointerIconCompat.TYPE_CELL),
    REQUEST_FAILED_TO_RENDER(PointerIconCompat.TYPE_CROSSHAIR),
    REQUEST_IS_PREFETCH(1100),
    REQUEST_SAVED_TO_CACHE(1101),
    REQUEST_LOADED_FROM_CACHE(1102),
    REQUEST_PREFETCH_INTERCEPTED(1103),
    REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
    REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
    NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
    NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
    REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
    BANNER_SIZE_INVALID(10000),
    BANNER_SIZE_VALID(10001),
    ANDROID_WEBVIEW_CRASH(10002),
    OFFLINE_UPLOAD(10003),
    DELAY_PAGE_LOAD_CANCELLED_AD(10004);
    
    private static final zzfyp<zzavi> zzW = new zzfyp<zzavi>() { // from class: com.google.android.gms.internal.ads.zzavh
    };
    private final int zzX;

    zzavi(int i) {
        this.zzX = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzX + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzX;
    }
}
