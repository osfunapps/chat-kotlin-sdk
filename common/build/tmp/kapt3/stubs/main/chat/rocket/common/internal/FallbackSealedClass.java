package chat.rocket.common.internal;

import java.lang.System;

/**
 * * Indicates that the annotated sealed class has a fallback value. The fallback must be set via
 * * [.name] and must have a constructor String field [.fieldName]. If no class with the provided name is declared in the
 * * annotated sealed class type an [assertion error][AssertionError] will be thrown.
 * *
 * *
 * * To leverage from [FallbackSealedClass] [FallbackSealedClassJsonAdapter.ADAPTER_FACTORY] must be added to
 * * your [moshi instance][Moshi]:
 * *
 * *
 * * <pre>`
 * * Moshi moshi = new Moshi.Builder()
 * * .add(FallbackEnum.ADAPTER_FACTORY)
 * * .build();
 * * `</pre>
 * *
 * * Declaration example:
 * * <pre>`
 * * @FallbackSealedClass(name = "Custom", fieldName = "rawType")
 * * sealed class RoomType {
 * *   @Json(name = "c") class Public : RoomType()
 * *   @Json(name = "d") class OneToOne: RoomType()
 * *   class Custom(val rawType: String) : RoomType()
 * * }
 * * `</pre>
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003R\t\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0000R\t\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0000\u00a8\u0006\u0005"}, d2 = {"Lchat/rocket/common/internal/FallbackSealedClass;", "", "name", "", "fieldName", "common"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FILE})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@java.lang.annotation.Documented()
public abstract @interface FallbackSealedClass {
    
    public abstract java.lang.String name();
    
    public abstract java.lang.String fieldName();
}