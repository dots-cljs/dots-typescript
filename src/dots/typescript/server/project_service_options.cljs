(ns dots.typescript.server.project-service-options)

(defn host
  "**Returns:** `ServerHost`"
  ^js [project-service-options]
  (.-host ^js project-service-options))

(defn set-host!
  ^js [project-service-options value]
  (set! (.-host ^js project-service-options) value))

(defn logger
  "**Returns:** `Logger`"
  ^js [project-service-options]
  (.-logger ^js project-service-options))

(defn set-logger!
  ^js [project-service-options value]
  (set! (.-logger ^js project-service-options) value))

(defn cancellation-token
  "**Returns:** `HostCancellationToken`"
  ^js [project-service-options]
  (.-cancellationToken ^js project-service-options))

(defn set-cancellation-token!
  ^js [project-service-options value]
  (set! (.-cancellationToken ^js project-service-options) value))

(defn use-single-inferred-project?
  "**Returns:** `boolean`"
  ^js [project-service-options]
  (.-useSingleInferredProject ^js project-service-options))

(defn set-use-single-inferred-project!
  ^js [project-service-options value]
  (set! (.-useSingleInferredProject ^js project-service-options) value))

(defn use-inferred-project-per-project-root?
  "**Returns:** `boolean`"
  ^js [project-service-options]
  (.-useInferredProjectPerProjectRoot ^js project-service-options))

(defn set-use-inferred-project-per-project-root!
  ^js [project-service-options value]
  (set! (.-useInferredProjectPerProjectRoot ^js project-service-options) value))

(defn typings-installer
  "**Returns:** `ITypingsInstaller | undefined`"
  ^js [project-service-options]
  (.-typingsInstaller ^js project-service-options))

(defn set-typings-installer!
  ^js [project-service-options value]
  (set! (.-typingsInstaller ^js project-service-options) value))

(defn event-handler
  "**Returns:** `ProjectServiceEventHandler | undefined`"
  ^js [project-service-options]
  (.-eventHandler ^js project-service-options))

(defn set-event-handler!
  ^js [project-service-options value]
  (set! (.-eventHandler ^js project-service-options) value))

(defn can-use-watch-events?
  "**Returns:** `boolean | undefined`"
  ^js [project-service-options]
  (.-canUseWatchEvents ^js project-service-options))

(defn set-can-use-watch-events!
  ^js [project-service-options value]
  (set! (.-canUseWatchEvents ^js project-service-options) value))

(defn suppress-diagnostic-events?
  "**Returns:** `boolean | undefined`"
  ^js [project-service-options]
  (.-suppressDiagnosticEvents ^js project-service-options))

(defn set-suppress-diagnostic-events!
  ^js [project-service-options value]
  (set! (.-suppressDiagnosticEvents ^js project-service-options) value))

(defn throttle-wait-milliseconds
  "**Returns:** `number | undefined`"
  ^js [project-service-options]
  (.-throttleWaitMilliseconds ^js project-service-options))

(defn set-throttle-wait-milliseconds!
  ^js [project-service-options value]
  (set! (.-throttleWaitMilliseconds ^js project-service-options) value))

(defn global-plugins
  "**Returns:** `readonly string[] | undefined`"
  ^js [project-service-options]
  (.-globalPlugins ^js project-service-options))

(defn set-global-plugins!
  ^js [project-service-options value]
  (set! (.-globalPlugins ^js project-service-options) value))

(defn plugin-probe-locations
  "**Returns:** `readonly string[] | undefined`"
  ^js [project-service-options]
  (.-pluginProbeLocations ^js project-service-options))

(defn set-plugin-probe-locations!
  ^js [project-service-options value]
  (set! (.-pluginProbeLocations ^js project-service-options) value))

(defn allow-local-plugin-loads?
  "**Returns:** `boolean | undefined`"
  ^js [project-service-options]
  (.-allowLocalPluginLoads ^js project-service-options))

(defn set-allow-local-plugin-loads!
  ^js [project-service-options value]
  (set! (.-allowLocalPluginLoads ^js project-service-options) value))

(defn types-map-location
  "**Returns:** `string | undefined`"
  ^js [project-service-options]
  (.-typesMapLocation ^js project-service-options))

(defn set-types-map-location!
  ^js [project-service-options value]
  (set! (.-typesMapLocation ^js project-service-options) value))

(defn server-mode
  "**Returns:** `LanguageServiceMode | undefined`"
  ^js [project-service-options]
  (.-serverMode ^js project-service-options))

(defn set-server-mode!
  ^js [project-service-options value]
  (set! (.-serverMode ^js project-service-options) value))

(defn session
  "**Returns:** `Session<unknown> | undefined`"
  ^js [project-service-options]
  (.-session ^js project-service-options))

(defn set-session!
  ^js [project-service-options value]
  (set! (.-session ^js project-service-options) value))

(defn js-doc-parsing-mode
  "**Returns:** `JSDocParsingMode | undefined`"
  ^js [project-service-options]
  (.-jsDocParsingMode ^js project-service-options))

(defn set-js-doc-parsing-mode!
  ^js [project-service-options value]
  (set! (.-jsDocParsingMode ^js project-service-options) value))
