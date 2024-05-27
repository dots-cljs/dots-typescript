(ns dots.typescript.server.typings-installer.typings-installer)

(defn install-typing-host
  "**Returns:** `InstallTypingHost`"
  ^js [typings-installer]
  (.-installTypingHost ^js typings-installer))

(defn global-cache-path
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-globalCachePath ^js typings-installer))

(defn safe-list-path
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-safeListPath ^js typings-installer))

(defn types-map-location
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-typesMapLocation ^js typings-installer))

(defn throttle-limit
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-throttleLimit ^js typings-installer))

(defn log
  "**Returns:** `Log`"
  ^js [typings-installer]
  (.-log ^js typings-installer))

(defn package-name-to-typing-location
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-packageNameToTypingLocation ^js typings-installer))

(defn missing-typings-set
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-missingTypingsSet ^js typings-installer))

(defn known-caches-set
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-knownCachesSet ^js typings-installer))

(defn project-watchers
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-projectWatchers ^js typings-installer))

(defn safe-list
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-safeList ^js typings-installer))

(defn set-safe-list!
  ^js [typings-installer value]
  (set! (.-safeList ^js typings-installer) value))

(defn install-run-count
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-installRunCount ^js typings-installer))

(defn set-install-run-count!
  ^js [typings-installer value]
  (set! (.-installRunCount ^js typings-installer) value))

(defn in-flight-request-count
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-inFlightRequestCount ^js typings-installer))

(defn set-in-flight-request-count!
  ^js [typings-installer value]
  (set! (.-inFlightRequestCount ^js typings-installer) value))

(defn types-registry
  "**Returns:** `Map<string, MapLike<string>>`"
  ^js [typings-installer]
  (.-typesRegistry ^js typings-installer))

(defn close-project
  "**Parameters:**
   - `req`: `CloseProject`
   
   **Returns:** `void`"
  ^js [typings-installer req]
  (.closeProject ^js typings-installer req))

(defn close-watchers
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-closeWatchers ^js typings-installer))

(defn set-close-watchers!
  ^js [typings-installer value]
  (set! (.-closeWatchers ^js typings-installer) value))

(defn install
  "**Parameters:**
   - `req`: `DiscoverTypings`
   
   **Returns:** `void`"
  ^js [typings-installer req]
  (.install ^js typings-installer req))

(defn initialize-safe-list
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-initializeSafeList ^js typings-installer))

(defn set-initialize-safe-list!
  ^js [typings-installer value]
  (set! (.-initializeSafeList ^js typings-installer) value))

(defn process-cache-location
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-processCacheLocation ^js typings-installer))

(defn set-process-cache-location!
  ^js [typings-installer value]
  (set! (.-processCacheLocation ^js typings-installer) value))

(defn filter-typings
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-filterTypings ^js typings-installer))

(defn set-filter-typings!
  ^js [typings-installer value]
  (set! (.-filterTypings ^js typings-installer) value))

(defn ensure-package-directory-exists
  "**Parameters:**
   - `directory`: `string`
   
   **Returns:** `void`"
  ^js [typings-installer directory]
  (.ensurePackageDirectoryExists ^js typings-installer directory))

(defn install-typings
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-installTypings ^js typings-installer))

(defn set-install-typings!
  ^js [typings-installer value]
  (set! (.-installTypings ^js typings-installer) value))

(defn ensure-directory-exists
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-ensureDirectoryExists ^js typings-installer))

(defn set-ensure-directory-exists!
  ^js [typings-installer value]
  (set! (.-ensureDirectoryExists ^js typings-installer) value))

(defn watch-files
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-watchFiles ^js typings-installer))

(defn set-watch-files!
  ^js [typings-installer value]
  (set! (.-watchFiles ^js typings-installer) value))

(defn create-set-typings
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-createSetTypings ^js typings-installer))

(defn set-create-set-typings!
  ^js [typings-installer value]
  (set! (.-createSetTypings ^js typings-installer) value))

(defn install-typings-async
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-installTypingsAsync ^js typings-installer))

(defn set-install-typings-async!
  ^js [typings-installer value]
  (set! (.-installTypingsAsync ^js typings-installer) value))

(defn execute-with-throttling
  "**Returns:** `any`"
  ^js [typings-installer]
  (.-executeWithThrottling ^js typings-installer))

(defn set-execute-with-throttling!
  ^js [typings-installer value]
  (set! (.-executeWithThrottling ^js typings-installer) value))

(defn install-worker
  "**Parameters:**
   - `request-id`: `number`
   - `package-names`: `string[]`
   - `cwd`: `string`
   - `on-request-completed`: `RequestCompletedAction`
   
   **Returns:** `void`"
  ^js [typings-installer request-id package-names cwd on-request-completed]
  (.installWorker ^js typings-installer request-id package-names cwd on-request-completed))

(defn send-response
  "**Parameters:**
   - `response`: `InvalidateCachedTypings | BeginInstallTypes | EndInstallTypes | SetTypings | WatchTypingLocations`
   
   **Returns:** `void`"
  ^js [typings-installer response]
  (.sendResponse ^js typings-installer response))

(defn latest-dist-tag
  "**Returns:** `\"latest\"`"
  ^js [typings-installer]
  (.-latestDistTag ^js typings-installer))
