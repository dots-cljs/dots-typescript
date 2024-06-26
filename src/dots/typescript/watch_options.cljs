(ns dots.typescript.watch-options)

(defn watch-file
  "**Returns:** `WatchFileKind | undefined`"
  ^js [watch-options]
  (.-watchFile ^js watch-options))

(defn set-watch-file!
  ^js [watch-options value]
  (set! (.-watchFile ^js watch-options) value))

(defn watch-directory
  "**Returns:** `WatchDirectoryKind | undefined`"
  ^js [watch-options]
  (.-watchDirectory ^js watch-options))

(defn set-watch-directory!
  ^js [watch-options value]
  (set! (.-watchDirectory ^js watch-options) value))

(defn fallback-polling
  "**Returns:** `PollingWatchKind | undefined`"
  ^js [watch-options]
  (.-fallbackPolling ^js watch-options))

(defn set-fallback-polling!
  ^js [watch-options value]
  (set! (.-fallbackPolling ^js watch-options) value))

(defn synchronous-watch-directory?
  "**Returns:** `boolean | undefined`"
  ^js [watch-options]
  (.-synchronousWatchDirectory ^js watch-options))

(defn set-synchronous-watch-directory!
  ^js [watch-options value]
  (set! (.-synchronousWatchDirectory ^js watch-options) value))

(defn exclude-directories
  "**Returns:** `string[] | undefined`"
  ^js [watch-options]
  (.-excludeDirectories ^js watch-options))

(defn set-exclude-directories!
  ^js [watch-options value]
  (set! (.-excludeDirectories ^js watch-options) value))

(defn exclude-files
  "**Returns:** `string[] | undefined`"
  ^js [watch-options]
  (.-excludeFiles ^js watch-options))

(defn set-exclude-files!
  ^js [watch-options value]
  (set! (.-excludeFiles ^js watch-options) value))
