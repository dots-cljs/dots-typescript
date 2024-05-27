(ns dots.typescript.server.session-options)

(defn host
  "**Returns:** `ServerHost`"
  ^js [session-options]
  (.-host ^js session-options))

(defn set-host!
  ^js [session-options value]
  (set! (.-host ^js session-options) value))

(defn cancellation-token
  "**Returns:** `ServerCancellationToken`"
  ^js [session-options]
  (.-cancellationToken ^js session-options))

(defn set-cancellation-token!
  ^js [session-options value]
  (set! (.-cancellationToken ^js session-options) value))

(defn use-single-inferred-project?
  "**Returns:** `boolean`"
  ^js [session-options]
  (.-useSingleInferredProject ^js session-options))

(defn set-use-single-inferred-project!
  ^js [session-options value]
  (set! (.-useSingleInferredProject ^js session-options) value))

(defn use-inferred-project-per-project-root?
  "**Returns:** `boolean`"
  ^js [session-options]
  (.-useInferredProjectPerProjectRoot ^js session-options))

(defn set-use-inferred-project-per-project-root!
  ^js [session-options value]
  (set! (.-useInferredProjectPerProjectRoot ^js session-options) value))

(defn typings-installer
  "**Returns:** `ITypingsInstaller | undefined`"
  ^js [session-options]
  (.-typingsInstaller ^js session-options))

(defn set-typings-installer!
  ^js [session-options value]
  (set! (.-typingsInstaller ^js session-options) value))

(defn byte-length
  "**Returns:** `(buf: string, encoding?: BufferEncoding | undefined) => number`"
  ^js [session-options]
  (.-byteLength ^js session-options))

(defn set-byte-length!
  ^js [session-options value]
  (set! (.-byteLength ^js session-options) value))

(defn hrtime
  "**Returns:** `(start?: [number, number] | undefined) => [number, number]`"
  ^js [session-options]
  (.-hrtime ^js session-options))

(defn set-hrtime!
  ^js [session-options value]
  (set! (.-hrtime ^js session-options) value))

(defn logger
  "**Returns:** `Logger`"
  ^js [session-options]
  (.-logger ^js session-options))

(defn set-logger!
  ^js [session-options value]
  (set! (.-logger ^js session-options) value))

(defn can-use-events?
  "If falsy, all events are suppressed.
   
   **Returns:** `boolean`"
  ^js [session-options]
  (.-canUseEvents ^js session-options))

(defn set-can-use-events!
  "If falsy, all events are suppressed."
  ^js [session-options value]
  (set! (.-canUseEvents ^js session-options) value))

(defn can-use-watch-events?
  "**Returns:** `boolean | undefined`"
  ^js [session-options]
  (.-canUseWatchEvents ^js session-options))

(defn set-can-use-watch-events!
  ^js [session-options value]
  (set! (.-canUseWatchEvents ^js session-options) value))

(defn event-handler
  "**Returns:** `ProjectServiceEventHandler | undefined`"
  ^js [session-options]
  (.-eventHandler ^js session-options))

(defn set-event-handler!
  ^js [session-options value]
  (set! (.-eventHandler ^js session-options) value))

(defn suppress-diagnostic-events?
  "Has no effect if eventHandler is also specified.
   
   **Returns:** `boolean | undefined`"
  ^js [session-options]
  (.-suppressDiagnosticEvents ^js session-options))

(defn set-suppress-diagnostic-events!
  "Has no effect if eventHandler is also specified."
  ^js [session-options value]
  (set! (.-suppressDiagnosticEvents ^js session-options) value))

(defn server-mode
  "**Returns:** `LanguageServiceMode | undefined`"
  ^js [session-options]
  (.-serverMode ^js session-options))

(defn set-server-mode!
  ^js [session-options value]
  (set! (.-serverMode ^js session-options) value))

(defn throttle-wait-milliseconds
  "**Returns:** `number | undefined`"
  ^js [session-options]
  (.-throttleWaitMilliseconds ^js session-options))

(defn set-throttle-wait-milliseconds!
  ^js [session-options value]
  (set! (.-throttleWaitMilliseconds ^js session-options) value))

(defn no-get-err-on-background-update?
  "**Returns:** `boolean | undefined`"
  ^js [session-options]
  (.-noGetErrOnBackgroundUpdate ^js session-options))

(defn set-no-get-err-on-background-update!
  ^js [session-options value]
  (set! (.-noGetErrOnBackgroundUpdate ^js session-options) value))

(defn global-plugins
  "**Returns:** `readonly string[] | undefined`"
  ^js [session-options]
  (.-globalPlugins ^js session-options))

(defn set-global-plugins!
  ^js [session-options value]
  (set! (.-globalPlugins ^js session-options) value))

(defn plugin-probe-locations
  "**Returns:** `readonly string[] | undefined`"
  ^js [session-options]
  (.-pluginProbeLocations ^js session-options))

(defn set-plugin-probe-locations!
  ^js [session-options value]
  (set! (.-pluginProbeLocations ^js session-options) value))

(defn allow-local-plugin-loads?
  "**Returns:** `boolean | undefined`"
  ^js [session-options]
  (.-allowLocalPluginLoads ^js session-options))

(defn set-allow-local-plugin-loads!
  ^js [session-options value]
  (set! (.-allowLocalPluginLoads ^js session-options) value))

(defn types-map-location
  "**Returns:** `string | undefined`"
  ^js [session-options]
  (.-typesMapLocation ^js session-options))

(defn set-types-map-location!
  ^js [session-options value]
  (set! (.-typesMapLocation ^js session-options) value))
