(ns dots.typescript.server.logger)

(defn close
  "**Returns:** `void`"
  ^js [logger]
  (.close ^js logger))

(defn has-level?
  "**Parameters:**
   - `level`: `LogLevel`
   
   **Returns:** `boolean`"
  ^js [logger level]
  (.hasLevel ^js logger level))

(defn logging-enabled?
  "**Returns:** `boolean`"
  ^js [logger]
  (.loggingEnabled ^js logger))

(defn perftrc
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [logger s]
  (.perftrc ^js logger s))

(defn info
  "**Parameters:**
   - `s`: `string`
   
   **Returns:** `void`"
  ^js [logger s]
  (.info ^js logger s))

(defn start-group
  "**Returns:** `void`"
  ^js [logger]
  (.startGroup ^js logger))

(defn end-group
  "**Returns:** `void`"
  ^js [logger]
  (.endGroup ^js logger))

(defn msg
  "**Parameters:**
   - `s`: `string`
   - `type`: `Msg | undefined`
   
   **Returns:** `void`"
  (^js [logger s]
   (.msg ^js logger s))
  (^js [logger s type]
   (.msg ^js logger s type)))

(defn log-file-name
  "**Returns:** `string | undefined`"
  ^js [logger]
  (.getLogFileName ^js logger))
