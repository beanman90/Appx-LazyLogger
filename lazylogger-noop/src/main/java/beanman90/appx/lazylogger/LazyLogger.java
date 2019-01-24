package beanman90.appx.lazylogger;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.Collections;
import java.util.List;

/**
 * Created by Manh Do on 7/6/2018.
 */

@SuppressWarnings({"WeakerAccess", "unused"})
public final class LazyLogger {
    /**
     * Log a verbose message with optional format args.
     */
    public static void v(@NonNull String message, Object... args) {
    }

    /**
     * Log a verbose exception and a message with optional format args.
     */
    public static void v(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log a verbose exception.
     */
    public static void v(Throwable t) {

    }

    /**
     * Log a debug message with optional format args.
     */
    public static void d(@NonNull String message, Object... args) {
    }

    /**
     * Log a debug exception and a message with optional format args.
     */
    public static void d(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log a debug exception.
     */
    public static void d(Throwable t) {
    }

    /**
     * Log an info message with optional format args.
     */
    public static void i(@NonNull String message, Object... args) {
    }

    /**
     * Log an info exception and a message with optional format args.
     */
    public static void i(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log an info exception.
     */
    public static void i(Throwable t) {
    }

    /**
     * Log a warning message with optional format args.
     */
    public static void w(@NonNull String message, Object... args) {
    }

    /**
     * Log a warning exception and a message with optional format args.
     */
    public static void w(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log a warning exception.
     */
    public static void w(Throwable t) {
    }

    /**
     * Log an error message with optional format args.
     */
    public static void e(@NonNull String message, Object... args) {
    }

    /**
     * Log an error exception and a message with optional format args.
     */
    public static void e(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log an error exception.
     */
    public static void e(Throwable t) {
    }

    /**
     * Log an assert message with optional format args.
     */
    public static void wtf(@NonNull String message, Object... args) {
    }

    /**
     * Log an assert exception and a message with optional format args.
     */
    public static void wtf(Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log an assert exception.
     */
    public static void wtf(Throwable t) {
    }

    /**
     * Log at {@code priority} a message with optional format args.
     */
    public static void log(int priority, @NonNull String message, Object... args) {
    }

    /**
     * Log at {@code priority} an exception and a message with optional format args.
     */
    public static void log(int priority, Throwable t, @NonNull String message, Object... args) {
    }

    /**
     * Log at {@code priority} an exception.
     */
    public static void log(int priority, Throwable t) {
    }

    /**
     * A view into planted trees as a tree itself. This can be used for injecting a logger
     * instance rather than using static methods or to facilitate testing.
     */
    @NonNull
    public static Tree asTree() {
        return new DebugTree();
    }

    /**
     * Set a one-time tag for use on the next logging call.
     */
    @NonNull
    public static Tree tag(String tag) {
        return new DebugTree();
    }

    /**
     * Add a new logging tree.
     */
    @SuppressWarnings("ConstantConditions") // Validating public API contract.
    public static void plant(@NonNull Tree tree) {
    }

    /**
     * Adds new logging trees.
     */
    @SuppressWarnings("ConstantConditions") // Validating public API contract.
    public static void plant(@NonNull Tree... trees) {
    }

    /**
     * Remove a planted tree.
     */
    public static void uproot(@NonNull Tree tree) {
    }

    /**
     * Remove all planted trees.
     */
    public static void uprootAll() {
    }

    /**
     * Return a copy of all planted {@linkplain Tree trees}.
     */
    @NonNull
    public static List<Tree> forest() {
        return Collections.EMPTY_LIST;
    }

    public static int treeCount() {
        return 0;
    }

    private LazyLogger() {
        throw new AssertionError("No instances.");
    }

    /**
     * A facade for handling logging calls. Install instances via {@link #plant plant()}.
     */
    public static abstract class Tree {

    }

    /**
     * A {@link Tree Tree} for debug builds. Automatically infers the tag from the calling class.
     */
    public static class DebugTree extends Tree {
        public DebugTree() {
            Log.i("ASLogger", "No-op");
        }
    }


}
