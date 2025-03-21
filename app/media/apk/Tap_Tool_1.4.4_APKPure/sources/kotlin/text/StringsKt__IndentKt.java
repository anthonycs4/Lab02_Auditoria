package kotlin.text;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return StringsKt.trimMargin(str, str2);
    }

    public static final String trimMargin(String trimMargin, String marginPrefix) {
        Intrinsics.checkNotNullParameter(trimMargin, "$this$trimMargin");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return StringsKt.replaceIndentByMargin(trimMargin, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, marginPrefix);
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return StringsKt.replaceIndentByMargin(str, str2, str3);
    }

    public static final String replaceIndentByMargin(String replaceIndentByMargin, String newIndent, String marginPrefix) {
        Appendable joinTo;
        int i;
        String invoke;
        Intrinsics.checkNotNullParameter(replaceIndentByMargin, "$this$replaceIndentByMargin");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!StringsKt.isBlank(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> lines = StringsKt.lines(replaceIndentByMargin);
        int length = replaceIndentByMargin.length() + (newIndent.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : lines) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String str2 = null;
            if ((i2 != 0 && i2 != lastIndex) || !StringsKt.isBlank(str)) {
                String str3 = str;
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    } else if (!CharsKt.isWhitespace(str3.charAt(i4))) {
                        i = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i != -1) {
                    int i5 = i;
                    if (StringsKt.startsWith$default(str, marginPrefix, i, false, 4, (Object) null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        str2 = str.substring(i5 + marginPrefix.length());
                        Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).substring(startIndex)");
                    }
                }
                if (str2 != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(str2)) != null) {
                    str = invoke;
                }
                str2 = str;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i3;
        }
        joinTo = CollectionsKt.joinTo(arrayList, new StringBuilder(length), (r15 & 2) != 0 ? ", " : "\n", (r15 & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 16) != 0 ? -1 : 0, (r15 & 32) != 0 ? "..." : null, (r15 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static final String trimIndent(String trimIndent) {
        Intrinsics.checkNotNullParameter(trimIndent, "$this$trimIndent");
        return StringsKt.replaceIndent(trimIndent, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return StringsKt.replaceIndent(str, str2);
    }

    public static final String replaceIndent(String replaceIndent, String newIndent) {
        Appendable joinTo;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(replaceIndent, "$this$replaceIndent");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt.lines(replaceIndent);
        List<String> list = lines;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (String str2 : arrayList2) {
            arrayList3.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(str2)));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable<? extends Comparable>) arrayList3);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = replaceIndent.length() + (newIndent.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt.isBlank(str3)) {
                str = null;
            } else {
                String drop = StringsKt.drop(str3, intValue);
                if (drop != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str3 = invoke;
                }
                str = str3;
            }
            if (str != null) {
                arrayList4.add(str);
            }
            i = i2;
        }
        joinTo = CollectionsKt.joinTo(arrayList4, new StringBuilder(length), (r15 & 2) != 0 ? ", " : "\n", (r15 & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 16) != 0 ? -1 : 0, (r15 & 32) != 0 ? "..." : null, (r15 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return StringsKt.prependIndent(str, str2);
    }

    public static final String prependIndent(String prependIndent, final String indent) {
        Intrinsics.checkNotNullParameter(prependIndent, "$this$prependIndent");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence(prependIndent), new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$prependIndent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (StringsKt.isBlank(it)) {
                    return it.length() < indent.length() ? indent : it;
                }
                return indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!CharsKt.isWhitespace(str2.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return line;
            }
        } : new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return str + line;
            }
        };
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        Appendable joinTo;
        String str;
        String invoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(str2)) {
                str = null;
            } else {
                String invoke2 = function12.invoke(str2);
                if (invoke2 != null && (invoke = function1.invoke(invoke2)) != null) {
                    str2 = invoke;
                }
                str = str2;
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        joinTo = CollectionsKt.joinTo(arrayList, new StringBuilder(i), (r15 & 2) != 0 ? ", " : "\n", (r15 & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : null, (r15 & 16) != 0 ? -1 : 0, (r15 & 32) != 0 ? "..." : null, (r15 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }
}
