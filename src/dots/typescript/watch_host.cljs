(ns dots.typescript.watch-host
  "Host that has watch functionality used in --watch mode")

(defn on-watch-status-change
  "If provided, called with Diagnostic message that informs about change in watch status
   
   **Parameters:**
   - `diagnostic`: `Diagnostic`
   - `new-line`: `string`
   - `options`: `CompilerOptions`
   - `error-count`: `number | undefined`
   
   **Returns:** `void`"
  (^js [watch-host diagnostic new-line options]
   (.onWatchStatusChange ^js watch-host diagnostic new-line options))
  (^js [watch-host diagnostic new-line options error-count]
   (.onWatchStatusChange ^js watch-host diagnostic new-line options error-count)))

(defn watch-file
  "Used to watch changes in source files, missing files needed to update the program or config file
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `FileWatcherCallback`
   - `polling-interval`: `number | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [watch-host path callback]
   (.watchFile ^js watch-host path callback))
  (^js [watch-host path callback polling-interval]
   (.watchFile ^js watch-host path callback polling-interval))
  (^js [watch-host path callback polling-interval options]
   (.watchFile ^js watch-host path callback polling-interval options)))

(defn watch-directory
  "Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added
   
   **Parameters:**
   - `path`: `string`
   - `callback`: `DirectoryWatcherCallback`
   - `recursive?`: `boolean | undefined`
   - `options`: `WatchOptions | undefined`
   
   **Returns:** `FileWatcher`"
  (^js [watch-host path callback]
   (.watchDirectory ^js watch-host path callback))
  (^js [watch-host path callback recursive?]
   (.watchDirectory ^js watch-host path callback recursive?))
  (^js [watch-host path callback recursive? options]
   (.watchDirectory ^js watch-host path callback recursive? options)))

(defn set-timeout
  "If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together
   
   **Parameters:**
   - `callback`: `(...args: any[]) => void`
   - `ms`: `number`
   - `args`: `any[]`
   
   **Returns:** `any`"
  ^js [watch-host callback ms & args]
  (.. ^js watch-host -setTimeout (apply ^js watch-host (to-array (list* callback ms args)))))

(defn clear-timeout
  "If provided, will be used to reset existing delayed compilation
   
   **Parameters:**
   - `timeout-id`: `any`
   
   **Returns:** `void`"
  ^js [watch-host timeout-id]
  (.clearTimeout ^js watch-host timeout-id))
